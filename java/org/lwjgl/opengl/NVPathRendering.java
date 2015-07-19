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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/path_rendering.txt">NV_path_rendering</a> extension.
 * 
 * <p>Conventional OpenGL supports rendering images (pixel rectangles and bitmaps) and simple geometric primitives (points, lines, polygons).</p>
 * 
 * <p>This extension adds a new rendering paradigm, known as path rendering, for rendering filled and stroked paths. Path rendering is not novel but rather a
 * standard part of most resolution-independent 2D rendering systems such as Flash, PDF, Silverlight, SVG, Java 2D, Office drawings, TrueType fonts,
 * PostScript and its fonts, Quartz 2D, XML Paper Specification (XPS), and OpenVG. What is novel is the ability to mix path rendering with arbitrary
 * OpenGL 3D rendering and imaging.</p>
 * 
 * <p>With this extension, path rendering becomes a first-class rendering mode within the OpenGL graphics system that can be arbitrarily mixed with existing
 * OpenGL rendering and can take advantage of OpenGL's existing mechanisms for texturing, programmability, and per-fragment operations.</p>
 * 
 * <p>Unlike geometric primitive rendering, paths are specified on a 2D (non-projective) plane rather than in 3D (projective) space. Even though the path is
 * defined in a 2D plane, every path can be transformed into 3D clip space allowing for 3D view frustum & user-defined clipping, depth offset, and depth
 * testing in the same manner as geometric primitive rendering.</p>
 * 
 * <p>Both geometric primitive rendering and path rendering support rasterization of edges defined by line segments; however, path rendering also allows path
 * segments to be specified by Bezier (cubic or quadratic) curves or partial elliptical arcs. This allows path rendering to define truly curved primitive
 * boundaries unlike the straight edges of line and polygon primitives. Whereas geometric primitive rendering requires convex polygons for well-defined
 * rendering results, path rendering allows (and encourages!) concave and curved outlines to be specified. These paths are even allowed to self-intersect.</p>
 * 
 * <p>When filling closed paths, the winding of paths (counterclockwise or clockwise) determines whether pixels are inside or outside of the path.</p>
 * 
 * <p>Paths can also be stroked whereby, conceptually, a fixed-width "brush" is pulled along the path such that the brush remains orthogonal to the gradient
 * of each path segment. Samples within the sweep of this brush are considered inside the stroke of the path.</p>
 * 
 * <p>This extension supports path rendering through a sequence of three operations:
 * <ol>
 * <li>Path specification is the process of creating and updating a path object consisting of a set of path commands and a corresponding set of 2D
 * vertices.</p>
 * 
 * <p>Path commands can be specified explicitly from path command and coordinate data, parsed from a string based on standard grammars for representing
 * paths, or specified by a particular glyph of standard font representations. Also new paths can be specified by weighting one or more existing paths
 * so long as all the weighted paths have consistent command sequences.</p>
 * 
 * <p>Each path object contains zero or more subpaths specified by a sequence of line segments, partial elliptical arcs, and (cubic or quadratic) Bezier
 * curve segments. Each path may contain multiple subpaths that can be closed (forming a contour) or open.</li>
 * <li>Path stenciling is the process of updating the stencil buffer based on a path's coverage transformed into window space.</p>
 * 
 * <p>Path stenciling can determine either the filled or stroked coverage of a path.</p>
 * 
 * <p>The details of path stenciling are explained within the core of the specification.</p>
 * 
 * <p>Stenciling a stroked path supports all the standard embellishments for path stroking such as end caps, join styles, miter limits, dashing, and dash
 * caps. These stroking properties specified are parameters of path objects.</li>
 * <li>Path covering is the process of emitting simple (convex & planar) geometry that (conservatively) "covers" the path's sample coverage in the stencil
 * buffer. During path covering, stencil testing can be configured to discard fragments not within the actual coverage of the path as determined by
 * prior path stenciling.</p>
 * 
 * <p>Path covering can cover either the filled or stroked coverage of a path.</p>
 * 
 * <p>The details of path covering are explained within the core of the specification.</li>
 * </ol>
 * To render a path object into the color buffer, an application specifies a path object and then uses a two-step rendering process. First, the path
 * object is stenciled whereby the path object's stroked or filled coverage is rasterized into the stencil buffer. Second, the path object is covered
 * whereby conservative bounding geometry for the path is transformed and rasterized with stencil testing configured to test against the coverage
 * information written to the stencil buffer in the first step so that only fragments covered by the path are written during this second step. Also during
 * this second step written pixels typically have their stencil value reset (so there's no need for clearing the stencil buffer between rendering each
 * path).</p>
 * 
 * <p>Requires <a href="http://www.opengl.org/registry/specs/NV/path_rendering.txt">NV_path_rendering</a>.</p>
 */
public final class NVPathRendering {

	/** Accepted in elements of the {@code commands} array parameter of PathCommandsNV and PathSubCommandsNV. */
	public static final int
		GL_CLOSE_PATH_NV                         = 0x0,
		GL_MOVE_TO_NV                            = 0x2,
		GL_RELATIVE_MOVE_TO_NV                   = 0x3,
		GL_LINE_TO_NV                            = 0x4,
		GL_RELATIVE_LINE_TO_NV                   = 0x5,
		GL_HORIZONTAL_LINE_TO_NV                 = 0x6,
		GL_RELATIVE_HORIZONTAL_LINE_TO_NV        = 0x7,
		GL_VERTICAL_LINE_TO_NV                   = 0x8,
		GL_RELATIVE_VERTICAL_LINE_TO_NV          = 0x9,
		GL_QUADRATIC_CURVE_TO_NV                 = 0xA,
		GL_RELATIVE_QUADRATIC_CURVE_TO_NV        = 0xB,
		GL_CUBIC_CURVE_TO_NV                     = 0xC,
		GL_RELATIVE_CUBIC_CURVE_TO_NV            = 0xD,
		GL_SMOOTH_QUADRATIC_CURVE_TO_NV          = 0xE,
		GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV = 0xF,
		GL_SMOOTH_CUBIC_CURVE_TO_NV              = 0x10,
		GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV     = 0x11,
		GL_SMALL_CCW_ARC_TO_NV                   = 0x12,
		GL_RELATIVE_SMALL_CCW_ARC_TO_NV          = 0x13,
		GL_SMALL_CW_ARC_TO_NV                    = 0x14,
		GL_RELATIVE_SMALL_CW_ARC_TO_NV           = 0x15,
		GL_LARGE_CCW_ARC_TO_NV                   = 0x16,
		GL_RELATIVE_LARGE_CCW_ARC_TO_NV          = 0x17,
		GL_LARGE_CW_ARC_TO_NV                    = 0x18,
		GL_RELATIVE_LARGE_CW_ARC_TO_NV           = 0x19,
		GL_CONIC_CURVE_TO_NV                     = 0x1A,
		GL_RELATIVE_CONIC_CURVE_TO_NV            = 0x1B,
		GL_ROUNDED_RECT_NV                       = 0xE8,
		GL_RELATIVE_ROUNDED_RECT_NV              = 0xE9,
		GL_ROUNDED_RECT2_NV                      = 0xEA,
		GL_RELATIVE_ROUNDED_RECT2_NV             = 0xEB,
		GL_ROUNDED_RECT4_NV                      = 0xEC,
		GL_RELATIVE_ROUNDED_RECT4_NV             = 0xED,
		GL_ROUNDED_RECT8_NV                      = 0xEE,
		GL_RELATIVE_ROUNDED_RECT8_NV             = 0xEF,
		GL_RESTART_PATH_NV                       = 0xF0,
		GL_DUP_FIRST_CUBIC_CURVE_TO_NV           = 0xF2,
		GL_DUP_LAST_CUBIC_CURVE_TO_NV            = 0xF4,
		GL_RECT_NV                               = 0xF6,
		GL_RELATIVE_RECT_NV                      = 0xF7,
		GL_CIRCULAR_CCW_ARC_TO_NV                = 0xF8,
		GL_CIRCULAR_CW_ARC_TO_NV                 = 0xFA,
		GL_CIRCULAR_TANGENT_ARC_TO_NV            = 0xFC,
		GL_ARC_TO_NV                             = 0xFE,
		GL_RELATIVE_ARC_TO_NV                    = 0xFF;

	/** Accepted by the {@code format} parameter of PathStringNV. */
	public static final int
		GL_PATH_FORMAT_SVG_NV = 0x9070,
		GL_PATH_FORMAT_PS_NV  = 0x9071;

	/** Accepted by the {@code fontTarget} parameter of PathGlyphsNV, PathGlyphRangeNV, and PathGlyphIndexRangeNV. */
	public static final int
		GL_STANDARD_FONT_NAME_NV = 0x9072,
		GL_SYSTEM_FONT_NAME_NV   = 0x9073,
		GL_FILE_NAME_NV          = 0x9074;

	/** Accepted by the {@code fontTarget} parameter of PathMemoryGlyphIndexArrayNV. */
	public static final int GL_STANDARD_FONT_FORMAT_NV = 0x936C;

	/** Accepted by the {@code handleMissingGlyph} parameter of PathGlyphsNV and PathGlyphRangeNV. */
	public static final int
		GL_SKIP_MISSING_GLYPH_NV = 0x90A9,
		GL_USE_MISSING_GLYPH_NV  = 0x90AA;

	/** Returned by PathGlyphIndexRangeNV. */
	public static final int
		GL_FONT_GLYPHS_AVAILABLE_NV   = 0x9368,
		GL_FONT_TARGET_UNAVAILABLE_NV = 0x9369,
		GL_FONT_UNAVAILABLE_NV        = 0x936A,
		GL_FONT_UNINTELLIGIBLE_NV     = 0x936B;

	/**
	 * Accepted by the {@code pname} parameter of PathParameterfNV, PathParameterfvNV, GetPathParameterfvNV, PathParameteriNV, PathParameterivNV, and
	 * GetPathParameterivNV.
	 */
	public static final int
		GL_PATH_STROKE_WIDTH_NV      = 0x9075,
		GL_PATH_INITIAL_END_CAP_NV   = 0x9077,
		GL_PATH_TERMINAL_END_CAP_NV  = 0x9078,
		GL_PATH_JOIN_STYLE_NV        = 0x9079,
		GL_PATH_MITER_LIMIT_NV       = 0x907A,
		GL_PATH_INITIAL_DASH_CAP_NV  = 0x907C,
		GL_PATH_TERMINAL_DASH_CAP_NV = 0x907D,
		GL_PATH_DASH_OFFSET_NV       = 0x907E,
		GL_PATH_CLIENT_LENGTH_NV     = 0x907F,
		GL_PATH_DASH_OFFSET_RESET_NV = 0x90B4,
		GL_PATH_FILL_MODE_NV         = 0x9080,
		GL_PATH_FILL_MASK_NV         = 0x9081,
		GL_PATH_FILL_COVER_MODE_NV   = 0x9082,
		GL_PATH_STROKE_COVER_MODE_NV = 0x9083,
		GL_PATH_STROKE_MASK_NV       = 0x9084,
		GL_PATH_STROKE_BOUND_NV      = 0x9086;

	/** Accepted by the {@code pname} parameter of PathParameterfNV and PathParameterfvNV. */
	public static final int
		GL_PATH_END_CAPS_NV  = 0x9076,
		GL_PATH_DASH_CAPS_NV = 0x907B;

	/** Accepted by the {@code fillMode} parameter of StencilFillPathNV and StencilFillPathInstancedNV. */
	public static final int
		GL_COUNT_UP_NV   = 0x9088,
		GL_COUNT_DOWN_NV = 0x9089;

	/** Accepted by the {@code color} parameter of PathColorGenNV, GetPathColorGenivNV, and GetPathColorGenfvNV. */
	public static final int
		GL_PRIMARY_COLOR_NV   = 0x852C,
		GL_SECONDARY_COLOR_NV = 0x852D;

	/** Accepted by the {@code genMode} parameter of PathColorGenNV, PathTexGenNV, ProgramPathFragmentInputGenNV. */
	public static final int GL_PATH_OBJECT_BOUNDING_BOX_NV = 0x908A;

	/** Accepted by the {@code coverMode} parameter of CoverFillPathNV and CoverFillPathInstancedNV. */
	public static final int
		GL_CONVEX_HULL_NV  = 0x908B,
		GL_BOUNDING_BOX_NV = 0x908D;

	/**
	 * Accepted by the {@code transformType} parameter of StencilFillPathInstancedNV, StencilStrokePathInstancedNV, CoverFillPathInstancedNV, and
	 * CoverStrokePathInstancedNV.
	 */
	public static final int
		GL_TRANSLATE_X_NV         = 0x908E,
		GL_TRANSLATE_Y_NV         = 0x908F,
		GL_TRANSLATE_2D_NV        = 0x9090,
		GL_TRANSLATE_3D_NV        = 0x9091,
		GL_AFFINE_2D_NV           = 0x9092,
		GL_AFFINE_3D_NV           = 0x9094,
		GL_TRANSPOSE_AFFINE_2D_NV = 0x9096,
		GL_TRANSPOSE_AFFINE_3D_NV = 0x9098;

	/**
	 * Accepted by the {@code type} or {@code pathNameType} parameter of StencilFillPathInstancedNV, StencilStrokePathInstancedNV, CoverFillPathInstancedNV,
	 * CoverStrokePathInstancedNV, GetPathMetricsNV, and GetPathSpacingNV.
	 */
	public static final int
		GL_UTF8_NV  = 0x909A,
		GL_UTF16_NV = 0x909B;

