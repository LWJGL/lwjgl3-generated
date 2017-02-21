/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core OpenGL 1.1 functionality.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/vertex_array.txt">EXT_vertex_array</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/polygon_offset.txt">EXT_polygon_offset</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/blend_logic_op.txt">EXT_blend_logic_op</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture.txt">EXT_texture</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/copy_texture.txt">EXT_copy_texture</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/subtexture.txt">EXT_subtexture</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture_object.txt">EXT_texture_object</a></li>
 * </ul>
 */
public class GL11 {

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
		GL_ZERO                = 0,
		GL_ONE                 = 1,
		GL_SRC_COLOR           = 0x300,
		GL_ONE_MINUS_SRC_COLOR = 0x301,
		GL_SRC_ALPHA           = 0x302,
		GL_ONE_MINUS_SRC_ALPHA = 0x303,
		GL_DST_ALPHA           = 0x304,
		GL_ONE_MINUS_DST_ALPHA = 0x305;

	/** BlendingFactorSrc */
	public static final int
		GL_DST_COLOR           = 0x306,
		GL_ONE_MINUS_DST_COLOR = 0x307,
		GL_SRC_ALPHA_SATURATE  = 0x308;

	/** Boolean */
	public static final int
		GL_TRUE  = 1,
		GL_FALSE = 0;

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
		GL_NONE           = 0,
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
		GL_NO_ERROR          = 0,
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
		GL_LOGIC_OP                      = 0xBF1,
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
		GL_TEXTURE_COMPONENTS      = 0x1003,
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

	static { GL.initialize(); }

