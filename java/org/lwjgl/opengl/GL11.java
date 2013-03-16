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

/** The core OpenGL 1.1 functionality. */
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
		GL_CURRENT_NORMAL                = 0xB02,
		GL_CURRENT_TEXTURE_COORDS        = 0xB03,
		GL_CURRENT_RASTER_COLOR          = 0xB04,
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
		GL_COLOR_LOGIC_OP                = 0xBF2,
		GL_AUX_BUFFERS                   = 0xC00,
		GL_DRAW_BUFFER                   = 0xC01,
		GL_READ_BUFFER                   = 0xC02,
		GL_SCISSOR_BOX                   = 0xC10,
		GL_SCISSOR_TEST                  = 0xC11,
		GL_COLOR_CLEAR_VALUE             = 0xC22,
		GL_COLOR_WRITEMASK               = 0xC23,
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
		GL_MAP1_NORMAL                   = 0xD92,
		GL_MAP1_TEXTURE_COORD_1          = 0xD93,
		GL_MAP1_TEXTURE_COORD_2          = 0xD94,
		GL_MAP1_TEXTURE_COORD_3          = 0xD95,
		GL_MAP1_TEXTURE_COORD_4          = 0xD96,
		GL_MAP1_VERTEX_3                 = 0xD97,
		GL_MAP1_VERTEX_4                 = 0xD98,
		GL_MAP2_COLOR_4                  = 0xDB0,
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
		GL_AMBIENT_AND_DIFFUSE = 0x1602;

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
	public static final int
		GL_BITMAP = 0x1A00;

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
	public static final int
		GL_TEXTURE_ENV = 0x2300;

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
		GL_TEXTURE_COORD_ARRAY_SIZE    = 0x8088,
		GL_TEXTURE_COORD_ARRAY_TYPE    = 0x8089,
		GL_TEXTURE_COORD_ARRAY_STRIDE  = 0x808A,
		GL_EDGE_FLAG_ARRAY_STRIDE      = 0x808C,
		GL_VERTEX_ARRAY_POINTER        = 0x808E,
		GL_NORMAL_ARRAY_POINTER        = 0x808F,
		GL_COLOR_ARRAY_POINTER         = 0x8090,
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

	private GL11() {}

	// --- [ glEnable ] ---

	/** JNI method for {@link #glEnable(int)} */
	public static native void nglEnable(int target, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glEnable.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Enables the specified OpenGL state.
	 *
	 * @param target the OpenGL state to enable
	 */
	public static void glEnable(int target) {
		long __functionAddress = getInstance().glEnable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnable(target, __functionAddress);
	}

	// --- [ glDisable ] ---

	/** JNI method for {@link #glDisable(int)} */
	public static native void nglDisable(int target, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glEnable.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Disables the specified OpenGL state.
	 *
	 * @param target the OpenGL state to disable
	 */
	public static void glDisable(int target) {
		long __functionAddress = getInstance().glDisable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisable(target, __functionAddress);
	}

	// --- [ glAccum ] ---

	/** JNI method for {@link #glAccum(int, float)} */
	public static native void nglAccum(int op, float value, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Each portion of a pixel in the accumulation buffer consists of four values: one for each of R, G, B, and A. The accumulation buffer is controlled
	 * exclusively through the use of this method (except for clearing it).
	 *
	 * @param op    a symbolic constant indicating an accumulation buffer operation
	 * @param value a floating-point value to be used in that operation. The possible operations are:. One of:<p/>{@link #GL_ACCUM}, {@link #GL_LOAD}, {@link #GL_RETURN}, {@link #GL_MULT}, {@link #GL_ADD}
	 */
	public static void glAccum(int op, float value) {
		long __functionAddress = getInstance().glAccum;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglAccum(op, value, __functionAddress);
	}

	// --- [ glAlphaFunc ] ---

	/** JNI method for {@link #glAlphaFunc(int, float)} */
	public static native void nglAlphaFunc(int func, float ref, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * The alpha test discards a fragment conditionally based on the outcome of a comparison between the incoming fragment’s alpha value and a constant value.
	 * The comparison is enabled or disabled with the generic {@link #glEnable(int)} and {@link #glDisable(int)} commands using the symbolic constant {@link #GL_ALPHA_TEST}.
	 * When disabled, it is as if the comparison always passes. The test is controlled with this method.
	 *
	 * @param func a symbolic constant indicating the alpha test function. The possible constants are:. One of:<p/>{@link #GL_NEVER}, {@link #GL_ALWAYS}, {@link #GL_LESS}, {@link #GL_LEQUAL}, {@link #GL_EQUAL}, {@link #GL_GEQUAL}, {@link #GL_GREATER}, {@link #GL_NOTEQUAL}
	 * @param ref  a reference value clamped to the range [0, 1]. When performing the alpha test, the GL will convert the reference value to the same representation as the fragment's alpha value (floating-point or fixed-point).
	 */
	public static void glAlphaFunc(int func, float ref) {
		long __functionAddress = getInstance().glAlphaFunc;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglAlphaFunc(func, ref, __functionAddress);
	}

	// --- [ glAreTexturesResident ] ---

	/** JNI method for {@link #glAreTexturesResident(int, ByteBuffer, ByteBuffer)} */
	public static native boolean nglAreTexturesResident(int n, long textures, long residences, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns {@link #GL_TRUE} if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If
	 * at least one of the texture objects named in textures is not resident, then {@link #GL_FALSE} is returned, and the residence of each texture object is
	 * returned in residences. Otherwise the contents of residences are not changed.
	 *
	 * @param n          the number of texture objects in {@code textures}
	 * @param textures   an array of texture objects
	 * @param residences returns the residences of each texture object
	 */
	public static boolean glAreTexturesResident(int n, ByteBuffer textures, ByteBuffer residences) {
		long __functionAddress = getInstance().glAreTexturesResident;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(textures, n << 2);
			checkBuffer(residences, n);
		}
		return nglAreTexturesResident(n, memAddress(textures), memAddress(residences), __functionAddress);
	}

	/** Alternative version of: {@link #glAreTexturesResident(int, ByteBuffer, ByteBuffer)} */
	public static boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences) {
		long __functionAddress = getInstance().glAreTexturesResident;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(residences, textures.remaining());
		}
		return nglAreTexturesResident(textures.remaining(), memAddress(textures), memAddress(residences), __functionAddress);
	}

	// --- [ glArrayElement ] ---

	/** JNI method for {@link #glArrayElement(int)} */
	public static native void nglArrayElement(int i, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glArrayElement.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Transfers the ith element of every enabled, non-instanced array, and the first element of every enabled, instanced array to the GL.
	 *
	 * @param i the element to transfer
	 */
	public static void glArrayElement(int i) {
		long __functionAddress = getInstance().glArrayElement;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglArrayElement(i, __functionAddress);
	}

	// --- [ glBegin ] ---

	/** JNI method for {@link #glBegin(int)} */
	public static native void nglBegin(int mode, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Begins the definition of vertex attributes of a sequence of primitives to be transferred to the GL.
	 *
	 * @param mode the primitive type being defined. One of:<p/>{@link GL11#GL_POINTS}, {@link GL11#GL_LINE_STRIP}, {@link GL11#GL_LINE_LOOP}, {@link GL11#GL_LINES}, {@link GL11#GL_POLYGON}, {@link GL11#GL_TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES}, {@link GL11#GL_QUAD_STRIP}, {@link GL11#GL_QUADS}, {@link GL32#GL_LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES}
	 */
	public static void glBegin(int mode) {
		long __functionAddress = getInstance().glBegin;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBegin(mode, __functionAddress);
	}

	// --- [ glBindTexture ] ---

	/** JNI method for {@link #glBindTexture(int, int)} */
	public static native void nglBindTexture(int target, int texture, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindTexture.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds the a texture to a texture target.
	 * <p/>
	 * While a texture object is bound, GL operations on the target to which it is bound affect the bound object, and queries of the target to which it is
	 * bound return state from the bound object. If texture mapping of the dimensionality of the target to which a texture object is bound is enabled, the
	 * state of the bound texture object directs the texturing operation.
	 *
	 * @param target  the texture target. One of:<p/>{@link #GL_TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP}, {@link GL12#GL_TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param texture the texture object to bind
	 */
	public static void glBindTexture(int target, int texture) {
		long __functionAddress = getInstance().glBindTexture;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindTexture(target, texture, __functionAddress);
	}

	// --- [ glBitmap ] ---

	/** JNI method for {@link #glBitmap(int, int, float, float, float, float, ByteBuffer)} */
	public static native void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
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
		long __functionAddress = getInstance().glBitmap;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, w * h);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglBitmap(w, h, xOrig, yOrig, xInc, yInc, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glBitmap(int, int, float, float, float, float, ByteBuffer)} */
	public static void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long dataOffset) {
		long __functionAddress = getInstance().glBitmap;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglBitmap(w, h, xOrig, yOrig, xInc, yInc, dataOffset, __functionAddress);
	}

	// --- [ glBlendFunc ] ---

	/** JNI method for {@link #glBlendFunc(int, int)} */
	public static native void nglBlendFunc(int sfactor, int dfactor, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendFunc.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the weighting factors used by the blend equation, for both RGB and alpha functions and for all draw buffers.
	 *
	 * @param sfactor the source weighting factor. One of:<p/>{@link #GL_ZERO}, {@link #GL_ONE}, {@link #GL_SRC_COLOR}, {@link #GL_ONE_MINUS_SRC_COLOR}, {@link #GL_DST_COLOR}, {@link #GL_ONE_MINUS_DST_COLOR}, {@link #GL_SRC_ALPHA}, {@link #GL_ONE_MINUS_SRC_ALPHA}, {@link #GL_DST_ALPHA}, {@link #GL_ONE_MINUS_DST_ALPHA}, {@link #GL_CONSTANT_COLOR}, {@link #GL_ONE_MINUS_CONSTANT_COLOR}, {@link #GL_CONSTANT_ALPHA}, {@link #GL_ONE_MINUS_CONSTANT_ALPHA}, {@link #GL_SRC_ALPHA_SATURATE}, {@link GL33#GL_SRC1_COLOR}, {@link GL33#GL_ONE_MINUS_SRC1_COLOR}, {@link GL15#GL_SRC1_ALPHA}, {@link GL33#GL_ONE_MINUS_SRC1_ALPHA}
	 * @param dfactor the destination weighting factor
	 */
	public static void glBlendFunc(int sfactor, int dfactor) {
		long __functionAddress = getInstance().glBlendFunc;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendFunc(sfactor, dfactor, __functionAddress);
	}

	// --- [ glCallList ] ---

	/** JNI method for {@link #glCallList(int)} */
	public static native void nglCallList(int list, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Executes a display list. Causes the commands saved in the display list to be executed, in order, just as if they were issued without using a display list.
	 *
	 * @param list the index of the display list to be called
	 */
	public static void glCallList(int list) {
		long __functionAddress = getInstance().glCallList;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCallList(list, __functionAddress);
	}

	// --- [ glCallLists ] ---

	/** JNI method for {@link #glCallLists(int, int, ByteBuffer)} */
	public static native void nglCallLists(int n, int type, long lists, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Provides an efficient means for executing a number of display lists.
	 *
	 * @param n     the number of display lists to be called
	 * @param type  the data type of each element in {@code lists}. One of:<p/>{@link #GL_BYTE}, {@link #GL_UNSIGNED_BYTE}, {@link #GL_SHORT}, {@link #GL_UNSIGNED_SHORT}, {@link #GL_INT}, {@link #GL_UNSIGNED_INT}, {@link #GL_FLOAT}, {@link #GL_2_BYTES}, {@link #GL_3_BYTES}, {@link #GL_4_BYTES}
	 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
	 */
	public static void glCallLists(int n, int type, ByteBuffer lists) {
		long __functionAddress = getInstance().glCallLists;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(lists, n * GLChecks.translateTypeToBytes(type));
		}
		nglCallLists(n, type, memAddress(lists), __functionAddress);
	}

	/** Alternative version of: {@link #glCallLists(int, int, ByteBuffer)} */
	public static void glCallLists(int type, ByteBuffer lists) {
		long __functionAddress = getInstance().glCallLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCallLists(lists.remaining(), type, memAddress(lists), __functionAddress);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glCallLists(int, int, ByteBuffer)} */
	public static void glCallLists(ByteBuffer lists) {
		long __functionAddress = getInstance().glCallLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(lists), __functionAddress);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glCallLists(int, int, ByteBuffer)} */
	public static void glCallLists(ShortBuffer lists) {
		long __functionAddress = getInstance().glCallLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(lists), __functionAddress);
	}

	/** GL_UNSIGNED_INT version of: {@link #glCallLists(int, int, ByteBuffer)} */
	public static void glCallLists(IntBuffer lists) {
		long __functionAddress = getInstance().glCallLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_INT, memAddress(lists), __functionAddress);
	}

	// --- [ glClear ] ---

	/** JNI method for {@link #glClear(int)} */
	public static native void nglClear(int mask, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClear.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets portions of every pixel in a particular buffer to the same value. The value to which each buffer is cleared depends on the setting of the clear
	 * value for that buffer.
	 *
	 * @param mask Zero or the bitwise OR of one or more values indicating which buffers are to be cleared. Valid values:. One of:<p/>{@link #GL_ACCUM_BUFFER_BIT}, {@link #GL_COLOR_BUFFER_BIT}, {@link #GL_DEPTH_BUFFER_BIT}, {@link #GL_STENCIL_BUFFER_BIT}
	 */
	public static void glClear(int mask) {
		long __functionAddress = getInstance().glClear;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClear(mask, __functionAddress);
	}

	// --- [ glClearAccum ] ---

	/** JNI method for {@link #glClearAccum(float, float, float, float)} */
	public static native void nglClearAccum(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the clear values for the accumulation buffer. These values are clamped to the range [-1,1] when they are specified.
	 *
	 * @param red   the value to which to clear the R values of the accumulation buffer
	 * @param green the value to which to clear the G values of the accumulation buffer
	 * @param blue  the value to which to clear the B values of the accumulation buffer
	 * @param alpha the value to which to clear the A values of the accumulation buffer
	 */
	public static void glClearAccum(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().glClearAccum;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearAccum(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glClearColor ] ---

	/** JNI method for {@link #glClearColor(float, float, float, float)} */
	public static native void nglClearColor(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClearColor.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the clear value for fixed-point and floating-point color buffers in RGBA mode. The specified components are stored as floating-point values.
	 *
	 * @param red   the value to which to clear the R channel of the color buffer
	 * @param green the value to which to clear the G channel of the color buffer
	 * @param blue  the value to which to clear the B channel of the color buffer
	 * @param alpha the value to which to clear the A channel of the color buffer
	 */
	public static void glClearColor(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().glClearColor;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearColor(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glClearDepth ] ---

	/** JNI method for {@link #glClearDepth(double)} */
	public static native void nglClearDepth(double depth, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClearDepth.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the depth value used when clearing the depth buffer. When clearing a fixedpoint depth buffer, {@code depth} is clamped to the range [0,1] and
	 * converted to fixed-point. No conversion is applied when clearing a floating-point depth buffer.
	 *
	 * @param depth the value to which to clear the depth buffer
	 */
	public static void glClearDepth(double depth) {
		long __functionAddress = getInstance().glClearDepth;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearDepth(depth, __functionAddress);
	}

	// --- [ glClearStencil ] ---

	/** JNI method for {@link #glClearStencil(int)} */
	public static native void nglClearStencil(int s, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClearStencil.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the value to which to clear the stencil buffer. {@code s} is masked to the number of bitplanes in the stencil buffer.
	 *
	 * @param s the value to which to clear the stencil buffer
	 */
	public static void glClearStencil(int s) {
		long __functionAddress = getInstance().glClearStencil;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearStencil(s, __functionAddress);
	}

	// --- [ glClipPlane ] ---

	/** JNI method for {@link #glClipPlane(int, ByteBuffer)} */
	public static native void nglClipPlane(int plane, long equation, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glClipPlane.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies a client-defined clip plane.
	 * <p/>
	 * The value of the first argument, {@code plane}, is a symbolic constant, CLIP_PLANEi, where i is an integer between 0 and n &ndash; 1, indicating one of
	 * n client-defined clip planes. @{code equation} is an array of four double-precision floating-point values. These are the coefficients of a plane
	 * equation in object coordinates: p1, p2, p3, and p4 (in that order).
	 *
	 * @param plane    the clip plane to define
	 * @param equation the clip plane coefficients
	 */
	public static void glClipPlane(int plane, ByteBuffer equation) {
		long __functionAddress = getInstance().glClipPlane;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClipPlane(plane, memAddress(equation), __functionAddress);
	}

	/** Alternative version of: {@link #glClipPlane(int, ByteBuffer)} */
	public static void glClipPlane(int plane, DoubleBuffer equation) {
		long __functionAddress = getInstance().glClipPlane;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClipPlane(plane, memAddress(equation), __functionAddress);
	}

	// --- [ glColor3b ] ---

	/** JNI method for {@link #glColor3b(byte, byte, byte)} */
	public static native void nglColor3b(byte red, byte green, byte blue, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the R, G, and B components of the current color. The alpha component is set to 1.0.
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3b(byte red, byte green, byte blue) {
		long __functionAddress = getInstance().glColor3b;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3b(red, green, blue, __functionAddress);
	}

	// --- [ glColor3s ] ---

	/** JNI method for {@link #glColor3s(short, short, short)} */
	public static native void nglColor3s(short red, short green, short blue, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glColor3b(byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3s(short red, short green, short blue) {
		long __functionAddress = getInstance().glColor3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3s(red, green, blue, __functionAddress);
	}

	// --- [ glColor3i ] ---

	/** JNI method for {@link #glColor3i(int, int, int)} */
	public static native void nglColor3i(int red, int green, int blue, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glColor3b(byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3i(int red, int green, int blue) {
		long __functionAddress = getInstance().glColor3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3i(red, green, blue, __functionAddress);
	}

	// --- [ glColor3f ] ---

	/** JNI method for {@link #glColor3f(float, float, float)} */
	public static native void nglColor3f(float red, float green, float blue, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glColor3b(byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3f(float red, float green, float blue) {
		long __functionAddress = getInstance().glColor3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3f(red, green, blue, __functionAddress);
	}

	// --- [ glColor3d ] ---

	/** JNI method for {@link #glColor3d(double, double, double)} */
	public static native void nglColor3d(double red, double green, double blue, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glColor3b(byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3d(double red, double green, double blue) {
		long __functionAddress = getInstance().glColor3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3d(red, green, blue, __functionAddress);
	}

	// --- [ glColor3ub ] ---

	/** JNI method for {@link #glColor3ub(byte, byte, byte)} */
	public static native void nglColor3ub(byte red, byte green, byte blue, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned version of {@link #glColor3b(byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3ub(byte red, byte green, byte blue) {
		long __functionAddress = getInstance().glColor3ub;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3ub(red, green, blue, __functionAddress);
	}

	// --- [ glColor3us ] ---

	/** JNI method for {@link #glColor3us(short, short, short)} */
	public static native void nglColor3us(short red, short green, short blue, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned short version of {@link #glColor3b(byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3us(short red, short green, short blue) {
		long __functionAddress = getInstance().glColor3us;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3us(red, green, blue, __functionAddress);
	}

	// --- [ glColor3ui ] ---

	/** JNI method for {@link #glColor3ui(int, int, int)} */
	public static native void nglColor3ui(int red, int green, int blue, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned int version of {@link #glColor3b(byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static void glColor3ui(int red, int green, int blue) {
		long __functionAddress = getInstance().glColor3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor3ui(red, green, blue, __functionAddress);
	}

	// --- [ glColor3bv ] ---

	/** JNI method for {@link #glColor3b(ByteBuffer)} */
	public static native void nglColor3bv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Byte pointer version of {@link #glColor3b(byte, byte, byte)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3b(ByteBuffer v) {
		long __functionAddress = getInstance().glColor3bv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglColor3bv(memAddress(v), __functionAddress);
	}

	// --- [ glColor3sv ] ---

	/** JNI method for {@link #glColor3s(ByteBuffer)} */
	public static native void nglColor3sv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor3s(short, short, short)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3s(ByteBuffer v) {
		long __functionAddress = getInstance().glColor3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 1);
		}
		nglColor3sv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor3s(ByteBuffer)} */
	public static void glColor3(ShortBuffer v) {
		long __functionAddress = getInstance().glColor3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglColor3sv(memAddress(v), __functionAddress);
	}

	// --- [ glColor3iv ] ---

	/** JNI method for {@link #glColor3i(ByteBuffer)} */
	public static native void nglColor3iv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor3i(int, int, int)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3i(ByteBuffer v) {
		long __functionAddress = getInstance().glColor3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglColor3iv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor3i(ByteBuffer)} */
	public static void glColor3(IntBuffer v) {
		long __functionAddress = getInstance().glColor3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglColor3iv(memAddress(v), __functionAddress);
	}

	// --- [ glColor3fv ] ---

	/** JNI method for {@link #glColor3f(ByteBuffer)} */
	public static native void nglColor3fv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor3f(float, float, float)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3f(ByteBuffer v) {
		long __functionAddress = getInstance().glColor3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglColor3fv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor3f(ByteBuffer)} */
	public static void glColor3(FloatBuffer v) {
		long __functionAddress = getInstance().glColor3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglColor3fv(memAddress(v), __functionAddress);
	}

	// --- [ glColor3dv ] ---

	/** JNI method for {@link #glColor3d(ByteBuffer)} */
	public static native void nglColor3dv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor3d(double, double, double)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3d(ByteBuffer v) {
		long __functionAddress = getInstance().glColor3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 3);
		}
		nglColor3dv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor3d(ByteBuffer)} */
	public static void glColor3(DoubleBuffer v) {
		long __functionAddress = getInstance().glColor3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglColor3dv(memAddress(v), __functionAddress);
	}

	// --- [ glColor3ubv ] ---

	/** JNI method for {@link #glColor3ub(ByteBuffer)} */
	public static native void nglColor3ubv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor3ub(byte, byte, byte)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3ub(ByteBuffer v) {
		long __functionAddress = getInstance().glColor3ubv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglColor3ubv(memAddress(v), __functionAddress);
	}

	// --- [ glColor3usv ] ---

	/** JNI method for {@link #glColor3us(ByteBuffer)} */
	public static native void nglColor3usv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor3us(short, short, short)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3us(ByteBuffer v) {
		long __functionAddress = getInstance().glColor3usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 1);
		}
		nglColor3usv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor3us(ByteBuffer)} */
	public static void glColor3u(ShortBuffer v) {
		long __functionAddress = getInstance().glColor3usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglColor3usv(memAddress(v), __functionAddress);
	}

	// --- [ glColor3uiv ] ---

	/** JNI method for {@link #glColor3ui(ByteBuffer)} */
	public static native void nglColor3uiv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor3ui(int, int, int)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3ui(ByteBuffer v) {
		long __functionAddress = getInstance().glColor3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglColor3uiv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor3ui(ByteBuffer)} */
	public static void glColor3u(IntBuffer v) {
		long __functionAddress = getInstance().glColor3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglColor3uiv(memAddress(v), __functionAddress);
	}

	// --- [ glColor4b ] ---

	/** JNI method for {@link #glColor4b(byte, byte, byte, byte)} */
	public static native void nglColor4b(byte red, byte green, byte blue, byte alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current color.
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4b(byte red, byte green, byte blue, byte alpha) {
		long __functionAddress = getInstance().glColor4b;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4b(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4s ] ---

	/** JNI method for {@link #glColor4s(short, short, short, short)} */
	public static native void nglColor4s(short red, short green, short blue, short alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glColor4b(byte, byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4s(short red, short green, short blue, short alpha) {
		long __functionAddress = getInstance().glColor4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4s(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4i ] ---

	/** JNI method for {@link #glColor4i(int, int, int, int)} */
	public static native void nglColor4i(int red, int green, int blue, int alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glColor4b(byte, byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4i(int red, int green, int blue, int alpha) {
		long __functionAddress = getInstance().glColor4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4i(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4f ] ---

	/** JNI method for {@link #glColor4f(float, float, float, float)} */
	public static native void nglColor4f(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glColor4b(byte, byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4f(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().glColor4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4f(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4d ] ---

	/** JNI method for {@link #glColor4d(double, double, double, double)} */
	public static native void nglColor4d(double red, double green, double blue, double alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glColor4b(byte, byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4d(double red, double green, double blue, double alpha) {
		long __functionAddress = getInstance().glColor4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4d(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4ub ] ---

	/** JNI method for {@link #glColor4ub(byte, byte, byte, byte)} */
	public static native void nglColor4ub(byte red, byte green, byte blue, byte alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned version of {@link #glColor4b(byte, byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4ub(byte red, byte green, byte blue, byte alpha) {
		long __functionAddress = getInstance().glColor4ub;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4ub(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4us ] ---

	/** JNI method for {@link #glColor4us(short, short, short, short)} */
	public static native void nglColor4us(short red, short green, short blue, short alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned short version of {@link #glColor4b(byte, byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4us(short red, short green, short blue, short alpha) {
		long __functionAddress = getInstance().glColor4us;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4us(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4ui ] ---

	/** JNI method for {@link #glColor4ui(int, int, int, int)} */
	public static native void nglColor4ui(int red, int green, int blue, int alpha, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned int version of {@link #glColor4b(byte, byte, byte, byte)}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static void glColor4ui(int red, int green, int blue, int alpha) {
		long __functionAddress = getInstance().glColor4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColor4ui(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColor4bv ] ---

	/** JNI method for {@link #glColor4b(ByteBuffer)} */
	public static native void nglColor4bv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor4b(byte, byte, byte, byte)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4b(ByteBuffer v) {
		long __functionAddress = getInstance().glColor4bv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglColor4bv(memAddress(v), __functionAddress);
	}

	// --- [ glColor4sv ] ---

	/** JNI method for {@link #glColor4s(ByteBuffer)} */
	public static native void nglColor4sv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor4s(short, short, short, short)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4s(ByteBuffer v) {
		long __functionAddress = getInstance().glColor4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglColor4sv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor4s(ByteBuffer)} */
	public static void glColor4(ShortBuffer v) {
		long __functionAddress = getInstance().glColor4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglColor4sv(memAddress(v), __functionAddress);
	}

	// --- [ glColor4iv ] ---

	/** JNI method for {@link #glColor4i(ByteBuffer)} */
	public static native void nglColor4iv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor4i(int, int, int, int)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4i(ByteBuffer v) {
		long __functionAddress = getInstance().glColor4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglColor4iv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor4i(ByteBuffer)} */
	public static void glColor4(IntBuffer v) {
		long __functionAddress = getInstance().glColor4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglColor4iv(memAddress(v), __functionAddress);
	}

	// --- [ glColor4fv ] ---

	/** JNI method for {@link #glColor4f(ByteBuffer)} */
	public static native void nglColor4fv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor4f(float, float, float, float)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4f(ByteBuffer v) {
		long __functionAddress = getInstance().glColor4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglColor4fv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor4f(ByteBuffer)} */
	public static void glColor4(FloatBuffer v) {
		long __functionAddress = getInstance().glColor4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglColor4fv(memAddress(v), __functionAddress);
	}

	// --- [ glColor4dv ] ---

	/** JNI method for {@link #glColor4d(ByteBuffer)} */
	public static native void nglColor4dv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor4d(double, double, double, double)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4d(ByteBuffer v) {
		long __functionAddress = getInstance().glColor4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 3);
		}
		nglColor4dv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor4d(ByteBuffer)} */
	public static void glColor4(DoubleBuffer v) {
		long __functionAddress = getInstance().glColor4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglColor4dv(memAddress(v), __functionAddress);
	}

	// --- [ glColor4ubv ] ---

	/** JNI method for {@link #glColor4ub(ByteBuffer)} */
	public static native void nglColor4ubv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor4ub(byte, byte, byte, byte)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4ub(ByteBuffer v) {
		long __functionAddress = getInstance().glColor4ubv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglColor4ubv(memAddress(v), __functionAddress);
	}

	// --- [ glColor4usv ] ---

	/** JNI method for {@link #glColor4us(ByteBuffer)} */
	public static native void nglColor4usv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor4us(short, short, short, short)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4us(ByteBuffer v) {
		long __functionAddress = getInstance().glColor4usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglColor4usv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor4us(ByteBuffer)} */
	public static void glColor4u(ShortBuffer v) {
		long __functionAddress = getInstance().glColor4usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglColor4usv(memAddress(v), __functionAddress);
	}

	// --- [ glColor4uiv ] ---

	/** JNI method for {@link #glColor4ui(ByteBuffer)} */
	public static native void nglColor4uiv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glColor4ui(int, int, int, int)}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4ui(ByteBuffer v) {
		long __functionAddress = getInstance().glColor4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglColor4uiv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glColor4ui(ByteBuffer)} */
	public static void glColor4u(IntBuffer v) {
		long __functionAddress = getInstance().glColor4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglColor4uiv(memAddress(v), __functionAddress);
	}

	// --- [ glColorMask ] ---

	/** JNI method for {@link #glColorMask(boolean, boolean, boolean, boolean)} */
	public static native void nglColorMask(boolean red, boolean green, boolean blue, boolean alpha, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glColorMask.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Masks the writing of R, G, B and A values to all draw buffers. In the initial state, all color values are enabled for writing for all draw buffers.
	 *
	 * @param red   whether R values are written or not
	 * @param green whether G values are written or not
	 * @param blue  whether B values are written or not
	 * @param alpha whether A values are written or not
	 */
	public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		long __functionAddress = getInstance().glColorMask;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorMask(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glColorMaterial ] ---

	/** JNI method for {@link #glColorMaterial(int, int)} */
	public static native void nglColorMaterial(int face, int mode, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * It is possible to attach one or more material properties to the current color, so that they continuously track its component values. This behavior is
	 * enabled and disabled by calling {@link #glEnable(int)} or {@link #glDisable(int)} with the symbolic value {@link #GL_COLOR_MATERIAL}. This function controls which
	 * of these modes is selected.
	 *
	 * @param face specifies which material face is affected by the current color. One of:<p/>{@link #GL_FRONT}, {@link #GL_BACK}, {@link #GL_FRONT_AND_BACK}
	 * @param mode specifies which material property or properties track the current color. One of:<p/>{@link #GL_EMISSION}, {@link #GL_AMBIENT}, {@link #GL_DIFFUSE}, {@link #GL_SPECULAR}, {@link #GL_AMBIENT_AND_DIFFUSE}
	 */
	public static void glColorMaterial(int face, int mode) {
		long __functionAddress = getInstance().glColorMaterial;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorMaterial(face, mode, __functionAddress);
	}

	// --- [ glColorPointer ] ---

	/** JNI method for {@link #glColorPointer(int, int, int, ByteBuffer)} */
	public static native void nglColorPointer(int size, int type, int stride, long pointer, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies the location and organization of a color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. One of:<p/>3, 4, {@link GL12#GL_BGRA}
	 * @param type    the data type of the values stored in the array. One of:<p/>{@link #GL_BYTE}, {@link #GL_UNSIGNED_BYTE}, {@link #GL_SHORT}, {@link #GL_UNSIGNED_SHORT}, {@link #GL_INT}, {@link #GL_UNSIGNED_INT}, {@link GL30#GL_HALF_FLOAT}, {@link #GL_FLOAT}, {@link #GL_DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color array data
	 */
	public static void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glColorPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglColorPointer(size, type, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glColorPointer(int, int, int, ByteBuffer)} */
	public static void glColorPointer(int size, int type, int stride, long pointerOffset) {
		long __functionAddress = getInstance().glColorPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, true);
		}
		nglColorPointer(size, type, stride, pointerOffset, __functionAddress);
	}

	/** GL_UNSIGNED_BYTE / GL_BYTE version of: {@link #glColorPointer(int, int, int, ByteBuffer)} */
	public static void glColorPointer(int size, boolean unsigned, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glColorPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglColorPointer(size, unsigned ? GL11.GL_UNSIGNED_BYTE : GL11.GL_BYTE, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_FLOAT version of: {@link #glColorPointer(int, int, int, ByteBuffer)} */
	public static void glColorPointer(int size, int stride, FloatBuffer pointer) {
		long __functionAddress = getInstance().glColorPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglColorPointer(size, GL11.GL_FLOAT, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glCopyPixels ] ---

	/** JNI method for {@link #glCopyPixels(int, int, int, int, int)} */
	public static native void nglCopyPixels(int x, int y, int width, int height, int type, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCopyPixels.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Transfers a rectangle of pixel values from one region of the read framebuffer to another in the draw framebuffer
	 *
	 * @param x      the left framebuffer pixel coordinate
	 * @param y      the lower framebuffer pixel coordinate
	 * @param width  the rectangle width
	 * @param height the rectangle height
	 * @param type   Indicates the type of values to be transfered. One of:<p/>{@link #GL_COLOR}, {@link #GL_STENCIL}, {@link #GL_DEPTH}, {@link GL30#GL_DEPTH_STENCIL}
	 */
	public static void glCopyPixels(int x, int y, int width, int height, int type) {
		long __functionAddress = getInstance().glCopyPixels;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyPixels(x, y, width, height, type, __functionAddress);
	}

	// --- [ glCullFace ] ---

	/** JNI method for {@link #glCullFace(int)} */
	public static native void nglCullFace(int mode, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCullFace.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies which polygon faces are culled if {@link #GL_CULL_FACE} is enabled. Front-facing polygons are rasterized if either culling is disabled or the
	 * CullFace mode is {@link #GL_BACK} while back-facing polygons are rasterized only if either culling is disabled or the CullFace mode is
	 * {@link #GL_FRONT}. The initial setting of the CullFace mode is {@link #GL_BACK}. Initially, culling is disabled.
	 *
	 * @param mode the CullFace mode. One of:<p/>{@link #GL_FRONT}, {@link #GL_BACK}, {@link #GL_FRONT_AND_BACK}
	 */
	public static void glCullFace(int mode) {
		long __functionAddress = getInstance().glCullFace;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCullFace(mode, __functionAddress);
	}

	// --- [ glDeleteLists ] ---

	/** JNI method for {@link #glDeleteLists(int, int)} */
	public static native void nglDeleteLists(int list, int range, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Deletes a contiguous group of display lists. All information about the display lists is lost, and the indices become unused. Indices to which no display
	 * list corresponds are ignored. If {@code range} is zero, nothing happens.
	 *
	 * @param list  the index of the first display list to be deleted
	 * @param range the number of display lists to be deleted
	 */
	public static void glDeleteLists(int list, int range) {
		long __functionAddress = getInstance().glDeleteLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteLists(list, range, __functionAddress);
	}

	// --- [ glDepthFunc ] ---

	/** JNI method for {@link #glDepthFunc(int)} */
	public static native void nglDepthFunc(int func, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDepthFunc.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the comparison that takes place during the depth buffer test (when {@link #GL_DEPTH_TEST} is enabled).
	 *
	 * @param func the depth test comparison. One of:<p/>{@link #GL_NEVER}, {@link #GL_ALWAYS}, {@link #GL_LESS}, {@link #GL_LEQUAL}, {@link #GL_EQUAL}, {@link #GL_GREATER}, {@link #GL_GEQUAL}, {@link #GL_NOTEQUAL}
	 */
	public static void glDepthFunc(int func) {
		long __functionAddress = getInstance().glDepthFunc;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDepthFunc(func, __functionAddress);
	}

	// --- [ glDepthMask ] ---

	/** JNI method for {@link #glDepthMask(boolean)} */
	public static native void nglDepthMask(boolean flag, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDepthMask.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Masks the writing of depth values to the depth buffer. In the initial state, the depth buffer is enabled for writing.
	 *
	 * @param flag whether depth values are written or not.
	 */
	public static void glDepthMask(boolean flag) {
		long __functionAddress = getInstance().glDepthMask;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDepthMask(flag, __functionAddress);
	}

	// --- [ glDepthRange ] ---

	/** JNI method for {@link #glDepthRange(double, double)} */
	public static native void nglDepthRange(double zNear, double zFar, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDepthRange.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the depth range for all viewports to the same values.
	 *
	 * @param zNear the near depth range
	 * @param zFar  the far depth range
	 */
	public static void glDepthRange(double zNear, double zFar) {
		long __functionAddress = getInstance().glDepthRange;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDepthRange(zNear, zFar, __functionAddress);
	}

	// --- [ glDisableClientState ] ---

	/** JNI method for {@link #glDisableClientState(int)} */
	public static native void nglDisableClientState(int array, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Disables the specified fixed-function attribute array.
	 *
	 * @param array the attribute array to disable. One of:<p/>{@link #GL_VERTEX_ARRAY}, {@link #GL_NORMAL_ARRAY}, {@link #GL_COLOR_ARRAY}, {@link GL14#GL_SECONDARY_COLOR_ARRAY}, {@link #GL_EDGE_FLAG_ARRAY}, {@link GL15#GL_FOG_COORD_ARRAY}, {@link #GL_TEXTURE_COORD_ARRAY}
	 */
	public static void glDisableClientState(int array) {
		long __functionAddress = getInstance().glDisableClientState;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDisableClientState(array, __functionAddress);
	}

	// --- [ glDrawArrays ] ---

	/** JNI method for {@link #glDrawArrays(int, int, int)} */
	public static native void nglDrawArrays(int mode, int first, int count, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawArrays.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices. Elements {@code first} through
	 * {@code first + count &ndash; 1} of each enabled non-instanced array are transferred to the GL.
	 * <p/>
	 * If an array corresponding to an attribute required by a vertex shader is not enabled, then the corresponding element is taken from the current attribute
	 * state. If an array is enabled, the corresponding current vertex attribute value is unaffected by the execution of this function.
	 *
	 * @param mode  the kind of primitives being constructed
	 * @param first the first vertex to transfer to the GL
	 * @param count the number of vertices after {@code first} to transfer to the GL
	 */
	public static void glDrawArrays(int mode, int first, int count) {
		long __functionAddress = getInstance().glDrawArrays;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDrawArrays(mode, first, count, __functionAddress);
	}

	// --- [ glDrawBuffer ] ---

	/** JNI method for {@link #glDrawBuffer(int)} */
	public static native void nglDrawBuffer(int buf, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawBuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Defines the color buffer to which fragment color zero is written.
	 * <p/>
	 * Acceptable values for {@code buf} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING} is zero), or
	 * a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.
	 *
	 * @param buf the color buffer to draw to. One of:<p/>{@link #GL_NONE}, {@link #GL_FRONT_LEFT}, {@link #GL_FRONT_RIGHT}, {@link #GL_BACK_LEFT}, {@link #GL_BACK_RIGHT}, {@link #GL_FRONT}, {@link #GL_BACK}, {@link #GL_LEFT}, {@link #GL_RIGHT}, {@link #GL_FRONT_AND_BACK}, {@link #GL_AUX0}, {@link #GL_AUX1}, {@link #GL_AUX2}, {@link #GL_AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glDrawBuffer(int buf) {
		long __functionAddress = getInstance().glDrawBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDrawBuffer(buf, __functionAddress);
	}

	// --- [ glDrawElements ] ---

	/** JNI method for {@link #glDrawElements(int, int, int, ByteBuffer)} */
	public static native void nglDrawElements(int mode, int count, int type, long indices, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawElements.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL.
	 * The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or
	 * from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.
	 *
	 * @param mode    the kind of primitives being constructed. One of:<p/>{@link #GL_POINTS}, {@link #GL_LINE_STRIP}, {@link #GL_LINE_LOOP}, {@link #GL_LINES}, {@link #GL_POLYGON}, {@link #GL_TRIANGLE_STRIP}, {@link #GL_TRIANGLE_FAN}, {@link #GL_TRIANGLES}, {@link #GL_QUAD_STRIP}, {@link #GL_QUADS}, {@link GL32#GL_LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES}
	 * @param count   the number of vertices to transfer to the GL
	 * @param type    indicates the type of index values in {@code indices}. One of:<p/>{@link #GL_UNSIGNED_BYTE}, {@link #GL_UNSIGNED_SHORT}, {@link #GL_UNSIGNED_INT}
	 * @param indices the index values
	 */
	public static void glDrawElements(int mode, int count, int type, ByteBuffer indices) {
		long __functionAddress = getInstance().glDrawElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count * GLChecks.translateTypeToBytes(type));
			GLChecks.ensureBufferObject(0x8895, false);
		}
		nglDrawElements(mode, count, type, memAddress(indices), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawElements(int, int, int, ByteBuffer)} */
	public static void glDrawElements(int mode, int count, int type, long indicesOffset) {
		long __functionAddress = getInstance().glDrawElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, true);
		}
		nglDrawElements(mode, count, type, indicesOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glDrawElements(int, int, int, ByteBuffer)} */
	public static void glDrawElements(int mode, int type, ByteBuffer indices) {
		long __functionAddress = getInstance().glDrawElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, true);
		}
		nglDrawElements(mode, indices.remaining(), type, memAddress(indices), __functionAddress);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElements(int, int, int, ByteBuffer)} */
	public static void glDrawElements(int mode, ByteBuffer indices) {
		long __functionAddress = getInstance().glDrawElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, false);
		}
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), __functionAddress);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElements(int, int, int, ByteBuffer)} */
	public static void glDrawElements(int mode, ShortBuffer indices) {
		long __functionAddress = getInstance().glDrawElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, false);
		}
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), __functionAddress);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElements(int, int, int, ByteBuffer)} */
	public static void glDrawElements(int mode, IntBuffer indices) {
		long __functionAddress = getInstance().glDrawElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, false);
		}
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), __functionAddress);
	}

	// --- [ glDrawPixels ] ---

	/** JNI method for {@link #glDrawPixels(int, int, int, int, ByteBuffer)} */
	public static native void nglDrawPixels(int width, int height, int format, int type, long pixels, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Draws a pixel rectangle to the active draw buffers.
	 *
	 * @param width  the pixel rectangle width
	 * @param height the pixel rectangle height
	 * @param format the pixel data format. One of:<p/>{@link GL11#GL_STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER}, {@link GL30#GL_RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER}
	 * @param type   the pixel data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link GL11#GL_FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP}
	 * @param pixels the pixel data
	 */
	public static void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels) {
		long __functionAddress = getInstance().glDrawPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, width * height * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglDrawPixels(width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawPixels(int, int, int, int, ByteBuffer)} */
	public static void glDrawPixels(int width, int height, int format, int type, long pixelsOffset) {
		long __functionAddress = getInstance().glDrawPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglDrawPixels(width, height, format, type, pixelsOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glDrawPixels(int, int, int, int, ByteBuffer)} */
	public static void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels) {
		long __functionAddress = getInstance().glDrawPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglDrawPixels(width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** IntBuffer version of: {@link #glDrawPixels(int, int, int, int, ByteBuffer)} */
	public static void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels) {
		long __functionAddress = getInstance().glDrawPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglDrawPixels(width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glDrawPixels(int, int, int, int, ByteBuffer)} */
	public static void glDrawPixels(int width, int height, int format, int type, FloatBuffer pixels) {
		long __functionAddress = getInstance().glDrawPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglDrawPixels(width, height, format, type, memAddress(pixels), __functionAddress);
	}

	// --- [ glEdgeFlag ] ---

	/** JNI method for {@link #glEdgeFlag(boolean)} */
	public static native void nglEdgeFlag(boolean flag, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Each edge of each polygon primitive generated is flagged as either boundary or non-boundary. These classifications are used during polygon
	 * rasterization; some modes affect the interpretation of polygon boundary edges. By default, all edges are boundary edges, but the flagging of polygons,
	 * separate triangles, or separate quadrilaterals may be altered by calling this function.
	 * <p/>
	 * When a primitive of type {@link #GL_POLYGON}, {@link #GL_TRIANGLES}, or {@link #GL_QUADS} is drawn, each vertex transferred begins an edge. If the edge
	 * flag bit is TRUE, then each specified vertex begins an edge that is flagged as boundary. If the bit is FALSE, then induced edges are flagged as
	 * non-boundary.
	 *
	 * @param flag the edge flag bit
	 */
	public static void glEdgeFlag(boolean flag) {
		long __functionAddress = getInstance().glEdgeFlag;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEdgeFlag(flag, __functionAddress);
	}

	// --- [ glEdgeFlagv ] ---

	/** JNI method for {@link #glEdgeFlag(ByteBuffer)} */
	public static native void nglEdgeFlagv(long flag, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glEdgeFlag(boolean)}.
	 *
	 * @param flag the edge flag buffer
	 */
	public static void glEdgeFlag(ByteBuffer flag) {
		long __functionAddress = getInstance().glEdgeFlagv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(flag, 1);
		}
		nglEdgeFlagv(memAddress(flag), __functionAddress);
	}

	// --- [ glEdgeFlagPointer ] ---

	/** JNI method for {@link #glEdgeFlagPointer(int, ByteBuffer)} */
	public static native void nglEdgeFlagPointer(int stride, long pointer, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies the location and organization of an edge flag array.
	 *
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the edge flag array data
	 */
	public static void glEdgeFlagPointer(int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glEdgeFlagPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglEdgeFlagPointer(stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glEdgeFlagPointer(int, ByteBuffer)} */
	public static void glEdgeFlagPointer(int stride, long pointerOffset) {
		long __functionAddress = getInstance().glEdgeFlagPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, true);
		}
		nglEdgeFlagPointer(stride, pointerOffset, __functionAddress);
	}

	// --- [ glEnableClientState ] ---

	/** JNI method for {@link #glEnableClientState(int)} */
	public static native void nglEnableClientState(int array, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Enables the specified fixed-function attribute array.
	 *
	 * @param array the attribute array to enable. One of:<p/>{@link #GL_VERTEX_ARRAY}, {@link #GL_NORMAL_ARRAY}, {@link #GL_COLOR_ARRAY}, {@link GL14#GL_SECONDARY_COLOR_ARRAY}, {@link #GL_EDGE_FLAG_ARRAY}, {@link GL15#GL_FOG_COORD_ARRAY}, {@link #GL_TEXTURE_COORD_ARRAY}
	 */
	public static void glEnableClientState(int array) {
		long __functionAddress = getInstance().glEnableClientState;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnableClientState(array, __functionAddress);
	}

	// --- [ glEnd ] ---

	/** JNI method for {@link #glEnd()} */
	public static native void nglEnd(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Ends the definition of vertex attributes of a sequence of primitives to be transferred to the GL.
	 */
	public static void glEnd() {
		long __functionAddress = getInstance().glEnd;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEnd(__functionAddress);
	}

	// --- [ glEvalCoord1f ] ---

	/** JNI method for {@link #glEvalCoord1f(float)} */
	public static native void nglEvalCoord1f(float u, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Causes evaluation of the enabled one-dimensional evaluator maps.
	 *
	 * @param u the domain coordinate u
	 */
	public static void glEvalCoord1f(float u) {
		long __functionAddress = getInstance().glEvalCoord1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1f(u, __functionAddress);
	}

	// --- [ glEvalCoord1fv ] ---

	/** JNI method for {@link #glEvalCoord1f(ByteBuffer)} */
	public static native void nglEvalCoord1fv(long u, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glEvalCoord1f(float)}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord1f(ByteBuffer u) {
		long __functionAddress = getInstance().glEvalCoord1fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1fv(memAddress(u), __functionAddress);
	}

	/** Alternative version of: {@link #glEvalCoord1f(ByteBuffer)} */
	public static void glEvalCoord1(FloatBuffer u) {
		long __functionAddress = getInstance().glEvalCoord1fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1fv(memAddress(u), __functionAddress);
	}

	// --- [ glEvalCoord1d ] ---

	/** JNI method for {@link #glEvalCoord1d(double)} */
	public static native void nglEvalCoord1d(double u, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glEvalCoord1f(float)}.
	 *
	 * @param u the domain coordinate u
	 */
	public static void glEvalCoord1d(double u) {
		long __functionAddress = getInstance().glEvalCoord1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1d(u, __functionAddress);
	}

	// --- [ glEvalCoord1dv ] ---

	/** JNI method for {@link #glEvalCoord1d(ByteBuffer)} */
	public static native void nglEvalCoord1dv(long u, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glEvalCoord1d(double)}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord1d(ByteBuffer u) {
		long __functionAddress = getInstance().glEvalCoord1dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1dv(memAddress(u), __functionAddress);
	}

	/** Alternative version of: {@link #glEvalCoord1d(ByteBuffer)} */
	public static void glEvalCoord1(DoubleBuffer u) {
		long __functionAddress = getInstance().glEvalCoord1dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord1dv(memAddress(u), __functionAddress);
	}

	// --- [ glEvalCoord2f ] ---

	/** JNI method for {@link #glEvalCoord2f(float, float)} */
	public static native void nglEvalCoord2f(float u, float v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Causes evaluation of the enabled two-dimensional evaluator maps.
	 *
	 * @param u the domain coordinate u
	 * @param v the domain coordinate v
	 */
	public static void glEvalCoord2f(float u, float v) {
		long __functionAddress = getInstance().glEvalCoord2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2f(u, v, __functionAddress);
	}

	// --- [ glEvalCoord2fv ] ---

	/** JNI method for {@link #glEvalCoord2f(ByteBuffer)} */
	public static native void nglEvalCoord2fv(long u, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glEvalCoord2f(float, float)}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord2f(ByteBuffer u) {
		long __functionAddress = getInstance().glEvalCoord2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2fv(memAddress(u), __functionAddress);
	}

	/** Alternative version of: {@link #glEvalCoord2f(ByteBuffer)} */
	public static void glEvalCoord2(FloatBuffer u) {
		long __functionAddress = getInstance().glEvalCoord2fv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2fv(memAddress(u), __functionAddress);
	}

	// --- [ glEvalCoord2d ] ---

	/** JNI method for {@link #glEvalCoord2d(double, double)} */
	public static native void nglEvalCoord2d(double u, double v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glEvalCoord2f(float, float)}.
	 *
	 * @param u the domain coordinate u
	 * @param v the domain coordinate v
	 */
	public static void glEvalCoord2d(double u, double v) {
		long __functionAddress = getInstance().glEvalCoord2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2d(u, v, __functionAddress);
	}

	// --- [ glEvalCoord2dv ] ---

	/** JNI method for {@link #glEvalCoord2d(ByteBuffer)} */
	public static native void nglEvalCoord2dv(long u, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glEvalCoord2d(double, double)}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord2d(ByteBuffer u) {
		long __functionAddress = getInstance().glEvalCoord2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2dv(memAddress(u), __functionAddress);
	}

	/** Alternative version of: {@link #glEvalCoord2d(ByteBuffer)} */
	public static void glEvalCoord2(DoubleBuffer u) {
		long __functionAddress = getInstance().glEvalCoord2dv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalCoord2dv(memAddress(u), __functionAddress);
	}

	// --- [ glEvalMesh1 ] ---

	/** JNI method for {@link #glEvalMesh1(int, int, int)} */
	public static native void nglEvalMesh1(int mode, int i1, int i2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Carries out an evaluation on a subset of the one-dimensional map grid.
	 *
	 * @param mode the mesh type. One of:<p/>{@link #GL_POINT}, {@link #GL_LINE}
	 * @param i1   the start index
	 * @param i2   the end index
	 */
	public static void glEvalMesh1(int mode, int i1, int i2) {
		long __functionAddress = getInstance().glEvalMesh1;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalMesh1(mode, i1, i2, __functionAddress);
	}

	// --- [ glEvalMesh2 ] ---

	/** JNI method for {@link #glEvalMesh2(int, int, int, int, int)} */
	public static native void nglEvalMesh2(int mode, int i1, int i2, int j1, int j2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Carries out an evaluation on a rectangular subset of the two-dimensional map grid.
	 *
	 * @param mode the mesh type. One of:<p/>{@link #GL_FILL}, {@link #GL_LINE}, {@link #GL_POINT}
	 * @param i1   the u-dimension start index
	 * @param i2   the u-dimension end index
	 * @param j1   the v-dimension start index
	 * @param j2   the v-dimension end index
	 */
	public static void glEvalMesh2(int mode, int i1, int i2, int j1, int j2) {
		long __functionAddress = getInstance().glEvalMesh2;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalMesh2(mode, i1, i2, j1, j2, __functionAddress);
	}

	// --- [ glEvalPoint1 ] ---

	/** JNI method for {@link #glEvalPoint1(int)} */
	public static native void nglEvalPoint1(int i, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Carries out an evalutation of a single point on the one-dimensional map grid.
	 *
	 * @param i the grid index
	 */
	public static void glEvalPoint1(int i) {
		long __functionAddress = getInstance().glEvalPoint1;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalPoint1(i, __functionAddress);
	}

	// --- [ glEvalPoint2 ] ---

	/** JNI method for {@link #glEvalPoint2(int, int)} */
	public static native void nglEvalPoint2(int i, int j, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Carries out an evalutation of a single point on the two-dimensional map grid.
	 *
	 * @param i the u-dimension grid index
	 * @param j the v-dimension grid index
	 */
	public static void glEvalPoint2(int i, int j) {
		long __functionAddress = getInstance().glEvalPoint2;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEvalPoint2(i, j, __functionAddress);
	}

	// --- [ glFeedbackBuffer ] ---

	/** JNI method for {@link #glFeedbackBuffer(int, int, ByteBuffer)} */
	public static native void nglFeedbackBuffer(int size, int type, long buffer, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns information about primitives when the GL is in feedback mode.
	 *
	 * @param size   the maximum number of values that can be written to {@code buffer}
	 * @param type   the type of information to feed back for each vertex. One of:<p/>{@link #GL_2D}, {@link #GL_3D}, {@link #GL_3D_COLOR}, {@link #GL_3D_COLOR_TEXTURE}, {@link #GL_4D_COLOR_TEXTURE}
	 * @param buffer an array of floating-point values into which feedback information will be placed
	 */
	public static void glFeedbackBuffer(int size, int type, ByteBuffer buffer) {
		long __functionAddress = getInstance().glFeedbackBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer, size << 2);
		}
		nglFeedbackBuffer(size, type, memAddress(buffer), __functionAddress);
	}

	/** Alternative version of: {@link #glFeedbackBuffer(int, int, ByteBuffer)} */
	public static void glFeedbackBuffer(int type, FloatBuffer buffer) {
		long __functionAddress = getInstance().glFeedbackBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFeedbackBuffer(buffer.remaining(), type, memAddress(buffer), __functionAddress);
	}

	// --- [ glFinish ] ---

	/** JNI method for {@link #glFinish()} */
	public static native void nglFinish(long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFinish.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Forces all previously issued GL commands to complete. {@code Finish} does not return until all effects from such commands on GL client and server
	 * state and the framebuffer are fully realized.
	 */
	public static void glFinish() {
		long __functionAddress = getInstance().glFinish;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFinish(__functionAddress);
	}

	// --- [ glFlush ] ---

	/** JNI method for {@link #glFlush()} */
	public static native void nglFlush(long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFlush.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Causes all previously issued GL commands to complete in finite time (although such commands may still be executing when {@code Flush} returns).
	 */
	public static void glFlush() {
		long __functionAddress = getInstance().glFlush;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFlush(__functionAddress);
	}

	// --- [ glFogi ] ---

	/** JNI method for {@link #glFogi(int, int)} */
	public static native void nglFogi(int pname, int param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the integer value of a fog parameter.
	 *
	 * @param pname the fog parameter. One of:<p/>{@link #GL_FOG_MODE}, {@link GL15#GL_FOG_COORD_SRC}
	 * @param param the fog parameter value. One of:<p/>{@link #GL_EXP}, {@link #GL_EXP2}, {@link #GL_LINEAR}, {@link GL14#GL_FRAGMENT_DEPTH}, {@link GL15#GL_FOG_COORD}
	 */
	public static void glFogi(int pname, int param) {
		long __functionAddress = getInstance().glFogi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogi(pname, param, __functionAddress);
	}

	// --- [ glFogiv ] ---

	/** JNI method for {@link #glFogi(int, ByteBuffer)} */
	public static native void nglFogiv(int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glFogi(int, int)}.
	 *
	 * @param pname  the fog parameter. One of:<p/>{@link #GL_FOG_MODE}, {@link GL15#GL_FOG_COORD_SRC}
	 * @param params the fog parameter buffer
	 */
	public static void glFogi(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glFogiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglFogiv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glFogi(int, ByteBuffer)} */
	public static void glFog(int pname, IntBuffer params) {
		long __functionAddress = getInstance().glFogiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglFogiv(pname, memAddress(params), __functionAddress);
	}

	// --- [ glFogf ] ---

	/** JNI method for {@link #glFogf(int, float)} */
	public static native void nglFogf(int pname, float param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the float value of a fog parameter.
	 *
	 * @param pname the fog parameter. One of:<p/>{@link #GL_FOG_DENSITY}, {@link #GL_FOG_START}, {@link #GL_FOG_END}
	 * @param param the fog parameter value
	 */
	public static void glFogf(int pname, float param) {
		long __functionAddress = getInstance().glFogf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogf(pname, param, __functionAddress);
	}

	// --- [ glFogfv ] ---

	/** JNI method for {@link #glFogf(int, ByteBuffer)} */
	public static native void nglFogfv(int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glFogf(int, float)}.
	 *
	 * @param pname  the fog parameter. One of:<p/>{@link #GL_FOG_DENSITY}, {@link #GL_FOG_START}, {@link #GL_FOG_END}
	 * @param params the fog parameter buffer
	 */
	public static void glFogf(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glFogfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglFogfv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glFogf(int, ByteBuffer)} */
	public static void glFog(int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glFogfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglFogfv(pname, memAddress(params), __functionAddress);
	}

	// --- [ glFrontFace ] ---

	/** JNI method for {@link #glFrontFace(int)} */
	public static native void nglFrontFace(int dir, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glFrontFace.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * The first step of polygon rasterization is to determine if the polygon is back-facing or front-facing. This determination is made based on the sign of
	 * the (clipped or unclipped) polygon's area computed in window coordinates. The interpretation of the sign of this value is controlled with this function.
	 * In the initial state, the front face direction is set to {@link #GL_CCW}.
	 *
	 * @param dir the front face direction. One of:<p/>{@link #GL_CCW}, {@link #GL_CW}
	 */
	public static void glFrontFace(int dir) {
		long __functionAddress = getInstance().glFrontFace;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFrontFace(dir, __functionAddress);
	}

	// --- [ glGenLists ] ---

	/** JNI method for {@link #glGenLists(int)} */
	public static native int nglGenLists(int s, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns an integer n such that the indices {@code n,..., n + s - 1} are previously unused (i.e. there are {@code s} previously unused display list
	 * indices starting at n). {@code GenLists} also has the effect of creating an empty display list for each of the indices {@code n,..., n + s - 1}, so
	 * that these indices all become used. {@code GenLists} returns zero if there is no group of {@code s} contiguous previously unused display list indices,
	 * or if {@code s = 0}.
	 *
	 * @param s the number of display lists to create
	 */
	public static int glGenLists(int s) {
		long __functionAddress = getInstance().glGenLists;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGenLists(s, __functionAddress);
	}

	// --- [ glGenTextures ] ---

	/** JNI method for {@link #glGenTextures(int, ByteBuffer)} */
	public static native void nglGenTextures(int n, long textures, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenTextures.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns n previously unused texture names in textures. These names are marked as used, for the purposes of GenTextures only, but they acquire texture
	 * state and a dimensionality only when they are first bound, just as if they were unused.
	 *
	 * @param n        the number of textures to create
	 * @param textures a scalar or array in which to place the returned texture names
	 */
	public static void glGenTextures(int n, ByteBuffer textures) {
		long __functionAddress = getInstance().glGenTextures;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(textures, n << 2);
		}
		nglGenTextures(n, memAddress(textures), __functionAddress);
	}

	/** Alternative version of: {@link #glGenTextures(int, ByteBuffer)} */
	public static void glGenTextures(IntBuffer textures) {
		long __functionAddress = getInstance().glGenTextures;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenTextures(textures.remaining(), memAddress(textures), __functionAddress);
	}

	/** Single return value version of: {@link #glGenTextures(int, ByteBuffer)} */
	public static int glGenTextures() {
		long __functionAddress = getInstance().glGenTextures;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int textures = __buffer.intParam();
		nglGenTextures(1, __buffer.address() + textures, __functionAddress);
		return __buffer.intValue(textures);
	}

	// --- [ glDeleteTextures ] ---

	/** JNI method for {@link #glDeleteTextures(int, ByteBuffer)} */
	public static native void nglDeleteTextures(int n, long textures, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteTextures.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes texture objects. After a texture object is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is
	 * currently bound to any of the target bindings of {@link #glBindTexture(int, int)} is deleted, it is as though {@link #glBindTexture(int, int)} had been executed with the
	 * same target and texture zero. Additionally, special care must be taken when deleting a texture if any of the images of the texture are attached to a
	 * framebuffer object.
	 * <p/>
	 * Unused names in textures that have been marked as used for the purposes of {@link #glGenTextures(int, ByteBuffer)} are marked as unused again. Unused names in textures are
	 * silently ignored, as is the name zero.
	 *
	 * @param n        the number of texture names in the {@code textures} parameter
	 * @param textures contains {@code n} names of texture objects to be deleted
	 */
	public static void glDeleteTextures(int n, ByteBuffer textures) {
		long __functionAddress = getInstance().glDeleteTextures;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(textures, n << 2);
		}
		nglDeleteTextures(n, memAddress(textures), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteTextures(int, ByteBuffer)} */
	public static void glDeleteTextures(IntBuffer textures) {
		long __functionAddress = getInstance().glDeleteTextures;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteTextures(textures.remaining(), memAddress(textures), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteTextures(int, ByteBuffer)} */
	public static void glDeleteTextures(int texture) {
		long __functionAddress = getInstance().glDeleteTextures;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int textures = __buffer.intParam();
		__buffer.intValue(textures, texture);
		nglDeleteTextures(1, __buffer.address() + textures, __functionAddress);
	}

	// --- [ glGetClipPlane ] ---

	/** JNI method for {@link #glGetClipPlane(int, ByteBuffer)} */
	public static native void nglGetClipPlane(int plane, long equation, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetClipPlane.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns four double-precision values in {@code equation}; these are the coefficients of the plane equation of plane in eye coordinates (these
	 * coordinates are those that were computed when the plane was specified).
	 *
	 * @param plane    the clip plane
	 * @param equation an array in which to place the returned values
	 */
	public static void glGetClipPlane(int plane, ByteBuffer equation) {
		long __functionAddress = getInstance().glGetClipPlane;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(equation, 4 << 3);
		}
		nglGetClipPlane(plane, memAddress(equation), __functionAddress);
	}

	/** Alternative version of: {@link #glGetClipPlane(int, ByteBuffer)} */
	public static void glGetClipPlane(int plane, DoubleBuffer equation) {
		long __functionAddress = getInstance().glGetClipPlane;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(equation, 4);
		}
		nglGetClipPlane(plane, memAddress(equation), __functionAddress);
	}

	// --- [ glGetBooleanv ] ---

	/** JNI method for {@link #glGetBoolean(int, ByteBuffer)} */
	public static native void nglGetBooleanv(int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGet.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the current boolean value of the specified state variable.
	 * <p/>
	 * <b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
	 *
	 * @param pname  the state variable
	 * @param params a scalar or array in which to place the returned data
	 */
	public static void glGetBoolean(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetBooleanv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetBooleanv(pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetBoolean(int, ByteBuffer)} */
	public static boolean glGetBoolean(int pname) {
		long __functionAddress = getInstance().glGetBooleanv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.booleanParam();
		nglGetBooleanv(pname, __buffer.address() + params, __functionAddress);
		return __buffer.booleanValue(params);
	}

	// --- [ glGetFloatv ] ---

	/** JNI method for {@link #glGetFloat(int, ByteBuffer)} */
	public static native void nglGetFloatv(int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGet.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the current float value of the specified state variable.
	 * <p/>
	 * <b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
	 *
	 * @param pname  the state variable
	 * @param params a scalar or array in which to place the returned data
	 */
	public static void glGetFloat(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetFloatv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetFloatv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetFloat(int, ByteBuffer)} */
	public static void glGetFloat(int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glGetFloatv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetFloatv(pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetFloat(int, ByteBuffer)} */
	public static float glGetFloat(int pname) {
		long __functionAddress = getInstance().glGetFloatv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetFloatv(pname, __buffer.address() + params, __functionAddress);
		return __buffer.floatValue(params);
	}

	// --- [ glGetIntegerv ] ---

	/** JNI method for {@link #glGetInteger(int, ByteBuffer)} */
	public static native void nglGetIntegerv(int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGet.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the current integer value of the specified state variable.
	 * <p/>
	 * <b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
	 *
	 * @param pname  the state variable
	 * @param params a scalar or array in which to place the returned data
	 */
	public static void glGetInteger(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetIntegerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetIntegerv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetInteger(int, ByteBuffer)} */
	public static void glGetInteger(int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetIntegerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetIntegerv(pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetInteger(int, ByteBuffer)} */
	public static int glGetInteger(int pname) {
		long __functionAddress = getInstance().glGetIntegerv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetIntegerv(pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetDoublev ] ---

	/** JNI method for {@link #glGetDouble(int, ByteBuffer)} */
	public static native void nglGetDoublev(int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGet.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the current double value of the specified state variable.
	 * <p/>
	 * <b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.
	 *
	 * @param pname  the state variable
	 * @param params a scalar or array in which to place the returned data
	 */
	public static void glGetDouble(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetDoublev;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 3);
		}
		nglGetDoublev(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetDouble(int, ByteBuffer)} */
	public static void glGetDouble(int pname, DoubleBuffer params) {
		long __functionAddress = getInstance().glGetDoublev;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetDoublev(pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetDouble(int, ByteBuffer)} */
	public static double glGetDouble(int pname) {
		long __functionAddress = getInstance().glGetDoublev;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.doubleParam();
		nglGetDoublev(pname, __buffer.address() + params, __functionAddress);
		return __buffer.doubleValue(params);
	}

	// --- [ glGetError ] ---

	/** JNI method for {@link #glGetError()} */
	public static native int nglGetError(long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetError.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns error information. Each detectable error is assigned a numeric code. When an error is detected, a flag is set and the code is recorded. Further
	 * errors, if they occur, do not affect this recorded code. When {@code GetError} is called, the code is returned and the flag is cleared, so that a
	 * further error will again record its code. If a call to {@code GetError} returns {@link #GL_NO_ERROR}, then there has been no detectable error since
	 * the last call to {@code GetError} (or since the GL was initialized).
	 */
	public static int glGetError() {
		long __functionAddress = getInstance().glGetError;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetError(__functionAddress);
	}

	// --- [ glGetLightiv ] ---

	/** JNI method for {@link #glGetLighti(int, int, ByteBuffer)} */
	public static native void nglGetLightiv(int light, int value, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns integer information about light parameter {@code value} for {@code light} in {@code data}.
	 *
	 * @param light the light for which to return information. One of:<p/>{@link #GL_LIGHT0}, GL_LIGHT[1-7]
	 * @param value the light parameter to query. One of:<p/>{@link #GL_AMBIENT}, {@link #GL_DIFFUSE}, {@link #GL_SPECULAR}, {@link #GL_POSITION}, {@link #GL_CONSTANT_ATTENUATION}, {@link #GL_LINEAR_ATTENUATION}, {@link #GL_QUADRATIC_ATTENUATION}, {@link #GL_SPOT_DIRECTION}, {@link #GL_SPOT_EXPONENT}, {@link #GL_SPOT_CUTOFF}
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetLighti(int light, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetLightiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 2);
		}
		nglGetLightiv(light, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetLighti(int, int, ByteBuffer)} */
	public static void glGetLight(int light, int value, IntBuffer data) {
		long __functionAddress = getInstance().glGetLightiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetLightiv(light, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetLighti(int, int, ByteBuffer)} */
	public static int glGetLighti(int light, int value) {
		long __functionAddress = getInstance().glGetLightiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetLightiv(light, value, __buffer.address() + data, __functionAddress);
		return __buffer.intValue(data);
	}

	// --- [ glGetLightfv ] ---

	/** JNI method for {@link #glGetLightf(int, int, ByteBuffer)} */
	public static native void nglGetLightfv(int light, int value, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glGetLighti(int, int, ByteBuffer)}.
	 *
	 * @param light the light for which to return information
	 * @param value the light parameter to query
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetLightf(int light, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetLightfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 2);
		}
		nglGetLightfv(light, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetLightf(int, int, ByteBuffer)} */
	public static void glGetLight(int light, int value, FloatBuffer data) {
		long __functionAddress = getInstance().glGetLightfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetLightfv(light, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetLightf(int, int, ByteBuffer)} */
	public static float glGetLightf(int light, int value) {
		long __functionAddress = getInstance().glGetLightfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetLightfv(light, value, __buffer.address() + data, __functionAddress);
		return __buffer.floatValue(data);
	}

	// --- [ glGetMapiv ] ---

	/** JNI method for {@link #glGetMapi(int, int, ByteBuffer)} */
	public static native void nglGetMapiv(int target, int query, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.
	 *
	 * @param target the evaluator target. One of:<p/>{@link #GL_MAP1_VERTEX_3}, {@link #GL_MAP1_VERTEX_4}, {@link #GL_MAP1_COLOR_4}, {@link #GL_MAP1_NORMAL}, {@link #GL_MAP1_TEXTURE_COORD_1}, {@link #GL_MAP1_TEXTURE_COORD_2}, {@link #GL_MAP1_TEXTURE_COORD_3}, {@link #GL_MAP1_TEXTURE_COORD_4}, {@link #GL_MAP2_VERTEX_3}, {@link #GL_MAP2_VERTEX_4}, {@link #GL_MAP2_COLOR_4}, {@link #GL_MAP2_NORMAL}, {@link #GL_MAP2_TEXTURE_COORD_1}, {@link #GL_MAP2_TEXTURE_COORD_2}, {@link #GL_MAP2_TEXTURE_COORD_3}, {@link #GL_MAP2_TEXTURE_COORD_4}
	 * @param query  the information to query. One of:<p/>{@link #GL_ORDER}, {@link #GL_COEFF}, {@link #GL_DOMAIN}
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetMapi(int target, int query, ByteBuffer data) {
		long __functionAddress = getInstance().glGetMapiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 2);
		}
		nglGetMapiv(target, query, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetMapi(int, int, ByteBuffer)} */
	public static void glGetMap(int target, int query, IntBuffer data) {
		long __functionAddress = getInstance().glGetMapiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetMapiv(target, query, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetMapi(int, int, ByteBuffer)} */
	public static int glGetMapi(int target, int query) {
		long __functionAddress = getInstance().glGetMapiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetMapiv(target, query, __buffer.address() + data, __functionAddress);
		return __buffer.intValue(data);
	}

	// --- [ glGetMapfv ] ---

	/** JNI method for {@link #glGetMapf(int, int, ByteBuffer)} */
	public static native void nglGetMapfv(int target, int query, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glGetMapi(int, int, ByteBuffer)}.
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetMapf(int target, int query, ByteBuffer data) {
		long __functionAddress = getInstance().glGetMapfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 2);
		}
		nglGetMapfv(target, query, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetMapf(int, int, ByteBuffer)} */
	public static void glGetMap(int target, int query, FloatBuffer data) {
		long __functionAddress = getInstance().glGetMapfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetMapfv(target, query, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetMapf(int, int, ByteBuffer)} */
	public static float glGetMapf(int target, int query) {
		long __functionAddress = getInstance().glGetMapfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetMapfv(target, query, __buffer.address() + data, __functionAddress);
		return __buffer.floatValue(data);
	}

	// --- [ glGetMapdv ] ---

	/** JNI method for {@link #glGetMapd(int, int, ByteBuffer)} */
	public static native void nglGetMapdv(int target, int query, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glGetMapi(int, int, ByteBuffer)}.
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetMapd(int target, int query, ByteBuffer data) {
		long __functionAddress = getInstance().glGetMapdv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 3);
		}
		nglGetMapdv(target, query, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetMapd(int, int, ByteBuffer)} */
	public static void glGetMap(int target, int query, DoubleBuffer data) {
		long __functionAddress = getInstance().glGetMapdv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetMapdv(target, query, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetMapd(int, int, ByteBuffer)} */
	public static double glGetMapd(int target, int query) {
		long __functionAddress = getInstance().glGetMapdv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.doubleParam();
		nglGetMapdv(target, query, __buffer.address() + data, __functionAddress);
		return __buffer.doubleValue(data);
	}

	// --- [ glGetMaterialiv ] ---

	/** JNI method for {@link #glGetMateriali(int, int, ByteBuffer)} */
	public static native void nglGetMaterialiv(int face, int value, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns integer information about material property {@code value} for {@code face} in {@code data}.
	 *
	 * @param face  the material face for which to return information. One of:<p/>{@link #GL_FRONT}, {@link #GL_BACK}
	 * @param value the information to query. One of:<p/>{@link #GL_AMBIENT}, {@link #GL_DIFFUSE}, {@link #GL_SPECULAR}, {@link #GL_EMISSION}, {@link #GL_SHININESS}
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetMateriali(int face, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetMaterialiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMaterialiv(face, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetMateriali(int, int, ByteBuffer)} */
	public static void glGetMaterial(int face, int value, IntBuffer data) {
		long __functionAddress = getInstance().glGetMaterialiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMaterialiv(face, value, memAddress(data), __functionAddress);
	}

	// --- [ glGetMaterialfv ] ---

	/** JNI method for {@link #glGetMaterialf(int, int, ByteBuffer)} */
	public static native void nglGetMaterialfv(int face, int value, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glGetMateriali(int, int, ByteBuffer)}.
	 *
	 * @param face  the material face for which to return information
	 * @param value the information to query
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetMaterialf(int face, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetMaterialfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMaterialfv(face, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetMaterialf(int, int, ByteBuffer)} */
	public static void glGetMaterial(int face, int value, FloatBuffer data) {
		long __functionAddress = getInstance().glGetMaterialfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetMaterialfv(face, value, memAddress(data), __functionAddress);
	}

	// --- [ glGetPixelMapfv ] ---

	/** JNI method for {@link #glGetPixelMapf(int, ByteBuffer)} */
	public static native void nglGetPixelMapfv(int map, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns all float values in the pixel map {@code map} in {@code data}.
	 *
	 * @param map  the pixel map parameter to query. One of:<p/>{@link #GL_PIXEL_MAP_I_TO_I}, {@link #GL_PIXEL_MAP_S_TO_S}, {@link #GL_PIXEL_MAP_I_TO_R}, {@link #GL_PIXEL_MAP_I_TO_G}, {@link #GL_PIXEL_MAP_I_TO_B}, {@link #GL_PIXEL_MAP_I_TO_A}, {@link #GL_PIXEL_MAP_R_TO_R}, {@link #GL_PIXEL_MAP_G_TO_G}, {@link #GL_PIXEL_MAP_B_TO_B}, {@link #GL_PIXEL_MAP_A_TO_A}
	 * @param data an array in which to place the returned data
	 */
	public static void glGetPixelMapf(int map, ByteBuffer data) {
		long __functionAddress = getInstance().glGetPixelMapfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 32 << 2);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetPixelMapfv(map, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetPixelMapf(int, ByteBuffer)} */
	public static void glGetPixelMapf(int map, long dataOffset) {
		long __functionAddress = getInstance().glGetPixelMapfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetPixelMapfv(map, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glGetPixelMapf(int, ByteBuffer)} */
	public static void glGetPixelMap(int map, FloatBuffer data) {
		long __functionAddress = getInstance().glGetPixelMapfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 32);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetPixelMapfv(map, memAddress(data), __functionAddress);
	}

	// --- [ glGetPixelMapusv ] ---

	/** JNI method for {@link #glGetPixelMapus(int, ByteBuffer)} */
	public static native void nglGetPixelMapusv(int map, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned short version of {@link #glGetPixelMapf(int, ByteBuffer)}.
	 *
	 * @param map  the pixel map parameter to query
	 * @param data an array in which to place the returned data
	 */
	public static void glGetPixelMapus(int map, ByteBuffer data) {
		long __functionAddress = getInstance().glGetPixelMapusv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 32 << 1);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetPixelMapusv(map, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetPixelMapus(int, ByteBuffer)} */
	public static void glGetPixelMapus(int map, long dataOffset) {
		long __functionAddress = getInstance().glGetPixelMapusv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetPixelMapusv(map, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glGetPixelMapus(int, ByteBuffer)} */
	public static void glGetPixelMapu(int map, ShortBuffer data) {
		long __functionAddress = getInstance().glGetPixelMapusv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 32);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetPixelMapusv(map, memAddress(data), __functionAddress);
	}

	// --- [ glGetPixelMapuiv ] ---

	/** JNI method for {@link #glGetPixelMapui(int, ByteBuffer)} */
	public static native void nglGetPixelMapuiv(int map, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned integer version of {@link #glGetPixelMapf(int, ByteBuffer)}.
	 *
	 * @param map  the pixel map parameter to query
	 * @param data an array in which to place the returned data
	 */
	public static void glGetPixelMapui(int map, ByteBuffer data) {
		long __functionAddress = getInstance().glGetPixelMapuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 32 << 2);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetPixelMapuiv(map, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetPixelMapui(int, ByteBuffer)} */
	public static void glGetPixelMapui(int map, long dataOffset) {
		long __functionAddress = getInstance().glGetPixelMapuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetPixelMapuiv(map, dataOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glGetPixelMapui(int, ByteBuffer)} */
	public static void glGetPixelMapu(int map, IntBuffer data) {
		long __functionAddress = getInstance().glGetPixelMapuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 32);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetPixelMapuiv(map, memAddress(data), __functionAddress);
	}

	// --- [ glGetPointerv ] ---

	/** JNI method for {@link #glGetPointer(int, ByteBuffer)} */
	public static native void nglGetPointerv(int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetPointer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns a pointer in the current GL context.
	 *
	 * @param pname  the pointer to return
	 * @param params an array in which to place the returned pointer
	 */
	public static void glGetPointer(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetPointerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << PointerBuffer.getPointerSizeShift());
		}
		nglGetPointerv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetPointer(int, ByteBuffer)} */
	public static void glGetPointer(int pname, PointerBuffer params) {
		long __functionAddress = getInstance().glGetPointerv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetPointerv(pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetPointer(int, ByteBuffer)} */
	public static long glGetPointer(int pname) {
		long __functionAddress = getInstance().glGetPointerv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetPointerv(pname, __buffer.address() + params, __functionAddress);
		return __buffer.pointerValue(params);
	}

	// --- [ glGetPolygonStipple ] ---

	/** JNI method for {@link #glGetPolygonStipple(ByteBuffer)} */
	public static native void nglGetPolygonStipple(long pattern, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Obtains the polygon stipple.
	 *
	 * @param pattern an array in which to place the returned data
	 */
	public static void glGetPolygonStipple(ByteBuffer pattern) {
		long __functionAddress = getInstance().glGetPolygonStipple;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pattern, 128);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetPolygonStipple(memAddress(pattern), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetPolygonStipple(ByteBuffer)} */
	public static void glGetPolygonStipple(long patternOffset) {
		long __functionAddress = getInstance().glGetPolygonStipple;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetPolygonStipple(patternOffset, __functionAddress);
	}

	// --- [ glGetString ] ---

	/** JNI method for {@link #glGetString(int)} */
	public static native long nglGetString(int name, long __functionAddress);

	/**
	 * Return strings describing properties of the current GL context.
	 *
	 * @param name the property to query. One of:<p/>{@link #GL_RENDERER}, {@link #GL_VENDOR}, {@link #GL_EXTENSIONS}, {@link #GL_VERSION}, {@link GL20#GL_SHADING_LANGUAGE_VERSION}
	 */
	public static String glGetString(int name) {
		long __functionAddress = getInstance().glGetString;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nglGetString(name, __functionAddress);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glGetTexEnviv ] ---

	/** JNI method for {@link #glGetTexEnvi(int, int, ByteBuffer)} */
	public static native void nglGetTexEnviv(int env, int value, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexEnv.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns integer information about {@code value} for {@code env} in {@code data}.
	 *
	 * @param env   the texture environment to query. One of:<p/>{@link GL20#GL_POINT_SPRITE}, {@link #GL_TEXTURE_ENV}, {@link GL14#GL_TEXTURE_FILTER_CONTROL}
	 * @param value the value to query. One of:<p/>{@link GL20#GL_COORD_REPLACE}, {@link #GL_TEXTURE_ENV_MODE}, {@link #GL_TEXTURE_ENV_COLOR}, {@link GL14#GL_TEXTURE_LOD_BIAS}, {@link GL13#GL_COMBINE_RGB}, {@link GL13#GL_COMBINE_ALPHA}, {@link GL15#GL_SRC0_RGB}, {@link GL15#GL_SRC1_RGB}, {@link GL15#GL_SRC2_RGB}, {@link GL15#GL_SRC0_ALPHA}, {@link GL15#GL_SRC1_ALPHA}, {@link GL15#GL_SRC2_ALPHA}, {@link GL13#GL_OPERAND0_RGB}, {@link GL13#GL_OPERAND1_RGB}, {@link GL13#GL_OPERAND2_RGB}, {@link GL13#GL_OPERAND0_ALPHA}, {@link GL13#GL_OPERAND1_ALPHA}, {@link GL13#GL_OPERAND2_ALPHA}, {@link GL13#GL_RGB_SCALE}, {@link #GL_ALPHA_SCALE}
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetTexEnvi(int env, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexEnviv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1 << 2);
		}
		nglGetTexEnviv(env, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexEnvi(int, int, ByteBuffer)} */
	public static void glGetTexEnv(int env, int value, IntBuffer data) {
		long __functionAddress = getInstance().glGetTexEnviv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		nglGetTexEnviv(env, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexEnvi(int, int, ByteBuffer)} */
	public static int glGetTexEnvi(int env, int value) {
		long __functionAddress = getInstance().glGetTexEnviv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetTexEnviv(env, value, __buffer.address() + data, __functionAddress);
		return __buffer.intValue(data);
	}

	// --- [ glGetTexEnvfv ] ---

	/** JNI method for {@link #glGetTexEnvf(int, int, ByteBuffer)} */
	public static native void nglGetTexEnvfv(int env, int value, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexEnv.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glGetTexEnvi(int, int, ByteBuffer)}.
	 *
	 * @param env   the texture environment to query
	 * @param value the value to query
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetTexEnvf(int env, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexEnvfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1 << 2);
		}
		nglGetTexEnvfv(env, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexEnvf(int, int, ByteBuffer)} */
	public static void glGetTexEnv(int env, int value, FloatBuffer data) {
		long __functionAddress = getInstance().glGetTexEnvfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		nglGetTexEnvfv(env, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexEnvf(int, int, ByteBuffer)} */
	public static float glGetTexEnvf(int env, int value) {
		long __functionAddress = getInstance().glGetTexEnvfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetTexEnvfv(env, value, __buffer.address() + data, __functionAddress);
		return __buffer.floatValue(data);
	}

	// --- [ glGetTexGeniv ] ---

	/** JNI method for {@link #glGetTexGeni(int, int, ByteBuffer)} */
	public static native void nglGetTexGeniv(int coord, int value, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns integer information about {@code value} for {@code coord} in {@code data}.
	 *
	 * @param coord the coord to query. One of:<p/>{@link #GL_S}, {@link #GL_T}, {@link #GL_R}, {@link #GL_Q}
	 * @param value the value to query. One of:<p/>{@link #GL_EYE_PLANE}, {@link #GL_OBJECT_PLANE}, {@link #GL_TEXTURE_GEN_MODE}
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetTexGeni(int coord, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexGeniv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1 << 2);
		}
		nglGetTexGeniv(coord, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexGeni(int, int, ByteBuffer)} */
	public static void glGetTexGen(int coord, int value, IntBuffer data) {
		long __functionAddress = getInstance().glGetTexGeniv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		nglGetTexGeniv(coord, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexGeni(int, int, ByteBuffer)} */
	public static int glGetTexGeni(int coord, int value) {
		long __functionAddress = getInstance().glGetTexGeniv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetTexGeniv(coord, value, __buffer.address() + data, __functionAddress);
		return __buffer.intValue(data);
	}

	// --- [ glGetTexGenfv ] ---

	/** JNI method for {@link #glGetTexGenf(int, int, ByteBuffer)} */
	public static native void nglGetTexGenfv(int coord, int value, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glGetTexGeni(int, int, ByteBuffer)}.
	 *
	 * @param coord the coord to query
	 * @param value the value to query
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetTexGenf(int coord, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexGenfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 2);
		}
		nglGetTexGenfv(coord, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexGenf(int, int, ByteBuffer)} */
	public static void glGetTexGen(int coord, int value, FloatBuffer data) {
		long __functionAddress = getInstance().glGetTexGenfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetTexGenfv(coord, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexGenf(int, int, ByteBuffer)} */
	public static float glGetTexGenf(int coord, int value) {
		long __functionAddress = getInstance().glGetTexGenfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetTexGenfv(coord, value, __buffer.address() + data, __functionAddress);
		return __buffer.floatValue(data);
	}

	// --- [ glGetTexGendv ] ---

	/** JNI method for {@link #glGetTexGend(int, int, ByteBuffer)} */
	public static native void nglGetTexGendv(int coord, int value, long data, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glGetTexGeni(int, int, ByteBuffer)}.
	 *
	 * @param coord the coord to query
	 * @param value the value to query
	 * @param data  a scalar or array in which to place the returned data
	 */
	public static void glGetTexGend(int coord, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexGendv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 3);
		}
		nglGetTexGendv(coord, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexGend(int, int, ByteBuffer)} */
	public static void glGetTexGen(int coord, int value, DoubleBuffer data) {
		long __functionAddress = getInstance().glGetTexGendv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetTexGendv(coord, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexGend(int, int, ByteBuffer)} */
	public static double glGetTexGend(int coord, int value) {
		long __functionAddress = getInstance().glGetTexGendv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.doubleParam();
		nglGetTexGendv(coord, value, __buffer.address() + data, __functionAddress);
		return __buffer.doubleValue(data);
	}

	// --- [ glGetTexImage ] ---

	/** JNI method for {@link #glGetTexImage(int, int, int, int, ByteBuffer)} */
	public static native void nglGetTexImage(int tex, int lod, int format, int type, long img, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexImage.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Obtains texture images.
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<p/>{@link #GL_TEXTURE_1D}, {@link #GL_TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL30#GL_TEXTURE_2D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z}
	 * @param lod    the level-of-detail number
	 * @param format the pixel format. One of:<p/>{@link GL11#GL_STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER}, {@link GL30#GL_RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER}
	 * @param type   the pixel type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link GL11#GL_FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP}
	 * @param img    the array in which to place the returned data
	 */
	public static void glGetTexImage(int tex, int lod, int format, int type, ByteBuffer img) {
		long __functionAddress = getInstance().glGetTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetTexImage(tex, lod, format, type, memAddress(img), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetTexImage(int, int, int, int, ByteBuffer)} */
	public static void glGetTexImage(int tex, int lod, int format, int type, long imgOffset) {
		long __functionAddress = getInstance().glGetTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetTexImage(tex, lod, format, type, imgOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glGetTexImage(int, int, int, int, ByteBuffer)} */
	public static void glGetTexImage(int tex, int lod, int format, int type, ShortBuffer img) {
		long __functionAddress = getInstance().glGetTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetTexImage(tex, lod, format, type, memAddress(img), __functionAddress);
	}

	/** IntBuffer version of: {@link #glGetTexImage(int, int, int, int, ByteBuffer)} */
	public static void glGetTexImage(int tex, int lod, int format, int type, IntBuffer img) {
		long __functionAddress = getInstance().glGetTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetTexImage(tex, lod, format, type, memAddress(img), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glGetTexImage(int, int, int, int, ByteBuffer)} */
	public static void glGetTexImage(int tex, int lod, int format, int type, FloatBuffer img) {
		long __functionAddress = getInstance().glGetTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetTexImage(tex, lod, format, type, memAddress(img), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glGetTexImage(int, int, int, int, ByteBuffer)} */
	public static void glGetTexImage(int tex, int lod, int format, int type, DoubleBuffer img) {
		long __functionAddress = getInstance().glGetTexImage;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetTexImage(tex, lod, format, type, memAddress(img), __functionAddress);
	}

	// --- [ glGetTexLevelParameteriv ] ---

	/** JNI method for {@link #glGetTexLevelParameteri(int, int, int, ByteBuffer)} */
	public static native void nglGetTexLevelParameteriv(int target, int lod, int value, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexLevelParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Places integer information about texture image parameter {@code value} for level-of-detail {@code lod} of the specified {@code target} into {@code data}.
	 *
	 * @param target the texture image target. One of:<p/>{@link GL11#GL_TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP}, {@link GL11#GL_PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP}, {@link #GL_TEXTURE_1D}, {@link GL12#GL_TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY}, {@link #GL_PROXY_TEXTURE_1D}, {@link GL12#GL_PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY}, {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param lod    the level-of-detail number
	 * @param value  the value to query. One of:<p/>{@link #GL_TEXTURE_WIDTH}, {@link #GL_TEXTURE_HEIGHT}, {@link GL12#GL_TEXTURE_DEPTH}, {@link #GL_TEXTURE_BORDER}, {@link GL32#GL_TEXTURE_SAMPLES}, {@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS}, {@link #GL_TEXTURE_INTERNAL_FORMAT}, {@link #GL_TEXTURE_RED_SIZE}, {@link #GL_TEXTURE_GREEN_SIZE}, {@link #GL_TEXTURE_BLUE_SIZE}, {@link #GL_TEXTURE_ALPHA_SIZE}, {@link #GL_TEXTURE_LUMINANCE_SIZE}, {@link #GL_TEXTURE_INTENSITY_SIZE}, {@link GL14#GL_TEXTURE_DEPTH_SIZE}, {@link GL30#GL_TEXTURE_STENCIL_SIZE}, {@link GL30#GL_TEXTURE_SHARED_SIZE}, {@link GL30#GL_TEXTURE_RED_TYPE}, {@link GL30#GL_TEXTURE_GREEN_TYPE}, {@link GL30#GL_TEXTURE_BLUE_TYPE}, {@link GL30#GL_TEXTURE_ALPHA_TYPE}, {@link GL30#GL_TEXTURE_LUMINANCE_TYPE}, {@link GL30#GL_TEXTURE_INTENSITY_TYPE}, {@link GL30#GL_TEXTURE_DEPTH_TYPE}, {@link GL13#GL_TEXTURE_COMPRESSED}, {@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE}, {@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING}, {@link GL43#GL_TEXTURE_BUFFER_OFFSET}, {@link GL43#GL_TEXTURE_BUFFER_SIZE}
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetTexLevelParameteri(int target, int lod, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexLevelParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 2);
		}
		nglGetTexLevelParameteriv(target, lod, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexLevelParameteri(int, int, int, ByteBuffer)} */
	public static void glGetTexLevelParameter(int target, int lod, int value, IntBuffer data) {
		long __functionAddress = getInstance().glGetTexLevelParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetTexLevelParameteriv(target, lod, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexLevelParameteri(int, int, int, ByteBuffer)} */
	public static int glGetTexLevelParameteri(int target, int lod, int value) {
		long __functionAddress = getInstance().glGetTexLevelParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetTexLevelParameteriv(target, lod, value, __buffer.address() + data, __functionAddress);
		return __buffer.intValue(data);
	}

	// --- [ glGetTexLevelParameterfv ] ---

	/** JNI method for {@link #glGetTexLevelParameterf(int, int, int, ByteBuffer)} */
	public static native void nglGetTexLevelParameterfv(int target, int lod, int value, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexLevelParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glGetTexLevelParameteri(int, int, int, ByteBuffer)}.
	 *
	 * @param target the texture image target
	 * @param lod    the level-of-detail number
	 * @param value  the value to query
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetTexLevelParameterf(int target, int lod, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexLevelParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4 << 2);
		}
		nglGetTexLevelParameterfv(target, lod, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexLevelParameterf(int, int, int, ByteBuffer)} */
	public static void glGetTexLevelParameter(int target, int lod, int value, FloatBuffer data) {
		long __functionAddress = getInstance().glGetTexLevelParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 4);
		}
		nglGetTexLevelParameterfv(target, lod, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexLevelParameterf(int, int, int, ByteBuffer)} */
	public static float glGetTexLevelParameterf(int target, int lod, int value) {
		long __functionAddress = getInstance().glGetTexLevelParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetTexLevelParameterfv(target, lod, value, __buffer.address() + data, __functionAddress);
		return __buffer.floatValue(data);
	}

	// --- [ glGetTexParameteriv ] ---

	/** JNI method for {@link #glGetTexParameteri(int, int, ByteBuffer)} */
	public static native void nglGetTexParameteriv(int target, int value, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Place integer information about texture parameter {@code value} for the specified {@code target} into {@code data}.
	 *
	 * @param target the texture target. One of:<p/>{@link #GL_TEXTURE_1D}, {@link #GL_TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL30#GL_TEXTURE_2D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param value  the value to query. One of:<p/>{@link GL12#GL_TEXTURE_BASE_LEVEL}, {@link #GL_TEXTURE_BORDER_COLOR}, {@link GL14#GL_TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC}, {@link GL14#GL_TEXTURE_LOD_BIAS}, {@link #GL_TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MAX_LEVEL}, {@link GL12#GL_TEXTURE_MAX_LOD}, {@link #GL_TEXTURE_MIN_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD}, {@link #GL_TEXTURE_PRIORITY}, {@link GL33#GL_TEXTURE_SWIZZLE_R}, {@link GL33#GL_TEXTURE_SWIZZLE_G}, {@link GL33#GL_TEXTURE_SWIZZLE_B}, {@link GL33#GL_TEXTURE_SWIZZLE_A}, {@link GL33#GL_TEXTURE_SWIZZLE_RGBA}, {@link #GL_TEXTURE_WRAP_S}, {@link #GL_TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R}, {@link GL14#GL_DEPTH_TEXTURE_MODE}, {@link GL14#GL_GENERATE_MIPMAP}, {@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE}, {@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT}, {@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS}, {@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL}, {@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS}, {@link GL43#GL_TEXTURE_VIEW_MIN_LAYER}, {@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS}, {@link #GL_TEXTURE_RESIDENT}
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetTexParameteri(int target, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1 << 2);
		}
		nglGetTexParameteriv(target, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexParameteri(int, int, ByteBuffer)} */
	public static void glGetTexParameter(int target, int value, IntBuffer data) {
		long __functionAddress = getInstance().glGetTexParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		nglGetTexParameteriv(target, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexParameteri(int, int, ByteBuffer)} */
	public static int glGetTexParameteri(int target, int value) {
		long __functionAddress = getInstance().glGetTexParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetTexParameteriv(target, value, __buffer.address() + data, __functionAddress);
		return __buffer.intValue(data);
	}

	// --- [ glGetTexParameterfv ] ---

	/** JNI method for {@link #glGetTexParameterf(int, int, ByteBuffer)} */
	public static native void nglGetTexParameterfv(int target, int value, long data, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetTexParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glGetTexParameteri(int, int, ByteBuffer)}.
	 *
	 * @param target the texture target
	 * @param value  the value to query
	 * @param data   a scalar or array in which to place the returned data
	 */
	public static void glGetTexParameterf(int target, int value, ByteBuffer data) {
		long __functionAddress = getInstance().glGetTexParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1 << 2);
		}
		nglGetTexParameterfv(target, value, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #glGetTexParameterf(int, int, ByteBuffer)} */
	public static void glGetTexParameter(int target, int value, FloatBuffer data) {
		long __functionAddress = getInstance().glGetTexParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		nglGetTexParameterfv(target, value, memAddress(data), __functionAddress);
	}

	/** Single return value version of: {@link #glGetTexParameterf(int, int, ByteBuffer)} */
	public static float glGetTexParameterf(int target, int value) {
		long __functionAddress = getInstance().glGetTexParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetTexParameterfv(target, value, __buffer.address() + data, __functionAddress);
		return __buffer.floatValue(data);
	}

	// --- [ glHint ] ---

	/** JNI method for {@link #glHint(int, int)} */
	public static native void nglHint(int target, int hint, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glHint.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Certain aspects of GL behavior, when there is room for variation, may be controlled with this function. The initial value for all hints is
	 * {@link #GL_DONT_CARE}.
	 *
	 * @param target the behavior to control. One of:<p/>{@link #GL_PERSPECTIVE_CORRECTION_HINT}, {@link #GL_POINT_SMOOTH_HINT}, {@link #GL_LINE_SMOOTH_HINT}, {@link #GL_POLYGON_SMOOTH_HINT}, {@link #GL_FOG_HINT}, {@link GL14#GL_GENERATE_MIPMAP_HINT}, {@link GL13#GL_TEXTURE_COMPRESSION_HINT}, {@link GL20#GL_FRAGMENT_SHADER_DERIVATIVE_HINT}
	 * @param hint   the behavior hint. One of:<p/>{@link #GL_FASTEST}, {@link #GL_NICEST}, {@link #GL_DONT_CARE}
	 */
	public static void glHint(int target, int hint) {
		long __functionAddress = getInstance().glHint;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglHint(target, hint, __functionAddress);
	}

	// --- [ glInitNames ] ---

	/** JNI method for {@link #glInitNames()} */
	public static native void nglInitNames(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Clears the selection name stack.
	 */
	public static void glInitNames() {
		long __functionAddress = getInstance().glInitNames;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglInitNames(__functionAddress);
	}

	// --- [ glInterleavedArrays ] ---

	/** JNI method for {@link #glInterleavedArrays(int, int, ByteBuffer)} */
	public static native void nglInterleavedArrays(int format, int stride, long pointer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glInterleavedArrays.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
	 *
	 * @param format  the interleaved array format. One of:<p/>{@link #GL_V2F}, {@link #GL_V3F}, {@link #GL_C4UB_V2F}, {@link #GL_C4UB_V3F}, {@link #GL_C3F_V3F}, {@link #GL_N3F_V3F}, {@link #GL_C4F_N3F_V3F}, {@link #GL_T2F_V3F}, {@link #GL_T4F_V4F}, {@link #GL_T2F_C4UB_V3F}, {@link #GL_T2F_C3F_V3F}, {@link #GL_T2F_N3F_V3F}, {@link #GL_T2F_C4F_N3F_V3F}, {@link #GL_T4F_C4F_N3F_V4F}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glInterleavedArrays(int format, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glInterleavedArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglInterleavedArrays(format, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glInterleavedArrays(int, int, ByteBuffer)} */
	public static void glInterleavedArrays(int format, int stride, long pointerOffset) {
		long __functionAddress = getInstance().glInterleavedArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, true);
		}
		nglInterleavedArrays(format, stride, pointerOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glInterleavedArrays(int, int, ByteBuffer)} */
	public static void glInterleavedArrays(int format, int stride, ShortBuffer pointer) {
		long __functionAddress = getInstance().glInterleavedArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglInterleavedArrays(format, stride, memAddress(pointer), __functionAddress);
	}

	/** IntBuffer version of: {@link #glInterleavedArrays(int, int, ByteBuffer)} */
	public static void glInterleavedArrays(int format, int stride, IntBuffer pointer) {
		long __functionAddress = getInstance().glInterleavedArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglInterleavedArrays(format, stride, memAddress(pointer), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glInterleavedArrays(int, int, ByteBuffer)} */
	public static void glInterleavedArrays(int format, int stride, FloatBuffer pointer) {
		long __functionAddress = getInstance().glInterleavedArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglInterleavedArrays(format, stride, memAddress(pointer), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glInterleavedArrays(int, int, ByteBuffer)} */
	public static void glInterleavedArrays(int format, int stride, DoubleBuffer pointer) {
		long __functionAddress = getInstance().glInterleavedArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglInterleavedArrays(format, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glIsEnabled ] ---

	/** JNI method for {@link #glIsEnabled(int)} */
	public static native boolean nglIsEnabled(int cap, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsEnabled.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if {@code cap} is currently enabled (as with {@link #glEnable(int)}) or disabled.
	 *
	 * @param cap the enable state to query
	 */
	public static boolean glIsEnabled(int cap) {
		long __functionAddress = getInstance().glIsEnabled;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsEnabled(cap, __functionAddress);
	}

	// --- [ glIsList ] ---

	/** JNI method for {@link #glIsList(int)} */
	public static native boolean nglIsList(int list, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Returns true if the {@code list} is the index of some display list.
	 *
	 * @param list the list index to query
	 */
	public static boolean glIsList(int list) {
		long __functionAddress = getInstance().glIsList;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsList(list, __functionAddress);
	}

	// --- [ glIsTexture ] ---

	/** JNI method for {@link #glIsTexture(int)} */
	public static native boolean nglIsTexture(int texture, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsTexture.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns true if {@code texture} is the name of a texture object.
	 *
	 * @param texture the texture name to query
	 */
	public static boolean glIsTexture(int texture) {
		long __functionAddress = getInstance().glIsTexture;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsTexture(texture, __functionAddress);
	}

	// --- [ glLightModeli ] ---

	/** JNI method for {@link #glLightModeli(int, int)} */
	public static native void nglLightModeli(int pname, int param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Set the integer value of a lighting model parameter.
	 *
	 * @param pname the lighting model parameter to set. One of:<p/>{@link #GL_LIGHT_MODEL_AMBIENT}, {@link #GL_LIGHT_MODEL_LOCAL_VIEWER}, {@link #GL_LIGHT_MODEL_TWO_SIDE}, {@link GL12#GL_LIGHT_MODEL_COLOR_CONTROL}
	 * @param param the parameter value
	 */
	public static void glLightModeli(int pname, int param) {
		long __functionAddress = getInstance().glLightModeli;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightModeli(pname, param, __functionAddress);
	}

	// --- [ glLightModelf ] ---

	/** JNI method for {@link #glLightModelf(int, float)} */
	public static native void nglLightModelf(int pname, float param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glLightModeli(int, int)}.
	 *
	 * @param pname the lighting model parameter to set
	 * @param param the parameter value
	 */
	public static void glLightModelf(int pname, float param) {
		long __functionAddress = getInstance().glLightModelf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightModelf(pname, param, __functionAddress);
	}

	// --- [ glLightModeliv ] ---

	/** JNI method for {@link #glLightModeli(int, ByteBuffer)} */
	public static native void nglLightModeliv(int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glLightModeli(int, int)}.
	 *
	 * @param pname  the lighting model parameter to set
	 * @param params the parameter value
	 */
	public static void glLightModeli(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glLightModeliv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglLightModeliv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glLightModeli(int, ByteBuffer)} */
	public static void glLightModel(int pname, IntBuffer params) {
		long __functionAddress = getInstance().glLightModeliv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglLightModeliv(pname, memAddress(params), __functionAddress);
	}

	// --- [ glLightModelfv ] ---

	/** JNI method for {@link #glLightModelf(int, ByteBuffer)} */
	public static native void nglLightModelfv(int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glLightModelf(int, float)}.
	 *
	 * @param pname  the lighting model parameter to set
	 * @param params the parameter value
	 */
	public static void glLightModelf(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glLightModelfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglLightModelfv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glLightModelf(int, ByteBuffer)} */
	public static void glLightModel(int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glLightModelfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglLightModelfv(pname, memAddress(params), __functionAddress);
	}

	// --- [ glLighti ] ---

	/** JNI method for {@link #glLighti(int, int, int)} */
	public static native void nglLighti(int light, int pname, int param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the integer value of a light parameter.
	 *
	 * @param light the light for which to set the parameter. One of:<p/>{@link #GL_LIGHT0}, GL_LIGHT[1-7]
	 * @param pname the parameter to set. One of:<p/>{@link #GL_AMBIENT}, {@link #GL_DIFFUSE}, {@link #GL_SPECULAR}, {@link #GL_POSITION}, {@link #GL_CONSTANT_ATTENUATION}, {@link #GL_LINEAR_ATTENUATION}, {@link #GL_QUADRATIC_ATTENUATION}, {@link #GL_SPOT_DIRECTION}, {@link #GL_SPOT_EXPONENT}, {@link #GL_SPOT_CUTOFF}
	 * @param param the parameter value
	 */
	public static void glLighti(int light, int pname, int param) {
		long __functionAddress = getInstance().glLighti;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLighti(light, pname, param, __functionAddress);
	}

	// --- [ glLightf ] ---

	/** JNI method for {@link #glLightf(int, int, float)} */
	public static native void nglLightf(int light, int pname, float param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glLighti(int, int, int)}.
	 *
	 * @param light the light for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static void glLightf(int light, int pname, float param) {
		long __functionAddress = getInstance().glLightf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLightf(light, pname, param, __functionAddress);
	}

	// --- [ glLightiv ] ---

	/** JNI method for {@link #glLighti(int, int, ByteBuffer)} */
	public static native void nglLightiv(int light, int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glLighti(int, int, int)}.
	 *
	 * @param light  the light for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glLighti(int light, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glLightiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglLightiv(light, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glLighti(int, int, ByteBuffer)} */
	public static void glLight(int light, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glLightiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglLightiv(light, pname, memAddress(params), __functionAddress);
	}

	// --- [ glLightfv ] ---

	/** JNI method for {@link #glLightf(int, int, ByteBuffer)} */
	public static native void nglLightfv(int light, int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glLightf(int, int, float)}.
	 *
	 * @param light  the light for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glLightf(int light, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glLightfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglLightfv(light, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glLightf(int, int, ByteBuffer)} */
	public static void glLight(int light, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glLightfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglLightfv(light, pname, memAddress(params), __functionAddress);
	}

	// --- [ glLineStipple ] ---

	/** JNI method for {@link #glLineStipple(int, short)} */
	public static native void nglLineStipple(int factor, short pattern, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Defines a line stipple. It determines those fragments that are to be drawn when the line is rasterized. Line stippling may be enabled or disabled using
	 * {@link #glEnable(int)} or {@link #glDisable(int)} with the constant {@link #GL_LINE_STIPPLE}. When disabled, it is as if the line stipple has its default value.
	 *
	 * @param factor  a count that is used to modify the effective line stipple by causing each bit in pattern to be used {@code factor} times. {@code factor} is clamped
	 *                to the range [1, 256].
	 * @param pattern an unsigned short integer whose 16 bits define the stipple pattern
	 */
	public static void glLineStipple(int factor, short pattern) {
		long __functionAddress = getInstance().glLineStipple;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLineStipple(factor, pattern, __functionAddress);
	}

	// --- [ glLineWidth ] ---

	/** JNI method for {@link #glLineWidth(float)} */
	public static native void nglLineWidth(float width, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glLineWidth.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the width of rasterized line segments. The default width is 1.0.
	 *
	 * @param width the line width
	 */
	public static void glLineWidth(float width) {
		long __functionAddress = getInstance().glLineWidth;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLineWidth(width, __functionAddress);
	}

	// --- [ glListBase ] ---

	/** JNI method for {@link #glListBase(int)} */
	public static native void nglListBase(int base, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the display list base.
	 *
	 * @param base the display list base offset
	 */
	public static void glListBase(int base) {
		long __functionAddress = getInstance().glListBase;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglListBase(base, __functionAddress);
	}

	// --- [ glLoadMatrixf ] ---

	/** JNI method for {@link #glLoadMatrixf(ByteBuffer)} */
	public static native void nglLoadMatrixf(long m, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current matrix to a 4 &times; 4 matrix in column-major order.
	 * <p/>
	 * The matrix is stored as 16 consecutive values, i.e. as:
	 * <table border="1" cellspacing="0" cellpadding="2">
	 * 	<tr align="center"><td>a1</td><td>a5</td><td>a9</td><td>a13</td></tr>
	 * 	<tr align="center"><td>a2</td><td>a6</td><td>a10</td><td>a14</td></tr>
	 * 	<tr align="center"><td>a3</td><td>a7</td><td>a11</td><td>a15</td></tr>
	 * 	<tr align="center"><td>a4</td><td>a8</td><td>a12</td><td>a16</td></tr>
	 * </table>
	 * <p/>
	 * This differs from the standard row-major ordering for matrix elements. If the standard ordering is used, all of the subsequent transformation equations
	 * are transposed, and the columns representing vectors become rows.
	 *
	 * @param m the matrix data
	 */
	public static void glLoadMatrixf(ByteBuffer m) {
		long __functionAddress = getInstance().glLoadMatrixf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16 << 2);
		}
		nglLoadMatrixf(memAddress(m), __functionAddress);
	}

	/** Alternative version of: {@link #glLoadMatrixf(ByteBuffer)} */
	public static void glLoadMatrix(FloatBuffer m) {
		long __functionAddress = getInstance().glLoadMatrixf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16);
		}
		nglLoadMatrixf(memAddress(m), __functionAddress);
	}

	// --- [ glLoadMatrixd ] ---

	/** JNI method for {@link #glLoadMatrixd(ByteBuffer)} */
	public static native void nglLoadMatrixd(long m, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glLoadMatrixf(ByteBuffer)}.
	 *
	 * @param m the matrix data
	 */
	public static void glLoadMatrixd(ByteBuffer m) {
		long __functionAddress = getInstance().glLoadMatrixd;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16 << 3);
		}
		nglLoadMatrixd(memAddress(m), __functionAddress);
	}

	/** Alternative version of: {@link #glLoadMatrixd(ByteBuffer)} */
	public static void glLoadMatrix(DoubleBuffer m) {
		long __functionAddress = getInstance().glLoadMatrixd;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16);
		}
		nglLoadMatrixd(memAddress(m), __functionAddress);
	}

	// --- [ glLoadIdentity ] ---

	/** JNI method for {@link #glLoadIdentity()} */
	public static native void nglLoadIdentity(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current matrix to the identity matrix.
	 * <p/>
	 * Calling this function is equivalent to calling {@link #glLoadMatrixf(ByteBuffer)} with the following matrix:
	 * <table border="1" cellspacing="0" cellpadding="2">
	 * 	<tr align="center"><td>1</td><td>0</td><td>0</td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>1</td><td>0</td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>1</td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 */
	public static void glLoadIdentity() {
		long __functionAddress = getInstance().glLoadIdentity;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLoadIdentity(__functionAddress);
	}

	// --- [ glLoadName ] ---

	/** JNI method for {@link #glLoadName(int)} */
	public static native void nglLoadName(int name, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Replaces the value on the top of the selection stack with {@code name}.
	 *
	 * @param name the name to load
	 */
	public static void glLoadName(int name) {
		long __functionAddress = getInstance().glLoadName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLoadName(name, __functionAddress);
	}

	// --- [ glLogicOp ] ---

	/** JNI method for {@link #glLogicOp(int)} */
	public static native void nglLogicOp(int op, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glLogicOp.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the logical framebuffer operation.
	 *
	 * @param op the operation to set. One of:<p/>{@link #GL_CLEAR}, {@link #GL_AND}, {@link #GL_AND_REVERSE}, {@link #GL_COPY}, {@link #GL_AND_INVERTED}, {@link #GL_NOOP}, {@link #GL_XOR}, {@link #GL_OR}, {@link #GL_NOR}, {@link #GL_EQUIV}, {@link #GL_INVERT}, {@link #GL_OR_REVERSE}, {@link #GL_COPY_INVERTED}, {@link #GL_OR_INVERTED}, {@link #GL_NAND}, {@link #GL_SET}
	 */
	public static void glLogicOp(int op) {
		long __functionAddress = getInstance().glLogicOp;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglLogicOp(op, __functionAddress);
	}

	// --- [ glMap1f ] ---

	/** JNI method for {@link #glMap1f(int, float, float, int, int, ByteBuffer)} */
	public static native void nglMap1f(int target, float u1, float u2, int stride, int order, long points, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Defines a polynomial or rational polynomial mapping to produce vertex, normal, texture coordinates and colors. The values so produced are sent on to
	 * further stages of the GL as if they had been provided directly by the client.
	 *
	 * @param target the evaluator target. One of:<p/>{@link #GL_MAP1_VERTEX_3}, {@link #GL_MAP1_VERTEX_4}, {@link #GL_MAP1_COLOR_4}, {@link #GL_MAP1_NORMAL}, {@link #GL_MAP1_TEXTURE_COORD_1}, {@link #GL_MAP1_TEXTURE_COORD_2}, {@link #GL_MAP1_TEXTURE_COORD_3}, {@link #GL_MAP1_TEXTURE_COORD_4}
	 * @param u1     the first endpoint of the pre-image of the map
	 * @param u2     the second endpoint of the pre-image of the map
	 * @param stride the number of values in each block of storage
	 * @param order  the polynomial order
	 * @param points a set of {@code order} blocks of storage containing control points
	 */
	public static void glMap1f(int target, float u1, float u2, int stride, int order, ByteBuffer points) {
		long __functionAddress = getInstance().glMap1f;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(points, (order * stride) << 2);
		}
		nglMap1f(target, u1, u2, stride, order, memAddress(points), __functionAddress);
	}

	/** Alternative version of: {@link #glMap1f(int, float, float, int, int, ByteBuffer)} */
	public static void glMap1(int target, float u1, float u2, int stride, int order, FloatBuffer points) {
		long __functionAddress = getInstance().glMap1f;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(points, order * stride);
		}
		nglMap1f(target, u1, u2, stride, order, memAddress(points), __functionAddress);
	}

	// --- [ glMap1d ] ---

	/** JNI method for {@link #glMap1d(int, double, double, int, int, ByteBuffer)} */
	public static native void nglMap1d(int target, double u1, double u2, int stride, int order, long points, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glMap1f(int, float, float, int, int, ByteBuffer)}.
	 *
	 * @param target the evaluator target
	 * @param u1     the first endpoint of the pre-image of the map
	 * @param u2     the second endpoint of the pre-image of the map
	 * @param stride the number of values in each block of storage
	 * @param order  the polynomial order
	 * @param points a set of {@code order} blocks of storage containing control points
	 */
	public static void glMap1d(int target, double u1, double u2, int stride, int order, ByteBuffer points) {
		long __functionAddress = getInstance().glMap1d;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(points, (stride * order) << 3);
		}
		nglMap1d(target, u1, u2, stride, order, memAddress(points), __functionAddress);
	}

	/** Alternative version of: {@link #glMap1d(int, double, double, int, int, ByteBuffer)} */
	public static void glMap1(int target, double u1, double u2, int stride, int order, DoubleBuffer points) {
		long __functionAddress = getInstance().glMap1d;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(points, stride * order);
		}
		nglMap1d(target, u1, u2, stride, order, memAddress(points), __functionAddress);
	}

	// --- [ glMap2f ] ---

	/** JNI method for {@link #glMap2f(int, float, float, int, int, float, float, int, int, ByteBuffer)} */
	public static native void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Bivariate version of {@link #glMap1f(int, float, float, int, int, ByteBuffer)}.
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
	 * @param points  a set of {@code uorder &times; vorder} blocks of storage containing control points
	 */
	public static void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, ByteBuffer points) {
		long __functionAddress = getInstance().glMap2f;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(points, (ustride * uorder * vstride * vorder) << 2);
		}
		nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points), __functionAddress);
	}

	/** Alternative version of: {@link #glMap2f(int, float, float, int, int, float, float, int, int, ByteBuffer)} */
	public static void glMap2(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
		long __functionAddress = getInstance().glMap2f;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(points, ustride * uorder * vstride * vorder);
		}
		nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points), __functionAddress);
	}

	// --- [ glMap2d ] ---

	/** JNI method for {@link #glMap2d(int, double, double, int, int, double, double, int, int, ByteBuffer)} */
	public static native void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glMap2f(int, float, float, int, int, float, float, int, int, ByteBuffer)}.
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
	 * @param points  a set of {@code uorder &times; vorder} blocks of storage containing control points
	 */
	public static void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, ByteBuffer points) {
		long __functionAddress = getInstance().glMap2d;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(points, (ustride * uorder * vstride * vorder) << 3);
		}
		nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points), __functionAddress);
	}

	/** Alternative version of: {@link #glMap2d(int, double, double, int, int, double, double, int, int, ByteBuffer)} */
	public static void glMap2(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
		long __functionAddress = getInstance().glMap2d;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(points, ustride * uorder * vstride * vorder);
		}
		nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points), __functionAddress);
	}

	// --- [ glMapGrid1f ] ---

	/** JNI method for {@link #glMapGrid1f(int, float, float)} */
	public static native void nglMapGrid1f(int n, float u1, float u2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Defines a one-dimensional grid in the map evaluator domain.
	 *
	 * @param n  the number of partitions of the interval
	 * @param u1 the first interval endpoint
	 * @param u2 the second interval endpoint
	 */
	public static void glMapGrid1f(int n, float u1, float u2) {
		long __functionAddress = getInstance().glMapGrid1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMapGrid1f(n, u1, u2, __functionAddress);
	}

	// --- [ glMapGrid1d ] ---

	/** JNI method for {@link #glMapGrid1d(int, double, double)} */
	public static native void nglMapGrid1d(int n, double u1, double u2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glMapGrid1f(int, float, float)}.
	 *
	 * @param n  the number of partitions of the interval
	 * @param u1 the first interval endpoint
	 * @param u2 the second interval endpoint
	 */
	public static void glMapGrid1d(int n, double u1, double u2) {
		long __functionAddress = getInstance().glMapGrid1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMapGrid1d(n, u1, u2, __functionAddress);
	}

	// --- [ glMapGrid2f ] ---

	/** JNI method for {@link #glMapGrid2f(int, float, float, int, float, float)} */
	public static native void nglMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
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
		long __functionAddress = getInstance().glMapGrid2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMapGrid2f(un, u1, u2, vn, v1, v2, __functionAddress);
	}

	// --- [ glMapGrid2d ] ---

	/** JNI method for {@link #glMapGrid2d(int, double, double, int, double, double)} */
	public static native void nglMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glMapGrid2f(int, float, float, int, float, float)}.
	 *
	 * @param un the number of partitions of the interval in the u-dimension
	 * @param u1 the first u-dimension interval endpoint
	 * @param u2 the second u-dimension interval endpoint
	 * @param vn the number of partitions of the interval in the v-dimension
	 * @param v1 the first v-dimension interval endpoint
	 * @param v2 the second v-dimension interval endpoint
	 */
	public static void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
		long __functionAddress = getInstance().glMapGrid2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMapGrid2d(un, u1, u2, vn, v1, v2, __functionAddress);
	}

	// --- [ glMateriali ] ---

	/** JNI method for {@link #glMateriali(int, int, int)} */
	public static native void nglMateriali(int face, int pname, int param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the integer value of a material parameter.
	 *
	 * @param face  the material face for which to set the parameter. One of:<p/>{@link #GL_FRONT}, {@link #GL_BACK}, {@link #GL_FRONT_AND_BACK}
	 * @param pname the parameter to set. Must be:<p/>{@link #GL_SHININESS}
	 * @param param the parameter value
	 */
	public static void glMateriali(int face, int pname, int param) {
		long __functionAddress = getInstance().glMateriali;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMateriali(face, pname, param, __functionAddress);
	}

	// --- [ glMaterialf ] ---

	/** JNI method for {@link #glMaterialf(int, int, float)} */
	public static native void nglMaterialf(int face, int pname, float param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glMateriali(int, int, int)}.
	 *
	 * @param face  the material face for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static void glMaterialf(int face, int pname, float param) {
		long __functionAddress = getInstance().glMaterialf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMaterialf(face, pname, param, __functionAddress);
	}

	// --- [ glMaterialiv ] ---

	/** JNI method for {@link #glMateriali(int, int, ByteBuffer)} */
	public static native void nglMaterialiv(int face, int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glMateriali(int, int, int)}.
	 *
	 * @param face   the material face for which to set the parameter
	 * @param pname  the parameter to set. One of:<p/>{@link #GL_AMBIENT}, {@link #GL_DIFFUSE}, {@link #GL_AMBIENT_AND_DIFFUSE}, {@link #GL_SPECULAR}, {@link #GL_EMISSION}
	 * @param params the parameter value
	 */
	public static void glMateriali(int face, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glMaterialiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglMaterialiv(face, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glMateriali(int, int, ByteBuffer)} */
	public static void glMaterial(int face, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glMaterialiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglMaterialiv(face, pname, memAddress(params), __functionAddress);
	}

	// --- [ glMaterialfv ] ---

	/** JNI method for {@link #glMaterialf(int, int, ByteBuffer)} */
	public static native void nglMaterialfv(int face, int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glMaterialf(int, int, float)}.
	 *
	 * @param face   the material face for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glMaterialf(int face, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glMaterialfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglMaterialfv(face, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glMaterialf(int, int, ByteBuffer)} */
	public static void glMaterial(int face, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glMaterialfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglMaterialfv(face, pname, memAddress(params), __functionAddress);
	}

	// --- [ glMatrixMode ] ---

	/** JNI method for {@link #glMatrixMode(int)} */
	public static native void nglMatrixMode(int mode, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Set the current matrix mode.
	 *
	 * @param mode the matrix mode. One of:<p/>{@link #GL_MODELVIEW}, {@link #GL_PROJECTION}, {@link #GL_TEXTURE}, {@link #GL_COLOR}
	 */
	public static void glMatrixMode(int mode) {
		long __functionAddress = getInstance().glMatrixMode;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixMode(mode, __functionAddress);
	}

	// --- [ glMultMatrixf ] ---

	/** JNI method for {@link #glMultMatrixf(ByteBuffer)} */
	public static native void nglMultMatrixf(long m, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Multiplies the current matrix with a 4 &times; 4 matrix in column-major order. See {@link #glLoadMatrixf(ByteBuffer)} for details.
	 *
	 * @param m the matrix data
	 */
	public static void glMultMatrixf(ByteBuffer m) {
		long __functionAddress = getInstance().glMultMatrixf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16 << 2);
		}
		nglMultMatrixf(memAddress(m), __functionAddress);
	}

	/** Alternative version of: {@link #glMultMatrixf(ByteBuffer)} */
	public static void glMultMatrix(FloatBuffer m) {
		long __functionAddress = getInstance().glMultMatrixf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16);
		}
		nglMultMatrixf(memAddress(m), __functionAddress);
	}

	// --- [ glMultMatrixd ] ---

	/** JNI method for {@link #glMultMatrixd(ByteBuffer)} */
	public static native void nglMultMatrixd(long m, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glMultMatrixf(ByteBuffer)}.
	 *
	 * @param m the matrix data
	 */
	public static void glMultMatrixd(ByteBuffer m) {
		long __functionAddress = getInstance().glMultMatrixd;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16 << 3);
		}
		nglMultMatrixd(memAddress(m), __functionAddress);
	}

	/** Alternative version of: {@link #glMultMatrixd(ByteBuffer)} */
	public static void glMultMatrix(DoubleBuffer m) {
		long __functionAddress = getInstance().glMultMatrixd;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 16);
		}
		nglMultMatrixd(memAddress(m), __functionAddress);
	}

	// --- [ glFrustum ] ---

	/** JNI method for {@link #glFrustum(double, double, double, double, double, double)} */
	public static native void nglFrustum(double l, double r, double b, double t, double n, double f, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Manipulates the current matrix with a matrix that produces perspective projection, in such a way that the coordinates {@code (lb &ndash; n)}<sup>T</sup>
	 * and <code>(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
	 * window, respectively (assuming that the eye is located at <code>(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping
	 * plane.
	 * <p/>
	 * Calling this function is equivalent to calling {@link #glMultMatrixf(ByteBuffer)} with the following matrix:
	 * <table border="1" cellspacing="0" cellpadding="2">
	 * 	<tr align="center"><td>2n / (r - l)</td><td>0</td><td>(r + l) / (r - l)</td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>2n / (t - b)</td><td>(t + b) / (t - b)</td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>- (f + n) / (f - n)</td><td>- (2fn) / (f - n)</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>-1</td><td>0</td></tr>
	 * </table>
	 *
	 * @param l the left frustum plane
	 * @param r the right frustum plane
	 * @param b the bottom frustum plane
	 * @param t the top frustum plane
	 * @param n the near frustum plane
	 * @param f the far frustum plane
	 */
	public static void glFrustum(double l, double r, double b, double t, double n, double f) {
		long __functionAddress = getInstance().glFrustum;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFrustum(l, r, b, t, n, f, __functionAddress);
	}

	// --- [ glNewList ] ---

	/** JNI method for {@link #glNewList(int, int)} */
	public static native void nglNewList(int n, int mode, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Begins the definition of a display list.
	 *
	 * @param n    a positive integer to which the display list that follows is assigned
	 * @param mode a symbolic constant that controls the behavior of the GL during display list creation. One of:<p/>{@link #GL_COMPILE}, {@link #GL_COMPILE_AND_EXECUTE}
	 */
	public static void glNewList(int n, int mode) {
		long __functionAddress = getInstance().glNewList;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNewList(n, mode, __functionAddress);
	}

	// --- [ glEndList ] ---

	/** JNI method for {@link #glEndList()} */
	public static native void nglEndList(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Ends the definition of GL commands to be placed in a display list. It is only when {@code EndList} occurs that the specified display list is actually
	 * associated with the index indicated with {@link #glNewList(int, int)}.
	 */
	public static void glEndList() {
		long __functionAddress = getInstance().glEndList;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglEndList(__functionAddress);
	}

	// --- [ glNormal3f ] ---

	/** JNI method for {@link #glNormal3f(float, float, float)} */
	public static native void nglNormal3f(float nx, float ny, float nz, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current normal.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3f(float nx, float ny, float nz) {
		long __functionAddress = getInstance().glNormal3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3f(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3b ] ---

	/** JNI method for {@link #glNormal3b(byte, byte, byte)} */
	public static native void nglNormal3b(byte nx, byte ny, byte nz, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Byte version of {@link #glNormal3f(float, float, float)}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3b(byte nx, byte ny, byte nz) {
		long __functionAddress = getInstance().glNormal3b;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3b(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3s ] ---

	/** JNI method for {@link #glNormal3s(short, short, short)} */
	public static native void nglNormal3s(short nx, short ny, short nz, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glNormal3f(float, float, float)}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3s(short nx, short ny, short nz) {
		long __functionAddress = getInstance().glNormal3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3s(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3i ] ---

	/** JNI method for {@link #glNormal3i(int, int, int)} */
	public static native void nglNormal3i(int nx, int ny, int nz, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glNormal3f(float, float, float)}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3i(int nx, int ny, int nz) {
		long __functionAddress = getInstance().glNormal3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3i(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3d ] ---

	/** JNI method for {@link #glNormal3d(double, double, double)} */
	public static native void nglNormal3d(double nx, double ny, double nz, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glNormal3f(float, float, float)}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static void glNormal3d(double nx, double ny, double nz) {
		long __functionAddress = getInstance().glNormal3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormal3d(nx, ny, nz, __functionAddress);
	}

	// --- [ glNormal3fv ] ---

	/** JNI method for {@link #glNormal3f(ByteBuffer)} */
	public static native void nglNormal3fv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glNormal3f(float, float, float)}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3f(ByteBuffer v) {
		long __functionAddress = getInstance().glNormal3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglNormal3fv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glNormal3f(ByteBuffer)} */
	public static void glNormal3(FloatBuffer v) {
		long __functionAddress = getInstance().glNormal3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglNormal3fv(memAddress(v), __functionAddress);
	}

	// --- [ glNormal3bv ] ---

	/** JNI method for {@link #glNormal3b(ByteBuffer)} */
	public static native void nglNormal3bv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glNormal3b(byte, byte, byte)}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3b(ByteBuffer v) {
		long __functionAddress = getInstance().glNormal3bv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglNormal3bv(memAddress(v), __functionAddress);
	}

	// --- [ glNormal3sv ] ---

	/** JNI method for {@link #glNormal3s(ByteBuffer)} */
	public static native void nglNormal3sv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glNormal3s(short, short, short)}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3s(ByteBuffer v) {
		long __functionAddress = getInstance().glNormal3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 1);
		}
		nglNormal3sv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glNormal3s(ByteBuffer)} */
	public static void glNormal3(ShortBuffer v) {
		long __functionAddress = getInstance().glNormal3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglNormal3sv(memAddress(v), __functionAddress);
	}

	// --- [ glNormal3iv ] ---

	/** JNI method for {@link #glNormal3i(ByteBuffer)} */
	public static native void nglNormal3iv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glNormal3i(int, int, int)}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3i(ByteBuffer v) {
		long __functionAddress = getInstance().glNormal3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglNormal3iv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glNormal3i(ByteBuffer)} */
	public static void glNormal3(IntBuffer v) {
		long __functionAddress = getInstance().glNormal3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglNormal3iv(memAddress(v), __functionAddress);
	}

	// --- [ glNormal3dv ] ---

	/** JNI method for {@link #glNormal3d(ByteBuffer)} */
	public static native void nglNormal3dv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glNormal3d(double, double, double)}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3d(ByteBuffer v) {
		long __functionAddress = getInstance().glNormal3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 3);
		}
		nglNormal3dv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glNormal3d(ByteBuffer)} */
	public static void glNormal3(DoubleBuffer v) {
		long __functionAddress = getInstance().glNormal3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglNormal3dv(memAddress(v), __functionAddress);
	}

	// --- [ glNormalPointer ] ---

	/** JNI method for {@link #glNormalPointer(int, int, ByteBuffer)} */
	public static native void nglNormalPointer(int type, int stride, long pointer, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies the location and organization of a normal array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<p/>{@link #GL_BYTE}, {@link #GL_SHORT}, {@link #GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link #GL_FLOAT}, {@link #GL_DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the normal array data
	 */
	public static void glNormalPointer(int type, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glNormalPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglNormalPointer(type, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glNormalPointer(int, int, ByteBuffer)} */
	public static void glNormalPointer(int type, int stride, long pointerOffset) {
		long __functionAddress = getInstance().glNormalPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, true);
		}
		nglNormalPointer(type, stride, pointerOffset, __functionAddress);
	}

	/** GL_BYTE version of: {@link #glNormalPointer(int, int, ByteBuffer)} */
	public static void glNormalPointer(int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glNormalPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglNormalPointer(GL11.GL_BYTE, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_SHORT version of: {@link #glNormalPointer(int, int, ByteBuffer)} */
	public static void glNormalPointer(int stride, ShortBuffer pointer) {
		long __functionAddress = getInstance().glNormalPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglNormalPointer(GL11.GL_SHORT, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_FLOAT version of: {@link #glNormalPointer(int, int, ByteBuffer)} */
	public static void glNormalPointer(int stride, FloatBuffer pointer) {
		long __functionAddress = getInstance().glNormalPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglNormalPointer(GL11.GL_FLOAT, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glOrtho ] ---

	/** JNI method for {@link #glOrtho(double, double, double, double, double, double)} */
	public static native void nglOrtho(double l, double r, double b, double t, double n, double f, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Manipulates the current matrix with a matrix that produces parallel projection, in such a way that the coordinates <code>(lb &ndash; n)<sup>T</sup></code>
	 * and <code>(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
	 * window, respectively (assuming that the eye is located at <code>(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping
	 * plane.
	 * <p/>
	 * Calling this function is equivalent to calling {@link #glMultMatrixf(ByteBuffer)} with the following matrix:
	 * <table border="1" cellspacing="0" cellpadding="2">
	 * 	<tr align="center"><td>2 / (r - l)</td><td>0</td><td>0</td><td>- (r + l) / (r - l)</td></tr>
	 * 	<tr align="center"><td>0</td><td>2 / (t - b)</td><td>0</td><td>- (t + b) / (t - b)</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>- 2 / (f - n)</td><td>- (f + n) / (f - n)</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 *
	 * @param l the left frustum plane
	 * @param r the right frustum plane
	 * @param b the bottom frustum plane
	 * @param t the top frustum plane
	 * @param n the near frustum plane
	 * @param f the far frustum plane
	 */
	public static void glOrtho(double l, double r, double b, double t, double n, double f) {
		long __functionAddress = getInstance().glOrtho;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglOrtho(l, r, b, t, n, f, __functionAddress);
	}

	// --- [ glPassThrough ] ---

	/** JNI method for {@link #glPassThrough(float)} */
	public static native void nglPassThrough(float token, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Inserts a marker when the GL is in feeback mode. {@code token} is returned as if it were a primitive; it is indicated with its own unique identifying
	 * value. The ordering of any {@code PassThrough} commands with respect to primitive specification is maintained by feedback. {@code PassThrough} may
	 * not occur between {@link #glBegin(int)} and {@link #glEnd()}.
	 *
	 * @param token the marker value to insert
	 */
	public static void glPassThrough(float token) {
		long __functionAddress = getInstance().glPassThrough;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPassThrough(token, __functionAddress);
	}

	// --- [ glPixelMapfv ] ---

	/** JNI method for {@link #glPixelMapf(int, int, ByteBuffer)} */
	public static native void nglPixelMapfv(int map, int size, long values, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets a pixel map lookup table.
	 *
	 * @param map    the map to set. One of:<p/>{@link #GL_PIXEL_MAP_I_TO_I}, {@link #GL_PIXEL_MAP_S_TO_S}, {@link #GL_PIXEL_MAP_I_TO_R}, {@link #GL_PIXEL_MAP_I_TO_G}, {@link #GL_PIXEL_MAP_I_TO_B}, {@link #GL_PIXEL_MAP_I_TO_A}, {@link #GL_PIXEL_MAP_R_TO_R}, {@link #GL_PIXEL_MAP_G_TO_G}, {@link #GL_PIXEL_MAP_B_TO_B}, {@link #GL_PIXEL_MAP_A_TO_A}
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapf(int map, int size, ByteBuffer values) {
		long __functionAddress = getInstance().glPixelMapfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, size << 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglPixelMapfv(map, size, memAddress(values), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glPixelMapf(int, int, ByteBuffer)} */
	public static void glPixelMapf(int map, int size, long valuesOffset) {
		long __functionAddress = getInstance().glPixelMapfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglPixelMapfv(map, size, valuesOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glPixelMapf(int, int, ByteBuffer)} */
	public static void glPixelMap(int map, FloatBuffer values) {
		long __functionAddress = getInstance().glPixelMapfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglPixelMapfv(map, values.remaining(), memAddress(values), __functionAddress);
	}

	// --- [ glPixelMapusv ] ---

	/** JNI method for {@link #glPixelMapus(int, int, ByteBuffer)} */
	public static native void nglPixelMapusv(int map, int size, long values, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned short version of {@link #glPixelMapf(int, int, ByteBuffer)}.
	 *
	 * @param map    the map to set
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapus(int map, int size, ByteBuffer values) {
		long __functionAddress = getInstance().glPixelMapusv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, size << 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglPixelMapusv(map, size, memAddress(values), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glPixelMapus(int, int, ByteBuffer)} */
	public static void glPixelMapus(int map, int size, long valuesOffset) {
		long __functionAddress = getInstance().glPixelMapusv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglPixelMapusv(map, size, valuesOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glPixelMapus(int, int, ByteBuffer)} */
	public static void glPixelMapu(int map, ShortBuffer values) {
		long __functionAddress = getInstance().glPixelMapusv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglPixelMapusv(map, values.remaining(), memAddress(values), __functionAddress);
	}

	// --- [ glPixelMapuiv ] ---

	/** JNI method for {@link #glPixelMapui(int, int, ByteBuffer)} */
	public static native void nglPixelMapuiv(int map, int size, long values, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Unsigned integer version of {@link #glPixelMapf(int, int, ByteBuffer)}.
	 *
	 * @param map    the map to set
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapui(int map, int size, ByteBuffer values) {
		long __functionAddress = getInstance().glPixelMapuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, size << 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglPixelMapuiv(map, size, memAddress(values), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glPixelMapui(int, int, ByteBuffer)} */
	public static void glPixelMapui(int map, int size, long valuesOffset) {
		long __functionAddress = getInstance().glPixelMapuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglPixelMapuiv(map, size, valuesOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glPixelMapui(int, int, ByteBuffer)} */
	public static void glPixelMapu(int map, IntBuffer values) {
		long __functionAddress = getInstance().glPixelMapuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglPixelMapuiv(map, values.remaining(), memAddress(values), __functionAddress);
	}

	// --- [ glPixelStorei ] ---

	/** JNI method for {@link #glPixelStorei(int, int)} */
	public static native void nglPixelStorei(int pname, int param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPixelStorei.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the integer value of a pixel store parameter.
	 *
	 * @param pname the pixel store parameter to set. One of:<p/>{@link #GL_UNPACK_SWAP_BYTES}, {@link #GL_UNPACK_LSB_FIRST}, {@link #GL_UNPACK_ROW_LENGTH}, {@link #GL_UNPACK_SKIP_ROWS}, {@link #GL_UNPACK_SKIP_PIXELS}, {@link #GL_UNPACK_ALIGNMENT}, {@link GL12#GL_UNPACK_IMAGE_HEIGHT}, {@link GL12#GL_UNPACK_SKIP_IMAGES}, {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_WIDTH}, {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_HEIGHT}, {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_DEPTH}, {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_SIZE}
	 * @param param the parameter value
	 */
	public static void glPixelStorei(int pname, int param) {
		long __functionAddress = getInstance().glPixelStorei;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelStorei(pname, param, __functionAddress);
	}

	// --- [ glPixelStoref ] ---

	/** JNI method for {@link #glPixelStoref(int, int)} */
	public static native void nglPixelStoref(int pname, int param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPixelStoref.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glPixelStorei(int, int)}.
	 *
	 * @param pname the pixel store parameter to set
	 * @param param the parameter value
	 */
	public static void glPixelStoref(int pname, int param) {
		long __functionAddress = getInstance().glPixelStoref;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelStoref(pname, param, __functionAddress);
	}

	// --- [ glPixelTransferi ] ---

	/** JNI method for {@link #glPixelTransferi(int, int)} */
	public static native void nglPixelTransferi(int pname, int param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the integer value of a pixel transfer parameter.
	 *
	 * @param pname the pixel transfer parameter to set. One of:<p/>{@link #GL_MAP_COLOR}, {@link #GL_MAP_STENCIL}, {@link #GL_INDEX_SHIFT}, {@link #GL_INDEX_OFFSET}, {@link #GL_RED_SCALE}, {@link #GL_GREEN_SCALE}, {@link #GL_BLUE_SCALE}, {@link #GL_ALPHA_SCALE}, {@link #GL_DEPTH_SCALE}, {@link #GL_RED_BIAS}, {@link #GL_GREEN_BIAS}, {@link #GL_BLUE_BIAS}, {@link #GL_ALPHA_BIAS}, {@link #GL_DEPTH_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_RED_SCALE}, {@link ARBImaging#GL_POST_CONVOLUTION_RED_BIAS}, {@link ARBImaging#GL_POST_COLOR_MATRIX_RED_SCALE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_RED_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_GREEN_SCALE}, {@link ARBImaging#GL_POST_CONVOLUTION_GREEN_BIAS}, {@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_SCALE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_BLUE_SCALE}, {@link ARBImaging#GL_POST_CONVOLUTION_BLUE_BIAS}, {@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_SCALE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_SCALE}, {@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_BIAS}, {@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_SCALE}, {@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_BIAS}
	 * @param param the parameter value
	 */
	public static void glPixelTransferi(int pname, int param) {
		long __functionAddress = getInstance().glPixelTransferi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelTransferi(pname, param, __functionAddress);
	}

	// --- [ glPixelTransferf ] ---

	/** JNI method for {@link #glPixelTransferf(int, float)} */
	public static native void nglPixelTransferf(int pname, float param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glPixelTransferi(int, int)}.
	 *
	 * @param pname the pixel transfer parameter to set
	 * @param param the parameter value
	 */
	public static void glPixelTransferf(int pname, float param) {
		long __functionAddress = getInstance().glPixelTransferf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelTransferf(pname, param, __functionAddress);
	}

	// --- [ glPixelZoom ] ---

	/** JNI method for {@link #glPixelZoom(float, float)} */
	public static native void nglPixelZoom(float xfactor, float yfactor, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Controls the conversion of a group of fragments.
	 * <p/>
	 * Let (x<sub>rp</sub>, y<sub>rp</sub>) be the current raster position. If a particular group is the n<sup>th</sup> in a row and belongs to the
	 * m<sup>th</sup> row, consider the region in window coordinates bounded by the rectangle with corners
	 * <p/>
	 * (x<sub>rp</sub> + z<sub>x</sub>n, y<sub>rp</sub> + z<sub>y</sub>m) and (x<sub>rp</sub> + z<sub>x</sub>(n + 1), y<sub>rp</sub> + z<sub>y</sub>(m + 1))
	 * <p/>
	 * (either z<sub>x</sub> or z<sub>y</sub> may be negative). A fragment representing group {@code (n, m)} is produced for each framebuffer pixel inside, or
	 * on the bottom or left boundary, of this rectangle.
	 *
	 * @param xfactor the z<sub>x</sub> factor
	 * @param yfactor the z<sub>y</sub> factor
	 */
	public static void glPixelZoom(float xfactor, float yfactor) {
		long __functionAddress = getInstance().glPixelZoom;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPixelZoom(xfactor, yfactor, __functionAddress);
	}

	// --- [ glPointSize ] ---

	/** JNI method for {@link #glPointSize(float)} */
	public static native void nglPointSize(float size, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPointSize.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Controls the rasterization of points if no vertex, tessellation control, tessellation evaluation, or geometry shader is active. The default point size is 1.0.
	 *
	 * @param size the request size of a point
	 */
	public static void glPointSize(float size) {
		long __functionAddress = getInstance().glPointSize;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPointSize(size, __functionAddress);
	}

	// --- [ glPolygonMode ] ---

	/** JNI method for {@link #glPolygonMode(int, int)} */
	public static native void nglPolygonMode(int face, int mode, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPolygonMode.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Controls the interpretation of polygons for rasterization.
	 * <p/>
	 * {@link #GL_FILL} is the default mode of polygon rasterization. Note that these modes affect only the final rasterization of polygons: in particular, a
	 * polygon's vertices are lit, and the polygon is clipped and possibly culled before these modes are applied. Polygon antialiasing applies only to the
	 * {@link #GL_FILL} state of PolygonMode. For {@link #GL_POINT} or {@link #GL_LINE}, point antialiasing or line segment antialiasing, respectively, apply.
	 *
	 * @param face the face for which to set the rasterizing method. One of:<p/>{@link #GL_FRONT}, {@link #GL_BACK}, {@link #GL_FRONT_AND_BACK}
	 * @param mode the rasterization mode. One of:<p/>{@link #GL_POINT}, {@link #GL_LINE}, {@link #GL_FILL}
	 */
	public static void glPolygonMode(int face, int mode) {
		long __functionAddress = getInstance().glPolygonMode;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPolygonMode(face, mode, __functionAddress);
	}

	// --- [ glPolygonOffset ] ---

	/** JNI method for {@link #glPolygonOffset(float, float)} */
	public static native void nglPolygonOffset(float factor, float units, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPolygonOffset.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * The depth values of all fragments generated by the rasterization of a polygon may be offset by a single value that is computed for that polygon. This
	 * function determines that value.
	 * <p/>
	 * {@code factor} scales the maximum depth slope of the polygon, and {@code units} scales an implementation-dependent constant that relates to the usable
	 * resolution of the depth buffer. The resulting values are summed to produce the polygon offset value.
	 *
	 * @param factor the maximum depth slope factor
	 * @param units  the constant scale
	 */
	public static void glPolygonOffset(float factor, float units) {
		long __functionAddress = getInstance().glPolygonOffset;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPolygonOffset(factor, units, __functionAddress);
	}

	// --- [ glPolygonStipple ] ---

	/** JNI method for {@link #glPolygonStipple(ByteBuffer)} */
	public static native void nglPolygonStipple(long pattern, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Defines a polygon stipple. It works much the same way as {@link #glLineStipple(int, short)}, masking out certain fragments produced by rasterization so that they
	 * are not sent to the next stage of the GL. This is the case regardless of the state of polygon antialiasing.
	 * <p/>
	 * If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a rasterized polygon fragment, then that fragment is sent to the next stage of the GL
	 * if and only if the bit of the pattern (x<sub>w</sub> mod 32, y<sub>w</sub> mod 32) is 1.
	 * <p/>
	 * Polygon stippling may be enabled or disabled with {@link #glEnable(int)} or {@link #glDisable(int)} using the constant {@link #GL_POLYGON_STIPPLE}. When disabled,
	 * it is as if the stipple pattern were all ones.
	 *
	 * @param pattern a pointer to memory into which a 32 &times; 32 pattern is packed
	 */
	public static void glPolygonStipple(ByteBuffer pattern) {
		long __functionAddress = getInstance().glPolygonStipple;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglPolygonStipple(memAddress(pattern), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glPolygonStipple(ByteBuffer)} */
	public static void glPolygonStipple(long patternOffset) {
		long __functionAddress = getInstance().glPolygonStipple;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglPolygonStipple(patternOffset, __functionAddress);
	}

	// --- [ glPushAttrib ] ---

	/** JNI method for {@link #glPushAttrib(int)} */
	public static native void nglPushAttrib(int mask, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the server attribute stack. Each constant refers to a
	 * group of state variables.
	 * <p/>
	 * Bits set in mask that do not correspond to an attribute group are ignored. The special mask value {@link #GL_ALL_ATTRIB_BITS} may be used to push all
	 * stackable server state.
	 * <p/>
	 * A {@link #GL_STACK_OVERFLOW} error is generated if {@code PushAttrib} is called and the attribute stack depth is equal to the value of
	 * {@link #GL_MAX_ATTRIB_STACK_DEPTH}.
	 *
	 * @param mask the state variables to push. One of:<p/>{@link #GL_ACCUM_BUFFER_BIT}, {@link #GL_COLOR_BUFFER_BIT}, {@link #GL_CURRENT_BIT}, {@link #GL_DEPTH_BUFFER_BIT}, {@link #GL_ENABLE_BIT}, {@link #GL_EVAL_BIT}, {@link #GL_FOG_BIT}, {@link #GL_HINT_BIT}, {@link #GL_LIGHTING_BIT}, {@link #GL_LINE_BIT}, {@link #GL_LIST_BIT}, {@link GL13#GL_MULTISAMPLE_BIT}, {@link #GL_PIXEL_MODE_BIT}, {@link #GL_POINT_BIT}, {@link #GL_POLYGON_BIT}, {@link #GL_POLYGON_STIPPLE_BIT}, {@link #GL_SCISSOR_BIT}, {@link #GL_STENCIL_BUFFER_BIT}, {@link #GL_TEXTURE_BIT}, {@link #GL_TRANSFORM_BIT}, {@link #GL_VIEWPORT_BIT}, {@link #GL_ALL_ATTRIB_BITS}
	 */
	public static void glPushAttrib(int mask) {
		long __functionAddress = getInstance().glPushAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushAttrib(mask, __functionAddress);
	}

	// --- [ glPushClientAttrib ] ---

	/** JNI method for {@link #glPushClientAttrib(int)} */
	public static native void nglPushClientAttrib(int mask, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Takes a bitwise OR of symbolic constants indicating which groups of state variables to push onto the client attribute stack. Each constant refers to a
	 * group of state variables.
	 * <p/>
	 * Bits set in mask that do not correspond to an attribute group are ignored. The special mask value {@link #GL_CLIENT_ALL_ATTRIB_BITS} may be used to push
	 * all stackable client state.
	 * <p/>
	 * A {@link #GL_STACK_OVERFLOW} error is generated if {@code PushAttrib} is called and the client attribute stack depth is equal to the value of
	 * {@link #GL_MAX_CLIENT_ATTRIB_STACK_DEPTH}.
	 *
	 * @param mask the state variables to push. One of:<p/>{@link #GL_CLIENT_VERTEX_ARRAY_BIT}, {@link #GL_CLIENT_PIXEL_STORE_BIT}, {@link #GL_CLIENT_ALL_ATTRIB_BITS}
	 */
	public static void glPushClientAttrib(int mask) {
		long __functionAddress = getInstance().glPushClientAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushClientAttrib(mask, __functionAddress);
	}

	// --- [ glPopAttrib ] ---

	/** JNI method for {@link #glPopAttrib()} */
	public static native void nglPopAttrib(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Resets the values of those state variables that were saved with the last {@link #glPushAttrib(int)}. Those not saved remain unchanged.
	 */
	public static void glPopAttrib() {
		long __functionAddress = getInstance().glPopAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPopAttrib(__functionAddress);
	}

	// --- [ glPopClientAttrib ] ---

	/** JNI method for {@link #glPopClientAttrib()} */
	public static native void nglPopClientAttrib(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Resets the values of those state variables that were saved with the last {@link #glPushClientAttrib(int)}. Those not saved remain unchanged.
	 */
	public static void glPopClientAttrib() {
		long __functionAddress = getInstance().glPopClientAttrib;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPopClientAttrib(__functionAddress);
	}

	// --- [ glPopMatrix ] ---

	/** JNI method for {@link #glPopMatrix()} */
	public static native void nglPopMatrix(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pops the top entry off the current matrix stack, replacing the current matrix with the matrix that was the second entry in the stack.
	 */
	public static void glPopMatrix() {
		long __functionAddress = getInstance().glPopMatrix;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPopMatrix(__functionAddress);
	}

	// --- [ glPopName ] ---

	/** JNI method for {@link #glPopName()} */
	public static native void nglPopName(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pops one name off the top of the selection name stack.
	 */
	public static void glPopName() {
		long __functionAddress = getInstance().glPopName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPopName(__functionAddress);
	}

	// --- [ glPrioritizeTextures ] ---

	/** JNI method for {@link #glPrioritizeTextures(int, ByteBuffer, ByteBuffer)} */
	public static native void nglPrioritizeTextures(int n, long textures, long priorities, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the priority of texture objects. Each priority value is clamped to the range [0, 1] before it is assigned. Zero indicates the lowest priority, with
	 * the least likelihood of being resident. One indicates the highest priority, with the greatest likelihood of being resident.
	 *
	 * @param n          the number of texture object priorities to set
	 * @param textures   an array of texture object names
	 * @param priorities an array of texture object priorities
	 */
	public static void glPrioritizeTextures(int n, ByteBuffer textures, ByteBuffer priorities) {
		long __functionAddress = getInstance().glPrioritizeTextures;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(textures, n << 2);
			checkBuffer(priorities, n << 2);
		}
		nglPrioritizeTextures(n, memAddress(textures), memAddress(priorities), __functionAddress);
	}

	/** Alternative version of: {@link #glPrioritizeTextures(int, ByteBuffer, ByteBuffer)} */
	public static void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities) {
		long __functionAddress = getInstance().glPrioritizeTextures;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(priorities, textures.remaining());
		}
		nglPrioritizeTextures(textures.remaining(), memAddress(textures), memAddress(priorities), __functionAddress);
	}

	// --- [ glPushMatrix ] ---

	/** JNI method for {@link #glPushMatrix()} */
	public static native void nglPushMatrix(long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pushes the current matrix stack down by one, duplicating the current matrix in both the top of the stack and the entry below it.
	 */
	public static void glPushMatrix() {
		long __functionAddress = getInstance().glPushMatrix;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushMatrix(__functionAddress);
	}

	// --- [ glPushName ] ---

	/** JNI method for {@link #glPushName(int)} */
	public static native void nglPushName(int name, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Causes {@code name} to be pushed onto the selection name stack.
	 *
	 * @param name the name to push
	 */
	public static void glPushName(int name) {
		long __functionAddress = getInstance().glPushName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPushName(name, __functionAddress);
	}

	// --- [ glRasterPos2i ] ---

	/** JNI method for {@link #glRasterPos2i(int, int)} */
	public static native void nglRasterPos2i(int x, int y, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the two-dimensional current raster position. {@code z} is implicitly set to 0 and {@code w} implicitly set to 1.
	 * <p/>
	 * The coordinates are treated as if they were specified in a Vertex command. If a vertex shader is active, this vertex shader is executed using the x, y,
	 * z, and w coordinates as the object coordinates of the vertex. Otherwise, the x, y, z, and w coordinates are transformed by the current model-view and
	 * projection matrices. These coordinates, along with current values, are used to generate primary and secondary colors and texture coordinates just as is
	 * done for a vertex. The colors and texture coordinates so produced replace the colors and texture coordinates stored in the current raster position's
	 * associated data.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static void glRasterPos2i(int x, int y) {
		long __functionAddress = getInstance().glRasterPos2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2i(x, y, __functionAddress);
	}

	// --- [ glRasterPos2s ] ---

	/** JNI method for {@link #glRasterPos2s(short, short)} */
	public static native void nglRasterPos2s(short x, short y, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glRasterPos2i(int, int)}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static void glRasterPos2s(short x, short y) {
		long __functionAddress = getInstance().glRasterPos2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2s(x, y, __functionAddress);
	}

	// --- [ glRasterPos2f ] ---

	/** JNI method for {@link #glRasterPos2f(float, float)} */
	public static native void nglRasterPos2f(float x, float y, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glRasterPos2i(int, int)}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static void glRasterPos2f(float x, float y) {
		long __functionAddress = getInstance().glRasterPos2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2f(x, y, __functionAddress);
	}

	// --- [ glRasterPos2d ] ---

	/** JNI method for {@link #glRasterPos2d(double, double)} */
	public static native void nglRasterPos2d(double x, double y, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glRasterPos2i(int, int)}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static void glRasterPos2d(double x, double y) {
		long __functionAddress = getInstance().glRasterPos2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos2d(x, y, __functionAddress);
	}

	// --- [ glRasterPos2iv ] ---

	/** JNI method for {@link #glRasterPos2i(ByteBuffer)} */
	public static native void nglRasterPos2iv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos2i(int, int)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2i(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2 << 2);
		}
		nglRasterPos2iv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos2i(ByteBuffer)} */
	public static void glRasterPos2(IntBuffer coords) {
		long __functionAddress = getInstance().glRasterPos2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2);
		}
		nglRasterPos2iv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos2sv ] ---

	/** JNI method for {@link #glRasterPos2s(ByteBuffer)} */
	public static native void nglRasterPos2sv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos2s(short, short)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2s(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2 << 1);
		}
		nglRasterPos2sv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos2s(ByteBuffer)} */
	public static void glRasterPos2(ShortBuffer coords) {
		long __functionAddress = getInstance().glRasterPos2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2);
		}
		nglRasterPos2sv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos2fv ] ---

	/** JNI method for {@link #glRasterPos2f(ByteBuffer)} */
	public static native void nglRasterPos2fv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos2f(float, float)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2f(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2 << 2);
		}
		nglRasterPos2fv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos2f(ByteBuffer)} */
	public static void glRasterPos2(FloatBuffer coords) {
		long __functionAddress = getInstance().glRasterPos2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2);
		}
		nglRasterPos2fv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos2dv ] ---

	/** JNI method for {@link #glRasterPos2d(ByteBuffer)} */
	public static native void nglRasterPos2dv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos2d(double, double)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2d(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2 << 3);
		}
		nglRasterPos2dv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos2d(ByteBuffer)} */
	public static void glRasterPos2(DoubleBuffer coords) {
		long __functionAddress = getInstance().glRasterPos2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2);
		}
		nglRasterPos2dv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos3i ] ---

	/** JNI method for {@link #glRasterPos3i(int, int, int)} */
	public static native void nglRasterPos3i(int x, int y, int z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the three-dimensional current raster position. {@code w} is implicitly set to 1. See {@link #glRasterPos2i(int, int)} for more details.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static void glRasterPos3i(int x, int y, int z) {
		long __functionAddress = getInstance().glRasterPos3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3i(x, y, z, __functionAddress);
	}

	// --- [ glRasterPos3s ] ---

	/** JNI method for {@link #glRasterPos3s(short, short, short)} */
	public static native void nglRasterPos3s(short x, short y, short z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glRasterPos3i(int, int, int)}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static void glRasterPos3s(short x, short y, short z) {
		long __functionAddress = getInstance().glRasterPos3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3s(x, y, z, __functionAddress);
	}

	// --- [ glRasterPos3f ] ---

	/** JNI method for {@link #glRasterPos3f(float, float, float)} */
	public static native void nglRasterPos3f(float x, float y, float z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glRasterPos3i(int, int, int)}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static void glRasterPos3f(float x, float y, float z) {
		long __functionAddress = getInstance().glRasterPos3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3f(x, y, z, __functionAddress);
	}

	// --- [ glRasterPos3d ] ---

	/** JNI method for {@link #glRasterPos3d(double, double, double)} */
	public static native void nglRasterPos3d(double x, double y, double z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glRasterPos3i(int, int, int)}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static void glRasterPos3d(double x, double y, double z) {
		long __functionAddress = getInstance().glRasterPos3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos3d(x, y, z, __functionAddress);
	}

	// --- [ glRasterPos3iv ] ---

	/** JNI method for {@link #glRasterPos3i(ByteBuffer)} */
	public static native void nglRasterPos3iv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos3i(int, int, int)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3i(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3 << 2);
		}
		nglRasterPos3iv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos3i(ByteBuffer)} */
	public static void glRasterPos3(IntBuffer coords) {
		long __functionAddress = getInstance().glRasterPos3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3);
		}
		nglRasterPos3iv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos3sv ] ---

	/** JNI method for {@link #glRasterPos3s(ByteBuffer)} */
	public static native void nglRasterPos3sv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos3s(short, short, short)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3s(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3 << 1);
		}
		nglRasterPos3sv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos3s(ByteBuffer)} */
	public static void glRasterPos3(ShortBuffer coords) {
		long __functionAddress = getInstance().glRasterPos3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3);
		}
		nglRasterPos3sv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos3fv ] ---

	/** JNI method for {@link #glRasterPos3f(ByteBuffer)} */
	public static native void nglRasterPos3fv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos3f(float, float, float)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3f(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3 << 2);
		}
		nglRasterPos3fv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos3f(ByteBuffer)} */
	public static void glRasterPos3(FloatBuffer coords) {
		long __functionAddress = getInstance().glRasterPos3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3);
		}
		nglRasterPos3fv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos3dv ] ---

	/** JNI method for {@link #glRasterPos3d(ByteBuffer)} */
	public static native void nglRasterPos3dv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos3d(double, double, double)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3d(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3 << 3);
		}
		nglRasterPos3dv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos3d(ByteBuffer)} */
	public static void glRasterPos3(DoubleBuffer coords) {
		long __functionAddress = getInstance().glRasterPos3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3);
		}
		nglRasterPos3dv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos4i ] ---

	/** JNI method for {@link #glRasterPos4i(int, int, int, int)} */
	public static native void nglRasterPos4i(int x, int y, int z, int w, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the four-dimensional current raster position. See {@link #glRasterPos2i(int, int)} for more details.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static void glRasterPos4i(int x, int y, int z, int w) {
		long __functionAddress = getInstance().glRasterPos4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4i(x, y, z, w, __functionAddress);
	}

	// --- [ glRasterPos4s ] ---

	/** JNI method for {@link #glRasterPos4s(short, short, short, short)} */
	public static native void nglRasterPos4s(short x, short y, short z, short w, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glRasterPos4i(int, int, int, int)}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static void glRasterPos4s(short x, short y, short z, short w) {
		long __functionAddress = getInstance().glRasterPos4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4s(x, y, z, w, __functionAddress);
	}

	// --- [ glRasterPos4f ] ---

	/** JNI method for {@link #glRasterPos4f(float, float, float, float)} */
	public static native void nglRasterPos4f(float x, float y, float z, float w, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of RasterPos4i.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static void glRasterPos4f(float x, float y, float z, float w) {
		long __functionAddress = getInstance().glRasterPos4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4f(x, y, z, w, __functionAddress);
	}

	// --- [ glRasterPos4d ] ---

	/** JNI method for {@link #glRasterPos4d(double, double, double, double)} */
	public static native void nglRasterPos4d(double x, double y, double z, double w, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glRasterPos4i(int, int, int, int)}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static void glRasterPos4d(double x, double y, double z, double w) {
		long __functionAddress = getInstance().glRasterPos4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRasterPos4d(x, y, z, w, __functionAddress);
	}

	// --- [ glRasterPos4iv ] ---

	/** JNI method for {@link #glRasterPos4i(ByteBuffer)} */
	public static native void nglRasterPos4iv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos4i(int, int, int, int)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4i(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4 << 2);
		}
		nglRasterPos4iv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos4i(ByteBuffer)} */
	public static void glRasterPos4(IntBuffer coords) {
		long __functionAddress = getInstance().glRasterPos4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4);
		}
		nglRasterPos4iv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos4sv ] ---

	/** JNI method for {@link #glRasterPos4s(ByteBuffer)} */
	public static native void nglRasterPos4sv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos4s(short, short, short, short)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4s(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4 << 1);
		}
		nglRasterPos4sv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos4s(ByteBuffer)} */
	public static void glRasterPos4(ShortBuffer coords) {
		long __functionAddress = getInstance().glRasterPos4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4);
		}
		nglRasterPos4sv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos4fv ] ---

	/** JNI method for {@link #glRasterPos4f(ByteBuffer)} */
	public static native void nglRasterPos4fv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos4f(float, float, float, float)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4f(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4 << 2);
		}
		nglRasterPos4fv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos4f(ByteBuffer)} */
	public static void glRasterPos4(FloatBuffer coords) {
		long __functionAddress = getInstance().glRasterPos4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4);
		}
		nglRasterPos4fv(memAddress(coords), __functionAddress);
	}

	// --- [ glRasterPos4dv ] ---

	/** JNI method for {@link #glRasterPos4d(ByteBuffer)} */
	public static native void nglRasterPos4dv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRasterPos4d(double, double, double, double)}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4d(ByteBuffer coords) {
		long __functionAddress = getInstance().glRasterPos4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4 << 3);
		}
		nglRasterPos4dv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glRasterPos4d(ByteBuffer)} */
	public static void glRasterPos4(DoubleBuffer coords) {
		long __functionAddress = getInstance().glRasterPos4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4);
		}
		nglRasterPos4dv(memAddress(coords), __functionAddress);
	}

	// --- [ glReadBuffer ] ---

	/** JNI method for {@link #glReadBuffer(int)} */
	public static native void nglReadBuffer(int src, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glReadBuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Defines the color buffer from which values are obtained.
	 * <p/>
	 * Acceptable values for {@code src} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING} is zero), or
	 * a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.
	 *
	 * @param src the color buffer to read from. One of:<p/>{@link #GL_NONE}, {@link #GL_FRONT_LEFT}, {@link #GL_FRONT_RIGHT}, {@link #GL_BACK_LEFT}, {@link #GL_BACK_RIGHT}, {@link #GL_FRONT}, {@link #GL_BACK}, {@link #GL_LEFT}, {@link #GL_RIGHT}, {@link #GL_FRONT_AND_BACK}, {@link #GL_AUX0}, {@link #GL_AUX1}, {@link #GL_AUX2}, {@link #GL_AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glReadBuffer(int src) {
		long __functionAddress = getInstance().glReadBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglReadBuffer(src, __functionAddress);
	}

	// --- [ glReadPixels ] ---

	/** JNI method for {@link #glReadPixels(int, int, int, int, int, int, ByteBuffer)} */
	public static native void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glReadPixels.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * ReadPixels obtains values from the selected read buffer from each pixel with lower left hand corner at {@code (x + i, y + j)} for {@code 0 <= i < width}
	 * and {@code 0 <= j < height}; this pixel is said to be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these pixels lies outside of the
	 * window allocated to the current GL context, or outside of the image attached to the currently bound read framebuffer object, then the values obtained
	 * for those pixels are undefined. When {@link GL30#GL_READ_FRAMEBUFFER_BINDING} is zero, values are also undefined for individual pixels that are not owned by
	 * the current context. Otherwise, {@code ReadPixels} obtains values from the selected buffer, regardless of how those values were placed there.
	 *
	 * @param x      the left pixel coordinate
	 * @param y      the lower pixel coordinate
	 * @param width  the number of pixels to read in the x-dimension
	 * @param height the number of pixels to read in the y-dimension
	 * @param format the pixel format. One of:<p/>{@link GL11#GL_STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER}, {@link GL30#GL_RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER}
	 * @param type   the pixel type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link GL11#GL_FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP}
	 * @param pixels an array in which to place the returned pixel data
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		long __functionAddress = getInstance().glReadPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, width * height * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glReadPixels(int, int, int, int, int, int, ByteBuffer)} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, long pixelsOffset) {
		long __functionAddress = getInstance().glReadPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglReadPixels(x, y, width, height, format, type, pixelsOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glReadPixels(int, int, int, int, int, int, ByteBuffer)} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		long __functionAddress = getInstance().glReadPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** IntBuffer version of: {@link #glReadPixels(int, int, int, int, int, int, ByteBuffer)} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		long __functionAddress = getInstance().glReadPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glReadPixels(int, int, int, int, int, int, ByteBuffer)} */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		long __functionAddress = getInstance().glReadPixels;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	// --- [ glRecti ] ---

	/** JNI method for {@link #glRecti(int, int, int, int)} */
	public static native void nglRecti(int x1, int y1, int x2, int y2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies a rectangle as two corner vertices. The effect of the Rect command
	 * <p/>
	 * {@code Rect(x1, y1, x2, y2);}
	 * <p/>
	 * is exactly the same as the following sequence of commands:
	 * {@code
	 * Begin(POLYGON);
	 * Vertex2(x1, y1);
	 * Vertex2(x2, y1);
	 * Vertex2(x2, y2);
	 * Vertex2(x1, y2);
	 * End();}
	 * <p/>
	 * The appropriate Vertex2 command would be invoked depending on which of the Rect commands is issued.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static void glRecti(int x1, int y1, int x2, int y2) {
		long __functionAddress = getInstance().glRecti;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRecti(x1, y1, x2, y2, __functionAddress);
	}

	// --- [ glRects ] ---

	/** JNI method for {@link #glRects(short, short, short, short)} */
	public static native void nglRects(short x1, short y1, short x2, short y2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glRecti(int, int, int, int)}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static void glRects(short x1, short y1, short x2, short y2) {
		long __functionAddress = getInstance().glRects;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRects(x1, y1, x2, y2, __functionAddress);
	}

	// --- [ glRectf ] ---

	/** JNI method for {@link #glRectf(float, float, float, float)} */
	public static native void nglRectf(float x1, float y1, float x2, float y2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glRecti(int, int, int, int)}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static void glRectf(float x1, float y1, float x2, float y2) {
		long __functionAddress = getInstance().glRectf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRectf(x1, y1, x2, y2, __functionAddress);
	}

	// --- [ glRectd ] ---

	/** JNI method for {@link #glRectd(double, double, double, double)} */
	public static native void nglRectd(double x1, double y1, double x2, double y2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glRecti(int, int, int, int)}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static void glRectd(double x1, double y1, double x2, double y2) {
		long __functionAddress = getInstance().glRectd;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRectd(x1, y1, x2, y2, __functionAddress);
	}

	// --- [ glRectiv ] ---

	/** JNI method for {@link #glRecti(ByteBuffer, ByteBuffer)} */
	public static native void nglRectiv(long v1, long v2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRecti(int, int, int, int)}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRecti(ByteBuffer v1, ByteBuffer v2) {
		long __functionAddress = getInstance().glRectiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 2 << 2);
			checkBuffer(v2, 2 << 2);
		}
		nglRectiv(memAddress(v1), memAddress(v2), __functionAddress);
	}

	/** Alternative version of: {@link #glRecti(ByteBuffer, ByteBuffer)} */
	public static void glRect(IntBuffer v1, IntBuffer v2) {
		long __functionAddress = getInstance().glRectiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 2);
			checkBuffer(v2, 2);
		}
		nglRectiv(memAddress(v1), memAddress(v2), __functionAddress);
	}

	// --- [ glRectsv ] ---

	/** JNI method for {@link #glRects(ByteBuffer, ByteBuffer)} */
	public static native void nglRectsv(long v1, long v2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRects(short, short, short, short)}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRects(ByteBuffer v1, ByteBuffer v2) {
		long __functionAddress = getInstance().glRectsv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 2 << 1);
			checkBuffer(v2, 2 << 1);
		}
		nglRectsv(memAddress(v1), memAddress(v2), __functionAddress);
	}

	/** Alternative version of: {@link #glRects(ByteBuffer, ByteBuffer)} */
	public static void glRect(ShortBuffer v1, ShortBuffer v2) {
		long __functionAddress = getInstance().glRectsv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 2);
			checkBuffer(v2, 2);
		}
		nglRectsv(memAddress(v1), memAddress(v2), __functionAddress);
	}

	// --- [ glRectfv ] ---

	/** JNI method for {@link #glRectf(ByteBuffer, ByteBuffer)} */
	public static native void nglRectfv(long v1, long v2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRectf(float, float, float, float)}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectf(ByteBuffer v1, ByteBuffer v2) {
		long __functionAddress = getInstance().glRectfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 2 << 2);
			checkBuffer(v2, 2 << 2);
		}
		nglRectfv(memAddress(v1), memAddress(v2), __functionAddress);
	}

	/** Alternative version of: {@link #glRectf(ByteBuffer, ByteBuffer)} */
	public static void glRect(FloatBuffer v1, FloatBuffer v2) {
		long __functionAddress = getInstance().glRectfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 2);
			checkBuffer(v2, 2);
		}
		nglRectfv(memAddress(v1), memAddress(v2), __functionAddress);
	}

	// --- [ glRectdv ] ---

	/** JNI method for {@link #glRectd(ByteBuffer, ByteBuffer)} */
	public static native void nglRectdv(long v1, long v2, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glRectd(double, double, double, double)}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectd(ByteBuffer v1, ByteBuffer v2) {
		long __functionAddress = getInstance().glRectdv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 2 << 3);
			checkBuffer(v2, 2 << 3);
		}
		nglRectdv(memAddress(v1), memAddress(v2), __functionAddress);
	}

	/** Alternative version of: {@link #glRectd(ByteBuffer, ByteBuffer)} */
	public static void glRect(DoubleBuffer v1, DoubleBuffer v2) {
		long __functionAddress = getInstance().glRectdv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v1, 2);
			checkBuffer(v2, 2);
		}
		nglRectdv(memAddress(v1), memAddress(v2), __functionAddress);
	}

	// --- [ glRenderMode ] ---

	/** JNI method for {@link #glRenderMode(int)} */
	public static native int nglRenderMode(int mode, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current render mode. The default is #GL_RENDER.
	 *
	 * @param mode the render mode. One of:<p/>{@link #GL_RENDER}, {@link #GL_SELECT}, {@link #GL_FEEDBACK}
	 */
	public static int glRenderMode(int mode) {
		long __functionAddress = getInstance().glRenderMode;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglRenderMode(mode, __functionAddress);
	}

	// --- [ glRotatef ] ---

	/** JNI method for {@link #glRotatef(float, float, float, float)} */
	public static native void nglRotatef(float angle, float x, float y, float z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Manipulates the current matrix with a rotation matrix.
	 * <p/>
	 * {@code angle} gives an angle of rotation in degrees; the coordinates of a vector v are given by <code>v = (x y z)<sup>T</sup></code>. The computed matrix
	 * is a counter-clockwise rotation about the line through the origin with the specified axis when that axis is pointing up (i.e. the right-hand rule
	 * determines the sense of the rotation angle). The matrix is thus
	 * <table border="1" cellspacing="0" cellpadding="2">
	 * 	<tr align="center"><td colspan="3" rowspan="3"><b>R</b></td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td></tr>
	 * 	<tr align="center"><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 * <p/>
	 * Let <code>u = v / ||v|| = (x' y' z')<sup>T</sup></code>. If <b>S</b> =
	 * <table border="1" cellspacing="0" cellpadding="2">
	 * 	<tr align="center"><td>0</td><td>-z'</td><td>y'</td></tr>
	 * 	<tr align="center"><td>z'</td><td>0</td><td>-x'</td></tr>
	 * 	<tr align="center"><td>-y'</td><td>x'</td><td>0</td></tr>
	 * </table>
	 * <p/>
	 * then <code><b>R</b> = uu<sup>T</sup> + cos(angle)(I - uu<sup>T</sup>) + sin(angle)<b>S</b></code>
	 *
	 * @param angle the angle of rotation in degrees
	 * @param x     the x coordinate of the rotation vector
	 * @param y     the y coordinate of the rotation vector
	 * @param z     the z coordinate of the rotation vector
	 */
	public static void glRotatef(float angle, float x, float y, float z) {
		long __functionAddress = getInstance().glRotatef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRotatef(angle, x, y, z, __functionAddress);
	}

	// --- [ glRotated ] ---

	/** JNI method for {@link #glRotated(double, double, double, double)} */
	public static native void nglRotated(double angle, double x, double y, double z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glRotatef(float, float, float, float)}.
	 *
	 * @param angle the angle of rotation in degrees
	 * @param x     the x coordinate of the rotation vector
	 * @param y     the y coordinate of the rotation vector
	 * @param z     the z coordinate of the rotation vector
	 */
	public static void glRotated(double angle, double x, double y, double z) {
		long __functionAddress = getInstance().glRotated;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglRotated(angle, x, y, z, __functionAddress);
	}

	// --- [ glScalef ] ---

	/** JNI method for {@link #glScalef(float, float, float)} */
	public static native void nglScalef(float x, float y, float z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Manipulates the current matrix with a general scaling matrix along the x-, y- and z- axes.
	 * <p/>
	 * Calling this function is equivalent to calling {@link #glMultMatrixf(ByteBuffer)} with the following matrix:
	 * <table border="1" cellspacing="0" cellpadding="2">
	 * 	<tr align="center"><td>x</td><td>0</td><td>0</td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>y</td><td>0</td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>z</td><td>0</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 *
	 * @param x the x-axis scaling factor
	 * @param y the y-axis scaling factor
	 * @param z the z-axis scaling factor
	 */
	public static void glScalef(float x, float y, float z) {
		long __functionAddress = getInstance().glScalef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglScalef(x, y, z, __functionAddress);
	}

	// --- [ glScaled ] ---

	/** JNI method for {@link #glScaled(double, double, double)} */
	public static native void nglScaled(double x, double y, double z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glScalef(float, float, float)}.
	 *
	 * @param x the x-axis scaling factor
	 * @param y the y-axis scaling factor
	 * @param z the z-axis scaling factor
	 */
	public static void glScaled(double x, double y, double z) {
		long __functionAddress = getInstance().glScaled;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglScaled(x, y, z, __functionAddress);
	}

	// --- [ glScissor ] ---

	/** JNI method for {@link #glScissor(int, int, int, int)} */
	public static native void nglScissor(int x, int y, int width, int height, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glScissor.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Defines the scissor rectangle for all viewports. The scissor test is enabled or disabled for all viewports using {@link #glEnable(int)} or {@link #glDisable(int)}
	 * with the symbolic constant {@link #GL_SCISSOR_TEST}. When disabled, it is as if the scissor test always passes. When enabled, if
	 * <code>left <= x<sub>w</sub> < left + width</code> and <code>bottom <= y<sub>w</sub> < bottom + height</code> for the scissor rectangle, then the scissor
	 * test passes. Otherwise, the test fails and the fragment is discarded.
	 *
	 * @param x      the left scissor rectangle coordinate
	 * @param y      the bottom scissor rectangle coordinate
	 * @param width  the scissor rectangle width
	 * @param height the scissor rectangle height
	 */
	public static void glScissor(int x, int y, int width, int height) {
		long __functionAddress = getInstance().glScissor;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglScissor(x, y, width, height, __functionAddress);
	}

	// --- [ glSelectBuffer ] ---

	/** JNI method for {@link #glSelectBuffer(int, ByteBuffer)} */
	public static native void nglSelectBuffer(int size, long buffer, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the selection array.
	 *
	 * @param size   the maximum number of values that can be stored in {@code buffer}
	 * @param buffer an array of unsigned integers to be potentially filled names
	 */
	public static void glSelectBuffer(int size, ByteBuffer buffer) {
		long __functionAddress = getInstance().glSelectBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer, size << 2);
		}
		nglSelectBuffer(size, memAddress(buffer), __functionAddress);
	}

	/** Alternative version of: {@link #glSelectBuffer(int, ByteBuffer)} */
	public static void glSelectBuffer(IntBuffer buffer) {
		long __functionAddress = getInstance().glSelectBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSelectBuffer(buffer.remaining(), memAddress(buffer), __functionAddress);
	}

	// --- [ glShadeModel ] ---

	/** JNI method for {@link #glShadeModel(int)} */
	public static native void nglShadeModel(int mode, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current shade mode. The initial value of the shade mode is {@link #GL_SMOOTH}.
	 * <p/>
	 * If mode is {@link #GL_SMOOTH}, vertex colors are treated individually. If mode is {@link #GL_FLAT}, flatshading is enabled and colors are taken from the
	 * provoking vertex of the primitive. The colors selected are those derived from current values, generated by lighting, or generated by vertex shading, if
	 * lighting is disabled, enabled, or a vertex shader is in use, respectively.
	 *
	 * @param mode the shade mode. One of:<p/>{@link #GL_SMOOTH}, {@link #GL_FLAT}
	 */
	public static void glShadeModel(int mode) {
		long __functionAddress = getInstance().glShadeModel;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglShadeModel(mode, __functionAddress);
	}

	// --- [ glStencilFunc ] ---

	/** JNI method for {@link #glStencilFunc(int, int, int)} */
	public static native void nglStencilFunc(int func, int ref, int mask, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glStencilFunc.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Controls the stencil test.
	 * <p/>
	 * {@code ref} is an integer reference value that is used in the unsigned stencil comparison. Stencil comparison operations and queries of {@code ref}
	 * clamp its value to the range [0, 2<sup>s</sup> &ndash; 1], where s is the number of bits in the stencil buffer attached to the draw framebuffer. The s
	 * least significant bits of {@code mask} are bitwise ANDed with both the reference and the stored stencil value, and the resulting masked values are those that
	 * participate in the comparison controlled by {@code func}.
	 *
	 * @param func the stencil comparison function. One of:<p/>{@link #GL_NEVER}, {@link #GL_ALWAYS}, {@link #GL_LESS}, {@link #GL_LEQUAL}, {@link #GL_EQUAL}, {@link #GL_GEQUAL}, {@link #GL_GREATER}, {@link #GL_NOTEQUAL}
	 * @param ref  the reference value
	 * @param mask the stencil comparison mask
	 */
	public static void glStencilFunc(int func, int ref, int mask) {
		long __functionAddress = getInstance().glStencilFunc;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilFunc(func, ref, mask, __functionAddress);
	}

	// --- [ glStencilMask ] ---

	/** JNI method for {@link #glStencilMask(int)} */
	public static native void nglStencilMask(int mask, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glStencilMask.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Masks the writing of particular bits into the stencil plans.
	 * <p/>
	 * The least significant s bits of {@code mask}, where s is the number of bits in the stencil buffer, specify an integer mask. Where a 1 appears in this
	 * mask, the corresponding bit in the stencil buffer is written; where a 0 appears, the bit is not written.
	 *
	 * @param mask the stencil mask
	 */
	public static void glStencilMask(int mask) {
		long __functionAddress = getInstance().glStencilMask;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilMask(mask, __functionAddress);
	}

	// --- [ glStencilOp ] ---

	/** JNI method for {@link #glStencilOp(int, int, int)} */
	public static native void nglStencilOp(int sfail, int dpfail, int dppass, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glStencilOp.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Indicates what happens to the stored stencil value if this or certain subsequent tests fail or pass.
	 * <p/>
	 * The supported actions are {@link #GL_KEEP}, {@link #GL_ZERO}, {@link #GL_REPLACE}, {@link #GL_INCR}, {@link #GL_DECR}, {@link #GL_INVERT},
	 * {@link GL14#GL_INCR_WRAP} and {@link GL14#GL_DECR_WRAP}. These correspond to keeping the current value, setting to zero, replacing with the reference value,
	 * incrementing with saturation, decrementing with saturation, bitwise inverting it, incrementing without saturation, and decrementing without saturation.
	 * <p/>
	 * For purposes of increment and decrement, the stencil bits are considered as an unsigned integer. Incrementing or decrementing with saturation clamps
	 * the stencil value at 0 and the maximum representable value. Incrementing or decrementing without saturation will wrap such that incrementing the maximum
	 * representable value results in 0, and decrementing 0 results in the maximum representable value.
	 *
	 * @param sfail  the action to take if the stencil test fails
	 * @param dpfail the action to take if the depth buffer test fails
	 * @param dppass the action to take if the depth buffer test passes
	 */
	public static void glStencilOp(int sfail, int dpfail, int dppass) {
		long __functionAddress = getInstance().glStencilOp;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilOp(sfail, dpfail, dppass, __functionAddress);
	}

	// --- [ glTexCoord1f ] ---

	/** JNI method for {@link #glTexCoord1f(float)} */
	public static native void nglTexCoord1f(float s, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current one-dimensional texture coordinate. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static void glTexCoord1f(float s) {
		long __functionAddress = getInstance().glTexCoord1f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1f(s, __functionAddress);
	}

	// --- [ glTexCoord1s ] ---

	/** JNI method for {@link #glTexCoord1s(short)} */
	public static native void nglTexCoord1s(short s, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glTexCoord1f(float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static void glTexCoord1s(short s) {
		long __functionAddress = getInstance().glTexCoord1s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1s(s, __functionAddress);
	}

	// --- [ glTexCoord1i ] ---

	/** JNI method for {@link #glTexCoord1i(int)} */
	public static native void nglTexCoord1i(int s, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glTexCoord1f(float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static void glTexCoord1i(int s) {
		long __functionAddress = getInstance().glTexCoord1i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1i(s, __functionAddress);
	}

	// --- [ glTexCoord1d ] ---

	/** JNI method for {@link #glTexCoord1d(double)} */
	public static native void nglTexCoord1d(double s, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glTexCoord1f(float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static void glTexCoord1d(double s) {
		long __functionAddress = getInstance().glTexCoord1d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord1d(s, __functionAddress);
	}

	// --- [ glTexCoord1fv ] ---

	/** JNI method for {@link #glTexCoord1f(ByteBuffer)} */
	public static native void nglTexCoord1fv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord1f(float)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1f(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord1fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 2);
		}
		nglTexCoord1fv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord1f(ByteBuffer)} */
	public static void glTexCoord1(FloatBuffer v) {
		long __functionAddress = getInstance().glTexCoord1fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglTexCoord1fv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord1sv ] ---

	/** JNI method for {@link #glTexCoord1s(ByteBuffer)} */
	public static native void nglTexCoord1sv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord1s(short)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1s(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord1sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 1);
		}
		nglTexCoord1sv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord1s(ByteBuffer)} */
	public static void glTexCoord1(ShortBuffer v) {
		long __functionAddress = getInstance().glTexCoord1sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglTexCoord1sv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord1iv ] ---

	/** JNI method for {@link #glTexCoord1i(ByteBuffer)} */
	public static native void nglTexCoord1iv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord1i(int)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1i(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord1iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 2);
		}
		nglTexCoord1iv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord1i(ByteBuffer)} */
	public static void glTexCoord1(IntBuffer v) {
		long __functionAddress = getInstance().glTexCoord1iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglTexCoord1iv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord1dv ] ---

	/** JNI method for {@link #glTexCoord1d(ByteBuffer)} */
	public static native void nglTexCoord1dv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord1d(double)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1d(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1 << 3);
		}
		nglTexCoord1dv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord1d(ByteBuffer)} */
	public static void glTexCoord1(DoubleBuffer v) {
		long __functionAddress = getInstance().glTexCoord1dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		nglTexCoord1dv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord2f ] ---

	/** JNI method for {@link #glTexCoord2f(float, float)} */
	public static native void nglTexCoord2f(float s, float t, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current two-dimensional texture coordinate. {@code r} is implicitly set to 0 and {@code q} to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static void glTexCoord2f(float s, float t) {
		long __functionAddress = getInstance().glTexCoord2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2f(s, t, __functionAddress);
	}

	// --- [ glTexCoord2s ] ---

	/** JNI method for {@link #glTexCoord2s(short, short)} */
	public static native void nglTexCoord2s(short s, short t, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glTexCoord2f(float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static void glTexCoord2s(short s, short t) {
		long __functionAddress = getInstance().glTexCoord2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2s(s, t, __functionAddress);
	}

	// --- [ glTexCoord2i ] ---

	/** JNI method for {@link #glTexCoord2i(int, int)} */
	public static native void nglTexCoord2i(int s, int t, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glTexCoord2f(float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static void glTexCoord2i(int s, int t) {
		long __functionAddress = getInstance().glTexCoord2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2i(s, t, __functionAddress);
	}

	// --- [ glTexCoord2d ] ---

	/** JNI method for {@link #glTexCoord2d(double, double)} */
	public static native void nglTexCoord2d(double s, double t, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glTexCoord2f(float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static void glTexCoord2d(double s, double t) {
		long __functionAddress = getInstance().glTexCoord2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord2d(s, t, __functionAddress);
	}

	// --- [ glTexCoord2fv ] ---

	/** JNI method for {@link #glTexCoord2f(ByteBuffer)} */
	public static native void nglTexCoord2fv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord2f(float, float)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2f(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 2);
		}
		nglTexCoord2fv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord2f(ByteBuffer)} */
	public static void glTexCoord2(FloatBuffer v) {
		long __functionAddress = getInstance().glTexCoord2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglTexCoord2fv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord2sv ] ---

	/** JNI method for {@link #glTexCoord2s(ByteBuffer)} */
	public static native void nglTexCoord2sv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord2s(short, short)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2s(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 1);
		}
		nglTexCoord2sv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord2s(ByteBuffer)} */
	public static void glTexCoord2(ShortBuffer v) {
		long __functionAddress = getInstance().glTexCoord2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglTexCoord2sv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord2iv ] ---

	/** JNI method for {@link #glTexCoord2i(ByteBuffer)} */
	public static native void nglTexCoord2iv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord2i(int, int)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2i(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 2);
		}
		nglTexCoord2iv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord2i(ByteBuffer)} */
	public static void glTexCoord2(IntBuffer v) {
		long __functionAddress = getInstance().glTexCoord2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglTexCoord2iv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord2dv ] ---

	/** JNI method for {@link #glTexCoord2d(ByteBuffer)} */
	public static native void nglTexCoord2dv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord2d(double, double)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2d(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2 << 3);
		}
		nglTexCoord2dv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord2d(ByteBuffer)} */
	public static void glTexCoord2(DoubleBuffer v) {
		long __functionAddress = getInstance().glTexCoord2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		nglTexCoord2dv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord3f ] ---

	/** JNI method for {@link #glTexCoord3f(float, float, float)} */
	public static native void nglTexCoord3f(float s, float t, float r, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current three-dimensional texture coordinate. {@code q} is implicitly set to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static void glTexCoord3f(float s, float t, float r) {
		long __functionAddress = getInstance().glTexCoord3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3f(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3s ] ---

	/** JNI method for {@link #glTexCoord3s(short, short, short)} */
	public static native void nglTexCoord3s(short s, short t, short r, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glTexCoord3f(float, float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static void glTexCoord3s(short s, short t, short r) {
		long __functionAddress = getInstance().glTexCoord3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3s(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3i ] ---

	/** JNI method for {@link #glTexCoord3i(int, int, int)} */
	public static native void nglTexCoord3i(int s, int t, int r, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glTexCoord3f(float, float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static void glTexCoord3i(int s, int t, int r) {
		long __functionAddress = getInstance().glTexCoord3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3i(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3d ] ---

	/** JNI method for {@link #glTexCoord3d(double, double, double)} */
	public static native void nglTexCoord3d(double s, double t, double r, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glTexCoord3f(float, float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static void glTexCoord3d(double s, double t, double r) {
		long __functionAddress = getInstance().glTexCoord3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord3d(s, t, r, __functionAddress);
	}

	// --- [ glTexCoord3fv ] ---

	/** JNI method for {@link #glTexCoord3f(ByteBuffer)} */
	public static native void nglTexCoord3fv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord3f(float, float, float)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3f(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglTexCoord3fv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord3f(ByteBuffer)} */
	public static void glTexCoord3(FloatBuffer v) {
		long __functionAddress = getInstance().glTexCoord3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglTexCoord3fv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord3sv ] ---

	/** JNI method for {@link #glTexCoord3s(ByteBuffer)} */
	public static native void nglTexCoord3sv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord3s(short, short, short)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3s(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 1);
		}
		nglTexCoord3sv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord3s(ByteBuffer)} */
	public static void glTexCoord3(ShortBuffer v) {
		long __functionAddress = getInstance().glTexCoord3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglTexCoord3sv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord3iv ] ---

	/** JNI method for {@link #glTexCoord3i(ByteBuffer)} */
	public static native void nglTexCoord3iv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord3i(int, int, int)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3i(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglTexCoord3iv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord3i(ByteBuffer)} */
	public static void glTexCoord3(IntBuffer v) {
		long __functionAddress = getInstance().glTexCoord3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglTexCoord3iv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord3dv ] ---

	/** JNI method for {@link #glTexCoord3d(ByteBuffer)} */
	public static native void nglTexCoord3dv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord3d(double, double, double)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3d(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 3);
		}
		nglTexCoord3dv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord3d(ByteBuffer)} */
	public static void glTexCoord3(DoubleBuffer v) {
		long __functionAddress = getInstance().glTexCoord3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglTexCoord3dv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord4f ] ---

	/** JNI method for {@link #glTexCoord4f(float, float, float, float)} */
	public static native void nglTexCoord4f(float s, float t, float r, float q, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets the current four-dimensional texture coordinate.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static void glTexCoord4f(float s, float t, float r, float q) {
		long __functionAddress = getInstance().glTexCoord4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4f(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4s ] ---

	/** JNI method for {@link #glTexCoord4s(short, short, short, short)} */
	public static native void nglTexCoord4s(short s, short t, short r, short q, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glTexCoord4f(float, float, float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static void glTexCoord4s(short s, short t, short r, short q) {
		long __functionAddress = getInstance().glTexCoord4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4s(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4i ] ---

	/** JNI method for {@link #glTexCoord4i(int, int, int, int)} */
	public static native void nglTexCoord4i(int s, int t, int r, int q, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glTexCoord4f(float, float, float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static void glTexCoord4i(int s, int t, int r, int q) {
		long __functionAddress = getInstance().glTexCoord4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4i(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4d ] ---

	/** JNI method for {@link #glTexCoord4d(double, double, double, double)} */
	public static native void nglTexCoord4d(double s, double t, double r, double q, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glTexCoord4f(float, float, float, float)}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static void glTexCoord4d(double s, double t, double r, double q) {
		long __functionAddress = getInstance().glTexCoord4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoord4d(s, t, r, q, __functionAddress);
	}

	// --- [ glTexCoord4fv ] ---

	/** JNI method for {@link #glTexCoord4f(ByteBuffer)} */
	public static native void nglTexCoord4fv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord4f(float, float, float, float)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4f(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglTexCoord4fv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord4f(ByteBuffer)} */
	public static void glTexCoord4(FloatBuffer v) {
		long __functionAddress = getInstance().glTexCoord4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglTexCoord4fv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord4sv ] ---

	/** JNI method for {@link #glTexCoord4s(ByteBuffer)} */
	public static native void nglTexCoord4sv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord4s(short, short, short, short)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4s(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 1);
		}
		nglTexCoord4sv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord4s(ByteBuffer)} */
	public static void glTexCoord4(ShortBuffer v) {
		long __functionAddress = getInstance().glTexCoord4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglTexCoord4sv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord4iv ] ---

	/** JNI method for {@link #glTexCoord4i(ByteBuffer)} */
	public static native void nglTexCoord4iv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord4i(int, int, int, int)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4i(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 2);
		}
		nglTexCoord4iv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord4i(ByteBuffer)} */
	public static void glTexCoord4(IntBuffer v) {
		long __functionAddress = getInstance().glTexCoord4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglTexCoord4iv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoord4dv ] ---

	/** JNI method for {@link #glTexCoord4d(ByteBuffer)} */
	public static native void nglTexCoord4dv(long v, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexCoord4d(double, double, double, double)}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4d(ByteBuffer v) {
		long __functionAddress = getInstance().glTexCoord4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4 << 3);
		}
		nglTexCoord4dv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoord4d(ByteBuffer)} */
	public static void glTexCoord4(DoubleBuffer v) {
		long __functionAddress = getInstance().glTexCoord4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		nglTexCoord4dv(memAddress(v), __functionAddress);
	}

	// --- [ glTexCoordPointer ] ---

	/** JNI method for {@link #glTexCoordPointer(int, int, int, ByteBuffer)} */
	public static native void nglTexCoordPointer(int size, int type, int stride, long pointer, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies the location and organization of a texture coordinate array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<p/>1, 2, 3, 4
	 * @param type    the data type of the values stored in the array. One of:<p/>{@link #GL_SHORT}, {@link #GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link #GL_FLOAT}, {@link #GL_DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the texture coordinate array data
	 */
	public static void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glTexCoordPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglTexCoordPointer(size, type, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glTexCoordPointer(int, int, int, ByteBuffer)} */
	public static void glTexCoordPointer(int size, int type, int stride, long pointerOffset) {
		long __functionAddress = getInstance().glTexCoordPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, true);
		}
		nglTexCoordPointer(size, type, stride, pointerOffset, __functionAddress);
	}

	/** GL_FLOAT version of: {@link #glTexCoordPointer(int, int, int, ByteBuffer)} */
	public static void glTexCoordPointer(int size, int stride, FloatBuffer pointer) {
		long __functionAddress = getInstance().glTexCoordPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglTexCoordPointer(size, GL11.GL_FLOAT, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glTexEnvi ] ---

	/** JNI method for {@link #glTexEnvi(int, int, int)} */
	public static native void nglTexEnvi(int target, int pname, int param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexEnvi.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets parameters of the texture environment that specifies how texture values are interpreted when texturing a fragment, or sets per-texture-unit
	 * filtering parameters.
	 *
	 * @param target the texture environment target. One of:<p/>{@link #GL_TEXTURE_ENV}, {@link GL14#GL_TEXTURE_FILTER_CONTROL}, {@link GL20#GL_POINT_SPRITE}
	 * @param pname  the parameter to set. One of:<p/>{@link GL20#GL_COORD_REPLACE}, {@link #GL_TEXTURE_ENV_MODE}, {@link GL14#GL_TEXTURE_LOD_BIAS}, {@link GL13#GL_COMBINE_RGB}, {@link GL13#GL_COMBINE_ALPHA}, {@link GL15#GL_SRC0_RGB}, {@link GL15#GL_SRC1_RGB}, {@link GL15#GL_SRC2_RGB}, {@link GL15#GL_SRC0_ALPHA}, {@link GL15#GL_SRC1_ALPHA}, {@link GL15#GL_SRC2_ALPHA}, {@link GL13#GL_OPERAND0_RGB}, {@link GL13#GL_OPERAND1_RGB}, {@link GL13#GL_OPERAND2_RGB}, {@link GL13#GL_OPERAND0_ALPHA}, {@link GL13#GL_OPERAND1_ALPHA}, {@link GL13#GL_OPERAND2_ALPHA}, {@link GL13#GL_RGB_SCALE}, {@link #GL_ALPHA_SCALE}
	 * @param param  the parameter value. Scalar value or one of:. One of:<p/>{@link #GL_REPLACE}, {@link #GL_MODULATE}, {@link #GL_DECAL}, {@link #GL_BLEND}, {@link #GL_ADD}, {@link GL13#GL_COMBINE}, {@link GL13#GL_ADD_SIGNED}, {@link GL13#GL_INTERPOLATE}, {@link GL13#GL_SUBTRACT}, {@link GL13#GL_DOT3_RGB}, {@link GL13#GL_DOT3_RGBA}, {@link #GL_TEXTURE}, {@link GL13#GL_TEXTURE0}, GL13.GL_TEXTURE[1-31], {@link GL13#GL_CONSTANT}, {@link GL13#GL_PRIMARY_COLOR}, {@link GL13#GL_PREVIOUS}
	 */
	public static void glTexEnvi(int target, int pname, int param) {
		long __functionAddress = getInstance().glTexEnvi;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexEnvi(target, pname, param, __functionAddress);
	}

	// --- [ glTexEnviv ] ---

	/** JNI method for {@link #glTexEnvi(int, int, ByteBuffer)} */
	public static native void nglTexEnviv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexEnv.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glTexEnvi(int, int, int)}.
	 *
	 * @param target the texture environment target. Must be:<p/>{@link #GL_TEXTURE_ENV}
	 * @param pname  the parameter to set. Must be:<p/>{@link #GL_TEXTURE_ENV_COLOR}
	 * @param params the parameter value
	 */
	public static void glTexEnvi(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexEnviv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglTexEnviv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexEnvi(int, int, ByteBuffer)} */
	public static void glTexEnv(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glTexEnviv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglTexEnviv(target, pname, memAddress(params), __functionAddress);
	}

	// --- [ glTexEnvf ] ---

	/** JNI method for {@link #glTexEnvf(int, int, float)} */
	public static native void nglTexEnvf(int target, int pname, float param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexEnvf.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glTexEnvi(int, int, int)}.
	 *
	 * @param target the texture environment target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
	public static void glTexEnvf(int target, int pname, float param) {
		long __functionAddress = getInstance().glTexEnvf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexEnvf(target, pname, param, __functionAddress);
	}

	// --- [ glTexEnvfv ] ---

	/** JNI method for {@link #glTexEnvf(int, int, ByteBuffer)} */
	public static native void nglTexEnvfv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexEnv.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glTexEnvf(int, int, float)}.
	 *
	 * @param target the texture environment target. Must be:<p/>{@link #GL_TEXTURE_ENV}
	 * @param pname  the parameter to set. Must be:<p/>{@link #GL_TEXTURE_ENV_COLOR}
	 * @param params the parameter value
	 */
	public static void glTexEnvf(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexEnvfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglTexEnvfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexEnvf(int, int, ByteBuffer)} */
	public static void glTexEnv(int target, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glTexEnvfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglTexEnvfv(target, pname, memAddress(params), __functionAddress);
	}

	// --- [ glTexGeni ] ---

	/** JNI method for {@link #glTexGeni(int, int, int)} */
	public static native void nglTexGeni(int coord, int pname, int param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Sets an integer texture coordinate generation parameter.
	 * <p/>
	 * A texture coordinate generation function is enabled or disabled using {@link #glEnable(int)} and {@link #glDisable(int)} with an argument of
	 * {@link #GL_TEXTURE_GEN_S}, {@link #GL_TEXTURE_GEN_T}, {@link #GL_TEXTURE_GEN_R}, or {@link #GL_TEXTURE_GEN_Q} (each indicates the corresponding texture
	 * coordinate). When enabled, the specified texture coordinate is computed according to the current {@link #GL_EYE_LINEAR}, {@link #GL_OBJECT_LINEAR} or
	 * {@link #GL_SPHERE_MAP} specification, depending on the current setting of {@link #GL_TEXTURE_GEN_MODE} for that coordinate. When disabled, subsequent
	 * vertices will take the indicated texture coordinate from the current texture coordinates.
	 * <p/>
	 * The initial state has the texture generation function disabled for all texture coordinates. Initially all texture generation modes are EYE_LINEAR.
	 *
	 * @param coord the coordinate for which to set the parameter. One of:<p/>{@link #GL_S}, {@link #GL_T}, {@link #GL_R}, {@link #GL_Q}
	 * @param pname the parameter to set. Must be:<p/>{@link #GL_TEXTURE_GEN_MODE}
	 * @param param the parameter value. One of:<p/>{@link #GL_OBJECT_LINEAR}, {@link #GL_EYE_LINEAR}, {@link #GL_SPHERE_MAP}, {@link GL13#GL_REFLECTION_MAP}, {@link GL13#GL_NORMAL_MAP}
	 */
	public static void glTexGeni(int coord, int pname, int param) {
		long __functionAddress = getInstance().glTexGeni;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGeni(coord, pname, param, __functionAddress);
	}

	// --- [ glTexGeniv ] ---

	/** JNI method for {@link #glTexGeni(int, int, ByteBuffer)} */
	public static native void nglTexGeniv(int coord, int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexGeni(int, int, int)}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set. One of:<p/>{@link #GL_OBJECT_PLANE}, {@link #GL_EYE_PLANE}
	 * @param params the parameter value
	 */
	public static void glTexGeni(int coord, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexGeniv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglTexGeniv(coord, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexGeni(int, int, ByteBuffer)} */
	public static void glTexGen(int coord, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glTexGeniv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglTexGeniv(coord, pname, memAddress(params), __functionAddress);
	}

	// --- [ glTexGenf ] ---

	/** JNI method for {@link #glTexGenf(int, int, float)} */
	public static native void nglTexGenf(int coord, int pname, float param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Float version of {@link #glTexGeni(int, int, int)}.
	 *
	 * @param coord the coordinate for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static void glTexGenf(int coord, int pname, float param) {
		long __functionAddress = getInstance().glTexGenf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGenf(coord, pname, param, __functionAddress);
	}

	// --- [ glTexGenfv ] ---

	/** JNI method for {@link #glTexGenf(int, int, ByteBuffer)} */
	public static native void nglTexGenfv(int coord, int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexGenf(int, int, float)}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set. One of:<p/>{@link #GL_OBJECT_PLANE}, {@link #GL_EYE_PLANE}
	 * @param params the parameter value
	 */
	public static void glTexGenf(int coord, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexGenfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglTexGenfv(coord, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexGenf(int, int, ByteBuffer)} */
	public static void glTexGen(int coord, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glTexGenfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglTexGenfv(coord, pname, memAddress(params), __functionAddress);
	}

	// --- [ glTexGend ] ---

	/** JNI method for {@link #glTexGend(int, int, double)} */
	public static native void nglTexGend(int coord, int pname, double param, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glTexGeni(int, int, int)}.
	 *
	 * @param coord the coordinate for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static void glTexGend(int coord, int pname, double param) {
		long __functionAddress = getInstance().glTexGend;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexGend(coord, pname, param, __functionAddress);
	}

	// --- [ glTexGendv ] ---

	/** JNI method for {@link #glTexGend(int, int, ByteBuffer)} */
	public static native void nglTexGendv(int coord, int pname, long params, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glTexGend(int, int, double)}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexGend(int coord, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexGendv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 3);
		}
		nglTexGendv(coord, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexGend(int, int, ByteBuffer)} */
	public static void glTexGen(int coord, int pname, DoubleBuffer params) {
		long __functionAddress = getInstance().glTexGendv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglTexGendv(coord, pname, memAddress(params), __functionAddress);
	}

	// --- [ glTexImage2D ] ---

	/** JNI method for {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static native void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexImage2D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<p/>{@link GL11#GL_TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP}, {@link GL11#GL_PROXY_TEXTURE_2D}, {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY}, {@link GL31#GL_PROXY_TEXTURE_RECTANGLE}, {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP}
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<p/>{@link GL11#GL_RED}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL30#GL_R8}, {@link GL31#GL_R8_SNORM}, {@link GL30#GL_R16}, {@link GL31#GL_R16_SNORM}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL30#GL_RG16}, {@link GL31#GL_RG16_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL33#GL_RGB10_A2UI}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_R16F}, {@link GL30#GL_RG16F}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_R32F}, {@link GL30#GL_RG32F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL30#GL_RGB9_E5}, {@link GL30#GL_R8I}, {@link GL30#GL_R8UI}, {@link GL30#GL_R16I}, {@link GL30#GL_R16UI}, {@link GL30#GL_R32I}, {@link GL30#GL_R32UI}, {@link GL30#GL_RG8I}, {@link GL30#GL_RG8UI}, {@link GL30#GL_RG16I}, {@link GL30#GL_RG16UI}, {@link GL30#GL_RG32I}, {@link GL30#GL_RG32UI}, {@link GL30#GL_RGB8I}, {@link GL30#GL_RGB8UI}, {@link GL30#GL_RGB16I}, {@link GL30#GL_RGB16UI}, {@link GL30#GL_RGB32I}, {@link GL30#GL_RGB32UI}, {@link GL30#GL_RGBA8I}, {@link GL30#GL_RGBA8UI}, {@link GL30#GL_RGBA16I}, {@link GL30#GL_RGBA16UI}, {@link GL30#GL_RGBA32I}, {@link GL30#GL_RGBA32UI}, {@link GL14#GL_DEPTH_COMPONENT16}, {@link GL14#GL_DEPTH_COMPONENT24}, {@link GL14#GL_DEPTH_COMPONENT32}, {@link GL30#GL_DEPTH24_STENCIL8}, {@link GL30#GL_DEPTH_COMPONENT32F}, {@link GL30#GL_DEPTH32F_STENCIL8}, {@link GL30#GL_COMPRESSED_RED}, {@link GL30#GL_COMPRESSED_RG}, {@link GL13#GL_COMPRESSED_RGB}, {@link GL13#GL_COMPRESSED_RGBA}, {@link GL21#GL_COMPRESSED_SRGB}, {@link GL21#GL_COMPRESSED_SRGB_ALPHA}, {@link GL30#GL_COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<p/>{@link GL11#GL_STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER}, {@link GL30#GL_RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER}
	 * @param type           the texel data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link GL11#GL_FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP}
	 * @param pixels         the texel data
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
		long __functionAddress = getInstance().glTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, width * height * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixelsOffset) {
		long __functionAddress = getInstance().glTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixelsOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
		long __functionAddress = getInstance().glTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** IntBuffer version of: {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
		long __functionAddress = getInstance().glTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
		long __functionAddress = getInstance().glTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
		long __functionAddress = getInstance().glTexImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 3);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddress(pixels), __functionAddress);
	}

	// --- [ glTexImage1D ] ---

	/** JNI method for {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)} */
	public static native void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexImage1D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * One-dimensional version of {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)}}.
	 *
	 * @param target         the texture target. One of:<p/>{@link #GL_TEXTURE_1D}, {@link #GL_PROXY_TEXTURE_1D}
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format
	 * @param width          the texture width
	 * @param border         the texture border width
	 * @param format         the texel data format
	 * @param type           the texel data type
	 * @param pixels         the texel data
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
		long __functionAddress = getInstance().glTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, width * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixelsOffset) {
		long __functionAddress = getInstance().glTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglTexImage1D(target, level, internalformat, width, border, format, type, pixelsOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
		long __functionAddress = getInstance().glTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** IntBuffer version of: {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
		long __functionAddress = getInstance().glTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
		long __functionAddress = getInstance().glTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
		long __functionAddress = getInstance().glTexImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * GLChecks.getPixelBytes(format, type)) >> 3);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddress(pixels), __functionAddress);
	}

	// --- [ glCopyTexImage2D ] ---

	/** JNI method for {@link #glCopyTexImage2D(int, int, int, int, int, int, int, int)} */
	public static native void nglCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCopyTexImage2D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Defines a two-dimensional texel array in exactly the manner of {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)}, except that the image data are taken from the framebuffer rather
	 * than from client memory.
	 * <p/>
	 * {@code x}, {@code y}, {@code width}, and {@code height} correspond precisely to the corresponding arguments to {@link #glReadPixels(int, int, int, int, int, int, ByteBuffer)}; they specify the
	 * image's width and height, and the lower left (x, y) coordinates of the framebuffer region to be copied.
	 * <p/>
	 * The image is taken from the framebuffer exactly as if these arguments were passed to {@link #glCopyPixels(int, int, int, int, int)} with argument type set to {@link #GL_COLOR},
	 * {@link #GL_DEPTH}, or {@link GL30#GL_DEPTH_STENCIL}, depending on {@code internalformat}. RGBA data is taken from the current color buffer, while depth
	 * component and stencil index data are taken from the depth and stencil buffers, respectively.
	 * <p/>
	 * Subsequent processing is identical to that described for {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)}, beginning with clamping of the R, G, B, A, or depth values, and masking
	 * of the stencil index values from the resulting pixel groups. Parameters {@code level}, {@code internalformat}, and {@code border} are specified using
	 * the same values, with the same meanings, as the corresponding arguments of {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)}.
	 * <p/>
	 * The constraints on width, height, and border are exactly those for the corresponding arguments of {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)}.
	 *
	 * @param target         the texture target. One of:<p/>{@link GL11#GL_TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP}
	 * @param level          the level-of-detail number
	 * @param internalFormat the texture internal format. See {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} for a list of supported formats.
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 */
	public static void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
		long __functionAddress = getInstance().glCopyTexImage2D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyTexImage2D(target, level, internalFormat, x, y, width, height, border, __functionAddress);
	}

	// --- [ glCopyTexImage1D ] ---

	/** JNI method for {@link #glCopyTexImage1D(int, int, int, int, int, int, int)} */
	public static native void nglCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCopyTexImage1D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Defines a one-dimensional texel array in exactly the manner of {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)}, except that the image data are taken from the framebuffer rather
	 * than from client memory. For the purposes of decoding the texture image, {@code CopyTexImage1D} is equivalent to calling {@link #glCopyTexImage2D(int, int, int, int, int, int, int, int)}
	 * with corresponding arguments and height of 1, except that the height of the image is always 1, regardless of the value of border. level, internalformat,
	 * and border are specified using the same values, with the same meanings, as the corresponding arguments of {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)}. The constraints on
	 * width and border are exactly those of the corresponding arguments of {@link #glTexImage1D(int, int, int, int, int, int, int, ByteBuffer)}.
	 *
	 * @param target         the texture target. Must be:<p/>{@link #GL_TEXTURE_1D}
	 * @param level          the level-of-detail number
	 * @param internalFormat the texture internal format. See {@link #glTexImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} for a list of supported formats.
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the texture width
	 * @param border         the texture border width
	 */
	public static void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
		long __functionAddress = getInstance().glCopyTexImage1D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyTexImage1D(target, level, internalFormat, x, y, width, border, __functionAddress);
	}

	// --- [ glCopyTexSubImage1D ] ---

	/** JNI method for {@link #glCopyTexSubImage1D(int, int, int, int, int, int)} */
	public static native void nglCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCopyTexSubImage1D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width} or {@code border}
	 * parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See {@link #glCopyTexImage1D(int, int, int, int, int, int, int)} for more
	 * details.
	 *
	 * @param target  the texture target. Must be:<p/>{@link #GL_TEXTURE_1D}
	 * @param level   the level-of-detail number
	 * @param xoffset the left texel coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 */
	public static void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
		long __functionAddress = getInstance().glCopyTexSubImage1D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyTexSubImage1D(target, level, xoffset, x, y, width, __functionAddress);
	}

	// --- [ glCopyTexSubImage2D ] ---

	/** JNI method for {@link #glCopyTexSubImage2D(int, int, int, int, int, int, int, int)} */
	public static native void nglCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCopyTexSubImage2D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width}, {@code height},
	 * or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See
	 * {@link #glCopyTexImage2D(int, int, int, int, int, int, int, int)} for more details.
	 *
	 * @param target  the texture target. One of:<p/>{@link GL11#GL_TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP}
	 * @param level   the level-of-detail number
	 * @param xoffset the left texel coordinate of the texture subregion to update
	 * @param yoffset the lower texel coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 * @param height  the texture subregion height
	 */
	public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().glCopyTexSubImage2D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glTexParameteri ] ---

	/** JNI method for {@link #glTexParameteri(int, int, int)} */
	public static native void nglTexParameteri(int target, int pname, int param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexParameteri.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the integer value of a texture parameter, which controls how the texel array is treated when specified or changed, and when applied to a fragment.
	 *
	 * @param target the texture target. One of:<p/>{@link #GL_TEXTURE_1D}, {@link #GL_TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL30#GL_TEXTURE_2D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param pname  the parameter to set. One of:<p/>{@link GL12#GL_TEXTURE_BASE_LEVEL}, {@link #GL_TEXTURE_BORDER_COLOR}, {@link GL14#GL_TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC}, {@link GL14#GL_TEXTURE_LOD_BIAS}, {@link #GL_TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MAX_LEVEL}, {@link GL12#GL_TEXTURE_MAX_LOD}, {@link #GL_TEXTURE_MIN_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD}, {@link #GL_TEXTURE_PRIORITY}, {@link GL33#GL_TEXTURE_SWIZZLE_R}, {@link GL33#GL_TEXTURE_SWIZZLE_G}, {@link GL33#GL_TEXTURE_SWIZZLE_B}, {@link GL33#GL_TEXTURE_SWIZZLE_A}, {@link GL33#GL_TEXTURE_SWIZZLE_RGBA}, {@link #GL_TEXTURE_WRAP_S}, {@link #GL_TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R}, {@link GL14#GL_DEPTH_TEXTURE_MODE}, {@link GL14#GL_GENERATE_MIPMAP}
	 * @param param  the parameter value
	 */
	public static void glTexParameteri(int target, int pname, int param) {
		long __functionAddress = getInstance().glTexParameteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexParameteri(target, pname, param, __functionAddress);
	}

	// --- [ glTexParameteriv ] ---

	/** JNI method for {@link #glTexParameteri(int, int, ByteBuffer)} */
	public static native void nglTexParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glTexParameteri(int, int, int)}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglTexParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexParameteri(int, int, ByteBuffer)} */
	public static void glTexParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glTexParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglTexParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	// --- [ glTexParameterf ] ---

	/** JNI method for {@link #glTexParameterf(int, int, float)} */
	public static native void nglTexParameterf(int target, int pname, float param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexParameterf.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glTexParameteri(int, int, int)}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
	public static void glTexParameterf(int target, int pname, float param) {
		long __functionAddress = getInstance().glTexParameterf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexParameterf(target, pname, param, __functionAddress);
	}

	// --- [ glTexParameterfv ] ---

	/** JNI method for {@link #glTexParameterf(int, int, ByteBuffer)} */
	public static native void nglTexParameterfv(int target, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glTexParameterf(int, int, float)}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexParameterf(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glTexParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglTexParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glTexParameterf(int, int, ByteBuffer)} */
	public static void glTexParameter(int target, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glTexParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglTexParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	// --- [ glTexSubImage1D ] ---

	/** JNI method for {@link #glTexSubImage1D(int, int, int, int, int, int, ByteBuffer)} */
	public static native void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexSubImage1D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * One-dimensional version of {@link #glTexSubImage2D(int, int, int, int, int, int, int, int, ByteBuffer)}.
	 *
	 * @param target  the texture target. Must be:<p/>{@link #GL_TEXTURE_1D}
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<p/>{@link GL11#GL_STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER}, {@link GL30#GL_RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER}
	 * @param type    the pixel data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link GL11#GL_FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP}
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, width * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glTexSubImage1D(int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixelsOffset) {
		long __functionAddress = getInstance().glTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglTexSubImage1D(target, level, xoffset, width, format, type, pixelsOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glTexSubImage1D(int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels), __functionAddress);
	}

	/** IntBuffer version of: {@link #glTexSubImage1D(int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glTexSubImage1D(int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glTexSubImage1D(int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * GLChecks.getPixelBytes(format, type)) >> 3);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels), __functionAddress);
	}

	// --- [ glTexSubImage2D ] ---

	/** JNI method for {@link #glTexSubImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static native void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexSubImage2D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<p/>{@link GL11#GL_TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP}
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<p/>{@link GL11#GL_STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER}, {@link GL30#GL_RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER}
	 * @param type    the pixel data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link GL11#GL_FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP}
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, width * height * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glTexSubImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		long __functionAddress = getInstance().glTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixelsOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glTexSubImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** IntBuffer version of: {@link #glTexSubImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glTexSubImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glTexSubImage2D(int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 3);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels), __functionAddress);
	}

	// --- [ glTranslatef ] ---

	/** JNI method for {@link #glTranslatef(float, float, float)} */
	public static native void nglTranslatef(float x, float y, float z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Manipulates the current matrix with a translation matrix along the x-, y- and z- axes.
	 * <p/>
	 * Calling this function is equivalent to calling {@link #glMultMatrixf(ByteBuffer)} with the following matrix:
	 * <table border="1" cellspacing="0" cellpadding="2">
	 * 	<tr align="center"><td>1</td><td>0</td><td>0</td><td>x</td></tr>
	 * 	<tr align="center"><td>0</td><td>1</td><td>0</td><td>y</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>1</td><td>z</td></tr>
	 * 	<tr align="center"><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 *
	 * @param x the x-axis translation
	 * @param y the y-axis translation
	 * @param z the z-axis translation
	 */
	public static void glTranslatef(float x, float y, float z) {
		long __functionAddress = getInstance().glTranslatef;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTranslatef(x, y, z, __functionAddress);
	}

	// --- [ glTranslated ] ---

	/** JNI method for {@link #glTranslated(double, double, double)} */
	public static native void nglTranslated(double x, double y, double z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glTranslatef(float, float, float)}.
	 *
	 * @param x the x-axis translation
	 * @param y the y-axis translation
	 * @param z the z-axis translation
	 */
	public static void glTranslated(double x, double y, double z) {
		long __functionAddress = getInstance().glTranslated;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTranslated(x, y, z, __functionAddress);
	}

	// --- [ glVertex2f ] ---

	/** JNI method for {@link #glVertex2f(float, float)} */
	public static native void nglVertex2f(float x, float y, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies a single vertex between {@link #glBegin(int)} and {@link #glEnd()} by giving its coordinates in two dimensions. The z coordinate is implicitly set
	 * to zero and the w coordinate to one.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static void glVertex2f(float x, float y) {
		long __functionAddress = getInstance().glVertex2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2f(x, y, __functionAddress);
	}

	// --- [ glVertex2s ] ---

	/** JNI method for {@link #glVertex2s(short, short)} */
	public static native void nglVertex2s(short x, short y, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glVertex2f(float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static void glVertex2s(short x, short y) {
		long __functionAddress = getInstance().glVertex2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2s(x, y, __functionAddress);
	}

	// --- [ glVertex2i ] ---

	/** JNI method for {@link #glVertex2i(int, int)} */
	public static native void nglVertex2i(int x, int y, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glVertex2f(float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static void glVertex2i(int x, int y) {
		long __functionAddress = getInstance().glVertex2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2i(x, y, __functionAddress);
	}

	// --- [ glVertex2d ] ---

	/** JNI method for {@link #glVertex2d(double, double)} */
	public static native void nglVertex2d(double x, double y, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glVertex2f(float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static void glVertex2d(double x, double y) {
		long __functionAddress = getInstance().glVertex2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex2d(x, y, __functionAddress);
	}

	// --- [ glVertex2fv ] ---

	/** JNI method for {@link #glVertex2f(ByteBuffer)} */
	public static native void nglVertex2fv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex2f(float, float)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2f(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2 << 2);
		}
		nglVertex2fv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex2f(ByteBuffer)} */
	public static void glVertex2(FloatBuffer coords) {
		long __functionAddress = getInstance().glVertex2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2);
		}
		nglVertex2fv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex2sv ] ---

	/** JNI method for {@link #glVertex2s(ByteBuffer)} */
	public static native void nglVertex2sv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex2s(short, short)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2s(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2 << 1);
		}
		nglVertex2sv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex2s(ByteBuffer)} */
	public static void glVertex2(ShortBuffer coords) {
		long __functionAddress = getInstance().glVertex2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2);
		}
		nglVertex2sv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex2iv ] ---

	/** JNI method for {@link #glVertex2i(ByteBuffer)} */
	public static native void nglVertex2iv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex2i(int, int)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2i(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2 << 2);
		}
		nglVertex2iv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex2i(ByteBuffer)} */
	public static void glVertex2(IntBuffer coords) {
		long __functionAddress = getInstance().glVertex2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2);
		}
		nglVertex2iv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex2dv ] ---

	/** JNI method for {@link #glVertex2d(ByteBuffer)} */
	public static native void nglVertex2dv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex2d(double, double)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2d(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2 << 3);
		}
		nglVertex2dv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex2d(ByteBuffer)} */
	public static void glVertex2(DoubleBuffer coords) {
		long __functionAddress = getInstance().glVertex2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 2);
		}
		nglVertex2dv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex3f ] ---

	/** JNI method for {@link #glVertex3f(float, float, float)} */
	public static native void nglVertex3f(float x, float y, float z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies a single vertex between {@link #glBegin(int)} and {@link #glEnd()} by giving its coordinates in three dimensions. The w coordinate is implicitly set
	 * to one.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static void glVertex3f(float x, float y, float z) {
		long __functionAddress = getInstance().glVertex3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3f(x, y, z, __functionAddress);
	}

	// --- [ glVertex3s ] ---

	/** JNI method for {@link #glVertex3s(short, short, short)} */
	public static native void nglVertex3s(short x, short y, short z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glVertex3f(float, float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static void glVertex3s(short x, short y, short z) {
		long __functionAddress = getInstance().glVertex3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3s(x, y, z, __functionAddress);
	}

	// --- [ glVertex3i ] ---

	/** JNI method for {@link #glVertex3i(int, int, int)} */
	public static native void nglVertex3i(int x, int y, int z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glVertex3f(float, float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static void glVertex3i(int x, int y, int z) {
		long __functionAddress = getInstance().glVertex3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3i(x, y, z, __functionAddress);
	}

	// --- [ glVertex3d ] ---

	/** JNI method for {@link #glVertex3d(double, double, double)} */
	public static native void nglVertex3d(double x, double y, double z, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glVertex3f(float, float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static void glVertex3d(double x, double y, double z) {
		long __functionAddress = getInstance().glVertex3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex3d(x, y, z, __functionAddress);
	}

	// --- [ glVertex3fv ] ---

	/** JNI method for {@link #glVertex3f(ByteBuffer)} */
	public static native void nglVertex3fv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex3f(float, float, float)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3f(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3 << 2);
		}
		nglVertex3fv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex3f(ByteBuffer)} */
	public static void glVertex3(FloatBuffer coords) {
		long __functionAddress = getInstance().glVertex3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3);
		}
		nglVertex3fv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex3sv ] ---

	/** JNI method for {@link #glVertex3s(ByteBuffer)} */
	public static native void nglVertex3sv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex3s(short, short, short)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3s(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3 << 1);
		}
		nglVertex3sv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex3s(ByteBuffer)} */
	public static void glVertex3(ShortBuffer coords) {
		long __functionAddress = getInstance().glVertex3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3);
		}
		nglVertex3sv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex3iv ] ---

	/** JNI method for {@link #glVertex3i(ByteBuffer)} */
	public static native void nglVertex3iv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex3i(int, int, int)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3i(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3 << 2);
		}
		nglVertex3iv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex3i(ByteBuffer)} */
	public static void glVertex3(IntBuffer coords) {
		long __functionAddress = getInstance().glVertex3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3);
		}
		nglVertex3iv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex3dv ] ---

	/** JNI method for {@link #glVertex3d(ByteBuffer)} */
	public static native void nglVertex3dv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex3d(double, double, double)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3d(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3 << 3);
		}
		nglVertex3dv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex3d(ByteBuffer)} */
	public static void glVertex3(DoubleBuffer coords) {
		long __functionAddress = getInstance().glVertex3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 3);
		}
		nglVertex3dv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex4f ] ---

	/** JNI method for {@link #glVertex4f(float, float, float, float)} */
	public static native void nglVertex4f(float x, float y, float z, float w, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies a single vertex between {@link #glBegin(int)} and {@link #glEnd()} by giving its coordinates in four dimensions.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static void glVertex4f(float x, float y, float z, float w) {
		long __functionAddress = getInstance().glVertex4f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4f(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4s ] ---

	/** JNI method for {@link #glVertex4s(short, short, short, short)} */
	public static native void nglVertex4s(short x, short y, short z, short w, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Short version of {@link #glVertex4f(float, float, float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static void glVertex4s(short x, short y, short z, short w) {
		long __functionAddress = getInstance().glVertex4s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4s(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4i ] ---

	/** JNI method for {@link #glVertex4i(int, int, int, int)} */
	public static native void nglVertex4i(int x, int y, int z, int w, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Integer version of {@link #glVertex4f(float, float, float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static void glVertex4i(int x, int y, int z, int w) {
		long __functionAddress = getInstance().glVertex4i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4i(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4d ] ---

	/** JNI method for {@link #glVertex4d(double, double, double, double)} */
	public static native void nglVertex4d(double x, double y, double z, double w, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Double version of {@link #glVertex4f(float, float, float, float)}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static void glVertex4d(double x, double y, double z, double w) {
		long __functionAddress = getInstance().glVertex4d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertex4d(x, y, z, w, __functionAddress);
	}

	// --- [ glVertex4fv ] ---

	/** JNI method for {@link #glVertex4f(ByteBuffer)} */
	public static native void nglVertex4fv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex4f(float, float, float, float)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4f(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4 << 2);
		}
		nglVertex4fv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex4f(ByteBuffer)} */
	public static void glVertex4(FloatBuffer coords) {
		long __functionAddress = getInstance().glVertex4fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4);
		}
		nglVertex4fv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex4sv ] ---

	/** JNI method for {@link #glVertex4s(ByteBuffer)} */
	public static native void nglVertex4sv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex4s(short, short, short, short)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4s(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4 << 1);
		}
		nglVertex4sv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex4s(ByteBuffer)} */
	public static void glVertex4(ShortBuffer coords) {
		long __functionAddress = getInstance().glVertex4sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4);
		}
		nglVertex4sv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex4iv ] ---

	/** JNI method for {@link #glVertex4i(ByteBuffer)} */
	public static native void nglVertex4iv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex4i(int, int, int, int)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4i(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4 << 2);
		}
		nglVertex4iv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex4i(ByteBuffer)} */
	public static void glVertex4(IntBuffer coords) {
		long __functionAddress = getInstance().glVertex4iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4);
		}
		nglVertex4iv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertex4dv ] ---

	/** JNI method for {@link #glVertex4d(ByteBuffer)} */
	public static native void nglVertex4dv(long coords, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Pointer version of {@link #glVertex4d(double, double, double, double)}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4d(ByteBuffer coords) {
		long __functionAddress = getInstance().glVertex4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4 << 3);
		}
		nglVertex4dv(memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glVertex4d(ByteBuffer)} */
	public static void glVertex4(DoubleBuffer coords) {
		long __functionAddress = getInstance().glVertex4dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 4);
		}
		nglVertex4dv(memAddress(coords), __functionAddress);
	}

	// --- [ glVertexPointer ] ---

	/** JNI method for {@link #glVertexPointer(int, int, int, ByteBuffer)} */
	public static native void nglVertexPointer(int size, int type, int stride, long pointer, long __functionAddress);

	/**
	 * <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Specifies the location and organization of a vertex array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<p/>2, 3, 4
	 * @param type    the data type of the values stored in the array. One of:<p/>{@link #GL_SHORT}, {@link #GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link #GL_FLOAT}, {@link #GL_DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glVertexPointer(int size, int type, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().glVertexPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglVertexPointer(size, type, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glVertexPointer(int, int, int, ByteBuffer)} */
	public static void glVertexPointer(int size, int type, int stride, long pointerOffset) {
		long __functionAddress = getInstance().glVertexPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, true);
		}
		nglVertexPointer(size, type, stride, pointerOffset, __functionAddress);
	}

	/** GL_SHORT version of: {@link #glVertexPointer(int, int, int, ByteBuffer)} */
	public static void glVertexPointer(int size, int stride, ShortBuffer pointer) {
		long __functionAddress = getInstance().glVertexPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglVertexPointer(size, GL11.GL_SHORT, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_INT version of: {@link #glVertexPointer(int, int, int, ByteBuffer)} */
	public static void glVertexPointer(int size, int stride, IntBuffer pointer) {
		long __functionAddress = getInstance().glVertexPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglVertexPointer(size, GL11.GL_INT, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_FLOAT version of: {@link #glVertexPointer(int, int, int, ByteBuffer)} */
	public static void glVertexPointer(int size, int stride, FloatBuffer pointer) {
		long __functionAddress = getInstance().glVertexPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglVertexPointer(size, GL11.GL_FLOAT, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_DOUBLE version of: {@link #glVertexPointer(int, int, int, ByteBuffer)} */
	public static void glVertexPointer(int size, int stride, DoubleBuffer pointer) {
		long __functionAddress = getInstance().glVertexPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8894, false);
		}
		nglVertexPointer(size, GL11.GL_DOUBLE, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glViewport ] ---

	/** JNI method for {@link #glViewport(int, int, int, int)} */
	public static native void nglViewport(int x, int y, int w, int h, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glViewport.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the viewport transformation parameters for all viewports.
	 * <p/>
	 * The location of the viewport's bottom-left corner, given by {@code (x, y)}, are clamped to be within the implementation-dependent viewport bounds range.
	 * The viewport bounds range {@code [min, max]} tuple may be determined by calling {@link #glGetFloat(int, FloatBuffer)} with the symbolic constant
	 * {@link GL41#GL_VIEWPORT_BOUNDS_RANGE}. Viewport width and height are clamped to implementation-dependent maximums when specified. The maximum width and
	 * height may be found by calling {@link #glGetFloat(int, FloatBuffer)} with the symbolic constant {@link #GL_MAX_VIEWPORT_DIMS}. The maximum viewport
	 * dimensions must be greater than or equal to the larger of the visible dimensions of the display being rendered to (if a display exists), and the largest
	 * renderbuffer image which can be successfully created and attached to a framebuffer object.
	 * <p/>
	 * In the initial state, {@code w} and {@code h} for each viewport are set to the width and height, respectively, of the window into which the GL is to do
	 * its rendering. If the default framebuffer is bound but no default framebuffer is associated with the GL context, then {@code w} and {@code h} are
	 * initially set to zero.
	 *
	 * @param x the left viewport coordinate
	 * @param y the bottom viewport coordinate
	 * @param w the viewport width
	 * @param h the viewport height
	 */
	public static void glViewport(int x, int y, int w, int h) {
		long __functionAddress = getInstance().glViewport;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglViewport(x, y, w, h, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GL11;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("OpenGL11") ) return null;

		Functions funcs = new Functions(provider, fc);

		boolean supported = 
			GL.isFunctionSupported(funcs.glEnable) &&
			GL.isFunctionSupported(funcs.glDisable) &&
			GL.isFunctionSupported(funcs.glAccum, fc) &&
			GL.isFunctionSupported(funcs.glAlphaFunc, fc) &&
			GL.isFunctionSupported(funcs.glAreTexturesResident, fc) &&
			GL.isFunctionSupported(funcs.glArrayElement) &&
			GL.isFunctionSupported(funcs.glBegin, fc) &&
			GL.isFunctionSupported(funcs.glBindTexture) &&
			GL.isFunctionSupported(funcs.glBitmap, fc) &&
			GL.isFunctionSupported(funcs.glBlendFunc) &&
			GL.isFunctionSupported(funcs.glCallList, fc) &&
			GL.isFunctionSupported(funcs.glCallLists, fc) &&
			GL.isFunctionSupported(funcs.glClear) &&
			GL.isFunctionSupported(funcs.glClearAccum, fc) &&
			GL.isFunctionSupported(funcs.glClearColor) &&
			GL.isFunctionSupported(funcs.glClearDepth) &&
			GL.isFunctionSupported(funcs.glClearStencil) &&
			GL.isFunctionSupported(funcs.glClipPlane) &&
			GL.isFunctionSupported(funcs.glColor3b, fc) &&
			GL.isFunctionSupported(funcs.glColor3s, fc) &&
			GL.isFunctionSupported(funcs.glColor3i, fc) &&
			GL.isFunctionSupported(funcs.glColor3f, fc) &&
			GL.isFunctionSupported(funcs.glColor3d, fc) &&
			GL.isFunctionSupported(funcs.glColor3ub, fc) &&
			GL.isFunctionSupported(funcs.glColor3us, fc) &&
			GL.isFunctionSupported(funcs.glColor3ui, fc) &&
			GL.isFunctionSupported(funcs.glColor3bv, fc) &&
			GL.isFunctionSupported(funcs.glColor3sv, fc) &&
			GL.isFunctionSupported(funcs.glColor3iv, fc) &&
			GL.isFunctionSupported(funcs.glColor3fv, fc) &&
			GL.isFunctionSupported(funcs.glColor3dv, fc) &&
			GL.isFunctionSupported(funcs.glColor3ubv, fc) &&
			GL.isFunctionSupported(funcs.glColor3usv, fc) &&
			GL.isFunctionSupported(funcs.glColor3uiv, fc) &&
			GL.isFunctionSupported(funcs.glColor4b, fc) &&
			GL.isFunctionSupported(funcs.glColor4s, fc) &&
			GL.isFunctionSupported(funcs.glColor4i, fc) &&
			GL.isFunctionSupported(funcs.glColor4f, fc) &&
			GL.isFunctionSupported(funcs.glColor4d, fc) &&
			GL.isFunctionSupported(funcs.glColor4ub, fc) &&
			GL.isFunctionSupported(funcs.glColor4us, fc) &&
			GL.isFunctionSupported(funcs.glColor4ui, fc) &&
			GL.isFunctionSupported(funcs.glColor4bv, fc) &&
			GL.isFunctionSupported(funcs.glColor4sv, fc) &&
			GL.isFunctionSupported(funcs.glColor4iv, fc) &&
			GL.isFunctionSupported(funcs.glColor4fv, fc) &&
			GL.isFunctionSupported(funcs.glColor4dv, fc) &&
			GL.isFunctionSupported(funcs.glColor4ubv, fc) &&
			GL.isFunctionSupported(funcs.glColor4usv, fc) &&
			GL.isFunctionSupported(funcs.glColor4uiv, fc) &&
			GL.isFunctionSupported(funcs.glColorMask) &&
			GL.isFunctionSupported(funcs.glColorMaterial, fc) &&
			GL.isFunctionSupported(funcs.glColorPointer, fc) &&
			GL.isFunctionSupported(funcs.glCopyPixels) &&
			GL.isFunctionSupported(funcs.glCullFace) &&
			GL.isFunctionSupported(funcs.glDeleteLists, fc) &&
			GL.isFunctionSupported(funcs.glDepthFunc) &&
			GL.isFunctionSupported(funcs.glDepthMask) &&
			GL.isFunctionSupported(funcs.glDepthRange) &&
			GL.isFunctionSupported(funcs.glDisableClientState, fc) &&
			GL.isFunctionSupported(funcs.glDrawArrays) &&
			GL.isFunctionSupported(funcs.glDrawBuffer) &&
			GL.isFunctionSupported(funcs.glDrawElements) &&
			GL.isFunctionSupported(funcs.glDrawPixels, fc) &&
			GL.isFunctionSupported(funcs.glEdgeFlag, fc) &&
			GL.isFunctionSupported(funcs.glEdgeFlagv, fc) &&
			GL.isFunctionSupported(funcs.glEdgeFlagPointer, fc) &&
			GL.isFunctionSupported(funcs.glEnableClientState, fc) &&
			GL.isFunctionSupported(funcs.glEnd, fc) &&
			GL.isFunctionSupported(funcs.glEvalCoord1f, fc) &&
			GL.isFunctionSupported(funcs.glEvalCoord1fv, fc) &&
			GL.isFunctionSupported(funcs.glEvalCoord1d, fc) &&
			GL.isFunctionSupported(funcs.glEvalCoord1dv, fc) &&
			GL.isFunctionSupported(funcs.glEvalCoord2f, fc) &&
			GL.isFunctionSupported(funcs.glEvalCoord2fv, fc) &&
			GL.isFunctionSupported(funcs.glEvalCoord2d, fc) &&
			GL.isFunctionSupported(funcs.glEvalCoord2dv, fc) &&
			GL.isFunctionSupported(funcs.glEvalMesh1, fc) &&
			GL.isFunctionSupported(funcs.glEvalMesh2, fc) &&
			GL.isFunctionSupported(funcs.glEvalPoint1, fc) &&
			GL.isFunctionSupported(funcs.glEvalPoint2, fc) &&
			GL.isFunctionSupported(funcs.glFeedbackBuffer, fc) &&
			GL.isFunctionSupported(funcs.glFinish) &&
			GL.isFunctionSupported(funcs.glFlush) &&
			GL.isFunctionSupported(funcs.glFogi, fc) &&
			GL.isFunctionSupported(funcs.glFogiv, fc) &&
			GL.isFunctionSupported(funcs.glFogf, fc) &&
			GL.isFunctionSupported(funcs.glFogfv, fc) &&
			GL.isFunctionSupported(funcs.glFrontFace) &&
			GL.isFunctionSupported(funcs.glGenLists, fc) &&
			GL.isFunctionSupported(funcs.glGenTextures) &&
			GL.isFunctionSupported(funcs.glDeleteTextures) &&
			GL.isFunctionSupported(funcs.glGetClipPlane) &&
			GL.isFunctionSupported(funcs.glGetBooleanv) &&
			GL.isFunctionSupported(funcs.glGetFloatv) &&
			GL.isFunctionSupported(funcs.glGetIntegerv) &&
			GL.isFunctionSupported(funcs.glGetDoublev) &&
			GL.isFunctionSupported(funcs.glGetError) &&
			GL.isFunctionSupported(funcs.glGetLightiv, fc) &&
			GL.isFunctionSupported(funcs.glGetLightfv, fc) &&
			GL.isFunctionSupported(funcs.glGetMapiv, fc) &&
			GL.isFunctionSupported(funcs.glGetMapfv, fc) &&
			GL.isFunctionSupported(funcs.glGetMapdv, fc) &&
			GL.isFunctionSupported(funcs.glGetMaterialiv, fc) &&
			GL.isFunctionSupported(funcs.glGetMaterialfv, fc) &&
			GL.isFunctionSupported(funcs.glGetPixelMapfv, fc) &&
			GL.isFunctionSupported(funcs.glGetPixelMapusv, fc) &&
			GL.isFunctionSupported(funcs.glGetPixelMapuiv, fc) &&
			GL.isFunctionSupported(funcs.glGetPointerv) &&
			GL.isFunctionSupported(funcs.glGetPolygonStipple, fc) &&
			GL.isFunctionSupported(funcs.glGetString) &&
			GL.isFunctionSupported(funcs.glGetTexEnviv) &&
			GL.isFunctionSupported(funcs.glGetTexEnvfv) &&
			GL.isFunctionSupported(funcs.glGetTexGeniv, fc) &&
			GL.isFunctionSupported(funcs.glGetTexGenfv, fc) &&
			GL.isFunctionSupported(funcs.glGetTexGendv, fc) &&
			GL.isFunctionSupported(funcs.glGetTexImage) &&
			GL.isFunctionSupported(funcs.glGetTexLevelParameteriv) &&
			GL.isFunctionSupported(funcs.glGetTexLevelParameterfv) &&
			GL.isFunctionSupported(funcs.glGetTexParameteriv) &&
			GL.isFunctionSupported(funcs.glGetTexParameterfv) &&
			GL.isFunctionSupported(funcs.glHint) &&
			GL.isFunctionSupported(funcs.glInitNames, fc) &&
			GL.isFunctionSupported(funcs.glInterleavedArrays) &&
			GL.isFunctionSupported(funcs.glIsEnabled) &&
			GL.isFunctionSupported(funcs.glIsList, fc) &&
			GL.isFunctionSupported(funcs.glIsTexture) &&
			GL.isFunctionSupported(funcs.glLightModeli, fc) &&
			GL.isFunctionSupported(funcs.glLightModelf, fc) &&
			GL.isFunctionSupported(funcs.glLightModeliv, fc) &&
			GL.isFunctionSupported(funcs.glLightModelfv, fc) &&
			GL.isFunctionSupported(funcs.glLighti, fc) &&
			GL.isFunctionSupported(funcs.glLightf, fc) &&
			GL.isFunctionSupported(funcs.glLightiv, fc) &&
			GL.isFunctionSupported(funcs.glLightfv, fc) &&
			GL.isFunctionSupported(funcs.glLineStipple, fc) &&
			GL.isFunctionSupported(funcs.glLineWidth) &&
			GL.isFunctionSupported(funcs.glListBase, fc) &&
			GL.isFunctionSupported(funcs.glLoadMatrixf, fc) &&
			GL.isFunctionSupported(funcs.glLoadMatrixd, fc) &&
			GL.isFunctionSupported(funcs.glLoadIdentity, fc) &&
			GL.isFunctionSupported(funcs.glLoadName, fc) &&
			GL.isFunctionSupported(funcs.glLogicOp) &&
			GL.isFunctionSupported(funcs.glMap1f, fc) &&
			GL.isFunctionSupported(funcs.glMap1d, fc) &&
			GL.isFunctionSupported(funcs.glMap2f, fc) &&
			GL.isFunctionSupported(funcs.glMap2d, fc) &&
			GL.isFunctionSupported(funcs.glMapGrid1f, fc) &&
			GL.isFunctionSupported(funcs.glMapGrid1d, fc) &&
			GL.isFunctionSupported(funcs.glMapGrid2f, fc) &&
			GL.isFunctionSupported(funcs.glMapGrid2d, fc) &&
			GL.isFunctionSupported(funcs.glMateriali, fc) &&
			GL.isFunctionSupported(funcs.glMaterialf, fc) &&
			GL.isFunctionSupported(funcs.glMaterialiv, fc) &&
			GL.isFunctionSupported(funcs.glMaterialfv, fc) &&
			GL.isFunctionSupported(funcs.glMatrixMode, fc) &&
			GL.isFunctionSupported(funcs.glMultMatrixf, fc) &&
			GL.isFunctionSupported(funcs.glMultMatrixd, fc) &&
			GL.isFunctionSupported(funcs.glFrustum, fc) &&
			GL.isFunctionSupported(funcs.glNewList, fc) &&
			GL.isFunctionSupported(funcs.glEndList, fc) &&
			GL.isFunctionSupported(funcs.glNormal3f, fc) &&
			GL.isFunctionSupported(funcs.glNormal3b, fc) &&
			GL.isFunctionSupported(funcs.glNormal3s, fc) &&
			GL.isFunctionSupported(funcs.glNormal3i, fc) &&
			GL.isFunctionSupported(funcs.glNormal3d, fc) &&
			GL.isFunctionSupported(funcs.glNormal3fv, fc) &&
			GL.isFunctionSupported(funcs.glNormal3bv, fc) &&
			GL.isFunctionSupported(funcs.glNormal3sv, fc) &&
			GL.isFunctionSupported(funcs.glNormal3iv, fc) &&
			GL.isFunctionSupported(funcs.glNormal3dv, fc) &&
			GL.isFunctionSupported(funcs.glNormalPointer, fc) &&
			GL.isFunctionSupported(funcs.glOrtho, fc) &&
			GL.isFunctionSupported(funcs.glPassThrough, fc) &&
			GL.isFunctionSupported(funcs.glPixelMapfv, fc) &&
			GL.isFunctionSupported(funcs.glPixelMapusv, fc) &&
			GL.isFunctionSupported(funcs.glPixelMapuiv, fc) &&
			GL.isFunctionSupported(funcs.glPixelStorei) &&
			GL.isFunctionSupported(funcs.glPixelStoref) &&
			GL.isFunctionSupported(funcs.glPixelTransferi, fc) &&
			GL.isFunctionSupported(funcs.glPixelTransferf, fc) &&
			GL.isFunctionSupported(funcs.glPixelZoom, fc) &&
			GL.isFunctionSupported(funcs.glPointSize) &&
			GL.isFunctionSupported(funcs.glPolygonMode) &&
			GL.isFunctionSupported(funcs.glPolygonOffset) &&
			GL.isFunctionSupported(funcs.glPolygonStipple, fc) &&
			GL.isFunctionSupported(funcs.glPushAttrib, fc) &&
			GL.isFunctionSupported(funcs.glPushClientAttrib, fc) &&
			GL.isFunctionSupported(funcs.glPopAttrib, fc) &&
			GL.isFunctionSupported(funcs.glPopClientAttrib, fc) &&
			GL.isFunctionSupported(funcs.glPopMatrix, fc) &&
			GL.isFunctionSupported(funcs.glPopName, fc) &&
			GL.isFunctionSupported(funcs.glPrioritizeTextures, fc) &&
			GL.isFunctionSupported(funcs.glPushMatrix, fc) &&
			GL.isFunctionSupported(funcs.glPushName, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos2i, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos2s, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos2f, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos2d, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos2iv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos2sv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos2fv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos2dv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos3i, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos3s, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos3f, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos3d, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos3iv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos3sv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos3fv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos3dv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos4i, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos4s, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos4f, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos4d, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos4iv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos4sv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos4fv, fc) &&
			GL.isFunctionSupported(funcs.glRasterPos4dv, fc) &&
			GL.isFunctionSupported(funcs.glReadBuffer) &&
			GL.isFunctionSupported(funcs.glReadPixels) &&
			GL.isFunctionSupported(funcs.glRecti, fc) &&
			GL.isFunctionSupported(funcs.glRects, fc) &&
			GL.isFunctionSupported(funcs.glRectf, fc) &&
			GL.isFunctionSupported(funcs.glRectd, fc) &&
			GL.isFunctionSupported(funcs.glRectiv, fc) &&
			GL.isFunctionSupported(funcs.glRectsv, fc) &&
			GL.isFunctionSupported(funcs.glRectfv, fc) &&
			GL.isFunctionSupported(funcs.glRectdv, fc) &&
			GL.isFunctionSupported(funcs.glRenderMode, fc) &&
			GL.isFunctionSupported(funcs.glRotatef, fc) &&
			GL.isFunctionSupported(funcs.glRotated, fc) &&
			GL.isFunctionSupported(funcs.glScalef, fc) &&
			GL.isFunctionSupported(funcs.glScaled, fc) &&
			GL.isFunctionSupported(funcs.glScissor) &&
			GL.isFunctionSupported(funcs.glSelectBuffer, fc) &&
			GL.isFunctionSupported(funcs.glShadeModel, fc) &&
			GL.isFunctionSupported(funcs.glStencilFunc) &&
			GL.isFunctionSupported(funcs.glStencilMask) &&
			GL.isFunctionSupported(funcs.glStencilOp) &&
			GL.isFunctionSupported(funcs.glTexCoord1f, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord1s, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord1i, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord1d, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord1fv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord1sv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord1iv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord1dv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord2f, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord2s, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord2i, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord2d, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord2fv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord2sv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord2iv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord2dv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord3f, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord3s, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord3i, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord3d, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord3fv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord3sv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord3iv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord3dv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord4f, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord4s, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord4i, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord4d, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord4fv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord4sv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord4iv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoord4dv, fc) &&
			GL.isFunctionSupported(funcs.glTexCoordPointer, fc) &&
			GL.isFunctionSupported(funcs.glTexEnvi) &&
			GL.isFunctionSupported(funcs.glTexEnviv) &&
			GL.isFunctionSupported(funcs.glTexEnvf) &&
			GL.isFunctionSupported(funcs.glTexEnvfv) &&
			GL.isFunctionSupported(funcs.glTexGeni, fc) &&
			GL.isFunctionSupported(funcs.glTexGeniv, fc) &&
			GL.isFunctionSupported(funcs.glTexGenf, fc) &&
			GL.isFunctionSupported(funcs.glTexGenfv, fc) &&
			GL.isFunctionSupported(funcs.glTexGend, fc) &&
			GL.isFunctionSupported(funcs.glTexGendv, fc) &&
			GL.isFunctionSupported(funcs.glTexImage2D) &&
			GL.isFunctionSupported(funcs.glTexImage1D) &&
			GL.isFunctionSupported(funcs.glCopyTexImage2D) &&
			GL.isFunctionSupported(funcs.glCopyTexImage1D) &&
			GL.isFunctionSupported(funcs.glCopyTexSubImage1D) &&
			GL.isFunctionSupported(funcs.glCopyTexSubImage2D) &&
			GL.isFunctionSupported(funcs.glTexParameteri) &&
			GL.isFunctionSupported(funcs.glTexParameteriv) &&
			GL.isFunctionSupported(funcs.glTexParameterf) &&
			GL.isFunctionSupported(funcs.glTexParameterfv) &&
			GL.isFunctionSupported(funcs.glTexSubImage1D) &&
			GL.isFunctionSupported(funcs.glTexSubImage2D) &&
			GL.isFunctionSupported(funcs.glTranslatef, fc) &&
			GL.isFunctionSupported(funcs.glTranslated, fc) &&
			GL.isFunctionSupported(funcs.glVertex2f, fc) &&
			GL.isFunctionSupported(funcs.glVertex2s, fc) &&
			GL.isFunctionSupported(funcs.glVertex2i, fc) &&
			GL.isFunctionSupported(funcs.glVertex2d, fc) &&
			GL.isFunctionSupported(funcs.glVertex2fv, fc) &&
			GL.isFunctionSupported(funcs.glVertex2sv, fc) &&
			GL.isFunctionSupported(funcs.glVertex2iv, fc) &&
			GL.isFunctionSupported(funcs.glVertex2dv, fc) &&
			GL.isFunctionSupported(funcs.glVertex3f, fc) &&
			GL.isFunctionSupported(funcs.glVertex3s, fc) &&
			GL.isFunctionSupported(funcs.glVertex3i, fc) &&
			GL.isFunctionSupported(funcs.glVertex3d, fc) &&
			GL.isFunctionSupported(funcs.glVertex3fv, fc) &&
			GL.isFunctionSupported(funcs.glVertex3sv, fc) &&
			GL.isFunctionSupported(funcs.glVertex3iv, fc) &&
			GL.isFunctionSupported(funcs.glVertex3dv, fc) &&
			GL.isFunctionSupported(funcs.glVertex4f, fc) &&
			GL.isFunctionSupported(funcs.glVertex4s, fc) &&
			GL.isFunctionSupported(funcs.glVertex4i, fc) &&
			GL.isFunctionSupported(funcs.glVertex4d, fc) &&
			GL.isFunctionSupported(funcs.glVertex4fv, fc) &&
			GL.isFunctionSupported(funcs.glVertex4sv, fc) &&
			GL.isFunctionSupported(funcs.glVertex4iv, fc) &&
			GL.isFunctionSupported(funcs.glVertex4dv, fc) &&
			GL.isFunctionSupported(funcs.glVertexPointer, fc) &&
			GL.isFunctionSupported(funcs.glViewport);

		return GL.checkExtension("OpenGL11", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL11}. */
	public static final class Functions implements FunctionMap {

		public final long
			glEnable,
			glDisable,
			glAccum,
			glAlphaFunc,
			glAreTexturesResident,
			glArrayElement,
			glBegin,
			glBindTexture,
			glBitmap,
			glBlendFunc,
			glCallList,
			glCallLists,
			glClear,
			glClearAccum,
			glClearColor,
			glClearDepth,
			glClearStencil,
			glClipPlane,
			glColor3b,
			glColor3s,
			glColor3i,
			glColor3f,
			glColor3d,
			glColor3ub,
			glColor3us,
			glColor3ui,
			glColor3bv,
			glColor3sv,
			glColor3iv,
			glColor3fv,
			glColor3dv,
			glColor3ubv,
			glColor3usv,
			glColor3uiv,
			glColor4b,
			glColor4s,
			glColor4i,
			glColor4f,
			glColor4d,
			glColor4ub,
			glColor4us,
			glColor4ui,
			glColor4bv,
			glColor4sv,
			glColor4iv,
			glColor4fv,
			glColor4dv,
			glColor4ubv,
			glColor4usv,
			glColor4uiv,
			glColorMask,
			glColorMaterial,
			glColorPointer,
			glCopyPixels,
			glCullFace,
			glDeleteLists,
			glDepthFunc,
			glDepthMask,
			glDepthRange,
			glDisableClientState,
			glDrawArrays,
			glDrawBuffer,
			glDrawElements,
			glDrawPixels,
			glEdgeFlag,
			glEdgeFlagv,
			glEdgeFlagPointer,
			glEnableClientState,
			glEnd,
			glEvalCoord1f,
			glEvalCoord1fv,
			glEvalCoord1d,
			glEvalCoord1dv,
			glEvalCoord2f,
			glEvalCoord2fv,
			glEvalCoord2d,
			glEvalCoord2dv,
			glEvalMesh1,
			glEvalMesh2,
			glEvalPoint1,
			glEvalPoint2,
			glFeedbackBuffer,
			glFinish,
			glFlush,
			glFogi,
			glFogiv,
			glFogf,
			glFogfv,
			glFrontFace,
			glGenLists,
			glGenTextures,
			glDeleteTextures,
			glGetClipPlane,
			glGetBooleanv,
			glGetFloatv,
			glGetIntegerv,
			glGetDoublev,
			glGetError,
			glGetLightiv,
			glGetLightfv,
			glGetMapiv,
			glGetMapfv,
			glGetMapdv,
			glGetMaterialiv,
			glGetMaterialfv,
			glGetPixelMapfv,
			glGetPixelMapusv,
			glGetPixelMapuiv,
			glGetPointerv,
			glGetPolygonStipple,
			glGetString,
			glGetTexEnviv,
			glGetTexEnvfv,
			glGetTexGeniv,
			glGetTexGenfv,
			glGetTexGendv,
			glGetTexImage,
			glGetTexLevelParameteriv,
			glGetTexLevelParameterfv,
			glGetTexParameteriv,
			glGetTexParameterfv,
			glHint,
			glInitNames,
			glInterleavedArrays,
			glIsEnabled,
			glIsList,
			glIsTexture,
			glLightModeli,
			glLightModelf,
			glLightModeliv,
			glLightModelfv,
			glLighti,
			glLightf,
			glLightiv,
			glLightfv,
			glLineStipple,
			glLineWidth,
			glListBase,
			glLoadMatrixf,
			glLoadMatrixd,
			glLoadIdentity,
			glLoadName,
			glLogicOp,
			glMap1f,
			glMap1d,
			glMap2f,
			glMap2d,
			glMapGrid1f,
			glMapGrid1d,
			glMapGrid2f,
			glMapGrid2d,
			glMateriali,
			glMaterialf,
			glMaterialiv,
			glMaterialfv,
			glMatrixMode,
			glMultMatrixf,
			glMultMatrixd,
			glFrustum,
			glNewList,
			glEndList,
			glNormal3f,
			glNormal3b,
			glNormal3s,
			glNormal3i,
			glNormal3d,
			glNormal3fv,
			glNormal3bv,
			glNormal3sv,
			glNormal3iv,
			glNormal3dv,
			glNormalPointer,
			glOrtho,
			glPassThrough,
			glPixelMapfv,
			glPixelMapusv,
			glPixelMapuiv,
			glPixelStorei,
			glPixelStoref,
			glPixelTransferi,
			glPixelTransferf,
			glPixelZoom,
			glPointSize,
			glPolygonMode,
			glPolygonOffset,
			glPolygonStipple,
			glPushAttrib,
			glPushClientAttrib,
			glPopAttrib,
			glPopClientAttrib,
			glPopMatrix,
			glPopName,
			glPrioritizeTextures,
			glPushMatrix,
			glPushName,
			glRasterPos2i,
			glRasterPos2s,
			glRasterPos2f,
			glRasterPos2d,
			glRasterPos2iv,
			glRasterPos2sv,
			glRasterPos2fv,
			glRasterPos2dv,
			glRasterPos3i,
			glRasterPos3s,
			glRasterPos3f,
			glRasterPos3d,
			glRasterPos3iv,
			glRasterPos3sv,
			glRasterPos3fv,
			glRasterPos3dv,
			glRasterPos4i,
			glRasterPos4s,
			glRasterPos4f,
			glRasterPos4d,
			glRasterPos4iv,
			glRasterPos4sv,
			glRasterPos4fv,
			glRasterPos4dv,
			glReadBuffer,
			glReadPixels,
			glRecti,
			glRects,
			glRectf,
			glRectd,
			glRectiv,
			glRectsv,
			glRectfv,
			glRectdv,
			glRenderMode,
			glRotatef,
			glRotated,
			glScalef,
			glScaled,
			glScissor,
			glSelectBuffer,
			glShadeModel,
			glStencilFunc,
			glStencilMask,
			glStencilOp,
			glTexCoord1f,
			glTexCoord1s,
			glTexCoord1i,
			glTexCoord1d,
			glTexCoord1fv,
			glTexCoord1sv,
			glTexCoord1iv,
			glTexCoord1dv,
			glTexCoord2f,
			glTexCoord2s,
			glTexCoord2i,
			glTexCoord2d,
			glTexCoord2fv,
			glTexCoord2sv,
			glTexCoord2iv,
			glTexCoord2dv,
			glTexCoord3f,
			glTexCoord3s,
			glTexCoord3i,
			glTexCoord3d,
			glTexCoord3fv,
			glTexCoord3sv,
			glTexCoord3iv,
			glTexCoord3dv,
			glTexCoord4f,
			glTexCoord4s,
			glTexCoord4i,
			glTexCoord4d,
			glTexCoord4fv,
			glTexCoord4sv,
			glTexCoord4iv,
			glTexCoord4dv,
			glTexCoordPointer,
			glTexEnvi,
			glTexEnviv,
			glTexEnvf,
			glTexEnvfv,
			glTexGeni,
			glTexGeniv,
			glTexGenf,
			glTexGenfv,
			glTexGend,
			glTexGendv,
			glTexImage2D,
			glTexImage1D,
			glCopyTexImage2D,
			glCopyTexImage1D,
			glCopyTexSubImage1D,
			glCopyTexSubImage2D,
			glTexParameteri,
			glTexParameteriv,
			glTexParameterf,
			glTexParameterfv,
			glTexSubImage1D,
			glTexSubImage2D,
			glTranslatef,
			glTranslated,
			glVertex2f,
			glVertex2s,
			glVertex2i,
			glVertex2d,
			glVertex2fv,
			glVertex2sv,
			glVertex2iv,
			glVertex2dv,
			glVertex3f,
			glVertex3s,
			glVertex3i,
			glVertex3d,
			glVertex3fv,
			glVertex3sv,
			glVertex3iv,
			glVertex3dv,
			glVertex4f,
			glVertex4s,
			glVertex4i,
			glVertex4d,
			glVertex4fv,
			glVertex4sv,
			glVertex4iv,
			glVertex4dv,
			glVertexPointer,
			glViewport;

		public Functions(FunctionProvider provider, boolean fc) {
			glEnable = provider.getFunctionAddress("glEnable");
			glDisable = provider.getFunctionAddress("glDisable");
			glAccum = GL.getFunctionAddress(provider, "glAccum", fc);
			glAlphaFunc = GL.getFunctionAddress(provider, "glAlphaFunc", fc);
			glAreTexturesResident = GL.getFunctionAddress(provider, "glAreTexturesResident", fc);
			glArrayElement = provider.getFunctionAddress("glArrayElement");
			glBegin = GL.getFunctionAddress(provider, "glBegin", fc);
			glBindTexture = provider.getFunctionAddress("glBindTexture");
			glBitmap = GL.getFunctionAddress(provider, "glBitmap", fc);
			glBlendFunc = provider.getFunctionAddress("glBlendFunc");
			glCallList = GL.getFunctionAddress(provider, "glCallList", fc);
			glCallLists = GL.getFunctionAddress(provider, "glCallLists", fc);
			glClear = provider.getFunctionAddress("glClear");
			glClearAccum = GL.getFunctionAddress(provider, "glClearAccum", fc);
			glClearColor = provider.getFunctionAddress("glClearColor");
			glClearDepth = provider.getFunctionAddress("glClearDepth");
			glClearStencil = provider.getFunctionAddress("glClearStencil");
			glClipPlane = provider.getFunctionAddress("glClipPlane");
			glColor3b = GL.getFunctionAddress(provider, "glColor3b", fc);
			glColor3s = GL.getFunctionAddress(provider, "glColor3s", fc);
			glColor3i = GL.getFunctionAddress(provider, "glColor3i", fc);
			glColor3f = GL.getFunctionAddress(provider, "glColor3f", fc);
			glColor3d = GL.getFunctionAddress(provider, "glColor3d", fc);
			glColor3ub = GL.getFunctionAddress(provider, "glColor3ub", fc);
			glColor3us = GL.getFunctionAddress(provider, "glColor3us", fc);
			glColor3ui = GL.getFunctionAddress(provider, "glColor3ui", fc);
			glColor3bv = GL.getFunctionAddress(provider, "glColor3bv", fc);
			glColor3sv = GL.getFunctionAddress(provider, "glColor3sv", fc);
			glColor3iv = GL.getFunctionAddress(provider, "glColor3iv", fc);
			glColor3fv = GL.getFunctionAddress(provider, "glColor3fv", fc);
			glColor3dv = GL.getFunctionAddress(provider, "glColor3dv", fc);
			glColor3ubv = GL.getFunctionAddress(provider, "glColor3ubv", fc);
			glColor3usv = GL.getFunctionAddress(provider, "glColor3usv", fc);
			glColor3uiv = GL.getFunctionAddress(provider, "glColor3uiv", fc);
			glColor4b = GL.getFunctionAddress(provider, "glColor4b", fc);
			glColor4s = GL.getFunctionAddress(provider, "glColor4s", fc);
			glColor4i = GL.getFunctionAddress(provider, "glColor4i", fc);
			glColor4f = GL.getFunctionAddress(provider, "glColor4f", fc);
			glColor4d = GL.getFunctionAddress(provider, "glColor4d", fc);
			glColor4ub = GL.getFunctionAddress(provider, "glColor4ub", fc);
			glColor4us = GL.getFunctionAddress(provider, "glColor4us", fc);
			glColor4ui = GL.getFunctionAddress(provider, "glColor4ui", fc);
			glColor4bv = GL.getFunctionAddress(provider, "glColor4bv", fc);
			glColor4sv = GL.getFunctionAddress(provider, "glColor4sv", fc);
			glColor4iv = GL.getFunctionAddress(provider, "glColor4iv", fc);
			glColor4fv = GL.getFunctionAddress(provider, "glColor4fv", fc);
			glColor4dv = GL.getFunctionAddress(provider, "glColor4dv", fc);
			glColor4ubv = GL.getFunctionAddress(provider, "glColor4ubv", fc);
			glColor4usv = GL.getFunctionAddress(provider, "glColor4usv", fc);
			glColor4uiv = GL.getFunctionAddress(provider, "glColor4uiv", fc);
			glColorMask = provider.getFunctionAddress("glColorMask");
			glColorMaterial = GL.getFunctionAddress(provider, "glColorMaterial", fc);
			glColorPointer = GL.getFunctionAddress(provider, "glColorPointer", fc);
			glCopyPixels = provider.getFunctionAddress("glCopyPixels");
			glCullFace = provider.getFunctionAddress("glCullFace");
			glDeleteLists = GL.getFunctionAddress(provider, "glDeleteLists", fc);
			glDepthFunc = provider.getFunctionAddress("glDepthFunc");
			glDepthMask = provider.getFunctionAddress("glDepthMask");
			glDepthRange = provider.getFunctionAddress("glDepthRange");
			glDisableClientState = GL.getFunctionAddress(provider, "glDisableClientState", fc);
			glDrawArrays = provider.getFunctionAddress("glDrawArrays");
			glDrawBuffer = provider.getFunctionAddress("glDrawBuffer");
			glDrawElements = provider.getFunctionAddress("glDrawElements");
			glDrawPixels = GL.getFunctionAddress(provider, "glDrawPixels", fc);
			glEdgeFlag = GL.getFunctionAddress(provider, "glEdgeFlag", fc);
			glEdgeFlagv = GL.getFunctionAddress(provider, "glEdgeFlagv", fc);
			glEdgeFlagPointer = GL.getFunctionAddress(provider, "glEdgeFlagPointer", fc);
			glEnableClientState = GL.getFunctionAddress(provider, "glEnableClientState", fc);
			glEnd = GL.getFunctionAddress(provider, "glEnd", fc);
			glEvalCoord1f = GL.getFunctionAddress(provider, "glEvalCoord1f", fc);
			glEvalCoord1fv = GL.getFunctionAddress(provider, "glEvalCoord1fv", fc);
			glEvalCoord1d = GL.getFunctionAddress(provider, "glEvalCoord1d", fc);
			glEvalCoord1dv = GL.getFunctionAddress(provider, "glEvalCoord1dv", fc);
			glEvalCoord2f = GL.getFunctionAddress(provider, "glEvalCoord2f", fc);
			glEvalCoord2fv = GL.getFunctionAddress(provider, "glEvalCoord2fv", fc);
			glEvalCoord2d = GL.getFunctionAddress(provider, "glEvalCoord2d", fc);
			glEvalCoord2dv = GL.getFunctionAddress(provider, "glEvalCoord2dv", fc);
			glEvalMesh1 = GL.getFunctionAddress(provider, "glEvalMesh1", fc);
			glEvalMesh2 = GL.getFunctionAddress(provider, "glEvalMesh2", fc);
			glEvalPoint1 = GL.getFunctionAddress(provider, "glEvalPoint1", fc);
			glEvalPoint2 = GL.getFunctionAddress(provider, "glEvalPoint2", fc);
			glFeedbackBuffer = GL.getFunctionAddress(provider, "glFeedbackBuffer", fc);
			glFinish = provider.getFunctionAddress("glFinish");
			glFlush = provider.getFunctionAddress("glFlush");
			glFogi = GL.getFunctionAddress(provider, "glFogi", fc);
			glFogiv = GL.getFunctionAddress(provider, "glFogiv", fc);
			glFogf = GL.getFunctionAddress(provider, "glFogf", fc);
			glFogfv = GL.getFunctionAddress(provider, "glFogfv", fc);
			glFrontFace = provider.getFunctionAddress("glFrontFace");
			glGenLists = GL.getFunctionAddress(provider, "glGenLists", fc);
			glGenTextures = provider.getFunctionAddress("glGenTextures");
			glDeleteTextures = provider.getFunctionAddress("glDeleteTextures");
			glGetClipPlane = provider.getFunctionAddress("glGetClipPlane");
			glGetBooleanv = provider.getFunctionAddress("glGetBooleanv");
			glGetFloatv = provider.getFunctionAddress("glGetFloatv");
			glGetIntegerv = provider.getFunctionAddress("glGetIntegerv");
			glGetDoublev = provider.getFunctionAddress("glGetDoublev");
			glGetError = provider.getFunctionAddress("glGetError");
			glGetLightiv = GL.getFunctionAddress(provider, "glGetLightiv", fc);
			glGetLightfv = GL.getFunctionAddress(provider, "glGetLightfv", fc);
			glGetMapiv = GL.getFunctionAddress(provider, "glGetMapiv", fc);
			glGetMapfv = GL.getFunctionAddress(provider, "glGetMapfv", fc);
			glGetMapdv = GL.getFunctionAddress(provider, "glGetMapdv", fc);
			glGetMaterialiv = GL.getFunctionAddress(provider, "glGetMaterialiv", fc);
			glGetMaterialfv = GL.getFunctionAddress(provider, "glGetMaterialfv", fc);
			glGetPixelMapfv = GL.getFunctionAddress(provider, "glGetPixelMapfv", fc);
			glGetPixelMapusv = GL.getFunctionAddress(provider, "glGetPixelMapusv", fc);
			glGetPixelMapuiv = GL.getFunctionAddress(provider, "glGetPixelMapuiv", fc);
			glGetPointerv = provider.getFunctionAddress("glGetPointerv");
			glGetPolygonStipple = GL.getFunctionAddress(provider, "glGetPolygonStipple", fc);
			glGetString = provider.getFunctionAddress("glGetString");
			glGetTexEnviv = provider.getFunctionAddress("glGetTexEnviv");
			glGetTexEnvfv = provider.getFunctionAddress("glGetTexEnvfv");
			glGetTexGeniv = GL.getFunctionAddress(provider, "glGetTexGeniv", fc);
			glGetTexGenfv = GL.getFunctionAddress(provider, "glGetTexGenfv", fc);
			glGetTexGendv = GL.getFunctionAddress(provider, "glGetTexGendv", fc);
			glGetTexImage = provider.getFunctionAddress("glGetTexImage");
			glGetTexLevelParameteriv = provider.getFunctionAddress("glGetTexLevelParameteriv");
			glGetTexLevelParameterfv = provider.getFunctionAddress("glGetTexLevelParameterfv");
			glGetTexParameteriv = provider.getFunctionAddress("glGetTexParameteriv");
			glGetTexParameterfv = provider.getFunctionAddress("glGetTexParameterfv");
			glHint = provider.getFunctionAddress("glHint");
			glInitNames = GL.getFunctionAddress(provider, "glInitNames", fc);
			glInterleavedArrays = provider.getFunctionAddress("glInterleavedArrays");
			glIsEnabled = provider.getFunctionAddress("glIsEnabled");
			glIsList = GL.getFunctionAddress(provider, "glIsList", fc);
			glIsTexture = provider.getFunctionAddress("glIsTexture");
			glLightModeli = GL.getFunctionAddress(provider, "glLightModeli", fc);
			glLightModelf = GL.getFunctionAddress(provider, "glLightModelf", fc);
			glLightModeliv = GL.getFunctionAddress(provider, "glLightModeliv", fc);
			glLightModelfv = GL.getFunctionAddress(provider, "glLightModelfv", fc);
			glLighti = GL.getFunctionAddress(provider, "glLighti", fc);
			glLightf = GL.getFunctionAddress(provider, "glLightf", fc);
			glLightiv = GL.getFunctionAddress(provider, "glLightiv", fc);
			glLightfv = GL.getFunctionAddress(provider, "glLightfv", fc);
			glLineStipple = GL.getFunctionAddress(provider, "glLineStipple", fc);
			glLineWidth = provider.getFunctionAddress("glLineWidth");
			glListBase = GL.getFunctionAddress(provider, "glListBase", fc);
			glLoadMatrixf = GL.getFunctionAddress(provider, "glLoadMatrixf", fc);
			glLoadMatrixd = GL.getFunctionAddress(provider, "glLoadMatrixd", fc);
			glLoadIdentity = GL.getFunctionAddress(provider, "glLoadIdentity", fc);
			glLoadName = GL.getFunctionAddress(provider, "glLoadName", fc);
			glLogicOp = provider.getFunctionAddress("glLogicOp");
			glMap1f = GL.getFunctionAddress(provider, "glMap1f", fc);
			glMap1d = GL.getFunctionAddress(provider, "glMap1d", fc);
			glMap2f = GL.getFunctionAddress(provider, "glMap2f", fc);
			glMap2d = GL.getFunctionAddress(provider, "glMap2d", fc);
			glMapGrid1f = GL.getFunctionAddress(provider, "glMapGrid1f", fc);
			glMapGrid1d = GL.getFunctionAddress(provider, "glMapGrid1d", fc);
			glMapGrid2f = GL.getFunctionAddress(provider, "glMapGrid2f", fc);
			glMapGrid2d = GL.getFunctionAddress(provider, "glMapGrid2d", fc);
			glMateriali = GL.getFunctionAddress(provider, "glMateriali", fc);
			glMaterialf = GL.getFunctionAddress(provider, "glMaterialf", fc);
			glMaterialiv = GL.getFunctionAddress(provider, "glMaterialiv", fc);
			glMaterialfv = GL.getFunctionAddress(provider, "glMaterialfv", fc);
			glMatrixMode = GL.getFunctionAddress(provider, "glMatrixMode", fc);
			glMultMatrixf = GL.getFunctionAddress(provider, "glMultMatrixf", fc);
			glMultMatrixd = GL.getFunctionAddress(provider, "glMultMatrixd", fc);
			glFrustum = GL.getFunctionAddress(provider, "glFrustum", fc);
			glNewList = GL.getFunctionAddress(provider, "glNewList", fc);
			glEndList = GL.getFunctionAddress(provider, "glEndList", fc);
			glNormal3f = GL.getFunctionAddress(provider, "glNormal3f", fc);
			glNormal3b = GL.getFunctionAddress(provider, "glNormal3b", fc);
			glNormal3s = GL.getFunctionAddress(provider, "glNormal3s", fc);
			glNormal3i = GL.getFunctionAddress(provider, "glNormal3i", fc);
			glNormal3d = GL.getFunctionAddress(provider, "glNormal3d", fc);
			glNormal3fv = GL.getFunctionAddress(provider, "glNormal3fv", fc);
			glNormal3bv = GL.getFunctionAddress(provider, "glNormal3bv", fc);
			glNormal3sv = GL.getFunctionAddress(provider, "glNormal3sv", fc);
			glNormal3iv = GL.getFunctionAddress(provider, "glNormal3iv", fc);
			glNormal3dv = GL.getFunctionAddress(provider, "glNormal3dv", fc);
			glNormalPointer = GL.getFunctionAddress(provider, "glNormalPointer", fc);
			glOrtho = GL.getFunctionAddress(provider, "glOrtho", fc);
			glPassThrough = GL.getFunctionAddress(provider, "glPassThrough", fc);
			glPixelMapfv = GL.getFunctionAddress(provider, "glPixelMapfv", fc);
			glPixelMapusv = GL.getFunctionAddress(provider, "glPixelMapusv", fc);
			glPixelMapuiv = GL.getFunctionAddress(provider, "glPixelMapuiv", fc);
			glPixelStorei = provider.getFunctionAddress("glPixelStorei");
			glPixelStoref = provider.getFunctionAddress("glPixelStoref");
			glPixelTransferi = GL.getFunctionAddress(provider, "glPixelTransferi", fc);
			glPixelTransferf = GL.getFunctionAddress(provider, "glPixelTransferf", fc);
			glPixelZoom = GL.getFunctionAddress(provider, "glPixelZoom", fc);
			glPointSize = provider.getFunctionAddress("glPointSize");
			glPolygonMode = provider.getFunctionAddress("glPolygonMode");
			glPolygonOffset = provider.getFunctionAddress("glPolygonOffset");
			glPolygonStipple = GL.getFunctionAddress(provider, "glPolygonStipple", fc);
			glPushAttrib = GL.getFunctionAddress(provider, "glPushAttrib", fc);
			glPushClientAttrib = GL.getFunctionAddress(provider, "glPushClientAttrib", fc);
			glPopAttrib = GL.getFunctionAddress(provider, "glPopAttrib", fc);
			glPopClientAttrib = GL.getFunctionAddress(provider, "glPopClientAttrib", fc);
			glPopMatrix = GL.getFunctionAddress(provider, "glPopMatrix", fc);
			glPopName = GL.getFunctionAddress(provider, "glPopName", fc);
			glPrioritizeTextures = GL.getFunctionAddress(provider, "glPrioritizeTextures", fc);
			glPushMatrix = GL.getFunctionAddress(provider, "glPushMatrix", fc);
			glPushName = GL.getFunctionAddress(provider, "glPushName", fc);
			glRasterPos2i = GL.getFunctionAddress(provider, "glRasterPos2i", fc);
			glRasterPos2s = GL.getFunctionAddress(provider, "glRasterPos2s", fc);
			glRasterPos2f = GL.getFunctionAddress(provider, "glRasterPos2f", fc);
			glRasterPos2d = GL.getFunctionAddress(provider, "glRasterPos2d", fc);
			glRasterPos2iv = GL.getFunctionAddress(provider, "glRasterPos2iv", fc);
			glRasterPos2sv = GL.getFunctionAddress(provider, "glRasterPos2sv", fc);
			glRasterPos2fv = GL.getFunctionAddress(provider, "glRasterPos2fv", fc);
			glRasterPos2dv = GL.getFunctionAddress(provider, "glRasterPos2dv", fc);
			glRasterPos3i = GL.getFunctionAddress(provider, "glRasterPos3i", fc);
			glRasterPos3s = GL.getFunctionAddress(provider, "glRasterPos3s", fc);
			glRasterPos3f = GL.getFunctionAddress(provider, "glRasterPos3f", fc);
			glRasterPos3d = GL.getFunctionAddress(provider, "glRasterPos3d", fc);
			glRasterPos3iv = GL.getFunctionAddress(provider, "glRasterPos3iv", fc);
			glRasterPos3sv = GL.getFunctionAddress(provider, "glRasterPos3sv", fc);
			glRasterPos3fv = GL.getFunctionAddress(provider, "glRasterPos3fv", fc);
			glRasterPos3dv = GL.getFunctionAddress(provider, "glRasterPos3dv", fc);
			glRasterPos4i = GL.getFunctionAddress(provider, "glRasterPos4i", fc);
			glRasterPos4s = GL.getFunctionAddress(provider, "glRasterPos4s", fc);
			glRasterPos4f = GL.getFunctionAddress(provider, "glRasterPos4f", fc);
			glRasterPos4d = GL.getFunctionAddress(provider, "glRasterPos4d", fc);
			glRasterPos4iv = GL.getFunctionAddress(provider, "glRasterPos4iv", fc);
			glRasterPos4sv = GL.getFunctionAddress(provider, "glRasterPos4sv", fc);
			glRasterPos4fv = GL.getFunctionAddress(provider, "glRasterPos4fv", fc);
			glRasterPos4dv = GL.getFunctionAddress(provider, "glRasterPos4dv", fc);
			glReadBuffer = provider.getFunctionAddress("glReadBuffer");
			glReadPixels = provider.getFunctionAddress("glReadPixels");
			glRecti = GL.getFunctionAddress(provider, "glRecti", fc);
			glRects = GL.getFunctionAddress(provider, "glRects", fc);
			glRectf = GL.getFunctionAddress(provider, "glRectf", fc);
			glRectd = GL.getFunctionAddress(provider, "glRectd", fc);
			glRectiv = GL.getFunctionAddress(provider, "glRectiv", fc);
			glRectsv = GL.getFunctionAddress(provider, "glRectsv", fc);
			glRectfv = GL.getFunctionAddress(provider, "glRectfv", fc);
			glRectdv = GL.getFunctionAddress(provider, "glRectdv", fc);
			glRenderMode = GL.getFunctionAddress(provider, "glRenderMode", fc);
			glRotatef = GL.getFunctionAddress(provider, "glRotatef", fc);
			glRotated = GL.getFunctionAddress(provider, "glRotated", fc);
			glScalef = GL.getFunctionAddress(provider, "glScalef", fc);
			glScaled = GL.getFunctionAddress(provider, "glScaled", fc);
			glScissor = provider.getFunctionAddress("glScissor");
			glSelectBuffer = GL.getFunctionAddress(provider, "glSelectBuffer", fc);
			glShadeModel = GL.getFunctionAddress(provider, "glShadeModel", fc);
			glStencilFunc = provider.getFunctionAddress("glStencilFunc");
			glStencilMask = provider.getFunctionAddress("glStencilMask");
			glStencilOp = provider.getFunctionAddress("glStencilOp");
			glTexCoord1f = GL.getFunctionAddress(provider, "glTexCoord1f", fc);
			glTexCoord1s = GL.getFunctionAddress(provider, "glTexCoord1s", fc);
			glTexCoord1i = GL.getFunctionAddress(provider, "glTexCoord1i", fc);
			glTexCoord1d = GL.getFunctionAddress(provider, "glTexCoord1d", fc);
			glTexCoord1fv = GL.getFunctionAddress(provider, "glTexCoord1fv", fc);
			glTexCoord1sv = GL.getFunctionAddress(provider, "glTexCoord1sv", fc);
			glTexCoord1iv = GL.getFunctionAddress(provider, "glTexCoord1iv", fc);
			glTexCoord1dv = GL.getFunctionAddress(provider, "glTexCoord1dv", fc);
			glTexCoord2f = GL.getFunctionAddress(provider, "glTexCoord2f", fc);
			glTexCoord2s = GL.getFunctionAddress(provider, "glTexCoord2s", fc);
			glTexCoord2i = GL.getFunctionAddress(provider, "glTexCoord2i", fc);
			glTexCoord2d = GL.getFunctionAddress(provider, "glTexCoord2d", fc);
			glTexCoord2fv = GL.getFunctionAddress(provider, "glTexCoord2fv", fc);
			glTexCoord2sv = GL.getFunctionAddress(provider, "glTexCoord2sv", fc);
			glTexCoord2iv = GL.getFunctionAddress(provider, "glTexCoord2iv", fc);
			glTexCoord2dv = GL.getFunctionAddress(provider, "glTexCoord2dv", fc);
			glTexCoord3f = GL.getFunctionAddress(provider, "glTexCoord3f", fc);
			glTexCoord3s = GL.getFunctionAddress(provider, "glTexCoord3s", fc);
			glTexCoord3i = GL.getFunctionAddress(provider, "glTexCoord3i", fc);
			glTexCoord3d = GL.getFunctionAddress(provider, "glTexCoord3d", fc);
			glTexCoord3fv = GL.getFunctionAddress(provider, "glTexCoord3fv", fc);
			glTexCoord3sv = GL.getFunctionAddress(provider, "glTexCoord3sv", fc);
			glTexCoord3iv = GL.getFunctionAddress(provider, "glTexCoord3iv", fc);
			glTexCoord3dv = GL.getFunctionAddress(provider, "glTexCoord3dv", fc);
			glTexCoord4f = GL.getFunctionAddress(provider, "glTexCoord4f", fc);
			glTexCoord4s = GL.getFunctionAddress(provider, "glTexCoord4s", fc);
			glTexCoord4i = GL.getFunctionAddress(provider, "glTexCoord4i", fc);
			glTexCoord4d = GL.getFunctionAddress(provider, "glTexCoord4d", fc);
			glTexCoord4fv = GL.getFunctionAddress(provider, "glTexCoord4fv", fc);
			glTexCoord4sv = GL.getFunctionAddress(provider, "glTexCoord4sv", fc);
			glTexCoord4iv = GL.getFunctionAddress(provider, "glTexCoord4iv", fc);
			glTexCoord4dv = GL.getFunctionAddress(provider, "glTexCoord4dv", fc);
			glTexCoordPointer = GL.getFunctionAddress(provider, "glTexCoordPointer", fc);
			glTexEnvi = provider.getFunctionAddress("glTexEnvi");
			glTexEnviv = provider.getFunctionAddress("glTexEnviv");
			glTexEnvf = provider.getFunctionAddress("glTexEnvf");
			glTexEnvfv = provider.getFunctionAddress("glTexEnvfv");
			glTexGeni = GL.getFunctionAddress(provider, "glTexGeni", fc);
			glTexGeniv = GL.getFunctionAddress(provider, "glTexGeniv", fc);
			glTexGenf = GL.getFunctionAddress(provider, "glTexGenf", fc);
			glTexGenfv = GL.getFunctionAddress(provider, "glTexGenfv", fc);
			glTexGend = GL.getFunctionAddress(provider, "glTexGend", fc);
			glTexGendv = GL.getFunctionAddress(provider, "glTexGendv", fc);
			glTexImage2D = provider.getFunctionAddress("glTexImage2D");
			glTexImage1D = provider.getFunctionAddress("glTexImage1D");
			glCopyTexImage2D = provider.getFunctionAddress("glCopyTexImage2D");
			glCopyTexImage1D = provider.getFunctionAddress("glCopyTexImage1D");
			glCopyTexSubImage1D = provider.getFunctionAddress("glCopyTexSubImage1D");
			glCopyTexSubImage2D = provider.getFunctionAddress("glCopyTexSubImage2D");
			glTexParameteri = provider.getFunctionAddress("glTexParameteri");
			glTexParameteriv = provider.getFunctionAddress("glTexParameteriv");
			glTexParameterf = provider.getFunctionAddress("glTexParameterf");
			glTexParameterfv = provider.getFunctionAddress("glTexParameterfv");
			glTexSubImage1D = provider.getFunctionAddress("glTexSubImage1D");
			glTexSubImage2D = provider.getFunctionAddress("glTexSubImage2D");
			glTranslatef = GL.getFunctionAddress(provider, "glTranslatef", fc);
			glTranslated = GL.getFunctionAddress(provider, "glTranslated", fc);
			glVertex2f = GL.getFunctionAddress(provider, "glVertex2f", fc);
			glVertex2s = GL.getFunctionAddress(provider, "glVertex2s", fc);
			glVertex2i = GL.getFunctionAddress(provider, "glVertex2i", fc);
			glVertex2d = GL.getFunctionAddress(provider, "glVertex2d", fc);
			glVertex2fv = GL.getFunctionAddress(provider, "glVertex2fv", fc);
			glVertex2sv = GL.getFunctionAddress(provider, "glVertex2sv", fc);
			glVertex2iv = GL.getFunctionAddress(provider, "glVertex2iv", fc);
			glVertex2dv = GL.getFunctionAddress(provider, "glVertex2dv", fc);
			glVertex3f = GL.getFunctionAddress(provider, "glVertex3f", fc);
			glVertex3s = GL.getFunctionAddress(provider, "glVertex3s", fc);
			glVertex3i = GL.getFunctionAddress(provider, "glVertex3i", fc);
			glVertex3d = GL.getFunctionAddress(provider, "glVertex3d", fc);
			glVertex3fv = GL.getFunctionAddress(provider, "glVertex3fv", fc);
			glVertex3sv = GL.getFunctionAddress(provider, "glVertex3sv", fc);
			glVertex3iv = GL.getFunctionAddress(provider, "glVertex3iv", fc);
			glVertex3dv = GL.getFunctionAddress(provider, "glVertex3dv", fc);
			glVertex4f = GL.getFunctionAddress(provider, "glVertex4f", fc);
			glVertex4s = GL.getFunctionAddress(provider, "glVertex4s", fc);
			glVertex4i = GL.getFunctionAddress(provider, "glVertex4i", fc);
			glVertex4d = GL.getFunctionAddress(provider, "glVertex4d", fc);
			glVertex4fv = GL.getFunctionAddress(provider, "glVertex4fv", fc);
			glVertex4sv = GL.getFunctionAddress(provider, "glVertex4sv", fc);
			glVertex4iv = GL.getFunctionAddress(provider, "glVertex4iv", fc);
			glVertex4dv = GL.getFunctionAddress(provider, "glVertex4dv", fc);
			glVertexPointer = GL.getFunctionAddress(provider, "glVertexPointer", fc);
			glViewport = provider.getFunctionAddress("glViewport");
		}

	}

}