	/** Accepted by the {@code coverMode} parameter of CoverFillPathInstancedNV. */
	public static final int GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV = 0x909C;

	/** Accepted by the {@code pname} parameter of GetPathParameterfvNV and GetPathParameterivNV. */
	public static final int
		GL_PATH_COMMAND_COUNT_NV       = 0x909D,
		GL_PATH_COORD_COUNT_NV         = 0x909E,
		GL_PATH_DASH_ARRAY_COUNT_NV    = 0x909F,
		GL_PATH_COMPUTED_LENGTH_NV     = 0x90A0,
		GL_PATH_FILL_BOUNDING_BOX_NV   = 0x90A1,
		GL_PATH_STROKE_BOUNDING_BOX_NV = 0x90A2;

	/**
	 * Accepted by the {@code value} parameter of PathParameterfNV, PathParameterfvNV, PathParameteriNV, and PathParameterivNV when {@code pname} is one of
	 * PATH_END_CAPS_NV, PATH_INTIAL_END_CAP_NV, PATH_TERMINAL_END_CAP_NV, PATH_DASH_CAPS_NV, PATH_INITIAL_DASH_CAP_NV, and PATH_TERMINAL_DASH_CAP_NV.
	 */
	public static final int
		GL_SQUARE_NV     = 0x90A3,
		GL_ROUND_NV      = 0x90A4,
		GL_TRIANGULAR_NV = 0x90A5;

	/**
	 * Accepted by the {@code value} parameter of PathParameterfNV, PathParameterfvNV, PathParameteriNV, and PathParameterivNV when {@code pname} is
	 * PATH_JOIN_STYLE_NV.
	 */
	public static final int
		GL_BEVEL_NV          = 0x90A6,
		GL_MITER_REVERT_NV   = 0x90A7,
		GL_MITER_TRUNCATE_NV = 0x90A8;

	/**
	 * Accepted by the {@code value} parameter of PathParameterfNV, PathParameterfvNV, PathParameteriNV, and PathParameterivNV when {@code pname} is
	 * PATH_DASH_OFFSET_RESET_NV.
	 */
	public static final int
		GL_MOVE_TO_RESETS_NV    = 0x90B5,
		GL_MOVE_TO_CONTINUES_NV = 0x90B6;

	/** Accepted by the {@code fontStyle} parameter of PathGlyphsNV, PathGlyphRangeNV, and PathGlyphIndexRangeNV. */
	public static final int
		GL_BOLD_BIT_NV   = 0x1,
		GL_ITALIC_BIT_NV = 0x2;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_PATH_ERROR_POSITION_NV              = 0x90AB,
		GL_PATH_FOG_GEN_MODE_NV                = 0x90AC,
		GL_PATH_STENCIL_FUNC_NV                = 0x90B7,
		GL_PATH_STENCIL_REF_NV                 = 0x90B8,
		GL_PATH_STENCIL_VALUE_MASK_NV          = 0x90B9,
		GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV = 0x90BD,
		GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV  = 0x90BE,
		GL_PATH_COVER_DEPTH_FUNC_NV            = 0x90BF;

	/** Accepted as a bit within the {@code metricQueryMask} parameter of GetPathMetricRangeNV or GetPathMetricsNV. */
	public static final int
		GL_GLYPH_WIDTH_BIT_NV                      = 0x1,
		GL_GLYPH_HEIGHT_BIT_NV                     = 0x2,
		GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV       = 0x4,
		GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV       = 0x8,
		GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV = 0x10,
		GL_GLYPH_VERTICAL_BEARING_X_BIT_NV         = 0x20,
		GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV         = 0x40,
		GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV   = 0x80,
		GL_GLYPH_HAS_KERNING_BIT_NV                = 0x100,
		GL_FONT_X_MIN_BOUNDS_BIT_NV                = 0x10000,
		GL_FONT_Y_MIN_BOUNDS_BIT_NV                = 0x20000,
		GL_FONT_X_MAX_BOUNDS_BIT_NV                = 0x40000,
		GL_FONT_Y_MAX_BOUNDS_BIT_NV                = 0x80000,
		GL_FONT_UNITS_PER_EM_BIT_NV                = 0x100000,
		GL_FONT_ASCENDER_BIT_NV                    = 0x200000,
		GL_FONT_DESCENDER_BIT_NV                   = 0x400000,
		GL_FONT_HEIGHT_BIT_NV                      = 0x800000,
		GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV           = 0x1000000,
		GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV          = 0x2000000,
		GL_FONT_UNDERLINE_POSITION_BIT_NV          = 0x4000000,
		GL_FONT_UNDERLINE_THICKNESS_BIT_NV         = 0x8000000,
		GL_FONT_HAS_KERNING_BIT_NV                 = 0x10000000,
		GL_FONT_NUM_GLYPH_INDICES_BIT_NV           = 0x20000000;

	/** Accepted by the {@code pathListMode} parameter of GetPathSpacingNV. */
	public static final int
		GL_ACCUM_ADJACENT_PAIRS_NV = 0x90AD,
		GL_ADJACENT_PAIRS_NV       = 0x90AE,
		GL_FIRST_TO_REST_NV        = 0x90AF;

	/** Accepted by the {@code pname} parameter of GetPathColorGenivNV, GetPathColorGenfvNV, GetPathTexGenivNV and GetPathTexGenfvNV. */
	public static final int
		GL_PATH_GEN_MODE_NV  = 0x90B0,
		GL_PATH_GEN_COEFF_NV = 0x90B1;

	/** Accepted by the {@code pname} parameter of GetPathColorGenivNV and GetPathColorGenfvNV. */
	public static final int GL_PATH_GEN_COLOR_FORMAT_NV = 0x90B2;

	/** Accepted by the {@code pname} parameter of GetPathTexGenivNV and GetPathTexGenfvNV. */
	public static final int GL_PATH_GEN_COMPONENTS_NV = 0x90B3;

	/**
	 * Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv,
	 * GetProgramResourcefvNV, and GetProgramResourceLocation.
	 */
	public static final int GL_FRAGMENT_INPUT_NV = 0x936D;

	/** Token values for matrices. */
	public static final int
		GL_PATH_PROJECTION_NV                  = 0x1701,
		GL_PATH_MODELVIEW_NV                   = 0x1700,
		GL_PATH_MODELVIEW_STACK_DEPTH_NV       = 0xBA3,
		GL_PATH_MODELVIEW_MATRIX_NV            = 0xBA6,
		GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV   = 0xD36,
		GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV  = 0x84E3,
		GL_PATH_PROJECTION_STACK_DEPTH_NV      = 0xBA4,
		GL_PATH_PROJECTION_MATRIX_NV           = 0xBA7,
		GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV  = 0xD38,
		GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV = 0x84E4;

	/** Function address. */
	@JavadocExclude
	public final long
		PathCommandsNV,
		PathCoordsNV,
		PathSubCommandsNV,
		PathSubCoordsNV,
		PathStringNV,
		PathGlyphsNV,
		PathGlyphRangeNV,
		PathGlyphIndexArrayNV,
		PathMemoryGlyphIndexArrayNV,
		CopyPathNV,
		InterpolatePathsNV,
		TransformPathNV,
		PathParameterivNV,
		PathParameteriNV,
		PathParameterfvNV,
		PathParameterfNV,
		PathDashArrayNV,
		GenPathsNV,
		DeletePathsNV,
		IsPathNV,
		PathStencilFuncNV,
		PathStencilDepthOffsetNV,
		StencilFillPathNV,
		StencilStrokePathNV,
		StencilFillPathInstancedNV,
		StencilStrokePathInstancedNV,
		PathCoverDepthFuncNV,
		PathColorGenNV,
		PathTexGenNV,
		PathFogGenNV,
		CoverFillPathNV,
		CoverStrokePathNV,
		CoverFillPathInstancedNV,
		CoverStrokePathInstancedNV,
		StencilThenCoverFillPathNV,
		StencilThenCoverStrokePathNV,
		StencilThenCoverFillPathInstancedNV,
		StencilThenCoverStrokePathInstancedNV,
		PathGlyphIndexRangeNV,
		ProgramPathFragmentInputGenNV,
		GetPathParameterivNV,
		GetPathParameterfvNV,
		GetPathCommandsNV,
		GetPathCoordsNV,
		GetPathDashArrayNV,
		GetPathMetricsNV,
		GetPathMetricRangeNV,
		GetPathSpacingNV,
		GetPathColorGenivNV,
		GetPathColorGenfvNV,
		GetPathTexGenivNV,
		GetPathTexGenfvNV,
		IsPointInFillPathNV,
		IsPointInStrokePathNV,
		GetPathLengthNV,
		PointAlongPathNV,
		MatrixLoad3x2fNV,
		MatrixLoad3x3fNV,
		MatrixLoadTranspose3x3fNV,
		MatrixMult3x2fNV,
		MatrixMult3x3fNV,
		MatrixMultTranspose3x3fNV,
		GetProgramResourcefvNV;

	@JavadocExclude
	public NVPathRendering(FunctionProvider provider) {
		PathCommandsNV = provider.getFunctionAddress("glPathCommandsNV");
		PathCoordsNV = provider.getFunctionAddress("glPathCoordsNV");
		PathSubCommandsNV = provider.getFunctionAddress("glPathSubCommandsNV");
		PathSubCoordsNV = provider.getFunctionAddress("glPathSubCoordsNV");
		PathStringNV = provider.getFunctionAddress("glPathStringNV");
		PathGlyphsNV = provider.getFunctionAddress("glPathGlyphsNV");
		PathGlyphRangeNV = provider.getFunctionAddress("glPathGlyphRangeNV");
		PathGlyphIndexArrayNV = provider.getFunctionAddress("glPathGlyphIndexArrayNV");
		PathMemoryGlyphIndexArrayNV = provider.getFunctionAddress("glPathMemoryGlyphIndexArrayNV");
		CopyPathNV = provider.getFunctionAddress("glCopyPathNV");
		InterpolatePathsNV = provider.getFunctionAddress("glInterpolatePathsNV");
		TransformPathNV = provider.getFunctionAddress("glTransformPathNV");
		PathParameterivNV = provider.getFunctionAddress("glPathParameterivNV");
		PathParameteriNV = provider.getFunctionAddress("glPathParameteriNV");
		PathParameterfvNV = provider.getFunctionAddress("glPathParameterfvNV");
		PathParameterfNV = provider.getFunctionAddress("glPathParameterfNV");
		PathDashArrayNV = provider.getFunctionAddress("glPathDashArrayNV");
		GenPathsNV = provider.getFunctionAddress("glGenPathsNV");
		DeletePathsNV = provider.getFunctionAddress("glDeletePathsNV");
		IsPathNV = provider.getFunctionAddress("glIsPathNV");
		PathStencilFuncNV = provider.getFunctionAddress("glPathStencilFuncNV");
		PathStencilDepthOffsetNV = provider.getFunctionAddress("glPathStencilDepthOffsetNV");
		StencilFillPathNV = provider.getFunctionAddress("glStencilFillPathNV");
		StencilStrokePathNV = provider.getFunctionAddress("glStencilStrokePathNV");
		StencilFillPathInstancedNV = provider.getFunctionAddress("glStencilFillPathInstancedNV");
		StencilStrokePathInstancedNV = provider.getFunctionAddress("glStencilStrokePathInstancedNV");
		PathCoverDepthFuncNV = provider.getFunctionAddress("glPathCoverDepthFuncNV");
		PathColorGenNV = provider.getFunctionAddress("glPathColorGenNV");
		PathTexGenNV = provider.getFunctionAddress("glPathTexGenNV");
		PathFogGenNV = provider.getFunctionAddress("glPathFogGenNV");
		CoverFillPathNV = provider.getFunctionAddress("glCoverFillPathNV");
		CoverStrokePathNV = provider.getFunctionAddress("glCoverStrokePathNV");
		CoverFillPathInstancedNV = provider.getFunctionAddress("glCoverFillPathInstancedNV");
		CoverStrokePathInstancedNV = provider.getFunctionAddress("glCoverStrokePathInstancedNV");
		StencilThenCoverFillPathNV = provider.getFunctionAddress("glStencilThenCoverFillPathNV");
		StencilThenCoverStrokePathNV = provider.getFunctionAddress("glStencilThenCoverStrokePathNV");
		StencilThenCoverFillPathInstancedNV = provider.getFunctionAddress("glStencilThenCoverFillPathInstancedNV");
		StencilThenCoverStrokePathInstancedNV = provider.getFunctionAddress("glStencilThenCoverStrokePathInstancedNV");
		PathGlyphIndexRangeNV = provider.getFunctionAddress("glPathGlyphIndexRangeNV");
		ProgramPathFragmentInputGenNV = provider.getFunctionAddress("glProgramPathFragmentInputGenNV");
		GetPathParameterivNV = provider.getFunctionAddress("glGetPathParameterivNV");
		GetPathParameterfvNV = provider.getFunctionAddress("glGetPathParameterfvNV");
		GetPathCommandsNV = provider.getFunctionAddress("glGetPathCommandsNV");
		GetPathCoordsNV = provider.getFunctionAddress("glGetPathCoordsNV");
		GetPathDashArrayNV = provider.getFunctionAddress("glGetPathDashArrayNV");
		GetPathMetricsNV = provider.getFunctionAddress("glGetPathMetricsNV");
		GetPathMetricRangeNV = provider.getFunctionAddress("glGetPathMetricRangeNV");
		GetPathSpacingNV = provider.getFunctionAddress("glGetPathSpacingNV");
		GetPathColorGenivNV = provider.getFunctionAddress("glGetPathColorGenivNV");
		GetPathColorGenfvNV = provider.getFunctionAddress("glGetPathColorGenfvNV");
		GetPathTexGenivNV = provider.getFunctionAddress("glGetPathTexGenivNV");
		GetPathTexGenfvNV = provider.getFunctionAddress("glGetPathTexGenfvNV");
		IsPointInFillPathNV = provider.getFunctionAddress("glIsPointInFillPathNV");
		IsPointInStrokePathNV = provider.getFunctionAddress("glIsPointInStrokePathNV");
		GetPathLengthNV = provider.getFunctionAddress("glGetPathLengthNV");
		PointAlongPathNV = provider.getFunctionAddress("glPointAlongPathNV");
		MatrixLoad3x2fNV = provider.getFunctionAddress("glMatrixLoad3x2fNV");
		MatrixLoad3x3fNV = provider.getFunctionAddress("glMatrixLoad3x3fNV");
		MatrixLoadTranspose3x3fNV = provider.getFunctionAddress("glMatrixLoadTranspose3x3fNV");
		MatrixMult3x2fNV = provider.getFunctionAddress("glMatrixMult3x2fNV");
		MatrixMult3x3fNV = provider.getFunctionAddress("glMatrixMult3x3fNV");
		MatrixMultTranspose3x3fNV = provider.getFunctionAddress("glMatrixMultTranspose3x3fNV");
		GetProgramResourcefvNV = provider.getFunctionAddress("glGetProgramResourcefvNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVPathRendering} instance for the current context. */
	public static NVPathRendering getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVPathRendering);
	}