	protected GL11() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, boolean fc) {
		return (fc || checkFunctions(
			caps.glAccum, caps.glAlphaFunc, caps.glAreTexturesResident, caps.glBegin, caps.glBitmap, caps.glCallList, caps.glCallLists, caps.glClearAccum, 
			caps.glClearIndex, caps.glColor3b, caps.glColor3s, caps.glColor3i, caps.glColor3f, caps.glColor3d, caps.glColor3ub, caps.glColor3us, 
			caps.glColor3ui, caps.glColor3bv, caps.glColor3sv, caps.glColor3iv, caps.glColor3fv, caps.glColor3dv, caps.glColor3ubv, caps.glColor3usv, 
			caps.glColor3uiv, caps.glColor4b, caps.glColor4s, caps.glColor4i, caps.glColor4f, caps.glColor4d, caps.glColor4ub, caps.glColor4us, caps.glColor4ui, 
			caps.glColor4bv, caps.glColor4sv, caps.glColor4iv, caps.glColor4fv, caps.glColor4dv, caps.glColor4ubv, caps.glColor4usv, caps.glColor4uiv, 
			caps.glColorMaterial, caps.glColorPointer, caps.glDeleteLists, caps.glDisableClientState, caps.glDrawPixels, caps.glEdgeFlag, caps.glEdgeFlagv, 
			caps.glEdgeFlagPointer, caps.glEnableClientState, caps.glEnd, caps.glEvalCoord1f, caps.glEvalCoord1fv, caps.glEvalCoord1d, caps.glEvalCoord1dv, 
			caps.glEvalCoord2f, caps.glEvalCoord2fv, caps.glEvalCoord2d, caps.glEvalCoord2dv, caps.glEvalMesh1, caps.glEvalMesh2, caps.glEvalPoint1, 
			caps.glEvalPoint2, caps.glFeedbackBuffer, caps.glFogi, caps.glFogiv, caps.glFogf, caps.glFogfv, caps.glGenLists, caps.glGetLightiv, 
			caps.glGetLightfv, caps.glGetMapiv, caps.glGetMapfv, caps.glGetMapdv, caps.glGetMaterialiv, caps.glGetMaterialfv, caps.glGetPixelMapfv, 
			caps.glGetPixelMapusv, caps.glGetPixelMapuiv, caps.glGetPolygonStipple, caps.glGetTexGeniv, caps.glGetTexGenfv, caps.glGetTexGendv, caps.glIndexi, 
			caps.glIndexub, caps.glIndexs, caps.glIndexf, caps.glIndexd, caps.glIndexiv, caps.glIndexubv, caps.glIndexsv, caps.glIndexfv, caps.glIndexdv, 
			caps.glIndexMask, caps.glIndexPointer, caps.glInitNames, caps.glIsList, caps.glLightModeli, caps.glLightModelf, caps.glLightModeliv, 
			caps.glLightModelfv, caps.glLighti, caps.glLightf, caps.glLightiv, caps.glLightfv, caps.glLineStipple, caps.glListBase, caps.glLoadMatrixf, 
			caps.glLoadMatrixd, caps.glLoadIdentity, caps.glLoadName, caps.glMap1f, caps.glMap1d, caps.glMap2f, caps.glMap2d, caps.glMapGrid1f, 
			caps.glMapGrid1d, caps.glMapGrid2f, caps.glMapGrid2d, caps.glMateriali, caps.glMaterialf, caps.glMaterialiv, caps.glMaterialfv, caps.glMatrixMode, 
			caps.glMultMatrixf, caps.glMultMatrixd, caps.glFrustum, caps.glNewList, caps.glEndList, caps.glNormal3f, caps.glNormal3b, caps.glNormal3s, 
			caps.glNormal3i, caps.glNormal3d, caps.glNormal3fv, caps.glNormal3bv, caps.glNormal3sv, caps.glNormal3iv, caps.glNormal3dv, caps.glNormalPointer, 
			caps.glOrtho, caps.glPassThrough, caps.glPixelMapfv, caps.glPixelMapusv, caps.glPixelMapuiv, caps.glPixelTransferi, caps.glPixelTransferf, 
			caps.glPixelZoom, caps.glPolygonStipple, caps.glPushAttrib, caps.glPushClientAttrib, caps.glPopAttrib, caps.glPopClientAttrib, caps.glPopMatrix, 
			caps.glPopName, caps.glPrioritizeTextures, caps.glPushMatrix, caps.glPushName, caps.glRasterPos2i, caps.glRasterPos2s, caps.glRasterPos2f, 
			caps.glRasterPos2d, caps.glRasterPos2iv, caps.glRasterPos2sv, caps.glRasterPos2fv, caps.glRasterPos2dv, caps.glRasterPos3i, caps.glRasterPos3s, 
			caps.glRasterPos3f, caps.glRasterPos3d, caps.glRasterPos3iv, caps.glRasterPos3sv, caps.glRasterPos3fv, caps.glRasterPos3dv, caps.glRasterPos4i, 
			caps.glRasterPos4s, caps.glRasterPos4f, caps.glRasterPos4d, caps.glRasterPos4iv, caps.glRasterPos4sv, caps.glRasterPos4fv, caps.glRasterPos4dv, 
			caps.glRecti, caps.glRects, caps.glRectf, caps.glRectd, caps.glRectiv, caps.glRectsv, caps.glRectfv, caps.glRectdv, caps.glRenderMode, 
			caps.glRotatef, caps.glRotated, caps.glScalef, caps.glScaled, caps.glSelectBuffer, caps.glShadeModel, caps.glTexCoord1f, caps.glTexCoord1s, 
			caps.glTexCoord1i, caps.glTexCoord1d, caps.glTexCoord1fv, caps.glTexCoord1sv, caps.glTexCoord1iv, caps.glTexCoord1dv, caps.glTexCoord2f, 
			caps.glTexCoord2s, caps.glTexCoord2i, caps.glTexCoord2d, caps.glTexCoord2fv, caps.glTexCoord2sv, caps.glTexCoord2iv, caps.glTexCoord2dv, 
			caps.glTexCoord3f, caps.glTexCoord3s, caps.glTexCoord3i, caps.glTexCoord3d, caps.glTexCoord3fv, caps.glTexCoord3sv, caps.glTexCoord3iv, 
			caps.glTexCoord3dv, caps.glTexCoord4f, caps.glTexCoord4s, caps.glTexCoord4i, caps.glTexCoord4d, caps.glTexCoord4fv, caps.glTexCoord4sv, 
			caps.glTexCoord4iv, caps.glTexCoord4dv, caps.glTexCoordPointer, caps.glTexGeni, caps.glTexGeniv, caps.glTexGenf, caps.glTexGenfv, caps.glTexGend, 
			caps.glTexGendv, caps.glTranslatef, caps.glTranslated, caps.glVertex2f, caps.glVertex2s, caps.glVertex2i, caps.glVertex2d, caps.glVertex2fv, 
			caps.glVertex2sv, caps.glVertex2iv, caps.glVertex2dv, caps.glVertex3f, caps.glVertex3s, caps.glVertex3i, caps.glVertex3d, caps.glVertex3fv, 
			caps.glVertex3sv, caps.glVertex3iv, caps.glVertex3dv, caps.glVertex4f, caps.glVertex4s, caps.glVertex4i, caps.glVertex4d, caps.glVertex4fv, 
			caps.glVertex4sv, caps.glVertex4iv, caps.glVertex4dv, caps.glVertexPointer
		)) && checkFunctions(
			caps.glEnable, caps.glDisable, caps.glArrayElement, caps.glBindTexture, caps.glBlendFunc, caps.glClear, caps.glClearColor, caps.glClearDepth, 
			caps.glClearStencil, caps.glClipPlane, caps.glColorMask, caps.glCopyPixels, caps.glCullFace, caps.glDepthFunc, caps.glDepthMask, caps.glDepthRange, 
			caps.glDrawArrays, caps.glDrawBuffer, caps.glDrawElements, caps.glFinish, caps.glFlush, caps.glFrontFace, caps.glGenTextures, caps.glDeleteTextures, 
			caps.glGetClipPlane, caps.glGetBooleanv, caps.glGetFloatv, caps.glGetIntegerv, caps.glGetDoublev, caps.glGetError, caps.glGetPointerv, 
			caps.glGetString, caps.glGetTexEnviv, caps.glGetTexEnvfv, caps.glGetTexImage, caps.glGetTexLevelParameteriv, caps.glGetTexLevelParameterfv, 
			caps.glGetTexParameteriv, caps.glGetTexParameterfv, caps.glHint, caps.glInterleavedArrays, caps.glIsEnabled, caps.glIsTexture, caps.glLineWidth, 
			caps.glLogicOp, caps.glPixelStorei, caps.glPixelStoref, caps.glPointSize, caps.glPolygonMode, caps.glPolygonOffset, caps.glReadBuffer, 
			caps.glReadPixels, caps.glScissor, caps.glStencilFunc, caps.glStencilMask, caps.glStencilOp, caps.glTexEnvi, caps.glTexEnviv, caps.glTexEnvf, 
			caps.glTexEnvfv, caps.glTexImage2D, caps.glTexImage1D, caps.glCopyTexImage2D, caps.glCopyTexImage1D, caps.glCopyTexSubImage1D, 
			caps.glCopyTexSubImage2D, caps.glTexParameteri, caps.glTexParameteriv, caps.glTexParameterf, caps.glTexParameterfv, caps.glTexSubImage1D, 
			caps.glTexSubImage2D, caps.glViewport
		);
	}

	// --- [ glEnable ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glEnable">Reference Page</a></p>
	 * 
	 * Enables the specified OpenGL state.
	 *
	 * @param target the OpenGL state to enable
	 */
	public static native void glEnable(int target);

	// --- [ glDisable ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glDisable">Reference Page</a></p>
	 * 
	 * Disables the specified OpenGL state.
	 *
	 * @param target the OpenGL state to disable
	 */
	public static native void glDisable(int target);

	// --- [ glAccum ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glAccum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Each portion of a pixel in the accumulation buffer consists of four values: one for each of R, G, B, and A. The accumulation buffer is controlled
	 * exclusively through the use of this method (except for clearing it).
	 *
	 * @param op    a symbolic constant indicating an accumulation buffer operation
	 * @param value a floating-point value to be used in that operation. One of:<br><table><tr><td>{@link #GL_ACCUM ACCUM}</td><td>{@link #GL_LOAD LOAD}</td><td>{@link #GL_RETURN RETURN}</td><td>{@link #GL_MULT MULT}</td><td>{@link #GL_ADD ADD}</td></tr></table>
	 */
	public static native void glAccum(int op, float value);

	// --- [ glAlphaFunc ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glAlphaFunc">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * The alpha test discards a fragment conditionally based on the outcome of a comparison between the incoming fragment’s alpha value and a constant value.
	 * The comparison is enabled or disabled with the generic {@link #glEnable Enable} and {@link #glDisable Disable} commands using the symbolic constant {@link #GL_ALPHA_TEST ALPHA_TEST}.
	 * When disabled, it is as if the comparison always passes. The test is controlled with this method.
	 *
	 * @param func a symbolic constant indicating the alpha test function. One of:<br><table><tr><td>{@link #GL_NEVER NEVER}</td><td>{@link #GL_ALWAYS ALWAYS}</td><td>{@link #GL_LESS LESS}</td><td>{@link #GL_LEQUAL LEQUAL}</td><td>{@link #GL_EQUAL EQUAL}</td><td>{@link #GL_GEQUAL GEQUAL}</td><td>{@link #GL_GREATER GREATER}</td><td>{@link #GL_NOTEQUAL NOTEQUAL}</td></tr></table>
	 * @param ref  a reference value clamped to the range [0, 1]. When performing the alpha test, the GL will convert the reference value to the same representation as the fragment's alpha value (floating-point or fixed-point).
	 */
	public static native void glAlphaFunc(int func, float ref);

	// --- [ glAreTexturesResident ] ---

	/**
	 * Unsafe version of: {@link #glAreTexturesResident AreTexturesResident}
	 *
	 * @param n the number of texture objects in {@code textures}
	 */
	public static native boolean nglAreTexturesResident(int n, long textures, long residences);

	/**
	 * <p><a href="http://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns {@link #GL_TRUE TRUE} if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If
	 * at least one of the texture objects named in textures is not resident, then {@link #GL_FALSE FALSE} is returned, and the residence of each texture object is
	 * returned in residences. Otherwise the contents of residences are not changed.
	 *
	 * @param textures   an array of texture objects
	 * @param residences returns the residences of each texture object
	 */
	public static boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences) {
		if ( CHECKS )
			check(residences, textures.remaining());
		return nglAreTexturesResident(textures.remaining(), memAddress(textures), memAddress(residences));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns {@link #GL_TRUE TRUE} if all of the texture objects named in textures are resident, or if the implementation does not distinguish a working set. If
	 * at least one of the texture objects named in textures is not resident, then {@link #GL_FALSE FALSE} is returned, and the residence of each texture object is
	 * returned in residences. Otherwise the contents of residences are not changed.
	 *
	 * @param residences returns the residences of each texture object
	 */
	public static boolean glAreTexturesResident(int texture, ByteBuffer residences) {
		if ( CHECKS )
			check(residences, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer textures = stack.ints(texture);
			return nglAreTexturesResident(1, memAddress(textures), memAddress(residences));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glArrayElement ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glArrayElement">Reference Page</a></p>
	 * 
	 * Transfers the ith element of every enabled, non-instanced array, and the first element of every enabled, instanced array to the GL.
	 *
	 * @param i the element to transfer
	 */
	public static native void glArrayElement(int i);

	// --- [ glBegin ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glBegin">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Begins the definition of vertex attributes of a sequence of primitives to be transferred to the GL.
	 *
	 * @param mode the primitive type being defined. One of:<br><table><tr><td>{@link #GL_POINTS POINTS}</td><td>{@link #GL_LINE_STRIP LINE_STRIP}</td><td>{@link #GL_LINE_LOOP LINE_LOOP}</td><td>{@link #GL_LINES LINES}</td><td>{@link #GL_POLYGON POLYGON}</td><td>{@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link #GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link #GL_TRIANGLES TRIANGLES}</td><td>{@link #GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link #GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 */
	public static native void glBegin(int mode);

	// --- [ glBindTexture ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glBindTexture">Reference Page</a></p>
	 * 
	 * Binds the a texture to a texture target.
	 * 
	 * <p>While a texture object is bound, GL operations on the target to which it is bound affect the bound object, and queries of the target to which it is
	 * bound return state from the bound object. If texture mapping of the dimensionality of the target to which a texture object is bound is enabled, the
	 * state of the bound texture object directs the texturing operation.</p>
	 *
	 * @param target  the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param texture the texture object to bind
	 */
	public static native void glBindTexture(int target, int texture);

	// --- [ glBitmap ] ---

	/** Unsafe version of: {@link #glBitmap Bitmap} */
	public static native void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glBitmap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
		if ( CHECKS )
			checkSafe(data, ((w + 7) >> 3) * h);
		nglBitmap(w, h, xOrig, yOrig, xInc, yInc, memAddressSafe(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glBitmap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data) {
		nglBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
	}

	// --- [ glBlendFunc ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glBlendFunc">Reference Page</a></p>
	 * 
	 * Specifies the weighting factors used by the blend equation, for both RGB and alpha functions and for all draw buffers.
	 *
	 * @param sfactor the source weighting factor. One of:<br><table><tr><td>{@link #GL_ZERO ZERO}</td><td>{@link #GL_ONE ONE}</td><td>{@link #GL_SRC_COLOR SRC_COLOR}</td><td>{@link #GL_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR}</td><td>{@link #GL_DST_COLOR DST_COLOR}</td></tr><tr><td>{@link #GL_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR}</td><td>{@link #GL_SRC_ALPHA SRC_ALPHA}</td><td>{@link #GL_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA}</td><td>{@link #GL_DST_ALPHA DST_ALPHA}</td><td>{@link #GL_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA}</td></tr><tr><td>{@link GL14#GL_CONSTANT_COLOR CONSTANT_COLOR}</td><td>{@link GL14#GL_ONE_MINUS_CONSTANT_COLOR ONE_MINUS_CONSTANT_COLOR}</td><td>{@link GL14#GL_CONSTANT_ALPHA CONSTANT_ALPHA}</td><td>{@link GL14#GL_ONE_MINUS_CONSTANT_ALPHA ONE_MINUS_CONSTANT_ALPHA}</td><td>{@link #GL_SRC_ALPHA_SATURATE SRC_ALPHA_SATURATE}</td></tr><tr><td>{@link GL33#GL_SRC1_COLOR SRC1_COLOR}</td><td>{@link GL33#GL_ONE_MINUS_SRC1_COLOR ONE_MINUS_SRC1_COLOR}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL33#GL_ONE_MINUS_SRC1_ALPHA ONE_MINUS_SRC1_ALPHA}</td></tr></table>
	 * @param dfactor the destination weighting factor
	 */
	public static native void glBlendFunc(int sfactor, int dfactor);

	// --- [ glCallList ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glCallList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Executes a display list. Causes the commands saved in the display list to be executed, in order, just as if they were issued without using a display list.
	 *
	 * @param list the index of the display list to be called
	 */
	public static native void glCallList(int list);

	// --- [ glCallLists ] ---

	/**
	 * Unsafe version of: {@link #glCallLists CallLists}
	 *
	 * @param n    the number of display lists to be called
	 * @param type the data type of each element in {@code lists}. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_2_BYTES 2_BYTES}</td><td>{@link #GL_3_BYTES 3_BYTES}</td><td>{@link #GL_4_BYTES 4_BYTES}</td></tr></table>
	 */
	public static native void nglCallLists(int n, int type, long lists);

	/**
	 * <p><a href="http://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Provides an efficient means for executing a number of display lists.
	 *
	 * @param type  the data type of each element in {@code lists}. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_2_BYTES 2_BYTES}</td><td>{@link #GL_3_BYTES 3_BYTES}</td><td>{@link #GL_4_BYTES 4_BYTES}</td></tr></table>
	 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
	 */
	public static void glCallLists(int type, ByteBuffer lists) {
		nglCallLists(lists.remaining() / GLChecks.typeToBytes(type), type, memAddress(lists));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Provides an efficient means for executing a number of display lists.
	 *
	 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
	 */
	public static void glCallLists(ByteBuffer lists) {
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(lists));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Provides an efficient means for executing a number of display lists.
	 *
	 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
	 */
	public static void glCallLists(ShortBuffer lists) {
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(lists));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glCallLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Provides an efficient means for executing a number of display lists.
	 *
	 * @param lists an array of offsets. Each offset is added to the display list base to obtain the display list number.
	 */
	public static void glCallLists(IntBuffer lists) {
		nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_INT, memAddress(lists));
	}

	// --- [ glClear ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glClear">Reference Page</a></p>
	 * 
	 * Sets portions of every pixel in a particular buffer to the same value. The value to which each buffer is cleared depends on the setting of the clear
	 * value for that buffer.
	 *
	 * @param mask Zero or the bitwise OR of one or more values indicating which buffers are to be cleared. One or more of:<br><table><tr><td>{@link #GL_ACCUM_BUFFER_BIT ACCUM_BUFFER_BIT}</td><td>{@link #GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link #GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link #GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>
	 */
	public static native void glClear(int mask);

	// --- [ glClearAccum ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glClearAccum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the clear values for the accumulation buffer. These values are clamped to the range [-1,1] when they are specified.
	 *
	 * @param red   the value to which to clear the R values of the accumulation buffer
	 * @param green the value to which to clear the G values of the accumulation buffer
	 * @param blue  the value to which to clear the B values of the accumulation buffer
	 * @param alpha the value to which to clear the A values of the accumulation buffer
	 */
	public static native void glClearAccum(float red, float green, float blue, float alpha);

	// --- [ glClearColor ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glClearColor">Reference Page</a></p>
	 * 
	 * Sets the clear value for fixed-point and floating-point color buffers in RGBA mode. The specified components are stored as floating-point values.
	 *
	 * @param red   the value to which to clear the R channel of the color buffer
	 * @param green the value to which to clear the G channel of the color buffer
	 * @param blue  the value to which to clear the B channel of the color buffer
	 * @param alpha the value to which to clear the A channel of the color buffer
	 */
	public static native void glClearColor(float red, float green, float blue, float alpha);

	// --- [ glClearDepth ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glClearDepth">Reference Page</a></p>
	 * 
	 * Sets the depth value used when clearing the depth buffer. When clearing a fixedpoint depth buffer, {@code depth} is clamped to the range [0,1] and
	 * converted to fixed-point. No conversion is applied when clearing a floating-point depth buffer.
	 *
	 * @param depth the value to which to clear the depth buffer
	 */
	public static native void glClearDepth(double depth);

	// --- [ glClearIndex ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glClearIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * sets the clear color index. index is converted to a fixed-point value with unspecified precision to the left of the binary point; the integer part of
	 * this value is then masked with <code>2<sup>m</sup> &ndash; 1</code>, where {@code m} is the number of bits in a color index value stored in the
	 * framebuffer.
	 *
	 * @param index the value to which to clear the color buffer in color index mode
	 */
	public static native void glClearIndex(float index);

	// --- [ glClearStencil ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glClearStencil">Reference Page</a></p>
	 * 
	 * Sets the value to which to clear the stencil buffer. {@code s} is masked to the number of bitplanes in the stencil buffer.
	 *
	 * @param s the value to which to clear the stencil buffer
	 */
	public static native void glClearStencil(int s);

	// --- [ glClipPlane ] ---

	/** Unsafe version of: {@link #glClipPlane ClipPlane} */
	public static native void nglClipPlane(int plane, long equation);

	/**
	 * <p><a href="http://docs.gl/gl4/glClipPlane">Reference Page</a></p>
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
	public static void glClipPlane(int plane, DoubleBuffer equation) {
		if ( CHECKS )
			check(equation, 4);
		nglClipPlane(plane, memAddress(equation));
	}

	// --- [ glColor3b ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the R, G, and B components of the current color. The alpha component is set to 1.0.
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static native void glColor3b(byte red, byte green, byte blue);

	// --- [ glColor3s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static native void glColor3s(short red, short green, short blue);

	// --- [ glColor3i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static native void glColor3i(int red, int green, int blue);

	// --- [ glColor3f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static native void glColor3f(float red, float green, float blue);

	// --- [ glColor3d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static native void glColor3d(double red, double green, double blue);

	// --- [ glColor3ub ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static native void glColor3ub(byte red, byte green, byte blue);

	// --- [ glColor3us ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static native void glColor3us(short red, short green, short blue);

	// --- [ glColor3ui ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned int version of {@link #glColor3b Color3b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 */
	public static native void glColor3ui(int red, int green, int blue);

	// --- [ glColor3bv ] ---

	/** Unsafe version of: {@link #glColor3bv Color3bv} */
	public static native void nglColor3bv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Byte pointer version of {@link #glColor3b Color3b}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3bv(ByteBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglColor3bv(memAddress(v));
	}

	// --- [ glColor3sv ] ---

	/** Unsafe version of: {@link #glColor3sv Color3sv} */
	public static native void nglColor3sv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3s Color3s}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3sv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglColor3sv(memAddress(v));
	}

	// --- [ glColor3iv ] ---

	/** Unsafe version of: {@link #glColor3iv Color3iv} */
	public static native void nglColor3iv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3i Color3i}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3iv(IntBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglColor3iv(memAddress(v));
	}

	// --- [ glColor3fv ] ---

	/** Unsafe version of: {@link #glColor3fv Color3fv} */
	public static native void nglColor3fv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3f Color3f}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3fv(FloatBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglColor3fv(memAddress(v));
	}

	// --- [ glColor3dv ] ---

	/** Unsafe version of: {@link #glColor3dv Color3dv} */
	public static native void nglColor3dv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3d Color3d}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3dv(DoubleBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglColor3dv(memAddress(v));
	}

	// --- [ glColor3ubv ] ---

	/** Unsafe version of: {@link #glColor3ubv Color3ubv} */
	public static native void nglColor3ubv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3ub Color3ub}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3ubv(ByteBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglColor3ubv(memAddress(v));
	}

	// --- [ glColor3usv ] ---

	/** Unsafe version of: {@link #glColor3usv Color3usv} */
	public static native void nglColor3usv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3us Color3us}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3usv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglColor3usv(memAddress(v));
	}

	// --- [ glColor3uiv ] ---

	/** Unsafe version of: {@link #glColor3uiv Color3uiv} */
	public static native void nglColor3uiv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor3ui Color3ui}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor3uiv(IntBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglColor3uiv(memAddress(v));
	}

	// --- [ glColor4b ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current color.
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static native void glColor4b(byte red, byte green, byte blue, byte alpha);

	// --- [ glColor4s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static native void glColor4s(short red, short green, short blue, short alpha);

	// --- [ glColor4i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static native void glColor4i(int red, int green, int blue, int alpha);

	// --- [ glColor4f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static native void glColor4f(float red, float green, float blue, float alpha);

	// --- [ glColor4d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static native void glColor4d(double red, double green, double blue, double alpha);

	// --- [ glColor4ub ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static native void glColor4ub(byte red, byte green, byte blue, byte alpha);

	// --- [ glColor4us ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static native void glColor4us(short red, short green, short blue, short alpha);

	// --- [ glColor4ui ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned int version of {@link #glColor4b Color4b}
	 *
	 * @param red   the red component of the current color
	 * @param green the green component of the current color
	 * @param blue  the blue component of the current color
	 * @param alpha the alpha component of the current color
	 */
	public static native void glColor4ui(int red, int green, int blue, int alpha);

	// --- [ glColor4bv ] ---

	/** Unsafe version of: {@link #glColor4bv Color4bv} */
	public static native void nglColor4bv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4b Color4b}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4bv(ByteBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglColor4bv(memAddress(v));
	}

	// --- [ glColor4sv ] ---

	/** Unsafe version of: {@link #glColor4sv Color4sv} */
	public static native void nglColor4sv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4s Color4s}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4sv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglColor4sv(memAddress(v));
	}

	// --- [ glColor4iv ] ---

	/** Unsafe version of: {@link #glColor4iv Color4iv} */
	public static native void nglColor4iv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4i Color4i}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4iv(IntBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglColor4iv(memAddress(v));
	}

	// --- [ glColor4fv ] ---

	/** Unsafe version of: {@link #glColor4fv Color4fv} */
	public static native void nglColor4fv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4f Color4f}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4fv(FloatBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglColor4fv(memAddress(v));
	}

	// --- [ glColor4dv ] ---

	/** Unsafe version of: {@link #glColor4dv Color4dv} */
	public static native void nglColor4dv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4d Color4d}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4dv(DoubleBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglColor4dv(memAddress(v));
	}

	// --- [ glColor4ubv ] ---

	/** Unsafe version of: {@link #glColor4ubv Color4ubv} */
	public static native void nglColor4ubv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4ub Color4ub}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4ubv(ByteBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglColor4ubv(memAddress(v));
	}

	// --- [ glColor4usv ] ---

	/** Unsafe version of: {@link #glColor4usv Color4usv} */
	public static native void nglColor4usv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4us Color4us}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4usv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglColor4usv(memAddress(v));
	}

	// --- [ glColor4uiv ] ---

	/** Unsafe version of: {@link #glColor4uiv Color4uiv} */
	public static native void nglColor4uiv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColor4ui Color4ui}.
	 *
	 * @param v the color buffer
	 */
	public static void glColor4uiv(IntBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglColor4uiv(memAddress(v));
	}

	// --- [ glColorMask ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glColorMask">Reference Page</a></p>
	 * 
	 * Masks the writing of R, G, B and A values to all draw buffers. In the initial state, all color values are enabled for writing for all draw buffers.
	 *
	 * @param red   whether R values are written or not
	 * @param green whether G values are written or not
	 * @param blue  whether B values are written or not
	 * @param alpha whether A values are written or not
	 */
	public static native void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);

	// --- [ glColorMaterial ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glColorMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * It is possible to attach one or more material properties to the current color, so that they continuously track its component values. This behavior is
	 * enabled and disabled by calling {@link #glEnable Enable} or {@link #glDisable Disable} with the symbolic value {@link #GL_COLOR_MATERIAL COLOR_MATERIAL}. This function controls which
	 * of these modes is selected.
	 *
	 * @param face specifies which material face is affected by the current color. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
	 * @param mode specifies which material property or properties track the current color. One of:<br><table><tr><td>{@link #GL_EMISSION EMISSION}</td><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}</td></tr></table>
	 */
	public static native void glColorMaterial(int face, int mode);

	// --- [ glColorPointer ] ---

	/** Unsafe version of: {@link #glColorPointer ColorPointer} */
	public static native void nglColorPointer(int size, int type, int stride, long pointer);

	/**
	 * <p><a href="http://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color array data
	 */
	public static void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
		nglColorPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color array data
	 */
	public static void glColorPointer(int size, int type, int stride, long pointer) {
		nglColorPointer(size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color array data
	 */
	public static void glColorPointer(int size, int type, int stride, ShortBuffer pointer) {
		nglColorPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color array data
	 */
	public static void glColorPointer(int size, int type, int stride, IntBuffer pointer) {
		nglColorPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. One of:<br><table><tr><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color array data
	 */
	public static void glColorPointer(int size, int type, int stride, FloatBuffer pointer) {
		nglColorPointer(size, type, stride, memAddress(pointer));
	}

	// --- [ glCopyPixels ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glCopyPixels">Reference Page</a></p>
	 * 
	 * Transfers a rectangle of pixel values from one region of the read framebuffer to another in the draw framebuffer
	 *
	 * @param x      the left framebuffer pixel coordinate
	 * @param y      the lower framebuffer pixel coordinate
	 * @param width  the rectangle width
	 * @param height the rectangle height
	 * @param type   Indicates the type of values to be transfered. One of:<br><table><tr><td>{@link #GL_COLOR COLOR}</td><td>{@link #GL_STENCIL STENCIL}</td><td>{@link #GL_DEPTH DEPTH}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
	 */
	public static native void glCopyPixels(int x, int y, int width, int height, int type);

	// --- [ glCullFace ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glCullFace">Reference Page</a></p>
	 * 
	 * Specifies which polygon faces are culled if {@link #GL_CULL_FACE CULL_FACE} is enabled. Front-facing polygons are rasterized if either culling is disabled or the
	 * CullFace mode is {@link #GL_BACK BACK} while back-facing polygons are rasterized only if either culling is disabled or the CullFace mode is
	 * {@link #GL_FRONT FRONT}. The initial setting of the CullFace mode is {@link #GL_BACK BACK}. Initially, culling is disabled.
	 *
	 * @param mode the CullFace mode. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
	 */
	public static native void glCullFace(int mode);

	// --- [ glDeleteLists ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glDeleteLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Deletes a contiguous group of display lists. All information about the display lists is lost, and the indices become unused. Indices to which no display
	 * list corresponds are ignored. If {@code range} is zero, nothing happens.
	 *
	 * @param list  the index of the first display list to be deleted
	 * @param range the number of display lists to be deleted
	 */
	public static native void glDeleteLists(int list, int range);

	// --- [ glDepthFunc ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glDepthFunc">Reference Page</a></p>
	 * 
	 * Specifies the comparison that takes place during the depth buffer test (when {@link #GL_DEPTH_TEST DEPTH_TEST} is enabled).
	 *
	 * @param func the depth test comparison. One of:<br><table><tr><td>{@link #GL_NEVER NEVER}</td><td>{@link #GL_ALWAYS ALWAYS}</td><td>{@link #GL_LESS LESS}</td><td>{@link #GL_LEQUAL LEQUAL}</td><td>{@link #GL_EQUAL EQUAL}</td><td>{@link #GL_GREATER GREATER}</td><td>{@link #GL_GEQUAL GEQUAL}</td><td>{@link #GL_NOTEQUAL NOTEQUAL}</td></tr></table>
	 */
	public static native void glDepthFunc(int func);

	// --- [ glDepthMask ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glDepthMask">Reference Page</a></p>
	 * 
	 * Masks the writing of depth values to the depth buffer. In the initial state, the depth buffer is enabled for writing.
	 *
	 * @param flag whether depth values are written or not.
	 */
	public static native void glDepthMask(boolean flag);

	// --- [ glDepthRange ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glDepthRange">Reference Page</a></p>
	 * 
	 * Sets the depth range for all viewports to the same values.
	 *
	 * @param zNear the near depth range
	 * @param zFar  the far depth range
	 */
	public static native void glDepthRange(double zNear, double zFar);

	// --- [ glDisableClientState ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glDisableClientState">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Disables the specified fixed-function attribute array.
	 *
	 * @param array the attribute array to disable. One of:<br><table><tr><td>{@link #GL_VERTEX_ARRAY VERTEX_ARRAY}</td><td>{@link #GL_NORMAL_ARRAY NORMAL_ARRAY}</td><td>{@link #GL_COLOR_ARRAY COLOR_ARRAY}</td><td>{@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY}</td><td>{@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY}</td></tr><tr><td>{@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY}</td><td>{@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}</td></tr></table>
	 */
	public static native void glDisableClientState(int array);

	// --- [ glDrawArrays ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glDrawArrays">Reference Page</a></p>
	 * 
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices. Elements {@code first} through
	 * <code>first + count &ndash; 1</code> of each enabled non-instanced array are transferred to the GL.
	 * 
	 * <p>If an array corresponding to an attribute required by a vertex shader is not enabled, then the corresponding element is taken from the current attribute
	 * state. If an array is enabled, the corresponding current vertex attribute value is unaffected by the execution of this function.</p>
	 *
	 * @param mode  the kind of primitives being constructed
	 * @param first the first vertex to transfer to the GL
	 * @param count the number of vertices after {@code first} to transfer to the GL
	 */
	public static native void glDrawArrays(int mode, int first, int count);

	// --- [ glDrawBuffer ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glDrawBuffer">Reference Page</a></p>
	 * 
	 * Defines the color buffer to which fragment color zero is written.
	 * 
	 * <p>Acceptable values for {@code buf} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is zero), or
	 * a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.</p>
	 *
	 * @param buf the color buffer to draw to. One of:<br><table><tr><td>{@link #GL_NONE NONE}</td><td>{@link #GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link #GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link #GL_BACK_LEFT BACK_LEFT}</td><td>{@link #GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_LEFT LEFT}</td></tr><tr><td>{@link #GL_RIGHT RIGHT}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link #GL_AUX0 AUX0}</td><td>{@link #GL_AUX1 AUX1}</td><td>{@link #GL_AUX2 AUX2}</td><td>{@link #GL_AUX3 AUX3}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
	 */
	public static native void glDrawBuffer(int buf);

	// --- [ glDrawElements ] ---

	/**
	 * Unsafe version of: {@link #glDrawElements DrawElements}
	 *
	 * @param count the number of vertices to transfer to the GL
	 * @param type  indicates the type of index values in {@code indices}. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 */
	public static native void nglDrawElements(int mode, int count, int type, long indices);

	/**
	 * <p><a href="http://docs.gl/gl4/glDrawElements">Reference Page</a></p>
	 * 
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL.
	 * The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or
	 * from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.
	 *
	 * @param mode    the kind of primitives being constructed. One of:<br><table><tr><td>{@link #GL_POINTS POINTS}</td><td>{@link #GL_LINE_STRIP LINE_STRIP}</td><td>{@link #GL_LINE_LOOP LINE_LOOP}</td><td>{@link #GL_LINES LINES}</td><td>{@link #GL_POLYGON POLYGON}</td><td>{@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link #GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link #GL_TRIANGLES TRIANGLES}</td><td>{@link #GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link #GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count   the number of vertices to transfer to the GL
	 * @param type    indicates the type of index values in {@code indices}. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices the index values
	 */
	public static void glDrawElements(int mode, int count, int type, long indices) {
		nglDrawElements(mode, count, type, indices);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glDrawElements">Reference Page</a></p>
	 * 
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL.
	 * The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or
	 * from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.
	 *
	 * @param mode    the kind of primitives being constructed. One of:<br><table><tr><td>{@link #GL_POINTS POINTS}</td><td>{@link #GL_LINE_STRIP LINE_STRIP}</td><td>{@link #GL_LINE_LOOP LINE_LOOP}</td><td>{@link #GL_LINES LINES}</td><td>{@link #GL_POLYGON POLYGON}</td><td>{@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link #GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link #GL_TRIANGLES TRIANGLES}</td><td>{@link #GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link #GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param type    indicates the type of index values in {@code indices}. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices the index values
	 */
	public static void glDrawElements(int mode, int type, ByteBuffer indices) {
		nglDrawElements(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glDrawElements">Reference Page</a></p>
	 * 
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL.
	 * The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or
	 * from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.
	 *
	 * @param mode    the kind of primitives being constructed. One of:<br><table><tr><td>{@link #GL_POINTS POINTS}</td><td>{@link #GL_LINE_STRIP LINE_STRIP}</td><td>{@link #GL_LINE_LOOP LINE_LOOP}</td><td>{@link #GL_LINES LINES}</td><td>{@link #GL_POLYGON POLYGON}</td><td>{@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link #GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link #GL_TRIANGLES TRIANGLES}</td><td>{@link #GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link #GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices the index values
	 */
	public static void glDrawElements(int mode, ByteBuffer indices) {
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glDrawElements">Reference Page</a></p>
	 * 
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL.
	 * The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or
	 * from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.
	 *
	 * @param mode    the kind of primitives being constructed. One of:<br><table><tr><td>{@link #GL_POINTS POINTS}</td><td>{@link #GL_LINE_STRIP LINE_STRIP}</td><td>{@link #GL_LINE_LOOP LINE_LOOP}</td><td>{@link #GL_LINES LINES}</td><td>{@link #GL_POLYGON POLYGON}</td><td>{@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link #GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link #GL_TRIANGLES TRIANGLES}</td><td>{@link #GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link #GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices the index values
	 */
	public static void glDrawElements(int mode, ShortBuffer indices) {
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glDrawElements">Reference Page</a></p>
	 * 
	 * Constructs a sequence of geometric primitives by successively transferring elements for {@code count} vertices to the GL.
	 * The i<sup>th</sup> element transferred by {@code DrawElements} will be taken from element {@code indices[i]} (if no element array buffer is bound), or
	 * from the element whose index is stored in the currently bound element array buffer at offset {@code indices + i}.
	 *
	 * @param mode    the kind of primitives being constructed. One of:<br><table><tr><td>{@link #GL_POINTS POINTS}</td><td>{@link #GL_LINE_STRIP LINE_STRIP}</td><td>{@link #GL_LINE_LOOP LINE_LOOP}</td><td>{@link #GL_LINES LINES}</td><td>{@link #GL_POLYGON POLYGON}</td><td>{@link #GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link #GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link #GL_TRIANGLES TRIANGLES}</td><td>{@link #GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link #GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param indices the index values
	 */
	public static void glDrawElements(int mode, IntBuffer indices) {
		nglDrawElements(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices));
	}

	// --- [ glDrawPixels ] ---

	/** Unsafe version of: {@link #glDrawPixels DrawPixels} */
	public static native void nglDrawPixels(int width, int height, int format, int type, long pixels);

	/**
	 * <p><a href="http://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Draws a pixel rectangle to the active draw buffers.
	 *
	 * @param width  the pixel rectangle width
	 * @param height the pixel rectangle height
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the pixel data
	 */
	public static void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels) {
		nglDrawPixels(width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Draws a pixel rectangle to the active draw buffers.
	 *
	 * @param width  the pixel rectangle width
	 * @param height the pixel rectangle height
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the pixel data
	 */
	public static void glDrawPixels(int width, int height, int format, int type, long pixels) {
		nglDrawPixels(width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Draws a pixel rectangle to the active draw buffers.
	 *
	 * @param width  the pixel rectangle width
	 * @param height the pixel rectangle height
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the pixel data
	 */
	public static void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels) {
		nglDrawPixels(width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Draws a pixel rectangle to the active draw buffers.
	 *
	 * @param width  the pixel rectangle width
	 * @param height the pixel rectangle height
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the pixel data
	 */
	public static void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels) {
		nglDrawPixels(width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Draws a pixel rectangle to the active draw buffers.
	 *
	 * @param width  the pixel rectangle width
	 * @param height the pixel rectangle height
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the pixel data
	 */
	public static void glDrawPixels(int width, int height, int format, int type, FloatBuffer pixels) {
		nglDrawPixels(width, height, format, type, memAddress(pixels));
	}

	// --- [ glEdgeFlag ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEdgeFlag">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static native void glEdgeFlag(boolean flag);

	// --- [ glEdgeFlagv ] ---

	/** Unsafe version of: {@link #glEdgeFlagv EdgeFlagv} */
	public static native void nglEdgeFlagv(long flag);

	/**
	 * <p><a href="http://docs.gl/gl3/glEdgeFlagv">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEdgeFlag EdgeFlag}.
	 *
	 * @param flag the edge flag buffer
	 */
	public static void glEdgeFlagv(ByteBuffer flag) {
		if ( CHECKS )
			check(flag, 1);
		nglEdgeFlagv(memAddress(flag));
	}

	// --- [ glEdgeFlagPointer ] ---

	/** Unsafe version of: {@link #glEdgeFlagPointer EdgeFlagPointer} */
	public static native void nglEdgeFlagPointer(int stride, long pointer);

	/**
	 * <p><a href="http://docs.gl/gl3/glEdgeFlagPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of an edge flag array.
	 *
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the edge flag array data
	 */
	public static void glEdgeFlagPointer(int stride, ByteBuffer pointer) {
		nglEdgeFlagPointer(stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glEdgeFlagPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of an edge flag array.
	 *
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the edge flag array data
	 */
	public static void glEdgeFlagPointer(int stride, long pointer) {
		nglEdgeFlagPointer(stride, pointer);
	}

	// --- [ glEnableClientState ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEnableClientState">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Enables the specified fixed-function attribute array.
	 *
	 * @param array the attribute array to enable. One of:<br><table><tr><td>{@link #GL_VERTEX_ARRAY VERTEX_ARRAY}</td><td>{@link #GL_NORMAL_ARRAY NORMAL_ARRAY}</td><td>{@link #GL_COLOR_ARRAY COLOR_ARRAY}</td><td>{@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY}</td><td>{@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY}</td></tr><tr><td>{@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY}</td><td>{@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}</td></tr></table>
	 */
	public static native void glEnableClientState(int array);

	// --- [ glEnd ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEnd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Ends the definition of vertex attributes of a sequence of primitives to be transferred to the GL.
	 */
	public static native void glEnd();

	// --- [ glEvalCoord1f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Causes evaluation of the enabled one-dimensional evaluator maps.
	 *
	 * @param u the domain coordinate u
	 */
	public static native void glEvalCoord1f(float u);

	// --- [ glEvalCoord1fv ] ---

	/** Unsafe version of: {@link #glEvalCoord1fv EvalCoord1fv} */
	public static native void nglEvalCoord1fv(long u);

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEvalCoord1f EvalCoord1f}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord1fv(FloatBuffer u) {
		if ( CHECKS )
			check(u, 1);
		nglEvalCoord1fv(memAddress(u));
	}

	// --- [ glEvalCoord1d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glEvalCoord1f EvalCoord1f}.
	 *
	 * @param u the domain coordinate u
	 */
	public static native void glEvalCoord1d(double u);

	// --- [ glEvalCoord1dv ] ---

	/** Unsafe version of: {@link #glEvalCoord1dv EvalCoord1dv} */
	public static native void nglEvalCoord1dv(long u);

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEvalCoord1d EvalCoord1d}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord1dv(DoubleBuffer u) {
		if ( CHECKS )
			check(u, 1);
		nglEvalCoord1dv(memAddress(u));
	}

	// --- [ glEvalCoord2f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Causes evaluation of the enabled two-dimensional evaluator maps.
	 *
	 * @param u the domain coordinate u
	 * @param v the domain coordinate v
	 */
	public static native void glEvalCoord2f(float u, float v);

	// --- [ glEvalCoord2fv ] ---

	/** Unsafe version of: {@link #glEvalCoord2fv EvalCoord2fv} */
	public static native void nglEvalCoord2fv(long u);

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEvalCoord2f EvalCoord2f}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord2fv(FloatBuffer u) {
		if ( CHECKS )
			check(u, 2);
		nglEvalCoord2fv(memAddress(u));
	}

	// --- [ glEvalCoord2d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glEvalCoord2f EvalCoord2f}.
	 *
	 * @param u the domain coordinate u
	 * @param v the domain coordinate v
	 */
	public static native void glEvalCoord2d(double u, double v);

	// --- [ glEvalCoord2dv ] ---

	/** Unsafe version of: {@link #glEvalCoord2dv EvalCoord2dv} */
	public static native void nglEvalCoord2dv(long u);

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glEvalCoord2d EvalCoord2d}.
	 *
	 * @param u the domain coordinate buffer
	 */
	public static void glEvalCoord2dv(DoubleBuffer u) {
		if ( CHECKS )
			check(u, 2);
		nglEvalCoord2dv(memAddress(u));
	}

	// --- [ glEvalMesh1 ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalMesh1">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Carries out an evaluation on a subset of the one-dimensional map grid.
	 *
	 * @param mode the mesh type. One of:<br><table><tr><td>{@link #GL_POINT POINT}</td><td>{@link #GL_LINE LINE}</td></tr></table>
	 * @param i1   the start index
	 * @param i2   the end index
	 */
	public static native void glEvalMesh1(int mode, int i1, int i2);

	// --- [ glEvalMesh2 ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalMesh2">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Carries out an evaluation on a rectangular subset of the two-dimensional map grid.
	 *
	 * @param mode the mesh type. One of:<br><table><tr><td>{@link #GL_FILL FILL}</td><td>{@link #GL_LINE LINE}</td><td>{@link #GL_POINT POINT}</td></tr></table>
	 * @param i1   the u-dimension start index
	 * @param i2   the u-dimension end index
	 * @param j1   the v-dimension start index
	 * @param j2   the v-dimension end index
	 */
	public static native void glEvalMesh2(int mode, int i1, int i2, int j1, int j2);

	// --- [ glEvalPoint1 ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalPoint1">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Carries out an evalutation of a single point on the one-dimensional map grid.
	 *
	 * @param i the grid index
	 */
	public static native void glEvalPoint1(int i);

	// --- [ glEvalPoint2 ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalPoint2">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Carries out an evalutation of a single point on the two-dimensional map grid.
	 *
	 * @param i the u-dimension grid index
	 * @param j the v-dimension grid index
	 */
	public static native void glEvalPoint2(int i, int j);

	// --- [ glFeedbackBuffer ] ---

	/**
	 * Unsafe version of: {@link #glFeedbackBuffer FeedbackBuffer}
	 *
	 * @param size the maximum number of values that can be written to {@code buffer}
	 */
	public static native void nglFeedbackBuffer(int size, int type, long buffer);

	/**
	 * <p><a href="http://docs.gl/gl3/glFeedbackBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns information about primitives when the GL is in feedback mode.
	 *
	 * @param type   the type of information to feed back for each vertex. One of:<br><table><tr><td>{@link #GL_2D 2D}</td><td>{@link #GL_3D 3D}</td><td>{@link #GL_3D_COLOR 3D_COLOR}</td><td>{@link #GL_3D_COLOR_TEXTURE 3D_COLOR_TEXTURE}</td><td>{@link #GL_4D_COLOR_TEXTURE 4D_COLOR_TEXTURE}</td></tr></table>
	 * @param buffer an array of floating-point values into which feedback information will be placed
	 */
	public static void glFeedbackBuffer(int type, FloatBuffer buffer) {
		nglFeedbackBuffer(buffer.remaining(), type, memAddress(buffer));
	}

	// --- [ glFinish ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glFinish">Reference Page</a></p>
	 * 
	 * Forces all previously issued GL commands to complete. {@code Finish} does not return until all effects from such commands on GL client and server
	 * state and the framebuffer are fully realized.
	 */
	public static native void glFinish();

	// --- [ glFlush ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glFlush">Reference Page</a></p>
	 * 
	 * Causes all previously issued GL commands to complete in finite time (although such commands may still be executing when {@code Flush} returns).
	 */
	public static native void glFlush();

	// --- [ glFogi ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glFogi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the integer value of a fog parameter.
	 *
	 * @param pname the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_MODE FOG_MODE}</td><td>{@link GL15#GL_FOG_COORD_SRC FOG_COORD_SRC}</td></tr></table>
	 * @param param the fog parameter value. One of:<br><table><tr><td>{@link #GL_EXP EXP}</td><td>{@link #GL_EXP2 EXP2}</td><td>{@link #GL_LINEAR LINEAR}</td><td>{@link GL14#GL_FRAGMENT_DEPTH FRAGMENT_DEPTH}</td><td>{@link GL15#GL_FOG_COORD FOG_COORD}</td></tr></table>
	 */
	public static native void glFogi(int pname, int param);

	// --- [ glFogiv ] ---

	/** Unsafe version of: {@link #glFogiv Fogiv} */
	public static native void nglFogiv(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glFogi Fogi}.
	 *
	 * @param pname  the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_MODE FOG_MODE}</td><td>{@link GL15#GL_FOG_COORD_SRC FOG_COORD_SRC}</td></tr></table>
	 * @param params the fog parameter buffer
	 */
	public static void glFogiv(int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglFogiv(pname, memAddress(params));
	}

	// --- [ glFogf ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glFogf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the float value of a fog parameter.
	 *
	 * @param pname the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_DENSITY FOG_DENSITY}</td><td>{@link #GL_FOG_START FOG_START}</td><td>{@link #GL_FOG_END FOG_END}</td></tr></table>
	 * @param param the fog parameter value
	 */
	public static native void glFogf(int pname, float param);

	// --- [ glFogfv ] ---

	/** Unsafe version of: {@link #glFogfv Fogfv} */
	public static native void nglFogfv(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glFogf Fogf}.
	 *
	 * @param pname  the fog parameter. One of:<br><table><tr><td>{@link #GL_FOG_DENSITY FOG_DENSITY}</td><td>{@link #GL_FOG_START FOG_START}</td><td>{@link #GL_FOG_END FOG_END}</td></tr></table>
	 * @param params the fog parameter buffer
	 */
	public static void glFogfv(int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglFogfv(pname, memAddress(params));
	}

	// --- [ glFrontFace ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glFrontFace">Reference Page</a></p>
	 * 
	 * The first step of polygon rasterization is to determine if the polygon is back-facing or front-facing. This determination is made based on the sign of
	 * the (clipped or unclipped) polygon's area computed in window coordinates. The interpretation of the sign of this value is controlled with this function.
	 * In the initial state, the front face direction is set to {@link #GL_CCW CCW}.
	 *
	 * @param dir the front face direction. One of:<br><table><tr><td>{@link #GL_CCW CCW}</td><td>{@link #GL_CW CW}</td></tr></table>
	 */
	public static native void glFrontFace(int dir);

	// --- [ glGenLists ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glGenLists">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns an integer n such that the indices {@code n,..., n + s - 1} are previously unused (i.e. there are {@code s} previously unused display list
	 * indices starting at n). {@code GenLists} also has the effect of creating an empty display list for each of the indices {@code n,..., n + s - 1}, so
	 * that these indices all become used. {@code GenLists} returns zero if there is no group of {@code s} contiguous previously unused display list indices,
	 * or if {@code s = 0}.
	 *
	 * @param s the number of display lists to create
	 */
	public static native int glGenLists(int s);

	// --- [ glGenTextures ] ---

	/**
	 * Unsafe version of: {@link #glGenTextures GenTextures}
	 *
	 * @param n the number of textures to create
	 */
	public static native void nglGenTextures(int n, long textures);

	/**
	 * <p><a href="http://docs.gl/gl4/glGenTextures">Reference Page</a></p>
	 * 
	 * Returns n previously unused texture names in textures. These names are marked as used, for the purposes of GenTextures only, but they acquire texture
	 * state and a dimensionality only when they are first bound, just as if they were unused.
	 *
	 * @param textures a scalar or buffer in which to place the returned texture names
	 */
	public static void glGenTextures(IntBuffer textures) {
		nglGenTextures(textures.remaining(), memAddress(textures));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGenTextures">Reference Page</a></p>
	 * 
	 * Returns n previously unused texture names in textures. These names are marked as used, for the purposes of GenTextures only, but they acquire texture
	 * state and a dimensionality only when they are first bound, just as if they were unused.
	 */
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

	// --- [ glDeleteTextures ] ---

	/**
	 * Unsafe version of: {@link #glDeleteTextures DeleteTextures}
	 *
	 * @param n the number of texture names in the {@code textures} parameter
	 */
	public static native void nglDeleteTextures(int n, long textures);

	/**
	 * <p><a href="http://docs.gl/gl4/glDeleteTextures">Reference Page</a></p>
	 * 
	 * Deletes texture objects. After a texture object is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is
	 * currently bound to any of the target bindings of {@link #glBindTexture BindTexture} is deleted, it is as though {@link #glBindTexture BindTexture} had been executed with the
	 * same target and texture zero. Additionally, special care must be taken when deleting a texture if any of the images of the texture are attached to a
	 * framebuffer object.
	 * 
	 * <p>Unused names in textures that have been marked as used for the purposes of {@link #glGenTextures GenTextures} are marked as unused again. Unused names in textures are
	 * silently ignored, as is the name zero.</p>
	 *
	 * @param textures contains {@code n} names of texture objects to be deleted
	 */
	public static void glDeleteTextures(IntBuffer textures) {
		nglDeleteTextures(textures.remaining(), memAddress(textures));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glDeleteTextures">Reference Page</a></p>
	 * 
	 * Deletes texture objects. After a texture object is deleted, it has no contents or dimensionality, and its name is again unused. If a texture that is
	 * currently bound to any of the target bindings of {@link #glBindTexture BindTexture} is deleted, it is as though {@link #glBindTexture BindTexture} had been executed with the
	 * same target and texture zero. Additionally, special care must be taken when deleting a texture if any of the images of the texture are attached to a
	 * framebuffer object.
	 * 
	 * <p>Unused names in textures that have been marked as used for the purposes of {@link #glGenTextures GenTextures} are marked as unused again. Unused names in textures are
	 * silently ignored, as is the name zero.</p>
	 */
	public static void glDeleteTextures(int texture) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer textures = stack.ints(texture);
			nglDeleteTextures(1, memAddress(textures));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetClipPlane ] ---

	/** Unsafe version of: {@link #glGetClipPlane GetClipPlane} */
	public static native void nglGetClipPlane(int plane, long equation);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetClipPlane">Reference Page</a></p>
	 * 
	 * Returns four double-precision values in {@code equation}; these are the coefficients of the plane equation of plane in eye coordinates (these
	 * coordinates are those that were computed when the plane was specified).
	 *
	 * @param plane    the clip plane
	 * @param equation a buffer in which to place the returned values
	 */
	public static void glGetClipPlane(int plane, DoubleBuffer equation) {
		if ( CHECKS )
			check(equation, 4);
		nglGetClipPlane(plane, memAddress(equation));
	}

	// --- [ glGetBooleanv ] ---

	/** Unsafe version of: {@link #glGetBooleanv GetBooleanv} */
	public static native void nglGetBooleanv(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetBooleanv">Reference Page</a></p>
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
		if ( CHECKS )
			check(params, 1);
		nglGetBooleanv(pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetBooleanv">Reference Page</a></p>
	 * 
	 * Returns the current boolean value of the specified state variable.
	 * 
	 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
	 *
	 * @param pname the state variable
	 */
	public static boolean glGetBoolean(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer params = stack.calloc(1);
			nglGetBooleanv(pname, memAddress(params));
			return params.get(0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetFloatv ] ---

	/** Unsafe version of: {@link #glGetFloatv GetFloatv} */
	public static native void nglGetFloatv(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetFloatv">Reference Page</a></p>
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
	public static void glGetFloatv(int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetFloatv(pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetFloatv">Reference Page</a></p>
	 * 
	 * Returns the current float value of the specified state variable.
	 * 
	 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
	 *
	 * @param pname the state variable
	 */
	public static float glGetFloat(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetFloatv(pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetIntegerv ] ---

	/** Unsafe version of: {@link #glGetIntegerv GetIntegerv} */
	public static native void nglGetIntegerv(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetIntegerv">Reference Page</a></p>
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
	public static void glGetIntegerv(int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetIntegerv(pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetIntegerv">Reference Page</a></p>
	 * 
	 * Returns the current integer value of the specified state variable.
	 * 
	 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
	 *
	 * @param pname the state variable
	 */
	public static int glGetInteger(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetIntegerv(pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetDoublev ] ---

	/** Unsafe version of: {@link #glGetDoublev GetDoublev} */
	public static native void nglGetDoublev(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetDoublev">Reference Page</a></p>
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
	public static void glGetDoublev(int pname, DoubleBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetDoublev(pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetDoublev">Reference Page</a></p>
	 * 
	 * Returns the current double value of the specified state variable.
	 * 
	 * <p><b>LWJGL note</b>: The state that corresponds to the state variable may be a single value or an array of values. In the case of an array of values,
	 * LWJGL will <b>not</b> validate if {@code params} has enough space to store that array. Doing so would introduce significant overhead, as the
	 * OpenGL state variables are too many. It is the user's responsibility to avoid JVM crashes by ensuring enough space for the returned values.</p>
	 *
	 * @param pname the state variable
	 */
	public static double glGetDouble(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			DoubleBuffer params = stack.callocDouble(1);
			nglGetDoublev(pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetError ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glGetError">Reference Page</a></p>
	 * 
	 * Returns error information. Each detectable error is assigned a numeric code. When an error is detected, a flag is set and the code is recorded. Further
	 * errors, if they occur, do not affect this recorded code. When {@code GetError} is called, the code is returned and the flag is cleared, so that a
	 * further error will again record its code. If a call to {@code GetError} returns {@link #GL_NO_ERROR NO_ERROR}, then there has been no detectable error since
	 * the last call to {@code GetError} (or since the GL was initialized).
	 */
	public static native int glGetError();

	// --- [ glGetLightiv ] ---

	/** Unsafe version of: {@link #glGetLightiv GetLightiv} */
	public static native void nglGetLightiv(int light, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about light parameter {@code pname} for {@code light} in {@code data}.
	 *
	 * @param light the light for which to return information. One of:<br><table><tr><td>{@link #GL_LIGHT0 LIGHT0}</td><td>GL_LIGHT[1-7]</td></tr></table>
	 * @param pname the light parameter to query. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_POSITION POSITION}</td><td>{@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}</td><td>{@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}</td></tr><tr><td>{@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}</td><td>{@link #GL_SPOT_DIRECTION SPOT_DIRECTION}</td><td>{@link #GL_SPOT_EXPONENT SPOT_EXPONENT}</td><td>{@link #GL_SPOT_CUTOFF SPOT_CUTOFF}</td></tr></table>
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetLightiv(int light, int pname, IntBuffer data) {
		if ( CHECKS )
			check(data, 4);
		nglGetLightiv(light, pname, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about light parameter {@code pname} for {@code light} in {@code data}.
	 *
	 * @param light the light for which to return information. One of:<br><table><tr><td>{@link #GL_LIGHT0 LIGHT0}</td><td>GL_LIGHT[1-7]</td></tr></table>
	 * @param pname the light parameter to query. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_POSITION POSITION}</td><td>{@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}</td><td>{@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}</td></tr><tr><td>{@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}</td><td>{@link #GL_SPOT_DIRECTION SPOT_DIRECTION}</td><td>{@link #GL_SPOT_EXPONENT SPOT_EXPONENT}</td><td>{@link #GL_SPOT_CUTOFF SPOT_CUTOFF}</td></tr></table>
	 */
	public static int glGetLighti(int light, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetLightiv(light, pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetLightfv ] ---

	/** Unsafe version of: {@link #glGetLightfv GetLightfv} */
	public static native void nglGetLightfv(int light, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetLightiv GetLightiv}.
	 *
	 * @param light the light for which to return information
	 * @param pname the light parameter to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetLightfv(int light, int pname, FloatBuffer data) {
		if ( CHECKS )
			check(data, 4);
		nglGetLightfv(light, pname, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetLightiv GetLightiv}.
	 *
	 * @param light the light for which to return information
	 * @param pname the light parameter to query
	 */
	public static float glGetLightf(int light, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer data = stack.callocFloat(1);
			nglGetLightfv(light, pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetMapiv ] ---

	/** Unsafe version of: {@link #glGetMapiv GetMapiv} */
	public static native void nglGetMapiv(int target, int query, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.
	 *
	 * @param target the evaluator target. One of:<br><table><tr><td>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link #GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link #GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link #GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link #GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link #GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link #GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link #GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link #GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link #GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
	 * @param query  the information to query. One of:<br><table><tr><td>{@link #GL_ORDER ORDER}</td><td>{@link #GL_COEFF COEFF}</td><td>{@link #GL_DOMAIN DOMAIN}</td></tr></table>
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetMapiv(int target, int query, IntBuffer data) {
		if ( CHECKS )
			check(data, 4);
		nglGetMapiv(target, query, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about {@code query} for evaluator map {@code target} in {@code data}.
	 *
	 * @param target the evaluator target. One of:<br><table><tr><td>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link #GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link #GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link #GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link #GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link #GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link #GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link #GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link #GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link #GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
	 * @param query  the information to query. One of:<br><table><tr><td>{@link #GL_ORDER ORDER}</td><td>{@link #GL_COEFF COEFF}</td><td>{@link #GL_DOMAIN DOMAIN}</td></tr></table>
	 */
	public static int glGetMapi(int target, int query) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetMapiv(target, query, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetMapfv ] ---

	/** Unsafe version of: {@link #glGetMapfv GetMapfv} */
	public static native void nglGetMapfv(int target, int query, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetMapiv GetMapiv}.
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetMapfv(int target, int query, FloatBuffer data) {
		if ( CHECKS )
			check(data, 4);
		nglGetMapfv(target, query, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetMapiv GetMapiv}.
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 */
	public static float glGetMapf(int target, int query) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer data = stack.callocFloat(1);
			nglGetMapfv(target, query, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetMapdv ] ---

	/** Unsafe version of: {@link #glGetMapdv GetMapdv} */
	public static native void nglGetMapdv(int target, int query, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glGetMapiv GetMapiv}.
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetMapdv(int target, int query, DoubleBuffer data) {
		if ( CHECKS )
			check(data, 4);
		nglGetMapdv(target, query, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glGetMapiv GetMapiv}.
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 */
	public static double glGetMapd(int target, int query) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			DoubleBuffer data = stack.callocDouble(1);
			nglGetMapdv(target, query, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetMaterialiv ] ---

	/** Unsafe version of: {@link #glGetMaterialiv GetMaterialiv} */
	public static native void nglGetMaterialiv(int face, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about material property {@code pname} for {@code face} in {@code data}.
	 *
	 * @param face  the material face for which to return information. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td></tr></table>
	 * @param pname the information to query. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_EMISSION EMISSION}</td><td>{@link #GL_SHININESS SHININESS}</td></tr></table>
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetMaterialiv(int face, int pname, IntBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetMaterialiv(face, pname, memAddress(data));
	}

	// --- [ glGetMaterialfv ] ---

	/** Unsafe version of: {@link #glGetMaterialfv GetMaterialfv} */
	public static native void nglGetMaterialfv(int face, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetMaterialiv GetMaterialiv}.
	 *
	 * @param face  the material face for which to return information
	 * @param pname the information to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetMaterialfv(int face, int pname, FloatBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetMaterialfv(face, pname, memAddress(data));
	}

	// --- [ glGetPixelMapfv ] ---

	/** Unsafe version of: {@link #glGetPixelMapfv GetPixelMapfv} */
	public static native void nglGetPixelMapfv(int map, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns all float values in the pixel map {@code map} in {@code data}.
	 *
	 * @param map  the pixel map parameter to query. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapfv(int map, FloatBuffer data) {
		if ( CHECKS )
			check(data, 32);
		nglGetPixelMapfv(map, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns all float values in the pixel map {@code map} in {@code data}.
	 *
	 * @param map  the pixel map parameter to query. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapfv(int map, long data) {
		nglGetPixelMapfv(map, data);
	}

	// --- [ glGetPixelMapusv ] ---

	/** Unsafe version of: {@link #glGetPixelMapusv GetPixelMapusv} */
	public static native void nglGetPixelMapusv(int map, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glGetPixelMapfv GetPixelMapfv}.
	 *
	 * @param map  the pixel map parameter to query
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapusv(int map, ShortBuffer data) {
		if ( CHECKS )
			check(data, 32);
		nglGetPixelMapusv(map, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glGetPixelMapfv GetPixelMapfv}.
	 *
	 * @param map  the pixel map parameter to query
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapusv(int map, long data) {
		nglGetPixelMapusv(map, data);
	}

	// --- [ glGetPixelMapuiv ] ---

	/** Unsafe version of: {@link #glGetPixelMapuiv GetPixelMapuiv} */
	public static native void nglGetPixelMapuiv(int map, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned integer version of {@link #glGetPixelMapfv GetPixelMapfv}.
	 *
	 * @param map  the pixel map parameter to query
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapuiv(int map, IntBuffer data) {
		if ( CHECKS )
			check(data, 32);
		nglGetPixelMapuiv(map, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned integer version of {@link #glGetPixelMapfv GetPixelMapfv}.
	 *
	 * @param map  the pixel map parameter to query
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetPixelMapuiv(int map, long data) {
		nglGetPixelMapuiv(map, data);
	}

	// --- [ glGetPointerv ] ---

	/** Unsafe version of: {@link #glGetPointerv GetPointerv} */
	public static native void nglGetPointerv(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetPointerv">Reference Page</a></p>
	 * 
	 * Returns a pointer in the current GL context.
	 *
	 * @param pname  the pointer to return. One of:<br><table><tr><td>{@link #GL_FEEDBACK_BUFFER_POINTER FEEDBACK_BUFFER_POINTER}</td><td>{@link #GL_SELECTION_BUFFER_POINTER SELECTION_BUFFER_POINTER}</td><td>{@link #GL_VERTEX_ARRAY_POINTER VERTEX_ARRAY_POINTER}</td></tr><tr><td>{@link #GL_NORMAL_ARRAY_POINTER NORMAL_ARRAY_POINTER}</td><td>{@link #GL_COLOR_ARRAY_POINTER COLOR_ARRAY_POINTER}</td><td>{@link #GL_INDEX_ARRAY_POINTER INDEX_ARRAY_POINTER}</td></tr><tr><td>{@link #GL_TEXTURE_COORD_ARRAY_POINTER TEXTURE_COORD_ARRAY_POINTER}</td><td>{@link #GL_EDGE_FLAG_ARRAY_POINTER EDGE_FLAG_ARRAY_POINTER}</td><td>{@link GL14#GL_SECONDARY_COLOR_ARRAY_POINTER SECONDARY_COLOR_ARRAY_POINTER}</td></tr><tr><td>{@link GL15#GL_FOG_COORD_ARRAY_POINTER FOG_COORD_ARRAY_POINTER}</td><td>{@link GL43#GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION}</td><td>{@link GL43#GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}</td></tr></table>
	 * @param params a buffer in which to place the returned pointer
	 */
	public static void glGetPointerv(int pname, PointerBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetPointerv(pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetPointerv">Reference Page</a></p>
	 * 
	 * Returns a pointer in the current GL context.
	 *
	 * @param pname the pointer to return. One of:<br><table><tr><td>{@link #GL_FEEDBACK_BUFFER_POINTER FEEDBACK_BUFFER_POINTER}</td><td>{@link #GL_SELECTION_BUFFER_POINTER SELECTION_BUFFER_POINTER}</td><td>{@link #GL_VERTEX_ARRAY_POINTER VERTEX_ARRAY_POINTER}</td></tr><tr><td>{@link #GL_NORMAL_ARRAY_POINTER NORMAL_ARRAY_POINTER}</td><td>{@link #GL_COLOR_ARRAY_POINTER COLOR_ARRAY_POINTER}</td><td>{@link #GL_INDEX_ARRAY_POINTER INDEX_ARRAY_POINTER}</td></tr><tr><td>{@link #GL_TEXTURE_COORD_ARRAY_POINTER TEXTURE_COORD_ARRAY_POINTER}</td><td>{@link #GL_EDGE_FLAG_ARRAY_POINTER EDGE_FLAG_ARRAY_POINTER}</td><td>{@link GL14#GL_SECONDARY_COLOR_ARRAY_POINTER SECONDARY_COLOR_ARRAY_POINTER}</td></tr><tr><td>{@link GL15#GL_FOG_COORD_ARRAY_POINTER FOG_COORD_ARRAY_POINTER}</td><td>{@link GL43#GL_DEBUG_CALLBACK_FUNCTION DEBUG_CALLBACK_FUNCTION}</td><td>{@link GL43#GL_DEBUG_CALLBACK_USER_PARAM DEBUG_CALLBACK_USER_PARAM}</td></tr></table>
	 */
	public static long glGetPointer(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			PointerBuffer params = stack.callocPointer(1);
			nglGetPointerv(pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetPolygonStipple ] ---

	/** Unsafe version of: {@link #glGetPolygonStipple GetPolygonStipple} */
	public static native void nglGetPolygonStipple(long pattern);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Obtains the polygon stipple.
	 *
	 * @param pattern a buffer in which to place the returned data
	 */
	public static void glGetPolygonStipple(ByteBuffer pattern) {
		if ( CHECKS )
			check(pattern, 128);
		nglGetPolygonStipple(memAddress(pattern));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Obtains the polygon stipple.
	 *
	 * @param pattern a buffer in which to place the returned data
	 */
	public static void glGetPolygonStipple(long pattern) {
		nglGetPolygonStipple(pattern);
	}

	// --- [ glGetString ] ---

	/** Unsafe version of: {@link #glGetString GetString} */
	public static native long nglGetString(int name);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetString">Reference Page</a></p>
	 * 
	 * Return strings describing properties of the current GL context.
	 *
	 * @param name the property to query. One of:<br><table><tr><td>{@link #GL_RENDERER RENDERER}</td><td>{@link #GL_VENDOR VENDOR}</td><td>{@link #GL_EXTENSIONS EXTENSIONS}</td><td>{@link #GL_VERSION VERSION}</td><td>{@link GL20#GL_SHADING_LANGUAGE_VERSION SHADING_LANGUAGE_VERSION}</td></tr></table>
	 */
	public static String glGetString(int name) {
		long __result = nglGetString(name);
		return memUTF8(__result);
	}

	// --- [ glGetTexEnviv ] ---

	/** Unsafe version of: {@link #glGetTexEnviv GetTexEnviv} */
	public static native void nglGetTexEnviv(int env, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexEnv">Reference Page</a></p>
	 * 
	 * Returns integer information about {@code pname} for {@code env} in {@code data}.
	 *
	 * @param env   the texture environment to query. One of:<br><table><tr><td>{@link GL20#GL_POINT_SPRITE POINT_SPRITE}</td><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td><td>{@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}</td></tr></table>
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}</td><td>{@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}</td><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL13#GL_COMBINE_RGB COMBINE_RGB}</td><td>{@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}</td></tr><tr><td>{@link GL15#GL_SRC0_RGB SRC0_RGB}</td><td>{@link GL15#GL_SRC1_RGB SRC1_RGB}</td><td>{@link GL15#GL_SRC2_RGB SRC2_RGB}</td><td>{@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}</td></tr><tr><td>{@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}</td><td>{@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}</td><td>{@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}</td><td>{@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}</td><td>{@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}</td><td>{@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}</td></tr><tr><td>{@link GL13#GL_RGB_SCALE RGB_SCALE}</td><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr></table>
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexEnviv(int env, int pname, IntBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetTexEnviv(env, pname, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexEnv">Reference Page</a></p>
	 * 
	 * Returns integer information about {@code pname} for {@code env} in {@code data}.
	 *
	 * @param env   the texture environment to query. One of:<br><table><tr><td>{@link GL20#GL_POINT_SPRITE POINT_SPRITE}</td><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td><td>{@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}</td></tr></table>
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}</td><td>{@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}</td><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL13#GL_COMBINE_RGB COMBINE_RGB}</td><td>{@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}</td></tr><tr><td>{@link GL15#GL_SRC0_RGB SRC0_RGB}</td><td>{@link GL15#GL_SRC1_RGB SRC1_RGB}</td><td>{@link GL15#GL_SRC2_RGB SRC2_RGB}</td><td>{@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}</td></tr><tr><td>{@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}</td><td>{@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}</td><td>{@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}</td><td>{@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}</td><td>{@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}</td><td>{@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}</td></tr><tr><td>{@link GL13#GL_RGB_SCALE RGB_SCALE}</td><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr></table>
	 */
	public static int glGetTexEnvi(int env, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetTexEnviv(env, pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexEnvfv ] ---

	/** Unsafe version of: {@link #glGetTexEnvfv GetTexEnvfv} */
	public static native void nglGetTexEnvfv(int env, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexEnv">Reference Page</a></p>
	 * 
	 * Float version of {@link #glGetTexEnviv GetTexEnviv}.
	 *
	 * @param env   the texture environment to query
	 * @param pname the parameter to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexEnvfv(int env, int pname, FloatBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetTexEnvfv(env, pname, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexEnv">Reference Page</a></p>
	 * 
	 * Float version of {@link #glGetTexEnviv GetTexEnviv}.
	 *
	 * @param env   the texture environment to query
	 * @param pname the parameter to query
	 */
	public static float glGetTexEnvf(int env, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer data = stack.callocFloat(1);
			nglGetTexEnvfv(env, pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexGeniv ] ---

	/** Unsafe version of: {@link #glGetTexGeniv GetTexGeniv} */
	public static native void nglGetTexGeniv(int coord, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about {@code pname} for {@code coord} in {@code data}.
	 *
	 * @param coord the coord to query. One of:<br><table><tr><td>{@link #GL_S S}</td><td>{@link #GL_T T}</td><td>{@link #GL_R R}</td><td>{@link #GL_Q Q}</td></tr></table>
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link #GL_EYE_PLANE EYE_PLANE}</td><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}</td></tr></table>
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexGeniv(int coord, int pname, IntBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetTexGeniv(coord, pname, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns integer information about {@code pname} for {@code coord} in {@code data}.
	 *
	 * @param coord the coord to query. One of:<br><table><tr><td>{@link #GL_S S}</td><td>{@link #GL_T T}</td><td>{@link #GL_R R}</td><td>{@link #GL_Q Q}</td></tr></table>
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link #GL_EYE_PLANE EYE_PLANE}</td><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}</td></tr></table>
	 */
	public static int glGetTexGeni(int coord, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetTexGeniv(coord, pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexGenfv ] ---

	/** Unsafe version of: {@link #glGetTexGenfv GetTexGenfv} */
	public static native void nglGetTexGenfv(int coord, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetTexGeniv GetTexGeniv}.
	 *
	 * @param coord the coord to query
	 * @param pname the parameter to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexGenfv(int coord, int pname, FloatBuffer data) {
		if ( CHECKS )
			check(data, 4);
		nglGetTexGenfv(coord, pname, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glGetTexGeniv GetTexGeniv}.
	 *
	 * @param coord the coord to query
	 * @param pname the parameter to query
	 */
	public static float glGetTexGenf(int coord, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer data = stack.callocFloat(1);
			nglGetTexGenfv(coord, pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexGendv ] ---

	/** Unsafe version of: {@link #glGetTexGendv GetTexGendv} */
	public static native void nglGetTexGendv(int coord, int pname, long data);

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glGetTexGeniv GetTexGeniv}.
	 *
	 * @param coord the coord to query
	 * @param pname the parameter to query
	 * @param data  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexGendv(int coord, int pname, DoubleBuffer data) {
		if ( CHECKS )
			check(data, 4);
		nglGetTexGendv(coord, pname, memAddress(data));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glGetTexGeniv GetTexGeniv}.
	 *
	 * @param coord the coord to query
	 * @param pname the parameter to query
	 */
	public static double glGetTexGend(int coord, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			DoubleBuffer data = stack.callocDouble(1);
			nglGetTexGendv(coord, pname, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexImage ] ---

	/** Unsafe version of: {@link #glGetTexImage GetTexImage} */
	public static native void nglGetTexImage(int tex, int level, int format, int type, long pixels);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Obtains texture images.
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the buffer in which to place the returned data
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels) {
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Obtains texture images.
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the buffer in which to place the returned data
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, long pixels) {
		nglGetTexImage(tex, level, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Obtains texture images.
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the buffer in which to place the returned data
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels) {
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Obtains texture images.
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the buffer in which to place the returned data
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels) {
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Obtains texture images.
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the buffer in which to place the returned data
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels) {
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Obtains texture images.
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels the buffer in which to place the returned data
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels) {
		nglGetTexImage(tex, level, format, type, memAddress(pixels));
	}

	// --- [ glGetTexLevelParameteriv ] ---

	/** Unsafe version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	public static native void nglGetTexLevelParameteriv(int target, int level, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a></p>
	 * 
	 * Places integer information about texture image parameter {@code pname} for level-of-detail {@code level} of the specified {@code target} into {@code params}.
	 *
	 * @param target the texture image target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td><td>{@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link #GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link #GL_TEXTURE_BORDER TEXTURE_BORDER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link #GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link #GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td></tr><tr><td>{@link #GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td><td>{@link #GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link #GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link #GL_TEXTURE_LUMINANCE_SIZE TEXTURE_LUMINANCE_SIZE}</td></tr><tr><td>{@link #GL_TEXTURE_INTENSITY_SIZE TEXTURE_INTENSITY_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_RED_TYPE TEXTURE_RED_TYPE}</td><td>{@link GL30#GL_TEXTURE_GREEN_TYPE TEXTURE_GREEN_TYPE}</td><td>{@link GL30#GL_TEXTURE_BLUE_TYPE TEXTURE_BLUE_TYPE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_LUMINANCE_TYPE TEXTURE_LUMINANCE_TYPE}</td><td>{@link GL30#GL_TEXTURE_INTENSITY_TYPE TEXTURE_INTENSITY_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a></p>
	 * 
	 * Places integer information about texture image parameter {@code pname} for level-of-detail {@code level} of the specified {@code target} into {@code params}.
	 *
	 * @param target the texture image target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td><td>{@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE PROXY_TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link #GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link #GL_TEXTURE_BORDER TEXTURE_BORDER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link #GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link #GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td></tr><tr><td>{@link #GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td><td>{@link #GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link #GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link #GL_TEXTURE_LUMINANCE_SIZE TEXTURE_LUMINANCE_SIZE}</td></tr><tr><td>{@link #GL_TEXTURE_INTENSITY_SIZE TEXTURE_INTENSITY_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_RED_TYPE TEXTURE_RED_TYPE}</td><td>{@link GL30#GL_TEXTURE_GREEN_TYPE TEXTURE_GREEN_TYPE}</td><td>{@link GL30#GL_TEXTURE_BLUE_TYPE TEXTURE_BLUE_TYPE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_LUMINANCE_TYPE TEXTURE_LUMINANCE_TYPE}</td><td>{@link GL30#GL_TEXTURE_INTENSITY_TYPE TEXTURE_INTENSITY_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
	 */
	public static int glGetTexLevelParameteri(int target, int level, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexLevelParameterfv ] ---

	/** Unsafe version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	public static native void nglGetTexLevelParameterfv(int target, int level, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a></p>
	 * 
	 * Float version of {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}.
	 *
	 * @param target the texture image target
	 * @param level  the level-of-detail number
	 * @param pname  the parameter to query
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a></p>
	 * 
	 * Float version of {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}.
	 *
	 * @param target the texture image target
	 * @param level  the level-of-detail number
	 * @param pname  the parameter to query
	 */
	public static float glGetTexLevelParameterf(int target, int level, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexParameteriv ] ---

	/** Unsafe version of: {@link #glGetTexParameteriv GetTexParameteriv} */
	public static native void nglGetTexParameteriv(int target, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a></p>
	 * 
	 * Place integer information about texture parameter {@code pname} for the specified {@code target} into {@code params}.
	 *
	 * @param target the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link #GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link #GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link #GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link #GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td></tr><tr><td>{@link #GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link #GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td></tr><tr><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr><tr><td>{@link #GL_TEXTURE_RESIDENT TEXTURE_RESIDENT}</td></tr></table>
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetTexParameteriv(target, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a></p>
	 * 
	 * Place integer information about texture parameter {@code pname} for the specified {@code target} into {@code params}.
	 *
	 * @param target the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link #GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link #GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link #GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link #GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td></tr><tr><td>{@link #GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link #GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td></tr><tr><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr><tr><td>{@link #GL_TEXTURE_RESIDENT TEXTURE_RESIDENT}</td></tr></table>
	 */
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

	// --- [ glGetTexParameterfv ] ---

	/** Unsafe version of: {@link #glGetTexParameterfv GetTexParameterfv} */
	public static native void nglGetTexParameterfv(int target, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a></p>
	 * 
	 * Float version of {@link #glGetTexParameteriv GetTexParameteriv}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to query
	 * @param params a scalar or buffer in which to place the returned data
	 */
	public static void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetTexParameterfv(target, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a></p>
	 * 
	 * Float version of {@link #glGetTexParameteriv GetTexParameteriv}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to query
	 */
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

	// --- [ glHint ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glHint">Reference Page</a></p>
	 * 
	 * Certain aspects of GL behavior, when there is room for variation, may be controlled with this function. The initial value for all hints is
	 * {@link #GL_DONT_CARE DONT_CARE}.
	 *
	 * @param target the behavior to control. One of:<br><table><tr><td>{@link #GL_PERSPECTIVE_CORRECTION_HINT PERSPECTIVE_CORRECTION_HINT}</td><td>{@link #GL_POINT_SMOOTH_HINT POINT_SMOOTH_HINT}</td><td>{@link #GL_LINE_SMOOTH_HINT LINE_SMOOTH_HINT}</td><td>{@link #GL_POLYGON_SMOOTH_HINT POLYGON_SMOOTH_HINT}</td></tr><tr><td>{@link #GL_FOG_HINT FOG_HINT}</td><td>{@link GL14#GL_GENERATE_MIPMAP_HINT GENERATE_MIPMAP_HINT}</td><td>{@link GL13#GL_TEXTURE_COMPRESSION_HINT TEXTURE_COMPRESSION_HINT}</td><td>{@link GL20#GL_FRAGMENT_SHADER_DERIVATIVE_HINT FRAGMENT_SHADER_DERIVATIVE_HINT}</td></tr></table>
	 * @param hint   the behavior hint. One of:<br><table><tr><td>{@link #GL_FASTEST FASTEST}</td><td>{@link #GL_NICEST NICEST}</td><td>{@link #GL_DONT_CARE DONT_CARE}</td></tr></table>
	 */
	public static native void glHint(int target, int hint);

	// --- [ glIndexi ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Updates the current (single-valued) color index.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static native void glIndexi(int index);

	// --- [ glIndexub ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexub">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned byte version of {@link #glIndexi Indexi}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static native void glIndexub(byte index);

	// --- [ glIndexs ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexs">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glIndexi Indexi}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static native void glIndexs(short index);

	// --- [ glIndexf ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glIndexi Indexi}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static native void glIndexf(float index);

	// --- [ glIndexd ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glIndexi Indexi}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static native void glIndexd(double index);

	// --- [ glIndexiv ] ---

	/** Unsafe version of: {@link #glIndexiv Indexiv} */
	public static native void nglIndexiv(long index);

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexi Indexi}
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexiv(IntBuffer index) {
		if ( CHECKS )
			check(index, 1);
		nglIndexiv(memAddress(index));
	}

	// --- [ glIndexubv ] ---

	/** Unsafe version of: {@link #glIndexubv Indexubv} */
	public static native void nglIndexubv(long index);

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexub Indexub}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexubv(ByteBuffer index) {
		if ( CHECKS )
			check(index, 1);
		nglIndexubv(memAddress(index));
	}

	// --- [ glIndexsv ] ---

	/** Unsafe version of: {@link #glIndexsv Indexsv} */
	public static native void nglIndexsv(long index);

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexs Indexs}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexsv(ShortBuffer index) {
		if ( CHECKS )
			check(index, 1);
		nglIndexsv(memAddress(index));
	}

	// --- [ glIndexfv ] ---

	/** Unsafe version of: {@link #glIndexfv Indexfv} */
	public static native void nglIndexfv(long index);

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexf Indexf}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexfv(FloatBuffer index) {
		if ( CHECKS )
			check(index, 1);
		nglIndexfv(memAddress(index));
	}

	// --- [ glIndexdv ] ---

	/** Unsafe version of: {@link #glIndexdv Indexdv} */
	public static native void nglIndexdv(long index);

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glIndexd Indexd}.
	 *
	 * @param index the value to which the current color index should be set
	 */
	public static void glIndexdv(DoubleBuffer index) {
		if ( CHECKS )
			check(index, 1);
		nglIndexdv(memAddress(index));
	}

	// --- [ glIndexMask ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexMask">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * The least significant n bits of mask, where n is the number of bits in a color index buffer, specify a mask. Where a 1 appears in this mask, the
	 * corresponding bit in the color index buffer (or buffers) is written; where a 0 appears, the bit is not written. This mask applies only in color index
	 * mode.
	 *
	 * @param mask the color index mask value
	 */
	public static native void glIndexMask(int mask);

	// --- [ glIndexPointer ] ---

	/**
	 * Unsafe version of: {@link #glIndexPointer IndexPointer}
	 *
	 * @param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td></tr></table>
	 */
	public static native void nglIndexPointer(int type, int stride, long pointer);

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color index array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color index array data
	 */
	public static void glIndexPointer(int type, int stride, ByteBuffer pointer) {
		nglIndexPointer(type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color index array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color index array data
	 */
	public static void glIndexPointer(int type, int stride, long pointer) {
		nglIndexPointer(type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color index array.
	 *
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color index array data
	 */
	public static void glIndexPointer(int stride, ByteBuffer pointer) {
		nglIndexPointer(GL11.GL_UNSIGNED_BYTE, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color index array.
	 *
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color index array data
	 */
	public static void glIndexPointer(int stride, ShortBuffer pointer) {
		nglIndexPointer(GL11.GL_SHORT, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glIndexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a color index array.
	 *
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the color index array data
	 */
	public static void glIndexPointer(int stride, IntBuffer pointer) {
		nglIndexPointer(GL11.GL_INT, stride, memAddress(pointer));
	}

	// --- [ glInitNames ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glInitNames">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Clears the selection name stack.
	 */
	public static native void glInitNames();

	// --- [ glInterleavedArrays ] ---

	/** Unsafe version of: {@link #glInterleavedArrays InterleavedArrays} */
	public static native void nglInterleavedArrays(int format, int stride, long pointer);

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
	 *
	 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glInterleavedArrays(int format, int stride, ByteBuffer pointer) {
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
	 *
	 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glInterleavedArrays(int format, int stride, long pointer) {
		nglInterleavedArrays(format, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
	 *
	 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glInterleavedArrays(int format, int stride, ShortBuffer pointer) {
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
	 *
	 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glInterleavedArrays(int format, int stride, IntBuffer pointer) {
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
	 *
	 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glInterleavedArrays(int format, int stride, FloatBuffer pointer) {
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Efficiently initializes the six vertex arrays and their enables to one of 14 configurations.
	 *
	 * @param format  the interleaved array format. One of:<br><table><tr><td>{@link #GL_V2F V2F}</td><td>{@link #GL_V3F V3F}</td><td>{@link #GL_C4UB_V2F C4UB_V2F}</td><td>{@link #GL_C4UB_V3F C4UB_V3F}</td><td>{@link #GL_C3F_V3F C3F_V3F}</td><td>{@link #GL_N3F_V3F N3F_V3F}</td><td>{@link #GL_C4F_N3F_V3F C4F_N3F_V3F}</td><td>{@link #GL_T2F_V3F T2F_V3F}</td></tr><tr><td>{@link #GL_T4F_V4F T4F_V4F}</td><td>{@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F}</td><td>{@link #GL_T2F_C3F_V3F T2F_C3F_V3F}</td><td>{@link #GL_T2F_N3F_V3F T2F_N3F_V3F}</td><td>{@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F}</td><td>{@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glInterleavedArrays(int format, int stride, DoubleBuffer pointer) {
		nglInterleavedArrays(format, stride, memAddress(pointer));
	}

	// --- [ glIsEnabled ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glIsEnabled">Reference Page</a></p>
	 * 
	 * Determines if {@code cap} is currently enabled (as with {@link #glEnable Enable}) or disabled.
	 *
	 * @param cap the enable state to query
	 */
	public static native boolean glIsEnabled(int cap);

	// --- [ glIsList ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glIsList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Returns true if the {@code list} is the index of some display list.
	 *
	 * @param list the list index to query
	 */
	public static native boolean glIsList(int list);

	// --- [ glIsTexture ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glIsTexture">Reference Page</a></p>
	 * 
	 * Returns true if {@code texture} is the name of a texture object.
	 *
	 * @param texture the texture name to query
	 */
	public static native boolean glIsTexture(int texture);

	// --- [ glLightModeli ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glLightModeli">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Set the integer value of a lighting model parameter.
	 *
	 * @param pname the lighting model parameter to set. One of:<br><table><tr><td>{@link #GL_LIGHT_MODEL_AMBIENT LIGHT_MODEL_AMBIENT}</td><td>{@link #GL_LIGHT_MODEL_LOCAL_VIEWER LIGHT_MODEL_LOCAL_VIEWER}</td><td>{@link #GL_LIGHT_MODEL_TWO_SIDE LIGHT_MODEL_TWO_SIDE}</td></tr><tr><td>{@link GL12#GL_LIGHT_MODEL_COLOR_CONTROL LIGHT_MODEL_COLOR_CONTROL}</td></tr></table>
	 * @param param the parameter value
	 */
	public static native void glLightModeli(int pname, int param);

	// --- [ glLightModelf ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glLightModelf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glLightModeli LightModeli}.
	 *
	 * @param pname the lighting model parameter to set
	 * @param param the parameter value
	 */
	public static native void glLightModelf(int pname, float param);

	// --- [ glLightModeliv ] ---

	/** Unsafe version of: {@link #glLightModeliv LightModeliv} */
	public static native void nglLightModeliv(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glLightModeli LightModeli}.
	 *
	 * @param pname  the lighting model parameter to set
	 * @param params the parameter value
	 */
	public static void glLightModeliv(int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglLightModeliv(pname, memAddress(params));
	}

	// --- [ glLightModelfv ] ---

	/** Unsafe version of: {@link #glLightModelfv LightModelfv} */
	public static native void nglLightModelfv(int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glLightModelf LightModelf}.
	 *
	 * @param pname  the lighting model parameter to set
	 * @param params the parameter value
	 */
	public static void glLightModelfv(int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglLightModelfv(pname, memAddress(params));
	}

	// --- [ glLighti ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glLighti">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the integer value of a light parameter.
	 *
	 * @param light the light for which to set the parameter. One of:<br><table><tr><td>{@link #GL_LIGHT0 LIGHT0}</td><td>GL_LIGHT[1-7]</td></tr></table>
	 * @param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_POSITION POSITION}</td><td>{@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION}</td><td>{@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION}</td></tr><tr><td>{@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION}</td><td>{@link #GL_SPOT_DIRECTION SPOT_DIRECTION}</td><td>{@link #GL_SPOT_EXPONENT SPOT_EXPONENT}</td><td>{@link #GL_SPOT_CUTOFF SPOT_CUTOFF}</td></tr></table>
	 * @param param the parameter value
	 */
	public static native void glLighti(int light, int pname, int param);

	// --- [ glLightf ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glLightf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glLighti Lighti}.
	 *
	 * @param light the light for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static native void glLightf(int light, int pname, float param);

	// --- [ glLightiv ] ---

	/** Unsafe version of: {@link #glLightiv Lightiv} */
	public static native void nglLightiv(int light, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glLighti Lighti}.
	 *
	 * @param light  the light for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glLightiv(int light, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglLightiv(light, pname, memAddress(params));
	}

	// --- [ glLightfv ] ---

	/** Unsafe version of: {@link #glLightfv Lightfv} */
	public static native void nglLightfv(int light, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glLightf Lightf}.
	 *
	 * @param light  the light for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glLightfv(int light, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglLightfv(light, pname, memAddress(params));
	}

	// --- [ glLineStipple ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glLineStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Defines a line stipple. It determines those fragments that are to be drawn when the line is rasterized. Line stippling may be enabled or disabled using
	 * {@link #glEnable Enable} or {@link #glDisable Disable} with the constant {@link #GL_LINE_STIPPLE LINE_STIPPLE}. When disabled, it is as if the line stipple has its default value.
	 *
	 * @param factor  a count that is used to modify the effective line stipple by causing each bit in pattern to be used {@code factor} times. {@code factor} is clamped
	 *                to the range [1, 256].
	 * @param pattern an unsigned short integer whose 16 bits define the stipple pattern
	 */
	public static native void glLineStipple(int factor, short pattern);

	// --- [ glLineWidth ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glLineWidth">Reference Page</a></p>
	 * 
	 * Sets the width of rasterized line segments. The default width is 1.0.
	 *
	 * @param width the line width
	 */
	public static native void glLineWidth(float width);

	// --- [ glListBase ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glListBase">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the display list base.
	 *
	 * @param base the display list base offset
	 */
	public static native void glListBase(int base);

	// --- [ glLoadMatrixf ] ---

	/** Unsafe version of: {@link #glLoadMatrixf LoadMatrixf} */
	public static native void nglLoadMatrixf(long m);

	/**
	 * <p><a href="http://docs.gl/gl3/glLoadMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current matrix to a 4 &times; 4 matrix in column-major order.
	 * 
	 * <p>The matrix is stored as 16 consecutive values, i.e. as:</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td>a1</td><td>a5</td><td>a9</td><td>a13</td></tr>
	 * <tr><td>a2</td><td>a6</td><td>a10</td><td>a14</td></tr>
	 * <tr><td>a3</td><td>a7</td><td>a11</td><td>a15</td></tr>
	 * <tr><td>a4</td><td>a8</td><td>a12</td><td>a16</td></tr>
	 * </table>
	 * 
	 * <p>This differs from the standard row-major ordering for matrix elements. If the standard ordering is used, all of the subsequent transformation equations
	 * are transposed, and the columns representing vectors become rows.</p>
	 *
	 * @param m the matrix data
	 */
	public static void glLoadMatrixf(FloatBuffer m) {
		if ( CHECKS )
			check(m, 16);
		nglLoadMatrixf(memAddress(m));
	}

	// --- [ glLoadMatrixd ] ---

	/** Unsafe version of: {@link #glLoadMatrixd LoadMatrixd} */
	public static native void nglLoadMatrixd(long m);

	/**
	 * <p><a href="http://docs.gl/gl3/glLoadMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glLoadMatrixf LoadMatrixf}.
	 *
	 * @param m the matrix data
	 */
	public static void glLoadMatrixd(DoubleBuffer m) {
		if ( CHECKS )
			check(m, 16);
		nglLoadMatrixd(memAddress(m));
	}

	// --- [ glLoadIdentity ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glLoadIdentity">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current matrix to the identity matrix.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glLoadMatrixf LoadMatrixf} with the following matrix:</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td>1</td><td>0</td><td>0</td><td>0</td></tr>
	 * <tr><td>0</td><td>1</td><td>0</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>1</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 */
	public static native void glLoadIdentity();

	// --- [ glLoadName ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glLoadName">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Replaces the value on the top of the selection stack with {@code name}.
	 *
	 * @param name the name to load
	 */
	public static native void glLoadName(int name);

	// --- [ glLogicOp ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glLogicOp">Reference Page</a></p>
	 * 
	 * Sets the logical framebuffer operation.
	 *
	 * @param op the operation to set. One of:<br><table><tr><td>{@link #GL_CLEAR CLEAR}</td><td>{@link #GL_AND AND}</td><td>{@link #GL_AND_REVERSE AND_REVERSE}</td><td>{@link #GL_COPY COPY}</td><td>{@link #GL_AND_INVERTED AND_INVERTED}</td><td>{@link #GL_NOOP NOOP}</td><td>{@link #GL_XOR XOR}</td><td>{@link #GL_OR OR}</td><td>{@link #GL_NOR NOR}</td><td>{@link #GL_EQUIV EQUIV}</td><td>{@link #GL_INVERT INVERT}</td><td>{@link #GL_OR_REVERSE OR_REVERSE}</td><td>{@link #GL_COPY_INVERTED COPY_INVERTED}</td></tr><tr><td>{@link #GL_OR_INVERTED OR_INVERTED}</td><td>{@link #GL_NAND NAND}</td><td>{@link #GL_SET SET}</td></tr></table>
	 */
	public static native void glLogicOp(int op);

	// --- [ glMap1f ] ---

	/** Unsafe version of: {@link #glMap1f Map1f} */
	public static native void nglMap1f(int target, float u1, float u2, int stride, int order, long points);

	/**
	 * <p><a href="http://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Defines a polynomial or rational polynomial mapping to produce vertex, normal, texture coordinates and colors. The values so produced are sent on to
	 * further stages of the GL as if they had been provided directly by the client.
	 *
	 * @param target the evaluator target. One of:<br><table><tr><td>{@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link #GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link #GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link #GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link #GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link #GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td></tr></table>
	 * @param u1     the first endpoint of the pre-image of the map
	 * @param u2     the second endpoint of the pre-image of the map
	 * @param stride the number of values in each block of storage
	 * @param order  the polynomial order
	 * @param points a set of {@code order} blocks of storage containing control points
	 */
	public static void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points) {
		if ( CHECKS )
			check(points, order * stride);
		nglMap1f(target, u1, u2, stride, order, memAddress(points));
	}

	// --- [ glMap1d ] ---

	/** Unsafe version of: {@link #glMap1d Map1d} */
	public static native void nglMap1d(int target, double u1, double u2, int stride, int order, long points);

	/**
	 * <p><a href="http://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points) {
		if ( CHECKS )
			check(points, stride * order);
		nglMap1d(target, u1, u2, stride, order, memAddress(points));
	}

	// --- [ glMap2f ] ---

	/** Unsafe version of: {@link #glMap2f Map2f} */
	public static native void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points);

	/**
	 * <p><a href="http://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	 * @param points  a set of <code>uorder &times; vorder</code> blocks of storage containing control points
	 */
	public static void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
		if ( CHECKS )
			check(points, ustride * uorder * vstride * vorder);
		nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
	}

	// --- [ glMap2d ] ---

	/** Unsafe version of: {@link #glMap2d Map2d} */
	public static native void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points);

	/**
	 * <p><a href="http://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	 * @param points  a set of <code>uorder &times; vorder</code> blocks of storage containing control points
	 */
	public static void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
		if ( CHECKS )
			check(points, ustride * uorder * vstride * vorder);
		nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
	}

	// --- [ glMapGrid1f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Defines a one-dimensional grid in the map evaluator domain.
	 *
	 * @param n  the number of partitions of the interval
	 * @param u1 the first interval endpoint
	 * @param u2 the second interval endpoint
	 */
	public static native void glMapGrid1f(int n, float u1, float u2);

	// --- [ glMapGrid1d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glMapGrid1f MapGrid1f}.
	 *
	 * @param n  the number of partitions of the interval
	 * @param u1 the first interval endpoint
	 * @param u2 the second interval endpoint
	 */
	public static native void glMapGrid1d(int n, double u1, double u2);

	// --- [ glMapGrid2f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static native void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2);

	// --- [ glMapGrid2d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glMapGrid">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static native void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2);

	// --- [ glMateriali ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glMateriali">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the integer value of a material parameter.
	 *
	 * @param face  the material face for which to set the parameter. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
	 * @param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_SHININESS SHININESS}</td></tr></table>
	 * @param param the parameter value
	 */
	public static native void glMateriali(int face, int pname, int param);

	// --- [ glMaterialf ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glMaterialf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glMateriali Materiali}.
	 *
	 * @param face  the material face for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static native void glMaterialf(int face, int pname, float param);

	// --- [ glMaterialiv ] ---

	/** Unsafe version of: {@link #glMaterialiv Materialiv} */
	public static native void nglMaterialiv(int face, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMateriali Materiali}.
	 *
	 * @param face   the material face for which to set the parameter
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_AMBIENT AMBIENT}</td><td>{@link #GL_DIFFUSE DIFFUSE}</td><td>{@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}</td><td>{@link #GL_SPECULAR SPECULAR}</td><td>{@link #GL_EMISSION EMISSION}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glMaterialiv(int face, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglMaterialiv(face, pname, memAddress(params));
	}

	// --- [ glMaterialfv ] ---

	/** Unsafe version of: {@link #glMaterialfv Materialfv} */
	public static native void nglMaterialfv(int face, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMaterialf Materialf}.
	 *
	 * @param face   the material face for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glMaterialfv(int face, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglMaterialfv(face, pname, memAddress(params));
	}

	// --- [ glMatrixMode ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glMatrixMode">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Set the current matrix mode.
	 *
	 * @param mode the matrix mode. One of:<br><table><tr><td>{@link #GL_MODELVIEW MODELVIEW}</td><td>{@link #GL_PROJECTION PROJECTION}</td><td>{@link #GL_TEXTURE TEXTURE}</td><td>{@link #GL_COLOR COLOR}</td></tr></table>
	 */
	public static native void glMatrixMode(int mode);

	// --- [ glMultMatrixf ] ---

	/** Unsafe version of: {@link #glMultMatrixf MultMatrixf} */
	public static native void nglMultMatrixf(long m);

	/**
	 * <p><a href="http://docs.gl/gl3/glMultMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Multiplies the current matrix with a 4 &times; 4 matrix in column-major order. See {@link #glLoadMatrixf LoadMatrixf} for details.
	 *
	 * @param m the matrix data
	 */
	public static void glMultMatrixf(FloatBuffer m) {
		if ( CHECKS )
			check(m, 16);
		nglMultMatrixf(memAddress(m));
	}

	// --- [ glMultMatrixd ] ---

	/** Unsafe version of: {@link #glMultMatrixd MultMatrixd} */
	public static native void nglMultMatrixd(long m);

	/**
	 * <p><a href="http://docs.gl/gl3/glMultMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glMultMatrixf MultMatrixf}.
	 *
	 * @param m the matrix data
	 */
	public static void glMultMatrixd(DoubleBuffer m) {
		if ( CHECKS )
			check(m, 16);
		nglMultMatrixd(memAddress(m));
	}

	// --- [ glFrustum ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glFrustum">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a matrix that produces perspective projection, in such a way that the coordinates <code>(lb &ndash; n)<sup>T</sup></code>
	 * and <code>(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
	 * window, respectively (assuming that the eye is located at <code>(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping
	 * plane.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td>2n / (r - l)</td><td>0</td><td>(r + l) / (r - l)</td><td>0</td></tr>
	 * <tr><td>0</td><td>2n / (t - b)</td><td>(t + b) / (t - b)</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>- (f + n) / (f - n)</td><td>- (2fn) / (f - n)</td></tr>
	 * <tr><td>0</td><td>0</td><td>-1</td><td>0</td></tr>
	 * </table>
	 *
	 * @param l the left frustum plane
	 * @param r the right frustum plane
	 * @param b the bottom frustum plane
	 * @param t the top frustum plane
	 * @param n the near frustum plane
	 * @param f the far frustum plane
	 */
	public static native void glFrustum(double l, double r, double b, double t, double n, double f);

	// --- [ glNewList ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glNewList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Begins the definition of a display list.
	 *
	 * @param n    a positive integer to which the display list that follows is assigned
	 * @param mode a symbolic constant that controls the behavior of the GL during display list creation. One of:<br><table><tr><td>{@link #GL_COMPILE COMPILE}</td><td>{@link #GL_COMPILE_AND_EXECUTE COMPILE_AND_EXECUTE}</td></tr></table>
	 */
	public static native void glNewList(int n, int mode);

	// --- [ glEndList ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glEndList">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Ends the definition of GL commands to be placed in a display list. It is only when {@code EndList} occurs that the specified display list is actually
	 * associated with the index indicated with {@link #glNewList NewList}.
	 */
	public static native void glEndList();

	// --- [ glNormal3f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current normal.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static native void glNormal3f(float nx, float ny, float nz);

	// --- [ glNormal3b ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Byte version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static native void glNormal3b(byte nx, byte ny, byte nz);

	// --- [ glNormal3s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static native void glNormal3s(short nx, short ny, short nz);

	// --- [ glNormal3i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static native void glNormal3i(int nx, int ny, int nz);

	// --- [ glNormal3d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx the x coordinate of the current normal
	 * @param ny the y coordinate of the current normal
	 * @param nz the z coordinate of the current normal
	 */
	public static native void glNormal3d(double nx, double ny, double nz);

	// --- [ glNormal3fv ] ---

	/** Unsafe version of: {@link #glNormal3fv Normal3fv} */
	public static native void nglNormal3fv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3f Normal3f}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3fv(FloatBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglNormal3fv(memAddress(v));
	}

	// --- [ glNormal3bv ] ---

	/** Unsafe version of: {@link #glNormal3bv Normal3bv} */
	public static native void nglNormal3bv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3b Normal3b}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3bv(ByteBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglNormal3bv(memAddress(v));
	}

	// --- [ glNormal3sv ] ---

	/** Unsafe version of: {@link #glNormal3sv Normal3sv} */
	public static native void nglNormal3sv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3s Normal3s}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3sv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglNormal3sv(memAddress(v));
	}

	// --- [ glNormal3iv ] ---

	/** Unsafe version of: {@link #glNormal3iv Normal3iv} */
	public static native void nglNormal3iv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3i Normal3i}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3iv(IntBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglNormal3iv(memAddress(v));
	}

	// --- [ glNormal3dv ] ---

	/** Unsafe version of: {@link #glNormal3dv Normal3dv} */
	public static native void nglNormal3dv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glNormal3d Normal3d}.
	 *
	 * @param v the normal buffer
	 */
	public static void glNormal3dv(DoubleBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglNormal3dv(memAddress(v));
	}

	// --- [ glNormalPointer ] ---

	/** Unsafe version of: {@link #glNormalPointer NormalPointer} */
	public static native void nglNormalPointer(int type, int stride, long pointer);

	/**
	 * <p><a href="http://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a normal array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the normal array data
	 */
	public static void glNormalPointer(int type, int stride, ByteBuffer pointer) {
		nglNormalPointer(type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a normal array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the normal array data
	 */
	public static void glNormalPointer(int type, int stride, long pointer) {
		nglNormalPointer(type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a normal array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the normal array data
	 */
	public static void glNormalPointer(int type, int stride, ShortBuffer pointer) {
		nglNormalPointer(type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a normal array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the normal array data
	 */
	public static void glNormalPointer(int type, int stride, IntBuffer pointer) {
		nglNormalPointer(type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a normal array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the normal array data
	 */
	public static void glNormalPointer(int type, int stride, FloatBuffer pointer) {
		nglNormalPointer(type, stride, memAddress(pointer));
	}

	// --- [ glOrtho ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glOrtho">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a matrix that produces parallel projection, in such a way that the coordinates <code>(lb &ndash; n)<sup>T</sup></code>
	 * and <code>(rt &ndash; n)<sup>T</sup></code> specify the points on the near clipping plane that are mapped to the lower left and upper right corners of the
	 * window, respectively (assuming that the eye is located at <code>(0 0 0)<sup>T</sup></code>). {@code f} gives the distance from the eye to the far clipping
	 * plane.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td>2 / (r - l)</td><td>0</td><td>0</td><td>- (r + l) / (r - l)</td></tr>
	 * <tr><td>0</td><td>2 / (t - b)</td><td>0</td><td>- (t + b) / (t - b)</td></tr>
	 * <tr><td>0</td><td>0</td><td>- 2 / (f - n)</td><td>- (f + n) / (f - n)</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 *
	 * @param l the left frustum plane
	 * @param r the right frustum plane
	 * @param b the bottom frustum plane
	 * @param t the top frustum plane
	 * @param n the near frustum plane
	 * @param f the far frustum plane
	 */
	public static native void glOrtho(double l, double r, double b, double t, double n, double f);

	// --- [ glPassThrough ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPassThrough">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Inserts a marker when the GL is in feeback mode. {@code token} is returned as if it were a primitive; it is indicated with its own unique identifying
	 * value. The ordering of any {@code PassThrough} commands with respect to primitive specification is maintained by feedback. {@code PassThrough} may
	 * not occur between {@link #glBegin Begin} and {@link #glEnd End}.
	 *
	 * @param token the marker value to insert
	 */
	public static native void glPassThrough(float token);

	// --- [ glPixelMapfv ] ---

	/**
	 * Unsafe version of: {@link #glPixelMapfv PixelMapfv}
	 *
	 * @param size the map size
	 */
	public static native void nglPixelMapfv(int map, int size, long values);

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets a pixel map lookup table.
	 *
	 * @param map    the map to set. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapfv(int map, int size, long values) {
		nglPixelMapfv(map, size, values);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets a pixel map lookup table.
	 *
	 * @param map    the map to set. One of:<br><table><tr><td>{@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
	 * @param values the map values
	 */
	public static void glPixelMapfv(int map, FloatBuffer values) {
		nglPixelMapfv(map, values.remaining(), memAddress(values));
	}

	// --- [ glPixelMapusv ] ---

	/**
	 * Unsafe version of: {@link #glPixelMapusv PixelMapusv}
	 *
	 * @param size the map size
	 */
	public static native void nglPixelMapusv(int map, int size, long values);

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glPixelMapfv PixelMapfv}.
	 *
	 * @param map    the map to set
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapusv(int map, int size, long values) {
		nglPixelMapusv(map, size, values);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glPixelMapfv PixelMapfv}.
	 *
	 * @param map    the map to set
	 * @param values the map values
	 */
	public static void glPixelMapusv(int map, ShortBuffer values) {
		nglPixelMapusv(map, values.remaining(), memAddress(values));
	}

	// --- [ glPixelMapuiv ] ---

	/**
	 * Unsafe version of: {@link #glPixelMapuiv PixelMapuiv}
	 *
	 * @param size the map size
	 */
	public static native void nglPixelMapuiv(int map, int size, long values);

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned integer version of {@link #glPixelMapfv PixelMapfv}.
	 *
	 * @param map    the map to set
	 * @param size   the map size
	 * @param values the map values
	 */
	public static void glPixelMapuiv(int map, int size, long values) {
		nglPixelMapuiv(map, size, values);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned integer version of {@link #glPixelMapfv PixelMapfv}.
	 *
	 * @param map    the map to set
	 * @param values the map values
	 */
	public static void glPixelMapuiv(int map, IntBuffer values) {
		nglPixelMapuiv(map, values.remaining(), memAddress(values));
	}

	// --- [ glPixelStorei ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glPixelStorei">Reference Page</a></p>
	 * 
	 * Sets the integer value of a pixel store parameter.
	 *
	 * @param pname the pixel store parameter to set. One of:<br><table><tr><td>{@link #GL_UNPACK_SWAP_BYTES UNPACK_SWAP_BYTES}</td><td>{@link #GL_UNPACK_LSB_FIRST UNPACK_LSB_FIRST}</td><td>{@link #GL_UNPACK_ROW_LENGTH UNPACK_ROW_LENGTH}</td></tr><tr><td>{@link #GL_UNPACK_SKIP_ROWS UNPACK_SKIP_ROWS}</td><td>{@link #GL_UNPACK_SKIP_PIXELS UNPACK_SKIP_PIXELS}</td><td>{@link #GL_UNPACK_ALIGNMENT UNPACK_ALIGNMENT}</td></tr><tr><td>{@link GL12#GL_UNPACK_IMAGE_HEIGHT UNPACK_IMAGE_HEIGHT}</td><td>{@link GL12#GL_UNPACK_SKIP_IMAGES UNPACK_SKIP_IMAGES}</td><td>{@link GL42#GL_UNPACK_COMPRESSED_BLOCK_WIDTH UNPACK_COMPRESSED_BLOCK_WIDTH}</td></tr><tr><td>{@link GL42#GL_UNPACK_COMPRESSED_BLOCK_HEIGHT UNPACK_COMPRESSED_BLOCK_HEIGHT}</td><td>{@link GL42#GL_UNPACK_COMPRESSED_BLOCK_DEPTH UNPACK_COMPRESSED_BLOCK_DEPTH}</td><td>{@link GL42#GL_UNPACK_COMPRESSED_BLOCK_SIZE UNPACK_COMPRESSED_BLOCK_SIZE}</td></tr></table>
	 * @param param the parameter value
	 */
	public static native void glPixelStorei(int pname, int param);

	// --- [ glPixelStoref ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glPixelStoref">Reference Page</a></p>
	 * 
	 * Float version of {@link #glPixelStorei PixelStorei}.
	 *
	 * @param pname the pixel store parameter to set
	 * @param param the parameter value
	 */
	public static native void glPixelStoref(int pname, int param);

	// --- [ glPixelTransferi ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelTransferi">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the integer value of a pixel transfer parameter.
	 *
	 * @param pname the pixel transfer parameter to set. One of:<br><table><tr><td>{@link #GL_MAP_COLOR MAP_COLOR}</td><td>{@link #GL_MAP_STENCIL MAP_STENCIL}</td><td>{@link #GL_INDEX_SHIFT INDEX_SHIFT}</td><td>{@link #GL_INDEX_OFFSET INDEX_OFFSET}</td></tr><tr><td>{@link #GL_RED_SCALE RED_SCALE}</td><td>{@link #GL_GREEN_SCALE GREEN_SCALE}</td><td>{@link #GL_BLUE_SCALE BLUE_SCALE}</td><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr><tr><td>{@link #GL_DEPTH_SCALE DEPTH_SCALE}</td><td>{@link #GL_RED_BIAS RED_BIAS}</td><td>{@link #GL_GREEN_BIAS GREEN_BIAS}</td><td>{@link #GL_BLUE_BIAS BLUE_BIAS}</td></tr><tr><td>{@link #GL_ALPHA_BIAS ALPHA_BIAS}</td><td>{@link #GL_DEPTH_BIAS DEPTH_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_RED_SCALE POST_CONVOLUTION_RED_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_RED_BIAS POST_CONVOLUTION_RED_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_RED_SCALE POST_COLOR_MATRIX_RED_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_RED_BIAS POST_COLOR_MATRIX_RED_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_GREEN_SCALE POST_CONVOLUTION_GREEN_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_GREEN_BIAS POST_CONVOLUTION_GREEN_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_SCALE POST_COLOR_MATRIX_GREEN_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_BIAS POST_COLOR_MATRIX_GREEN_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_BLUE_SCALE POST_CONVOLUTION_BLUE_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_BLUE_BIAS POST_CONVOLUTION_BLUE_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_SCALE POST_COLOR_MATRIX_BLUE_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_BIAS POST_COLOR_MATRIX_BLUE_BIAS}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_SCALE POST_CONVOLUTION_ALPHA_SCALE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_BIAS POST_CONVOLUTION_ALPHA_BIAS}</td></tr><tr><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_SCALE POST_COLOR_MATRIX_ALPHA_SCALE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_BIAS POST_COLOR_MATRIX_ALPHA_BIAS}</td></tr></table>
	 * @param param the parameter value
	 */
	public static native void glPixelTransferi(int pname, int param);

	// --- [ glPixelTransferf ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelTransferf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glPixelTransferi PixelTransferi}.
	 *
	 * @param pname the pixel transfer parameter to set
	 * @param param the parameter value
	 */
	public static native void glPixelTransferf(int pname, float param);

	// --- [ glPixelZoom ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelZoom">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static native void glPixelZoom(float xfactor, float yfactor);

	// --- [ glPointSize ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glPointSize">Reference Page</a></p>
	 * 
	 * Controls the rasterization of points if no vertex, tessellation control, tessellation evaluation, or geometry shader is active. The default point size is 1.0.
	 *
	 * @param size the request size of a point
	 */
	public static native void glPointSize(float size);

	// --- [ glPolygonMode ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glPolygonMode">Reference Page</a></p>
	 * 
	 * Controls the interpretation of polygons for rasterization.
	 * 
	 * <p>{@link #GL_FILL FILL} is the default mode of polygon rasterization. Note that these modes affect only the final rasterization of polygons: in particular, a
	 * polygon's vertices are lit, and the polygon is clipped and possibly culled before these modes are applied. Polygon antialiasing applies only to the
	 * {@link #GL_FILL FILL} state of PolygonMode. For {@link #GL_POINT POINT} or {@link #GL_LINE LINE}, point antialiasing or line segment antialiasing, respectively, apply.</p>
	 *
	 * @param face the face for which to set the rasterizing method. One of:<br><table><tr><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
	 * @param mode the rasterization mode. One of:<br><table><tr><td>{@link #GL_POINT POINT}</td><td>{@link #GL_LINE LINE}</td><td>{@link #GL_FILL FILL}</td></tr></table>
	 */
	public static native void glPolygonMode(int face, int mode);

	// --- [ glPolygonOffset ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glPolygonOffset">Reference Page</a></p>
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
	public static native void glPolygonOffset(float factor, float units);

	// --- [ glPolygonStipple ] ---

	/** Unsafe version of: {@link #glPolygonStipple PolygonStipple} */
	public static native void nglPolygonStipple(long pattern);

	/**
	 * <p><a href="http://docs.gl/gl3/glPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
		if ( CHECKS )
			check(pattern, 128);
		nglPolygonStipple(memAddress(pattern));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glPolygonStipple">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static void glPolygonStipple(long pattern) {
		nglPolygonStipple(pattern);
	}

	// --- [ glPushAttrib ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPushAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	 * @param mask the state variables to push. One or more of:<br><table><tr><td>{@link #GL_ACCUM_BUFFER_BIT ACCUM_BUFFER_BIT}</td><td>{@link #GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link #GL_CURRENT_BIT CURRENT_BIT}</td><td>{@link #GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link #GL_ENABLE_BIT ENABLE_BIT}</td><td>{@link #GL_EVAL_BIT EVAL_BIT}</td></tr><tr><td>{@link #GL_FOG_BIT FOG_BIT}</td><td>{@link #GL_HINT_BIT HINT_BIT}</td><td>{@link #GL_LIGHTING_BIT LIGHTING_BIT}</td><td>{@link #GL_LINE_BIT LINE_BIT}</td><td>{@link #GL_LIST_BIT LIST_BIT}</td><td>{@link GL13#GL_MULTISAMPLE_BIT MULTISAMPLE_BIT}</td></tr><tr><td>{@link #GL_PIXEL_MODE_BIT PIXEL_MODE_BIT}</td><td>{@link #GL_POINT_BIT POINT_BIT}</td><td>{@link #GL_POLYGON_BIT POLYGON_BIT}</td><td>{@link #GL_POLYGON_STIPPLE_BIT POLYGON_STIPPLE_BIT}</td><td>{@link #GL_SCISSOR_BIT SCISSOR_BIT}</td><td>{@link #GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr><tr><td>{@link #GL_TEXTURE_BIT TEXTURE_BIT}</td><td>{@link #GL_TRANSFORM_BIT TRANSFORM_BIT}</td><td>{@link #GL_VIEWPORT_BIT VIEWPORT_BIT}</td><td>{@link #GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS}</td></tr></table>
	 */
	public static native void glPushAttrib(int mask);

	// --- [ glPushClientAttrib ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPushClientAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	 * @param mask the state variables to push. One or more of:<br><table><tr><td>{@link #GL_CLIENT_VERTEX_ARRAY_BIT CLIENT_VERTEX_ARRAY_BIT}</td><td>{@link #GL_CLIENT_PIXEL_STORE_BIT CLIENT_PIXEL_STORE_BIT}</td><td>{@link #GL_CLIENT_ALL_ATTRIB_BITS CLIENT_ALL_ATTRIB_BITS}</td></tr></table>
	 */
	public static native void glPushClientAttrib(int mask);

	// --- [ glPopAttrib ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPopAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Resets the values of those state variables that were saved with the last {@link #glPushAttrib PushAttrib}. Those not saved remain unchanged.
	 */
	public static native void glPopAttrib();

	// --- [ glPopClientAttrib ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPopClientAttrib">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Resets the values of those state variables that were saved with the last {@link #glPushClientAttrib PushClientAttrib}. Those not saved remain unchanged.
	 */
	public static native void glPopClientAttrib();

	// --- [ glPopMatrix ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPopMatrix">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pops the top entry off the current matrix stack, replacing the current matrix with the matrix that was the second entry in the stack.
	 */
	public static native void glPopMatrix();

	// --- [ glPopName ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPopName">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pops one name off the top of the selection name stack.
	 */
	public static native void glPopName();

	// --- [ glPrioritizeTextures ] ---

	/**
	 * Unsafe version of: {@link #glPrioritizeTextures PrioritizeTextures}
	 *
	 * @param n the number of texture object priorities to set
	 */
	public static native void nglPrioritizeTextures(int n, long textures, long priorities);

	/**
	 * <p><a href="http://docs.gl/gl3/glPrioritizeTextures">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the priority of texture objects. Each priority value is clamped to the range [0, 1] before it is assigned. Zero indicates the lowest priority, with
	 * the least likelihood of being resident. One indicates the highest priority, with the greatest likelihood of being resident.
	 *
	 * @param textures   an array of texture object names
	 * @param priorities an array of texture object priorities
	 */
	public static void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities) {
		if ( CHECKS )
			check(priorities, textures.remaining());
		nglPrioritizeTextures(textures.remaining(), memAddress(textures), memAddress(priorities));
	}

	// --- [ glPushMatrix ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPushMatrix">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pushes the current matrix stack down by one, duplicating the current matrix in both the top of the stack and the entry below it.
	 */
	public static native void glPushMatrix();

	// --- [ glPushName ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glPushName">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Causes {@code name} to be pushed onto the selection name stack.
	 *
	 * @param name the name to push
	 */
	public static native void glPushName(int name);

	// --- [ glRasterPos2i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static native void glRasterPos2i(int x, int y);

	// --- [ glRasterPos2s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static native void glRasterPos2s(short x, short y);

	// --- [ glRasterPos2f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static native void glRasterPos2f(float x, float y);

	// --- [ glRasterPos2d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 */
	public static native void glRasterPos2d(double x, double y);

	// --- [ glRasterPos2iv ] ---

	/** Unsafe version of: {@link #glRasterPos2iv RasterPos2iv} */
	public static native void nglRasterPos2iv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2iv(IntBuffer coords) {
		if ( CHECKS )
			check(coords, 2);
		nglRasterPos2iv(memAddress(coords));
	}

	// --- [ glRasterPos2sv ] ---

	/** Unsafe version of: {@link #glRasterPos2sv RasterPos2sv} */
	public static native void nglRasterPos2sv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos2s RasterPos2s}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2sv(ShortBuffer coords) {
		if ( CHECKS )
			check(coords, 2);
		nglRasterPos2sv(memAddress(coords));
	}

	// --- [ glRasterPos2fv ] ---

	/** Unsafe version of: {@link #glRasterPos2fv RasterPos2fv} */
	public static native void nglRasterPos2fv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos2f RasterPos2f}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2fv(FloatBuffer coords) {
		if ( CHECKS )
			check(coords, 2);
		nglRasterPos2fv(memAddress(coords));
	}

	// --- [ glRasterPos2dv ] ---

	/** Unsafe version of: {@link #glRasterPos2dv RasterPos2dv} */
	public static native void nglRasterPos2dv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos2d RasterPos2d}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos2dv(DoubleBuffer coords) {
		if ( CHECKS )
			check(coords, 2);
		nglRasterPos2dv(memAddress(coords));
	}

	// --- [ glRasterPos3i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the three-dimensional current raster position. {@code w} is implicitly set to 1. See {@link #glRasterPos2i RasterPos2i} for more details.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static native void glRasterPos3i(int x, int y, int z);

	// --- [ glRasterPos3s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static native void glRasterPos3s(short x, short y, short z);

	// --- [ glRasterPos3f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static native void glRasterPos3f(float x, float y, float z);

	// --- [ glRasterPos3d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 */
	public static native void glRasterPos3d(double x, double y, double z);

	// --- [ glRasterPos3iv ] ---

	/** Unsafe version of: {@link #glRasterPos3iv RasterPos3iv} */
	public static native void nglRasterPos3iv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3iv(IntBuffer coords) {
		if ( CHECKS )
			check(coords, 3);
		nglRasterPos3iv(memAddress(coords));
	}

	// --- [ glRasterPos3sv ] ---

	/** Unsafe version of: {@link #glRasterPos3sv RasterPos3sv} */
	public static native void nglRasterPos3sv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos3s RasterPos3s}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3sv(ShortBuffer coords) {
		if ( CHECKS )
			check(coords, 3);
		nglRasterPos3sv(memAddress(coords));
	}

	// --- [ glRasterPos3fv ] ---

	/** Unsafe version of: {@link #glRasterPos3fv RasterPos3fv} */
	public static native void nglRasterPos3fv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos3f RasterPos3f}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3fv(FloatBuffer coords) {
		if ( CHECKS )
			check(coords, 3);
		nglRasterPos3fv(memAddress(coords));
	}

	// --- [ glRasterPos3dv ] ---

	/** Unsafe version of: {@link #glRasterPos3dv RasterPos3dv} */
	public static native void nglRasterPos3dv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos3d RasterPos3d}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos3dv(DoubleBuffer coords) {
		if ( CHECKS )
			check(coords, 3);
		nglRasterPos3dv(memAddress(coords));
	}

	// --- [ glRasterPos4i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the four-dimensional current raster position. See {@link #glRasterPos2i RasterPos2i} for more details.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static native void glRasterPos4i(int x, int y, int z, int w);

	// --- [ glRasterPos4s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static native void glRasterPos4s(short x, short y, short z, short w);

	// --- [ glRasterPos4f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of RasterPos4i.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static native void glRasterPos4f(float x, float y, float z, float w);

	// --- [ glRasterPos4d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param x the {@code x} raster coordinate
	 * @param y the {@code y} raster coordinate
	 * @param z the {@code z} raster coordinate
	 * @param w the {@code w} raster coordinate
	 */
	public static native void glRasterPos4d(double x, double y, double z, double w);

	// --- [ glRasterPos4iv ] ---

	/** Unsafe version of: {@link #glRasterPos4iv RasterPos4iv} */
	public static native void nglRasterPos4iv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4iv(IntBuffer coords) {
		if ( CHECKS )
			check(coords, 4);
		nglRasterPos4iv(memAddress(coords));
	}

	// --- [ glRasterPos4sv ] ---

	/** Unsafe version of: {@link #glRasterPos4sv RasterPos4sv} */
	public static native void nglRasterPos4sv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos4s RasterPos4s}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4sv(ShortBuffer coords) {
		if ( CHECKS )
			check(coords, 4);
		nglRasterPos4sv(memAddress(coords));
	}

	// --- [ glRasterPos4fv ] ---

	/** Unsafe version of: {@link #glRasterPos4fv RasterPos4fv} */
	public static native void nglRasterPos4fv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos4f RasterPos4f}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4fv(FloatBuffer coords) {
		if ( CHECKS )
			check(coords, 4);
		nglRasterPos4fv(memAddress(coords));
	}

	// --- [ glRasterPos4dv ] ---

	/** Unsafe version of: {@link #glRasterPos4dv RasterPos4dv} */
	public static native void nglRasterPos4dv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRasterPos4d RasterPos4d}.
	 *
	 * @param coords the raster position buffer
	 */
	public static void glRasterPos4dv(DoubleBuffer coords) {
		if ( CHECKS )
			check(coords, 4);
		nglRasterPos4dv(memAddress(coords));
	}

	// --- [ glReadBuffer ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glReadBuffer">Reference Page</a></p>
	 * 
	 * Defines the color buffer from which values are obtained.
	 * 
	 * <p>Acceptable values for {@code src} depend on whether the GL is using the default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is zero), or
	 * a framebuffer object (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is non-zero). In the initial state, the GL is bound to the default framebuffer.</p>
	 *
	 * @param src the color buffer to read from. One of:<br><table><tr><td>{@link #GL_NONE NONE}</td><td>{@link #GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link #GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link #GL_BACK_LEFT BACK_LEFT}</td><td>{@link #GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link #GL_FRONT FRONT}</td><td>{@link #GL_BACK BACK}</td><td>{@link #GL_LEFT LEFT}</td></tr><tr><td>{@link #GL_RIGHT RIGHT}</td><td>{@link #GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link #GL_AUX0 AUX0}</td><td>{@link #GL_AUX1 AUX1}</td><td>{@link #GL_AUX2 AUX2}</td><td>{@link #GL_AUX3 AUX3}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
	 */
	public static native void glReadBuffer(int src);

	// --- [ glReadPixels ] ---

	/** Unsafe version of: {@link #glReadPixels ReadPixels} */
	public static native void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

	/**
	 * <p><a href="http://docs.gl/gl4/glReadPixels">Reference Page</a></p>
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
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels a buffer in which to place the returned pixel data
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glReadPixels">Reference Page</a></p>
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
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels a buffer in which to place the returned pixel data
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
		nglReadPixels(x, y, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glReadPixels">Reference Page</a></p>
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
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels a buffer in which to place the returned pixel data
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glReadPixels">Reference Page</a></p>
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
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels a buffer in which to place the returned pixel data
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glReadPixels">Reference Page</a></p>
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
	 * @param format the pixel format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels a buffer in which to place the returned pixel data
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
	}

	// --- [ glRecti ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRecti">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	public static native void glRecti(int x1, int y1, int x2, int y2);

	// --- [ glRects ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRects">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glRecti Recti}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static native void glRects(short x1, short y1, short x2, short y2);

	// --- [ glRectf ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRectf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glRecti Recti}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static native void glRectf(float x1, float y1, float x2, float y2);

	// --- [ glRectd ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRectd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRecti Recti}.
	 *
	 * @param x1 the x coordinate of the first corner vertex
	 * @param y1 the y coordinate of the first corner vertex
	 * @param x2 the x coordinate of the second corner vertex
	 * @param y2 the y coordinate of the second corner vertex
	 */
	public static native void glRectd(double x1, double y1, double x2, double y2);

	// --- [ glRectiv ] ---

	/** Unsafe version of: {@link #glRectiv Rectiv} */
	public static native void nglRectiv(long v1, long v2);

	/**
	 * <p><a href="http://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRecti Recti}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectiv(IntBuffer v1, IntBuffer v2) {
		if ( CHECKS ) {
			check(v1, 2);
			check(v2, 2);
		}
		nglRectiv(memAddress(v1), memAddress(v2));
	}

	// --- [ glRectsv ] ---

	/** Unsafe version of: {@link #glRectsv Rectsv} */
	public static native void nglRectsv(long v1, long v2);

	/**
	 * <p><a href="http://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRects Rects}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectsv(ShortBuffer v1, ShortBuffer v2) {
		if ( CHECKS ) {
			check(v1, 2);
			check(v2, 2);
		}
		nglRectsv(memAddress(v1), memAddress(v2));
	}

	// --- [ glRectfv ] ---

	/** Unsafe version of: {@link #glRectfv Rectfv} */
	public static native void nglRectfv(long v1, long v2);

	/**
	 * <p><a href="http://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRectf Rectf}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectfv(FloatBuffer v1, FloatBuffer v2) {
		if ( CHECKS ) {
			check(v1, 2);
			check(v2, 2);
		}
		nglRectfv(memAddress(v1), memAddress(v2));
	}

	// --- [ glRectdv ] ---

	/** Unsafe version of: {@link #glRectdv Rectdv} */
	public static native void nglRectdv(long v1, long v2);

	/**
	 * <p><a href="http://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glRectd Rectd}.
	 *
	 * @param v1 the first vertex buffer
	 * @param v2 the second vertex buffer
	 */
	public static void glRectdv(DoubleBuffer v1, DoubleBuffer v2) {
		if ( CHECKS ) {
			check(v1, 2);
			check(v2, 2);
		}
		nglRectdv(memAddress(v1), memAddress(v2));
	}

	// --- [ glRenderMode ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRenderMode">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current render mode. The default is {@link #GL_RENDER RENDER}.
	 *
	 * @param mode the render mode. One of:<br><table><tr><td>{@link #GL_RENDER RENDER}</td><td>{@link #GL_SELECT SELECT}</td><td>{@link #GL_FEEDBACK FEEDBACK}</td></tr></table>
	 */
	public static native int glRenderMode(int mode);

	// --- [ glRotatef ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRotatef">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a rotation matrix.
	 * 
	 * <p>{@code angle} gives an angle of rotation in degrees; the coordinates of a vector v are given by <code>v = (x y z)<sup>T</sup></code>. The computed matrix
	 * is a counter-clockwise rotation about the line through the origin with the specified axis when that axis is pointing up (i.e. the right-hand rule
	 * determines the sense of the rotation angle). The matrix is thus</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td colspan=3 rowspan=3><b>R</b></td><td>0</td></tr>
	 * <tr><td>0</td></tr>
	 * <tr><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 * 
	 * <p>Let <code>u = v / ||v|| = (x' y' z')<sup>T</sup></code>. If <b>S</b> =</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td>0</td><td>-z'</td><td>y'</td></tr>
	 * <tr><td>z'</td><td>0</td><td>-x'</td></tr>
	 * <tr><td>-y'</td><td>x'</td><td>0</td></tr>
	 * </table>
	 * 
	 * <p>then <code><b>R</b> = uu<sup>T</sup> + cos(angle)(I - uu<sup>T</sup>) + sin(angle)<b>S</b></code></p>
	 *
	 * @param angle the angle of rotation in degrees
	 * @param x     the x coordinate of the rotation vector
	 * @param y     the y coordinate of the rotation vector
	 * @param z     the z coordinate of the rotation vector
	 */
	public static native void glRotatef(float angle, float x, float y, float z);

	// --- [ glRotated ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glRotated">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glRotatef Rotatef}.
	 *
	 * @param angle the angle of rotation in degrees
	 * @param x     the x coordinate of the rotation vector
	 * @param y     the y coordinate of the rotation vector
	 * @param z     the z coordinate of the rotation vector
	 */
	public static native void glRotated(double angle, double x, double y, double z);

	// --- [ glScalef ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glScalef">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a general scaling matrix along the x-, y- and z- axes.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td>x</td><td>0</td><td>0</td><td>0</td></tr>
	 * <tr><td>0</td><td>y</td><td>0</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>z</td><td>0</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 *
	 * @param x the x-axis scaling factor
	 * @param y the y-axis scaling factor
	 * @param z the z-axis scaling factor
	 */
	public static native void glScalef(float x, float y, float z);

	// --- [ glScaled ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glScaled">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glScalef Scalef}.
	 *
	 * @param x the x-axis scaling factor
	 * @param y the y-axis scaling factor
	 * @param z the z-axis scaling factor
	 */
	public static native void glScaled(double x, double y, double z);

	// --- [ glScissor ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glScissor">Reference Page</a></p>
	 * 
	 * Defines the scissor rectangle for all viewports. The scissor test is enabled or disabled for all viewports using {@link #glEnable Enable} or {@link #glDisable Disable}
	 * with the symbolic constant {@link #GL_SCISSOR_TEST SCISSOR_TEST}. When disabled, it is as if the scissor test always passes. When enabled, if
	 * <code>left <= x<sub>w</sub> < left + width</code> and <code>bottom <= y<sub>w</sub> < bottom + height</code> for the scissor rectangle, then the scissor
	 * test passes. Otherwise, the test fails and the fragment is discarded.
	 *
	 * @param x      the left scissor rectangle coordinate
	 * @param y      the bottom scissor rectangle coordinate
	 * @param width  the scissor rectangle width
	 * @param height the scissor rectangle height
	 */
	public static native void glScissor(int x, int y, int width, int height);

	// --- [ glSelectBuffer ] ---

	/**
	 * Unsafe version of: {@link #glSelectBuffer SelectBuffer}
	 *
	 * @param size the maximum number of values that can be stored in {@code buffer}
	 */
	public static native void nglSelectBuffer(int size, long buffer);

	/**
	 * <p><a href="http://docs.gl/gl3/glSelectBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the selection array.
	 *
	 * @param buffer an array of unsigned integers to be potentially filled names
	 */
	public static void glSelectBuffer(IntBuffer buffer) {
		nglSelectBuffer(buffer.remaining(), memAddress(buffer));
	}

	// --- [ glShadeModel ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glShadeModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current shade mode. The initial value of the shade mode is {@link #GL_SMOOTH SMOOTH}.
	 * 
	 * <p>If mode is {@link #GL_SMOOTH SMOOTH}, vertex colors are treated individually. If mode is {@link #GL_FLAT FLAT}, flatshading is enabled and colors are taken from the
	 * provoking vertex of the primitive. The colors selected are those derived from current values, generated by lighting, or generated by vertex shading, if
	 * lighting is disabled, enabled, or a vertex shader is in use, respectively.</p>
	 *
	 * @param mode the shade mode. One of:<br><table><tr><td>{@link #GL_SMOOTH SMOOTH}</td><td>{@link #GL_FLAT FLAT}</td></tr></table>
	 */
	public static native void glShadeModel(int mode);

	// --- [ glStencilFunc ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glStencilFunc">Reference Page</a></p>
	 * 
	 * Controls the stencil test.
	 * 
	 * <p>{@code ref} is an integer reference value that is used in the unsigned stencil comparison. Stencil comparison operations and queries of {@code ref}
	 * clamp its value to the range [0, 2<sup>s</sup> &ndash; 1], where s is the number of bits in the stencil buffer attached to the draw framebuffer. The s
	 * least significant bits of {@code mask} are bitwise ANDed with both the reference and the stored stencil value, and the resulting masked values are those that
	 * participate in the comparison controlled by {@code func}.</p>
	 *
	 * @param func the stencil comparison function. One of:<br><table><tr><td>{@link #GL_NEVER NEVER}</td><td>{@link #GL_ALWAYS ALWAYS}</td><td>{@link #GL_LESS LESS}</td><td>{@link #GL_LEQUAL LEQUAL}</td><td>{@link #GL_EQUAL EQUAL}</td><td>{@link #GL_GEQUAL GEQUAL}</td><td>{@link #GL_GREATER GREATER}</td><td>{@link #GL_NOTEQUAL NOTEQUAL}</td></tr></table>
	 * @param ref  the reference value
	 * @param mask the stencil comparison mask
	 */
	public static native void glStencilFunc(int func, int ref, int mask);

	// --- [ glStencilMask ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glStencilMask">Reference Page</a></p>
	 * 
	 * Masks the writing of particular bits into the stencil plans.
	 * 
	 * <p>The least significant s bits of {@code mask}, where s is the number of bits in the stencil buffer, specify an integer mask. Where a 1 appears in this
	 * mask, the corresponding bit in the stencil buffer is written; where a 0 appears, the bit is not written.</p>
	 *
	 * @param mask the stencil mask
	 */
	public static native void glStencilMask(int mask);

	// --- [ glStencilOp ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glStencilOp">Reference Page</a></p>
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
	public static native void glStencilOp(int sfail, int dpfail, int dppass);

	// --- [ glTexCoord1f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current one-dimensional texture coordinate. {@code t} and {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static native void glTexCoord1f(float s);

	// --- [ glTexCoord1s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static native void glTexCoord1s(short s);

	// --- [ glTexCoord1i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static native void glTexCoord1i(int s);

	// --- [ glTexCoord1d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s the s component of the current texture coordinates
	 */
	public static native void glTexCoord1d(double s);

	// --- [ glTexCoord1fv ] ---

	/** Unsafe version of: {@link #glTexCoord1fv TexCoord1fv} */
	public static native void nglTexCoord1fv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1fv(FloatBuffer v) {
		if ( CHECKS )
			check(v, 1);
		nglTexCoord1fv(memAddress(v));
	}

	// --- [ glTexCoord1sv ] ---

	/** Unsafe version of: {@link #glTexCoord1sv TexCoord1sv} */
	public static native void nglTexCoord1sv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord1s TexCoord1s}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1sv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 1);
		nglTexCoord1sv(memAddress(v));
	}

	// --- [ glTexCoord1iv ] ---

	/** Unsafe version of: {@link #glTexCoord1iv TexCoord1iv} */
	public static native void nglTexCoord1iv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord1i TexCoord1i}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1iv(IntBuffer v) {
		if ( CHECKS )
			check(v, 1);
		nglTexCoord1iv(memAddress(v));
	}

	// --- [ glTexCoord1dv ] ---

	/** Unsafe version of: {@link #glTexCoord1dv TexCoord1dv} */
	public static native void nglTexCoord1dv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord1d TexCoord1d}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord1dv(DoubleBuffer v) {
		if ( CHECKS )
			check(v, 1);
		nglTexCoord1dv(memAddress(v));
	}

	// --- [ glTexCoord2f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current two-dimensional texture coordinate. {@code r} is implicitly set to 0 and {@code q} to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static native void glTexCoord2f(float s, float t);

	// --- [ glTexCoord2s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static native void glTexCoord2s(short s, short t);

	// --- [ glTexCoord2i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static native void glTexCoord2i(int s, int t);

	// --- [ glTexCoord2d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 */
	public static native void glTexCoord2d(double s, double t);

	// --- [ glTexCoord2fv ] ---

	/** Unsafe version of: {@link #glTexCoord2fv TexCoord2fv} */
	public static native void nglTexCoord2fv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2fv(FloatBuffer v) {
		if ( CHECKS )
			check(v, 2);
		nglTexCoord2fv(memAddress(v));
	}

	// --- [ glTexCoord2sv ] ---

	/** Unsafe version of: {@link #glTexCoord2sv TexCoord2sv} */
	public static native void nglTexCoord2sv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord2s TexCoord2s}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2sv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 2);
		nglTexCoord2sv(memAddress(v));
	}

	// --- [ glTexCoord2iv ] ---

	/** Unsafe version of: {@link #glTexCoord2iv TexCoord2iv} */
	public static native void nglTexCoord2iv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord2i TexCoord2i}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2iv(IntBuffer v) {
		if ( CHECKS )
			check(v, 2);
		nglTexCoord2iv(memAddress(v));
	}

	// --- [ glTexCoord2dv ] ---

	/** Unsafe version of: {@link #glTexCoord2dv TexCoord2dv} */
	public static native void nglTexCoord2dv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord2d TexCoord2d}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord2dv(DoubleBuffer v) {
		if ( CHECKS )
			check(v, 2);
		nglTexCoord2dv(memAddress(v));
	}

	// --- [ glTexCoord3f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current three-dimensional texture coordinate. {@code q} is implicitly set to 1.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static native void glTexCoord3f(float s, float t, float r);

	// --- [ glTexCoord3s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static native void glTexCoord3s(short s, short t, short r);

	// --- [ glTexCoord3i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static native void glTexCoord3i(int s, int t, int r);

	// --- [ glTexCoord3d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 */
	public static native void glTexCoord3d(double s, double t, double r);

	// --- [ glTexCoord3fv ] ---

	/** Unsafe version of: {@link #glTexCoord3fv TexCoord3fv} */
	public static native void nglTexCoord3fv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3fv(FloatBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglTexCoord3fv(memAddress(v));
	}

	// --- [ glTexCoord3sv ] ---

	/** Unsafe version of: {@link #glTexCoord3sv TexCoord3sv} */
	public static native void nglTexCoord3sv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord3s TexCoord3s}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3sv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglTexCoord3sv(memAddress(v));
	}

	// --- [ glTexCoord3iv ] ---

	/** Unsafe version of: {@link #glTexCoord3iv TexCoord3iv} */
	public static native void nglTexCoord3iv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord3i TexCoord3i}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3iv(IntBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglTexCoord3iv(memAddress(v));
	}

	// --- [ glTexCoord3dv ] ---

	/** Unsafe version of: {@link #glTexCoord3dv TexCoord3dv} */
	public static native void nglTexCoord3dv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord3d TexCoord3d}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord3dv(DoubleBuffer v) {
		if ( CHECKS )
			check(v, 3);
		nglTexCoord3dv(memAddress(v));
	}

	// --- [ glTexCoord4f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current four-dimensional texture coordinate.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static native void glTexCoord4f(float s, float t, float r, float q);

	// --- [ glTexCoord4s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static native void glTexCoord4s(short s, short t, short r, short q);

	// --- [ glTexCoord4i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static native void glTexCoord4i(int s, int t, int r, int q);

	// --- [ glTexCoord4d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s the s component of the current texture coordinates
	 * @param t the t component of the current texture coordinates
	 * @param r the r component of the current texture coordinates
	 * @param q the q component of the current texture coordinates
	 */
	public static native void glTexCoord4d(double s, double t, double r, double q);

	// --- [ glTexCoord4fv ] ---

	/** Unsafe version of: {@link #glTexCoord4fv TexCoord4fv} */
	public static native void nglTexCoord4fv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4fv(FloatBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglTexCoord4fv(memAddress(v));
	}

	// --- [ glTexCoord4sv ] ---

	/** Unsafe version of: {@link #glTexCoord4sv TexCoord4sv} */
	public static native void nglTexCoord4sv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord4s TexCoord4s}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4sv(ShortBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglTexCoord4sv(memAddress(v));
	}

	// --- [ glTexCoord4iv ] ---

	/** Unsafe version of: {@link #glTexCoord4iv TexCoord4iv} */
	public static native void nglTexCoord4iv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord4i TexCoord4i}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4iv(IntBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglTexCoord4iv(memAddress(v));
	}

	// --- [ glTexCoord4dv ] ---

	/** Unsafe version of: {@link #glTexCoord4dv TexCoord4dv} */
	public static native void nglTexCoord4dv(long v);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoord4d TexCoord4d}.
	 *
	 * @param v the texture coordinate buffer
	 */
	public static void glTexCoord4dv(DoubleBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglTexCoord4dv(memAddress(v));
	}

	// --- [ glTexCoordPointer ] ---

	/** Unsafe version of: {@link #glTexCoordPointer TexCoordPointer} */
	public static native void nglTexCoordPointer(int size, int type, int stride, long pointer);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a texture coordinate array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the texture coordinate array data
	 */
	public static void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
		nglTexCoordPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a texture coordinate array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the texture coordinate array data
	 */
	public static void glTexCoordPointer(int size, int type, int stride, long pointer) {
		nglTexCoordPointer(size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a texture coordinate array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the texture coordinate array data
	 */
	public static void glTexCoordPointer(int size, int type, int stride, ShortBuffer pointer) {
		nglTexCoordPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a texture coordinate array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the texture coordinate array data
	 */
	public static void glTexCoordPointer(int size, int type, int stride, IntBuffer pointer) {
		nglTexCoordPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a texture coordinate array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the texture coordinate array data
	 */
	public static void glTexCoordPointer(int size, int type, int stride, FloatBuffer pointer) {
		nglTexCoordPointer(size, type, stride, memAddress(pointer));
	}

	// --- [ glTexEnvi ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glTexEnvi">Reference Page</a></p>
	 * 
	 * Sets parameters of the texture environment that specifies how texture values are interpreted when texturing a fragment, or sets per-texture-unit
	 * filtering parameters.
	 *
	 * @param target the texture environment target. One of:<br><table><tr><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td><td>{@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}</td><td>{@link GL20#GL_POINT_SPRITE POINT_SPRITE}</td></tr></table>
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link GL20#GL_COORD_REPLACE COORD_REPLACE}</td><td>{@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL13#GL_COMBINE_RGB COMBINE_RGB}</td><td>{@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA}</td><td>{@link GL15#GL_SRC0_RGB SRC0_RGB}</td></tr><tr><td>{@link GL15#GL_SRC1_RGB SRC1_RGB}</td><td>{@link GL15#GL_SRC2_RGB SRC2_RGB}</td><td>{@link GL15#GL_SRC0_ALPHA SRC0_ALPHA}</td><td>{@link GL15#GL_SRC1_ALPHA SRC1_ALPHA}</td><td>{@link GL15#GL_SRC2_ALPHA SRC2_ALPHA}</td><td>{@link GL13#GL_OPERAND0_RGB OPERAND0_RGB}</td></tr><tr><td>{@link GL13#GL_OPERAND1_RGB OPERAND1_RGB}</td><td>{@link GL13#GL_OPERAND2_RGB OPERAND2_RGB}</td><td>{@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA}</td><td>{@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA}</td><td>{@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA}</td><td>{@link GL13#GL_RGB_SCALE RGB_SCALE}</td></tr><tr><td>{@link #GL_ALPHA_SCALE ALPHA_SCALE}</td></tr></table>
	 * @param param  the parameter value. Scalar value or one of:<br><table><tr><td>{@link #GL_REPLACE REPLACE}</td><td>{@link #GL_MODULATE MODULATE}</td><td>{@link #GL_DECAL DECAL}</td><td>{@link #GL_BLEND BLEND}</td><td>{@link #GL_ADD ADD}</td><td>{@link GL13#GL_COMBINE COMBINE}</td><td>{@link GL13#GL_ADD_SIGNED ADD_SIGNED}</td><td>{@link GL13#GL_INTERPOLATE INTERPOLATE}</td></tr><tr><td>{@link GL13#GL_SUBTRACT SUBTRACT}</td><td>{@link GL13#GL_DOT3_RGB DOT3_RGB}</td><td>{@link GL13#GL_DOT3_RGBA DOT3_RGBA}</td><td>{@link #GL_TEXTURE TEXTURE}</td><td>{@link GL13#GL_TEXTURE0 TEXTURE0}</td><td>GL13.GL_TEXTURE[1-31]</td><td>{@link GL13#GL_CONSTANT CONSTANT}</td><td>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}</td></tr><tr><td>{@link GL13#GL_PREVIOUS PREVIOUS}</td></tr></table>
	 */
	public static native void glTexEnvi(int target, int pname, int param);

	// --- [ glTexEnviv ] ---

	/** Unsafe version of: {@link #glTexEnviv TexEnviv} */
	public static native void nglTexEnviv(int target, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glTexEnv">Reference Page</a></p>
	 * 
	 * Pointer version of {@link #glTexEnvi TexEnvi}.
	 *
	 * @param target the texture environment target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td></tr></table>
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glTexEnviv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglTexEnviv(target, pname, memAddress(params));
	}

	// --- [ glTexEnvf ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glTexEnvf">Reference Page</a></p>
	 * 
	 * Float version of {@link #glTexEnvi TexEnvi}.
	 *
	 * @param target the texture environment target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
	public static native void glTexEnvf(int target, int pname, float param);

	// --- [ glTexEnvfv ] ---

	/** Unsafe version of: {@link #glTexEnvfv TexEnvfv} */
	public static native void nglTexEnvfv(int target, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glTexEnv">Reference Page</a></p>
	 * 
	 * Pointer version of {@link #glTexEnvf TexEnvf}.
	 *
	 * @param target the texture environment target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV TEXTURE_ENV}</td></tr></table>
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glTexEnvfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglTexEnvfv(target, pname, memAddress(params));
	}

	// --- [ glTexGeni ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGeni">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
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
	 * @param coord the coordinate for which to set the parameter. One of:<br><table><tr><td>{@link #GL_S S}</td><td>{@link #GL_T T}</td><td>{@link #GL_R R}</td><td>{@link #GL_Q Q}</td></tr></table>
	 * @param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}</td></tr></table>
	 * @param param the parameter value. One of:<br><table><tr><td>{@link #GL_OBJECT_LINEAR OBJECT_LINEAR}</td><td>{@link #GL_EYE_LINEAR EYE_LINEAR}</td><td>{@link #GL_SPHERE_MAP SPHERE_MAP}</td><td>{@link GL13#GL_REFLECTION_MAP REFLECTION_MAP}</td><td>{@link GL13#GL_NORMAL_MAP NORMAL_MAP}</td></tr></table>
	 */
	public static native void glTexGeni(int coord, int pname, int param);

	// --- [ glTexGeniv ] ---

	/** Unsafe version of: {@link #glTexGeniv TexGeniv} */
	public static native void nglTexGeniv(int coord, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_EYE_PLANE EYE_PLANE}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glTexGeniv(int coord, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglTexGeniv(coord, pname, memAddress(params));
	}

	// --- [ glTexGenf ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGenf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord the coordinate for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static native void glTexGenf(int coord, int pname, float param);

	// --- [ glTexGenfv ] ---

	/** Unsafe version of: {@link #glTexGenfv TexGenfv} */
	public static native void nglTexGenfv(int coord, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexGenf TexGenf}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link #GL_OBJECT_PLANE OBJECT_PLANE}</td><td>{@link #GL_EYE_PLANE EYE_PLANE}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glTexGenfv(int coord, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglTexGenfv(coord, pname, memAddress(params));
	}

	// --- [ glTexGend ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGend">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord the coordinate for which to set the parameter
	 * @param pname the parameter to set
	 * @param param the parameter value
	 */
	public static native void glTexGend(int coord, int pname, double param);

	// --- [ glTexGendv ] ---

	/** Unsafe version of: {@link #glTexGendv TexGendv} */
	public static native void nglTexGendv(int coord, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexGend TexGend}.
	 *
	 * @param coord  the coordinate for which to set the parameter
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexGendv(int coord, int pname, DoubleBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglTexGendv(coord, pname, memAddress(params));
	}

	// --- [ glTexImage2D ] ---

	/** Unsafe version of: {@link #glTexImage2D TexImage2D} */
	public static native void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link #GL_R3_G3_B2 R3_G3_B2}</td><td>{@link #GL_RGB4 RGB4}</td><td>{@link #GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link #GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link #GL_RGB10 RGB10}</td><td>{@link #GL_RGB12 RGB12}</td><td>{@link #GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link #GL_RGBA2 RGBA2}</td><td>{@link #GL_RGBA4 RGBA4}</td><td>{@link #GL_RGB5_A1 RGB5_A1}</td><td>{@link #GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link #GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link #GL_RGBA12 RGBA12}</td><td>{@link #GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the texel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels         the texel data
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link #GL_R3_G3_B2 R3_G3_B2}</td><td>{@link #GL_RGB4 RGB4}</td><td>{@link #GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link #GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link #GL_RGB10 RGB10}</td><td>{@link #GL_RGB12 RGB12}</td><td>{@link #GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link #GL_RGBA2 RGBA2}</td><td>{@link #GL_RGBA4 RGBA4}</td><td>{@link #GL_RGB5_A1 RGB5_A1}</td><td>{@link #GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link #GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link #GL_RGBA12 RGBA12}</td><td>{@link #GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the texel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels         the texel data
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link #GL_R3_G3_B2 R3_G3_B2}</td><td>{@link #GL_RGB4 RGB4}</td><td>{@link #GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link #GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link #GL_RGB10 RGB10}</td><td>{@link #GL_RGB12 RGB12}</td><td>{@link #GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link #GL_RGBA2 RGBA2}</td><td>{@link #GL_RGBA4 RGBA4}</td><td>{@link #GL_RGB5_A1 RGB5_A1}</td><td>{@link #GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link #GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link #GL_RGBA12 RGBA12}</td><td>{@link #GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the texel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels         the texel data
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link #GL_R3_G3_B2 R3_G3_B2}</td><td>{@link #GL_RGB4 RGB4}</td><td>{@link #GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link #GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link #GL_RGB10 RGB10}</td><td>{@link #GL_RGB12 RGB12}</td><td>{@link #GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link #GL_RGBA2 RGBA2}</td><td>{@link #GL_RGBA4 RGBA4}</td><td>{@link #GL_RGB5_A1 RGB5_A1}</td><td>{@link #GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link #GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link #GL_RGBA12 RGBA12}</td><td>{@link #GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the texel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels         the texel data
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link #GL_R3_G3_B2 R3_G3_B2}</td><td>{@link #GL_RGB4 RGB4}</td><td>{@link #GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link #GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link #GL_RGB10 RGB10}</td><td>{@link #GL_RGB12 RGB12}</td><td>{@link #GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link #GL_RGBA2 RGBA2}</td><td>{@link #GL_RGBA4 RGBA4}</td><td>{@link #GL_RGB5_A1 RGB5_A1}</td><td>{@link #GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link #GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link #GL_RGBA12 RGBA12}</td><td>{@link #GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the texel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels         the texel data
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<br><table><tr><td>{@link #GL_RED RED}</td><td>{@link GL30#GL_RG RG}</td><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr><tr><td>{@link GL30#GL_R8 R8}</td><td>{@link GL31#GL_R8_SNORM R8_SNORM}</td><td>{@link GL30#GL_R16 R16}</td><td>{@link GL31#GL_R16_SNORM R16_SNORM}</td><td>{@link GL30#GL_RG8 RG8}</td><td>{@link GL31#GL_RG8_SNORM RG8_SNORM}</td></tr><tr><td>{@link GL30#GL_RG16 RG16}</td><td>{@link GL31#GL_RG16_SNORM RG16_SNORM}</td><td>{@link #GL_R3_G3_B2 R3_G3_B2}</td><td>{@link #GL_RGB4 RGB4}</td><td>{@link #GL_RGB5 RGB5}</td><td>{@link GL41#GL_RGB565 RGB565}</td></tr><tr><td>{@link #GL_RGB8 RGB8}</td><td>{@link GL31#GL_RGB8_SNORM RGB8_SNORM}</td><td>{@link #GL_RGB10 RGB10}</td><td>{@link #GL_RGB12 RGB12}</td><td>{@link #GL_RGB16 RGB16}</td><td>{@link GL31#GL_RGB16_SNORM RGB16_SNORM}</td></tr><tr><td>{@link #GL_RGBA2 RGBA2}</td><td>{@link #GL_RGBA4 RGBA4}</td><td>{@link #GL_RGB5_A1 RGB5_A1}</td><td>{@link #GL_RGBA8 RGBA8}</td><td>{@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}</td><td>{@link #GL_RGB10_A2 RGB10_A2}</td></tr><tr><td>{@link GL33#GL_RGB10_A2UI RGB10_A2UI}</td><td>{@link #GL_RGBA12 RGBA12}</td><td>{@link #GL_RGBA16 RGBA16}</td><td>{@link GL31#GL_RGBA16_SNORM RGBA16_SNORM}</td><td>{@link GL21#GL_SRGB8 SRGB8}</td><td>{@link GL21#GL_SRGB8_ALPHA8 SRGB8_ALPHA8}</td></tr><tr><td>{@link GL30#GL_R16F R16F}</td><td>{@link GL30#GL_RG16F RG16F}</td><td>{@link GL30#GL_RGB16F RGB16F}</td><td>{@link GL30#GL_RGBA16F RGBA16F}</td><td>{@link GL30#GL_R32F R32F}</td><td>{@link GL30#GL_RG32F RG32F}</td></tr><tr><td>{@link GL30#GL_RGB32F RGB32F}</td><td>{@link GL30#GL_RGBA32F RGBA32F}</td><td>{@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F}</td><td>{@link GL30#GL_RGB9_E5 RGB9_E5}</td><td>{@link GL30#GL_R8I R8I}</td><td>{@link GL30#GL_R8UI R8UI}</td></tr><tr><td>{@link GL30#GL_R16I R16I}</td><td>{@link GL30#GL_R16UI R16UI}</td><td>{@link GL30#GL_R32I R32I}</td><td>{@link GL30#GL_R32UI R32UI}</td><td>{@link GL30#GL_RG8I RG8I}</td><td>{@link GL30#GL_RG8UI RG8UI}</td></tr><tr><td>{@link GL30#GL_RG16I RG16I}</td><td>{@link GL30#GL_RG16UI RG16UI}</td><td>{@link GL30#GL_RG32I RG32I}</td><td>{@link GL30#GL_RG32UI RG32UI}</td><td>{@link GL30#GL_RGB8I RGB8I}</td><td>{@link GL30#GL_RGB8UI RGB8UI}</td></tr><tr><td>{@link GL30#GL_RGB16I RGB16I}</td><td>{@link GL30#GL_RGB16UI RGB16UI}</td><td>{@link GL30#GL_RGB32I RGB32I}</td><td>{@link GL30#GL_RGB32UI RGB32UI}</td><td>{@link GL30#GL_RGBA8I RGBA8I}</td><td>{@link GL30#GL_RGBA8UI RGBA8UI}</td></tr><tr><td>{@link GL30#GL_RGBA16I RGBA16I}</td><td>{@link GL30#GL_RGBA16UI RGBA16UI}</td><td>{@link GL30#GL_RGBA32I RGBA32I}</td><td>{@link GL30#GL_RGBA32UI RGBA32UI}</td><td>{@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16}</td><td>{@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24}</td></tr><tr><td>{@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32}</td><td>{@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8}</td><td>{@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F}</td><td>{@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8}</td><td>{@link GL30#GL_COMPRESSED_RED COMPRESSED_RED}</td><td>{@link GL30#GL_COMPRESSED_RG COMPRESSED_RG}</td></tr><tr><td>{@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB}</td><td>{@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA}</td><td>{@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB}</td><td>{@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA}</td><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td></tr></table>
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the texel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels         the texel data
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
		nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glTexImage1D ] ---

	/** Unsafe version of: {@link #glTexImage1D TexImage1D} */
	public static native void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format
	 * @param width          the texture width
	 * @param border         the texture border width
	 * @param format         the texel data format
	 * @param type           the texel data type
	 * @param pixels         the texel data
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format
	 * @param width          the texture width
	 * @param border         the texture border width
	 * @param format         the texel data format
	 * @param type           the texel data type
	 * @param pixels         the texel data
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
		nglTexImage1D(target, level, internalformat, width, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format
	 * @param width          the texture width
	 * @param border         the texture border width
	 * @param format         the texel data format
	 * @param type           the texel data type
	 * @param pixels         the texel data
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format
	 * @param width          the texture width
	 * @param border         the texture border width
	 * @param format         the texel data format
	 * @param type           the texel data type
	 * @param pixels         the texel data
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format
	 * @param width          the texture width
	 * @param border         the texture border width
	 * @param format         the texel data format
	 * @param type           the texel data type
	 * @param pixels         the texel data
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
	 *
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format
	 * @param width          the texture width
	 * @param border         the texture border width
	 * @param format         the texel data format
	 * @param type           the texel data type
	 * @param pixels         the texel data
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
		nglTexImage1D(target, level, internalformat, width, border, format, type, memAddressSafe(pixels));
	}

	// --- [ glCopyTexImage2D ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glCopyTexImage2D">Reference Page</a></p>
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
	 * @param target         the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalFormat the texture internal format. See {@link #glTexImage2D TexImage2D} for a list of supported formats.
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param border         the texture border width
	 */
	public static native void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border);

	// --- [ glCopyTexImage1D ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glCopyTexImage1D">Reference Page</a></p>
	 * 
	 * Defines a one-dimensional texel array in exactly the manner of {@link #glTexImage1D TexImage1D}, except that the image data are taken from the framebuffer rather
	 * than from client memory. For the purposes of decoding the texture image, {@code CopyTexImage1D} is equivalent to calling {@link #glCopyTexImage2D CopyTexImage2D}
	 * with corresponding arguments and height of 1, except that the height of the image is always 1, regardless of the value of border. level, internalformat,
	 * and border are specified using the same values, with the same meanings, as the corresponding arguments of {@link #glTexImage1D TexImage1D}. The constraints on
	 * width and border are exactly those of the corresponding arguments of {@link #glTexImage1D TexImage1D}.
	 *
	 * @param target         the texture target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level          the level-of-detail number
	 * @param internalFormat the texture internal format. See {@link #glTexImage2D TexImage2D} for a list of supported formats.
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the texture width
	 * @param border         the texture border width
	 */
	public static native void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border);

	// --- [ glCopyTexSubImage1D ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glCopyTexSubImage1D">Reference Page</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width} or {@code border}
	 * parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See {@link #glCopyTexImage1D CopyTexImage1D} for more
	 * details.
	 *
	 * @param target  the texture target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level   the level-of-detail number
	 * @param xoffset the left texel coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 */
	public static native void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width);

	// --- [ glCopyTexSubImage2D ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glCopyTexSubImage2D">Reference Page</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the {@code internalformat}, {@code width}, {@code height},
	 * or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See
	 * {@link #glCopyTexImage2D CopyTexImage2D} for more details.
	 *
	 * @param target  the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level   the level-of-detail number
	 * @param xoffset the left texel coordinate of the texture subregion to update
	 * @param yoffset the lower texel coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 * @param height  the texture subregion height
	 */
	public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

	// --- [ glTexParameteri ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glTexParameteri">Reference Page</a></p>
	 * 
	 * Sets the integer value of a texture parameter, which controls how the texel array is treated when specified or changed, and when applied to a fragment.
	 *
	 * @param target the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param pname  the parameter to set. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link #GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link #GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link #GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link #GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td></tr><tr><td>{@link #GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link #GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td></tr><tr><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr></table>
	 * @param param  the parameter value
	 */
	public static native void glTexParameteri(int target, int pname, int param);

	// --- [ glTexParameteriv ] ---

	/** Unsafe version of: {@link #glTexParameteriv TexParameteriv} */
	public static native void nglTexParameteriv(int target, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glTexParameter">Reference Page</a></p>
	 * 
	 * Pointer version of {@link #glTexParameteri TexParameteri}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglTexParameteriv(target, pname, memAddress(params));
	}

	// --- [ glTexParameterf ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glTexParameterf">Reference Page</a></p>
	 * 
	 * Float version of {@link #glTexParameteri TexParameteri}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
	public static native void glTexParameterf(int target, int pname, float param);

	// --- [ glTexParameterfv ] ---

	/** Unsafe version of: {@link #glTexParameterfv TexParameterfv} */
	public static native void nglTexParameterfv(int target, int pname, long params);

	/**
	 * <p><a href="http://docs.gl/gl4/glTexParameter">Reference Page</a></p>
	 * 
	 * Pointer version of {@link #glTexParameterf TexParameterf}.
	 *
	 * @param target the texture target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glTexParameterfv(int target, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 4);
		nglTexParameterfv(target, pname, memAddress(params));
	}

	// --- [ glTexSubImage1D ] ---

	/** Unsafe version of: {@link #glTexSubImage1D TexSubImage1D} */
	public static native void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels);

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
	 *
	 * @param target  the texture target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
	 *
	 * @param target  the texture target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
		nglTexSubImage1D(target, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
	 *
	 * @param target  the texture target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
	 *
	 * @param target  the texture target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
	 *
	 * @param target  the texture target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
	 *
	 * @param target  the texture target. Must be:<br><table><tr><td>{@link #GL_TEXTURE_1D TEXTURE_1D}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
		nglTexSubImage1D(target, level, xoffset, width, format, type, memAddress(pixels));
	}

	// --- [ glTexSubImage2D ] ---

	/** Unsafe version of: {@link #glTexSubImage2D TexSubImage2D} */
	public static native void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<br><table><tr><td>{@link #GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr></table>
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link #GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link #GL_RED RED}</td><td>{@link #GL_GREEN GREEN}</td><td>{@link #GL_BLUE BLUE}</td><td>{@link #GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link #GL_RGB RGB}</td><td>{@link #GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link #GL_LUMINANCE LUMINANCE}</td><td>{@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link #GL_BYTE BYTE}</td><td>{@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link #GL_SHORT SHORT}</td></tr><tr><td>{@link #GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link #GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
		nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glTranslatef ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTranslatef">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Manipulates the current matrix with a translation matrix along the x-, y- and z- axes.
	 * 
	 * <p>Calling this function is equivalent to calling {@link #glMultMatrixf MultMatrixf} with the following matrix:</p>
	 * 
	 * <table class="lwjgl matrix">
	 * <tr><td>1</td><td>0</td><td>0</td><td>x</td></tr>
	 * <tr><td>0</td><td>1</td><td>0</td><td>y</td></tr>
	 * <tr><td>0</td><td>0</td><td>1</td><td>z</td></tr>
	 * <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table>
	 *
	 * @param x the x-axis translation
	 * @param y the y-axis translation
	 * @param z the z-axis translation
	 */
	public static native void glTranslatef(float x, float y, float z);

	// --- [ glTranslated ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glTranslated">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glTranslatef Translatef}.
	 *
	 * @param x the x-axis translation
	 * @param y the y-axis translation
	 * @param z the z-axis translation
	 */
	public static native void glTranslated(double x, double y, double z);

	// --- [ glVertex2f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in two dimensions. The z coordinate is implicitly set
	 * to zero and the w coordinate to one.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static native void glVertex2f(float x, float y);

	// --- [ glVertex2s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static native void glVertex2s(short x, short y);

	// --- [ glVertex2i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static native void glVertex2i(int x, int y);

	// --- [ glVertex2d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 */
	public static native void glVertex2d(double x, double y);

	// --- [ glVertex2fv ] ---

	/** Unsafe version of: {@link #glVertex2fv Vertex2fv} */
	public static native void nglVertex2fv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2fv(FloatBuffer coords) {
		if ( CHECKS )
			check(coords, 2);
		nglVertex2fv(memAddress(coords));
	}

	// --- [ glVertex2sv ] ---

	/** Unsafe version of: {@link #glVertex2sv Vertex2sv} */
	public static native void nglVertex2sv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex2s Vertex2s}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2sv(ShortBuffer coords) {
		if ( CHECKS )
			check(coords, 2);
		nglVertex2sv(memAddress(coords));
	}

	// --- [ glVertex2iv ] ---

	/** Unsafe version of: {@link #glVertex2iv Vertex2iv} */
	public static native void nglVertex2iv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex2i Vertex2i}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2iv(IntBuffer coords) {
		if ( CHECKS )
			check(coords, 2);
		nglVertex2iv(memAddress(coords));
	}

	// --- [ glVertex2dv ] ---

	/** Unsafe version of: {@link #glVertex2dv Vertex2dv} */
	public static native void nglVertex2dv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex2d Vertex2d}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex2dv(DoubleBuffer coords) {
		if ( CHECKS )
			check(coords, 2);
		nglVertex2dv(memAddress(coords));
	}

	// --- [ glVertex3f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in three dimensions. The w coordinate is implicitly set
	 * to one.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static native void glVertex3f(float x, float y, float z);

	// --- [ glVertex3s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static native void glVertex3s(short x, short y, short z);

	// --- [ glVertex3i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static native void glVertex3i(int x, int y, int z);

	// --- [ glVertex3d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 */
	public static native void glVertex3d(double x, double y, double z);

	// --- [ glVertex3fv ] ---

	/** Unsafe version of: {@link #glVertex3fv Vertex3fv} */
	public static native void nglVertex3fv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3fv(FloatBuffer coords) {
		if ( CHECKS )
			check(coords, 3);
		nglVertex3fv(memAddress(coords));
	}

	// --- [ glVertex3sv ] ---

	/** Unsafe version of: {@link #glVertex3sv Vertex3sv} */
	public static native void nglVertex3sv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex3s Vertex3s}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3sv(ShortBuffer coords) {
		if ( CHECKS )
			check(coords, 3);
		nglVertex3sv(memAddress(coords));
	}

	// --- [ glVertex3iv ] ---

	/** Unsafe version of: {@link #glVertex3iv Vertex3iv} */
	public static native void nglVertex3iv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex3i Vertex3i}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3iv(IntBuffer coords) {
		if ( CHECKS )
			check(coords, 3);
		nglVertex3iv(memAddress(coords));
	}

	// --- [ glVertex3dv ] ---

	/** Unsafe version of: {@link #glVertex3dv Vertex3dv} */
	public static native void nglVertex3dv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex3d Vertex3d}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex3dv(DoubleBuffer coords) {
		if ( CHECKS )
			check(coords, 3);
		nglVertex3dv(memAddress(coords));
	}

	// --- [ glVertex4f ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and {@link #glEnd End} by giving its coordinates in four dimensions.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static native void glVertex4f(float x, float y, float z, float w);

	// --- [ glVertex4s ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static native void glVertex4s(short x, short y, short z, short w);

	// --- [ glVertex4i ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static native void glVertex4i(int x, int y, int z, int w);

	// --- [ glVertex4d ] ---

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x the vertex x coordinate
	 * @param y the vertex y coordinate
	 * @param z the vertex z coordinate
	 * @param w the vertex w coordinate
	 */
	public static native void glVertex4d(double x, double y, double z, double w);

	// --- [ glVertex4fv ] ---

	/** Unsafe version of: {@link #glVertex4fv Vertex4fv} */
	public static native void nglVertex4fv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4fv(FloatBuffer coords) {
		if ( CHECKS )
			check(coords, 4);
		nglVertex4fv(memAddress(coords));
	}

	// --- [ glVertex4sv ] ---

	/** Unsafe version of: {@link #glVertex4sv Vertex4sv} */
	public static native void nglVertex4sv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex4s Vertex4s}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4sv(ShortBuffer coords) {
		if ( CHECKS )
			check(coords, 4);
		nglVertex4sv(memAddress(coords));
	}

	// --- [ glVertex4iv ] ---

	/** Unsafe version of: {@link #glVertex4iv Vertex4iv} */
	public static native void nglVertex4iv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex4i Vertex4i}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4iv(IntBuffer coords) {
		if ( CHECKS )
			check(coords, 4);
		nglVertex4iv(memAddress(coords));
	}

	// --- [ glVertex4dv ] ---

	/** Unsafe version of: {@link #glVertex4dv Vertex4dv} */
	public static native void nglVertex4dv(long coords);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertex4d Vertex4d}.
	 *
	 * @param coords the vertex buffer
	 */
	public static void glVertex4dv(DoubleBuffer coords) {
		if ( CHECKS )
			check(coords, 4);
		nglVertex4dv(memAddress(coords));
	}

	// --- [ glVertexPointer ] ---

	/** Unsafe version of: {@link #glVertexPointer VertexPointer} */
	public static native void nglVertexPointer(int size, int type, int stride, long pointer);

	/**
	 * <p><a href="http://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a vertex array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glVertexPointer(int size, int type, int stride, ByteBuffer pointer) {
		nglVertexPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a vertex array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glVertexPointer(int size, int type, int stride, long pointer) {
		nglVertexPointer(size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a vertex array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glVertexPointer(int size, int type, int stride, ShortBuffer pointer) {
		nglVertexPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a vertex array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glVertexPointer(int size, int type, int stride, IntBuffer pointer) {
		nglVertexPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a vertex array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. One of:<br><table><tr><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link #GL_SHORT SHORT}</td><td>{@link #GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link #GL_FLOAT FLOAT}</td><td>{@link #GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the vertex array data
	 */
	public static void glVertexPointer(int size, int type, int stride, FloatBuffer pointer) {
		nglVertexPointer(size, type, stride, memAddress(pointer));
	}

	// --- [ glViewport ] ---

	/**
	 * <p><a href="http://docs.gl/gl4/glViewport">Reference Page</a></p>
	 * 
	 * Specifies the viewport transformation parameters for all viewports.
	 * 
	 * <p>The location of the viewport's bottom-left corner, given by {@code (x, y)}, are clamped to be within the implementation-dependent viewport bounds range.
	 * The viewport bounds range {@code [min, max]} tuple may be determined by calling {@link #glGetFloatv GetFloatv} with the symbolic
	 * constant {@link GL41#GL_VIEWPORT_BOUNDS_RANGE VIEWPORT_BOUNDS_RANGE}. Viewport width and height are clamped to implementation-dependent maximums when specified. The maximum
	 * width and height may be found by calling {@link #glGetFloatv GetFloatv} with the symbolic constant {@link #GL_MAX_VIEWPORT_DIMS MAX_VIEWPORT_DIMS}. The
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
	public static native void glViewport(int x, int y, int w, int h);

	/**
	 * <p><a href="http://docs.gl/gl3/glAreTexturesResident">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glAreTexturesResident AreTexturesResident}
	 */
	public static boolean glAreTexturesResident(int[] textures, ByteBuffer residences) {
		long __functionAddress = GL.getICD().glAreTexturesResident;
		if ( CHECKS ) {
			check(__functionAddress);
			check(residences, textures.length);
		}
		return callPPZ(__functionAddress, textures.length, textures, memAddress(residences));
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glClipPlane">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glClipPlane ClipPlane}
	 */
	public static void glClipPlane(int plane, double[] equation) {
		long __functionAddress = GL.getICD().glClipPlane;
		if ( CHECKS )
			check(equation, 4);
		callPV(__functionAddress, plane, equation);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor3sv Color3sv}
	 */
	public static void glColor3sv(short[] v) {
		long __functionAddress = GL.getICD().glColor3sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor3iv Color3iv}
	 */
	public static void glColor3iv(int[] v) {
		long __functionAddress = GL.getICD().glColor3iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor3fv Color3fv}
	 */
	public static void glColor3fv(float[] v) {
		long __functionAddress = GL.getICD().glColor3fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor3dv Color3dv}
	 */
	public static void glColor3dv(double[] v) {
		long __functionAddress = GL.getICD().glColor3dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor3usv Color3usv}
	 */
	public static void glColor3usv(short[] v) {
		long __functionAddress = GL.getICD().glColor3usv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor3uiv Color3uiv}
	 */
	public static void glColor3uiv(int[] v) {
		long __functionAddress = GL.getICD().glColor3uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor4sv Color4sv}
	 */
	public static void glColor4sv(short[] v) {
		long __functionAddress = GL.getICD().glColor4sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor4iv Color4iv}
	 */
	public static void glColor4iv(int[] v) {
		long __functionAddress = GL.getICD().glColor4iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor4fv Color4fv}
	 */
	public static void glColor4fv(float[] v) {
		long __functionAddress = GL.getICD().glColor4fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor4dv Color4dv}
	 */
	public static void glColor4dv(double[] v) {
		long __functionAddress = GL.getICD().glColor4dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor4usv Color4usv}
	 */
	public static void glColor4usv(short[] v) {
		long __functionAddress = GL.getICD().glColor4usv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColor4uiv Color4uiv}
	 */
	public static void glColor4uiv(int[] v) {
		long __functionAddress = GL.getICD().glColor4uiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColorPointer ColorPointer}
	 */
	public static void glColorPointer(int size, int type, int stride, short[] pointer) {
		long __functionAddress = GL.getICD().glColorPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColorPointer ColorPointer}
	 */
	public static void glColorPointer(int size, int type, int stride, int[] pointer) {
		long __functionAddress = GL.getICD().glColorPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glColorPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColorPointer ColorPointer}
	 */
	public static void glColorPointer(int size, int type, int stride, float[] pointer) {
		long __functionAddress = GL.getICD().glColorPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glDrawPixels DrawPixels}
	 */
	public static void glDrawPixels(int width, int height, int format, int type, short[] pixels) {
		long __functionAddress = GL.getICD().glDrawPixels;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glDrawPixels DrawPixels}
	 */
	public static void glDrawPixels(int width, int height, int format, int type, int[] pixels) {
		long __functionAddress = GL.getICD().glDrawPixels;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glDrawPixels">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glDrawPixels DrawPixels}
	 */
	public static void glDrawPixels(int width, int height, int format, int type, float[] pixels) {
		long __functionAddress = GL.getICD().glDrawPixels;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glEvalCoord1fv EvalCoord1fv}
	 */
	public static void glEvalCoord1fv(float[] u) {
		long __functionAddress = GL.getICD().glEvalCoord1fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(u, 1);
		}
		callPV(__functionAddress, u);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glEvalCoord1dv EvalCoord1dv}
	 */
	public static void glEvalCoord1dv(double[] u) {
		long __functionAddress = GL.getICD().glEvalCoord1dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(u, 1);
		}
		callPV(__functionAddress, u);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glEvalCoord2fv EvalCoord2fv}
	 */
	public static void glEvalCoord2fv(float[] u) {
		long __functionAddress = GL.getICD().glEvalCoord2fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(u, 2);
		}
		callPV(__functionAddress, u);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glEvalCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glEvalCoord2dv EvalCoord2dv}
	 */
	public static void glEvalCoord2dv(double[] u) {
		long __functionAddress = GL.getICD().glEvalCoord2dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(u, 2);
		}
		callPV(__functionAddress, u);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glFeedbackBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glFeedbackBuffer FeedbackBuffer}
	 */
	public static void glFeedbackBuffer(int type, float[] buffer) {
		long __functionAddress = GL.getICD().glFeedbackBuffer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, buffer.length, type, buffer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glFogiv Fogiv}
	 */
	public static void glFogiv(int pname, int[] params) {
		long __functionAddress = GL.getICD().glFogiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glFog">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glFogfv Fogfv}
	 */
	public static void glFogfv(int pname, float[] params) {
		long __functionAddress = GL.getICD().glFogfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGenTextures">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGenTextures GenTextures}
	 */
	public static void glGenTextures(int[] textures) {
		long __functionAddress = GL.getICD().glGenTextures;
		callPV(__functionAddress, textures.length, textures);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glDeleteTextures">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glDeleteTextures DeleteTextures}
	 */
	public static void glDeleteTextures(int[] textures) {
		long __functionAddress = GL.getICD().glDeleteTextures;
		callPV(__functionAddress, textures.length, textures);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetClipPlane">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetClipPlane GetClipPlane}
	 */
	public static void glGetClipPlane(int plane, double[] equation) {
		long __functionAddress = GL.getICD().glGetClipPlane;
		if ( CHECKS )
			check(equation, 4);
		callPV(__functionAddress, plane, equation);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetFloatv">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetFloatv GetFloatv}
	 */
	public static void glGetFloatv(int pname, float[] params) {
		long __functionAddress = GL.getICD().glGetFloatv;
		if ( CHECKS )
			check(params, 1);
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetIntegerv">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetIntegerv GetIntegerv}
	 */
	public static void glGetIntegerv(int pname, int[] params) {
		long __functionAddress = GL.getICD().glGetIntegerv;
		if ( CHECKS )
			check(params, 1);
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetDoublev">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetDoublev GetDoublev}
	 */
	public static void glGetDoublev(int pname, double[] params) {
		long __functionAddress = GL.getICD().glGetDoublev;
		if ( CHECKS )
			check(params, 1);
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetLightiv GetLightiv}
	 */
	public static void glGetLightiv(int light, int pname, int[] data) {
		long __functionAddress = GL.getICD().glGetLightiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4);
		}
		callPV(__functionAddress, light, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetLightfv GetLightfv}
	 */
	public static void glGetLightfv(int light, int pname, float[] data) {
		long __functionAddress = GL.getICD().glGetLightfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4);
		}
		callPV(__functionAddress, light, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetMapiv GetMapiv}
	 */
	public static void glGetMapiv(int target, int query, int[] data) {
		long __functionAddress = GL.getICD().glGetMapiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4);
		}
		callPV(__functionAddress, target, query, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetMapfv GetMapfv}
	 */
	public static void glGetMapfv(int target, int query, float[] data) {
		long __functionAddress = GL.getICD().glGetMapfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4);
		}
		callPV(__functionAddress, target, query, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetMapdv GetMapdv}
	 */
	public static void glGetMapdv(int target, int query, double[] data) {
		long __functionAddress = GL.getICD().glGetMapdv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4);
		}
		callPV(__functionAddress, target, query, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetMaterialiv GetMaterialiv}
	 */
	public static void glGetMaterialiv(int face, int pname, int[] data) {
		long __functionAddress = GL.getICD().glGetMaterialiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 1);
		}
		callPV(__functionAddress, face, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetMaterialfv GetMaterialfv}
	 */
	public static void glGetMaterialfv(int face, int pname, float[] data) {
		long __functionAddress = GL.getICD().glGetMaterialfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 1);
		}
		callPV(__functionAddress, face, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetPixelMapfv GetPixelMapfv}
	 */
	public static void glGetPixelMapfv(int map, float[] data) {
		long __functionAddress = GL.getICD().glGetPixelMapfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 32);
		}
		callPV(__functionAddress, map, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetPixelMapusv GetPixelMapusv}
	 */
	public static void glGetPixelMapusv(int map, short[] data) {
		long __functionAddress = GL.getICD().glGetPixelMapusv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 32);
		}
		callPV(__functionAddress, map, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetPixelMapuiv GetPixelMapuiv}
	 */
	public static void glGetPixelMapuiv(int map, int[] data) {
		long __functionAddress = GL.getICD().glGetPixelMapuiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 32);
		}
		callPV(__functionAddress, map, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexEnv">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexEnviv GetTexEnviv}
	 */
	public static void glGetTexEnviv(int env, int pname, int[] data) {
		long __functionAddress = GL.getICD().glGetTexEnviv;
		if ( CHECKS )
			check(data, 1);
		callPV(__functionAddress, env, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexEnv">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexEnvfv GetTexEnvfv}
	 */
	public static void glGetTexEnvfv(int env, int pname, float[] data) {
		long __functionAddress = GL.getICD().glGetTexEnvfv;
		if ( CHECKS )
			check(data, 1);
		callPV(__functionAddress, env, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetTexGeniv GetTexGeniv}
	 */
	public static void glGetTexGeniv(int coord, int pname, int[] data) {
		long __functionAddress = GL.getICD().glGetTexGeniv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 1);
		}
		callPV(__functionAddress, coord, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetTexGenfv GetTexGenfv}
	 */
	public static void glGetTexGenfv(int coord, int pname, float[] data) {
		long __functionAddress = GL.getICD().glGetTexGenfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4);
		}
		callPV(__functionAddress, coord, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glGetTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glGetTexGendv GetTexGendv}
	 */
	public static void glGetTexGendv(int coord, int pname, double[] data) {
		long __functionAddress = GL.getICD().glGetTexGendv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 4);
		}
		callPV(__functionAddress, coord, pname, data);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexImage GetTexImage}
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, short[] pixels) {
		long __functionAddress = GL.getICD().glGetTexImage;
		callPV(__functionAddress, tex, level, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexImage GetTexImage}
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, int[] pixels) {
		long __functionAddress = GL.getICD().glGetTexImage;
		callPV(__functionAddress, tex, level, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexImage GetTexImage}
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, float[] pixels) {
		long __functionAddress = GL.getICD().glGetTexImage;
		callPV(__functionAddress, tex, level, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexImage">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexImage GetTexImage}
	 */
	public static void glGetTexImage(int tex, int level, int format, int type, double[] pixels) {
		long __functionAddress = GL.getICD().glGetTexImage;
		callPV(__functionAddress, tex, level, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}
	 */
	public static void glGetTexLevelParameteriv(int target, int level, int pname, int[] params) {
		long __functionAddress = GL.getICD().glGetTexLevelParameteriv;
		if ( CHECKS )
			check(params, 1);
		callPV(__functionAddress, target, level, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexLevelParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv}
	 */
	public static void glGetTexLevelParameterfv(int target, int level, int pname, float[] params) {
		long __functionAddress = GL.getICD().glGetTexLevelParameterfv;
		if ( CHECKS )
			check(params, 1);
		callPV(__functionAddress, target, level, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexParameteriv GetTexParameteriv}
	 */
	public static void glGetTexParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GL.getICD().glGetTexParameteriv;
		if ( CHECKS )
			check(params, 1);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glGetTexParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glGetTexParameterfv GetTexParameterfv}
	 */
	public static void glGetTexParameterfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getICD().glGetTexParameterfv;
		if ( CHECKS )
			check(params, 1);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glIndexiv Indexiv}
	 */
	public static void glIndexiv(int[] index) {
		long __functionAddress = GL.getICD().glIndexiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(index, 1);
		}
		callPV(__functionAddress, index);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glIndexsv Indexsv}
	 */
	public static void glIndexsv(short[] index) {
		long __functionAddress = GL.getICD().glIndexsv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(index, 1);
		}
		callPV(__functionAddress, index);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glIndexfv Indexfv}
	 */
	public static void glIndexfv(float[] index) {
		long __functionAddress = GL.getICD().glIndexfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(index, 1);
		}
		callPV(__functionAddress, index);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glIndex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glIndexdv Indexdv}
	 */
	public static void glIndexdv(double[] index) {
		long __functionAddress = GL.getICD().glIndexdv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(index, 1);
		}
		callPV(__functionAddress, index);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glInterleavedArrays InterleavedArrays}
	 */
	public static void glInterleavedArrays(int format, int stride, short[] pointer) {
		long __functionAddress = GL.getICD().glInterleavedArrays;
		callPV(__functionAddress, format, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glInterleavedArrays InterleavedArrays}
	 */
	public static void glInterleavedArrays(int format, int stride, int[] pointer) {
		long __functionAddress = GL.getICD().glInterleavedArrays;
		callPV(__functionAddress, format, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glInterleavedArrays InterleavedArrays}
	 */
	public static void glInterleavedArrays(int format, int stride, float[] pointer) {
		long __functionAddress = GL.getICD().glInterleavedArrays;
		callPV(__functionAddress, format, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glInterleavedArrays">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glInterleavedArrays InterleavedArrays}
	 */
	public static void glInterleavedArrays(int format, int stride, double[] pointer) {
		long __functionAddress = GL.getICD().glInterleavedArrays;
		callPV(__functionAddress, format, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glLightModeliv LightModeliv}
	 */
	public static void glLightModeliv(int pname, int[] params) {
		long __functionAddress = GL.getICD().glLightModeliv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glLightModel">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glLightModelfv LightModelfv}
	 */
	public static void glLightModelfv(int pname, float[] params) {
		long __functionAddress = GL.getICD().glLightModelfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glLightiv Lightiv}
	 */
	public static void glLightiv(int light, int pname, int[] params) {
		long __functionAddress = GL.getICD().glLightiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, light, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glLight">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glLightfv Lightfv}
	 */
	public static void glLightfv(int light, int pname, float[] params) {
		long __functionAddress = GL.getICD().glLightfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, light, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glLoadMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glLoadMatrixf LoadMatrixf}
	 */
	public static void glLoadMatrixf(float[] m) {
		long __functionAddress = GL.getICD().glLoadMatrixf;
		if ( CHECKS ) {
			check(__functionAddress);
			check(m, 16);
		}
		callPV(__functionAddress, m);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glLoadMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glLoadMatrixd LoadMatrixd}
	 */
	public static void glLoadMatrixd(double[] m) {
		long __functionAddress = GL.getICD().glLoadMatrixd;
		if ( CHECKS ) {
			check(__functionAddress);
			check(m, 16);
		}
		callPV(__functionAddress, m);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMap1f Map1f}
	 */
	public static void glMap1f(int target, float u1, float u2, int stride, int order, float[] points) {
		long __functionAddress = GL.getICD().glMap1f;
		if ( CHECKS ) {
			check(__functionAddress);
			check(points, order * stride);
		}
		callPV(__functionAddress, target, u1, u2, stride, order, points);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMap1d Map1d}
	 */
	public static void glMap1d(int target, double u1, double u2, int stride, int order, double[] points) {
		long __functionAddress = GL.getICD().glMap1d;
		if ( CHECKS ) {
			check(__functionAddress);
			check(points, stride * order);
		}
		callPV(__functionAddress, target, u1, u2, stride, order, points);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMap2f Map2f}
	 */
	public static void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
		long __functionAddress = GL.getICD().glMap2f;
		if ( CHECKS ) {
			check(__functionAddress);
			check(points, ustride * uorder * vstride * vorder);
		}
		callPV(__functionAddress, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMap2d Map2d}
	 */
	public static void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
		long __functionAddress = GL.getICD().glMap2d;
		if ( CHECKS ) {
			check(__functionAddress);
			check(points, ustride * uorder * vstride * vorder);
		}
		callPV(__functionAddress, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMaterialiv Materialiv}
	 */
	public static void glMaterialiv(int face, int pname, int[] params) {
		long __functionAddress = GL.getICD().glMaterialiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, face, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glMaterial">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMaterialfv Materialfv}
	 */
	public static void glMaterialfv(int face, int pname, float[] params) {
		long __functionAddress = GL.getICD().glMaterialfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, face, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glMultMatrixf">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultMatrixf MultMatrixf}
	 */
	public static void glMultMatrixf(float[] m) {
		long __functionAddress = GL.getICD().glMultMatrixf;
		if ( CHECKS ) {
			check(__functionAddress);
			check(m, 16);
		}
		callPV(__functionAddress, m);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glMultMatrixd">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultMatrixd MultMatrixd}
	 */
	public static void glMultMatrixd(double[] m) {
		long __functionAddress = GL.getICD().glMultMatrixd;
		if ( CHECKS ) {
			check(__functionAddress);
			check(m, 16);
		}
		callPV(__functionAddress, m);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glNormal3fv Normal3fv}
	 */
	public static void glNormal3fv(float[] v) {
		long __functionAddress = GL.getICD().glNormal3fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glNormal3sv Normal3sv}
	 */
	public static void glNormal3sv(short[] v) {
		long __functionAddress = GL.getICD().glNormal3sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glNormal3iv Normal3iv}
	 */
	public static void glNormal3iv(int[] v) {
		long __functionAddress = GL.getICD().glNormal3iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glNormal3dv Normal3dv}
	 */
	public static void glNormal3dv(double[] v) {
		long __functionAddress = GL.getICD().glNormal3dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glNormalPointer NormalPointer}
	 */
	public static void glNormalPointer(int type, int stride, short[] pointer) {
		long __functionAddress = GL.getICD().glNormalPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glNormalPointer NormalPointer}
	 */
	public static void glNormalPointer(int type, int stride, int[] pointer) {
		long __functionAddress = GL.getICD().glNormalPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glNormalPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glNormalPointer NormalPointer}
	 */
	public static void glNormalPointer(int type, int stride, float[] pointer) {
		long __functionAddress = GL.getICD().glNormalPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glPixelMapfv PixelMapfv}
	 */
	public static void glPixelMapfv(int map, float[] values) {
		long __functionAddress = GL.getICD().glPixelMapfv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, map, values.length, values);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glPixelMapusv PixelMapusv}
	 */
	public static void glPixelMapusv(int map, short[] values) {
		long __functionAddress = GL.getICD().glPixelMapusv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, map, values.length, values);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glPixelMap">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glPixelMapuiv PixelMapuiv}
	 */
	public static void glPixelMapuiv(int map, int[] values) {
		long __functionAddress = GL.getICD().glPixelMapuiv;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, map, values.length, values);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glPrioritizeTextures">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glPrioritizeTextures PrioritizeTextures}
	 */
	public static void glPrioritizeTextures(int[] textures, float[] priorities) {
		long __functionAddress = GL.getICD().glPrioritizeTextures;
		if ( CHECKS ) {
			check(__functionAddress);
			check(priorities, textures.length);
		}
		callPPV(__functionAddress, textures.length, textures, priorities);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos2iv RasterPos2iv}
	 */
	public static void glRasterPos2iv(int[] coords) {
		long __functionAddress = GL.getICD().glRasterPos2iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 2);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos2sv RasterPos2sv}
	 */
	public static void glRasterPos2sv(short[] coords) {
		long __functionAddress = GL.getICD().glRasterPos2sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 2);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos2fv RasterPos2fv}
	 */
	public static void glRasterPos2fv(float[] coords) {
		long __functionAddress = GL.getICD().glRasterPos2fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 2);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos2dv RasterPos2dv}
	 */
	public static void glRasterPos2dv(double[] coords) {
		long __functionAddress = GL.getICD().glRasterPos2dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 2);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos3iv RasterPos3iv}
	 */
	public static void glRasterPos3iv(int[] coords) {
		long __functionAddress = GL.getICD().glRasterPos3iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 3);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos3sv RasterPos3sv}
	 */
	public static void glRasterPos3sv(short[] coords) {
		long __functionAddress = GL.getICD().glRasterPos3sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 3);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos3fv RasterPos3fv}
	 */
	public static void glRasterPos3fv(float[] coords) {
		long __functionAddress = GL.getICD().glRasterPos3fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 3);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos3dv RasterPos3dv}
	 */
	public static void glRasterPos3dv(double[] coords) {
		long __functionAddress = GL.getICD().glRasterPos3dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 3);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos4iv RasterPos4iv}
	 */
	public static void glRasterPos4iv(int[] coords) {
		long __functionAddress = GL.getICD().glRasterPos4iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 4);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos4sv RasterPos4sv}
	 */
	public static void glRasterPos4sv(short[] coords) {
		long __functionAddress = GL.getICD().glRasterPos4sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 4);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos4fv RasterPos4fv}
	 */
	public static void glRasterPos4fv(float[] coords) {
		long __functionAddress = GL.getICD().glRasterPos4fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 4);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRasterPos">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRasterPos4dv RasterPos4dv}
	 */
	public static void glRasterPos4dv(double[] coords) {
		long __functionAddress = GL.getICD().glRasterPos4dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 4);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glReadPixels">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glReadPixels ReadPixels}
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
		long __functionAddress = GL.getICD().glReadPixels;
		callPV(__functionAddress, x, y, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glReadPixels">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glReadPixels ReadPixels}
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
		long __functionAddress = GL.getICD().glReadPixels;
		callPV(__functionAddress, x, y, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glReadPixels">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glReadPixels ReadPixels}
	 */
	public static void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
		long __functionAddress = GL.getICD().glReadPixels;
		callPV(__functionAddress, x, y, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRectiv Rectiv}
	 */
	public static void glRectiv(int[] v1, int[] v2) {
		long __functionAddress = GL.getICD().glRectiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v1, 2);
			check(v2, 2);
		}
		callPPV(__functionAddress, v1, v2);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRectsv Rectsv}
	 */
	public static void glRectsv(short[] v1, short[] v2) {
		long __functionAddress = GL.getICD().glRectsv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v1, 2);
			check(v2, 2);
		}
		callPPV(__functionAddress, v1, v2);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRectfv Rectfv}
	 */
	public static void glRectfv(float[] v1, float[] v2) {
		long __functionAddress = GL.getICD().glRectfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v1, 2);
			check(v2, 2);
		}
		callPPV(__functionAddress, v1, v2);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glRect">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glRectdv Rectdv}
	 */
	public static void glRectdv(double[] v1, double[] v2) {
		long __functionAddress = GL.getICD().glRectdv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v1, 2);
			check(v2, 2);
		}
		callPPV(__functionAddress, v1, v2);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glSelectBuffer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glSelectBuffer SelectBuffer}
	 */
	public static void glSelectBuffer(int[] buffer) {
		long __functionAddress = GL.getICD().glSelectBuffer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, buffer.length, buffer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord1fv TexCoord1fv}
	 */
	public static void glTexCoord1fv(float[] v) {
		long __functionAddress = GL.getICD().glTexCoord1fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 1);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord1sv TexCoord1sv}
	 */
	public static void glTexCoord1sv(short[] v) {
		long __functionAddress = GL.getICD().glTexCoord1sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 1);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord1iv TexCoord1iv}
	 */
	public static void glTexCoord1iv(int[] v) {
		long __functionAddress = GL.getICD().glTexCoord1iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 1);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord1dv TexCoord1dv}
	 */
	public static void glTexCoord1dv(double[] v) {
		long __functionAddress = GL.getICD().glTexCoord1dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 1);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord2fv TexCoord2fv}
	 */
	public static void glTexCoord2fv(float[] v) {
		long __functionAddress = GL.getICD().glTexCoord2fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 2);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord2sv TexCoord2sv}
	 */
	public static void glTexCoord2sv(short[] v) {
		long __functionAddress = GL.getICD().glTexCoord2sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 2);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord2iv TexCoord2iv}
	 */
	public static void glTexCoord2iv(int[] v) {
		long __functionAddress = GL.getICD().glTexCoord2iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 2);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord2dv TexCoord2dv}
	 */
	public static void glTexCoord2dv(double[] v) {
		long __functionAddress = GL.getICD().glTexCoord2dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 2);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord3fv TexCoord3fv}
	 */
	public static void glTexCoord3fv(float[] v) {
		long __functionAddress = GL.getICD().glTexCoord3fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord3sv TexCoord3sv}
	 */
	public static void glTexCoord3sv(short[] v) {
		long __functionAddress = GL.getICD().glTexCoord3sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord3iv TexCoord3iv}
	 */
	public static void glTexCoord3iv(int[] v) {
		long __functionAddress = GL.getICD().glTexCoord3iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord3dv TexCoord3dv}
	 */
	public static void glTexCoord3dv(double[] v) {
		long __functionAddress = GL.getICD().glTexCoord3dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord4fv TexCoord4fv}
	 */
	public static void glTexCoord4fv(float[] v) {
		long __functionAddress = GL.getICD().glTexCoord4fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord4sv TexCoord4sv}
	 */
	public static void glTexCoord4sv(short[] v) {
		long __functionAddress = GL.getICD().glTexCoord4sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord4iv TexCoord4iv}
	 */
	public static void glTexCoord4iv(int[] v) {
		long __functionAddress = GL.getICD().glTexCoord4iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoord4dv TexCoord4dv}
	 */
	public static void glTexCoord4dv(double[] v) {
		long __functionAddress = GL.getICD().glTexCoord4dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoordPointer TexCoordPointer}
	 */
	public static void glTexCoordPointer(int size, int type, int stride, short[] pointer) {
		long __functionAddress = GL.getICD().glTexCoordPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoordPointer TexCoordPointer}
	 */
	public static void glTexCoordPointer(int size, int type, int stride, int[] pointer) {
		long __functionAddress = GL.getICD().glTexCoordPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexCoordPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoordPointer TexCoordPointer}
	 */
	public static void glTexCoordPointer(int size, int type, int stride, float[] pointer) {
		long __functionAddress = GL.getICD().glTexCoordPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexEnv">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexEnviv TexEnviv}
	 */
	public static void glTexEnviv(int target, int pname, int[] params) {
		long __functionAddress = GL.getICD().glTexEnviv;
		if ( CHECKS )
			check(params, 4);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexEnv">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexEnvfv TexEnvfv}
	 */
	public static void glTexEnvfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getICD().glTexEnvfv;
		if ( CHECKS )
			check(params, 4);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexGeniv TexGeniv}
	 */
	public static void glTexGeniv(int coord, int pname, int[] params) {
		long __functionAddress = GL.getICD().glTexGeniv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, coord, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexGenfv TexGenfv}
	 */
	public static void glTexGenfv(int coord, int pname, float[] params) {
		long __functionAddress = GL.getICD().glTexGenfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, coord, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glTexGen">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexGendv TexGendv}
	 */
	public static void glTexGendv(int coord, int pname, double[] params) {
		long __functionAddress = GL.getICD().glTexGendv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 4);
		}
		callPV(__functionAddress, coord, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage2D TexImage2D}
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels) {
		long __functionAddress = GL.getICD().glTexImage2D;
		callPV(__functionAddress, target, level, internalformat, width, height, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage2D TexImage2D}
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels) {
		long __functionAddress = GL.getICD().glTexImage2D;
		callPV(__functionAddress, target, level, internalformat, width, height, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage2D TexImage2D}
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels) {
		long __functionAddress = GL.getICD().glTexImage2D;
		callPV(__functionAddress, target, level, internalformat, width, height, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage2D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage2D TexImage2D}
	 */
	public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, double[] pixels) {
		long __functionAddress = GL.getICD().glTexImage2D;
		callPV(__functionAddress, target, level, internalformat, width, height, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage1D TexImage1D}
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, short[] pixels) {
		long __functionAddress = GL.getICD().glTexImage1D;
		callPV(__functionAddress, target, level, internalformat, width, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage1D TexImage1D}
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, int[] pixels) {
		long __functionAddress = GL.getICD().glTexImage1D;
		callPV(__functionAddress, target, level, internalformat, width, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage1D TexImage1D}
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, float[] pixels) {
		long __functionAddress = GL.getICD().glTexImage1D;
		callPV(__functionAddress, target, level, internalformat, width, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexImage1D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexImage1D TexImage1D}
	 */
	public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, double[] pixels) {
		long __functionAddress = GL.getICD().glTexImage1D;
		callPV(__functionAddress, target, level, internalformat, width, border, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexParameteriv TexParameteriv}
	 */
	public static void glTexParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GL.getICD().glTexParameteriv;
		if ( CHECKS )
			check(params, 4);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexParameter">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexParameterfv TexParameterfv}
	 */
	public static void glTexParameterfv(int target, int pname, float[] params) {
		long __functionAddress = GL.getICD().glTexParameterfv;
		if ( CHECKS )
			check(params, 4);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage1D TexSubImage1D}
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
		long __functionAddress = GL.getICD().glTexSubImage1D;
		callPV(__functionAddress, target, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage1D TexSubImage1D}
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
		long __functionAddress = GL.getICD().glTexSubImage1D;
		callPV(__functionAddress, target, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage1D TexSubImage1D}
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
		long __functionAddress = GL.getICD().glTexSubImage1D;
		callPV(__functionAddress, target, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage1D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage1D TexSubImage1D}
	 */
	public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, double[] pixels) {
		long __functionAddress = GL.getICD().glTexSubImage1D;
		callPV(__functionAddress, target, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage2D TexSubImage2D}
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
		long __functionAddress = GL.getICD().glTexSubImage2D;
		callPV(__functionAddress, target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage2D TexSubImage2D}
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
		long __functionAddress = GL.getICD().glTexSubImage2D;
		callPV(__functionAddress, target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage2D TexSubImage2D}
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
		long __functionAddress = GL.getICD().glTexSubImage2D;
		callPV(__functionAddress, target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl4/glTexSubImage2D">Reference Page</a></p>
	 * 
	 * Array version of: {@link #glTexSubImage2D TexSubImage2D}
	 */
	public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
		long __functionAddress = GL.getICD().glTexSubImage2D;
		callPV(__functionAddress, target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex2fv Vertex2fv}
	 */
	public static void glVertex2fv(float[] coords) {
		long __functionAddress = GL.getICD().glVertex2fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 2);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex2sv Vertex2sv}
	 */
	public static void glVertex2sv(short[] coords) {
		long __functionAddress = GL.getICD().glVertex2sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 2);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex2iv Vertex2iv}
	 */
	public static void glVertex2iv(int[] coords) {
		long __functionAddress = GL.getICD().glVertex2iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 2);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex2dv Vertex2dv}
	 */
	public static void glVertex2dv(double[] coords) {
		long __functionAddress = GL.getICD().glVertex2dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 2);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex3fv Vertex3fv}
	 */
	public static void glVertex3fv(float[] coords) {
		long __functionAddress = GL.getICD().glVertex3fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 3);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex3sv Vertex3sv}
	 */
	public static void glVertex3sv(short[] coords) {
		long __functionAddress = GL.getICD().glVertex3sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 3);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex3iv Vertex3iv}
	 */
	public static void glVertex3iv(int[] coords) {
		long __functionAddress = GL.getICD().glVertex3iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 3);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex3dv Vertex3dv}
	 */
	public static void glVertex3dv(double[] coords) {
		long __functionAddress = GL.getICD().glVertex3dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 3);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex4fv Vertex4fv}
	 */
	public static void glVertex4fv(float[] coords) {
		long __functionAddress = GL.getICD().glVertex4fv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 4);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex4sv Vertex4sv}
	 */
	public static void glVertex4sv(short[] coords) {
		long __functionAddress = GL.getICD().glVertex4sv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 4);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex4iv Vertex4iv}
	 */
	public static void glVertex4iv(int[] coords) {
		long __functionAddress = GL.getICD().glVertex4iv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 4);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertex4dv Vertex4dv}
	 */
	public static void glVertex4dv(double[] coords) {
		long __functionAddress = GL.getICD().glVertex4dv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(coords, 4);
		}
		callPV(__functionAddress, coords);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertexPointer VertexPointer}
	 */
	public static void glVertexPointer(int size, int type, int stride, short[] pointer) {
		long __functionAddress = GL.getICD().glVertexPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertexPointer VertexPointer}
	 */
	public static void glVertexPointer(int size, int type, int stride, int[] pointer) {
		long __functionAddress = GL.getICD().glVertexPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://docs.gl/gl3/glVertexPointer">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertexPointer VertexPointer}
	 */
	public static void glVertexPointer(int size, int type, int stride, float[] pointer) {
		long __functionAddress = GL.getICD().glVertexPointer;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

}