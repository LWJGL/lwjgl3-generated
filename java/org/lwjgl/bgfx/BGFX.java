/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <a href="https://github.com/bkaradzic/bgfx">bgfx</a> library. */
public class BGFX {

	/** API version */
	public static final int BGFX_API_VERSION = 22;

	/** State */
	public static final long
		BGFX_STATE_RGB_WRITE               = 0x1L,
		BGFX_STATE_ALPHA_WRITE             = 0x2L,
		BGFX_STATE_DEPTH_WRITE             = 0x4L,
		BGFX_STATE_DEPTH_TEST_LESS         = 0x10L,
		BGFX_STATE_DEPTH_TEST_LEQUAL       = 0x20L,
		BGFX_STATE_DEPTH_TEST_EQUAL        = 0x30L,
		BGFX_STATE_DEPTH_TEST_GEQUAL       = 0x40L,
		BGFX_STATE_DEPTH_TEST_GREATER      = 0x50L,
		BGFX_STATE_DEPTH_TEST_NOTEQUAL     = 0x60L,
		BGFX_STATE_DEPTH_TEST_NEVER        = 0x70L,
		BGFX_STATE_DEPTH_TEST_ALWAYS       = 0x80L,
		BGFX_STATE_DEPTH_TEST_MASK         = 0xF0L,
		BGFX_STATE_BLEND_ZERO              = 0x1000L,
		BGFX_STATE_BLEND_ONE               = 0x2000L,
		BGFX_STATE_BLEND_SRC_COLOR         = 0x3000L,
		BGFX_STATE_BLEND_INV_SRC_COLOR     = 0x4000L,
		BGFX_STATE_BLEND_SRC_ALPHA         = 0x5000L,
		BGFX_STATE_BLEND_INV_SRC_ALPHA     = 0x6000L,
		BGFX_STATE_BLEND_DST_ALPHA         = 0x7000L,
		BGFX_STATE_BLEND_INV_DST_ALPHA     = 0x8000L,
		BGFX_STATE_BLEND_DST_COLOR         = 0x9000L,
		BGFX_STATE_BLEND_INV_DST_COLOR     = 0xA000L,
		BGFX_STATE_BLEND_SRC_ALPHA_SAT     = 0xB000L,
		BGFX_STATE_BLEND_FACTOR            = 0xC000L,
		BGFX_STATE_BLEND_INV_FACTOR        = 0xD000L,
		BGFX_STATE_BLEND_MASK              = 0xFFFF000L,
		BGFX_STATE_BLEND_EQUATION_ADD      = 0x0L,
		BGFX_STATE_BLEND_EQUATION_SUB      = 0x10000000L,
		BGFX_STATE_BLEND_EQUATION_REVSUB   = 0x20000000L,
		BGFX_STATE_BLEND_EQUATION_MIN      = 0x30000000L,
		BGFX_STATE_BLEND_EQUATION_MAX      = 0x40000000L,
		BGFX_STATE_BLEND_EQUATION_MASK     = 0x3F0000000L,
		BGFX_STATE_BLEND_INDEPENDENT       = 0x400000000L,
		BGFX_STATE_BLEND_ALPHA_TO_COVERAGE = 0x800000000L,
		BGFX_STATE_CULL_CW                 = 0x1000000000L,
		BGFX_STATE_CULL_CCW                = 0x2000000000L,
		BGFX_STATE_CULL_MASK               = 0x3000000000L,
		BGFX_STATE_ALPHA_REF_MASK          = 0xFF0000000000L,
		BGFX_STATE_PT_TRISTRIP             = 0x1000000000000L,
		BGFX_STATE_PT_LINES                = 0x2000000000000L,
		BGFX_STATE_PT_LINESTRIP            = 0x3000000000000L,
		BGFX_STATE_PT_POINTS               = 0x4000000000000L,
		BGFX_STATE_PT_MASK                 = 0x7000000000000L,
		BGFX_STATE_POINT_SIZE_MASK         = 0xF0000000000000L,
		BGFX_STATE_MSAA                    = 0x100000000000000L,
		BGFX_STATE_LINEAA                  = 0x200000000000000L,
		BGFX_STATE_CONSERVATIVE_RASTER     = 0x400000000000000L,
		BGFX_STATE_RESERVED_MASK           = 0xe000000000000000L,
		BGFX_STATE_NONE                    = 0x0L,
		BGFX_STATE_MASK                    = 0xffffffffffffffffL,
		BGFX_STATE_DEFAULT                 = (0L
		| BGFX_STATE_RGB_WRITE
		| BGFX_STATE_ALPHA_WRITE
		| BGFX_STATE_DEPTH_TEST_LESS
		| BGFX_STATE_DEPTH_WRITE
		| BGFX_STATE_CULL_CW
		| BGFX_STATE_MSAA)
		;

	/** State */
	public static final int
		BGFX_STATE_DEPTH_TEST_SHIFT     = 4,
		BGFX_STATE_BLEND_SHIFT          = 12,
		BGFX_STATE_BLEND_EQUATION_SHIFT = 28,
		BGFX_STATE_CULL_SHIFT           = 36,
		BGFX_STATE_ALPHA_REF_SHIFT      = 40,
		BGFX_STATE_PT_SHIFT             = 48,
		BGFX_STATE_POINT_SIZE_SHIFT     = 52,
		BGFX_STATE_RESERVED_SHIFT       = 61;

	/** Stencil */
	public static final int
		BGFX_STENCIL_FUNC_REF_SHIFT    = 0,
		BGFX_STENCIL_FUNC_REF_MASK     = 0xFF,
		BGFX_STENCIL_FUNC_RMASK_SHIFT  = 8,
		BGFX_STENCIL_FUNC_RMASK_MASK   = 0xFF00,
		BGFX_STENCIL_TEST_LESS         = 0x10000,
		BGFX_STENCIL_TEST_LEQUAL       = 0x20000,
		BGFX_STENCIL_TEST_EQUAL        = 0x30000,
		BGFX_STENCIL_TEST_GEQUAL       = 0x40000,
		BGFX_STENCIL_TEST_GREATER      = 0x50000,
		BGFX_STENCIL_TEST_NOTEQUAL     = 0x60000,
		BGFX_STENCIL_TEST_NEVER        = 0x70000,
		BGFX_STENCIL_TEST_ALWAYS       = 0x80000,
		BGFX_STENCIL_TEST_SHIFT        = 16,
		BGFX_STENCIL_TEST_MASK         = 0xF0000,
		BGFX_STENCIL_OP_FAIL_S_ZERO    = 0x0,
		BGFX_STENCIL_OP_FAIL_S_KEEP    = 0x100000,
		BGFX_STENCIL_OP_FAIL_S_REPLACE = 0x200000,
		BGFX_STENCIL_OP_FAIL_S_INCR    = 0x300000,
		BGFX_STENCIL_OP_FAIL_S_INCRSAT = 0x400000,
		BGFX_STENCIL_OP_FAIL_S_DECR    = 0x500000,
		BGFX_STENCIL_OP_FAIL_S_DECRSAT = 0x600000,
		BGFX_STENCIL_OP_FAIL_S_INVERT  = 0x700000,
		BGFX_STENCIL_OP_FAIL_S_SHIFT   = 20,
		BGFX_STENCIL_OP_FAIL_S_MASK    = 0xF00000,
		BGFX_STENCIL_OP_FAIL_Z_ZERO    = 0x0,
		BGFX_STENCIL_OP_FAIL_Z_KEEP    = 0x1000000,
		BGFX_STENCIL_OP_FAIL_Z_REPLACE = 0x2000000,
		BGFX_STENCIL_OP_FAIL_Z_INCR    = 0x3000000,
		BGFX_STENCIL_OP_FAIL_Z_INCRSAT = 0x4000000,
		BGFX_STENCIL_OP_FAIL_Z_DECR    = 0x5000000,
		BGFX_STENCIL_OP_FAIL_Z_DECRSAT = 0x6000000,
		BGFX_STENCIL_OP_FAIL_Z_INVERT  = 0x7000000,
		BGFX_STENCIL_OP_FAIL_Z_SHIFT   = 24,
		BGFX_STENCIL_OP_FAIL_Z_MASK    = 0xF000000,
		BGFX_STENCIL_OP_PASS_Z_ZERO    = 0x0,
		BGFX_STENCIL_OP_PASS_Z_KEEP    = 0x10000000,
		BGFX_STENCIL_OP_PASS_Z_REPLACE = 0x20000000,
		BGFX_STENCIL_OP_PASS_Z_INCR    = 0x30000000,
		BGFX_STENCIL_OP_PASS_Z_INCRSAT = 0x40000000,
		BGFX_STENCIL_OP_PASS_Z_DECR    = 0x50000000,
		BGFX_STENCIL_OP_PASS_Z_DECRSAT = 0x60000000,
		BGFX_STENCIL_OP_PASS_Z_INVERT  = 0x70000000,
		BGFX_STENCIL_OP_PASS_Z_SHIFT   = 28,
		BGFX_STENCIL_OP_PASS_Z_MASK    = 0xf0000000,
		BGFX_STENCIL_NONE              = 0x0,
		BGFX_STENCIL_MASK              = 0xffffffff,
		BGFX_STENCIL_DEFAULT           = 0x0;

	/** Clear */
	public static final short
		BGFX_CLEAR_NONE               = 0x0,
		BGFX_CLEAR_COLOR              = 0x1,
		BGFX_CLEAR_DEPTH              = 0x2,
		BGFX_CLEAR_STENCIL            = 0x4,
		BGFX_CLEAR_DISCARD_COLOR_0    = 0x8,
		BGFX_CLEAR_DISCARD_COLOR_1    = 0x10,
		BGFX_CLEAR_DISCARD_COLOR_2    = 0x20,
		BGFX_CLEAR_DISCARD_COLOR_3    = 0x40,
		BGFX_CLEAR_DISCARD_COLOR_4    = 0x80,
		BGFX_CLEAR_DISCARD_COLOR_5    = 0x100,
		BGFX_CLEAR_DISCARD_COLOR_6    = 0x200,
		BGFX_CLEAR_DISCARD_COLOR_7    = 0x400,
		BGFX_CLEAR_DISCARD_DEPTH      = 0x800,
		BGFX_CLEAR_DISCARD_STENCIL    = 0x1000,
		BGFX_CLEAR_DISCARD_COLOR_MASK = (0
		| BGFX_CLEAR_DISCARD_COLOR_0
		| BGFX_CLEAR_DISCARD_COLOR_1
		| BGFX_CLEAR_DISCARD_COLOR_2
		| BGFX_CLEAR_DISCARD_COLOR_3
		| BGFX_CLEAR_DISCARD_COLOR_4
		| BGFX_CLEAR_DISCARD_COLOR_5
		| BGFX_CLEAR_DISCARD_COLOR_6
		| BGFX_CLEAR_DISCARD_COLOR_7)
		,
		BGFX_CLEAR_DISCARD_MASK       = (0
		| BGFX_CLEAR_DISCARD_COLOR_MASK
		| BGFX_CLEAR_DISCARD_DEPTH
		| BGFX_CLEAR_DISCARD_STENCIL)
		;

	/** Debug */
	public static final int
		BGFX_DEBUG_NONE      = 0x0,
		BGFX_DEBUG_WIREFRAME = 0x1,
		BGFX_DEBUG_IFH       = 0x2,
		BGFX_DEBUG_STATS     = 0x4,
		BGFX_DEBUG_TEXT      = 0x8;

	/** Buffer creation flags */
	public static final short
		BGFX_BUFFER_NONE               = 0x0,
		BGFX_BUFFER_COMPUTE_READ       = 0x100,
		BGFX_BUFFER_COMPUTE_WRITE      = 0x200,
		BGFX_BUFFER_DRAW_INDIRECT      = 0x400,
		BGFX_BUFFER_ALLOW_RESIZE       = 0x800,
		BGFX_BUFFER_INDEX32            = 0x1000,
		BGFX_BUFFER_COMPUTE_READ_WRITE = (0
		| BGFX_BUFFER_COMPUTE_READ
		| BGFX_BUFFER_COMPUTE_WRITE)
		;

	/** Buffer */
	public static final short
		BGFX_BUFFER_COMPUTE_FORMAT_8x1   = 0x1,
		BGFX_BUFFER_COMPUTE_FORMAT_8x2   = 0x2,
		BGFX_BUFFER_COMPUTE_FORMAT_8x4   = 0x3,
		BGFX_BUFFER_COMPUTE_FORMAT_16x1  = 0x4,
		BGFX_BUFFER_COMPUTE_FORMAT_16x2  = 0x5,
		BGFX_BUFFER_COMPUTE_FORMAT_16x4  = 0x6,
		BGFX_BUFFER_COMPUTE_FORMAT_32x1  = 0x7,
		BGFX_BUFFER_COMPUTE_FORMAT_32x2  = 0x8,
		BGFX_BUFFER_COMPUTE_FORMAT_32x4  = 0x9,
		BGFX_BUFFER_COMPUTE_FORMAT_SHIFT = 0,
		BGFX_BUFFER_COMPUTE_FORMAT_MASK  = 0xF,
		BGFX_BUFFER_COMPUTE_TYPE_UINT    = 0x10,
		BGFX_BUFFER_COMPUTE_TYPE_INT     = 0x20,
		BGFX_BUFFER_COMPUTE_TYPE_FLOAT   = 0x30,
		BGFX_BUFFER_COMPUTE_TYPE_SHIFT   = 4,
		BGFX_BUFFER_COMPUTE_TYPE_MASK    = 0x30;

	/** Texture */
	public static final int
		BGFX_TEXTURE_NONE             = 0x0,
		BGFX_TEXTURE_U_MIRROR         = 0x1,
		BGFX_TEXTURE_U_CLAMP          = 0x2,
		BGFX_TEXTURE_U_BORDER         = 0x3,
		BGFX_TEXTURE_V_MIRROR         = 0x4,
		BGFX_TEXTURE_V_CLAMP          = 0x8,
		BGFX_TEXTURE_V_BORDER         = 0xC,
		BGFX_TEXTURE_W_MIRROR         = 0x10,
		BGFX_TEXTURE_W_CLAMP          = 0x20,
		BGFX_TEXTURE_W_BORDER         = 0x30,
		BGFX_TEXTURE_MIN_POINT        = 0x40,
		BGFX_TEXTURE_MIN_ANISOTROPIC  = 0x80,
		BGFX_TEXTURE_MAG_POINT        = 0x100,
		BGFX_TEXTURE_MAG_ANISOTROPIC  = 0x200,
		BGFX_TEXTURE_MIP_POINT        = 0x400,
		BGFX_TEXTURE_MSAA_SAMPLE      = 0x800,
		BGFX_TEXTURE_RT               = 0x1000,
		BGFX_TEXTURE_RT_MSAA_X2       = 0x2000,
		BGFX_TEXTURE_RT_MSAA_X4       = 0x3000,
		BGFX_TEXTURE_RT_MSAA_X8       = 0x4000,
		BGFX_TEXTURE_RT_MSAA_X16      = 0x5000,
		BGFX_TEXTURE_RT_WRITE_ONLY    = 0x8000,
		BGFX_TEXTURE_COMPARE_LESS     = 0x10000,
		BGFX_TEXTURE_COMPARE_LEQUAL   = 0x20000,
		BGFX_TEXTURE_COMPARE_EQUAL    = 0x30000,
		BGFX_TEXTURE_COMPARE_GEQUAL   = 0x40000,
		BGFX_TEXTURE_COMPARE_GREATER  = 0x50000,
		BGFX_TEXTURE_COMPARE_NOTEQUAL = 0x60000,
		BGFX_TEXTURE_COMPARE_NEVER    = 0x70000,
		BGFX_TEXTURE_COMPARE_ALWAYS   = 0x80000,
		BGFX_TEXTURE_COMPUTE_WRITE    = 0x100000,
		BGFX_TEXTURE_SRGB             = 0x200000,
		BGFX_TEXTURE_BLIT_DST         = 0x400000,
		BGFX_TEXTURE_READ_BACK        = 0x800000;

	/** Texture shifts/masks */
	public static final int
		BGFX_TEXTURE_U_SHIFT            = 0,
		BGFX_TEXTURE_U_MASK             = 0x3,
		BGFX_TEXTURE_V_SHIFT            = 2,
		BGFX_TEXTURE_V_MASK             = 0xC,
		BGFX_TEXTURE_W_SHIFT            = 4,
		BGFX_TEXTURE_W_MASK             = 0x30,
		BGFX_TEXTURE_MIN_SHIFT          = 6,
		BGFX_TEXTURE_MIN_MASK           = 0xC0,
		BGFX_TEXTURE_MAG_SHIFT          = 8,
		BGFX_TEXTURE_MAG_MASK           = 0x300,
		BGFX_TEXTURE_MIP_SHIFT          = 10,
		BGFX_TEXTURE_MIP_MASK           = 0x400,
		BGFX_TEXTURE_RT_MSAA_SHIFT      = 12,
		BGFX_TEXTURE_RT_MSAA_MASK       = 0x7000,
		BGFX_TEXTURE_RT_MASK            = 0xF000,
		BGFX_TEXTURE_COMPARE_SHIFT      = 16,
		BGFX_TEXTURE_COMPARE_MASK       = 0xF0000,
		BGFX_TEXTURE_BORDER_COLOR_SHIFT = 24,
		BGFX_TEXTURE_BORDER_COLOR_MASK  = 0xF000000,
		BGFX_TEXTURE_RESERVED_SHIFT     = 28,
		BGFX_TEXTURE_RESERVED_MASK      = 0xf0000000,
		BGFX_TEXTURE_SAMPLER_BITS_MASK  = (0
		| BGFX_TEXTURE_U_MASK
		| BGFX_TEXTURE_V_MASK
		| BGFX_TEXTURE_W_MASK
		| BGFX_TEXTURE_MIN_MASK
		| BGFX_TEXTURE_MAG_MASK
		| BGFX_TEXTURE_MIP_MASK
		| BGFX_TEXTURE_COMPARE_MASK)
		;

	/** Reset */
	public static final int
		BGFX_RESET_NONE               = 0x0,
		BGFX_RESET_FULLSCREEN         = 0x1,
		BGFX_RESET_FULLSCREEN_SHIFT   = 0,
		BGFX_RESET_FULLSCREEN_MASK    = 0x1,
		BGFX_RESET_MSAA_X2            = 0x10,
		BGFX_RESET_MSAA_X4            = 0x20,
		BGFX_RESET_MSAA_X8            = 0x30,
		BGFX_RESET_MSAA_X16           = 0x40,
		BGFX_RESET_MSAA_SHIFT         = 4,
		BGFX_RESET_MSAA_MASK          = 0x70,
		BGFX_RESET_VSYNC              = 0x80,
		BGFX_RESET_MAXANISOTROPY      = 0x100,
		BGFX_RESET_CAPTURE            = 0x200,
		BGFX_RESET_HMD                = 0x400,
		BGFX_RESET_HMD_DEBUG          = 0x800,
		BGFX_RESET_HMD_RECENTER       = 0x1000,
		BGFX_RESET_FLUSH_AFTER_RENDER = 0x2000,
		BGFX_RESET_FLIP_AFTER_RENDER  = 0x4000,
		BGFX_RESET_SRGB_BACKBUFFER    = 0x8000,
		BGFX_RESET_HIDPI              = 0x10000,
		BGFX_RESET_DEPTH_CLAMP        = 0x20000,
		BGFX_RESET_SUSPEND            = 0x40000;

	/** Reset */
	public static final int
		BGFX_RESET_RESERVED_SHIFT = 31,
		BGFX_RESET_RESERVED_MASK  = 0x80000000;

	/** Caps */
	public static final long
		BGFX_CAPS_TEXTURE_COMPARE_LEQUAL = 0x1L,
		BGFX_CAPS_TEXTURE_COMPARE_ALL    = 0x3L,
		BGFX_CAPS_TEXTURE_3D             = 0x4L,
		BGFX_CAPS_VERTEX_ATTRIB_HALF     = 0x8L,
		BGFX_CAPS_VERTEX_ATTRIB_UINT10   = 0x10L,
		BGFX_CAPS_INSTANCING             = 0x20L,
		BGFX_CAPS_RENDERER_MULTITHREADED = 0x40L,
		BGFX_CAPS_FRAGMENT_DEPTH         = 0x80L,
		BGFX_CAPS_BLEND_INDEPENDENT      = 0x100L,
		BGFX_CAPS_COMPUTE                = 0x200L,
		BGFX_CAPS_FRAGMENT_ORDERING      = 0x400L,
		BGFX_CAPS_SWAP_CHAIN             = 0x800L,
		BGFX_CAPS_HMD                    = 0x1000L,
		BGFX_CAPS_INDEX32                = 0x2000L,
		BGFX_CAPS_DRAW_INDIRECT          = 0x4000L,
		BGFX_CAPS_HIDPI                  = 0x8000L,
		BGFX_CAPS_TEXTURE_BLIT           = 0x10000L,
		BGFX_CAPS_TEXTURE_READ_BACK      = 0x20000L,
		BGFX_CAPS_OCCLUSION_QUERY        = 0x40000L,
		BGFX_CAPS_ALPHA_TO_COVERAGE      = 0x80000L,
		BGFX_CAPS_CONSERVATIVE_RASTER    = 0x100000L,
		BGFX_CAPS_TEXTURE_2D_ARRAY       = 0x200000L,
		BGFX_CAPS_TEXTURE_CUBE_ARRAY     = 0x400000L,
		BGFX_CAPS_GRAPHICS_DEBUGGER      = 0x800000L;