	static NVPathRendering create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_path_rendering") ) return null;

		NVPathRendering funcs = new NVPathRendering(provider);

		boolean supported = checkFunctions(
			funcs.PathCommandsNV, funcs.PathCoordsNV, funcs.PathSubCommandsNV, funcs.PathSubCoordsNV, funcs.PathStringNV, funcs.PathGlyphsNV, 
			funcs.PathGlyphRangeNV, funcs.CopyPathNV, funcs.InterpolatePathsNV, funcs.TransformPathNV, funcs.PathParameterivNV, funcs.PathParameteriNV, 
			funcs.PathParameterfvNV, funcs.PathParameterfNV, funcs.PathDashArrayNV, funcs.GenPathsNV, funcs.DeletePathsNV, funcs.IsPathNV, 
			funcs.PathStencilFuncNV, funcs.PathStencilDepthOffsetNV, funcs.StencilFillPathNV, funcs.StencilStrokePathNV, funcs.StencilFillPathInstancedNV, 
			funcs.StencilStrokePathInstancedNV, funcs.PathCoverDepthFuncNV, funcs.CoverFillPathNV, funcs.CoverStrokePathNV, funcs.CoverFillPathInstancedNV, 
			funcs.CoverStrokePathInstancedNV, funcs.GetPathParameterivNV, funcs.GetPathParameterfvNV, funcs.GetPathCommandsNV, funcs.GetPathCoordsNV, 
			funcs.GetPathDashArrayNV, funcs.GetPathMetricsNV, funcs.GetPathMetricRangeNV, funcs.GetPathSpacingNV, funcs.IsPointInFillPathNV, 
			funcs.IsPointInStrokePathNV, funcs.GetPathLengthNV, funcs.PointAlongPathNV
		);

		return GL.checkExtension("GL_NV_path_rendering", funcs, supported);
	}

	// --- [ glPathCommandsNV ] ---

	/** JNI method for {@link #glPathCommandsNV PathCommandsNV} */
	@JavadocExclude
	public static native void nglPathCommandsNV(int path, int numCommands, long commands, int numCoords, int coordType, long coords, long __functionAddress);

	/** Unsafe version of {@link #glPathCommandsNV PathCommandsNV} */
	@JavadocExclude
	public static void nglPathCommandsNV(int path, int numCommands, long commands, int numCoords, int coordType, long coords) {
		long __functionAddress = getInstance().PathCommandsNV;
		nglPathCommandsNV(path, numCommands, commands, numCoords, coordType, coords, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path        
	 * @param numCommands 
	 * @param commands    
	 * @param numCoords   
	 * @param coordType   one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_FLOAT FLOAT}
	 * @param coords      
	 */
	public static void glPathCommandsNV(int path, int numCommands, ByteBuffer commands, int numCoords, int coordType, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(commands, numCommands);
			checkBuffer(coords, numCoords);
		}
		nglPathCommandsNV(path, numCommands, memAddress(commands), numCoords, coordType, memAddress(coords));
	}

	/** Alternative version of: {@link #glPathCommandsNV PathCommandsNV} */
	public static void glPathCommandsNV(int path, ByteBuffer commands, int coordType, ByteBuffer coords) {
		nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining(), coordType, memAddress(coords));
	}

	/** GL_BYTE version of: {@link #glPathCommandsNV PathCommandsNV} */
	public static void glPathCommandsNV(int path, ByteBuffer commands, ByteBuffer coords) {
		nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining(), GL11.GL_BYTE, memAddress(coords));
	}

	/** GL_SHORT version of: {@link #glPathCommandsNV PathCommandsNV} */
	public static void glPathCommandsNV(int path, ByteBuffer commands, ShortBuffer coords) {
		nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining(), GL11.GL_SHORT, memAddress(coords));
	}

	/** GL_FLOAT version of: {@link #glPathCommandsNV PathCommandsNV} */
	public static void glPathCommandsNV(int path, ByteBuffer commands, FloatBuffer coords) {
		nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining(), GL11.GL_FLOAT, memAddress(coords));
	}

	// --- [ glPathCoordsNV ] ---

	/** JNI method for {@link #glPathCoordsNV PathCoordsNV} */
	@JavadocExclude
	public static native void nglPathCoordsNV(int path, int numCoords, int coordType, long coords, long __functionAddress);

	/** Unsafe version of {@link #glPathCoordsNV PathCoordsNV} */
	@JavadocExclude
	public static void nglPathCoordsNV(int path, int numCoords, int coordType, long coords) {
		long __functionAddress = getInstance().PathCoordsNV;
		nglPathCoordsNV(path, numCoords, coordType, coords, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path      
	 * @param numCoords 
	 * @param coordType one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_FLOAT FLOAT}
	 * @param coords    
	 */
	public static void glPathCoordsNV(int path, int numCoords, int coordType, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, numCoords);
		nglPathCoordsNV(path, numCoords, coordType, memAddress(coords));
	}

	/** Alternative version of: {@link #glPathCoordsNV PathCoordsNV} */
	public static void glPathCoordsNV(int path, int coordType, ByteBuffer coords) {
		nglPathCoordsNV(path, coords.remaining(), coordType, memAddress(coords));
	}

	/** GL_BYTE version of: {@link #glPathCoordsNV PathCoordsNV} */
	public static void glPathCoordsNV(int path, ByteBuffer coords) {
		nglPathCoordsNV(path, coords.remaining(), GL11.GL_BYTE, memAddress(coords));
	}

	/** GL_SHORT version of: {@link #glPathCoordsNV PathCoordsNV} */
	public static void glPathCoordsNV(int path, ShortBuffer coords) {
		nglPathCoordsNV(path, coords.remaining(), GL11.GL_SHORT, memAddress(coords));
	}

	/** GL_FLOAT version of: {@link #glPathCoordsNV PathCoordsNV} */
	public static void glPathCoordsNV(int path, FloatBuffer coords) {
		nglPathCoordsNV(path, coords.remaining(), GL11.GL_FLOAT, memAddress(coords));
	}

	// --- [ glPathSubCommandsNV ] ---

	/** JNI method for {@link #glPathSubCommandsNV PathSubCommandsNV} */
	@JavadocExclude
	public static native void nglPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, long commands, int numCoords, int coordType, long coords, long __functionAddress);

	/** Unsafe version of {@link #glPathSubCommandsNV PathSubCommandsNV} */
	@JavadocExclude
	public static void nglPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, long commands, int numCoords, int coordType, long coords) {
		long __functionAddress = getInstance().PathSubCommandsNV;
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, numCommands, commands, numCoords, coordType, coords, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path             
	 * @param commandStart     
	 * @param commandsToDelete 
	 * @param numCommands      
	 * @param commands         
	 * @param numCoords        
	 * @param coordType        one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_FLOAT FLOAT}
	 * @param coords           
	 */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, ByteBuffer commands, int numCoords, int coordType, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(commands, numCommands);
			checkBuffer(coords, numCoords);
		}
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, numCommands, memAddress(commands), numCoords, coordType, memAddress(coords));
	}

	/** Alternative version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, int coordType, ByteBuffer coords) {
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining(), coordType, memAddress(coords));
	}

	/** GL_BYTE version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, ByteBuffer coords) {
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining(), GL11.GL_BYTE, memAddress(coords));
	}

	/** GL_SHORT version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, ShortBuffer coords) {
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining(), GL11.GL_SHORT, memAddress(coords));
	}

	/** GL_FLOAT version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, FloatBuffer coords) {
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining(), GL11.GL_FLOAT, memAddress(coords));
	}

	// --- [ glPathSubCoordsNV ] ---

	/** JNI method for {@link #glPathSubCoordsNV PathSubCoordsNV} */
	@JavadocExclude
	public static native void nglPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, long coords, long __functionAddress);

	/** Unsafe version of {@link #glPathSubCoordsNV PathSubCoordsNV} */
	@JavadocExclude
	public static void nglPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, long coords) {
		long __functionAddress = getInstance().PathSubCoordsNV;
		nglPathSubCoordsNV(path, coordStart, numCoords, coordType, coords, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path       
	 * @param coordStart 
	 * @param numCoords  
	 * @param coordType  one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_FLOAT FLOAT}
	 * @param coords     
	 */
	public static void glPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, numCoords);
		nglPathSubCoordsNV(path, coordStart, numCoords, coordType, memAddress(coords));
	}

	/** Alternative version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
	public static void glPathSubCoordsNV(int path, int coordStart, int coordType, ByteBuffer coords) {
		nglPathSubCoordsNV(path, coordStart, coords.remaining(), coordType, memAddress(coords));
	}

	/** GL_BYTE version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
	public static void glPathSubCoordsNV(int path, int coordStart, ByteBuffer coords) {
		nglPathSubCoordsNV(path, coordStart, coords.remaining(), GL11.GL_BYTE, memAddress(coords));
	}

	/** GL_SHORT version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
	public static void glPathSubCoordsNV(int path, int coordStart, ShortBuffer coords) {
		nglPathSubCoordsNV(path, coordStart, coords.remaining(), GL11.GL_SHORT, memAddress(coords));
	}

	/** GL_FLOAT version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
	public static void glPathSubCoordsNV(int path, int coordStart, FloatBuffer coords) {
		nglPathSubCoordsNV(path, coordStart, coords.remaining(), GL11.GL_FLOAT, memAddress(coords));
	}

	// --- [ glPathStringNV ] ---

	/** JNI method for {@link #glPathStringNV PathStringNV} */
	@JavadocExclude
	public static native void nglPathStringNV(int path, int format, int length, long pathString, long __functionAddress);

	/** Unsafe version of {@link #glPathStringNV PathStringNV} */
	@JavadocExclude
	public static void nglPathStringNV(int path, int format, int length, long pathString) {
		long __functionAddress = getInstance().PathStringNV;
		nglPathStringNV(path, format, length, pathString, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path       
	 * @param format     one of:<br>{@link #GL_PATH_FORMAT_SVG_NV PATH_FORMAT_SVG_NV}, {@link #GL_PATH_FORMAT_PS_NV PATH_FORMAT_PS_NV}
	 * @param length     
	 * @param pathString 
	 */
	public static void glPathStringNV(int path, int format, int length, ByteBuffer pathString) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pathString, length);
		nglPathStringNV(path, format, length, memAddress(pathString));
	}

	/** Alternative version of: {@link #glPathStringNV PathStringNV} */
	public static void glPathStringNV(int path, int format, ByteBuffer pathString) {
		nglPathStringNV(path, format, pathString.remaining(), memAddress(pathString));
	}

	// --- [ glPathGlyphsNV ] ---

	/** JNI method for {@link #glPathGlyphsNV PathGlyphsNV} */
	@JavadocExclude
	public static native void nglPathGlyphsNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int numGlyphs, int type, long charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale, long __functionAddress);

	/** Unsafe version of {@link #glPathGlyphsNV PathGlyphsNV} */
	@JavadocExclude
	public static void nglPathGlyphsNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int numGlyphs, int type, long charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
		long __functionAddress = getInstance().PathGlyphsNV;
		nglPathGlyphsNV(firstPathName, fontTarget, fontName, fontStyle, numGlyphs, type, charcodes, handleMissingGlyphs, pathParameterTemplate, emScale, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}, {@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}, {@link #GL_FILE_NAME_NV FILE_NAME_NV}
	 * @param fontName              
	 * @param fontStyle             one or more of:<br>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}, {@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}
	 * @param numGlyphs             
	 * @param type                  one of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param charcodes             
	 * @param handleMissingGlyphs   one of:<br>{@link #GL_SKIP_MISSING_GLYPH_NV SKIP_MISSING_GLYPH_NV}, {@link #GL_USE_MISSING_GLYPH_NV USE_MISSING_GLYPH_NV}
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static void glPathGlyphsNV(int firstPathName, int fontTarget, ByteBuffer fontName, int fontStyle, int numGlyphs, int type, ByteBuffer charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(fontName);
			checkBuffer(charcodes, numGlyphs);
		}
		nglPathGlyphsNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, numGlyphs, type, memAddress(charcodes), handleMissingGlyphs, pathParameterTemplate, emScale);
	}

	// --- [ glPathGlyphRangeNV ] ---

	/** JNI method for {@link #glPathGlyphRangeNV PathGlyphRangeNV} */
	@JavadocExclude
	public static native void nglPathGlyphRangeNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale, long __functionAddress);

	/** Unsafe version of {@link #glPathGlyphRangeNV PathGlyphRangeNV} */
	@JavadocExclude
	public static void nglPathGlyphRangeNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
		long __functionAddress = getInstance().PathGlyphRangeNV;
		nglPathGlyphRangeNV(firstPathName, fontTarget, fontName, fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}, {@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}, {@link #GL_FILE_NAME_NV FILE_NAME_NV}
	 * @param fontName              
	 * @param fontStyle             one or more of:<br>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}, {@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}
	 * @param firstGlyph            
	 * @param numGlyphs             
	 * @param handleMissingGlyphs   one of:<br>{@link #GL_SKIP_MISSING_GLYPH_NV SKIP_MISSING_GLYPH_NV}, {@link #GL_USE_MISSING_GLYPH_NV USE_MISSING_GLYPH_NV}
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static void glPathGlyphRangeNV(int firstPathName, int fontTarget, ByteBuffer fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(fontName);
		nglPathGlyphRangeNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale);
	}

	// --- [ glPathGlyphIndexArrayNV ] ---

	/** JNI method for {@link #glPathGlyphIndexArrayNV PathGlyphIndexArrayNV} */
	@JavadocExclude
	public static native int nglPathGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale, long __functionAddress);

	/** Unsafe version of {@link #glPathGlyphIndexArrayNV PathGlyphIndexArrayNV} */
	@JavadocExclude
	public static int nglPathGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		long __functionAddress = getInstance().PathGlyphIndexArrayNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglPathGlyphIndexArrayNV(firstPathName, fontTarget, fontName, fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}, {@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}, {@link #GL_FILE_NAME_NV FILE_NAME_NV}
	 * @param fontName              
	 * @param fontStyle             one or more of:<br>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}, {@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}
	 * @param firstGlyphIndex       
	 * @param numGlyphs             
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static int glPathGlyphIndexArrayNV(int firstPathName, int fontTarget, ByteBuffer fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(fontName);
		return nglPathGlyphIndexArrayNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
	}

	// --- [ glPathMemoryGlyphIndexArrayNV ] ---

	/** JNI method for {@link #glPathMemoryGlyphIndexArrayNV PathMemoryGlyphIndexArrayNV} */
	@JavadocExclude
	public static native int nglPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, long fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale, long __functionAddress);

	/** Unsafe version of {@link #glPathMemoryGlyphIndexArrayNV PathMemoryGlyphIndexArrayNV} */
	@JavadocExclude
	public static int nglPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, long fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		long __functionAddress = getInstance().PathMemoryGlyphIndexArrayNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglPathMemoryGlyphIndexArrayNV(firstPathName, fontTarget, fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}, {@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}, {@link #GL_FILE_NAME_NV FILE_NAME_NV}
	 * @param fontSize              
	 * @param fontData              
	 * @param faceIndex             
	 * @param firstGlyphIndex       
	 * @param numGlyphs             
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static int glPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, ByteBuffer fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(fontData, fontSize);
		return nglPathMemoryGlyphIndexArrayNV(firstPathName, fontTarget, fontSize, memAddress(fontData), faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
	}

	/** Alternative version of: {@link #glPathMemoryGlyphIndexArrayNV PathMemoryGlyphIndexArrayNV} */
	public static int glPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, ByteBuffer fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		return nglPathMemoryGlyphIndexArrayNV(firstPathName, fontTarget, fontData.remaining(), memAddress(fontData), faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
	}

	// --- [ glCopyPathNV ] ---

	/** JNI method for {@link #glCopyPathNV CopyPathNV} */
	@JavadocExclude
	public static native void nglCopyPathNV(int resultPath, int srcPath, long __functionAddress);

	/**
	 * 
	 *
	 * @param resultPath 
	 * @param srcPath    
	 */
	public static void glCopyPathNV(int resultPath, int srcPath) {
		long __functionAddress = getInstance().CopyPathNV;
		nglCopyPathNV(resultPath, srcPath, __functionAddress);
	}

	// --- [ glInterpolatePathsNV ] ---

	/** JNI method for {@link #glInterpolatePathsNV InterpolatePathsNV} */
	@JavadocExclude
	public static native void nglInterpolatePathsNV(int resultPath, int pathA, int pathB, float weight, long __functionAddress);

	/**
	 * 
	 *
	 * @param resultPath 
	 * @param pathA      
	 * @param pathB      
	 * @param weight     
	 */
	public static void glInterpolatePathsNV(int resultPath, int pathA, int pathB, float weight) {
		long __functionAddress = getInstance().InterpolatePathsNV;
		nglInterpolatePathsNV(resultPath, pathA, pathB, weight, __functionAddress);
	}

	// --- [ glTransformPathNV ] ---

	/** JNI method for {@link #glTransformPathNV TransformPathNV} */
	@JavadocExclude
	public static native void nglTransformPathNV(int resultPath, int srcPath, int transformType, long transformValues, long __functionAddress);

	/** Unsafe version of {@link #glTransformPathNV TransformPathNV} */
	@JavadocExclude
	public static void nglTransformPathNV(int resultPath, int srcPath, int transformType, long transformValues) {
		long __functionAddress = getInstance().TransformPathNV;
		nglTransformPathNV(resultPath, srcPath, transformType, transformValues, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param resultPath      
	 * @param srcPath         
	 * @param transformType   one of:<br>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}, {@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}, {@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}, {@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}, {@link #GL_AFFINE_2D_NV AFFINE_2D_NV}, {@link #GL_AFFINE_3D_NV AFFINE_3D_NV}, {@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}, {@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}
	 * @param transformValues 
	 */
	public static void glTransformPathNV(int resultPath, int srcPath, int transformType, ByteBuffer transformValues) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(transformValues, 16 << 2);
		nglTransformPathNV(resultPath, srcPath, transformType, memAddress(transformValues));
	}

	/** Alternative version of: {@link #glTransformPathNV TransformPathNV} */
	public static void glTransformPathNV(int resultPath, int srcPath, int transformType, FloatBuffer transformValues) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(transformValues, 16);
		nglTransformPathNV(resultPath, srcPath, transformType, memAddress(transformValues));
	}

	// --- [ glPathParameterivNV ] ---

	/** JNI method for {@link #glPathParameterivNV PathParameterivNV} */
	@JavadocExclude
	public static native void nglPathParameterivNV(int path, int pname, long value, long __functionAddress);

	/** Unsafe version of {@link #glPathParameterivNV PathParameterivNV} */
	@JavadocExclude
	public static void nglPathParameterivNV(int path, int pname, long value) {
		long __functionAddress = getInstance().PathParameterivNV;
		nglPathParameterivNV(path, pname, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}, {@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}, {@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}, {@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}, {@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}, {@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}, {@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}, {@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}, {@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}, {@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}, {@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}, {@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}, {@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}, {@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}, {@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}
	 * @param value 
	 */
	public static void glPathParameterivNV(int path, int pname, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglPathParameterivNV(path, pname, memAddress(value));
	}

	/** Alternative version of: {@link #glPathParameterivNV PathParameterivNV} */
	public static void glPathParameterivNV(int path, int pname, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglPathParameterivNV(path, pname, memAddress(value));
	}

	// --- [ glPathParameteriNV ] ---

	/** JNI method for {@link #glPathParameteriNV PathParameteriNV} */
	@JavadocExclude
	public static native void nglPathParameteriNV(int path, int pname, int value, long __functionAddress);

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}, {@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}, {@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}, {@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}, {@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}, {@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}, {@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}, {@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}, {@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}, {@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}, {@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}, {@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}, {@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}, {@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}, {@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}
	 * @param value 
	 */
	public static void glPathParameteriNV(int path, int pname, int value) {
		long __functionAddress = getInstance().PathParameteriNV;
		nglPathParameteriNV(path, pname, value, __functionAddress);
	}

	// --- [ glPathParameterfvNV ] ---

	/** JNI method for {@link #glPathParameterfvNV PathParameterfvNV} */
	@JavadocExclude
	public static native void nglPathParameterfvNV(int path, int pname, long value, long __functionAddress);

	/** Unsafe version of {@link #glPathParameterfvNV PathParameterfvNV} */
	@JavadocExclude
	public static void nglPathParameterfvNV(int path, int pname, long value) {
		long __functionAddress = getInstance().PathParameterfvNV;
		nglPathParameterfvNV(path, pname, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}, {@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}, {@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}, {@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}, {@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}, {@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}, {@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}, {@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}, {@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}, {@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}, {@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}, {@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}, {@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}, {@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}, {@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}, {@link #GL_PATH_END_CAPS_NV PATH_END_CAPS_NV}, {@link #GL_PATH_DASH_CAPS_NV PATH_DASH_CAPS_NV}
	 * @param value 
	 */
	public static void glPathParameterfvNV(int path, int pname, ByteBuffer value) {
		nglPathParameterfvNV(path, pname, memAddress(value));
	}

	/** Alternative version of: {@link #glPathParameterfvNV PathParameterfvNV} */
	public static void glPathParameterfvNV(int path, int pname, FloatBuffer value) {
		nglPathParameterfvNV(path, pname, memAddress(value));
	}

	// --- [ glPathParameterfNV ] ---

	/** JNI method for {@link #glPathParameterfNV PathParameterfNV} */
	@JavadocExclude
	public static native void nglPathParameterfNV(int path, int pname, float value, long __functionAddress);

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}, {@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}, {@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}, {@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}, {@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}, {@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}, {@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}, {@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}, {@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}, {@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}, {@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}, {@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}, {@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}, {@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}, {@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}, {@link #GL_PATH_END_CAPS_NV PATH_END_CAPS_NV}, {@link #GL_PATH_DASH_CAPS_NV PATH_DASH_CAPS_NV}
	 * @param value 
	 */
	public static void glPathParameterfNV(int path, int pname, float value) {
		long __functionAddress = getInstance().PathParameterfNV;
		nglPathParameterfNV(path, pname, value, __functionAddress);
	}

	// --- [ glPathDashArrayNV ] ---

	/** JNI method for {@link #glPathDashArrayNV PathDashArrayNV} */
	@JavadocExclude
	public static native void nglPathDashArrayNV(int path, int dashCount, long dashArray, long __functionAddress);

	/** Unsafe version of {@link #glPathDashArrayNV PathDashArrayNV} */
	@JavadocExclude
	public static void nglPathDashArrayNV(int path, int dashCount, long dashArray) {
		long __functionAddress = getInstance().PathDashArrayNV;
		nglPathDashArrayNV(path, dashCount, dashArray, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path      
	 * @param dashCount 
	 * @param dashArray 
	 */
	public static void glPathDashArrayNV(int path, int dashCount, ByteBuffer dashArray) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(dashArray, dashCount << 2);
		nglPathDashArrayNV(path, dashCount, memAddress(dashArray));
	}

	/** Alternative version of: {@link #glPathDashArrayNV PathDashArrayNV} */
	public static void glPathDashArrayNV(int path, FloatBuffer dashArray) {
		nglPathDashArrayNV(path, dashArray.remaining(), memAddress(dashArray));
	}

	// --- [ glGenPathsNV ] ---

	/** JNI method for {@link #glGenPathsNV GenPathsNV} */
	@JavadocExclude
	public static native int nglGenPathsNV(int range, long __functionAddress);

	/**
	 * 
	 *
	 * @param range 
	 */
	public static int glGenPathsNV(int range) {
		long __functionAddress = getInstance().GenPathsNV;
		return nglGenPathsNV(range, __functionAddress);
	}

	// --- [ glDeletePathsNV ] ---

	/** JNI method for {@link #glDeletePathsNV DeletePathsNV} */
	@JavadocExclude
	public static native void nglDeletePathsNV(int path, int range, long __functionAddress);

	/**
	 * 
	 *
	 * @param path  
	 * @param range 
	 */
	public static void glDeletePathsNV(int path, int range) {
		long __functionAddress = getInstance().DeletePathsNV;
		nglDeletePathsNV(path, range, __functionAddress);
	}

	// --- [ glIsPathNV ] ---

	/** JNI method for {@link #glIsPathNV IsPathNV} */
	@JavadocExclude
	public static native boolean nglIsPathNV(int path, long __functionAddress);

	/**
	 * 
	 *
	 * @param path 
	 */
	public static boolean glIsPathNV(int path) {
		long __functionAddress = getInstance().IsPathNV;
		return nglIsPathNV(path, __functionAddress);
	}

	// --- [ glPathStencilFuncNV ] ---

	/** JNI method for {@link #glPathStencilFuncNV PathStencilFuncNV} */
	@JavadocExclude
	public static native void nglPathStencilFuncNV(int func, int ref, int mask, long __functionAddress);

	/**
	 * 
	 *
	 * @param func 
	 * @param ref  
	 * @param mask 
	 */
	public static void glPathStencilFuncNV(int func, int ref, int mask) {
		long __functionAddress = getInstance().PathStencilFuncNV;
		nglPathStencilFuncNV(func, ref, mask, __functionAddress);
	}

	// --- [ glPathStencilDepthOffsetNV ] ---

	/** JNI method for {@link #glPathStencilDepthOffsetNV PathStencilDepthOffsetNV} */
	@JavadocExclude
	public static native void nglPathStencilDepthOffsetNV(float factor, float units, long __functionAddress);

	/**
	 * 
	 *
	 * @param factor 
	 * @param units  
	 */
	public static void glPathStencilDepthOffsetNV(float factor, float units) {
		long __functionAddress = getInstance().PathStencilDepthOffsetNV;
		nglPathStencilDepthOffsetNV(factor, units, __functionAddress);
	}

	// --- [ glStencilFillPathNV ] ---

	/** JNI method for {@link #glStencilFillPathNV StencilFillPathNV} */
	@JavadocExclude
	public static native void nglStencilFillPathNV(int path, int fillMode, int mask, long __functionAddress);

	/**
	 * 
	 *
	 * @param path     
	 * @param fillMode one of:<br>{@link GL11#GL_INVERT INVERT}, {@link #GL_COUNT_UP_NV COUNT_UP_NV}, {@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}
	 * @param mask     
	 */
	public static void glStencilFillPathNV(int path, int fillMode, int mask) {
		long __functionAddress = getInstance().StencilFillPathNV;
		nglStencilFillPathNV(path, fillMode, mask, __functionAddress);
	}

	// --- [ glStencilStrokePathNV ] ---

	/** JNI method for {@link #glStencilStrokePathNV StencilStrokePathNV} */
	@JavadocExclude
	public static native void nglStencilStrokePathNV(int path, int reference, int mask, long __functionAddress);

	/**
	 * 
	 *
	 * @param path      
	 * @param reference 
	 * @param mask      
	 */
	public static void glStencilStrokePathNV(int path, int reference, int mask) {
		long __functionAddress = getInstance().StencilStrokePathNV;
		nglStencilStrokePathNV(path, reference, mask, __functionAddress);
	}

	// --- [ glStencilFillPathInstancedNV ] ---

	/** JNI method for {@link #glStencilFillPathInstancedNV StencilFillPathInstancedNV} */
	@JavadocExclude
	public static native void nglStencilFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int transformType, long transformValues, long __functionAddress);

	/** Unsafe version of {@link #glStencilFillPathInstancedNV StencilFillPathInstancedNV} */
	@JavadocExclude
	public static void nglStencilFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int transformType, long transformValues) {
		long __functionAddress = getInstance().StencilFillPathInstancedNV;
		nglStencilFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, fillMode, mask, transformType, transformValues, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param paths           
	 * @param pathBase        
	 * @param fillMode        one of:<br>{@link GL11#GL_INVERT INVERT}, {@link #GL_COUNT_UP_NV COUNT_UP_NV}, {@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}
	 * @param mask            
	 * @param transformType   one of:<br>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}, {@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}, {@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}, {@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}, {@link #GL_AFFINE_2D_NV AFFINE_2D_NV}, {@link #GL_AFFINE_3D_NV AFFINE_3D_NV}, {@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}, {@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}
	 * @param transformValues 
	 */
	public static void glStencilFillPathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int fillMode, int mask, int transformType, ByteBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16 << 2);
		}
		nglStencilFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, transformType, memAddress(transformValues));
	}

	/** Alternative version of: {@link #glStencilFillPathInstancedNV StencilFillPathInstancedNV} */
	public static void glStencilFillPathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int fillMode, int mask, int transformType, FloatBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16);
		}
		nglStencilFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, transformType, memAddress(transformValues));
	}

	// --- [ glStencilStrokePathInstancedNV ] ---

	/** JNI method for {@link #glStencilStrokePathInstancedNV StencilStrokePathInstancedNV} */
	@JavadocExclude
	public static native void nglStencilStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int transformType, long transformValues, long __functionAddress);

	/** Unsafe version of {@link #glStencilStrokePathInstancedNV StencilStrokePathInstancedNV} */
	@JavadocExclude
	public static void nglStencilStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int transformType, long transformValues) {
		long __functionAddress = getInstance().StencilStrokePathInstancedNV;
		nglStencilStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, reference, mask, transformType, transformValues, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param paths           
	 * @param pathBase        
	 * @param reference       
	 * @param mask            
	 * @param transformType   one of:<br>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}, {@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}, {@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}, {@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}, {@link #GL_AFFINE_2D_NV AFFINE_2D_NV}, {@link #GL_AFFINE_3D_NV AFFINE_3D_NV}, {@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}, {@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}
	 * @param transformValues 
	 */
	public static void glStencilStrokePathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int reference, int mask, int transformType, ByteBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16 << 2);
		}
		nglStencilStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, transformType, memAddress(transformValues));
	}

	/** Alternative version of: {@link #glStencilStrokePathInstancedNV StencilStrokePathInstancedNV} */
	public static void glStencilStrokePathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int reference, int mask, int transformType, FloatBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16);
		}
		nglStencilStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, transformType, memAddress(transformValues));
	}

	// --- [ glPathCoverDepthFuncNV ] ---

	/** JNI method for {@link #glPathCoverDepthFuncNV PathCoverDepthFuncNV} */
	@JavadocExclude
	public static native void nglPathCoverDepthFuncNV(int zfunc, long __functionAddress);

	/**
	 * 
	 *
	 * @param zfunc 
	 */
	public static void glPathCoverDepthFuncNV(int zfunc) {
		long __functionAddress = getInstance().PathCoverDepthFuncNV;
		nglPathCoverDepthFuncNV(zfunc, __functionAddress);
	}

	// --- [ glPathColorGenNV ] ---

	/** JNI method for {@link #glPathColorGenNV PathColorGenNV} */
	@JavadocExclude
	public static native void nglPathColorGenNV(int color, int genMode, int colorFormat, long coeffs, long __functionAddress);

	/** Unsafe version of {@link #glPathColorGenNV PathColorGenNV} */
	@JavadocExclude
	public static void nglPathColorGenNV(int color, int genMode, int colorFormat, long coeffs) {
		long __functionAddress = getInstance().PathColorGenNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPathColorGenNV(color, genMode, colorFormat, coeffs, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param color       one of:<br>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}, {@link #GL_PRIMARY_COLOR_NV PRIMARY_COLOR_NV}, {@link #GL_SECONDARY_COLOR_NV SECONDARY_COLOR_NV}
	 * @param genMode     one of:<br>{@link GL11#GL_NONE NONE}, {@link GL11#GL_OBJECT_LINEAR OBJECT_LINEAR}, {@link #GL_PATH_OBJECT_BOUNDING_BOX_NV PATH_OBJECT_BOUNDING_BOX_NV}, {@link GL11#GL_EYE_LINEAR EYE_LINEAR}, {@link GL13#GL_CONSTANT CONSTANT}
	 * @param colorFormat 
	 * @param coeffs      
	 */
	public static void glPathColorGenNV(int color, int genMode, int colorFormat, ByteBuffer coeffs) {
		nglPathColorGenNV(color, genMode, colorFormat, memAddress(coeffs));
	}

	/** Alternative version of: {@link #glPathColorGenNV PathColorGenNV} */
	public static void glPathColorGenNV(int color, int genMode, int colorFormat, FloatBuffer coeffs) {
		nglPathColorGenNV(color, genMode, colorFormat, memAddress(coeffs));
	}

	// --- [ glPathTexGenNV ] ---

	/** JNI method for {@link #glPathTexGenNV PathTexGenNV} */
	@JavadocExclude
	public static native void nglPathTexGenNV(int texCoordSet, int genMode, int components, long coeffs, long __functionAddress);

	/** Unsafe version of {@link #glPathTexGenNV PathTexGenNV} */
	@JavadocExclude
	public static void nglPathTexGenNV(int texCoordSet, int genMode, int components, long coeffs) {
		long __functionAddress = getInstance().PathTexGenNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPathTexGenNV(texCoordSet, genMode, components, coeffs, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texCoordSet 
	 * @param genMode     
	 * @param components  
	 * @param coeffs      
	 */
	public static void glPathTexGenNV(int texCoordSet, int genMode, int components, ByteBuffer coeffs) {
		nglPathTexGenNV(texCoordSet, genMode, components, memAddress(coeffs));
	}

	/** Alternative version of: {@link #glPathTexGenNV PathTexGenNV} */
	public static void glPathTexGenNV(int texCoordSet, int genMode, int components, FloatBuffer coeffs) {
		nglPathTexGenNV(texCoordSet, genMode, components, memAddress(coeffs));
	}

	// --- [ glPathFogGenNV ] ---

	/** JNI method for {@link #glPathFogGenNV PathFogGenNV} */
	@JavadocExclude
	public static native void nglPathFogGenNV(int genMode, long __functionAddress);

	/**
	 * 
	 *
	 * @param genMode 
	 */
	public static void glPathFogGenNV(int genMode) {
		long __functionAddress = getInstance().PathFogGenNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPathFogGenNV(genMode, __functionAddress);
	}

	// --- [ glCoverFillPathNV ] ---

	/** JNI method for {@link #glCoverFillPathNV CoverFillPathNV} */
	@JavadocExclude
	public static native void nglCoverFillPathNV(int path, int coverMode, long __functionAddress);

	/**
	 * 
	 *
	 * @param path      
	 * @param coverMode one of:<br>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}, {@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}
	 */
	public static void glCoverFillPathNV(int path, int coverMode) {
		long __functionAddress = getInstance().CoverFillPathNV;
		nglCoverFillPathNV(path, coverMode, __functionAddress);
	}

	// --- [ glCoverStrokePathNV ] ---

	/** JNI method for {@link #glCoverStrokePathNV CoverStrokePathNV} */
	@JavadocExclude
	public static native void nglCoverStrokePathNV(int path, int coverMode, long __functionAddress);

	/**
	 * 
	 *
	 * @param path      
	 * @param coverMode one of:<br>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}, {@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}
	 */
	public static void glCoverStrokePathNV(int path, int coverMode) {
		long __functionAddress = getInstance().CoverStrokePathNV;
		nglCoverStrokePathNV(path, coverMode, __functionAddress);
	}

	// --- [ glCoverFillPathInstancedNV ] ---

	/** JNI method for {@link #glCoverFillPathInstancedNV CoverFillPathInstancedNV} */
	@JavadocExclude
	public static native void nglCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues, long __functionAddress);

	/** Unsafe version of {@link #glCoverFillPathInstancedNV CoverFillPathInstancedNV} */
	@JavadocExclude
	public static void nglCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues) {
		long __functionAddress = getInstance().CoverFillPathInstancedNV;
		nglCoverFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param paths           
	 * @param pathBase        
	 * @param coverMode       one of:<br>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}, {@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}, {@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}
	 * @param transformType   one of:<br>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}, {@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}, {@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}, {@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}, {@link #GL_AFFINE_2D_NV AFFINE_2D_NV}, {@link #GL_AFFINE_3D_NV AFFINE_3D_NV}, {@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}, {@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}
	 * @param transformValues 
	 */
	public static void glCoverFillPathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int coverMode, int transformType, ByteBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16 << 2);
		}
		nglCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
	}

	/** Alternative version of: {@link #glCoverFillPathInstancedNV CoverFillPathInstancedNV} */
	public static void glCoverFillPathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int coverMode, int transformType, FloatBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16);
		}
		nglCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
	}

	// --- [ glCoverStrokePathInstancedNV ] ---

	/** JNI method for {@link #glCoverStrokePathInstancedNV CoverStrokePathInstancedNV} */
	@JavadocExclude
	public static native void nglCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues, long __functionAddress);

	/** Unsafe version of {@link #glCoverStrokePathInstancedNV CoverStrokePathInstancedNV} */
	@JavadocExclude
	public static void nglCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues) {
		long __functionAddress = getInstance().CoverStrokePathInstancedNV;
		nglCoverStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param paths           
	 * @param pathBase        
	 * @param coverMode       one of:<br>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}, {@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}, {@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}
	 * @param transformType   one of:<br>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}, {@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}, {@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}, {@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}, {@link #GL_AFFINE_2D_NV AFFINE_2D_NV}, {@link #GL_AFFINE_3D_NV AFFINE_3D_NV}, {@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}, {@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}
	 * @param transformValues 
	 */
	public static void glCoverStrokePathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int coverMode, int transformType, ByteBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16 << 2);
		}
		nglCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
	}

	/** Alternative version of: {@link #glCoverStrokePathInstancedNV CoverStrokePathInstancedNV} */
	public static void glCoverStrokePathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int coverMode, int transformType, FloatBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16);
		}
		nglCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
	}

	// --- [ glStencilThenCoverFillPathNV ] ---

	/** JNI method for {@link #glStencilThenCoverFillPathNV StencilThenCoverFillPathNV} */
	@JavadocExclude
	public static native void nglStencilThenCoverFillPathNV(int path, int fillMode, int mask, int coverMode, long __functionAddress);

	/**
	 * 
	 *
	 * @param path      
	 * @param fillMode  one of:<br>{@link GL11#GL_INVERT INVERT}, {@link #GL_COUNT_UP_NV COUNT_UP_NV}, {@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}
	 * @param mask      
	 * @param coverMode one of:<br>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}, {@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}
	 */
	public static void glStencilThenCoverFillPathNV(int path, int fillMode, int mask, int coverMode) {
		long __functionAddress = getInstance().StencilThenCoverFillPathNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilThenCoverFillPathNV(path, fillMode, mask, coverMode, __functionAddress);
	}

	// --- [ glStencilThenCoverStrokePathNV ] ---

	/** JNI method for {@link #glStencilThenCoverStrokePathNV StencilThenCoverStrokePathNV} */
	@JavadocExclude
	public static native void nglStencilThenCoverStrokePathNV(int path, int reference, int mask, int coverMode, long __functionAddress);

	/**
	 * 
	 *
	 * @param path      
	 * @param reference 
	 * @param mask      
	 * @param coverMode one of:<br>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}, {@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}
	 */
	public static void glStencilThenCoverStrokePathNV(int path, int reference, int mask, int coverMode) {
		long __functionAddress = getInstance().StencilThenCoverStrokePathNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilThenCoverStrokePathNV(path, reference, mask, coverMode, __functionAddress);
	}

	// --- [ glStencilThenCoverFillPathInstancedNV ] ---

	/** JNI method for {@link #glStencilThenCoverFillPathInstancedNV StencilThenCoverFillPathInstancedNV} */
	@JavadocExclude
	public static native void nglStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, long transformValues, long __functionAddress);

	/** Unsafe version of {@link #glStencilThenCoverFillPathInstancedNV StencilThenCoverFillPathInstancedNV} */
	@JavadocExclude
	public static void nglStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, long transformValues) {
		long __functionAddress = getInstance().StencilThenCoverFillPathInstancedNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilThenCoverFillPathInstancedNV(numPaths, pathNameType, paths, pathBase, fillMode, mask, coverMode, transformType, transformValues, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param paths           
	 * @param pathBase        
	 * @param fillMode        one of:<br>{@link GL11#GL_INVERT INVERT}, {@link #GL_COUNT_UP_NV COUNT_UP_NV}, {@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}
	 * @param mask            
	 * @param coverMode       one of:<br>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}, {@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}, {@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}
	 * @param transformType   one of:<br>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}, {@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}, {@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}, {@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}, {@link #GL_AFFINE_2D_NV AFFINE_2D_NV}, {@link #GL_AFFINE_3D_NV AFFINE_3D_NV}, {@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}, {@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}
	 * @param transformValues 
	 */
	public static void glStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, ByteBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16 << 2);
		}
		nglStencilThenCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, coverMode, transformType, memAddress(transformValues));
	}

	/** Alternative version of: {@link #glStencilThenCoverFillPathInstancedNV StencilThenCoverFillPathInstancedNV} */
	public static void glStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, FloatBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16);
		}
		nglStencilThenCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, coverMode, transformType, memAddress(transformValues));
	}

	// --- [ glStencilThenCoverStrokePathInstancedNV ] ---

	/** JNI method for {@link #glStencilThenCoverStrokePathInstancedNV StencilThenCoverStrokePathInstancedNV} */
	@JavadocExclude
	public static native void nglStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int coverMode, int transformType, long transformValues, long __functionAddress);

	/** Unsafe version of {@link #glStencilThenCoverStrokePathInstancedNV StencilThenCoverStrokePathInstancedNV} */
	@JavadocExclude
	public static void nglStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int coverMode, int transformType, long transformValues) {
		long __functionAddress = getInstance().StencilThenCoverStrokePathInstancedNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglStencilThenCoverStrokePathInstancedNV(numPaths, pathNameType, paths, pathBase, reference, mask, coverMode, transformType, transformValues, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param paths           
	 * @param pathBase        
	 * @param reference       
	 * @param mask            
	 * @param coverMode       one of:<br>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}, {@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}, {@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}
	 * @param transformType   one of:<br>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}, {@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}, {@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}, {@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}, {@link #GL_AFFINE_2D_NV AFFINE_2D_NV}, {@link #GL_AFFINE_3D_NV AFFINE_3D_NV}, {@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}, {@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}
	 * @param transformValues 
	 */
	public static void glStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int reference, int mask, int coverMode, int transformType, ByteBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16 << 2);
		}
		nglStencilThenCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, coverMode, transformType, memAddress(transformValues));
	}

	/** Alternative version of: {@link #glStencilThenCoverStrokePathInstancedNV StencilThenCoverStrokePathInstancedNV} */
	public static void glStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int reference, int mask, int coverMode, int transformType, FloatBuffer transformValues) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(paths, numPaths);
			checkBuffer(transformValues, 16);
		}
		nglStencilThenCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, coverMode, transformType, memAddress(transformValues));
	}

	// --- [ glPathGlyphIndexRangeNV ] ---

	/** JNI method for {@link #glPathGlyphIndexRangeNV PathGlyphIndexRangeNV} */
	@JavadocExclude
	public static native int nglPathGlyphIndexRangeNV(int fontTarget, long fontName, int fontStyle, int pathParameterTemplate, float emScale, int baseAndCount, long __functionAddress);

	/** Unsafe version of {@link #glPathGlyphIndexRangeNV PathGlyphIndexRangeNV} */
	@JavadocExclude
	public static int nglPathGlyphIndexRangeNV(int fontTarget, long fontName, int fontStyle, int pathParameterTemplate, float emScale, int baseAndCount) {
		long __functionAddress = getInstance().PathGlyphIndexRangeNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglPathGlyphIndexRangeNV(fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param fontTarget            
	 * @param fontName              
	 * @param fontStyle             
	 * @param pathParameterTemplate 
	 * @param emScale               
	 * @param baseAndCount          
	 */
	public static int glPathGlyphIndexRangeNV(int fontTarget, ByteBuffer fontName, int fontStyle, int pathParameterTemplate, float emScale, int baseAndCount) {
		return nglPathGlyphIndexRangeNV(fontTarget, memAddress(fontName), fontStyle, pathParameterTemplate, emScale, baseAndCount);
	}

	// --- [ glProgramPathFragmentInputGenNV ] ---

	/** JNI method for {@link #glProgramPathFragmentInputGenNV ProgramPathFragmentInputGenNV} */
	@JavadocExclude
	public static native void nglProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, long coeffs, long __functionAddress);

	/** Unsafe version of {@link #glProgramPathFragmentInputGenNV ProgramPathFragmentInputGenNV} */
	@JavadocExclude
	public static void nglProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, long coeffs) {
		long __functionAddress = getInstance().ProgramPathFragmentInputGenNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglProgramPathFragmentInputGenNV(program, location, genMode, components, coeffs, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program    
	 * @param location   
	 * @param genMode    
	 * @param components 
	 * @param coeffs     
	 */
	public static void glProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, ByteBuffer coeffs) {
		nglProgramPathFragmentInputGenNV(program, location, genMode, components, memAddress(coeffs));
	}

	/** Alternative version of: {@link #glProgramPathFragmentInputGenNV ProgramPathFragmentInputGenNV} */
	public static void glProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, FloatBuffer coeffs) {
		nglProgramPathFragmentInputGenNV(program, location, genMode, components, memAddress(coeffs));
	}

	// --- [ glGetPathParameterivNV ] ---

	/** JNI method for {@link #glGetPathParameterivNV GetPathParameterivNV} */
	@JavadocExclude
	public static native void nglGetPathParameterivNV(int path, int pname, long value, long __functionAddress);

	/** Unsafe version of {@link #glGetPathParameterivNV GetPathParameterivNV} */
	@JavadocExclude
	public static void nglGetPathParameterivNV(int path, int pname, long value) {
		long __functionAddress = getInstance().GetPathParameterivNV;
		nglGetPathParameterivNV(path, pname, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}, {@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}, {@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}, {@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}, {@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}, {@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}, {@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}, {@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}, {@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}, {@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}, {@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}, {@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}, {@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}, {@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}, {@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}, {@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}, {@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}, {@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}, {@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}, {@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}, {@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}
	 * @param value 
	 */
	public static void glGetPathParameterivNV(int path, int pname, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglGetPathParameterivNV(path, pname, memAddress(value));
	}

	/** Alternative version of: {@link #glGetPathParameterivNV GetPathParameterivNV} */
	public static void glGetPathParameterivNV(int path, int pname, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglGetPathParameterivNV(path, pname, memAddress(value));
	}

	/** Single return value version of: {@link #glGetPathParameterivNV GetPathParameterivNV} */
	public static int glGetPathParameteriNV(int path, int pname) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nglGetPathParameterivNV(path, pname, __buffer.address(value));
		return __buffer.intValue(value);
	}

	// --- [ glGetPathParameterfvNV ] ---

	/** JNI method for {@link #glGetPathParameterfvNV GetPathParameterfvNV} */
	@JavadocExclude
	public static native void nglGetPathParameterfvNV(int path, int pname, long value, long __functionAddress);

	/** Unsafe version of {@link #glGetPathParameterfvNV GetPathParameterfvNV} */
	@JavadocExclude
	public static void nglGetPathParameterfvNV(int path, int pname, long value) {
		long __functionAddress = getInstance().GetPathParameterfvNV;
		nglGetPathParameterfvNV(path, pname, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}, {@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}, {@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}, {@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}, {@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}, {@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}, {@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}, {@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}, {@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}, {@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}, {@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}, {@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}, {@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}, {@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}, {@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}, {@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}, {@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}, {@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}, {@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}, {@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}, {@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}, {@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}
	 * @param value 
	 */
	public static void glGetPathParameterfvNV(int path, int pname, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglGetPathParameterfvNV(path, pname, memAddress(value));
	}

	/** Alternative version of: {@link #glGetPathParameterfvNV GetPathParameterfvNV} */
	public static void glGetPathParameterfvNV(int path, int pname, FloatBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglGetPathParameterfvNV(path, pname, memAddress(value));
	}

	/** Single return value version of: {@link #glGetPathParameterfvNV GetPathParameterfvNV} */
	public static float glGetPathParameterfNV(int path, int pname) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nglGetPathParameterfvNV(path, pname, __buffer.address(value));
		return __buffer.floatValue(value);
	}

	// --- [ glGetPathCommandsNV ] ---

	/** JNI method for {@link #glGetPathCommandsNV GetPathCommandsNV} */
	@JavadocExclude
	public static native void nglGetPathCommandsNV(int path, long commands, long __functionAddress);

	/** Unsafe version of {@link #glGetPathCommandsNV GetPathCommandsNV} */
	@JavadocExclude
	public static void nglGetPathCommandsNV(int path, long commands) {
		long __functionAddress = getInstance().GetPathCommandsNV;
		nglGetPathCommandsNV(path, commands, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path     
	 * @param commands 
	 */
	public static void glGetPathCommandsNV(int path, ByteBuffer commands) {
		nglGetPathCommandsNV(path, memAddress(commands));
	}

	// --- [ glGetPathCoordsNV ] ---

	/** JNI method for {@link #glGetPathCoordsNV GetPathCoordsNV} */
	@JavadocExclude
	public static native void nglGetPathCoordsNV(int path, long coords, long __functionAddress);

	/** Unsafe version of {@link #glGetPathCoordsNV GetPathCoordsNV} */
	@JavadocExclude
	public static void nglGetPathCoordsNV(int path, long coords) {
		long __functionAddress = getInstance().GetPathCoordsNV;
		nglGetPathCoordsNV(path, coords, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path   
	 * @param coords 
	 */
	public static void glGetPathCoordsNV(int path, ByteBuffer coords) {
		nglGetPathCoordsNV(path, memAddress(coords));
	}

	/** Alternative version of: {@link #glGetPathCoordsNV GetPathCoordsNV} */
	public static void glGetPathCoordsNV(int path, FloatBuffer coords) {
		nglGetPathCoordsNV(path, memAddress(coords));
	}

	// --- [ glGetPathDashArrayNV ] ---

	/** JNI method for {@link #glGetPathDashArrayNV GetPathDashArrayNV} */
	@JavadocExclude
	public static native void nglGetPathDashArrayNV(int path, long dashArray, long __functionAddress);

	/** Unsafe version of {@link #glGetPathDashArrayNV GetPathDashArrayNV} */
	@JavadocExclude
	public static void nglGetPathDashArrayNV(int path, long dashArray) {
		long __functionAddress = getInstance().GetPathDashArrayNV;
		nglGetPathDashArrayNV(path, dashArray, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path      
	 * @param dashArray 
	 */
	public static void glGetPathDashArrayNV(int path, ByteBuffer dashArray) {
		nglGetPathDashArrayNV(path, memAddress(dashArray));
	}

	/** Alternative version of: {@link #glGetPathDashArrayNV GetPathDashArrayNV} */
	public static void glGetPathDashArrayNV(int path, FloatBuffer dashArray) {
		nglGetPathDashArrayNV(path, memAddress(dashArray));
	}

	// --- [ glGetPathMetricsNV ] ---

	/** JNI method for {@link #glGetPathMetricsNV GetPathMetricsNV} */
	@JavadocExclude
	public static native void nglGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, long paths, int pathBase, int stride, long metrics, long __functionAddress);

	/** Unsafe version of {@link #glGetPathMetricsNV GetPathMetricsNV} */
	@JavadocExclude
	public static void nglGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, long paths, int pathBase, int stride, long metrics) {
		long __functionAddress = getInstance().GetPathMetricsNV;
		nglGetPathMetricsNV(metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param metricQueryMask one or more of:<br>{@link #GL_GLYPH_WIDTH_BIT_NV GLYPH_WIDTH_BIT_NV}, {@link #GL_GLYPH_HEIGHT_BIT_NV GLYPH_HEIGHT_BIT_NV}, {@link #GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV GLYPH_HORIZONTAL_BEARING_X_BIT_NV}, {@link #GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV GLYPH_HORIZONTAL_BEARING_Y_BIT_NV}, {@link #GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV}, {@link #GL_GLYPH_VERTICAL_BEARING_X_BIT_NV GLYPH_VERTICAL_BEARING_X_BIT_NV}, {@link #GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV GLYPH_VERTICAL_BEARING_Y_BIT_NV}, {@link #GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV}, {@link #GL_GLYPH_HAS_KERNING_BIT_NV GLYPH_HAS_KERNING_BIT_NV}, {@link #GL_FONT_X_MIN_BOUNDS_BIT_NV FONT_X_MIN_BOUNDS_BIT_NV}, {@link #GL_FONT_Y_MIN_BOUNDS_BIT_NV FONT_Y_MIN_BOUNDS_BIT_NV}, {@link #GL_FONT_X_MAX_BOUNDS_BIT_NV FONT_X_MAX_BOUNDS_BIT_NV}, {@link #GL_FONT_Y_MAX_BOUNDS_BIT_NV FONT_Y_MAX_BOUNDS_BIT_NV}, {@link #GL_FONT_UNITS_PER_EM_BIT_NV FONT_UNITS_PER_EM_BIT_NV}, {@link #GL_FONT_ASCENDER_BIT_NV FONT_ASCENDER_BIT_NV}, {@link #GL_FONT_DESCENDER_BIT_NV FONT_DESCENDER_BIT_NV}, {@link #GL_FONT_HEIGHT_BIT_NV FONT_HEIGHT_BIT_NV}, {@link #GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV FONT_MAX_ADVANCE_WIDTH_BIT_NV}, {@link #GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV FONT_MAX_ADVANCE_HEIGHT_BIT_NV}, {@link #GL_FONT_UNDERLINE_POSITION_BIT_NV FONT_UNDERLINE_POSITION_BIT_NV}, {@link #GL_FONT_UNDERLINE_THICKNESS_BIT_NV FONT_UNDERLINE_THICKNESS_BIT_NV}, {@link #GL_FONT_HAS_KERNING_BIT_NV FONT_HAS_KERNING_BIT_NV}, {@link #GL_FONT_NUM_GLYPH_INDICES_BIT_NV FONT_NUM_GLYPH_INDICES_BIT_NV}
	 * @param numPaths        
	 * @param pathNameType    one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param paths           
	 * @param pathBase        
	 * @param stride          
	 * @param metrics         
	 */
	public static void glGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int stride, ByteBuffer metrics) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(paths, numPaths);
		nglGetPathMetricsNV(metricQueryMask, numPaths, pathNameType, memAddress(paths), pathBase, stride, memAddress(metrics));
	}

	/** Alternative version of: {@link #glGetPathMetricsNV GetPathMetricsNV} */
	public static void glGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, ByteBuffer paths, int pathBase, int stride, FloatBuffer metrics) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(paths, numPaths);
		nglGetPathMetricsNV(metricQueryMask, numPaths, pathNameType, memAddress(paths), pathBase, stride, memAddress(metrics));
	}

	// --- [ glGetPathMetricRangeNV ] ---

	/** JNI method for {@link #glGetPathMetricRangeNV GetPathMetricRangeNV} */
	@JavadocExclude
	public static native void nglGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, long metrics, long __functionAddress);

	/** Unsafe version of {@link #glGetPathMetricRangeNV GetPathMetricRangeNV} */
	@JavadocExclude
	public static void nglGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, long metrics) {
		long __functionAddress = getInstance().GetPathMetricRangeNV;
		nglGetPathMetricRangeNV(metricQueryMask, firstPathName, numPaths, stride, metrics, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param metricQueryMask one or more of:<br>{@link #GL_GLYPH_WIDTH_BIT_NV GLYPH_WIDTH_BIT_NV}, {@link #GL_GLYPH_HEIGHT_BIT_NV GLYPH_HEIGHT_BIT_NV}, {@link #GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV GLYPH_HORIZONTAL_BEARING_X_BIT_NV}, {@link #GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV GLYPH_HORIZONTAL_BEARING_Y_BIT_NV}, {@link #GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV}, {@link #GL_GLYPH_VERTICAL_BEARING_X_BIT_NV GLYPH_VERTICAL_BEARING_X_BIT_NV}, {@link #GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV GLYPH_VERTICAL_BEARING_Y_BIT_NV}, {@link #GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV}, {@link #GL_GLYPH_HAS_KERNING_BIT_NV GLYPH_HAS_KERNING_BIT_NV}, {@link #GL_FONT_X_MIN_BOUNDS_BIT_NV FONT_X_MIN_BOUNDS_BIT_NV}, {@link #GL_FONT_Y_MIN_BOUNDS_BIT_NV FONT_Y_MIN_BOUNDS_BIT_NV}, {@link #GL_FONT_X_MAX_BOUNDS_BIT_NV FONT_X_MAX_BOUNDS_BIT_NV}, {@link #GL_FONT_Y_MAX_BOUNDS_BIT_NV FONT_Y_MAX_BOUNDS_BIT_NV}, {@link #GL_FONT_UNITS_PER_EM_BIT_NV FONT_UNITS_PER_EM_BIT_NV}, {@link #GL_FONT_ASCENDER_BIT_NV FONT_ASCENDER_BIT_NV}, {@link #GL_FONT_DESCENDER_BIT_NV FONT_DESCENDER_BIT_NV}, {@link #GL_FONT_HEIGHT_BIT_NV FONT_HEIGHT_BIT_NV}, {@link #GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV FONT_MAX_ADVANCE_WIDTH_BIT_NV}, {@link #GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV FONT_MAX_ADVANCE_HEIGHT_BIT_NV}, {@link #GL_FONT_UNDERLINE_POSITION_BIT_NV FONT_UNDERLINE_POSITION_BIT_NV}, {@link #GL_FONT_UNDERLINE_THICKNESS_BIT_NV FONT_UNDERLINE_THICKNESS_BIT_NV}, {@link #GL_FONT_HAS_KERNING_BIT_NV FONT_HAS_KERNING_BIT_NV}, {@link #GL_FONT_NUM_GLYPH_INDICES_BIT_NV FONT_NUM_GLYPH_INDICES_BIT_NV}
	 * @param firstPathName   
	 * @param numPaths        
	 * @param stride          
	 * @param metrics         
	 */
	public static void glGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, ByteBuffer metrics) {
		nglGetPathMetricRangeNV(metricQueryMask, firstPathName, numPaths, stride, memAddress(metrics));
	}

	/** Alternative version of: {@link #glGetPathMetricRangeNV GetPathMetricRangeNV} */
	public static void glGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, FloatBuffer metrics) {
		nglGetPathMetricRangeNV(metricQueryMask, firstPathName, numPaths, stride, memAddress(metrics));
	}

	// --- [ glGetPathSpacingNV ] ---

	/** JNI method for {@link #glGetPathSpacingNV GetPathSpacingNV} */
	@JavadocExclude
	public static native void nglGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, long paths, int pathBase, float advanceScale, float kerningScale, int transformType, long returnedSpacing, long __functionAddress);

	/** Unsafe version of {@link #glGetPathSpacingNV GetPathSpacingNV} */
	@JavadocExclude
	public static void nglGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, long paths, int pathBase, float advanceScale, float kerningScale, int transformType, long returnedSpacing) {
		long __functionAddress = getInstance().GetPathSpacingNV;
		nglGetPathSpacingNV(pathListMode, numPaths, pathNameType, paths, pathBase, advanceScale, kerningScale, transformType, returnedSpacing, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param pathListMode    one of:<br>{@link #GL_ACCUM_ADJACENT_PAIRS_NV ACCUM_ADJACENT_PAIRS_NV}, {@link #GL_ADJACENT_PAIRS_NV ADJACENT_PAIRS_NV}, {@link #GL_FIRST_TO_REST_NV FIRST_TO_REST_NV}
	 * @param numPaths        
	 * @param pathNameType    one of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link #GL_UTF8_NV UTF8_NV}, {@link #GL_UTF16_NV UTF16_NV}, {@link GL11#GL_2_BYTES 2_BYTES}, {@link GL11#GL_3_BYTES 3_BYTES}, {@link GL11#GL_4_BYTES 4_BYTES}
	 * @param paths           
	 * @param pathBase        
	 * @param advanceScale    
	 * @param kerningScale    
	 * @param transformType   one of:<br>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}, {@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}, {@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}, {@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}, {@link #GL_AFFINE_2D_NV AFFINE_2D_NV}, {@link #GL_AFFINE_3D_NV AFFINE_3D_NV}, {@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}, {@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}
	 * @param returnedSpacing 
	 */
	public static void glGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, ByteBuffer paths, int pathBase, float advanceScale, float kerningScale, int transformType, ByteBuffer returnedSpacing) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(paths, numPaths);
		nglGetPathSpacingNV(pathListMode, numPaths, pathNameType, memAddress(paths), pathBase, advanceScale, kerningScale, transformType, memAddress(returnedSpacing));
	}

	/** Alternative version of: {@link #glGetPathSpacingNV GetPathSpacingNV} */
	public static void glGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, ByteBuffer paths, int pathBase, float advanceScale, float kerningScale, int transformType, FloatBuffer returnedSpacing) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(paths, numPaths);
		nglGetPathSpacingNV(pathListMode, numPaths, pathNameType, memAddress(paths), pathBase, advanceScale, kerningScale, transformType, memAddress(returnedSpacing));
	}

	// --- [ glGetPathColorGenivNV ] ---

	/** JNI method for {@link #glGetPathColorGenivNV GetPathColorGenivNV} */
	@JavadocExclude
	public static native void nglGetPathColorGenivNV(int color, int pname, long value, long __functionAddress);

	/** Unsafe version of {@link #glGetPathColorGenivNV GetPathColorGenivNV} */
	@JavadocExclude
	public static void nglGetPathColorGenivNV(int color, int pname, long value) {
		long __functionAddress = getInstance().GetPathColorGenivNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPathColorGenivNV(color, pname, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param color one of:<br>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}, {@link #GL_PRIMARY_COLOR_NV PRIMARY_COLOR_NV}, {@link #GL_SECONDARY_COLOR_NV SECONDARY_COLOR_NV}
	 * @param pname one of:<br>{@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV}, {@link #GL_PATH_GEN_COLOR_FORMAT_NV PATH_GEN_COLOR_FORMAT_NV}, {@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV}
	 * @param value 
	 */
	public static void glGetPathColorGenivNV(int color, int pname, ByteBuffer value) {
		nglGetPathColorGenivNV(color, pname, memAddress(value));
	}

	/** Alternative version of: {@link #glGetPathColorGenivNV GetPathColorGenivNV} */
	public static void glGetPathColorGenivNV(int color, int pname, IntBuffer value) {
		nglGetPathColorGenivNV(color, pname, memAddress(value));
	}

	/** Single return value version of: {@link #glGetPathColorGenivNV GetPathColorGenivNV} */
	public static int glGetPathColorGeniNV(int color, int pname) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nglGetPathColorGenivNV(color, pname, __buffer.address(value));
		return __buffer.intValue(value);
	}

	// --- [ glGetPathColorGenfvNV ] ---

	/** JNI method for {@link #glGetPathColorGenfvNV GetPathColorGenfvNV} */
	@JavadocExclude
	public static native void nglGetPathColorGenfvNV(int color, int pname, long value, long __functionAddress);

	/** Unsafe version of {@link #glGetPathColorGenfvNV GetPathColorGenfvNV} */
	@JavadocExclude
	public static void nglGetPathColorGenfvNV(int color, int pname, long value) {
		long __functionAddress = getInstance().GetPathColorGenfvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPathColorGenfvNV(color, pname, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param color one of:<br>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}, {@link #GL_PRIMARY_COLOR_NV PRIMARY_COLOR_NV}, {@link #GL_SECONDARY_COLOR_NV SECONDARY_COLOR_NV}
	 * @param pname one of:<br>{@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV}, {@link #GL_PATH_GEN_COLOR_FORMAT_NV PATH_GEN_COLOR_FORMAT_NV}, {@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV}
	 * @param value 
	 */
	public static void glGetPathColorGenfvNV(int color, int pname, ByteBuffer value) {
		nglGetPathColorGenfvNV(color, pname, memAddress(value));
	}

	/** Alternative version of: {@link #glGetPathColorGenfvNV GetPathColorGenfvNV} */
	public static void glGetPathColorGenfvNV(int color, int pname, FloatBuffer value) {
		nglGetPathColorGenfvNV(color, pname, memAddress(value));
	}

	/** Single return value version of: {@link #glGetPathColorGenfvNV GetPathColorGenfvNV} */
	public static float glGetPathColorGenfNV(int color, int pname) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nglGetPathColorGenfvNV(color, pname, __buffer.address(value));
		return __buffer.floatValue(value);
	}

	// --- [ glGetPathTexGenivNV ] ---

	/** JNI method for {@link #glGetPathTexGenivNV GetPathTexGenivNV} */
	@JavadocExclude
	public static native void nglGetPathTexGenivNV(int texCoordSet, int pname, long value, long __functionAddress);

	/** Unsafe version of {@link #glGetPathTexGenivNV GetPathTexGenivNV} */
	@JavadocExclude
	public static void nglGetPathTexGenivNV(int texCoordSet, int pname, long value) {
		long __functionAddress = getInstance().GetPathTexGenivNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPathTexGenivNV(texCoordSet, pname, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texCoordSet 
	 * @param pname       
	 * @param value       
	 */
	public static void glGetPathTexGenivNV(int texCoordSet, int pname, ByteBuffer value) {
		nglGetPathTexGenivNV(texCoordSet, pname, memAddress(value));
	}

	/** Alternative version of: {@link #glGetPathTexGenivNV GetPathTexGenivNV} */
	public static void glGetPathTexGenivNV(int texCoordSet, int pname, IntBuffer value) {
		nglGetPathTexGenivNV(texCoordSet, pname, memAddress(value));
	}

	/** Single return value version of: {@link #glGetPathTexGenivNV GetPathTexGenivNV} */
	public static int glGetPathTexGeniNV(int texCoordSet, int pname) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nglGetPathTexGenivNV(texCoordSet, pname, __buffer.address(value));
		return __buffer.intValue(value);
	}

	// --- [ glGetPathTexGenfvNV ] ---

	/** JNI method for {@link #glGetPathTexGenfvNV GetPathTexGenfvNV} */
	@JavadocExclude
	public static native void nglGetPathTexGenfvNV(int texCoordSet, int pname, long value, long __functionAddress);

	/** Unsafe version of {@link #glGetPathTexGenfvNV GetPathTexGenfvNV} */
	@JavadocExclude
	public static void nglGetPathTexGenfvNV(int texCoordSet, int pname, long value) {
		long __functionAddress = getInstance().GetPathTexGenfvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetPathTexGenfvNV(texCoordSet, pname, value, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param texCoordSet 
	 * @param pname       
	 * @param value       
	 */
	public static void glGetPathTexGenfvNV(int texCoordSet, int pname, ByteBuffer value) {
		nglGetPathTexGenfvNV(texCoordSet, pname, memAddress(value));
	}

	/** Alternative version of: {@link #glGetPathTexGenfvNV GetPathTexGenfvNV} */
	public static void glGetPathTexGenfvNV(int texCoordSet, int pname, FloatBuffer value) {
		nglGetPathTexGenfvNV(texCoordSet, pname, memAddress(value));
	}

	/** Single return value version of: {@link #glGetPathTexGenfvNV GetPathTexGenfvNV} */
	public static float glGetPathTexGenfNV(int texCoordSet, int pname) {
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nglGetPathTexGenfvNV(texCoordSet, pname, __buffer.address(value));
		return __buffer.floatValue(value);
	}

	// --- [ glIsPointInFillPathNV ] ---

	/** JNI method for {@link #glIsPointInFillPathNV IsPointInFillPathNV} */
	@JavadocExclude
	public static native boolean nglIsPointInFillPathNV(int path, int mask, float x, float y, long __functionAddress);

	/**
	 * 
	 *
	 * @param path 
	 * @param mask 
	 * @param x    
	 * @param y    
	 */
	public static boolean glIsPointInFillPathNV(int path, int mask, float x, float y) {
		long __functionAddress = getInstance().IsPointInFillPathNV;
		return nglIsPointInFillPathNV(path, mask, x, y, __functionAddress);
	}

	// --- [ glIsPointInStrokePathNV ] ---

	/** JNI method for {@link #glIsPointInStrokePathNV IsPointInStrokePathNV} */
	@JavadocExclude
	public static native boolean nglIsPointInStrokePathNV(int path, float x, float y, long __functionAddress);

	/**
	 * 
	 *
	 * @param path 
	 * @param x    
	 * @param y    
	 */
	public static boolean glIsPointInStrokePathNV(int path, float x, float y) {
		long __functionAddress = getInstance().IsPointInStrokePathNV;
		return nglIsPointInStrokePathNV(path, x, y, __functionAddress);
	}

	// --- [ glGetPathLengthNV ] ---

	/** JNI method for {@link #glGetPathLengthNV GetPathLengthNV} */
	@JavadocExclude
	public static native float nglGetPathLengthNV(int path, int startSegment, int numSegments, long __functionAddress);

	/**
	 * 
	 *
	 * @param path         
	 * @param startSegment 
	 * @param numSegments  
	 */
	public static float glGetPathLengthNV(int path, int startSegment, int numSegments) {
		long __functionAddress = getInstance().GetPathLengthNV;
		return nglGetPathLengthNV(path, startSegment, numSegments, __functionAddress);
	}

	// --- [ glPointAlongPathNV ] ---

	/** JNI method for {@link #glPointAlongPathNV PointAlongPathNV} */
	@JavadocExclude
	public static native boolean nglPointAlongPathNV(int path, int startSegment, int numSegments, float distance, long x, long y, long tangentX, long tangentY, long __functionAddress);

	/** Unsafe version of {@link #glPointAlongPathNV PointAlongPathNV} */
	@JavadocExclude
	public static boolean nglPointAlongPathNV(int path, int startSegment, int numSegments, float distance, long x, long y, long tangentX, long tangentY) {
		long __functionAddress = getInstance().PointAlongPathNV;
		return nglPointAlongPathNV(path, startSegment, numSegments, distance, x, y, tangentX, tangentY, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param path         
	 * @param startSegment 
	 * @param numSegments  
	 * @param distance     
	 * @param x            
	 * @param y            
	 * @param tangentX     
	 * @param tangentY     
	 */
	public static boolean glPointAlongPathNV(int path, int startSegment, int numSegments, float distance, ByteBuffer x, ByteBuffer y, ByteBuffer tangentX, ByteBuffer tangentY) {
		if ( LWJGLUtil.CHECKS ) {
			if ( x != null ) checkBuffer(x, 1 << 2);
			if ( y != null ) checkBuffer(y, 1 << 2);
			if ( tangentX != null ) checkBuffer(tangentX, 1 << 2);
			if ( tangentY != null ) checkBuffer(tangentY, 1 << 2);
		}
		return nglPointAlongPathNV(path, startSegment, numSegments, distance, memAddressSafe(x), memAddressSafe(y), memAddressSafe(tangentX), memAddressSafe(tangentY));
	}

	/** Alternative version of: {@link #glPointAlongPathNV PointAlongPathNV} */
	public static boolean glPointAlongPathNV(int path, int startSegment, int numSegments, float distance, FloatBuffer x, FloatBuffer y, FloatBuffer tangentX, FloatBuffer tangentY) {
		if ( LWJGLUtil.CHECKS ) {
			if ( x != null ) checkBuffer(x, 1);
			if ( y != null ) checkBuffer(y, 1);
			if ( tangentX != null ) checkBuffer(tangentX, 1);
			if ( tangentY != null ) checkBuffer(tangentY, 1);
		}
		return nglPointAlongPathNV(path, startSegment, numSegments, distance, memAddressSafe(x), memAddressSafe(y), memAddressSafe(tangentX), memAddressSafe(tangentY));
	}

	// --- [ glMatrixLoad3x2fNV ] ---

	/** JNI method for {@link #glMatrixLoad3x2fNV MatrixLoad3x2fNV} */
	@JavadocExclude
	public static native void nglMatrixLoad3x2fNV(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixLoad3x2fNV MatrixLoad3x2fNV} */
	@JavadocExclude
	public static void nglMatrixLoad3x2fNV(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoad3x2fNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixLoad3x2fNV(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}, {@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}
	 * @param m          
	 */
	public static void glMatrixLoad3x2fNV(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 6 << 2);
		nglMatrixLoad3x2fNV(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixLoad3x2fNV MatrixLoad3x2fNV} */
	public static void glMatrixLoad3x2fNV(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 6);
		nglMatrixLoad3x2fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixLoad3x3fNV ] ---

	/** JNI method for {@link #glMatrixLoad3x3fNV MatrixLoad3x3fNV} */
	@JavadocExclude
	public static native void nglMatrixLoad3x3fNV(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixLoad3x3fNV MatrixLoad3x3fNV} */
	@JavadocExclude
	public static void nglMatrixLoad3x3fNV(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoad3x3fNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixLoad3x3fNV(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}, {@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}
	 * @param m          
	 */
	public static void glMatrixLoad3x3fNV(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 9 << 2);
		nglMatrixLoad3x3fNV(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixLoad3x3fNV MatrixLoad3x3fNV} */
	public static void glMatrixLoad3x3fNV(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 9);
		nglMatrixLoad3x3fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixLoadTranspose3x3fNV ] ---

	/** JNI method for {@link #glMatrixLoadTranspose3x3fNV MatrixLoadTranspose3x3fNV} */
	@JavadocExclude
	public static native void nglMatrixLoadTranspose3x3fNV(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixLoadTranspose3x3fNV MatrixLoadTranspose3x3fNV} */
	@JavadocExclude
	public static void nglMatrixLoadTranspose3x3fNV(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixLoadTranspose3x3fNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixLoadTranspose3x3fNV(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}, {@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}
	 * @param m          
	 */
	public static void glMatrixLoadTranspose3x3fNV(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 9 << 2);
		nglMatrixLoadTranspose3x3fNV(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixLoadTranspose3x3fNV MatrixLoadTranspose3x3fNV} */
	public static void glMatrixLoadTranspose3x3fNV(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 9);
		nglMatrixLoadTranspose3x3fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMult3x2fNV ] ---

	/** JNI method for {@link #glMatrixMult3x2fNV MatrixMult3x2fNV} */
	@JavadocExclude
	public static native void nglMatrixMult3x2fNV(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixMult3x2fNV MatrixMult3x2fNV} */
	@JavadocExclude
	public static void nglMatrixMult3x2fNV(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMult3x2fNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixMult3x2fNV(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}, {@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}
	 * @param m          
	 */
	public static void glMatrixMult3x2fNV(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 6 << 2);
		nglMatrixMult3x2fNV(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixMult3x2fNV MatrixMult3x2fNV} */
	public static void glMatrixMult3x2fNV(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 6);
		nglMatrixMult3x2fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMult3x3fNV ] ---

	/** JNI method for {@link #glMatrixMult3x3fNV MatrixMult3x3fNV} */
	@JavadocExclude
	public static native void nglMatrixMult3x3fNV(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixMult3x3fNV MatrixMult3x3fNV} */
	@JavadocExclude
	public static void nglMatrixMult3x3fNV(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMult3x3fNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixMult3x3fNV(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}, {@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}
	 * @param m          
	 */
	public static void glMatrixMult3x3fNV(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 9 << 2);
		nglMatrixMult3x3fNV(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixMult3x3fNV MatrixMult3x3fNV} */
	public static void glMatrixMult3x3fNV(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 9);
		nglMatrixMult3x3fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMultTranspose3x3fNV ] ---

	/** JNI method for {@link #glMatrixMultTranspose3x3fNV MatrixMultTranspose3x3fNV} */
	@JavadocExclude
	public static native void nglMatrixMultTranspose3x3fNV(int matrixMode, long m, long __functionAddress);

	/** Unsafe version of {@link #glMatrixMultTranspose3x3fNV MatrixMultTranspose3x3fNV} */
	@JavadocExclude
	public static void nglMatrixMultTranspose3x3fNV(int matrixMode, long m) {
		long __functionAddress = getInstance().MatrixMultTranspose3x3fNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMatrixMultTranspose3x3fNV(matrixMode, m, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}, {@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}
	 * @param m          
	 */
	public static void glMatrixMultTranspose3x3fNV(int matrixMode, ByteBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 9 << 2);
		nglMatrixMultTranspose3x3fNV(matrixMode, memAddress(m));
	}

	/** Alternative version of: {@link #glMatrixMultTranspose3x3fNV MatrixMultTranspose3x3fNV} */
	public static void glMatrixMultTranspose3x3fNV(int matrixMode, FloatBuffer m) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(m, 9);
		nglMatrixMultTranspose3x3fNV(matrixMode, memAddress(m));
	}

	// --- [ glGetProgramResourcefvNV ] ---

	/** JNI method for {@link #glGetProgramResourcefvNV GetProgramResourcefvNV} */
	@JavadocExclude
	public static native void nglGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourcefvNV GetProgramResourcefvNV} */
	@JavadocExclude
	public static void nglGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
		long __functionAddress = getInstance().GetProgramResourcefvNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetProgramResourcefvNV(program, programInterface, index, propCount, props, bufSize, length, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param program          
	 * @param programInterface 
	 * @param index            
	 * @param propCount        
	 * @param props            
	 * @param bufSize          
	 * @param length           
	 * @param params           
	 */
	public static void glGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, ByteBuffer props, int bufSize, ByteBuffer length, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(props, propCount << 2);
			checkBuffer(params, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramResourcefvNV(program, programInterface, index, propCount, memAddress(props), bufSize, memAddressSafe(length), memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramResourcefvNV GetProgramResourcefvNV} */
	public static void glGetProgramResourcefvNV(int program, int programInterface, int index, IntBuffer props, IntBuffer length, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourcefvNV(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
	}

	/** Buffer return version of: {@link #glGetProgramResourcefvNV GetProgramResourcefvNV} */
	public static FloatBuffer glGetProgramResourcefvNV(int program, int programInterface, int index, IntBuffer props, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int params = __buffer.bufferParam(bufSize << 2);
		nglGetProgramResourcefvNV(program, programInterface, index, props.remaining(), memAddress(props), bufSize, __buffer.address(length), __buffer.address(params));
		return memFloatBuffer(__buffer.address(params), __buffer.intValue(length));
	}

}