	/** Format caps */
	public static final short
		BGFX_CAPS_FORMAT_TEXTURE_NONE             = 0x0,
		BGFX_CAPS_FORMAT_TEXTURE_2D               = 0x1,
		BGFX_CAPS_FORMAT_TEXTURE_2D_SRGB          = 0x2,
		BGFX_CAPS_FORMAT_TEXTURE_2D_EMULATED      = 0x4,
		BGFX_CAPS_FORMAT_TEXTURE_3D               = 0x8,
		BGFX_CAPS_FORMAT_TEXTURE_3D_SRGB          = 0x10,
		BGFX_CAPS_FORMAT_TEXTURE_3D_EMULATED      = 0x20,
		BGFX_CAPS_FORMAT_TEXTURE_CUBE             = 0x40,
		BGFX_CAPS_FORMAT_TEXTURE_CUBE_SRGB        = 0x80,
		BGFX_CAPS_FORMAT_TEXTURE_CUBE_EMULATED    = 0x100,
		BGFX_CAPS_FORMAT_TEXTURE_VERTEX           = 0x200,
		BGFX_CAPS_FORMAT_TEXTURE_IMAGE            = 0x400,
		BGFX_CAPS_FORMAT_TEXTURE_FRAMEBUFFER      = 0x800,
		BGFX_CAPS_FORMAT_TEXTURE_FRAMEBUFFER_MSAA = 0x1000,
		BGFX_CAPS_FORMAT_TEXTURE_MSAA             = 0x2000,
		BGFX_CAPS_FORMAT_TEXTURE_MIP_AUTOGEN      = 0x4000;

	/** View */
	public static final byte
		BGFX_VIEW_NONE   = 0x0,
		BGFX_VIEW_STEREO = 0x1;

	/** Submit */
	public static final byte
		BGFX_SUBMIT_EYE_LEFT       = 0x1,
		BGFX_SUBMIT_EYE_RIGHT      = 0x2,
		BGFX_SUBMIT_EYE_MASK       = 0x3,
		BGFX_SUBMIT_EYE_FIRST      = BGFX_SUBMIT_EYE_LEFT,
		BGFX_SUBMIT_RESERVED_SHIFT = 7,
		BGFX_SUBMIT_RESERVED_MASK  = (byte)0x80;

	/** PCI */
	public static final short
		BGFX_PCI_ID_NONE                = 0x0,
		BGFX_PCI_ID_SOFTWARE_RASTERIZER = 0x1,
		BGFX_PCI_ID_AMD                 = 0x1002,
		BGFX_PCI_ID_INTEL               = (short)0x8086,
		BGFX_PCI_ID_NVIDIA              = 0x10DE;

	/** HMD */
	public static final byte
		BGFX_HMD_NONE              = 0x0,
		BGFX_HMD_DEVICE_RESOLUTION = 0x1,
		BGFX_HMD_RENDERING         = 0x2;

	/** Cubemap */
	public static final byte
		BGFX_CUBE_MAP_POSITIVE_X = 0x0,
		BGFX_CUBE_MAP_NEGATIVE_X = 0x1,
		BGFX_CUBE_MAP_POSITIVE_Y = 0x2,
		BGFX_CUBE_MAP_NEGATIVE_Y = 0x3,
		BGFX_CUBE_MAP_POSITIVE_Z = 0x4,
		BGFX_CUBE_MAP_NEGATIVE_Z = 0x5;

	/** Renderer type. ({@code bgfx_renderer_type_t}) */
	public static final int
		BGFX_RENDERER_TYPE_NULL       = 0,
		BGFX_RENDERER_TYPE_DIRECT3D9  = 1,
		BGFX_RENDERER_TYPE_DIRECT3D11 = 2,
		BGFX_RENDERER_TYPE_DIRECT3D12 = 3,
		BGFX_RENDERER_TYPE_METAL      = 4,
		BGFX_RENDERER_TYPE_OPENGLES   = 5,
		BGFX_RENDERER_TYPE_OPENGL     = 6,
		BGFX_RENDERER_TYPE_VULKAN     = 7,
		BGFX_RENDERER_TYPE_GNM        = 8,
		BGFX_RENDERER_TYPE_COUNT      = 9;

	/** bgfx_access_t */
	public static final int
		BGFX_ACCESS_READ      = 0,
		BGFX_ACCESS_WRITE     = 1,
		BGFX_ACCESS_READWRITE = 2,
		BGFX_ACCESS_COUNT     = 3;

	/** bgfx_attrib_t */
	public static final int
		BGFX_ATTRIB_POSITION  = 0,
		BGFX_ATTRIB_NORMAL    = 1,
		BGFX_ATTRIB_TANGENT   = 2,
		BGFX_ATTRIB_BITANGENT = 3,
		BGFX_ATTRIB_COLOR0    = 4,
		BGFX_ATTRIB_COLOR1    = 5,
		BGFX_ATTRIB_INDICES   = 6,
		BGFX_ATTRIB_WEIGHT    = 7,
		BGFX_ATTRIB_TEXCOORD0 = 8,
		BGFX_ATTRIB_TEXCOORD1 = 9,
		BGFX_ATTRIB_TEXCOORD2 = 10,
		BGFX_ATTRIB_TEXCOORD3 = 11,
		BGFX_ATTRIB_TEXCOORD4 = 12,
		BGFX_ATTRIB_TEXCOORD5 = 13,
		BGFX_ATTRIB_TEXCOORD6 = 14,
		BGFX_ATTRIB_TEXCOORD7 = 15,
		BGFX_ATTRIB_COUNT     = BGFX_ATTRIB_TEXCOORD7 + 1;

	/** bgfx_attrib_type_t */
	public static final int
		BGFX_ATTRIB_TYPE_UINT8  = 0,
		BGFX_ATTRIB_TYPE_UINT10 = 1,
		BGFX_ATTRIB_TYPE_INT16  = 2,
		BGFX_ATTRIB_TYPE_HALF   = 3,
		BGFX_ATTRIB_TYPE_FLOAT  = 4,
		BGFX_ATTRIB_TYPE_COUNT  = BGFX_ATTRIB_TYPE_FLOAT + 1;

	/** bgfx_texture_format_t */
	public static final int
		BGFX_TEXTURE_FORMAT_BC1           = 0,
		BGFX_TEXTURE_FORMAT_BC2           = 1,
		BGFX_TEXTURE_FORMAT_BC3           = 2,
		BGFX_TEXTURE_FORMAT_BC4           = 3,
		BGFX_TEXTURE_FORMAT_BC5           = 4,
		BGFX_TEXTURE_FORMAT_BC6H          = 5,
		BGFX_TEXTURE_FORMAT_BC7           = 6,
		BGFX_TEXTURE_FORMAT_ETC1          = 7,
		BGFX_TEXTURE_FORMAT_ETC2          = 8,
		BGFX_TEXTURE_FORMAT_ETC2A         = 9,
		BGFX_TEXTURE_FORMAT_ETC2A1        = 10,
		BGFX_TEXTURE_FORMAT_PTC12         = 11,
		BGFX_TEXTURE_FORMAT_PTC14         = 12,
		BGFX_TEXTURE_FORMAT_PTC12A        = 13,
		BGFX_TEXTURE_FORMAT_PTC14A        = 14,
		BGFX_TEXTURE_FORMAT_PTC22         = 15,
		BGFX_TEXTURE_FORMAT_PTC24         = 16,
		BGFX_TEXTURE_FORMAT_UNKNOWN       = 17,
		BGFX_TEXTURE_FORMAT_R1            = 18,
		BGFX_TEXTURE_FORMAT_A8            = 19,
		BGFX_TEXTURE_FORMAT_R8            = 20,
		BGFX_TEXTURE_FORMAT_R8I           = 21,
		BGFX_TEXTURE_FORMAT_R8U           = 22,
		BGFX_TEXTURE_FORMAT_R8S           = 23,
		BGFX_TEXTURE_FORMAT_R16           = 24,
		BGFX_TEXTURE_FORMAT_R16I          = 25,
		BGFX_TEXTURE_FORMAT_R16U          = 26,
		BGFX_TEXTURE_FORMAT_R16F          = 27,
		BGFX_TEXTURE_FORMAT_R16S          = 28,
		BGFX_TEXTURE_FORMAT_R32I          = 29,
		BGFX_TEXTURE_FORMAT_R32U          = 30,
		BGFX_TEXTURE_FORMAT_R32F          = 31,
		BGFX_TEXTURE_FORMAT_RG8           = 32,
		BGFX_TEXTURE_FORMAT_RG8I          = 33,
		BGFX_TEXTURE_FORMAT_RG8U          = 34,
		BGFX_TEXTURE_FORMAT_RG8S          = 35,
		BGFX_TEXTURE_FORMAT_RG16          = 36,
		BGFX_TEXTURE_FORMAT_RG16I         = 37,
		BGFX_TEXTURE_FORMAT_RG16U         = 38,
		BGFX_TEXTURE_FORMAT_RG16F         = 39,
		BGFX_TEXTURE_FORMAT_RG16S         = 40,
		BGFX_TEXTURE_FORMAT_RG32I         = 41,
		BGFX_TEXTURE_FORMAT_RG32U         = 42,
		BGFX_TEXTURE_FORMAT_RG32F         = 43,
		BGFX_TEXTURE_FORMAT_RGB8          = 44,
		BGFX_TEXTURE_FORMAT_RGB8I         = 45,
		BGFX_TEXTURE_FORMAT_RGB8U         = 46,
		BGFX_TEXTURE_FORMAT_RGB8S         = 47,
		BGFX_TEXTURE_FORMAT_RGB9E5F       = 48,
		BGFX_TEXTURE_FORMAT_BGRA8         = 49,
		BGFX_TEXTURE_FORMAT_RGBA8         = 50,
		BGFX_TEXTURE_FORMAT_RGBA8I        = 51,
		BGFX_TEXTURE_FORMAT_RGBA8U        = 52,
		BGFX_TEXTURE_FORMAT_RGBA8S        = 53,
		BGFX_TEXTURE_FORMAT_RGBA16        = 54,
		BGFX_TEXTURE_FORMAT_RGBA16I       = 55,
		BGFX_TEXTURE_FORMAT_RGBA16U       = 56,
		BGFX_TEXTURE_FORMAT_RGBA16F       = 57,
		BGFX_TEXTURE_FORMAT_RGBA16S       = 58,
		BGFX_TEXTURE_FORMAT_RGBA32I       = 59,
		BGFX_TEXTURE_FORMAT_RGBA32U       = 60,
		BGFX_TEXTURE_FORMAT_RGBA32F       = 61,
		BGFX_TEXTURE_FORMAT_R5G6B5        = 62,
		BGFX_TEXTURE_FORMAT_RGBA4         = 63,
		BGFX_TEXTURE_FORMAT_RGB5A1        = 64,
		BGFX_TEXTURE_FORMAT_RGB10A2       = 65,
		BGFX_TEXTURE_FORMAT_R11G11B10F    = 66,
		BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH = 67,
		BGFX_TEXTURE_FORMAT_D16           = 68,
		BGFX_TEXTURE_FORMAT_D24           = 69,
		BGFX_TEXTURE_FORMAT_D24S8         = 70,
		BGFX_TEXTURE_FORMAT_D32           = 71,
		BGFX_TEXTURE_FORMAT_D16F          = 72,
		BGFX_TEXTURE_FORMAT_D24F          = 73,
		BGFX_TEXTURE_FORMAT_D32F          = 74,
		BGFX_TEXTURE_FORMAT_D0S8          = 75,
		BGFX_TEXTURE_FORMAT_COUNT         = BGFX_TEXTURE_FORMAT_D0S8 + 1;

	/** bgfx_uniform_type_t */
	public static final int
		BGFX_UNIFORM_TYPE_INT1  = 0,
		BGFX_UNIFORM_TYPE_END   = 1,
		BGFX_UNIFORM_TYPE_VEC4  = 2,
		BGFX_UNIFORM_TYPE_MAT3  = 3,
		BGFX_UNIFORM_TYPE_MAT4  = 4,
		BGFX_UNIFORM_TYPE_COUNT = 5;

	/** bgfx_backbuffer_ratio_t */
	public static final int
		BGFX_BACKBUFFER_RATIO_EQUAL     = 0,
		BGFX_BACKBUFFER_RATIO_HALF      = 1,
		BGFX_BACKBUFFER_RATIO_QUARTER   = 2,
		BGFX_BACKBUFFER_RATIO_EIGHTH    = 3,
		BGFX_BACKBUFFER_RATIO_SIXTEENTH = 4,
		BGFX_BACKBUFFER_RATIO_DOUBLE    = 5,
		BGFX_BACKBUFFER_RATIO_COUNT     = 6;

	/** bgfx_occlusion_query_result_t */
	public static final int
		BGFX_OCCLUSION_QUERY_RESULT_INVISIBLE = 0,
		BGFX_OCCLUSION_QUERY_RESULT_VISIBLE   = 1,
		BGFX_OCCLUSION_QUERY_RESULT_NORESULT  = 2,
		BGFX_OCCLUSION_QUERY_RESULT_COUNT     = 3;

	/** bgfx_topology_convert_t */
	public static final int
		BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING   = 0,
		BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST   = 1,
		BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST   = 2,
		BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST = 3,
		BGFX_TOPOLOGY_CONVERT_COUNT                   = 4;

	/** bgfx_topology_sort_t */
	public static final int
		BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN = 0,
		BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG = 1,
		BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX = 2,
		BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN = 3,
		BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG = 4,
		BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX = 5,
		BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN  = 6,
		BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG  = 7,
		BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX  = 8,
		BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN  = 9,
		BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG  = 10,
		BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX  = 11,
		BGFX_TOPOLOGY_SORT_COUNT                       = 12;

	/** bgfx_fatal_t */
	public static final int
		BGFX_FATAL_DEBUG_CHECK              = 0,
		BGFX_FATAL_MINIMUM_REQUIRED_SPECS   = 1,
		BGFX_FATAL_INVALID_SHADER           = 2,
		BGFX_FATAL_UNABLE_TO_INITIALIZE     = 3,
		BGFX_FATAL_UNABLE_TO_CREATE_TEXTURE = 4,
		BGFX_FATAL_DEVICE_LOST              = 5,
		BGFX_FATAL_COUNT                    = 6;

	protected BGFX() {
		throw new UnsupportedOperationException();
	}

	private static final SharedLibrary BGFX = Library.loadNative(Configuration.BGFX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bgfx")));

	/** Contains the function pointers loaded from the bgfx {@link SharedLibrary}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			vertex_decl_begin                            = apiGetFunctionAddress(BGFX, "bgfx_vertex_decl_begin"),
			vertex_decl_add                              = apiGetFunctionAddress(BGFX, "bgfx_vertex_decl_add"),
			vertex_decl_skip                             = apiGetFunctionAddress(BGFX, "bgfx_vertex_decl_skip"),
			vertex_decl_end                              = apiGetFunctionAddress(BGFX, "bgfx_vertex_decl_end"),
			vertex_pack                                  = apiGetFunctionAddress(BGFX, "bgfx_vertex_pack"),
			vertex_unpack                                = apiGetFunctionAddress(BGFX, "bgfx_vertex_unpack"),
			vertex_convert                               = apiGetFunctionAddress(BGFX, "bgfx_vertex_convert"),
			weld_vertices                                = apiGetFunctionAddress(BGFX, "bgfx_weld_vertices"),
			topology_convert                             = apiGetFunctionAddress(BGFX, "bgfx_topology_convert"),
			topology_sort_tri_list                       = apiGetFunctionAddress(BGFX, "bgfx_topology_sort_tri_list"),
			image_swizzle_bgra8                          = apiGetFunctionAddress(BGFX, "bgfx_image_swizzle_bgra8"),
			image_rgba8_downsample_2x2                   = apiGetFunctionAddress(BGFX, "bgfx_image_rgba8_downsample_2x2"),
			get_supported_renderers                      = apiGetFunctionAddress(BGFX, "bgfx_get_supported_renderers"),
			get_renderer_name                            = apiGetFunctionAddress(BGFX, "bgfx_get_renderer_name"),
			init                                         = apiGetFunctionAddress(BGFX, "bgfx_init"),
			shutdown                                     = apiGetFunctionAddress(BGFX, "bgfx_shutdown"),
			reset                                        = apiGetFunctionAddress(BGFX, "bgfx_reset"),
			frame                                        = apiGetFunctionAddress(BGFX, "bgfx_frame"),
			get_renderer_type                            = apiGetFunctionAddress(BGFX, "bgfx_get_renderer_type"),
			get_caps                                     = apiGetFunctionAddress(BGFX, "bgfx_get_caps"),
			get_hmd                                      = apiGetFunctionAddress(BGFX, "bgfx_get_hmd"),
			get_stats                                    = apiGetFunctionAddress(BGFX, "bgfx_get_stats"),
			alloc                                        = apiGetFunctionAddress(BGFX, "bgfx_alloc"),
			copy                                         = apiGetFunctionAddress(BGFX, "bgfx_copy"),
			make_ref                                     = apiGetFunctionAddress(BGFX, "bgfx_make_ref"),
			make_ref_release                             = apiGetFunctionAddress(BGFX, "bgfx_make_ref_release"),
			set_debug                                    = apiGetFunctionAddress(BGFX, "bgfx_set_debug"),
			dbg_text_clear                               = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_clear"),
			dbg_text_printf                              = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_printf"),
			dbg_text_vprintf                             = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_vprintf"),
			dbg_text_image                               = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_image"),
			create_index_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_create_index_buffer"),
			destroy_index_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_destroy_index_buffer"),
			create_vertex_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_create_vertex_buffer"),
			destroy_vertex_buffer                        = apiGetFunctionAddress(BGFX, "bgfx_destroy_vertex_buffer"),
			create_dynamic_index_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_index_buffer"),
			create_dynamic_index_buffer_mem              = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_index_buffer_mem"),
			update_dynamic_index_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_update_dynamic_index_buffer"),
			destroy_dynamic_index_buffer                 = apiGetFunctionAddress(BGFX, "bgfx_destroy_dynamic_index_buffer"),
			create_dynamic_vertex_buffer                 = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_vertex_buffer"),
			create_dynamic_vertex_buffer_mem             = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_vertex_buffer_mem"),
			update_dynamic_vertex_buffer                 = apiGetFunctionAddress(BGFX, "bgfx_update_dynamic_vertex_buffer"),
			destroy_dynamic_vertex_buffer                = apiGetFunctionAddress(BGFX, "bgfx_destroy_dynamic_vertex_buffer"),
			check_avail_transient_index_buffer           = apiGetFunctionAddress(BGFX, "bgfx_check_avail_transient_index_buffer"),
			check_avail_transient_vertex_buffer          = apiGetFunctionAddress(BGFX, "bgfx_check_avail_transient_vertex_buffer"),
			check_avail_instance_data_buffer             = apiGetFunctionAddress(BGFX, "bgfx_check_avail_instance_data_buffer"),
			check_avail_transient_buffers                = apiGetFunctionAddress(BGFX, "bgfx_check_avail_transient_buffers"),
			alloc_transient_index_buffer                 = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_index_buffer"),
			alloc_transient_vertex_buffer                = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_vertex_buffer"),
			alloc_transient_buffers                      = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_buffers"),
			alloc_instance_data_buffer                   = apiGetFunctionAddress(BGFX, "bgfx_alloc_instance_data_buffer"),
			create_indirect_buffer                       = apiGetFunctionAddress(BGFX, "bgfx_create_indirect_buffer"),
			destroy_indirect_buffer                      = apiGetFunctionAddress(BGFX, "bgfx_destroy_indirect_buffer"),
			create_shader                                = apiGetFunctionAddress(BGFX, "bgfx_create_shader"),
			get_shader_uniforms                          = apiGetFunctionAddress(BGFX, "bgfx_get_shader_uniforms"),
			destroy_shader                               = apiGetFunctionAddress(BGFX, "bgfx_destroy_shader"),
			create_program                               = apiGetFunctionAddress(BGFX, "bgfx_create_program"),
			create_compute_program                       = apiGetFunctionAddress(BGFX, "bgfx_create_compute_program"),
			destroy_program                              = apiGetFunctionAddress(BGFX, "bgfx_destroy_program"),
			calc_texture_size                            = apiGetFunctionAddress(BGFX, "bgfx_calc_texture_size"),
			create_texture                               = apiGetFunctionAddress(BGFX, "bgfx_create_texture"),
			create_texture_2d                            = apiGetFunctionAddress(BGFX, "bgfx_create_texture_2d"),
			create_texture_2d_scaled                     = apiGetFunctionAddress(BGFX, "bgfx_create_texture_2d_scaled"),
			create_texture_3d                            = apiGetFunctionAddress(BGFX, "bgfx_create_texture_3d"),
			create_texture_cube                          = apiGetFunctionAddress(BGFX, "bgfx_create_texture_cube"),
			update_texture_2d                            = apiGetFunctionAddress(BGFX, "bgfx_update_texture_2d"),
			update_texture_3d                            = apiGetFunctionAddress(BGFX, "bgfx_update_texture_3d"),
			update_texture_cube                          = apiGetFunctionAddress(BGFX, "bgfx_update_texture_cube"),
			read_texture                                 = apiGetFunctionAddress(BGFX, "bgfx_read_texture"),
			read_frame_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_read_frame_buffer"),
			destroy_texture                              = apiGetFunctionAddress(BGFX, "bgfx_destroy_texture"),
			create_frame_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer"),
			create_frame_buffer_scaled                   = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_scaled"),
			create_frame_buffer_from_handles             = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_handles"),
			create_frame_buffer_from_attachment          = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_attachment"),
			create_frame_buffer_from_nwh                 = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_nwh"),
			destroy_frame_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_destroy_frame_buffer"),
			create_uniform                               = apiGetFunctionAddress(BGFX, "bgfx_create_uniform"),
			destroy_uniform                              = apiGetFunctionAddress(BGFX, "bgfx_destroy_uniform"),
			create_occlusion_query                       = apiGetFunctionAddress(BGFX, "bgfx_create_occlusion_query"),
			get_result                                   = apiGetFunctionAddress(BGFX, "bgfx_get_result"),
			destroy_occlusion_query                      = apiGetFunctionAddress(BGFX, "bgfx_destroy_occlusion_query"),
			set_palette_color                            = apiGetFunctionAddress(BGFX, "bgfx_set_palette_color"),
			set_view_name                                = apiGetFunctionAddress(BGFX, "bgfx_set_view_name"),
			set_view_rect                                = apiGetFunctionAddress(BGFX, "bgfx_set_view_rect"),
			set_view_rect_auto                           = apiGetFunctionAddress(BGFX, "bgfx_set_view_rect_auto"),
			set_view_scissor                             = apiGetFunctionAddress(BGFX, "bgfx_set_view_scissor"),
			set_view_clear                               = apiGetFunctionAddress(BGFX, "bgfx_set_view_clear"),
			set_view_clear_mrt                           = apiGetFunctionAddress(BGFX, "bgfx_set_view_clear_mrt"),
			set_view_seq                                 = apiGetFunctionAddress(BGFX, "bgfx_set_view_seq"),
			set_view_frame_buffer                        = apiGetFunctionAddress(BGFX, "bgfx_set_view_frame_buffer"),
			set_view_transform                           = apiGetFunctionAddress(BGFX, "bgfx_set_view_transform"),
			set_view_transform_stereo                    = apiGetFunctionAddress(BGFX, "bgfx_set_view_transform_stereo"),
			set_view_remap                               = apiGetFunctionAddress(BGFX, "bgfx_set_view_remap"),
			reset_view                                   = apiGetFunctionAddress(BGFX, "bgfx_reset_view"),
			set_marker                                   = apiGetFunctionAddress(BGFX, "bgfx_set_marker"),
			set_state                                    = apiGetFunctionAddress(BGFX, "bgfx_set_state"),
			set_condition                                = apiGetFunctionAddress(BGFX, "bgfx_set_condition"),
			set_stencil                                  = apiGetFunctionAddress(BGFX, "bgfx_set_stencil"),
			set_scissor                                  = apiGetFunctionAddress(BGFX, "bgfx_set_scissor"),
			set_scissor_cached                           = apiGetFunctionAddress(BGFX, "bgfx_set_scissor_cached"),
			set_transform                                = apiGetFunctionAddress(BGFX, "bgfx_set_transform"),
			alloc_transform                              = apiGetFunctionAddress(BGFX, "bgfx_alloc_transform"),
			set_transform_cached                         = apiGetFunctionAddress(BGFX, "bgfx_set_transform_cached"),
			set_uniform                                  = apiGetFunctionAddress(BGFX, "bgfx_set_uniform"),
			set_index_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_set_index_buffer"),
			set_dynamic_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_set_dynamic_index_buffer"),
			set_transient_index_buffer                   = apiGetFunctionAddress(BGFX, "bgfx_set_transient_index_buffer"),
			set_vertex_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_set_vertex_buffer"),
			set_dynamic_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_set_dynamic_vertex_buffer"),
			set_transient_vertex_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_set_transient_vertex_buffer"),
			set_instance_data_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_buffer"),
			set_instance_data_from_vertex_buffer         = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_from_vertex_buffer"),
			set_instance_data_from_dynamic_vertex_buffer = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_from_dynamic_vertex_buffer"),
			set_texture                                  = apiGetFunctionAddress(BGFX, "bgfx_set_texture"),
			set_texture_from_frame_buffer                = apiGetFunctionAddress(BGFX, "bgfx_set_texture_from_frame_buffer"),
			touch                                        = apiGetFunctionAddress(BGFX, "bgfx_touch"),
			submit                                       = apiGetFunctionAddress(BGFX, "bgfx_submit"),
			submit_occlusion_query                       = apiGetFunctionAddress(BGFX, "bgfx_submit_occlusion_query"),
			submit_indirect                              = apiGetFunctionAddress(BGFX, "bgfx_submit_indirect"),
			set_image                                    = apiGetFunctionAddress(BGFX, "bgfx_set_image"),
			set_image_from_frame_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_set_image_from_frame_buffer"),
			set_compute_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_set_compute_index_buffer"),
			set_compute_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_set_compute_vertex_buffer"),
			set_compute_dynamic_index_buffer             = apiGetFunctionAddress(BGFX, "bgfx_set_compute_dynamic_index_buffer"),
			set_compute_dynamic_vertex_buffer            = apiGetFunctionAddress(BGFX, "bgfx_set_compute_dynamic_vertex_buffer"),
			set_compute_indirect_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_set_compute_indirect_buffer"),
			dispatch                                     = apiGetFunctionAddress(BGFX, "bgfx_dispatch"),
			dispatch_indirect                            = apiGetFunctionAddress(BGFX, "bgfx_dispatch_indirect"),
			discard                                      = apiGetFunctionAddress(BGFX, "bgfx_discard"),
			blit                                         = apiGetFunctionAddress(BGFX, "bgfx_blit"),
			blit_frame_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_blit_frame_buffer"),
			save_screen_shot                             = apiGetFunctionAddress(BGFX, "bgfx_save_screen_shot"),
			set_platform_data                            = apiGetFunctionAddress(BGFX, "bgfx_set_platform_data");

	}

	/** Returns the bgfx {@link SharedLibrary}. */
	public static SharedLibrary getLibrary() {
		return BGFX;
	}

	// --- [ bgfx_vertex_decl_begin ] ---

	/**
	 * Start a vertex declaration.
	 *
	 * @param _decl     the vertex declaration
	 * @param _renderer the renderer type. One of:<br><table><tr><td>{@link #BGFX_RENDERER_TYPE_NULL RENDERER_TYPE_NULL}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td><td>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td><td>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table>
	 */
	public static void nbgfx_vertex_decl_begin(long _decl, int _renderer) {
		long __functionAddress = Functions.vertex_decl_begin;
		invokePV(__functionAddress, _decl, _renderer);
	}

	/**
	 * Start a vertex declaration.
	 *
	 * @param _decl     the vertex declaration
	 * @param _renderer the renderer type. One of:<br><table><tr><td>{@link #BGFX_RENDERER_TYPE_NULL RENDERER_TYPE_NULL}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td><td>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td><td>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table>
	 */
	public static void bgfx_vertex_decl_begin(BGFXVertexDecl _decl, int _renderer) {
		nbgfx_vertex_decl_begin(_decl.address(), _renderer);
	}

	// --- [ bgfx_vertex_decl_add ] ---

	/**
	 * Adds attribute to a vertex declaration.
	 * 
	 * <p>Must be called between {@link #bgfx_vertex_decl_begin vertex_decl_begin}/{@link #bgfx_vertex_decl_end vertex_decl_end}.</p>
	 *
	 * @param _decl       the vertex declaration
	 * @param _attrib     attribute semantics. One of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
	 * @param _num        number of elements. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param _type       element type. One of:<br><table><tr><td>{@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8}</td><td>{@link #BGFX_ATTRIB_TYPE_UINT10 ATTRIB_TYPE_UINT10}</td><td>{@link #BGFX_ATTRIB_TYPE_INT16 ATTRIB_TYPE_INT16}</td><td>{@link #BGFX_ATTRIB_TYPE_HALF ATTRIB_TYPE_HALF}</td></tr><tr><td>{@link #BGFX_ATTRIB_TYPE_FLOAT ATTRIB_TYPE_FLOAT}</td><td>{@link #BGFX_ATTRIB_TYPE_COUNT ATTRIB_TYPE_COUNT}</td></tr></table>
	 * @param _normalized when using fixed point attribute type (f.e. {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8}) value will be normalized for vertex shader usage. When {@code normalized} is set to
	 *                    true, {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8} value in range 0-255 will be in range 0.0-1.0 in vertex shader.
	 * @param _asInt      packaging rule for {@code vertexPack}, {@code vertexUnpack}, and {@code vertexConvert} for {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8} and {@link #BGFX_ATTRIB_TYPE_INT16 ATTRIB_TYPE_INT16}. Unpacking
	 *                    code must be implemented inside vertex shader.
	 */
	public static void nbgfx_vertex_decl_add(long _decl, int _attrib, byte _num, int _type, boolean _normalized, boolean _asInt) {
		long __functionAddress = Functions.vertex_decl_add;
		invokePV(__functionAddress, _decl, _attrib, _num, _type, _normalized, _asInt);
	}

	/**
	 * Adds attribute to a vertex declaration.
	 * 
	 * <p>Must be called between {@link #bgfx_vertex_decl_begin vertex_decl_begin}/{@link #bgfx_vertex_decl_end vertex_decl_end}.</p>
	 *
	 * @param _decl       the vertex declaration
	 * @param _attrib     attribute semantics. One of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
	 * @param _num        number of elements. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param _type       element type. One of:<br><table><tr><td>{@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8}</td><td>{@link #BGFX_ATTRIB_TYPE_UINT10 ATTRIB_TYPE_UINT10}</td><td>{@link #BGFX_ATTRIB_TYPE_INT16 ATTRIB_TYPE_INT16}</td><td>{@link #BGFX_ATTRIB_TYPE_HALF ATTRIB_TYPE_HALF}</td></tr><tr><td>{@link #BGFX_ATTRIB_TYPE_FLOAT ATTRIB_TYPE_FLOAT}</td><td>{@link #BGFX_ATTRIB_TYPE_COUNT ATTRIB_TYPE_COUNT}</td></tr></table>
	 * @param _normalized when using fixed point attribute type (f.e. {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8}) value will be normalized for vertex shader usage. When {@code normalized} is set to
	 *                    true, {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8} value in range 0-255 will be in range 0.0-1.0 in vertex shader.
	 * @param _asInt      packaging rule for {@code vertexPack}, {@code vertexUnpack}, and {@code vertexConvert} for {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8} and {@link #BGFX_ATTRIB_TYPE_INT16 ATTRIB_TYPE_INT16}. Unpacking
	 *                    code must be implemented inside vertex shader.
	 */
	public static void bgfx_vertex_decl_add(BGFXVertexDecl _decl, int _attrib, int _num, int _type, boolean _normalized, boolean _asInt) {
		nbgfx_vertex_decl_add(_decl.address(), _attrib, (byte)(_num & 0xFF), _type, _normalized, _asInt);
	}

	// --- [ bgfx_vertex_decl_skip ] ---

	/**
	 * Skips {@code _num} bytes in vertex stream.
	 *
	 * @param _decl the vertex declaration
	 * @param _num  the number of bytes to skip
	 */
	public static void nbgfx_vertex_decl_skip(long _decl, byte _num) {
		long __functionAddress = Functions.vertex_decl_skip;
		invokePV(__functionAddress, _decl, _num);
	}

	/**
	 * Skips {@code _num} bytes in vertex stream.
	 *
	 * @param _decl the vertex declaration
	 * @param _num  the number of bytes to skip
	 */
	public static void bgfx_vertex_decl_skip(BGFXVertexDecl _decl, int _num) {
		nbgfx_vertex_decl_skip(_decl.address(), (byte)(_num & 0xFF));
	}

	// --- [ bgfx_vertex_decl_end ] ---

	/**
	 * Ends a vertex declaration.
	 *
	 * @param _decl the vertex declaration
	 */
	public static void nbgfx_vertex_decl_end(long _decl) {
		long __functionAddress = Functions.vertex_decl_end;
		invokePV(__functionAddress, _decl);
	}

	/**
	 * Ends a vertex declaration.
	 *
	 * @param _decl the vertex declaration
	 */
	public static void bgfx_vertex_decl_end(BGFXVertexDecl _decl) {
		nbgfx_vertex_decl_end(_decl.address());
	}

	// --- [ bgfx_vertex_pack ] ---

	/**
	 * Packs {@code vec4} into vertex stream format.
	 *
	 * @param _input           
	 * @param _inputNormalized 
	 * @param _attr            one of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
	 * @param _decl            
	 * @param _data            
	 * @param _index           
	 */
	public static void nbgfx_vertex_pack(long _input, boolean _inputNormalized, int _attr, long _decl, long _data, int _index) {
		long __functionAddress = Functions.vertex_pack;
		invokePPPV(__functionAddress, _input, _inputNormalized, _attr, _decl, _data, _index);
	}

	/**
	 * Packs {@code vec4} into vertex stream format.
	 *
	 * @param _input           
	 * @param _inputNormalized 
	 * @param _attr            one of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
	 * @param _decl            
	 * @param _data            
	 * @param _index           
	 */
	public static void bgfx_vertex_pack(FloatBuffer _input, boolean _inputNormalized, int _attr, BGFXVertexDecl _decl, ByteBuffer _data, int _index) {
		if ( CHECKS )
			checkBuffer(_input, 4);
		nbgfx_vertex_pack(memAddress(_input), _inputNormalized, _attr, _decl.address(), memAddress(_data), _index);
	}

	// --- [ bgfx_vertex_unpack ] ---

	/**
	 * Unpacks {@code vec4} from vertex stream format.
	 *
	 * @param _output 
	 * @param _attr   one of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
	 * @param _decl   
	 * @param _data   
	 * @param _index  
	 */
	public static void nbgfx_vertex_unpack(long _output, int _attr, long _decl, long _data, int _index) {
		long __functionAddress = Functions.vertex_unpack;
		invokePPPV(__functionAddress, _output, _attr, _decl, _data, _index);
	}

	/**
	 * Unpacks {@code vec4} from vertex stream format.
	 *
	 * @param _output 
	 * @param _attr   one of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
	 * @param _decl   
	 * @param _data   
	 * @param _index  
	 */
	public static void bgfx_vertex_unpack(FloatBuffer _output, int _attr, BGFXVertexDecl _decl, ByteBuffer _data, int _index) {
		if ( CHECKS )
			checkBuffer(_output, 4);
		nbgfx_vertex_unpack(memAddress(_output), _attr, _decl.address(), memAddress(_data), _index);
	}

	// --- [ bgfx_vertex_convert ] ---

	/**
	 * Converts vertex stream data from one vertex stream format to another.
	 *
	 * @param _destDecl destination vertex stream declaration
	 * @param _destData destination vertex stream
	 * @param _srcDecl  source vertex stream declaration
	 * @param _srcData  source vertex stream data
	 * @param _num      number of vertices to convert from source to destination
	 */
	public static void nbgfx_vertex_convert(long _destDecl, long _destData, long _srcDecl, long _srcData, int _num) {
		long __functionAddress = Functions.vertex_convert;
		invokePPPPV(__functionAddress, _destDecl, _destData, _srcDecl, _srcData, _num);
	}

	/**
	 * Converts vertex stream data from one vertex stream format to another.
	 *
	 * @param _destDecl destination vertex stream declaration
	 * @param _destData destination vertex stream
	 * @param _srcDecl  source vertex stream declaration
	 * @param _srcData  source vertex stream data
	 * @param _num      number of vertices to convert from source to destination
	 */
	public static void bgfx_vertex_convert(BGFXVertexDecl _destDecl, ByteBuffer _destData, BGFXVertexDecl _srcDecl, ByteBuffer _srcData, int _num) {
		nbgfx_vertex_convert(_destDecl.address(), memAddress(_destData), _srcDecl.address(), memAddress(_srcData), _num);
	}

	// --- [ bgfx_weld_vertices ] ---

	/**
	 * Welds vertices.
	 *
	 * @param _output  welded vertices remapping table. The size of buffer be the same as number of vertices.
	 * @param _decl    vertex stream declaration
	 * @param _data    vertex stream
	 * @param _num     number of vertices in vertex stream
	 * @param _epsilon error tolerance for vertex position comparison
	 *
	 * @return number of unique vertices after vertex welding
	 */
	public static short nbgfx_weld_vertices(long _output, long _decl, long _data, short _num, float _epsilon) {
		long __functionAddress = Functions.weld_vertices;
		return invokePPPS(__functionAddress, _output, _decl, _data, _num, _epsilon);
	}

	/**
	 * Welds vertices.
	 *
	 * @param _output  welded vertices remapping table. The size of buffer be the same as number of vertices.
	 * @param _decl    vertex stream declaration
	 * @param _data    vertex stream
	 * @param _epsilon error tolerance for vertex position comparison
	 *
	 * @return number of unique vertices after vertex welding
	 */
	public static short bgfx_weld_vertices(ShortBuffer _output, BGFXVertexDecl _decl, ByteBuffer _data, float _epsilon) {
		return nbgfx_weld_vertices(memAddress(_output), _decl.address(), memAddress(_data), (short)_output.remaining(), _epsilon);
	}

	// --- [ bgfx_topology_convert ] ---

	/**
	 * Converts index buffer for use with different primitive topologies.
	 *
	 * @param _conversion conversion type. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST}</td></tr></table>
	 * @param _dst        destination index buffer. If this argument it {@code NULL} function will return number of indices after conversion
	 * @param _dstSize    destination index buffer in bytes. It must be large enough to contain output indices. If destination size is insufficient index buffer will be
	 *                    truncated.
	 * @param _indices    source indices
	 * @param _numIndices number of input indices
	 * @param _index32    set to `true` if input indices are 32-bit
	 *
	 * @return number of output indices after conversion
	 */
	public static int nbgfx_topology_convert(int _conversion, long _dst, int _dstSize, long _indices, int _numIndices, boolean _index32) {
		long __functionAddress = Functions.topology_convert;
		return invokePPI(__functionAddress, _conversion, _dst, _dstSize, _indices, _numIndices, _index32);
	}

	/**
	 * Converts index buffer for use with different primitive topologies.
	 *
	 * @param _conversion conversion type. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST}</td></tr></table>
	 * @param _dst        destination index buffer. If this argument it {@code NULL} function will return number of indices after conversion
	 * @param _indices    source indices
	 * @param _index32    set to `true` if input indices are 32-bit
	 *
	 * @return number of output indices after conversion
	 */
	public static int bgfx_topology_convert(int _conversion, ByteBuffer _dst, ByteBuffer _indices, boolean _index32) {
		return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), _dst == null ? 0 : _dst.remaining(), memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32);
	}

	/** ShortBuffer version of: {@link #bgfx_topology_convert topology_convert} */
	public static int bgfx_topology_convert(int _conversion, ByteBuffer _dst, ShortBuffer _indices, boolean _index32) {
		return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), _dst == null ? 0 : _dst.remaining(), memAddress(_indices), _indices.remaining(), _index32);
	}

	/** IntBuffer version of: {@link #bgfx_topology_convert topology_convert} */
	public static int bgfx_topology_convert(int _conversion, ByteBuffer _dst, IntBuffer _indices, boolean _index32) {
		return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), _dst == null ? 0 : _dst.remaining(), memAddress(_indices), _indices.remaining(), _index32);
	}

	// --- [ bgfx_topology_sort_tri_list ] ---

	/**
	 * Sorts indices.
	 *
	 * @param _sort       sort order. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX}</td></tr></table>
	 * @param _dst        destination index buffer
	 * @param _dstSize    destination index buffer in bytes. It must be large enough to contain output indices. If destination size is insufficient index buffer will be
	 *                    truncated.
	 * @param _dir        direction (vector must be normalized)
	 * @param _pos        position
	 * @param _vertices   pointer to first vertex represented as float x, y, z. Must contain at least number of vertices referenced by index buffer.
	 * @param _stride     vertex stride
	 * @param _indices    source indices
	 * @param _numIndices number of input indices
	 * @param _index32    set to `true` if input indices are 32-bit
	 */
	public static void nbgfx_topology_sort_tri_list(int _sort, long _dst, int _dstSize, long _dir, long _pos, long _vertices, int _stride, long _indices, int _numIndices, boolean _index32) {
		long __functionAddress = Functions.topology_sort_tri_list;
		invokePPPPPV(__functionAddress, _sort, _dst, _dstSize, _dir, _pos, _vertices, _stride, _indices, _numIndices, _index32);
	}

	/**
	 * Sorts indices.
	 *
	 * @param _sort     sort order. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX}</td></tr></table>
	 * @param _dst      destination index buffer
	 * @param _dir      direction (vector must be normalized)
	 * @param _pos      position
	 * @param _vertices pointer to first vertex represented as float x, y, z. Must contain at least number of vertices referenced by index buffer.
	 * @param _stride   vertex stride
	 * @param _indices  source indices
	 * @param _index32  set to `true` if input indices are 32-bit
	 */
	public static void bgfx_topology_sort_tri_list(int _sort, ByteBuffer _dst, FloatBuffer _dir, FloatBuffer _pos, ByteBuffer _vertices, int _stride, ByteBuffer _indices, boolean _index32) {
		if ( CHECKS ) {
			checkBuffer(_dir, 3);
			checkBuffer(_pos, 3);
		}
		nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining(), memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32);
	}

	/** ShortBuffer version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list} */
	public static void bgfx_topology_sort_tri_list(int _sort, ByteBuffer _dst, FloatBuffer _dir, FloatBuffer _pos, ByteBuffer _vertices, int _stride, ShortBuffer _indices, boolean _index32) {
		if ( CHECKS ) {
			checkBuffer(_dir, 3);
			checkBuffer(_pos, 3);
		}
		nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining(), memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), _indices.remaining(), _index32);
	}

	/** IntBuffer version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list} */
	public static void bgfx_topology_sort_tri_list(int _sort, ByteBuffer _dst, FloatBuffer _dir, FloatBuffer _pos, ByteBuffer _vertices, int _stride, IntBuffer _indices, boolean _index32) {
		if ( CHECKS ) {
			checkBuffer(_dir, 3);
			checkBuffer(_pos, 3);
		}
		nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining(), memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), _indices.remaining(), _index32);
	}

	// --- [ bgfx_image_swizzle_bgra8 ] ---

	/**
	 * Swizzles RGBA8 image to BGRA8.
	 *
	 * @param _width  width of input image (pixels)
	 * @param _height height of input image (pixels)
	 * @param _pitch  pitch of input image (bytes)
	 * @param _src    source image
	 * @param _dst    destination image. Must be the same size as input image. {@code _dst} might be pointer to the same memory as {@code _src}.
	 */
	public static void nbgfx_image_swizzle_bgra8(int _width, int _height, int _pitch, long _src, long _dst) {
		long __functionAddress = Functions.image_swizzle_bgra8;
		invokePPV(__functionAddress, _width, _height, _pitch, _src, _dst);
	}

	/**
	 * Swizzles RGBA8 image to BGRA8.
	 *
	 * @param _width  width of input image (pixels)
	 * @param _height height of input image (pixels)
	 * @param _pitch  pitch of input image (bytes)
	 * @param _src    source image
	 * @param _dst    destination image. Must be the same size as input image. {@code _dst} might be pointer to the same memory as {@code _src}.
	 */
	public static void bgfx_image_swizzle_bgra8(int _width, int _height, int _pitch, ByteBuffer _src, ByteBuffer _dst) {
		int bytes = _height * _pitch * 4;
		if ( CHECKS ) {
			checkBuffer(_src, bytes);
			checkBuffer(_dst, bytes);
		}
		nbgfx_image_swizzle_bgra8(_width, _height, _pitch, memAddress(_src), memAddress(_dst));
	}

	// --- [ bgfx_image_rgba8_downsample_2x2 ] ---

	/**
	 * Downsamples RGBA8 image with 2x2 pixel average filter.
	 *
	 * @param _width  width of input image (pixels)
	 * @param _height height of input image (pixels)
	 * @param _pitch  pitch of input image (bytes)
	 * @param _src    source image
	 * @param _dst    destination image. Must be at least quarter size of input image. {@code _dst} might be pointer to the same memory as {@code _src}.
	 */
	public static void nbgfx_image_rgba8_downsample_2x2(int _width, int _height, int _pitch, long _src, long _dst) {
		long __functionAddress = Functions.image_rgba8_downsample_2x2;
		invokePPV(__functionAddress, _width, _height, _pitch, _src, _dst);
	}

	/**
	 * Downsamples RGBA8 image with 2x2 pixel average filter.
	 *
	 * @param _width  width of input image (pixels)
	 * @param _height height of input image (pixels)
	 * @param _pitch  pitch of input image (bytes)
	 * @param _src    source image
	 * @param _dst    destination image. Must be at least quarter size of input image. {@code _dst} might be pointer to the same memory as {@code _src}.
	 */
	public static void bgfx_image_rgba8_downsample_2x2(int _width, int _height, int _pitch, ByteBuffer _src, ByteBuffer _dst) {
		int bytes = _height * _pitch * 4;
		if ( CHECKS ) {
			checkBuffer(_src, bytes);
			checkBuffer(_dst, bytes >> 2);
		}
		nbgfx_image_rgba8_downsample_2x2(_width, _height, _pitch, memAddress(_src), memAddress(_dst));
	}

	// --- [ bgfx_get_supported_renderers ] ---

	/**
	 * Returns supported backend API renderers.
	 *
	 * @param _enum pointer to an array of {@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT} renderer types
	 *
	 * @return the number of renderers written to {@code _enum}
	 */
	public static byte nbgfx_get_supported_renderers(long _enum) {
		long __functionAddress = Functions.get_supported_renderers;
		return invokePB(__functionAddress, _enum);
	}

	/**
	 * Returns supported backend API renderers.
	 *
	 * @param _enum pointer to an array of {@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT} renderer types
	 *
	 * @return the number of renderers written to {@code _enum}
	 */
	public static byte bgfx_get_supported_renderers(IntBuffer _enum) {
		if ( CHECKS )
			checkBuffer(_enum, BGFX_RENDERER_TYPE_COUNT);
		return nbgfx_get_supported_renderers(memAddress(_enum));
	}

	// --- [ bgfx_get_renderer_name ] ---

	/**
	 * Returns name of renderer.
	 *
	 * @param _type the renderer type. One of:<br><table><tr><td>{@link #BGFX_RENDERER_TYPE_NULL RENDERER_TYPE_NULL}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td><td>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td><td>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table>
	 */
	public static long nbgfx_get_renderer_name(int _type) {
		long __functionAddress = Functions.get_renderer_name;
		return invokeP(__functionAddress, _type);
	}

	/**
	 * Returns name of renderer.
	 *
	 * @param _type the renderer type. One of:<br><table><tr><td>{@link #BGFX_RENDERER_TYPE_NULL RENDERER_TYPE_NULL}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td><td>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td><td>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table>
	 */
	public static String bgfx_get_renderer_name(int _type) {
		long __result = nbgfx_get_renderer_name(_type);
		return memASCII(__result);
	}

	// --- [ bgfx_init ] ---

	/**
	 * Initializes bgfx library.
	 *
	 * @param _type      select rendering backend. When set to {@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}, default rendering backend will be selected. One of:<br><table><tr><td>{@link #BGFX_RENDERER_TYPE_NULL RENDERER_TYPE_NULL}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td><td>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td><td>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table>
	 * @param _vendorId  vendor PCI id. If set to {@link #BGFX_PCI_ID_NONE PCI_ID_NONE} it will select the first device.
	 * @param _deviceId  device id. If set to 0 it will select first device, or device with matching id.
	 * @param _callback  provide application specific callback interface
	 * @param _allocator custom allocator. When custom allocator is not specified, library uses default CRT allocator. The library assumes custom allocator is thread safe.
	 *
	 * @return `true` if initialization was successful
	 */
	public static boolean nbgfx_init(int _type, short _vendorId, short _deviceId, long _callback, long _allocator) {
		long __functionAddress = Functions.init;
		if ( CHECKS ) {
			if ( _callback != NULL ) BGFXCallbackInterface.validate(_callback);
			if ( _allocator != NULL ) BGFXAllocatorInterface.validate(_allocator);
		}
		return invokePPZ(__functionAddress, _type, _vendorId, _deviceId, _callback, _allocator);
	}

	/**
	 * Initializes bgfx library.
	 *
	 * @param _type      select rendering backend. When set to {@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}, default rendering backend will be selected. One of:<br><table><tr><td>{@link #BGFX_RENDERER_TYPE_NULL RENDERER_TYPE_NULL}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td><td>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td><td>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table>
	 * @param _vendorId  vendor PCI id. If set to {@link #BGFX_PCI_ID_NONE PCI_ID_NONE} it will select the first device.
	 * @param _deviceId  device id. If set to 0 it will select first device, or device with matching id.
	 * @param _callback  provide application specific callback interface
	 * @param _allocator custom allocator. When custom allocator is not specified, library uses default CRT allocator. The library assumes custom allocator is thread safe.
	 *
	 * @return `true` if initialization was successful
	 */
	public static boolean bgfx_init(int _type, int _vendorId, int _deviceId, BGFXCallbackInterface _callback, BGFXAllocatorInterface _allocator) {
		return nbgfx_init(_type, (short)(_vendorId & 0xFFFF), (short)(_deviceId & 0xFFFF), _callback == null ? NULL : _callback.address(), _allocator == null ? NULL : _allocator.address());
	}

	// --- [ bgfx_shutdown ] ---

	/** Shuts down bgfx library. */
	public static void bgfx_shutdown() {
		long __functionAddress = Functions.shutdown;
		invokeV(__functionAddress);
	}

	// --- [ bgfx_reset ] ---

	/**
	 * Resets graphic settings and back-buffer size.
	 * 
	 * <p>This call doesn't actually change window size, it just resizes back-buffer. Windowing code has to change window size.</p>
	 *
	 * @param _width  back-buffer width
	 * @param _height back-buffer height
	 * @param _flags  reset flags. One or more of:<br><table><tr><td>{@link #BGFX_RESET_NONE RESET_NONE}</td><td>{@link #BGFX_RESET_FULLSCREEN RESET_FULLSCREEN}</td><td>{@link #BGFX_RESET_FULLSCREEN_SHIFT RESET_FULLSCREEN_SHIFT}</td><td>{@link #BGFX_RESET_FULLSCREEN_MASK RESET_FULLSCREEN_MASK}</td><td>{@link #BGFX_RESET_MSAA_X2 RESET_MSAA_X2}</td></tr><tr><td>{@link #BGFX_RESET_MSAA_X4 RESET_MSAA_X4}</td><td>{@link #BGFX_RESET_MSAA_X8 RESET_MSAA_X8}</td><td>{@link #BGFX_RESET_MSAA_X16 RESET_MSAA_X16}</td><td>{@link #BGFX_RESET_MSAA_SHIFT RESET_MSAA_SHIFT}</td><td>{@link #BGFX_RESET_MSAA_MASK RESET_MSAA_MASK}</td></tr><tr><td>{@link #BGFX_RESET_VSYNC RESET_VSYNC}</td><td>{@link #BGFX_RESET_MAXANISOTROPY RESET_MAXANISOTROPY}</td><td>{@link #BGFX_RESET_CAPTURE RESET_CAPTURE}</td><td>{@link #BGFX_RESET_HMD RESET_HMD}</td><td>{@link #BGFX_RESET_HMD_DEBUG RESET_HMD_DEBUG}</td></tr><tr><td>{@link #BGFX_RESET_HMD_RECENTER RESET_HMD_RECENTER}</td><td>{@link #BGFX_RESET_FLUSH_AFTER_RENDER RESET_FLUSH_AFTER_RENDER}</td><td>{@link #BGFX_RESET_FLIP_AFTER_RENDER RESET_FLIP_AFTER_RENDER}</td><td>{@link #BGFX_RESET_SRGB_BACKBUFFER RESET_SRGB_BACKBUFFER}</td><td>{@link #BGFX_RESET_HIDPI RESET_HIDPI}</td></tr><tr><td>{@link #BGFX_RESET_DEPTH_CLAMP RESET_DEPTH_CLAMP}</td><td>{@link #BGFX_RESET_SUSPEND RESET_SUSPEND}</td></tr></table>
	 */
	public static void bgfx_reset(int _width, int _height, int _flags) {
		long __functionAddress = Functions.reset;
		invokeV(__functionAddress, _width, _height, _flags);
	}

	// --- [ bgfx_frame ] ---

	/**
	 * Advances to next frame. When using multithreaded renderer, this call just swaps internal buffers, kicks render thread, and returns. In singlethreaded
	 * renderer this call does frame rendering.
	 *
	 * @param _capture capture frame with graphics debugger
	 *
	 * @return current frame number. This might be used in conjunction with double/multi buffering data outside the library and passing it to library {@link #bgfx_make_ref make_ref}
	 *         calls.
	 */
	public static int bgfx_frame(boolean _capture) {
		long __functionAddress = Functions.frame;
		return invokeI(__functionAddress, _capture);
	}

	// --- [ bgfx_get_renderer_type ] ---

	/** Returns current renderer backend API type. */
	public static int bgfx_get_renderer_type() {
		long __functionAddress = Functions.get_renderer_type;
		return invokeI(__functionAddress);
	}

	// --- [ bgfx_get_caps ] ---

	/** Returns renderer capabilities. */
	public static long nbgfx_get_caps() {
		long __functionAddress = Functions.get_caps;
		return invokeP(__functionAddress);
	}

	/** Returns renderer capabilities. */
	public static BGFXCaps bgfx_get_caps() {
		long __result = nbgfx_get_caps();
		return BGFXCaps.create(__result);
	}

	// --- [ bgfx_get_hmd ] ---

	/** Returns HMD info. */
	public static long nbgfx_get_hmd() {
		long __functionAddress = Functions.get_hmd;
		return invokeP(__functionAddress);
	}

	/** Returns HMD info. */
	public static BGFXHmd bgfx_get_hmd() {
		long __result = nbgfx_get_hmd();
		return BGFXHmd.create(__result);
	}

	// --- [ bgfx_get_stats ] ---

	/** Returns performance counters. */
	public static long nbgfx_get_stats() {
		long __functionAddress = Functions.get_stats;
		return invokeP(__functionAddress);
	}

	/** Returns performance counters. */
	public static BGFXStats bgfx_get_stats() {
		long __result = nbgfx_get_stats();
		return BGFXStats.create(__result);
	}

	// --- [ bgfx_alloc ] ---

	/**
	 * Allocates buffer to pass to bgfx calls. Data will be freed inside bgfx.
	 *
	 * @param _size the number of bytes to allocate
	 */
	public static long nbgfx_alloc(int _size) {
		long __functionAddress = Functions.alloc;
		return invokeP(__functionAddress, _size);
	}

	/**
	 * Allocates buffer to pass to bgfx calls. Data will be freed inside bgfx.
	 *
	 * @param _size the number of bytes to allocate
	 */
	public static BGFXMemory bgfx_alloc(int _size) {
		long __result = nbgfx_alloc(_size);
		return BGFXMemory.create(__result);
	}

	// --- [ bgfx_copy ] ---

	/**
	 * Allocates buffer and copies data into it. Data will be freed inside bgfx.
	 *
	 * @param _data the source data
	 * @param _size the number of bytes to copy
	 */
	public static long nbgfx_copy(long _data, int _size) {
		long __functionAddress = Functions.copy;
		return invokePP(__functionAddress, _data, _size);
	}

	/**
	 * Allocates buffer and copies data into it. Data will be freed inside bgfx.
	 *
	 * @param _data the source data
	 */
	public static BGFXMemory bgfx_copy(ByteBuffer _data) {
		long __result = nbgfx_copy(memAddress(_data), _data.remaining());
		return BGFXMemory.create(__result);
	}

	// --- [ bgfx_make_ref ] ---

	/**
	 * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc} this call doesn't allocate memory for data. It just copies pointer to data.
	 * 
	 * <p>You must make sure data is available for at least 2 {@link #bgfx_frame frame} calls.</p>
	 *
	 * @param _data the data to reference
	 * @param _size the number of bytes to reference
	 */
	public static long nbgfx_make_ref(long _data, int _size) {
		long __functionAddress = Functions.make_ref;
		return invokePP(__functionAddress, _data, _size);
	}

	/**
	 * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc} this call doesn't allocate memory for data. It just copies pointer to data.
	 * 
	 * <p>You must make sure data is available for at least 2 {@link #bgfx_frame frame} calls.</p>
	 *
	 * @param _data the data to reference
	 */
	public static BGFXMemory bgfx_make_ref(ByteBuffer _data) {
		long __result = nbgfx_make_ref(memAddress(_data), _data.remaining());
		return BGFXMemory.create(__result);
	}

	// --- [ bgfx_make_ref_release ] ---

	/**
	 * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc} this call doesn't allocate memory for data. It just copies pointer to data.
	 * 
	 * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
	 * called called from any thread.</p>
	 *
	 * @param _data      the data to reference
	 * @param _size      the number of bytes to reference
	 * @param _releaseFn the release function
	 * @param _userData  user data to pass to {@code _releaseFn}
	 */
	public static long nbgfx_make_ref_release(long _data, int _size, long _releaseFn, long _userData) {
		long __functionAddress = Functions.make_ref_release;
		return invokePPPP(__functionAddress, _data, _size, _releaseFn, _userData);
	}

	/**
	 * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc} this call doesn't allocate memory for data. It just copies pointer to data.
	 * 
	 * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
	 * called called from any thread.</p>
	 *
	 * @param _data      the data to reference
	 * @param _releaseFn the release function
	 * @param _userData  user data to pass to {@code _releaseFn}
	 */
	public static BGFXMemory bgfx_make_ref_release(ByteBuffer _data, BGFXReleaseFunctionCallbackI _releaseFn, long _userData) {
		long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining(), _releaseFn == null ? NULL : _releaseFn.address(), _userData);
		return BGFXMemory.create(__result);
	}

	// --- [ bgfx_set_debug ] ---

	/**
	 * Sets debug flags.
	 *
	 * @param _debug the debug flags. One or more of:<br><table><tr><td>{@link #BGFX_DEBUG_NONE DEBUG_NONE}</td><td>{@link #BGFX_DEBUG_WIREFRAME DEBUG_WIREFRAME}</td><td>{@link #BGFX_DEBUG_IFH DEBUG_IFH}</td><td>{@link #BGFX_DEBUG_STATS DEBUG_STATS}</td><td>{@link #BGFX_DEBUG_TEXT DEBUG_TEXT}</td></tr></table>
	 */
	public static void bgfx_set_debug(int _debug) {
		long __functionAddress = Functions.set_debug;
		invokeV(__functionAddress, _debug);
	}

	// --- [ bgfx_dbg_text_clear ] ---

	/**
	 * Clears internal debug text buffer.
	 *
	 * @param _attr  color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
	 * @param _small 
	 */
	public static void nbgfx_dbg_text_clear(byte _attr, boolean _small) {
		long __functionAddress = Functions.dbg_text_clear;
		invokeV(__functionAddress, _attr, _small);
	}

	/**
	 * Clears internal debug text buffer.
	 *
	 * @param _attr  color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
	 * @param _small 
	 */
	public static void bgfx_dbg_text_clear(int _attr, boolean _small) {
		nbgfx_dbg_text_clear((byte)(_attr & 0xFF), _small);
	}

	// --- [ bgfx_dbg_text_printf ] ---

	/**
	 * Prints into internal debug text character-buffer (VGA-compatible text mode).
	 *
	 * @param _x      x coordinate
	 * @param _y      y coordinate
	 * @param _attr   color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
	 * @param _format `printf` style format
	 */
	public static void nbgfx_dbg_text_printf(short _x, short _y, byte _attr, long _format) {
		long __functionAddress = Functions.dbg_text_printf;
		invokePV(__functionAddress, _x, _y, _attr, _format);
	}

	/**
	 * Prints into internal debug text character-buffer (VGA-compatible text mode).
	 *
	 * @param _x      x coordinate
	 * @param _y      y coordinate
	 * @param _attr   color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
	 * @param _format `printf` style format
	 */
	public static void bgfx_dbg_text_printf(int _x, int _y, int _attr, ByteBuffer _format) {
		if ( CHECKS )
			checkNT1(_format);
		nbgfx_dbg_text_printf((short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (byte)(_attr & 0xFF), memAddress(_format));
	}

	/**
	 * Prints into internal debug text character-buffer (VGA-compatible text mode).
	 *
	 * @param _x      x coordinate
	 * @param _y      y coordinate
	 * @param _attr   color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
	 * @param _format `printf` style format
	 */
	public static void bgfx_dbg_text_printf(int _x, int _y, int _attr, CharSequence _format) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer _formatEncoded = stack.UTF8(_format);
			nbgfx_dbg_text_printf((short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (byte)(_attr & 0xFF), memAddress(_formatEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ bgfx_dbg_text_vprintf ] ---

	/**
	 * Print into internal debug text character-buffer (VGA-compatible text mode).
	 *
	 * @param _x       x coordinate
	 * @param _y       y coordinate
	 * @param _attr    color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
	 * @param _format  `printf` style format
	 * @param _argList additional arguments for format string
	 */
	public static void nbgfx_dbg_text_vprintf(short _x, short _y, byte _attr, long _format, long _argList) {
		long __functionAddress = Functions.dbg_text_vprintf;
		if ( CHECKS )
			checkPointer(_argList);
		invokePPV(__functionAddress, _x, _y, _attr, _format, _argList);
	}

	/**
	 * Print into internal debug text character-buffer (VGA-compatible text mode).
	 *
	 * @param _x       x coordinate
	 * @param _y       y coordinate
	 * @param _attr    color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
	 * @param _format  `printf` style format
	 * @param _argList additional arguments for format string
	 */
	public static void bgfx_dbg_text_vprintf(int _x, int _y, int _attr, ByteBuffer _format, long _argList) {
		if ( CHECKS )
			checkNT1(_format);
		nbgfx_dbg_text_vprintf((short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (byte)(_attr & 0xFF), memAddress(_format), _argList);
	}

	/**
	 * Print into internal debug text character-buffer (VGA-compatible text mode).
	 *
	 * @param _x       x coordinate
	 * @param _y       y coordinate
	 * @param _attr    color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
	 * @param _format  `printf` style format
	 * @param _argList additional arguments for format string
	 */
	public static void bgfx_dbg_text_vprintf(int _x, int _y, int _attr, CharSequence _format, long _argList) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer _formatEncoded = stack.UTF8(_format);
			nbgfx_dbg_text_vprintf((short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (byte)(_attr & 0xFF), memAddress(_formatEncoded), _argList);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ bgfx_dbg_text_image ] ---

	/**
	 * Draws image into internal debug text buffer.
	 *
	 * @param _x      x coordinate
	 * @param _y      y coordinate
	 * @param _width  image width
	 * @param _height image height
	 * @param _data   raw image data (character/attribute raw encoding)
	 * @param _pitch  image pitch in bytes
	 */
	public static void nbgfx_dbg_text_image(short _x, short _y, short _width, short _height, long _data, short _pitch) {
		long __functionAddress = Functions.dbg_text_image;
		invokePV(__functionAddress, _x, _y, _width, _height, _data, _pitch);
	}

	/**
	 * Draws image into internal debug text buffer.
	 *
	 * @param _x      x coordinate
	 * @param _y      y coordinate
	 * @param _width  image width
	 * @param _height image height
	 * @param _data   raw image data (character/attribute raw encoding)
	 * @param _pitch  image pitch in bytes
	 */
	public static void bgfx_dbg_text_image(int _x, int _y, int _width, int _height, ByteBuffer _data, int _pitch) {
		if ( CHECKS )
			checkBuffer(_data, _height * _pitch);
		nbgfx_dbg_text_image((short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF), memAddress(_data), (short)(_pitch & 0xFFFF));
	}

	// --- [ bgfx_create_index_buffer ] ---

	/**
	 * Creates static index buffer.
	 *
	 * @param _mem   index buffer data
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short nbgfx_create_index_buffer(long _mem, short _flags) {
		long __functionAddress = Functions.create_index_buffer;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePS(__functionAddress, _mem, _flags);
	}

	/**
	 * Creates static index buffer.
	 *
	 * @param _mem   index buffer data
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short bgfx_create_index_buffer(BGFXMemory _mem, int _flags) {
		return nbgfx_create_index_buffer(_mem.address(), (short)(_flags & 0xFFFF));
	}

	// --- [ bgfx_destroy_index_buffer ] ---

	/**
	 * Destroys static index buffer.
	 *
	 * @param _handle the static index buffer to destroy
	 */
	public static void bgfx_destroy_index_buffer(short _handle) {
		long __functionAddress = Functions.destroy_index_buffer;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_create_vertex_buffer ] ---

	/**
	 * Creates static vertex buffer.
	 *
	 * @param _mem   vertex buffer data
	 * @param _decl  vertex declaration
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short nbgfx_create_vertex_buffer(long _mem, long _decl, short _flags) {
		long __functionAddress = Functions.create_vertex_buffer;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePPS(__functionAddress, _mem, _decl, _flags);
	}

	/**
	 * Creates static vertex buffer.
	 *
	 * @param _mem   vertex buffer data
	 * @param _decl  vertex declaration
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short bgfx_create_vertex_buffer(BGFXMemory _mem, BGFXVertexDecl _decl, int _flags) {
		return nbgfx_create_vertex_buffer(_mem.address(), _decl.address(), (short)(_flags & 0xFFFF));
	}

	// --- [ bgfx_destroy_vertex_buffer ] ---

	/**
	 * Destroys static vertex buffer.
	 *
	 * @param _handle the static vertex buffer to destroy
	 */
	public static void bgfx_destroy_vertex_buffer(short _handle) {
		long __functionAddress = Functions.destroy_vertex_buffer;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_create_dynamic_index_buffer ] ---

	/**
	 * Creates empty dynamic index buffer.
	 *
	 * @param _num   number of indices
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short nbgfx_create_dynamic_index_buffer(int _num, short _flags) {
		long __functionAddress = Functions.create_dynamic_index_buffer;
		return invokeS(__functionAddress, _num, _flags);
	}

	/**
	 * Creates empty dynamic index buffer.
	 *
	 * @param _num   number of indices
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short bgfx_create_dynamic_index_buffer(int _num, int _flags) {
		return nbgfx_create_dynamic_index_buffer(_num, (short)(_flags & 0xFFFF));
	}

	// --- [ bgfx_create_dynamic_index_buffer_mem ] ---

	/**
	 * Creates dynamic index buffer and initializes it.
	 *
	 * @param _mem   index buffer data
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short nbgfx_create_dynamic_index_buffer_mem(long _mem, short _flags) {
		long __functionAddress = Functions.create_dynamic_index_buffer_mem;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePS(__functionAddress, _mem, _flags);
	}

	/**
	 * Creates dynamic index buffer and initializes it.
	 *
	 * @param _mem   index buffer data
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short bgfx_create_dynamic_index_buffer_mem(BGFXMemory _mem, int _flags) {
		return nbgfx_create_dynamic_index_buffer_mem(_mem.address(), (short)(_flags & 0xFFFF));
	}

	// --- [ bgfx_update_dynamic_index_buffer ] ---

	/**
	 * Updates dynamic index buffer.
	 *
	 * @param _handle     dynamic index buffer handle
	 * @param _startIndex start index
	 * @param _mem        index buffer data
	 */
	public static void nbgfx_update_dynamic_index_buffer(short _handle, int _startIndex, long _mem) {
		long __functionAddress = Functions.update_dynamic_index_buffer;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		invokePV(__functionAddress, _handle, _startIndex, _mem);
	}

	/**
	 * Updates dynamic index buffer.
	 *
	 * @param _handle     dynamic index buffer handle
	 * @param _startIndex start index
	 * @param _mem        index buffer data
	 */
	public static void bgfx_update_dynamic_index_buffer(short _handle, int _startIndex, BGFXMemory _mem) {
		nbgfx_update_dynamic_index_buffer(_handle, _startIndex, _mem.address());
	}

	// --- [ bgfx_destroy_dynamic_index_buffer ] ---

	/**
	 * Destroys dynamic index buffer.
	 *
	 * @param _handle the dynamic index buffer to destroy
	 */
	public static void bgfx_destroy_dynamic_index_buffer(short _handle) {
		long __functionAddress = Functions.destroy_dynamic_index_buffer;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_create_dynamic_vertex_buffer ] ---

	/**
	 * Creates empty dynamic vertex buffer.
	 *
	 * @param _num   number of vertices
	 * @param _decl  vertex declaration
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short nbgfx_create_dynamic_vertex_buffer(int _num, long _decl, short _flags) {
		long __functionAddress = Functions.create_dynamic_vertex_buffer;
		return invokePS(__functionAddress, _num, _decl, _flags);
	}

	/**
	 * Creates empty dynamic vertex buffer.
	 *
	 * @param _num   number of vertices
	 * @param _decl  vertex declaration
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short bgfx_create_dynamic_vertex_buffer(int _num, BGFXVertexDecl _decl, int _flags) {
		return nbgfx_create_dynamic_vertex_buffer(_num, _decl.address(), (short)(_flags & 0xFFFF));
	}

	// --- [ bgfx_create_dynamic_vertex_buffer_mem ] ---

	/**
	 * Creates dynamic vertex buffer and initializes it.
	 *
	 * @param _mem   vertex buffer data
	 * @param _decl  vertex declaration
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short nbgfx_create_dynamic_vertex_buffer_mem(long _mem, long _decl, short _flags) {
		long __functionAddress = Functions.create_dynamic_vertex_buffer_mem;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePPS(__functionAddress, _mem, _decl, _flags);
	}

	/**
	 * Creates dynamic vertex buffer and initializes it.
	 *
	 * @param _mem   vertex buffer data
	 * @param _decl  vertex declaration
	 * @param _flags buffer creation flags. One of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
	 */
	public static short bgfx_create_dynamic_vertex_buffer_mem(BGFXMemory _mem, BGFXVertexDecl _decl, int _flags) {
		return nbgfx_create_dynamic_vertex_buffer_mem(_mem.address(), _decl.address(), (short)(_flags & 0xFFFF));
	}

	// --- [ bgfx_update_dynamic_vertex_buffer ] ---

	/**
	 * Updates dynamic vertex buffer.
	 *
	 * @param _handle      dynamic vertex buffer handle
	 * @param _startVertex start vertex
	 * @param _mem         vertex buffer data
	 */
	public static void nbgfx_update_dynamic_vertex_buffer(short _handle, int _startVertex, long _mem) {
		long __functionAddress = Functions.update_dynamic_vertex_buffer;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		invokePV(__functionAddress, _handle, _startVertex, _mem);
	}

	/**
	 * Updates dynamic vertex buffer.
	 *
	 * @param _handle      dynamic vertex buffer handle
	 * @param _startVertex start vertex
	 * @param _mem         vertex buffer data
	 */
	public static void bgfx_update_dynamic_vertex_buffer(short _handle, int _startVertex, BGFXMemory _mem) {
		nbgfx_update_dynamic_vertex_buffer(_handle, _startVertex, _mem.address());
	}

	// --- [ bgfx_destroy_dynamic_vertex_buffer ] ---

	/**
	 * Destroys dynamic vertex buffer.
	 *
	 * @param _handle the dynamic vertex buffer to destroy
	 */
	public static void bgfx_destroy_dynamic_vertex_buffer(short _handle) {
		long __functionAddress = Functions.destroy_dynamic_vertex_buffer;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_check_avail_transient_index_buffer ] ---

	/**
	 * Returns true if internal transient index buffer has enough space.
	 *
	 * @param _num number of indices
	 */
	public static boolean bgfx_check_avail_transient_index_buffer(int _num) {
		long __functionAddress = Functions.check_avail_transient_index_buffer;
		return invokeZ(__functionAddress, _num);
	}

	// --- [ bgfx_check_avail_transient_vertex_buffer ] ---

	/**
	 * Returns true if internal transient vertex buffer has enough space.
	 *
	 * @param _num  number of vertices
	 * @param _decl vertex declaration
	 */
	public static boolean nbgfx_check_avail_transient_vertex_buffer(int _num, long _decl) {
		long __functionAddress = Functions.check_avail_transient_vertex_buffer;
		return invokePZ(__functionAddress, _num, _decl);
	}

	/**
	 * Returns true if internal transient vertex buffer has enough space.
	 *
	 * @param _num  number of vertices
	 * @param _decl vertex declaration
	 */
	public static boolean bgfx_check_avail_transient_vertex_buffer(int _num, BGFXVertexDecl _decl) {
		return nbgfx_check_avail_transient_vertex_buffer(_num, _decl.address());
	}

	// --- [ bgfx_check_avail_instance_data_buffer ] ---

	/**
	 * Returns true if internal instance data buffer has enough space.
	 *
	 * @param _num    number of instances
	 * @param _stride stride per instance
	 */
	public static boolean nbgfx_check_avail_instance_data_buffer(int _num, short _stride) {
		long __functionAddress = Functions.check_avail_instance_data_buffer;
		return invokeZ(__functionAddress, _num, _stride);
	}

	/**
	 * Returns true if internal instance data buffer has enough space.
	 *
	 * @param _num    number of instances
	 * @param _stride stride per instance
	 */
	public static boolean bgfx_check_avail_instance_data_buffer(int _num, int _stride) {
		return nbgfx_check_avail_instance_data_buffer(_num, (short)(_stride & 0xFFFF));
	}

	// --- [ bgfx_check_avail_transient_buffers ] ---

	/**
	 * Returns true if both internal transient index and vertex buffer have enough space.
	 *
	 * @param _numVertices number of vertices
	 * @param _decl        vertex declaration
	 * @param _numIndices  number of indices
	 */
	public static boolean nbgfx_check_avail_transient_buffers(int _numVertices, long _decl, int _numIndices) {
		long __functionAddress = Functions.check_avail_transient_buffers;
		return invokePZ(__functionAddress, _numVertices, _decl, _numIndices);
	}

	/**
	 * Returns true if both internal transient index and vertex buffer have enough space.
	 *
	 * @param _numVertices number of vertices
	 * @param _decl        vertex declaration
	 * @param _numIndices  number of indices
	 */
	public static boolean bgfx_check_avail_transient_buffers(int _numVertices, BGFXVertexDecl _decl, int _numIndices) {
		return nbgfx_check_avail_transient_buffers(_numVertices, _decl.address(), _numIndices);
	}

	// --- [ bgfx_alloc_transient_index_buffer ] ---

	/**
	 * Allocates transient index buffer.
	 * 
	 * <p>You must call {@link #bgfx_set_index_buffer set_index_buffer} after alloc in order to avoid memory leak.</p>
	 * 
	 * <p>Only 16-bit index buffer is supported.</p>
	 *
	 * @param _tib {@link BGFXTransientIndexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
	 * @param _num number of indices to allocate
	 */
	public static void nbgfx_alloc_transient_index_buffer(long _tib, int _num) {
		long __functionAddress = Functions.alloc_transient_index_buffer;
		if ( CHECKS )
			BGFXTransientIndexBuffer.validate(_tib);
		invokePV(__functionAddress, _tib, _num);
	}

	/**
	 * Allocates transient index buffer.
	 * 
	 * <p>You must call {@link #bgfx_set_index_buffer set_index_buffer} after alloc in order to avoid memory leak.</p>
	 * 
	 * <p>Only 16-bit index buffer is supported.</p>
	 *
	 * @param _tib {@link BGFXTransientIndexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
	 * @param _num number of indices to allocate
	 */
	public static void bgfx_alloc_transient_index_buffer(BGFXTransientIndexBuffer _tib, int _num) {
		nbgfx_alloc_transient_index_buffer(_tib.address(), _num);
	}

	// --- [ bgfx_alloc_transient_vertex_buffer ] ---

	/**
	 * Allocates transient vertex buffer.
	 *
	 * @param _tvb  {@link BGFXTransientVertexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
	 * @param _num  number of vertices to allocate
	 * @param _decl vertex declaration
	 */
	public static void nbgfx_alloc_transient_vertex_buffer(long _tvb, int _num, long _decl) {
		long __functionAddress = Functions.alloc_transient_vertex_buffer;
		if ( CHECKS )
			BGFXTransientVertexBuffer.validate(_tvb);
		invokePPV(__functionAddress, _tvb, _num, _decl);
	}

	/**
	 * Allocates transient vertex buffer.
	 *
	 * @param _tvb  {@link BGFXTransientVertexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
	 * @param _num  number of vertices to allocate
	 * @param _decl vertex declaration
	 */
	public static void bgfx_alloc_transient_vertex_buffer(BGFXTransientVertexBuffer _tvb, int _num, BGFXVertexDecl _decl) {
		nbgfx_alloc_transient_vertex_buffer(_tvb.address(), _num, _decl.address());
	}

	// --- [ bgfx_alloc_transient_buffers ] ---

	/**
	 * Checks for required space and allocates transient vertex and index buffers. If both space requirements are satisfied function returns true.
	 * 
	 * <p>Only 16-bit index buffer is supported.</p>
	 *
	 * @param _tvb         {@link BGFXTransientVertexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
	 * @param _decl        vertex declaration
	 * @param _numVertices number of vertices to allocate
	 * @param _tib         {@link BGFXTransientIndexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
	 * @param _numIndices  number of indices to allocate
	 */
	public static boolean nbgfx_alloc_transient_buffers(long _tvb, long _decl, int _numVertices, long _tib, int _numIndices) {
		long __functionAddress = Functions.alloc_transient_buffers;
		if ( CHECKS ) {
			BGFXTransientVertexBuffer.validate(_tvb);
			BGFXTransientIndexBuffer.validate(_tib);
		}
		return invokePPPZ(__functionAddress, _tvb, _decl, _numVertices, _tib, _numIndices);
	}

	/**
	 * Checks for required space and allocates transient vertex and index buffers. If both space requirements are satisfied function returns true.
	 * 
	 * <p>Only 16-bit index buffer is supported.</p>
	 *
	 * @param _tvb         {@link BGFXTransientVertexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
	 * @param _decl        vertex declaration
	 * @param _numVertices number of vertices to allocate
	 * @param _tib         {@link BGFXTransientIndexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
	 * @param _numIndices  number of indices to allocate
	 */
	public static boolean bgfx_alloc_transient_buffers(BGFXTransientVertexBuffer _tvb, BGFXVertexDecl _decl, int _numVertices, BGFXTransientIndexBuffer _tib, int _numIndices) {
		return nbgfx_alloc_transient_buffers(_tvb.address(), _decl.address(), _numVertices, _tib.address(), _numIndices);
	}

	// --- [ bgfx_alloc_instance_data_buffer ] ---

	/**
	 * Allocates instance data buffer.
	 * 
	 * <p>You must call {@link #bgfx_set_instance_data_buffer set_instance_data_buffer} after alloc in order to avoid memory leak.</p>
	 *
	 * @param _num    number of instances to allocate
	 * @param _stride stride per instance
	 */
	public static long nbgfx_alloc_instance_data_buffer(int _num, short _stride) {
		long __functionAddress = Functions.alloc_instance_data_buffer;
		return invokeP(__functionAddress, _num, _stride);
	}

	/**
	 * Allocates instance data buffer.
	 * 
	 * <p>You must call {@link #bgfx_set_instance_data_buffer set_instance_data_buffer} after alloc in order to avoid memory leak.</p>
	 *
	 * @param _num    number of instances to allocate
	 * @param _stride stride per instance
	 */
	public static BGFXInstanceDataBuffer bgfx_alloc_instance_data_buffer(int _num, int _stride) {
		long __result = nbgfx_alloc_instance_data_buffer(_num, (short)(_stride & 0xFFFF));
		return BGFXInstanceDataBuffer.create(__result);
	}

	// --- [ bgfx_create_indirect_buffer ] ---

	/**
	 * Creates draw indirect buffer.
	 *
	 * @param _num 
	 */
	public static short bgfx_create_indirect_buffer(int _num) {
		long __functionAddress = Functions.create_indirect_buffer;
		return invokeS(__functionAddress, _num);
	}

	// --- [ bgfx_destroy_indirect_buffer ] ---

	/**
	 * Destroys draw indirect buffer.
	 *
	 * @param _handle the draw indirect buffer to destroy
	 */
	public static void bgfx_destroy_indirect_buffer(short _handle) {
		long __functionAddress = Functions.destroy_indirect_buffer;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_create_shader ] ---

	/**
	 * Creates shader from memory buffer.
	 *
	 * @param _mem 
	 */
	public static short nbgfx_create_shader(long _mem) {
		long __functionAddress = Functions.create_shader;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePS(__functionAddress, _mem);
	}

	/**
	 * Creates shader from memory buffer.
	 *
	 * @param _mem 
	 */
	public static short bgfx_create_shader(BGFXMemory _mem) {
		return nbgfx_create_shader(_mem.address());
	}

	// --- [ bgfx_get_shader_uniforms ] ---

	/**
	 * Returns num of uniforms, and uniform handles used inside shader.
	 * 
	 * <p>Only non-predefined uniforms are returned.</p>
	 *
	 * @param _handle   shader handle
	 * @param _uniforms {@code bgfx_uniform_handle_t} array where data will be stored
	 * @param _max      maximum capacity of {@code _uniforms}
	 *
	 * @return number of uniforms used by shader
	 */
	public static short nbgfx_get_shader_uniforms(short _handle, long _uniforms, short _max) {
		long __functionAddress = Functions.get_shader_uniforms;
		return invokePS(__functionAddress, _handle, _uniforms, _max);
	}

	/**
	 * Returns num of uniforms, and uniform handles used inside shader.
	 * 
	 * <p>Only non-predefined uniforms are returned.</p>
	 *
	 * @param _handle   shader handle
	 * @param _uniforms {@code bgfx_uniform_handle_t} array where data will be stored
	 *
	 * @return number of uniforms used by shader
	 */
	public static short bgfx_get_shader_uniforms(short _handle, ShortBuffer _uniforms) {
		return nbgfx_get_shader_uniforms(_handle, memAddress(_uniforms), (short)_uniforms.remaining());
	}

	// --- [ bgfx_destroy_shader ] ---

	/**
	 * Destroys shader. Once program is created with shader it is safe to destroy shader.
	 *
	 * @param _handle the shader  to destroy
	 */
	public static void bgfx_destroy_shader(short _handle) {
		long __functionAddress = Functions.destroy_shader;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_create_program ] ---

	/**
	 * Creates program with vertex and fragment shaders.
	 *
	 * @param _vsh            vertex shader
	 * @param _fsh            fragment shader
	 * @param _destroyShaders if true, shaders will be destroyed when program is destroyed
	 *
	 * @return program handle if vertex shader output and fragment shader input are matching, otherwise returns invalid program handle.
	 */
	public static short bgfx_create_program(short _vsh, short _fsh, boolean _destroyShaders) {
		long __functionAddress = Functions.create_program;
		return invokeS(__functionAddress, _vsh, _fsh, _destroyShaders);
	}

	// --- [ bgfx_create_compute_program ] ---

	/**
	 * Creates program with compute shader.
	 *
	 * @param _csh            compute shader
	 * @param _destroyShaders if true, shader will be destroyed when program is destroyed
	 */
	public static short bgfx_create_compute_program(short _csh, boolean _destroyShaders) {
		long __functionAddress = Functions.create_compute_program;
		return invokeS(__functionAddress, _csh, _destroyShaders);
	}

	// --- [ bgfx_destroy_program ] ---

	/**
	 * Destroy program.
	 *
	 * @param _handle the program to destroy
	 */
	public static void bgfx_destroy_program(short _handle) {
		long __functionAddress = Functions.destroy_program;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_calc_texture_size ] ---

	/**
	 * Calculates amount of memory required for texture.
	 *
	 * @param _info      resulting texture info structure
	 * @param _width     width
	 * @param _height    height
	 * @param _depth     depth
	 * @param _cubeMap   indicates that texture contains cubemap
	 * @param _hasMips   indicates that texture contains full mip-map chain
	 * @param _numLayers number of layers in texture array
	 * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 */
	public static void nbgfx_calc_texture_size(long _info, short _width, short _height, short _depth, boolean _cubeMap, boolean _hasMips, short _numLayers, int _format) {
		long __functionAddress = Functions.calc_texture_size;
		invokePV(__functionAddress, _info, _width, _height, _depth, _cubeMap, _hasMips, _numLayers, _format);
	}

	/**
	 * Calculates amount of memory required for texture.
	 *
	 * @param _info      resulting texture info structure
	 * @param _width     width
	 * @param _height    height
	 * @param _depth     depth
	 * @param _cubeMap   indicates that texture contains cubemap
	 * @param _hasMips   indicates that texture contains full mip-map chain
	 * @param _numLayers number of layers in texture array
	 * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 */
	public static void bgfx_calc_texture_size(BGFXTextureInfo _info, int _width, int _height, int _depth, boolean _cubeMap, boolean _hasMips, int _numLayers, int _format) {
		nbgfx_calc_texture_size(_info.address(), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF), (short)(_depth & 0xFFFF), _cubeMap, _hasMips, (short)(_numLayers & 0xFFFF), _format);
	}

	// --- [ bgfx_create_texture ] ---

	/**
	 * Creates texture from memory buffer.
	 *
	 * @param _mem   DDS, KTX or PVR texture data
	 * @param _flags default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
	 * @param _skip  skip top level mips when parsing texture
	 * @param _info  when non-{@code NULL} is specified it returns parsed texture information
	 */
	public static short nbgfx_create_texture(long _mem, int _flags, byte _skip, long _info) {
		long __functionAddress = Functions.create_texture;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePPS(__functionAddress, _mem, _flags, _skip, _info);
	}

	/**
	 * Creates texture from memory buffer.
	 *
	 * @param _mem   DDS, KTX or PVR texture data
	 * @param _flags default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
	 * @param _skip  skip top level mips when parsing texture
	 * @param _info  when non-{@code NULL} is specified it returns parsed texture information
	 */
	public static short bgfx_create_texture(BGFXMemory _mem, int _flags, int _skip, BGFXTextureInfo _info) {
		return nbgfx_create_texture(_mem.address(), _flags, (byte)(_skip & 0xFF), _info == null ? NULL : _info.address());
	}

	// --- [ bgfx_create_texture_2d ] ---

	/**
	 * Creates 2D texture.
	 *
	 * @param _width     width
	 * @param _height    height
	 * @param _hasMips   indicates that texture contains full mip-map chain
	 * @param _numLayers number of layers in texture array. Must be 1 if caps {@link #BGFX_CAPS_TEXTURE_2D_ARRAY CAPS_TEXTURE_2D_ARRAY} flag is not set.
	 * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _flags     default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
	 * @param _mem       texture data. If {@code _mem} is non-{@code NULL}, created texture will be immutable. When {@code _numLayers} is more than 1, expected memory layout is
	 *                   texture and all mips together for each array element.
	 */
	public static short nbgfx_create_texture_2d(short _width, short _height, boolean _hasMips, short _numLayers, int _format, int _flags, long _mem) {
		long __functionAddress = Functions.create_texture_2d;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePS(__functionAddress, _width, _height, _hasMips, _numLayers, _format, _flags, _mem);
	}

	/**
	 * Creates 2D texture.
	 *
	 * @param _width     width
	 * @param _height    height
	 * @param _hasMips   indicates that texture contains full mip-map chain
	 * @param _numLayers number of layers in texture array. Must be 1 if caps {@link #BGFX_CAPS_TEXTURE_2D_ARRAY CAPS_TEXTURE_2D_ARRAY} flag is not set.
	 * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _flags     default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
	 * @param _mem       texture data. If {@code _mem} is non-{@code NULL}, created texture will be immutable. When {@code _numLayers} is more than 1, expected memory layout is
	 *                   texture and all mips together for each array element.
	 */
	public static short bgfx_create_texture_2d(int _width, int _height, boolean _hasMips, int _numLayers, int _format, int _flags, BGFXMemory _mem) {
		return nbgfx_create_texture_2d((short)(_width & 0xFFFF), (short)(_height & 0xFFFF), _hasMips, (short)(_numLayers & 0xFFFF), _format, _flags, _mem.address());
	}

	// --- [ bgfx_create_texture_2d_scaled ] ---

	/**
	 * Creates frame buffer with size based on backbuffer ratio. Frame buffer will maintain ratio if back buffer resolution changes.
	 *
	 * @param _ratio     frame buffer size in respect to back-buffer size. One of:<br><table><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL}</td><td>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF}</td><td>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER}</td></tr><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE}</td></tr></table>
	 * @param _hasMips   indicates that texture contains full mip-map chain
	 * @param _numLayers number of layers in texture array. Must be 1 if caps {@link #BGFX_CAPS_TEXTURE_2D_ARRAY CAPS_TEXTURE_2D_ARRAY} flag is not set.
	 * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _flags     default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
	 */
	public static short nbgfx_create_texture_2d_scaled(int _ratio, boolean _hasMips, short _numLayers, int _format, int _flags) {
		long __functionAddress = Functions.create_texture_2d_scaled;
		return invokeS(__functionAddress, _ratio, _hasMips, _numLayers, _format, _flags);
	}

	/**
	 * Creates frame buffer with size based on backbuffer ratio. Frame buffer will maintain ratio if back buffer resolution changes.
	 *
	 * @param _ratio     frame buffer size in respect to back-buffer size. One of:<br><table><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL}</td><td>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF}</td><td>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER}</td></tr><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE}</td></tr></table>
	 * @param _hasMips   indicates that texture contains full mip-map chain
	 * @param _numLayers number of layers in texture array. Must be 1 if caps {@link #BGFX_CAPS_TEXTURE_2D_ARRAY CAPS_TEXTURE_2D_ARRAY} flag is not set.
	 * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _flags     default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
	 */
	public static short bgfx_create_texture_2d_scaled(int _ratio, boolean _hasMips, int _numLayers, int _format, int _flags) {
		return nbgfx_create_texture_2d_scaled(_ratio, _hasMips, (short)(_numLayers & 0xFFFF), _format, _flags);
	}

	// --- [ bgfx_create_texture_3d ] ---

	/**
	 * 
	 *
	 * @param _width   
	 * @param _height  
	 * @param _depth   
	 * @param _hasMips 
	 * @param _format  one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _flags   
	 * @param _mem     
	 */
	public static short nbgfx_create_texture_3d(short _width, short _height, short _depth, boolean _hasMips, int _format, int _flags, long _mem) {
		long __functionAddress = Functions.create_texture_3d;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePS(__functionAddress, _width, _height, _depth, _hasMips, _format, _flags, _mem);
	}

	/**
	 * 
	 *
	 * @param _width   
	 * @param _height  
	 * @param _depth   
	 * @param _hasMips 
	 * @param _format  one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _flags   
	 * @param _mem     
	 */
	public static short bgfx_create_texture_3d(int _width, int _height, int _depth, boolean _hasMips, int _format, int _flags, BGFXMemory _mem) {
		return nbgfx_create_texture_3d((short)(_width & 0xFFFF), (short)(_height & 0xFFFF), (short)(_depth & 0xFFFF), _hasMips, _format, _flags, _mem.address());
	}

	// --- [ bgfx_create_texture_cube ] ---

	/**
	 * 
	 *
	 * @param _size      
	 * @param _hasMips   
	 * @param _numLayers 
	 * @param _format    one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _flags     
	 * @param _mem       
	 */
	public static short nbgfx_create_texture_cube(short _size, boolean _hasMips, short _numLayers, int _format, int _flags, long _mem) {
		long __functionAddress = Functions.create_texture_cube;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		return invokePS(__functionAddress, _size, _hasMips, _numLayers, _format, _flags, _mem);
	}

	/**
	 * 
	 *
	 * @param _size      
	 * @param _hasMips   
	 * @param _numLayers 
	 * @param _format    one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _flags     
	 * @param _mem       
	 */
	public static short bgfx_create_texture_cube(int _size, boolean _hasMips, int _numLayers, int _format, int _flags, BGFXMemory _mem) {
		return nbgfx_create_texture_cube((short)(_size & 0xFFFF), _hasMips, (short)(_numLayers & 0xFFFF), _format, _flags, _mem.address());
	}

	// --- [ bgfx_update_texture_2d ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _layer  
	 * @param _mip    
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 * @param _mem    
	 * @param _pitch  
	 */
	public static void nbgfx_update_texture_2d(short _handle, short _layer, byte _mip, short _x, short _y, short _width, short _height, long _mem, short _pitch) {
		long __functionAddress = Functions.update_texture_2d;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		invokePV(__functionAddress, _handle, _layer, _mip, _x, _y, _width, _height, _mem, _pitch);
	}

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _layer  
	 * @param _mip    
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 * @param _mem    
	 * @param _pitch  
	 */
	public static void bgfx_update_texture_2d(short _handle, int _layer, int _mip, int _x, int _y, int _width, int _height, BGFXMemory _mem, int _pitch) {
		nbgfx_update_texture_2d(_handle, (short)(_layer & 0xFFFF), (byte)(_mip & 0xFF), (short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF), _mem.address(), (short)(_pitch & 0xFFFF));
	}

	// --- [ bgfx_update_texture_3d ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _mip    
	 * @param _x      
	 * @param _y      
	 * @param _z      
	 * @param _width  
	 * @param _height 
	 * @param _depth  
	 * @param _mem    
	 */
	public static void nbgfx_update_texture_3d(short _handle, byte _mip, short _x, short _y, short _z, short _width, short _height, short _depth, long _mem) {
		long __functionAddress = Functions.update_texture_3d;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		invokePV(__functionAddress, _handle, _mip, _x, _y, _z, _width, _height, _depth, _mem);
	}

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _mip    
	 * @param _x      
	 * @param _y      
	 * @param _z      
	 * @param _width  
	 * @param _height 
	 * @param _depth  
	 * @param _mem    
	 */
	public static void bgfx_update_texture_3d(short _handle, int _mip, int _x, int _y, int _z, int _width, int _height, int _depth, BGFXMemory _mem) {
		nbgfx_update_texture_3d(_handle, (byte)(_mip & 0xFF), (short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (short)(_z & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF), (short)(_depth & 0xFFFF), _mem.address());
	}

	// --- [ bgfx_update_texture_cube ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _layer  
	 * @param _side   
	 * @param _mip    
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 * @param _mem    
	 * @param _pitch  
	 */
	public static void nbgfx_update_texture_cube(short _handle, short _layer, byte _side, byte _mip, short _x, short _y, short _width, short _height, long _mem, short _pitch) {
		long __functionAddress = Functions.update_texture_cube;
		if ( CHECKS )
			BGFXMemory.validate(_mem);
		invokePV(__functionAddress, _handle, _layer, _side, _mip, _x, _y, _width, _height, _mem, _pitch);
	}

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _layer  
	 * @param _side   
	 * @param _mip    
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 * @param _mem    
	 * @param _pitch  
	 */
	public static void bgfx_update_texture_cube(short _handle, int _layer, int _side, int _mip, int _x, int _y, int _width, int _height, BGFXMemory _mem, int _pitch) {
		nbgfx_update_texture_cube(_handle, (short)(_layer & 0xFFFF), (byte)(_side & 0xFF), (byte)(_mip & 0xFF), (short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF), _mem.address(), (short)(_pitch & 0xFFFF));
	}

	// --- [ bgfx_read_texture ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _data   
	 */
	public static int nbgfx_read_texture(short _handle, long _data) {
		long __functionAddress = Functions.read_texture;
		return invokePI(__functionAddress, _handle, _data);
	}

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _data   
	 */
	public static int bgfx_read_texture(short _handle, ByteBuffer _data) {
		return nbgfx_read_texture(_handle, memAddress(_data));
	}

	// --- [ bgfx_read_frame_buffer ] ---

	/**
	 * 
	 *
	 * @param _handle     
	 * @param _attachment 
	 * @param _data       
	 */
	public static int nbgfx_read_frame_buffer(short _handle, byte _attachment, long _data) {
		long __functionAddress = Functions.read_frame_buffer;
		return invokePI(__functionAddress, _handle, _attachment, _data);
	}

	/**
	 * 
	 *
	 * @param _handle     
	 * @param _attachment 
	 * @param _data       
	 */
	public static int bgfx_read_frame_buffer(short _handle, int _attachment, ByteBuffer _data) {
		return nbgfx_read_frame_buffer(_handle, (byte)(_attachment & 0xFF), memAddress(_data));
	}

	// --- [ bgfx_destroy_texture ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 */
	public static void bgfx_destroy_texture(short _handle) {
		long __functionAddress = Functions.destroy_texture;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_create_frame_buffer ] ---

	/**
	 * 
	 *
	 * @param _width        
	 * @param _height       
	 * @param _format       one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _textureFlags 
	 */
	public static short nbgfx_create_frame_buffer(short _width, short _height, int _format, int _textureFlags) {
		long __functionAddress = Functions.create_frame_buffer;
		return invokeS(__functionAddress, _width, _height, _format, _textureFlags);
	}

	/**
	 * 
	 *
	 * @param _width        
	 * @param _height       
	 * @param _format       one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _textureFlags 
	 */
	public static short bgfx_create_frame_buffer(int _width, int _height, int _format, int _textureFlags) {
		return nbgfx_create_frame_buffer((short)(_width & 0xFFFF), (short)(_height & 0xFFFF), _format, _textureFlags);
	}

	// --- [ bgfx_create_frame_buffer_scaled ] ---

	/**
	 * 
	 *
	 * @param _ratio        one of:<br><table><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL}</td><td>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF}</td><td>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER}</td></tr><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE}</td></tr></table>
	 * @param _format       one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 * @param _textureFlags 
	 */
	public static short bgfx_create_frame_buffer_scaled(int _ratio, int _format, int _textureFlags) {
		long __functionAddress = Functions.create_frame_buffer_scaled;
		return invokeS(__functionAddress, _ratio, _format, _textureFlags);
	}

	// --- [ bgfx_create_frame_buffer_from_handles ] ---

	/**
	 * 
	 *
	 * @param _num             
	 * @param _handles         
	 * @param _destroyTextures 
	 */
	public static short nbgfx_create_frame_buffer_from_handles(byte _num, long _handles, boolean _destroyTextures) {
		long __functionAddress = Functions.create_frame_buffer_from_handles;
		return invokePS(__functionAddress, _num, _handles, _destroyTextures);
	}

	/**
	 * 
	 *
	 * @param _num             
	 * @param _handles         
	 * @param _destroyTextures 
	 */
	public static short bgfx_create_frame_buffer_from_handles(int _num, ShortBuffer _handles, boolean _destroyTextures) {
		if ( CHECKS )
			checkBuffer(_handles, _num);
		return nbgfx_create_frame_buffer_from_handles((byte)(_num & 0xFF), memAddress(_handles), _destroyTextures);
	}

	// --- [ bgfx_create_frame_buffer_from_attachment ] ---

	/**
	 * 
	 *
	 * @param _num             
	 * @param _attachment      
	 * @param _destroyTextures 
	 */
	public static short nbgfx_create_frame_buffer_from_attachment(byte _num, long _attachment, boolean _destroyTextures) {
		long __functionAddress = Functions.create_frame_buffer_from_attachment;
		return invokePS(__functionAddress, _num, _attachment, _destroyTextures);
	}

	/**
	 * 
	 *
	 * @param _num             
	 * @param _attachment      
	 * @param _destroyTextures 
	 */
	public static short bgfx_create_frame_buffer_from_attachment(int _num, BGFXAttachment _attachment, boolean _destroyTextures) {
		return nbgfx_create_frame_buffer_from_attachment((byte)(_num & 0xFF), _attachment.address(), _destroyTextures);
	}

	// --- [ bgfx_create_frame_buffer_from_nwh ] ---

	/**
	 * 
	 *
	 * @param _nwh         
	 * @param _width       
	 * @param _height      
	 * @param _depthFormat one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 */
	public static short nbgfx_create_frame_buffer_from_nwh(long _nwh, short _width, short _height, int _depthFormat) {
		long __functionAddress = Functions.create_frame_buffer_from_nwh;
		return invokePS(__functionAddress, _nwh, _width, _height, _depthFormat);
	}

	/**
	 * 
	 *
	 * @param _nwh         
	 * @param _width       
	 * @param _height      
	 * @param _depthFormat one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 */
	public static short bgfx_create_frame_buffer_from_nwh(ByteBuffer _nwh, int _width, int _height, int _depthFormat) {
		return nbgfx_create_frame_buffer_from_nwh(memAddress(_nwh), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF), _depthFormat);
	}

	// --- [ bgfx_destroy_frame_buffer ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 */
	public static void bgfx_destroy_frame_buffer(short _handle) {
		long __functionAddress = Functions.destroy_frame_buffer;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_create_uniform ] ---

	/**
	 * 
	 *
	 * @param _name 
	 * @param _type one of:<br><table><tr><td>{@link #BGFX_UNIFORM_TYPE_INT1 UNIFORM_TYPE_INT1}</td><td>{@link #BGFX_UNIFORM_TYPE_END UNIFORM_TYPE_END}</td><td>{@link #BGFX_UNIFORM_TYPE_VEC4 UNIFORM_TYPE_VEC4}</td><td>{@link #BGFX_UNIFORM_TYPE_MAT3 UNIFORM_TYPE_MAT3}</td></tr><tr><td>{@link #BGFX_UNIFORM_TYPE_MAT4 UNIFORM_TYPE_MAT4}</td></tr></table>
	 * @param _num  
	 */
	public static short nbgfx_create_uniform(long _name, int _type, short _num) {
		long __functionAddress = Functions.create_uniform;
		return invokePS(__functionAddress, _name, _type, _num);
	}

	/**
	 * 
	 *
	 * @param _name 
	 * @param _type one of:<br><table><tr><td>{@link #BGFX_UNIFORM_TYPE_INT1 UNIFORM_TYPE_INT1}</td><td>{@link #BGFX_UNIFORM_TYPE_END UNIFORM_TYPE_END}</td><td>{@link #BGFX_UNIFORM_TYPE_VEC4 UNIFORM_TYPE_VEC4}</td><td>{@link #BGFX_UNIFORM_TYPE_MAT3 UNIFORM_TYPE_MAT3}</td></tr><tr><td>{@link #BGFX_UNIFORM_TYPE_MAT4 UNIFORM_TYPE_MAT4}</td></tr></table>
	 * @param _num  
	 */
	public static short bgfx_create_uniform(ByteBuffer _name, int _type, int _num) {
		if ( CHECKS )
			checkNT1(_name);
		return nbgfx_create_uniform(memAddress(_name), _type, (short)(_num & 0xFFFF));
	}

	/**
	 * 
	 *
	 * @param _name 
	 * @param _type one of:<br><table><tr><td>{@link #BGFX_UNIFORM_TYPE_INT1 UNIFORM_TYPE_INT1}</td><td>{@link #BGFX_UNIFORM_TYPE_END UNIFORM_TYPE_END}</td><td>{@link #BGFX_UNIFORM_TYPE_VEC4 UNIFORM_TYPE_VEC4}</td><td>{@link #BGFX_UNIFORM_TYPE_MAT3 UNIFORM_TYPE_MAT3}</td></tr><tr><td>{@link #BGFX_UNIFORM_TYPE_MAT4 UNIFORM_TYPE_MAT4}</td></tr></table>
	 * @param _num  
	 */
	public static short bgfx_create_uniform(CharSequence _name, int _type, int _num) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer _nameEncoded = stack.UTF8(_name);
			return nbgfx_create_uniform(memAddress(_nameEncoded), _type, (short)(_num & 0xFFFF));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ bgfx_destroy_uniform ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 */
	public static void bgfx_destroy_uniform(short _handle) {
		long __functionAddress = Functions.destroy_uniform;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_create_occlusion_query ] ---

	/**  */
	public static short bgfx_create_occlusion_query() {
		long __functionAddress = Functions.create_occlusion_query;
		return invokeS(__functionAddress);
	}

	// --- [ bgfx_get_result ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 */
	public static int bgfx_get_result(short _handle) {
		long __functionAddress = Functions.get_result;
		return invokeI(__functionAddress, _handle);
	}

	// --- [ bgfx_destroy_occlusion_query ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 */
	public static void bgfx_destroy_occlusion_query(short _handle) {
		long __functionAddress = Functions.destroy_occlusion_query;
		invokeV(__functionAddress, _handle);
	}

	// --- [ bgfx_set_palette_color ] ---

	/**
	 * 
	 *
	 * @param _index 
	 * @param _rgba  
	 */
	public static void nbgfx_set_palette_color(byte _index, long _rgba) {
		long __functionAddress = Functions.set_palette_color;
		invokePV(__functionAddress, _index, _rgba);
	}

	/**
	 * 
	 *
	 * @param _index 
	 * @param _rgba  
	 */
	public static void bgfx_set_palette_color(int _index, FloatBuffer _rgba) {
		if ( CHECKS )
			checkBuffer(_rgba, 4);
		nbgfx_set_palette_color((byte)(_index & 0xFF), memAddress(_rgba));
	}

	// --- [ bgfx_set_view_name ] ---

	/**
	 * 
	 *
	 * @param _id   
	 * @param _name 
	 */
	public static void nbgfx_set_view_name(byte _id, long _name) {
		long __functionAddress = Functions.set_view_name;
		invokePV(__functionAddress, _id, _name);
	}

	/**
	 * 
	 *
	 * @param _id   
	 * @param _name 
	 */
	public static void bgfx_set_view_name(int _id, ByteBuffer _name) {
		if ( CHECKS )
			checkNT1(_name);
		nbgfx_set_view_name((byte)(_id & 0xFF), memAddress(_name));
	}

	/**
	 * 
	 *
	 * @param _id   
	 * @param _name 
	 */
	public static void bgfx_set_view_name(int _id, CharSequence _name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer _nameEncoded = stack.UTF8(_name);
			nbgfx_set_view_name((byte)(_id & 0xFF), memAddress(_nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ bgfx_set_view_rect ] ---

	/**
	 * 
	 *
	 * @param _id     
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 */
	public static void nbgfx_set_view_rect(byte _id, short _x, short _y, short _width, short _height) {
		long __functionAddress = Functions.set_view_rect;
		invokeV(__functionAddress, _id, _x, _y, _width, _height);
	}

	/**
	 * 
	 *
	 * @param _id     
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 */
	public static void bgfx_set_view_rect(int _id, int _x, int _y, int _width, int _height) {
		nbgfx_set_view_rect((byte)(_id & 0xFF), (short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF));
	}

	// --- [ bgfx_set_view_rect_auto ] ---

	/**
	 * 
	 *
	 * @param _id    
	 * @param _x     
	 * @param _y     
	 * @param _ratio one of:<br><table><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL}</td><td>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF}</td><td>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER}</td></tr><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE}</td></tr></table>
	 */
	public static void nbgfx_set_view_rect_auto(byte _id, short _x, short _y, int _ratio) {
		long __functionAddress = Functions.set_view_rect_auto;
		invokeV(__functionAddress, _id, _x, _y, _ratio);
	}

	/**
	 * 
	 *
	 * @param _id    
	 * @param _x     
	 * @param _y     
	 * @param _ratio one of:<br><table><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL}</td><td>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF}</td><td>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER}</td></tr><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE}</td></tr></table>
	 */
	public static void bgfx_set_view_rect_auto(int _id, int _x, int _y, int _ratio) {
		nbgfx_set_view_rect_auto((byte)(_id & 0xFF), (short)(_x & 0xFFFF), (short)(_y & 0xFFFF), _ratio);
	}

	// --- [ bgfx_set_view_scissor ] ---

	/**
	 * 
	 *
	 * @param _id     
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 */
	public static void nbgfx_set_view_scissor(byte _id, short _x, short _y, short _width, short _height) {
		long __functionAddress = Functions.set_view_scissor;
		invokeV(__functionAddress, _id, _x, _y, _width, _height);
	}

	/**
	 * 
	 *
	 * @param _id     
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 */
	public static void bgfx_set_view_scissor(int _id, int _x, int _y, int _width, int _height) {
		nbgfx_set_view_scissor((byte)(_id & 0xFF), (short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF));
	}

	// --- [ bgfx_set_view_clear ] ---

	/**
	 * 
	 *
	 * @param _id      
	 * @param _flags   
	 * @param _rgba    
	 * @param _depth   
	 * @param _stencil 
	 */
	public static void nbgfx_set_view_clear(byte _id, short _flags, int _rgba, float _depth, byte _stencil) {
		long __functionAddress = Functions.set_view_clear;
		invokeV(__functionAddress, _id, _flags, _rgba, _depth, _stencil);
	}

	/**
	 * 
	 *
	 * @param _id      
	 * @param _flags   
	 * @param _rgba    
	 * @param _depth   
	 * @param _stencil 
	 */
	public static void bgfx_set_view_clear(int _id, int _flags, int _rgba, float _depth, int _stencil) {
		nbgfx_set_view_clear((byte)(_id & 0xFF), (short)(_flags & 0xFFFF), _rgba, _depth, (byte)(_stencil & 0xFF));
	}

	// --- [ bgfx_set_view_clear_mrt ] ---

	/**
	 * 
	 *
	 * @param _id      
	 * @param _flags   
	 * @param _depth   
	 * @param _stencil 
	 * @param _0       
	 * @param _1       
	 * @param _2       
	 * @param _3       
	 * @param _4       
	 * @param _5       
	 * @param _6       
	 * @param _7       
	 */
	public static void nbgfx_set_view_clear_mrt(byte _id, short _flags, float _depth, byte _stencil, byte _0, byte _1, byte _2, byte _3, byte _4, byte _5, byte _6, byte _7) {
		long __functionAddress = Functions.set_view_clear_mrt;
		invokeV(__functionAddress, _id, _flags, _depth, _stencil, _0, _1, _2, _3, _4, _5, _6, _7);
	}

	/**
	 * 
	 *
	 * @param _id      
	 * @param _flags   
	 * @param _depth   
	 * @param _stencil 
	 * @param _0       
	 * @param _1       
	 * @param _2       
	 * @param _3       
	 * @param _4       
	 * @param _5       
	 * @param _6       
	 * @param _7       
	 */
	public static void bgfx_set_view_clear_mrt(int _id, int _flags, float _depth, int _stencil, byte _0, byte _1, byte _2, byte _3, byte _4, byte _5, byte _6, byte _7) {
		nbgfx_set_view_clear_mrt((byte)(_id & 0xFF), (short)(_flags & 0xFFFF), _depth, (byte)(_stencil & 0xFF), _0, _1, _2, _3, _4, _5, _6, _7);
	}

	// --- [ bgfx_set_view_seq ] ---

	/**
	 * 
	 *
	 * @param _id      
	 * @param _enabled 
	 */
	public static void nbgfx_set_view_seq(byte _id, boolean _enabled) {
		long __functionAddress = Functions.set_view_seq;
		invokeV(__functionAddress, _id, _enabled);
	}

	/**
	 * 
	 *
	 * @param _id      
	 * @param _enabled 
	 */
	public static void bgfx_set_view_seq(int _id, boolean _enabled) {
		nbgfx_set_view_seq((byte)(_id & 0xFF), _enabled);
	}

	// --- [ bgfx_set_view_frame_buffer ] ---

	/**
	 * 
	 *
	 * @param _id     
	 * @param _handle 
	 */
	public static void nbgfx_set_view_frame_buffer(byte _id, short _handle) {
		long __functionAddress = Functions.set_view_frame_buffer;
		invokeV(__functionAddress, _id, _handle);
	}

	/**
	 * 
	 *
	 * @param _id     
	 * @param _handle 
	 */
	public static void bgfx_set_view_frame_buffer(int _id, short _handle) {
		nbgfx_set_view_frame_buffer((byte)(_id & 0xFF), _handle);
	}

	// --- [ bgfx_set_view_transform ] ---

	/**
	 * 
	 *
	 * @param _id   
	 * @param _view 
	 * @param _proj 
	 */
	public static void nbgfx_set_view_transform(byte _id, long _view, long _proj) {
		long __functionAddress = Functions.set_view_transform;
		invokePPV(__functionAddress, _id, _view, _proj);
	}

	/**
	 * 
	 *
	 * @param _id   
	 * @param _view 
	 * @param _proj 
	 */
	public static void bgfx_set_view_transform(int _id, FloatBuffer _view, FloatBuffer _proj) {
		nbgfx_set_view_transform((byte)(_id & 0xFF), memAddressSafe(_view), memAddressSafe(_proj));
	}

	// --- [ bgfx_set_view_transform_stereo ] ---

	/**
	 * 
	 *
	 * @param _id    
	 * @param _view  
	 * @param _projL 
	 * @param _flags 
	 * @param _projR 
	 */
	public static void nbgfx_set_view_transform_stereo(byte _id, long _view, long _projL, byte _flags, long _projR) {
		long __functionAddress = Functions.set_view_transform_stereo;
		invokePPPV(__functionAddress, _id, _view, _projL, _flags, _projR);
	}

	/**
	 * 
	 *
	 * @param _id    
	 * @param _view  
	 * @param _projL 
	 * @param _flags 
	 * @param _projR 
	 */
	public static void bgfx_set_view_transform_stereo(int _id, FloatBuffer _view, FloatBuffer _projL, int _flags, FloatBuffer _projR) {
		nbgfx_set_view_transform_stereo((byte)(_id & 0xFF), memAddressSafe(_view), memAddressSafe(_projL), (byte)(_flags & 0xFF), memAddressSafe(_projR));
	}

	// --- [ bgfx_set_view_remap ] ---

	/**
	 * 
	 *
	 * @param _id    
	 * @param _num   
	 * @param _remap 
	 */
	public static void nbgfx_set_view_remap(byte _id, byte _num, long _remap) {
		long __functionAddress = Functions.set_view_remap;
		invokePV(__functionAddress, _id, _num, _remap);
	}

	/**
	 * 
	 *
	 * @param _id    
	 * @param _num   
	 * @param _remap 
	 */
	public static void bgfx_set_view_remap(int _id, int _num, ByteBuffer _remap) {
		nbgfx_set_view_remap((byte)(_id & 0xFF), (byte)(_num & 0xFF), memAddress(_remap));
	}

	// --- [ bgfx_reset_view ] ---

	/**
	 * 
	 *
	 * @param _id 
	 */
	public static void nbgfx_reset_view(byte _id) {
		long __functionAddress = Functions.reset_view;
		invokeV(__functionAddress, _id);
	}

	/**
	 * 
	 *
	 * @param _id 
	 */
	public static void bgfx_reset_view(int _id) {
		nbgfx_reset_view((byte)(_id & 0xFF));
	}

	// --- [ bgfx_set_marker ] ---

	/**
	 * 
	 *
	 * @param _marker 
	 */
	public static void nbgfx_set_marker(long _marker) {
		long __functionAddress = Functions.set_marker;
		invokePV(__functionAddress, _marker);
	}

	/**
	 * 
	 *
	 * @param _marker 
	 */
	public static void bgfx_set_marker(ByteBuffer _marker) {
		if ( CHECKS )
			checkNT1(_marker);
		nbgfx_set_marker(memAddress(_marker));
	}

	/**
	 * 
	 *
	 * @param _marker 
	 */
	public static void bgfx_set_marker(CharSequence _marker) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer _markerEncoded = stack.UTF8(_marker);
			nbgfx_set_marker(memAddress(_markerEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ bgfx_set_state ] ---

	/**
	 * 
	 *
	 * @param _state 
	 * @param _rgba  
	 */
	public static void bgfx_set_state(long _state, int _rgba) {
		long __functionAddress = Functions.set_state;
		invokeJV(__functionAddress, _state, _rgba);
	}

	// --- [ bgfx_set_condition ] ---

	/**
	 * 
	 *
	 * @param _handle  
	 * @param _visible 
	 */
	public static void bgfx_set_condition(short _handle, boolean _visible) {
		long __functionAddress = Functions.set_condition;
		invokeV(__functionAddress, _handle, _visible);
	}

	// --- [ bgfx_set_stencil ] ---

	/**
	 * 
	 *
	 * @param _fstencil 
	 * @param _bstencil 
	 */
	public static void bgfx_set_stencil(int _fstencil, int _bstencil) {
		long __functionAddress = Functions.set_stencil;
		invokeV(__functionAddress, _fstencil, _bstencil);
	}

	// --- [ bgfx_set_scissor ] ---

	/**
	 * 
	 *
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 */
	public static short nbgfx_set_scissor(short _x, short _y, short _width, short _height) {
		long __functionAddress = Functions.set_scissor;
		return invokeS(__functionAddress, _x, _y, _width, _height);
	}

	/**
	 * 
	 *
	 * @param _x      
	 * @param _y      
	 * @param _width  
	 * @param _height 
	 */
	public static short bgfx_set_scissor(int _x, int _y, int _width, int _height) {
		return nbgfx_set_scissor((short)(_x & 0xFFFF), (short)(_y & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF));
	}

	// --- [ bgfx_set_scissor_cached ] ---

	/**
	 * 
	 *
	 * @param _cache 
	 */
	public static void nbgfx_set_scissor_cached(short _cache) {
		long __functionAddress = Functions.set_scissor_cached;
		invokeV(__functionAddress, _cache);
	}

	/**
	 * 
	 *
	 * @param _cache 
	 */
	public static void bgfx_set_scissor_cached(int _cache) {
		nbgfx_set_scissor_cached((short)(_cache & 0xFFFF));
	}

	// --- [ bgfx_set_transform ] ---

	/**
	 * 
	 *
	 * @param _mtx 
	 * @param _num 
	 */
	public static int nbgfx_set_transform(long _mtx, short _num) {
		long __functionAddress = Functions.set_transform;
		return invokePI(__functionAddress, _mtx, _num);
	}

	/**
	 * 
	 *
	 * @param _mtx 
	 * @param _num 
	 */
	public static int bgfx_set_transform(FloatBuffer _mtx, int _num) {
		return nbgfx_set_transform(memAddress(_mtx), (short)(_num & 0xFFFF));
	}

	// --- [ bgfx_alloc_transform ] ---

	/**
	 * 
	 *
	 * @param _transform 
	 * @param _num       
	 */
	public static int nbgfx_alloc_transform(long _transform, short _num) {
		long __functionAddress = Functions.alloc_transform;
		return invokePI(__functionAddress, _transform, _num);
	}

	/**
	 * 
	 *
	 * @param _transform 
	 * @param _num       
	 */
	public static int bgfx_alloc_transform(BGFXTransform _transform, int _num) {
		return nbgfx_alloc_transform(_transform.address(), (short)(_num & 0xFFFF));
	}

	// --- [ bgfx_set_transform_cached ] ---

	/**
	 * 
	 *
	 * @param _cache 
	 * @param _num   
	 */
	public static void nbgfx_set_transform_cached(int _cache, short _num) {
		long __functionAddress = Functions.set_transform_cached;
		invokeV(__functionAddress, _cache, _num);
	}

	/**
	 * 
	 *
	 * @param _cache 
	 * @param _num   
	 */
	public static void bgfx_set_transform_cached(int _cache, int _num) {
		nbgfx_set_transform_cached(_cache, (short)(_num & 0xFFFF));
	}

	// --- [ bgfx_set_uniform ] ---

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _value  
	 * @param _num    
	 */
	public static void nbgfx_set_uniform(short _handle, long _value, short _num) {
		long __functionAddress = Functions.set_uniform;
		invokePV(__functionAddress, _handle, _value, _num);
	}

	/**
	 * 
	 *
	 * @param _handle 
	 * @param _value  
	 * @param _num    
	 */
	public static void bgfx_set_uniform(short _handle, ByteBuffer _value, int _num) {
		nbgfx_set_uniform(_handle, memAddress(_value), (short)(_num & 0xFFFF));
	}

	// --- [ bgfx_set_index_buffer ] ---

	/**
	 * 
	 *
	 * @param _handle     
	 * @param _firstIndex 
	 * @param _numIndices 
	 */
	public static void bgfx_set_index_buffer(short _handle, int _firstIndex, int _numIndices) {
		long __functionAddress = Functions.set_index_buffer;
		invokeV(__functionAddress, _handle, _firstIndex, _numIndices);
	}

	// --- [ bgfx_set_dynamic_index_buffer ] ---

	/**
	 * 
	 *
	 * @param _handle     
	 * @param _firstIndex 
	 * @param _numIndices 
	 */
	public static void bgfx_set_dynamic_index_buffer(short _handle, int _firstIndex, int _numIndices) {
		long __functionAddress = Functions.set_dynamic_index_buffer;
		invokeV(__functionAddress, _handle, _firstIndex, _numIndices);
	}

	// --- [ bgfx_set_transient_index_buffer ] ---

	/**
	 * 
	 *
	 * @param _tib        
	 * @param _firstIndex 
	 * @param _numIndices 
	 */
	public static void nbgfx_set_transient_index_buffer(long _tib, int _firstIndex, int _numIndices) {
		long __functionAddress = Functions.set_transient_index_buffer;
		if ( CHECKS )
			BGFXTransientIndexBuffer.validate(_tib);
		invokePV(__functionAddress, _tib, _firstIndex, _numIndices);
	}

	/**
	 * 
	 *
	 * @param _tib        
	 * @param _firstIndex 
	 * @param _numIndices 
	 */
	public static void bgfx_set_transient_index_buffer(BGFXTransientIndexBuffer _tib, int _firstIndex, int _numIndices) {
		nbgfx_set_transient_index_buffer(_tib.address(), _firstIndex, _numIndices);
	}

	// --- [ bgfx_set_vertex_buffer ] ---

	/**
	 * 
	 *
	 * @param _handle      
	 * @param _startVertex 
	 * @param _numVertices 
	 */
	public static void bgfx_set_vertex_buffer(short _handle, int _startVertex, int _numVertices) {
		long __functionAddress = Functions.set_vertex_buffer;
		invokeV(__functionAddress, _handle, _startVertex, _numVertices);
	}

	// --- [ bgfx_set_dynamic_vertex_buffer ] ---

	/**
	 * 
	 *
	 * @param _handle      
	 * @param _startVertex 
	 * @param _numVertices 
	 */
	public static void bgfx_set_dynamic_vertex_buffer(short _handle, int _startVertex, int _numVertices) {
		long __functionAddress = Functions.set_dynamic_vertex_buffer;
		invokeV(__functionAddress, _handle, _startVertex, _numVertices);
	}

	// --- [ bgfx_set_transient_vertex_buffer ] ---

	/**
	 * 
	 *
	 * @param _tvb         
	 * @param _startVertex 
	 * @param _numVertices 
	 */
	public static void nbgfx_set_transient_vertex_buffer(long _tvb, int _startVertex, int _numVertices) {
		long __functionAddress = Functions.set_transient_vertex_buffer;
		if ( CHECKS )
			BGFXTransientVertexBuffer.validate(_tvb);
		invokePV(__functionAddress, _tvb, _startVertex, _numVertices);
	}

	/**
	 * 
	 *
	 * @param _tvb         
	 * @param _startVertex 
	 * @param _numVertices 
	 */
	public static void bgfx_set_transient_vertex_buffer(BGFXTransientVertexBuffer _tvb, int _startVertex, int _numVertices) {
		nbgfx_set_transient_vertex_buffer(_tvb.address(), _startVertex, _numVertices);
	}

	// --- [ bgfx_set_instance_data_buffer ] ---

	/**
	 * 
	 *
	 * @param _idb 
	 * @param _num 
	 */
	public static void nbgfx_set_instance_data_buffer(long _idb, int _num) {
		long __functionAddress = Functions.set_instance_data_buffer;
		if ( CHECKS )
			BGFXInstanceDataBuffer.validate(_idb);
		invokePV(__functionAddress, _idb, _num);
	}

	/**
	 * 
	 *
	 * @param _idb 
	 * @param _num 
	 */
	public static void bgfx_set_instance_data_buffer(BGFXInstanceDataBuffer _idb, int _num) {
		nbgfx_set_instance_data_buffer(_idb.address(), _num);
	}

	// --- [ bgfx_set_instance_data_from_vertex_buffer ] ---

	/**
	 * 
	 *
	 * @param _handle      
	 * @param _startVertex 
	 * @param _num         
	 */
	public static void bgfx_set_instance_data_from_vertex_buffer(short _handle, int _startVertex, int _num) {
		long __functionAddress = Functions.set_instance_data_from_vertex_buffer;
		invokeV(__functionAddress, _handle, _startVertex, _num);
	}

	// --- [ bgfx_set_instance_data_from_dynamic_vertex_buffer ] ---

	/**
	 * 
	 *
	 * @param _handle      
	 * @param _startVertex 
	 * @param _num         
	 */
	public static void bgfx_set_instance_data_from_dynamic_vertex_buffer(short _handle, int _startVertex, int _num) {
		long __functionAddress = Functions.set_instance_data_from_dynamic_vertex_buffer;
		invokeV(__functionAddress, _handle, _startVertex, _num);
	}

	// --- [ bgfx_set_texture ] ---

	/**
	 * 
	 *
	 * @param _stage   
	 * @param _sampler 
	 * @param _handle  
	 * @param _flags   
	 */
	public static void nbgfx_set_texture(byte _stage, short _sampler, short _handle, int _flags) {
		long __functionAddress = Functions.set_texture;
		invokeV(__functionAddress, _stage, _sampler, _handle, _flags);
	}

	/**
	 * 
	 *
	 * @param _stage   
	 * @param _sampler 
	 * @param _handle  
	 * @param _flags   
	 */
	public static void bgfx_set_texture(int _stage, short _sampler, short _handle, int _flags) {
		nbgfx_set_texture((byte)(_stage & 0xFF), _sampler, _handle, _flags);
	}

	// --- [ bgfx_set_texture_from_frame_buffer ] ---

	/**
	 * 
	 *
	 * @param _stage      
	 * @param _sampler    
	 * @param _handle     
	 * @param _attachment 
	 * @param _flags      
	 */
	public static void nbgfx_set_texture_from_frame_buffer(byte _stage, short _sampler, short _handle, byte _attachment, int _flags) {
		long __functionAddress = Functions.set_texture_from_frame_buffer;
		invokeV(__functionAddress, _stage, _sampler, _handle, _attachment, _flags);
	}

	/**
	 * 
	 *
	 * @param _stage      
	 * @param _sampler    
	 * @param _handle     
	 * @param _attachment 
	 * @param _flags      
	 */
	public static void bgfx_set_texture_from_frame_buffer(int _stage, short _sampler, short _handle, int _attachment, int _flags) {
		nbgfx_set_texture_from_frame_buffer((byte)(_stage & 0xFF), _sampler, _handle, (byte)(_attachment & 0xFF), _flags);
	}

	// --- [ bgfx_touch ] ---

	/**
	 * 
	 *
	 * @param _id 
	 */
	public static int nbgfx_touch(byte _id) {
		long __functionAddress = Functions.touch;
		return invokeI(__functionAddress, _id);
	}

	/**
	 * 
	 *
	 * @param _id 
	 */
	public static int bgfx_touch(int _id) {
		return nbgfx_touch((byte)(_id & 0xFF));
	}

	// --- [ bgfx_submit ] ---

	/**
	 * 
	 *
	 * @param _id            
	 * @param _handle        
	 * @param _depth         
	 * @param _preserveState 
	 */
	public static int nbgfx_submit(byte _id, short _handle, int _depth, boolean _preserveState) {
		long __functionAddress = Functions.submit;
		return invokeI(__functionAddress, _id, _handle, _depth, _preserveState);
	}

	/**
	 * 
	 *
	 * @param _id            
	 * @param _handle        
	 * @param _depth         
	 * @param _preserveState 
	 */
	public static int bgfx_submit(int _id, short _handle, int _depth, boolean _preserveState) {
		return nbgfx_submit((byte)(_id & 0xFF), _handle, _depth, _preserveState);
	}

	// --- [ bgfx_submit_occlusion_query ] ---

	/**
	 * 
	 *
	 * @param _id             
	 * @param _program        
	 * @param _occlusionQuery 
	 * @param _depth          
	 * @param _preserveState  
	 */
	public static int nbgfx_submit_occlusion_query(byte _id, short _program, short _occlusionQuery, int _depth, boolean _preserveState) {
		long __functionAddress = Functions.submit_occlusion_query;
		return invokeI(__functionAddress, _id, _program, _occlusionQuery, _depth, _preserveState);
	}

	/**
	 * 
	 *
	 * @param _id             
	 * @param _program        
	 * @param _occlusionQuery 
	 * @param _depth          
	 * @param _preserveState  
	 */
	public static int bgfx_submit_occlusion_query(int _id, short _program, short _occlusionQuery, int _depth, boolean _preserveState) {
		return nbgfx_submit_occlusion_query((byte)(_id & 0xFF), _program, _occlusionQuery, _depth, _preserveState);
	}

	// --- [ bgfx_submit_indirect ] ---

	/**
	 * 
	 *
	 * @param _id             
	 * @param _handle         
	 * @param _indirectHandle 
	 * @param _start          
	 * @param _num            
	 * @param _depth          
	 * @param _preserveState  
	 */
	public static int nbgfx_submit_indirect(byte _id, short _handle, short _indirectHandle, short _start, short _num, int _depth, boolean _preserveState) {
		long __functionAddress = Functions.submit_indirect;
		return invokeI(__functionAddress, _id, _handle, _indirectHandle, _start, _num, _depth, _preserveState);
	}

	/**
	 * 
	 *
	 * @param _id             
	 * @param _handle         
	 * @param _indirectHandle 
	 * @param _start          
	 * @param _num            
	 * @param _depth          
	 * @param _preserveState  
	 */
	public static int bgfx_submit_indirect(int _id, short _handle, short _indirectHandle, int _start, int _num, int _depth, boolean _preserveState) {
		return nbgfx_submit_indirect((byte)(_id & 0xFF), _handle, _indirectHandle, (short)(_start & 0xFFFF), (short)(_num & 0xFFFF), _depth, _preserveState);
	}

	// --- [ bgfx_set_image ] ---

	/**
	 * 
	 *
	 * @param _stage   
	 * @param _sampler 
	 * @param _handle  
	 * @param _mip     
	 * @param _access  one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 * @param _format  one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 */
	public static void nbgfx_set_image(byte _stage, short _sampler, short _handle, byte _mip, int _access, int _format) {
		long __functionAddress = Functions.set_image;
		invokeV(__functionAddress, _stage, _sampler, _handle, _mip, _access, _format);
	}

	/**
	 * 
	 *
	 * @param _stage   
	 * @param _sampler 
	 * @param _handle  
	 * @param _mip     
	 * @param _access  one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 * @param _format  one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 */
	public static void bgfx_set_image(int _stage, short _sampler, short _handle, int _mip, int _access, int _format) {
		nbgfx_set_image((byte)(_stage & 0xFF), _sampler, _handle, (byte)(_mip & 0xFF), _access, _format);
	}

	// --- [ bgfx_set_image_from_frame_buffer ] ---

	/**
	 * 
	 *
	 * @param _stage      
	 * @param _sampler    
	 * @param _handle     
	 * @param _attachment 
	 * @param _access     one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 * @param _format     one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 */
	public static void nbgfx_set_image_from_frame_buffer(byte _stage, short _sampler, short _handle, byte _attachment, int _access, int _format) {
		long __functionAddress = Functions.set_image_from_frame_buffer;
		invokeV(__functionAddress, _stage, _sampler, _handle, _attachment, _access, _format);
	}

	/**
	 * 
	 *
	 * @param _stage      
	 * @param _sampler    
	 * @param _handle     
	 * @param _attachment 
	 * @param _access     one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 * @param _format     one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_R11G11B10F TEXTURE_FORMAT_R11G11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
	 */
	public static void bgfx_set_image_from_frame_buffer(int _stage, short _sampler, short _handle, int _attachment, int _access, int _format) {
		nbgfx_set_image_from_frame_buffer((byte)(_stage & 0xFF), _sampler, _handle, (byte)(_attachment & 0xFF), _access, _format);
	}

	// --- [ bgfx_set_compute_index_buffer ] ---

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void nbgfx_set_compute_index_buffer(byte _stage, short _handle, int _access) {
		long __functionAddress = Functions.set_compute_index_buffer;
		invokeV(__functionAddress, _stage, _handle, _access);
	}

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void bgfx_set_compute_index_buffer(int _stage, short _handle, int _access) {
		nbgfx_set_compute_index_buffer((byte)(_stage & 0xFF), _handle, _access);
	}

	// --- [ bgfx_set_compute_vertex_buffer ] ---

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void nbgfx_set_compute_vertex_buffer(byte _stage, short _handle, int _access) {
		long __functionAddress = Functions.set_compute_vertex_buffer;
		invokeV(__functionAddress, _stage, _handle, _access);
	}

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void bgfx_set_compute_vertex_buffer(int _stage, short _handle, int _access) {
		nbgfx_set_compute_vertex_buffer((byte)(_stage & 0xFF), _handle, _access);
	}

	// --- [ bgfx_set_compute_dynamic_index_buffer ] ---

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void nbgfx_set_compute_dynamic_index_buffer(byte _stage, short _handle, int _access) {
		long __functionAddress = Functions.set_compute_dynamic_index_buffer;
		invokeV(__functionAddress, _stage, _handle, _access);
	}

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void bgfx_set_compute_dynamic_index_buffer(int _stage, short _handle, int _access) {
		nbgfx_set_compute_dynamic_index_buffer((byte)(_stage & 0xFF), _handle, _access);
	}

	// --- [ bgfx_set_compute_dynamic_vertex_buffer ] ---

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void nbgfx_set_compute_dynamic_vertex_buffer(byte _stage, short _handle, int _access) {
		long __functionAddress = Functions.set_compute_dynamic_vertex_buffer;
		invokeV(__functionAddress, _stage, _handle, _access);
	}

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void bgfx_set_compute_dynamic_vertex_buffer(int _stage, short _handle, int _access) {
		nbgfx_set_compute_dynamic_vertex_buffer((byte)(_stage & 0xFF), _handle, _access);
	}

	// --- [ bgfx_set_compute_indirect_buffer ] ---

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void nbgfx_set_compute_indirect_buffer(byte _stage, short _handle, int _access) {
		long __functionAddress = Functions.set_compute_indirect_buffer;
		invokeV(__functionAddress, _stage, _handle, _access);
	}

	/**
	 * 
	 *
	 * @param _stage  
	 * @param _handle 
	 * @param _access one of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
	 */
	public static void bgfx_set_compute_indirect_buffer(int _stage, short _handle, int _access) {
		nbgfx_set_compute_indirect_buffer((byte)(_stage & 0xFF), _handle, _access);
	}

	// --- [ bgfx_dispatch ] ---

	/**
	 * 
	 *
	 * @param _id     
	 * @param _handle 
	 * @param _numX   
	 * @param _numY   
	 * @param _numZ   
	 * @param _flags  
	 */
	public static int nbgfx_dispatch(byte _id, short _handle, short _numX, short _numY, short _numZ, byte _flags) {
		long __functionAddress = Functions.dispatch;
		return invokeI(__functionAddress, _id, _handle, _numX, _numY, _numZ, _flags);
	}

	/**
	 * 
	 *
	 * @param _id     
	 * @param _handle 
	 * @param _numX   
	 * @param _numY   
	 * @param _numZ   
	 * @param _flags  
	 */
	public static int bgfx_dispatch(int _id, short _handle, int _numX, int _numY, int _numZ, int _flags) {
		return nbgfx_dispatch((byte)(_id & 0xFF), _handle, (short)(_numX & 0xFFFF), (short)(_numY & 0xFFFF), (short)(_numZ & 0xFFFF), (byte)(_flags & 0xFF));
	}

	// --- [ bgfx_dispatch_indirect ] ---

	/**
	 * 
	 *
	 * @param _id             
	 * @param _handle         
	 * @param _indirectHandle 
	 * @param _start          
	 * @param _num            
	 * @param _flags          
	 */
	public static int nbgfx_dispatch_indirect(byte _id, short _handle, short _indirectHandle, short _start, short _num, byte _flags) {
		long __functionAddress = Functions.dispatch_indirect;
		return invokeI(__functionAddress, _id, _handle, _indirectHandle, _start, _num, _flags);
	}

	/**
	 * 
	 *
	 * @param _id             
	 * @param _handle         
	 * @param _indirectHandle 
	 * @param _start          
	 * @param _num            
	 * @param _flags          
	 */
	public static int bgfx_dispatch_indirect(int _id, short _handle, short _indirectHandle, int _start, int _num, int _flags) {
		return nbgfx_dispatch_indirect((byte)(_id & 0xFF), _handle, _indirectHandle, (short)(_start & 0xFFFF), (short)(_num & 0xFFFF), (byte)(_flags & 0xFF));
	}

	// --- [ bgfx_discard ] ---

	/**  */
	public static void bgfx_discard() {
		long __functionAddress = Functions.discard;
		invokeV(__functionAddress);
	}

	// --- [ bgfx_blit ] ---

	/**
	 * 
	 *
	 * @param _id     
	 * @param _dst    
	 * @param _dstMip 
	 * @param _dstX   
	 * @param _dstY   
	 * @param _dstZ   
	 * @param _src    
	 * @param _srcMip 
	 * @param _srcX   
	 * @param _srcY   
	 * @param _srcZ   
	 * @param _width  
	 * @param _height 
	 * @param _depth  
	 */
	public static void nbgfx_blit(byte _id, short _dst, byte _dstMip, short _dstX, short _dstY, short _dstZ, short _src, byte _srcMip, short _srcX, short _srcY, short _srcZ, short _width, short _height, short _depth) {
		long __functionAddress = Functions.blit;
		invokeV(__functionAddress, _id, _dst, _dstMip, _dstX, _dstY, _dstZ, _src, _srcMip, _srcX, _srcY, _srcZ, _width, _height, _depth);
	}

	/**
	 * 
	 *
	 * @param _id     
	 * @param _dst    
	 * @param _dstMip 
	 * @param _dstX   
	 * @param _dstY   
	 * @param _dstZ   
	 * @param _src    
	 * @param _srcMip 
	 * @param _srcX   
	 * @param _srcY   
	 * @param _srcZ   
	 * @param _width  
	 * @param _height 
	 * @param _depth  
	 */
	public static void bgfx_blit(int _id, short _dst, int _dstMip, int _dstX, int _dstY, int _dstZ, short _src, int _srcMip, int _srcX, int _srcY, int _srcZ, int _width, int _height, int _depth) {
		nbgfx_blit((byte)(_id & 0xFF), _dst, (byte)(_dstMip & 0xFF), (short)(_dstX & 0xFFFF), (short)(_dstY & 0xFFFF), (short)(_dstZ & 0xFFFF), _src, (byte)(_srcMip & 0xFF), (short)(_srcX & 0xFFFF), (short)(_srcY & 0xFFFF), (short)(_srcZ & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF), (short)(_depth & 0xFFFF));
	}

	// --- [ bgfx_blit_frame_buffer ] ---

	/**
	 * 
	 *
	 * @param _id         
	 * @param _dst        
	 * @param _dstMip     
	 * @param _dstX       
	 * @param _dstY       
	 * @param _dstZ       
	 * @param _src        
	 * @param _attachment 
	 * @param _srcMip     
	 * @param _srcX       
	 * @param _srcY       
	 * @param _srcZ       
	 * @param _width      
	 * @param _height     
	 * @param _depth      
	 */
	public static void nbgfx_blit_frame_buffer(byte _id, short _dst, byte _dstMip, short _dstX, short _dstY, short _dstZ, short _src, byte _attachment, byte _srcMip, short _srcX, short _srcY, short _srcZ, short _width, short _height, short _depth) {
		long __functionAddress = Functions.blit_frame_buffer;
		invokeV(__functionAddress, _id, _dst, _dstMip, _dstX, _dstY, _dstZ, _src, _attachment, _srcMip, _srcX, _srcY, _srcZ, _width, _height, _depth);
	}

	/**
	 * 
	 *
	 * @param _id         
	 * @param _dst        
	 * @param _dstMip     
	 * @param _dstX       
	 * @param _dstY       
	 * @param _dstZ       
	 * @param _src        
	 * @param _attachment 
	 * @param _srcMip     
	 * @param _srcX       
	 * @param _srcY       
	 * @param _srcZ       
	 * @param _width      
	 * @param _height     
	 * @param _depth      
	 */
	public static void bgfx_blit_frame_buffer(int _id, short _dst, int _dstMip, int _dstX, int _dstY, int _dstZ, short _src, int _attachment, int _srcMip, int _srcX, int _srcY, int _srcZ, int _width, int _height, int _depth) {
		nbgfx_blit_frame_buffer((byte)(_id & 0xFF), _dst, (byte)(_dstMip & 0xFF), (short)(_dstX & 0xFFFF), (short)(_dstY & 0xFFFF), (short)(_dstZ & 0xFFFF), _src, (byte)(_attachment & 0xFF), (byte)(_srcMip & 0xFF), (short)(_srcX & 0xFFFF), (short)(_srcY & 0xFFFF), (short)(_srcZ & 0xFFFF), (short)(_width & 0xFFFF), (short)(_height & 0xFFFF), (short)(_depth & 0xFFFF));
	}

	// --- [ bgfx_save_screen_shot ] ---

	/**
	 * 
	 *
	 * @param _filePath 
	 */
	public static void nbgfx_save_screen_shot(long _filePath) {
		long __functionAddress = Functions.save_screen_shot;
		invokePV(__functionAddress, _filePath);
	}

	/**
	 * 
	 *
	 * @param _filePath 
	 */
	public static void bgfx_save_screen_shot(ByteBuffer _filePath) {
		if ( CHECKS )
			checkNT1(_filePath);
		nbgfx_save_screen_shot(memAddress(_filePath));
	}

	/**
	 * 
	 *
	 * @param _filePath 
	 */
	public static void bgfx_save_screen_shot(CharSequence _filePath) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer _filePathEncoded = stack.UTF8(_filePath);
			nbgfx_save_screen_shot(memAddress(_filePathEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ bgfx_set_platform_data ] ---

	/**
	 * 
	 *
	 * @param _data 
	 */
	public static void nbgfx_set_platform_data(long _data) {
		long __functionAddress = Functions.set_platform_data;
		invokePV(__functionAddress, _data);
	}

	/**
	 * 
	 *
	 * @param _data 
	 */
	public static void bgfx_set_platform_data(BGFXPlatformData _data) {
		nbgfx_set_platform_data(_data.address());
	}

	/** Array version of: {@link #bgfx_vertex_pack vertex_pack} */
	public static void bgfx_vertex_pack(float[] _input, boolean _inputNormalized, int _attr, BGFXVertexDecl _decl, ByteBuffer _data, int _index) {
		long __functionAddress = Functions.vertex_pack;
		if ( CHECKS )
			checkBuffer(_input, 4);
		invokePPPV(__functionAddress, _input, _inputNormalized, _attr, _decl.address(), memAddress(_data), _index);
	}

	/** Array version of: {@link #bgfx_vertex_unpack vertex_unpack} */
	public static void bgfx_vertex_unpack(float[] _output, int _attr, BGFXVertexDecl _decl, ByteBuffer _data, int _index) {
		long __functionAddress = Functions.vertex_unpack;
		if ( CHECKS )
			checkBuffer(_output, 4);
		invokePPPV(__functionAddress, _output, _attr, _decl.address(), memAddress(_data), _index);
	}

	/** Array version of: {@link #bgfx_weld_vertices weld_vertices} */
	public static short bgfx_weld_vertices(short[] _output, BGFXVertexDecl _decl, ByteBuffer _data, float _epsilon) {
		long __functionAddress = Functions.weld_vertices;
		return invokePPPS(__functionAddress, _output, _decl.address(), memAddress(_data), (short)_output.length, _epsilon);
	}

	/** short[] version of: {@link #bgfx_topology_convert topology_convert} */
	public static int bgfx_topology_convert(int _conversion, ByteBuffer _dst, short[] _indices, boolean _index32) {
		long __functionAddress = Functions.topology_convert;
		return invokePPI(__functionAddress, _conversion, memAddressSafe(_dst), _dst == null ? 0 : _dst.remaining(), _indices, _indices.length, _index32);
	}

	/** int[] version of: {@link #bgfx_topology_convert topology_convert} */
	public static int bgfx_topology_convert(int _conversion, ByteBuffer _dst, int[] _indices, boolean _index32) {
		long __functionAddress = Functions.topology_convert;
		return invokePPI(__functionAddress, _conversion, memAddressSafe(_dst), _dst == null ? 0 : _dst.remaining(), _indices, _indices.length, _index32);
	}

	/** Array version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list} */
	public static void bgfx_topology_sort_tri_list(int _sort, ByteBuffer _dst, float[] _dir, float[] _pos, ByteBuffer _vertices, int _stride, ByteBuffer _indices, boolean _index32) {
		long __functionAddress = Functions.topology_sort_tri_list;
		if ( CHECKS ) {
			checkBuffer(_dir, 3);
			checkBuffer(_pos, 3);
		}
		invokePPPPPV(__functionAddress, _sort, memAddress(_dst), _dst.remaining(), _dir, _pos, memAddress(_vertices), _stride, memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32);
	}

	/** short[] version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list} */
	public static void bgfx_topology_sort_tri_list(int _sort, ByteBuffer _dst, float[] _dir, float[] _pos, ByteBuffer _vertices, int _stride, short[] _indices, boolean _index32) {
		long __functionAddress = Functions.topology_sort_tri_list;
		if ( CHECKS ) {
			checkBuffer(_dir, 3);
			checkBuffer(_pos, 3);
		}
		invokePPPPPV(__functionAddress, _sort, memAddress(_dst), _dst.remaining(), _dir, _pos, memAddress(_vertices), _stride, _indices, _indices.length, _index32);
	}

	/** int[] version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list} */
	public static void bgfx_topology_sort_tri_list(int _sort, ByteBuffer _dst, float[] _dir, float[] _pos, ByteBuffer _vertices, int _stride, int[] _indices, boolean _index32) {
		long __functionAddress = Functions.topology_sort_tri_list;
		if ( CHECKS ) {
			checkBuffer(_dir, 3);
			checkBuffer(_pos, 3);
		}
		invokePPPPPV(__functionAddress, _sort, memAddress(_dst), _dst.remaining(), _dir, _pos, memAddress(_vertices), _stride, _indices, _indices.length, _index32);
	}

	/** Array version of: {@link #bgfx_get_supported_renderers get_supported_renderers} */
	public static byte bgfx_get_supported_renderers(int[] _enum) {
		long __functionAddress = Functions.get_supported_renderers;
		if ( CHECKS )
			checkBuffer(_enum, BGFX_RENDERER_TYPE_COUNT);
		return invokePB(__functionAddress, _enum);
	}

	/** Array version of: {@link #bgfx_get_shader_uniforms get_shader_uniforms} */
	public static short bgfx_get_shader_uniforms(short _handle, short[] _uniforms) {
		long __functionAddress = Functions.get_shader_uniforms;
		return invokePS(__functionAddress, _handle, _uniforms, (short)_uniforms.length);
	}

	/** Array version of: {@link #bgfx_create_frame_buffer_from_handles create_frame_buffer_from_handles} */
	public static short bgfx_create_frame_buffer_from_handles(int _num, short[] _handles, boolean _destroyTextures) {
		long __functionAddress = Functions.create_frame_buffer_from_handles;
		if ( CHECKS )
			checkBuffer(_handles, _num);
		return invokePS(__functionAddress, (byte)(_num & 0xFF), _handles, _destroyTextures);
	}

	/** Array version of: {@link #bgfx_set_palette_color set_palette_color} */
	public static void bgfx_set_palette_color(int _index, float[] _rgba) {
		long __functionAddress = Functions.set_palette_color;
		if ( CHECKS )
			checkBuffer(_rgba, 4);
		invokePV(__functionAddress, (byte)(_index & 0xFF), _rgba);
	}

	/** Array version of: {@link #bgfx_set_view_transform set_view_transform} */
	public static void bgfx_set_view_transform(int _id, float[] _view, float[] _proj) {
		long __functionAddress = Functions.set_view_transform;
		invokePPV(__functionAddress, (byte)(_id & 0xFF), _view, _proj);
	}

	/** Array version of: {@link #bgfx_set_view_transform_stereo set_view_transform_stereo} */
	public static void bgfx_set_view_transform_stereo(int _id, float[] _view, float[] _projL, int _flags, float[] _projR) {
		long __functionAddress = Functions.set_view_transform_stereo;
		invokePPPV(__functionAddress, (byte)(_id & 0xFF), _view, _projL, (byte)(_flags & 0xFF), _projR);
	}

	/** Array version of: {@link #bgfx_set_transform set_transform} */
	public static int bgfx_set_transform(float[] _mtx, int _num) {
		long __functionAddress = Functions.set_transform;
		return invokePI(__functionAddress, _mtx, (short)(_num & 0xFFFF));
	}

}