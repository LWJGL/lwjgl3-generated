/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.opengles.GLES20.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/path_rendering.txt">NV_path_rendering</a> extension.
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
 * <p>This extension supports path rendering through a sequence of three operations:</p>
 * 
 * <ol>
 * <li>Path specification is the process of creating and updating a path object consisting of a set of path commands and a corresponding set of 2D
 * vertices.
 * 
 * <p>Path commands can be specified explicitly from path command and coordinate data, parsed from a string based on standard grammars for representing
 * paths, or specified by a particular glyph of standard font representations. Also new paths can be specified by weighting one or more existing paths
 * so long as all the weighted paths have consistent command sequences.</p>
 * 
 * <p>Each path object contains zero or more subpaths specified by a sequence of line segments, partial elliptical arcs, and (cubic or quadratic) Bezier
 * curve segments. Each path may contain multiple subpaths that can be closed (forming a contour) or open.</p></li>
 * <li>Path stenciling is the process of updating the stencil buffer based on a path's coverage transformed into window space.
 * 
 * <p>Path stenciling can determine either the filled or stroked coverage of a path.</p>
 * 
 * <p>The details of path stenciling are explained within the core of the specification.</p>
 * 
 * <p>Stenciling a stroked path supports all the standard embellishments for path stroking such as end caps, join styles, miter limits, dashing, and dash
 * caps. These stroking properties specified are parameters of path objects.</p></li>
 * <li>Path covering is the process of emitting simple (convex & planar) geometry that (conservatively) "covers" the path's sample coverage in the stencil
 * buffer. During path covering, stencil testing can be configured to discard fragments not within the actual coverage of the path as determined by
 * prior path stenciling.
 * 
 * <p>Path covering can cover either the filled or stroked coverage of a path.</p>
 * 
 * <p>The details of path covering are explained within the core of the specification.</p></li>
 * </ol>
 * 
 * <p>To render a path object into the color buffer, an application specifies a path object and then uses a two-step rendering process. First, the path
 * object is stenciled whereby the path object's stroked or filled coverage is rasterized into the stencil buffer. Second, the path object is covered
 * whereby conservative bounding geometry for the path is transformed and rasterized with stencil testing configured to test against the coverage
 * information written to the stencil buffer in the first step so that only fragments covered by the path are written during this second step. Also during
 * this second step written pixels typically have their stencil value reset (so there's no need for clearing the stencil buffer between rendering each
 * path).</p>
 */
public class NVPathRendering {

	/** Accepted in elements of the {@code commands} array parameter of PathCommandsNV and PathSubCommandsNV. */
	public static final byte
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
		GL_ROUNDED_RECT_NV                       = (byte)0xE8,
		GL_RELATIVE_ROUNDED_RECT_NV              = (byte)0xE9,
		GL_ROUNDED_RECT2_NV                      = (byte)0xEA,
		GL_RELATIVE_ROUNDED_RECT2_NV             = (byte)0xEB,
		GL_ROUNDED_RECT4_NV                      = (byte)0xEC,
		GL_RELATIVE_ROUNDED_RECT4_NV             = (byte)0xED,
		GL_ROUNDED_RECT8_NV                      = (byte)0xEE,
		GL_RELATIVE_ROUNDED_RECT8_NV             = (byte)0xEF,
		GL_RESTART_PATH_NV                       = (byte)0xF0,
		GL_DUP_FIRST_CUBIC_CURVE_TO_NV           = (byte)0xF2,
		GL_DUP_LAST_CUBIC_CURVE_TO_NV            = (byte)0xF4,
		GL_RECT_NV                               = (byte)0xF6,
		GL_RELATIVE_RECT_NV                      = (byte)0xF7,
		GL_CIRCULAR_CCW_ARC_TO_NV                = (byte)0xF8,
		GL_CIRCULAR_CW_ARC_TO_NV                 = (byte)0xFA,
		GL_CIRCULAR_TANGENT_ARC_TO_NV            = (byte)0xFC,
		GL_ARC_TO_NV                             = (byte)0xFE,
		GL_RELATIVE_ARC_TO_NV                    = (byte)0xFF;

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

	/** The following types are defined as alias to the GL tokens. */
	public static final int
		GL_2_BYTES_NV       = 0x1407,
		GL_3_BYTES_NV       = 0x1408,
		GL_4_BYTES_NV       = 0x1409,
		GL_EYE_LINEAR_NV    = 0x2400,
		GL_OBJECT_LINEAR_NV = 0x2401,
		GL_CONSTANT_NV      = 0x8576;

	protected NVPathRendering() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glPathCommandsNV, caps.glPathCoordsNV, caps.glPathSubCommandsNV, caps.glPathSubCoordsNV, caps.glPathStringNV, caps.glPathGlyphsNV, 
			caps.glPathGlyphRangeNV, caps.glCopyPathNV, caps.glInterpolatePathsNV, caps.glTransformPathNV, caps.glPathParameterivNV, caps.glPathParameteriNV, 
			caps.glPathParameterfvNV, caps.glPathParameterfNV, caps.glPathDashArrayNV, caps.glGenPathsNV, caps.glDeletePathsNV, caps.glIsPathNV, 
			caps.glPathStencilFuncNV, caps.glPathStencilDepthOffsetNV, caps.glStencilFillPathNV, caps.glStencilStrokePathNV, caps.glStencilFillPathInstancedNV, 
			caps.glStencilStrokePathInstancedNV, caps.glPathCoverDepthFuncNV, caps.glCoverFillPathNV, caps.glCoverStrokePathNV, caps.glCoverFillPathInstancedNV, 
			caps.glCoverStrokePathInstancedNV, caps.glGetPathParameterivNV, caps.glGetPathParameterfvNV, caps.glGetPathCommandsNV, caps.glGetPathCoordsNV, 
			caps.glGetPathDashArrayNV, caps.glGetPathMetricsNV, caps.glGetPathMetricRangeNV, caps.glGetPathSpacingNV, caps.glIsPointInFillPathNV, 
			caps.glIsPointInStrokePathNV, caps.glGetPathLengthNV, caps.glPointAlongPathNV
		);
	}

	// --- [ glPathCommandsNV ] ---

	/**
	 * 
	 *
	 * @param path        
	 * @param numCommands 
	 * @param commands    
	 * @param numCoords   
	 * @param coordType   one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td></tr></table>
	 * @param coords      
	 */
	public static void nglPathCommandsNV(int path, int numCommands, long commands, int numCoords, int coordType, long coords) {
		long __functionAddress = GLES.getCapabilities().glPathCommandsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, path, numCommands, commands, numCoords, coordType, coords);
	}

	/**
	 * 
	 *
	 * @param path      
	 * @param commands  
	 * @param coordType one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td></tr></table>
	 * @param coords    
	 */
	public static void glPathCommandsNV(int path, ByteBuffer commands, int coordType, ByteBuffer coords) {
		nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining() >> GLESChecks.typeToByteShift(coordType), coordType, memAddress(coords));
	}

	/** ShortBuffer version of: {@link #glPathCommandsNV PathCommandsNV} */
	public static void glPathCommandsNV(int path, ByteBuffer commands, int coordType, ShortBuffer coords) {
		nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining(), coordType, memAddress(coords));
	}

	/** FloatBuffer version of: {@link #glPathCommandsNV PathCommandsNV} */
	public static void glPathCommandsNV(int path, ByteBuffer commands, int coordType, FloatBuffer coords) {
		nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining(), coordType, memAddress(coords));
	}

	// --- [ glPathCoordsNV ] ---

	/**
	 * 
	 *
	 * @param path      
	 * @param numCoords 
	 * @param coordType one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td></tr></table>
	 * @param coords    
	 */
	public static void nglPathCoordsNV(int path, int numCoords, int coordType, long coords) {
		long __functionAddress = GLES.getCapabilities().glPathCoordsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, numCoords, coordType, coords);
	}

	/**
	 * 
	 *
	 * @param path      
	 * @param coordType one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td></tr></table>
	 * @param coords    
	 */
	public static void glPathCoordsNV(int path, int coordType, ByteBuffer coords) {
		nglPathCoordsNV(path, coords.remaining() >> GLESChecks.typeToByteShift(coordType), coordType, memAddress(coords));
	}

	/** ShortBuffer version of: {@link #glPathCoordsNV PathCoordsNV} */
	public static void glPathCoordsNV(int path, int coordType, ShortBuffer coords) {
		nglPathCoordsNV(path, coords.remaining(), coordType, memAddress(coords));
	}

	/** FloatBuffer version of: {@link #glPathCoordsNV PathCoordsNV} */
	public static void glPathCoordsNV(int path, int coordType, FloatBuffer coords) {
		nglPathCoordsNV(path, coords.remaining(), coordType, memAddress(coords));
	}

	// --- [ glPathSubCommandsNV ] ---

	/**
	 * 
	 *
	 * @param path             
	 * @param commandStart     
	 * @param commandsToDelete 
	 * @param numCommands      
	 * @param commands         
	 * @param numCoords        
	 * @param coordType        one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td></tr></table>
	 * @param coords           
	 */
	public static void nglPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, long commands, int numCoords, int coordType, long coords) {
		long __functionAddress = GLES.getCapabilities().glPathSubCommandsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, path, commandStart, commandsToDelete, numCommands, commands, numCoords, coordType, coords);
	}

	/**
	 * 
	 *
	 * @param path             
	 * @param commandStart     
	 * @param commandsToDelete 
	 * @param commands         
	 * @param coordType        one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td></tr></table>
	 * @param coords           
	 */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, int coordType, ByteBuffer coords) {
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining() >> GLESChecks.typeToByteShift(coordType), coordType, memAddress(coords));
	}

	/** ShortBuffer version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, int coordType, ShortBuffer coords) {
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining(), coordType, memAddress(coords));
	}

	/** FloatBuffer version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, int coordType, FloatBuffer coords) {
		nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining(), coordType, memAddress(coords));
	}

	// --- [ glPathSubCoordsNV ] ---

	/**
	 * 
	 *
	 * @param path       
	 * @param coordStart 
	 * @param numCoords  
	 * @param coordType  one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td></tr></table>
	 * @param coords     
	 */
	public static void nglPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, long coords) {
		long __functionAddress = GLES.getCapabilities().glPathSubCoordsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, coordStart, numCoords, coordType, coords);
	}

	/**
	 * 
	 *
	 * @param path       
	 * @param coordStart 
	 * @param coordType  one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td></tr></table>
	 * @param coords     
	 */
	public static void glPathSubCoordsNV(int path, int coordStart, int coordType, ByteBuffer coords) {
		nglPathSubCoordsNV(path, coordStart, coords.remaining() >> GLESChecks.typeToByteShift(coordType), coordType, memAddress(coords));
	}

	/** ShortBuffer version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
	public static void glPathSubCoordsNV(int path, int coordStart, int coordType, ShortBuffer coords) {
		nglPathSubCoordsNV(path, coordStart, coords.remaining(), coordType, memAddress(coords));
	}

	/** FloatBuffer version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
	public static void glPathSubCoordsNV(int path, int coordStart, int coordType, FloatBuffer coords) {
		nglPathSubCoordsNV(path, coordStart, coords.remaining(), coordType, memAddress(coords));
	}

	// --- [ glPathStringNV ] ---

	/**
	 * 
	 *
	 * @param path       
	 * @param format     one of:<br><table><tr><td>{@link #GL_PATH_FORMAT_SVG_NV PATH_FORMAT_SVG_NV}</td><td>{@link #GL_PATH_FORMAT_PS_NV PATH_FORMAT_PS_NV}</td></tr></table>
	 * @param length     
	 * @param pathString 
	 */
	public static void nglPathStringNV(int path, int format, int length, long pathString) {
		long __functionAddress = GLES.getCapabilities().glPathStringNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, format, length, pathString);
	}

	/**
	 * 
	 *
	 * @param path       
	 * @param format     one of:<br><table><tr><td>{@link #GL_PATH_FORMAT_SVG_NV PATH_FORMAT_SVG_NV}</td><td>{@link #GL_PATH_FORMAT_PS_NV PATH_FORMAT_PS_NV}</td></tr></table>
	 * @param pathString 
	 */
	public static void glPathStringNV(int path, int format, ByteBuffer pathString) {
		nglPathStringNV(path, format, pathString.remaining(), memAddress(pathString));
	}

	// --- [ glPathGlyphsNV ] ---

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontName              
	 * @param fontStyle             one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
	 * @param numGlyphs             
	 * @param type                  one of:<br><table><tr><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td></tr><tr><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param charcodes             
	 * @param handleMissingGlyphs   one of:<br><table><tr><td>{@link #GL_SKIP_MISSING_GLYPH_NV SKIP_MISSING_GLYPH_NV}</td><td>{@link #GL_USE_MISSING_GLYPH_NV USE_MISSING_GLYPH_NV}</td></tr></table>
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static void nglPathGlyphsNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int numGlyphs, int type, long charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
		long __functionAddress = GLES.getCapabilities().glPathGlyphsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, firstPathName, fontTarget, fontName, fontStyle, numGlyphs, type, charcodes, handleMissingGlyphs, pathParameterTemplate, emScale);
	}

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontName              
	 * @param fontStyle             one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
	 * @param type                  one of:<br><table><tr><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td></tr><tr><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param charcodes             
	 * @param handleMissingGlyphs   one of:<br><table><tr><td>{@link #GL_SKIP_MISSING_GLYPH_NV SKIP_MISSING_GLYPH_NV}</td><td>{@link #GL_USE_MISSING_GLYPH_NV USE_MISSING_GLYPH_NV}</td></tr></table>
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static void glPathGlyphsNV(int firstPathName, int fontTarget, ByteBuffer fontName, int fontStyle, int type, ByteBuffer charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
		if ( CHECKS )
			checkNT1(fontName);
		nglPathGlyphsNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, charcodes.remaining() / charcodeTypeToBytes(type), type, memAddress(charcodes), handleMissingGlyphs, pathParameterTemplate, emScale);
	}

	// --- [ glPathGlyphRangeNV ] ---

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontName              
	 * @param fontStyle             one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
	 * @param firstGlyph            
	 * @param numGlyphs             
	 * @param handleMissingGlyphs   one of:<br><table><tr><td>{@link #GL_SKIP_MISSING_GLYPH_NV SKIP_MISSING_GLYPH_NV}</td><td>{@link #GL_USE_MISSING_GLYPH_NV USE_MISSING_GLYPH_NV}</td></tr></table>
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static void nglPathGlyphRangeNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
		long __functionAddress = GLES.getCapabilities().glPathGlyphRangeNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, firstPathName, fontTarget, fontName, fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale);
	}

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontName              
	 * @param fontStyle             one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
	 * @param firstGlyph            
	 * @param numGlyphs             
	 * @param handleMissingGlyphs   one of:<br><table><tr><td>{@link #GL_SKIP_MISSING_GLYPH_NV SKIP_MISSING_GLYPH_NV}</td><td>{@link #GL_USE_MISSING_GLYPH_NV USE_MISSING_GLYPH_NV}</td></tr></table>
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static void glPathGlyphRangeNV(int firstPathName, int fontTarget, ByteBuffer fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale) {
		if ( CHECKS )
			checkNT1(fontName);
		nglPathGlyphRangeNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale);
	}

	// --- [ glPathGlyphIndexArrayNV ] ---

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontName              
	 * @param fontStyle             one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
	 * @param firstGlyphIndex       
	 * @param numGlyphs             
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static int nglPathGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		long __functionAddress = GLES.getCapabilities().glPathGlyphIndexArrayNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, firstPathName, fontTarget, fontName, fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
	}

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontName              
	 * @param fontStyle             one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
	 * @param firstGlyphIndex       
	 * @param numGlyphs             
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static int glPathGlyphIndexArrayNV(int firstPathName, int fontTarget, ByteBuffer fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		if ( CHECKS )
			checkNT1(fontName);
		return nglPathGlyphIndexArrayNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
	}

	// --- [ glPathMemoryGlyphIndexArrayNV ] ---

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontSize              
	 * @param fontData              
	 * @param faceIndex             
	 * @param firstGlyphIndex       
	 * @param numGlyphs             
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static int nglPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, long fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		long __functionAddress = GLES.getCapabilities().glPathMemoryGlyphIndexArrayNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPI(__functionAddress, firstPathName, fontTarget, fontSize, fontData, faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
	}

	/**
	 * 
	 *
	 * @param firstPathName         
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontData              
	 * @param faceIndex             
	 * @param firstGlyphIndex       
	 * @param numGlyphs             
	 * @param pathParameterTemplate 
	 * @param emScale               
	 */
	public static int glPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, ByteBuffer fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale) {
		return nglPathMemoryGlyphIndexArrayNV(firstPathName, fontTarget, (long)fontData.remaining(), memAddress(fontData), faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
	}

	// --- [ glCopyPathNV ] ---

	public static void glCopyPathNV(int resultPath, int srcPath) {
		long __functionAddress = GLES.getCapabilities().glCopyPathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, resultPath, srcPath);
	}

	// --- [ glWeightPathsNV ] ---

	public static void nglWeightPathsNV(int resultPath, int numPaths, long paths, long weights) {
		long __functionAddress = GLES.getCapabilities().glWeightPathsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, resultPath, numPaths, paths, weights);
	}

	public static void glWeightPathsNV(int resultPath, IntBuffer paths, FloatBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, paths.remaining());
		nglWeightPathsNV(resultPath, paths.remaining(), memAddress(paths), memAddress(weights));
	}

	// --- [ glInterpolatePathsNV ] ---

	public static void glInterpolatePathsNV(int resultPath, int pathA, int pathB, float weight) {
		long __functionAddress = GLES.getCapabilities().glInterpolatePathsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, resultPath, pathA, pathB, weight);
	}

	// --- [ glTransformPathNV ] ---

	/**
	 * 
	 *
	 * @param resultPath      
	 * @param srcPath         
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void nglTransformPathNV(int resultPath, int srcPath, int transformType, long transformValues) {
		long __functionAddress = GLES.getCapabilities().glTransformPathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, resultPath, srcPath, transformType, transformValues);
	}

	/**
	 * 
	 *
	 * @param resultPath      
	 * @param srcPath         
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void glTransformPathNV(int resultPath, int srcPath, int transformType, FloatBuffer transformValues) {
		if ( CHECKS )
			checkBuffer(transformValues, transformTypeToElements(transformType));
		nglTransformPathNV(resultPath, srcPath, transformType, memAddress(transformValues));
	}

	// --- [ glPathParameterivNV ] ---

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td></tr></table>
	 * @param value 
	 */
	public static void nglPathParameterivNV(int path, int pname, long value) {
		long __functionAddress = GLES.getCapabilities().glPathParameterivNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, pname, value);
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td></tr></table>
	 * @param value 
	 */
	public static void glPathParameterivNV(int path, int pname, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglPathParameterivNV(path, pname, memAddress(value));
	}

	// --- [ glPathParameteriNV ] ---

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td></tr></table>
	 * @param value 
	 */
	public static void glPathParameteriNV(int path, int pname, int value) {
		long __functionAddress = GLES.getCapabilities().glPathParameteriNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, pname, value);
	}

	// --- [ glPathParameterfvNV ] ---

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_END_CAPS_NV PATH_END_CAPS_NV}</td><td>{@link #GL_PATH_DASH_CAPS_NV PATH_DASH_CAPS_NV}</td></tr></table>
	 * @param value 
	 */
	public static void nglPathParameterfvNV(int path, int pname, long value) {
		long __functionAddress = GLES.getCapabilities().glPathParameterfvNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, pname, value);
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_END_CAPS_NV PATH_END_CAPS_NV}</td><td>{@link #GL_PATH_DASH_CAPS_NV PATH_DASH_CAPS_NV}</td></tr></table>
	 * @param value 
	 */
	public static void glPathParameterfvNV(int path, int pname, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglPathParameterfvNV(path, pname, memAddress(value));
	}

	// --- [ glPathParameterfNV ] ---

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_END_CAPS_NV PATH_END_CAPS_NV}</td><td>{@link #GL_PATH_DASH_CAPS_NV PATH_DASH_CAPS_NV}</td></tr></table>
	 * @param value 
	 */
	public static void glPathParameterfNV(int path, int pname, float value) {
		long __functionAddress = GLES.getCapabilities().glPathParameterfNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, pname, value);
	}

	// --- [ glPathDashArrayNV ] ---

	public static void nglPathDashArrayNV(int path, int dashCount, long dashArray) {
		long __functionAddress = GLES.getCapabilities().glPathDashArrayNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, dashCount, dashArray);
	}

	public static void glPathDashArrayNV(int path, FloatBuffer dashArray) {
		nglPathDashArrayNV(path, dashArray.remaining(), memAddress(dashArray));
	}

	// --- [ glGenPathsNV ] ---

	public static int glGenPathsNV(int range) {
		long __functionAddress = GLES.getCapabilities().glGenPathsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callI(__functionAddress, range);
	}

	// --- [ glDeletePathsNV ] ---

	public static void glDeletePathsNV(int path, int range) {
		long __functionAddress = GLES.getCapabilities().glDeletePathsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, range);
	}

	// --- [ glIsPathNV ] ---

	public static boolean glIsPathNV(int path) {
		long __functionAddress = GLES.getCapabilities().glIsPathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, path);
	}

	// --- [ glPathStencilFuncNV ] ---

	public static void glPathStencilFuncNV(int func, int ref, int mask) {
		long __functionAddress = GLES.getCapabilities().glPathStencilFuncNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, func, ref, mask);
	}

	// --- [ glPathStencilDepthOffsetNV ] ---

	public static void glPathStencilDepthOffsetNV(float factor, float units) {
		long __functionAddress = GLES.getCapabilities().glPathStencilDepthOffsetNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, factor, units);
	}

	// --- [ glStencilFillPathNV ] ---

	/**
	 * 
	 *
	 * @param path     
	 * @param fillMode one of:<br><table><tr><td>{@link GLES20#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
	 * @param mask     
	 */
	public static void glStencilFillPathNV(int path, int fillMode, int mask) {
		long __functionAddress = GLES.getCapabilities().glStencilFillPathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, fillMode, mask);
	}

	// --- [ glStencilStrokePathNV ] ---

	public static void glStencilStrokePathNV(int path, int reference, int mask) {
		long __functionAddress = GLES.getCapabilities().glStencilStrokePathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, reference, mask);
	}

	// --- [ glStencilFillPathInstancedNV ] ---

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param fillMode        one of:<br><table><tr><td>{@link GLES20#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
	 * @param mask            
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void nglStencilFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int transformType, long transformValues) {
		long __functionAddress = GLES.getCapabilities().glStencilFillPathInstancedNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, numPaths, pathNameType, paths, pathBase, fillMode, mask, transformType, transformValues);
	}

	/**
	 * 
	 *
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param fillMode        one of:<br><table><tr><td>{@link GLES20#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
	 * @param mask            
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void glStencilFillPathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int fillMode, int mask, int transformType, FloatBuffer transformValues) {
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS )
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		nglStencilFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, transformType, memAddress(transformValues));
	}

	// --- [ glStencilStrokePathInstancedNV ] ---

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param reference       
	 * @param mask            
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void nglStencilStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int transformType, long transformValues) {
		long __functionAddress = GLES.getCapabilities().glStencilStrokePathInstancedNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, numPaths, pathNameType, paths, pathBase, reference, mask, transformType, transformValues);
	}

	/**
	 * 
	 *
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param reference       
	 * @param mask            
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void glStencilStrokePathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int reference, int mask, int transformType, FloatBuffer transformValues) {
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS )
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		nglStencilStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, transformType, memAddress(transformValues));
	}

	// --- [ glPathCoverDepthFuncNV ] ---

	public static void glPathCoverDepthFuncNV(int zfunc) {
		long __functionAddress = GLES.getCapabilities().glPathCoverDepthFuncNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, zfunc);
	}

	// --- [ glCoverFillPathNV ] ---

	/**
	 * 
	 *
	 * @param path      
	 * @param coverMode one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td></tr></table>
	 */
	public static void glCoverFillPathNV(int path, int coverMode) {
		long __functionAddress = GLES.getCapabilities().glCoverFillPathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, coverMode);
	}

	// --- [ glCoverStrokePathNV ] ---

	/**
	 * 
	 *
	 * @param path      
	 * @param coverMode one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td></tr></table>
	 */
	public static void glCoverStrokePathNV(int path, int coverMode) {
		long __functionAddress = GLES.getCapabilities().glCoverStrokePathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, coverMode);
	}

	// --- [ glCoverFillPathInstancedNV ] ---

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param coverMode       one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void nglCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues) {
		long __functionAddress = GLES.getCapabilities().glCoverFillPathInstancedNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues);
	}

	/**
	 * 
	 *
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param coverMode       one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void glCoverFillPathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int coverMode, int transformType, FloatBuffer transformValues) {
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS )
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		nglCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
	}

	// --- [ glCoverStrokePathInstancedNV ] ---

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param coverMode       one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void nglCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues) {
		long __functionAddress = GLES.getCapabilities().glCoverStrokePathInstancedNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, numPaths, pathNameType, paths, pathBase, coverMode, transformType, transformValues);
	}

	/**
	 * 
	 *
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param coverMode       one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void glCoverStrokePathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int coverMode, int transformType, FloatBuffer transformValues) {
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS )
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		nglCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
	}

	// --- [ glStencilThenCoverFillPathNV ] ---

	/**
	 * 
	 *
	 * @param path      
	 * @param fillMode  one of:<br><table><tr><td>{@link GLES20#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
	 * @param mask      
	 * @param coverMode one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td></tr></table>
	 */
	public static void glStencilThenCoverFillPathNV(int path, int fillMode, int mask, int coverMode) {
		long __functionAddress = GLES.getCapabilities().glStencilThenCoverFillPathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, fillMode, mask, coverMode);
	}

	// --- [ glStencilThenCoverStrokePathNV ] ---

	/**
	 * 
	 *
	 * @param path      
	 * @param reference 
	 * @param mask      
	 * @param coverMode one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td></tr></table>
	 */
	public static void glStencilThenCoverStrokePathNV(int path, int reference, int mask, int coverMode) {
		long __functionAddress = GLES.getCapabilities().glStencilThenCoverStrokePathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, path, reference, mask, coverMode);
	}

	// --- [ glStencilThenCoverFillPathInstancedNV ] ---

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param fillMode        one of:<br><table><tr><td>{@link GLES20#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
	 * @param mask            
	 * @param coverMode       one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void nglStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, long transformValues) {
		long __functionAddress = GLES.getCapabilities().glStencilThenCoverFillPathInstancedNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, numPaths, pathNameType, paths, pathBase, fillMode, mask, coverMode, transformType, transformValues);
	}

	/**
	 * 
	 *
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param fillMode        one of:<br><table><tr><td>{@link GLES20#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
	 * @param mask            
	 * @param coverMode       one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void glStencilThenCoverFillPathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, FloatBuffer transformValues) {
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS )
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		nglStencilThenCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, coverMode, transformType, memAddress(transformValues));
	}

	// --- [ glStencilThenCoverStrokePathInstancedNV ] ---

	/**
	 * 
	 *
	 * @param numPaths        
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param reference       
	 * @param mask            
	 * @param coverMode       one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void nglStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int coverMode, int transformType, long transformValues) {
		long __functionAddress = GLES.getCapabilities().glStencilThenCoverStrokePathInstancedNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, numPaths, pathNameType, paths, pathBase, reference, mask, coverMode, transformType, transformValues);
	}

	/**
	 * 
	 *
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param reference       
	 * @param mask            
	 * @param coverMode       one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
	 * @param transformValues 
	 */
	public static void glStencilThenCoverStrokePathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int reference, int mask, int coverMode, int transformType, FloatBuffer transformValues) {
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS )
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		nglStencilThenCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, coverMode, transformType, memAddress(transformValues));
	}

	// --- [ glPathGlyphIndexRangeNV ] ---

	/**
	 * 
	 *
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontName              
	 * @param fontStyle             one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
	 * @param pathParameterTemplate 
	 * @param emScale               
	 * @param baseAndCount          
	 */
	public static int nglPathGlyphIndexRangeNV(int fontTarget, long fontName, int fontStyle, int pathParameterTemplate, float emScale, int baseAndCount) {
		long __functionAddress = GLES.getCapabilities().glPathGlyphIndexRangeNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, fontTarget, fontName, fontStyle, pathParameterTemplate, emScale, baseAndCount);
	}

	/**
	 * 
	 *
	 * @param fontTarget            one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
	 * @param fontName              
	 * @param fontStyle             one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
	 * @param pathParameterTemplate 
	 * @param emScale               
	 * @param baseAndCount          
	 */
	public static int glPathGlyphIndexRangeNV(int fontTarget, ByteBuffer fontName, int fontStyle, int pathParameterTemplate, float emScale, int baseAndCount) {
		if ( CHECKS )
			checkNT1(fontName);
		return nglPathGlyphIndexRangeNV(fontTarget, memAddress(fontName), fontStyle, pathParameterTemplate, emScale, baseAndCount);
	}

	// --- [ glProgramPathFragmentInputGenNV ] ---

	public static void nglProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, long coeffs) {
		long __functionAddress = GLES.getCapabilities().glProgramPathFragmentInputGenNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, genMode, components, coeffs);
	}

	public static void glProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, FloatBuffer coeffs) {
		if ( CHECKS )
			checkBuffer(coeffs, genModeToElements(genMode) * components);
		nglProgramPathFragmentInputGenNV(program, location, genMode, components, memAddress(coeffs));
	}

	// --- [ glGetPathParameterivNV ] ---

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table>
	 * @param value 
	 */
	public static void nglGetPathParameterivNV(int path, int pname, long value) {
		long __functionAddress = GLES.getCapabilities().glGetPathParameterivNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, pname, value);
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table>
	 * @param value 
	 */
	public static void glGetPathParameterivNV(int path, int pname, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglGetPathParameterivNV(path, pname, memAddress(value));
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table>
	 */
	public static int glGetPathParameteriNV(int path, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer value = stack.callocInt(1);
			nglGetPathParameterivNV(path, pname, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetPathParameterfvNV ] ---

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table>
	 * @param value 
	 */
	public static void nglGetPathParameterfvNV(int path, int pname, long value) {
		long __functionAddress = GLES.getCapabilities().glGetPathParameterfvNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, pname, value);
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table>
	 * @param value 
	 */
	public static void glGetPathParameterfvNV(int path, int pname, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglGetPathParameterfvNV(path, pname, memAddress(value));
	}

	/**
	 * 
	 *
	 * @param path  
	 * @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table>
	 */
	public static float glGetPathParameterfNV(int path, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer value = stack.callocFloat(1);
			nglGetPathParameterfvNV(path, pname, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetPathCommandsNV ] ---

	public static void nglGetPathCommandsNV(int path, long commands) {
		long __functionAddress = GLES.getCapabilities().glGetPathCommandsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, commands);
	}

	public static void glGetPathCommandsNV(int path, ByteBuffer commands) {
		if ( CHECKS )
			if ( DEBUG )
				checkBuffer(commands, glGetPathParameteriNV(path, GL_PATH_COMMAND_COUNT_NV));
		nglGetPathCommandsNV(path, memAddress(commands));
	}

	// --- [ glGetPathCoordsNV ] ---

	public static void nglGetPathCoordsNV(int path, long coords) {
		long __functionAddress = GLES.getCapabilities().glGetPathCoordsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, coords);
	}

	public static void glGetPathCoordsNV(int path, FloatBuffer coords) {
		if ( CHECKS )
			if ( DEBUG )
				checkBuffer(coords, glGetPathParameteriNV(path, GL_PATH_COORD_COUNT_NV));
		nglGetPathCoordsNV(path, memAddress(coords));
	}

	// --- [ glGetPathDashArrayNV ] ---

	public static void nglGetPathDashArrayNV(int path, long dashArray) {
		long __functionAddress = GLES.getCapabilities().glGetPathDashArrayNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, dashArray);
	}

	public static void glGetPathDashArrayNV(int path, FloatBuffer dashArray) {
		if ( CHECKS )
			if ( DEBUG )
				checkBuffer(dashArray, glGetPathParameteriNV(path, GL_PATH_DASH_ARRAY_COUNT_NV));
		nglGetPathDashArrayNV(path, memAddress(dashArray));
	}

	// --- [ glGetPathMetricsNV ] ---

	/**
	 * 
	 *
	 * @param metricQueryMask one or more of:<br><table><tr><td>{@link #GL_GLYPH_WIDTH_BIT_NV GLYPH_WIDTH_BIT_NV}</td><td>{@link #GL_GLYPH_HEIGHT_BIT_NV GLYPH_HEIGHT_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV GLYPH_HORIZONTAL_BEARING_X_BIT_NV}</td><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV GLYPH_HORIZONTAL_BEARING_Y_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_X_BIT_NV GLYPH_VERTICAL_BEARING_X_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV GLYPH_VERTICAL_BEARING_Y_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HAS_KERNING_BIT_NV GLYPH_HAS_KERNING_BIT_NV}</td><td>{@link #GL_FONT_X_MIN_BOUNDS_BIT_NV FONT_X_MIN_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MIN_BOUNDS_BIT_NV FONT_Y_MIN_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_X_MAX_BOUNDS_BIT_NV FONT_X_MAX_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MAX_BOUNDS_BIT_NV FONT_Y_MAX_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_UNITS_PER_EM_BIT_NV FONT_UNITS_PER_EM_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_ASCENDER_BIT_NV FONT_ASCENDER_BIT_NV}</td><td>{@link #GL_FONT_DESCENDER_BIT_NV FONT_DESCENDER_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_HEIGHT_BIT_NV FONT_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV FONT_MAX_ADVANCE_WIDTH_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV FONT_MAX_ADVANCE_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_UNDERLINE_POSITION_BIT_NV FONT_UNDERLINE_POSITION_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_UNDERLINE_THICKNESS_BIT_NV FONT_UNDERLINE_THICKNESS_BIT_NV}</td><td>{@link #GL_FONT_HAS_KERNING_BIT_NV FONT_HAS_KERNING_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_NUM_GLYPH_INDICES_BIT_NV FONT_NUM_GLYPH_INDICES_BIT_NV}</td></tr></table>
	 * @param numPaths        
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param stride          
	 * @param metrics         
	 */
	public static void nglGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, long paths, int pathBase, int stride, long metrics) {
		long __functionAddress = GLES.getCapabilities().glGetPathMetricsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, metricQueryMask, numPaths, pathNameType, paths, pathBase, stride, metrics);
	}

	/**
	 * 
	 *
	 * @param metricQueryMask one or more of:<br><table><tr><td>{@link #GL_GLYPH_WIDTH_BIT_NV GLYPH_WIDTH_BIT_NV}</td><td>{@link #GL_GLYPH_HEIGHT_BIT_NV GLYPH_HEIGHT_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV GLYPH_HORIZONTAL_BEARING_X_BIT_NV}</td><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV GLYPH_HORIZONTAL_BEARING_Y_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_X_BIT_NV GLYPH_VERTICAL_BEARING_X_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV GLYPH_VERTICAL_BEARING_Y_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HAS_KERNING_BIT_NV GLYPH_HAS_KERNING_BIT_NV}</td><td>{@link #GL_FONT_X_MIN_BOUNDS_BIT_NV FONT_X_MIN_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MIN_BOUNDS_BIT_NV FONT_Y_MIN_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_X_MAX_BOUNDS_BIT_NV FONT_X_MAX_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MAX_BOUNDS_BIT_NV FONT_Y_MAX_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_UNITS_PER_EM_BIT_NV FONT_UNITS_PER_EM_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_ASCENDER_BIT_NV FONT_ASCENDER_BIT_NV}</td><td>{@link #GL_FONT_DESCENDER_BIT_NV FONT_DESCENDER_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_HEIGHT_BIT_NV FONT_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV FONT_MAX_ADVANCE_WIDTH_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV FONT_MAX_ADVANCE_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_UNDERLINE_POSITION_BIT_NV FONT_UNDERLINE_POSITION_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_UNDERLINE_THICKNESS_BIT_NV FONT_UNDERLINE_THICKNESS_BIT_NV}</td><td>{@link #GL_FONT_HAS_KERNING_BIT_NV FONT_HAS_KERNING_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_NUM_GLYPH_INDICES_BIT_NV FONT_NUM_GLYPH_INDICES_BIT_NV}</td></tr></table>
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param stride          
	 * @param metrics         
	 */
	public static void glGetPathMetricsNV(int metricQueryMask, int pathNameType, ByteBuffer paths, int pathBase, int stride, FloatBuffer metrics) {
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS )
			checkBuffer(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
		nglGetPathMetricsNV(metricQueryMask, numPaths, pathNameType, memAddress(paths), pathBase, stride, memAddress(metrics));
	}

	// --- [ glGetPathMetricRangeNV ] ---

	/**
	 * 
	 *
	 * @param metricQueryMask one or more of:<br><table><tr><td>{@link #GL_GLYPH_WIDTH_BIT_NV GLYPH_WIDTH_BIT_NV}</td><td>{@link #GL_GLYPH_HEIGHT_BIT_NV GLYPH_HEIGHT_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV GLYPH_HORIZONTAL_BEARING_X_BIT_NV}</td><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV GLYPH_HORIZONTAL_BEARING_Y_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_X_BIT_NV GLYPH_VERTICAL_BEARING_X_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV GLYPH_VERTICAL_BEARING_Y_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HAS_KERNING_BIT_NV GLYPH_HAS_KERNING_BIT_NV}</td><td>{@link #GL_FONT_X_MIN_BOUNDS_BIT_NV FONT_X_MIN_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MIN_BOUNDS_BIT_NV FONT_Y_MIN_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_X_MAX_BOUNDS_BIT_NV FONT_X_MAX_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MAX_BOUNDS_BIT_NV FONT_Y_MAX_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_UNITS_PER_EM_BIT_NV FONT_UNITS_PER_EM_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_ASCENDER_BIT_NV FONT_ASCENDER_BIT_NV}</td><td>{@link #GL_FONT_DESCENDER_BIT_NV FONT_DESCENDER_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_HEIGHT_BIT_NV FONT_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV FONT_MAX_ADVANCE_WIDTH_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV FONT_MAX_ADVANCE_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_UNDERLINE_POSITION_BIT_NV FONT_UNDERLINE_POSITION_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_UNDERLINE_THICKNESS_BIT_NV FONT_UNDERLINE_THICKNESS_BIT_NV}</td><td>{@link #GL_FONT_HAS_KERNING_BIT_NV FONT_HAS_KERNING_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_NUM_GLYPH_INDICES_BIT_NV FONT_NUM_GLYPH_INDICES_BIT_NV}</td></tr></table>
	 * @param firstPathName   
	 * @param numPaths        
	 * @param stride          
	 * @param metrics         
	 */
	public static void nglGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, long metrics) {
		long __functionAddress = GLES.getCapabilities().glGetPathMetricRangeNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, metricQueryMask, firstPathName, numPaths, stride, metrics);
	}

	/**
	 * 
	 *
	 * @param metricQueryMask one or more of:<br><table><tr><td>{@link #GL_GLYPH_WIDTH_BIT_NV GLYPH_WIDTH_BIT_NV}</td><td>{@link #GL_GLYPH_HEIGHT_BIT_NV GLYPH_HEIGHT_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV GLYPH_HORIZONTAL_BEARING_X_BIT_NV}</td><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV GLYPH_HORIZONTAL_BEARING_Y_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_X_BIT_NV GLYPH_VERTICAL_BEARING_X_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV GLYPH_VERTICAL_BEARING_Y_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HAS_KERNING_BIT_NV GLYPH_HAS_KERNING_BIT_NV}</td><td>{@link #GL_FONT_X_MIN_BOUNDS_BIT_NV FONT_X_MIN_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MIN_BOUNDS_BIT_NV FONT_Y_MIN_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_X_MAX_BOUNDS_BIT_NV FONT_X_MAX_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MAX_BOUNDS_BIT_NV FONT_Y_MAX_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_UNITS_PER_EM_BIT_NV FONT_UNITS_PER_EM_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_ASCENDER_BIT_NV FONT_ASCENDER_BIT_NV}</td><td>{@link #GL_FONT_DESCENDER_BIT_NV FONT_DESCENDER_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_HEIGHT_BIT_NV FONT_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV FONT_MAX_ADVANCE_WIDTH_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV FONT_MAX_ADVANCE_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_UNDERLINE_POSITION_BIT_NV FONT_UNDERLINE_POSITION_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_UNDERLINE_THICKNESS_BIT_NV FONT_UNDERLINE_THICKNESS_BIT_NV}</td><td>{@link #GL_FONT_HAS_KERNING_BIT_NV FONT_HAS_KERNING_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_NUM_GLYPH_INDICES_BIT_NV FONT_NUM_GLYPH_INDICES_BIT_NV}</td></tr></table>
	 * @param firstPathName   
	 * @param numPaths        
	 * @param stride          
	 * @param metrics         
	 */
	public static void glGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, FloatBuffer metrics) {
		if ( CHECKS )
			checkBuffer(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
		nglGetPathMetricRangeNV(metricQueryMask, firstPathName, numPaths, stride, memAddress(metrics));
	}

	// --- [ glGetPathSpacingNV ] ---

	/**
	 * 
	 *
	 * @param pathListMode    one of:<br><table><tr><td>{@link #GL_ACCUM_ADJACENT_PAIRS_NV ACCUM_ADJACENT_PAIRS_NV}</td><td>{@link #GL_ADJACENT_PAIRS_NV ADJACENT_PAIRS_NV}</td><td>{@link #GL_FIRST_TO_REST_NV FIRST_TO_REST_NV}</td></tr></table>
	 * @param numPaths        
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param advanceScale    
	 * @param kerningScale    
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td></tr></table>
	 * @param returnedSpacing 
	 */
	public static void nglGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, long paths, int pathBase, float advanceScale, float kerningScale, int transformType, long returnedSpacing) {
		long __functionAddress = GLES.getCapabilities().glGetPathSpacingNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, pathListMode, numPaths, pathNameType, paths, pathBase, advanceScale, kerningScale, transformType, returnedSpacing);
	}

	/**
	 * 
	 *
	 * @param pathListMode    one of:<br><table><tr><td>{@link #GL_ACCUM_ADJACENT_PAIRS_NV ACCUM_ADJACENT_PAIRS_NV}</td><td>{@link #GL_ADJACENT_PAIRS_NV ADJACENT_PAIRS_NV}</td><td>{@link #GL_FIRST_TO_REST_NV FIRST_TO_REST_NV}</td></tr></table>
	 * @param pathNameType    one of:<br><table><tr><td>{@link GLES20#GL_BYTE BYTE}</td><td>{@link GLES20#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GLES20#GL_SHORT SHORT}</td><td>{@link GLES20#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GLES20#GL_INT INT}</td><td>{@link GLES20#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GLES20#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
	 * @param paths           
	 * @param pathBase        
	 * @param advanceScale    
	 * @param kerningScale    
	 * @param transformType   one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td></tr></table>
	 * @param returnedSpacing 
	 */
	public static void glGetPathSpacingNV(int pathListMode, int pathNameType, ByteBuffer paths, int pathBase, float advanceScale, float kerningScale, int transformType, FloatBuffer returnedSpacing) {
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS )
			checkBuffer(returnedSpacing, (numPaths - 1) * (transformType == GL_TRANSLATE_X_NV ? 1 : 2));
		nglGetPathSpacingNV(pathListMode, numPaths, pathNameType, memAddress(paths), pathBase, advanceScale, kerningScale, transformType, memAddress(returnedSpacing));
	}

	// --- [ glIsPointInFillPathNV ] ---

	public static boolean glIsPointInFillPathNV(int path, int mask, float x, float y) {
		long __functionAddress = GLES.getCapabilities().glIsPointInFillPathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, path, mask, x, y);
	}

	// --- [ glIsPointInStrokePathNV ] ---

	public static boolean glIsPointInStrokePathNV(int path, float x, float y) {
		long __functionAddress = GLES.getCapabilities().glIsPointInStrokePathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, path, x, y);
	}

	// --- [ glGetPathLengthNV ] ---

	public static float glGetPathLengthNV(int path, int startSegment, int numSegments) {
		long __functionAddress = GLES.getCapabilities().glGetPathLengthNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callF(__functionAddress, path, startSegment, numSegments);
	}

	// --- [ glPointAlongPathNV ] ---

	public static boolean nglPointAlongPathNV(int path, int startSegment, int numSegments, float distance, long x, long y, long tangentX, long tangentY) {
		long __functionAddress = GLES.getCapabilities().glPointAlongPathNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPPPZ(__functionAddress, path, startSegment, numSegments, distance, x, y, tangentX, tangentY);
	}

	public static boolean glPointAlongPathNV(int path, int startSegment, int numSegments, float distance, FloatBuffer x, FloatBuffer y, FloatBuffer tangentX, FloatBuffer tangentY) {
		if ( CHECKS ) {
			if ( x != null ) checkBuffer(x, 1);
			if ( y != null ) checkBuffer(y, 1);
			if ( tangentX != null ) checkBuffer(tangentX, 1);
			if ( tangentY != null ) checkBuffer(tangentY, 1);
		}
		return nglPointAlongPathNV(path, startSegment, numSegments, distance, memAddressSafe(x), memAddressSafe(y), memAddressSafe(tangentX), memAddressSafe(tangentY));
	}

	// --- [ glMatrixLoad3x2fNV ] ---

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void nglMatrixLoad3x2fNV(int matrixMode, long m) {
		long __functionAddress = GLES.getCapabilities().glMatrixLoad3x2fNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, matrixMode, m);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void glMatrixLoad3x2fNV(int matrixMode, FloatBuffer m) {
		if ( CHECKS )
			checkBuffer(m, 6);
		nglMatrixLoad3x2fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixLoad3x3fNV ] ---

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void nglMatrixLoad3x3fNV(int matrixMode, long m) {
		long __functionAddress = GLES.getCapabilities().glMatrixLoad3x3fNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, matrixMode, m);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void glMatrixLoad3x3fNV(int matrixMode, FloatBuffer m) {
		if ( CHECKS )
			checkBuffer(m, 9);
		nglMatrixLoad3x3fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixLoadTranspose3x3fNV ] ---

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void nglMatrixLoadTranspose3x3fNV(int matrixMode, long m) {
		long __functionAddress = GLES.getCapabilities().glMatrixLoadTranspose3x3fNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, matrixMode, m);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void glMatrixLoadTranspose3x3fNV(int matrixMode, FloatBuffer m) {
		if ( CHECKS )
			checkBuffer(m, 9);
		nglMatrixLoadTranspose3x3fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMult3x2fNV ] ---

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void nglMatrixMult3x2fNV(int matrixMode, long m) {
		long __functionAddress = GLES.getCapabilities().glMatrixMult3x2fNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, matrixMode, m);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void glMatrixMult3x2fNV(int matrixMode, FloatBuffer m) {
		if ( CHECKS )
			checkBuffer(m, 6);
		nglMatrixMult3x2fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMult3x3fNV ] ---

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void nglMatrixMult3x3fNV(int matrixMode, long m) {
		long __functionAddress = GLES.getCapabilities().glMatrixMult3x3fNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, matrixMode, m);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void glMatrixMult3x3fNV(int matrixMode, FloatBuffer m) {
		if ( CHECKS )
			checkBuffer(m, 9);
		nglMatrixMult3x3fNV(matrixMode, memAddress(m));
	}

	// --- [ glMatrixMultTranspose3x3fNV ] ---

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void nglMatrixMultTranspose3x3fNV(int matrixMode, long m) {
		long __functionAddress = GLES.getCapabilities().glMatrixMultTranspose3x3fNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, matrixMode, m);
	}

	/**
	 * 
	 *
	 * @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table>
	 * @param m          
	 */
	public static void glMatrixMultTranspose3x3fNV(int matrixMode, FloatBuffer m) {
		if ( CHECKS )
			checkBuffer(m, 9);
		nglMatrixMultTranspose3x3fNV(matrixMode, memAddress(m));
	}

	// --- [ glGetProgramResourcefvNV ] ---

	public static void nglGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramResourcefvNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, program, programInterface, index, propCount, props, bufSize, length, params);
	}

	public static void glGetProgramResourcefvNV(int program, int programInterface, int index, IntBuffer props, IntBuffer length, FloatBuffer params) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourcefvNV(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
	}

	/** short[] version of: {@link #glPathCommandsNV PathCommandsNV} */
	public static void glPathCommandsNV(int path, ByteBuffer commands, int coordType, short[] coords) {
		long __functionAddress = GLES.getCapabilities().glPathCommandsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, path, commands.remaining(), memAddress(commands), coords.length << 1, coordType, coords);
	}

	/** float[] version of: {@link #glPathCommandsNV PathCommandsNV} */
	public static void glPathCommandsNV(int path, ByteBuffer commands, int coordType, float[] coords) {
		long __functionAddress = GLES.getCapabilities().glPathCommandsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, path, commands.remaining(), memAddress(commands), coords.length << 2, coordType, coords);
	}

	/** short[] version of: {@link #glPathCoordsNV PathCoordsNV} */
	public static void glPathCoordsNV(int path, int coordType, short[] coords) {
		long __functionAddress = GLES.getCapabilities().glPathCoordsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, coords.length << 1, coordType, coords);
	}

	/** float[] version of: {@link #glPathCoordsNV PathCoordsNV} */
	public static void glPathCoordsNV(int path, int coordType, float[] coords) {
		long __functionAddress = GLES.getCapabilities().glPathCoordsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, coords.length << 2, coordType, coords);
	}

	/** short[] version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, int coordType, short[] coords) {
		long __functionAddress = GLES.getCapabilities().glPathSubCommandsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.length << 1, coordType, coords);
	}

	/** float[] version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
	public static void glPathSubCommandsNV(int path, int commandStart, int commandsToDelete, ByteBuffer commands, int coordType, float[] coords) {
		long __functionAddress = GLES.getCapabilities().glPathSubCommandsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.length << 2, coordType, coords);
	}

	/** short[] version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
	public static void glPathSubCoordsNV(int path, int coordStart, int coordType, short[] coords) {
		long __functionAddress = GLES.getCapabilities().glPathSubCoordsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, coordStart, coords.length << 1, coordType, coords);
	}

	/** float[] version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
	public static void glPathSubCoordsNV(int path, int coordStart, int coordType, float[] coords) {
		long __functionAddress = GLES.getCapabilities().glPathSubCoordsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, coordStart, coords.length << 2, coordType, coords);
	}

	/** Array version of: {@link #glWeightPathsNV WeightPathsNV} */
	public static void glWeightPathsNV(int resultPath, int[] paths, float[] weights) {
		long __functionAddress = GLES.getCapabilities().glWeightPathsNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(weights, paths.length);
		}
		callPPV(__functionAddress, resultPath, paths.length, paths, weights);
	}

	/** Array version of: {@link #glTransformPathNV TransformPathNV} */
	public static void glTransformPathNV(int resultPath, int srcPath, int transformType, float[] transformValues) {
		long __functionAddress = GLES.getCapabilities().glTransformPathNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(transformValues, transformTypeToElements(transformType));
		}
		callPV(__functionAddress, resultPath, srcPath, transformType, transformValues);
	}

	/** Array version of: {@link #glPathParameterivNV PathParameterivNV} */
	public static void glPathParameterivNV(int path, int pname, int[] value) {
		long __functionAddress = GLES.getCapabilities().glPathParameterivNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, path, pname, value);
	}

	/** Array version of: {@link #glPathParameterfvNV PathParameterfvNV} */
	public static void glPathParameterfvNV(int path, int pname, float[] value) {
		long __functionAddress = GLES.getCapabilities().glPathParameterfvNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, path, pname, value);
	}

	/** Array version of: {@link #glPathDashArrayNV PathDashArrayNV} */
	public static void glPathDashArrayNV(int path, float[] dashArray) {
		long __functionAddress = GLES.getCapabilities().glPathDashArrayNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, path, dashArray.length, dashArray);
	}

	/** Array version of: {@link #glStencilFillPathInstancedNV StencilFillPathInstancedNV} */
	public static void glStencilFillPathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int fillMode, int mask, int transformType, float[] transformValues) {
		long __functionAddress = GLES.getCapabilities().glStencilFillPathInstancedNV;
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		}
		callPPV(__functionAddress, numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, transformType, transformValues);
	}

	/** Array version of: {@link #glStencilStrokePathInstancedNV StencilStrokePathInstancedNV} */
	public static void glStencilStrokePathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int reference, int mask, int transformType, float[] transformValues) {
		long __functionAddress = GLES.getCapabilities().glStencilStrokePathInstancedNV;
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		}
		callPPV(__functionAddress, numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, transformType, transformValues);
	}

	/** Array version of: {@link #glCoverFillPathInstancedNV CoverFillPathInstancedNV} */
	public static void glCoverFillPathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int coverMode, int transformType, float[] transformValues) {
		long __functionAddress = GLES.getCapabilities().glCoverFillPathInstancedNV;
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		}
		callPPV(__functionAddress, numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, transformValues);
	}

	/** Array version of: {@link #glCoverStrokePathInstancedNV CoverStrokePathInstancedNV} */
	public static void glCoverStrokePathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int coverMode, int transformType, float[] transformValues) {
		long __functionAddress = GLES.getCapabilities().glCoverStrokePathInstancedNV;
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		}
		callPPV(__functionAddress, numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, transformValues);
	}

	/** Array version of: {@link #glStencilThenCoverFillPathInstancedNV StencilThenCoverFillPathInstancedNV} */
	public static void glStencilThenCoverFillPathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, float[] transformValues) {
		long __functionAddress = GLES.getCapabilities().glStencilThenCoverFillPathInstancedNV;
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		}
		callPPV(__functionAddress, numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, coverMode, transformType, transformValues);
	}

	/** Array version of: {@link #glStencilThenCoverStrokePathInstancedNV StencilThenCoverStrokePathInstancedNV} */
	public static void glStencilThenCoverStrokePathInstancedNV(int pathNameType, ByteBuffer paths, int pathBase, int reference, int mask, int coverMode, int transformType, float[] transformValues) {
		long __functionAddress = GLES.getCapabilities().glStencilThenCoverStrokePathInstancedNV;
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(transformValues, numPaths * transformTypeToElements(transformType));
		}
		callPPV(__functionAddress, numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, coverMode, transformType, transformValues);
	}

	/** Array version of: {@link #glProgramPathFragmentInputGenNV ProgramPathFragmentInputGenNV} */
	public static void glProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, float[] coeffs) {
		long __functionAddress = GLES.getCapabilities().glProgramPathFragmentInputGenNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coeffs, genModeToElements(genMode) * components);
		}
		callPV(__functionAddress, program, location, genMode, components, coeffs);
	}

	/** Array version of: {@link #glGetPathParameterivNV GetPathParameterivNV} */
	public static void glGetPathParameterivNV(int path, int pname, int[] value) {
		long __functionAddress = GLES.getCapabilities().glGetPathParameterivNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, path, pname, value);
	}

	/** Array version of: {@link #glGetPathParameterfvNV GetPathParameterfvNV} */
	public static void glGetPathParameterfvNV(int path, int pname, float[] value) {
		long __functionAddress = GLES.getCapabilities().glGetPathParameterfvNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, path, pname, value);
	}

	/** Array version of: {@link #glGetPathCoordsNV GetPathCoordsNV} */
	public static void glGetPathCoordsNV(int path, float[] coords) {
		long __functionAddress = GLES.getCapabilities().glGetPathCoordsNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( DEBUG )
				checkBuffer(coords, glGetPathParameteriNV(path, GL_PATH_COORD_COUNT_NV));
		}
		callPV(__functionAddress, path, coords);
	}

	/** Array version of: {@link #glGetPathDashArrayNV GetPathDashArrayNV} */
	public static void glGetPathDashArrayNV(int path, float[] dashArray) {
		long __functionAddress = GLES.getCapabilities().glGetPathDashArrayNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( DEBUG )
				checkBuffer(dashArray, glGetPathParameteriNV(path, GL_PATH_DASH_ARRAY_COUNT_NV));
		}
		callPV(__functionAddress, path, dashArray);
	}

	/** Array version of: {@link #glGetPathMetricsNV GetPathMetricsNV} */
	public static void glGetPathMetricsNV(int metricQueryMask, int pathNameType, ByteBuffer paths, int pathBase, int stride, float[] metrics) {
		long __functionAddress = GLES.getCapabilities().glGetPathMetricsNV;
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
		}
		callPPV(__functionAddress, metricQueryMask, numPaths, pathNameType, memAddress(paths), pathBase, stride, metrics);
	}

	/** Array version of: {@link #glGetPathMetricRangeNV GetPathMetricRangeNV} */
	public static void glGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, float[] metrics) {
		long __functionAddress = GLES.getCapabilities().glGetPathMetricRangeNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
		}
		callPV(__functionAddress, metricQueryMask, firstPathName, numPaths, stride, metrics);
	}

	/** Array version of: {@link #glGetPathSpacingNV GetPathSpacingNV} */
	public static void glGetPathSpacingNV(int pathListMode, int pathNameType, ByteBuffer paths, int pathBase, float advanceScale, float kerningScale, int transformType, float[] returnedSpacing) {
		long __functionAddress = GLES.getCapabilities().glGetPathSpacingNV;
		int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(returnedSpacing, (numPaths - 1) * (transformType == GL_TRANSLATE_X_NV ? 1 : 2));
		}
		callPPV(__functionAddress, pathListMode, numPaths, pathNameType, memAddress(paths), pathBase, advanceScale, kerningScale, transformType, returnedSpacing);
	}

	/** Array version of: {@link #glPointAlongPathNV PointAlongPathNV} */
	public static boolean glPointAlongPathNV(int path, int startSegment, int numSegments, float distance, float[] x, float[] y, float[] tangentX, float[] tangentY) {
		long __functionAddress = GLES.getCapabilities().glPointAlongPathNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( x != null ) checkBuffer(x, 1);
			if ( y != null ) checkBuffer(y, 1);
			if ( tangentX != null ) checkBuffer(tangentX, 1);
			if ( tangentY != null ) checkBuffer(tangentY, 1);
		}
		return callPPPPZ(__functionAddress, path, startSegment, numSegments, distance, x, y, tangentX, tangentY);
	}

	/** Array version of: {@link #glMatrixLoad3x2fNV MatrixLoad3x2fNV} */
	public static void glMatrixLoad3x2fNV(int matrixMode, float[] m) {
		long __functionAddress = GLES.getCapabilities().glMatrixLoad3x2fNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 6);
		}
		callPV(__functionAddress, matrixMode, m);
	}

	/** Array version of: {@link #glMatrixLoad3x3fNV MatrixLoad3x3fNV} */
	public static void glMatrixLoad3x3fNV(int matrixMode, float[] m) {
		long __functionAddress = GLES.getCapabilities().glMatrixLoad3x3fNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 9);
		}
		callPV(__functionAddress, matrixMode, m);
	}

	/** Array version of: {@link #glMatrixLoadTranspose3x3fNV MatrixLoadTranspose3x3fNV} */
	public static void glMatrixLoadTranspose3x3fNV(int matrixMode, float[] m) {
		long __functionAddress = GLES.getCapabilities().glMatrixLoadTranspose3x3fNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 9);
		}
		callPV(__functionAddress, matrixMode, m);
	}

	/** Array version of: {@link #glMatrixMult3x2fNV MatrixMult3x2fNV} */
	public static void glMatrixMult3x2fNV(int matrixMode, float[] m) {
		long __functionAddress = GLES.getCapabilities().glMatrixMult3x2fNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 6);
		}
		callPV(__functionAddress, matrixMode, m);
	}

	/** Array version of: {@link #glMatrixMult3x3fNV MatrixMult3x3fNV} */
	public static void glMatrixMult3x3fNV(int matrixMode, float[] m) {
		long __functionAddress = GLES.getCapabilities().glMatrixMult3x3fNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 9);
		}
		callPV(__functionAddress, matrixMode, m);
	}

	/** Array version of: {@link #glMatrixMultTranspose3x3fNV MatrixMultTranspose3x3fNV} */
	public static void glMatrixMultTranspose3x3fNV(int matrixMode, float[] m) {
		long __functionAddress = GLES.getCapabilities().glMatrixMultTranspose3x3fNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(m, 9);
		}
		callPV(__functionAddress, matrixMode, m);
	}

	/** Array version of: {@link #glGetProgramResourcefvNV GetProgramResourcefvNV} */
	public static void glGetProgramResourcefvNV(int program, int programInterface, int index, int[] props, int[] length, float[] params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramResourcefvNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPPV(__functionAddress, program, programInterface, index, props.length, props, params.length, length, params);
	}

	private static int charcodeTypeToBytes(int type) {
		switch ( type ) {
			case GL_UNSIGNED_BYTE:
			case GL_UTF8_NV:
				return 1;
			case GL_UNSIGNED_SHORT:
			case GL_2_BYTES_NV:
			case GL_UTF16_NV:
				return 2;
			case GL_3_BYTES_NV:
				return 3;
			case GL_UNSIGNED_INT:
			case GL_4_BYTES_NV:
				return 4;
			default:
				throw new IllegalArgumentException(String.format("Unsupported charcode type: 0x%X", type));
		}
	}

	private static int pathNameTypeToBytes(int type) {
		switch ( type ) {
			case GL_BYTE:
			case GL_UNSIGNED_BYTE:
			case GL_UTF8_NV:
				return 1;
			case GL_SHORT:
			case GL_UNSIGNED_SHORT:
			case GL_2_BYTES_NV:
			case GL_UTF16_NV:
				return 2;
			case GL_3_BYTES_NV:
				return 3;
			case GL_INT:
			case GL_UNSIGNED_INT:
			case GL_4_BYTES_NV:
				return 4;
			default:
				throw new IllegalArgumentException(String.format("Unsupported path name type: 0x%X", type));
		}
	}

	private static int transformTypeToElements(int type) {
		switch ( type ) {
			case GL_NONE:
				return 0;
			case GL_TRANSLATE_X_NV:
			case GL_TRANSLATE_Y_NV:
				return 1;
			case GL_TRANSLATE_2D_NV:
				return 2;
			case GL_TRANSLATE_3D_NV:
				return 3;
			case GL_AFFINE_2D_NV:
			case GL_TRANSPOSE_AFFINE_2D_NV:
				return 6;
			case GL_AFFINE_3D_NV:
			case GL_TRANSPOSE_AFFINE_3D_NV:
				return 12;
			default:
				throw new IllegalArgumentException(String.format("Unsupported transform type: 0x%X", type));
		}
	}

	private static int colorFormatToComponents(int colorFormat) {
		switch ( colorFormat ) {
			case GL_LUMINANCE:
			case GL_ALPHA:
				return 1;
			case GL_LUMINANCE_ALPHA:
				return 2;
			case GL_RGB:
				return 3;
			case GL_RGBA:
				return 4;
			default:
				throw new IllegalArgumentException(String.format("Unsupported colorFormat specified: 0x%X", colorFormat));
		}
	}

	private static int genModeToElements(int genMode) {
		switch ( genMode ) {
			case GL_NONE:
				return 0;
			case GL_CONSTANT_NV:
				return 1;
			case GL_OBJECT_LINEAR_NV:
			case GL_PATH_OBJECT_BOUNDING_BOX_NV:
				return 3;
			case GL_EYE_LINEAR_NV:
				return 4;
			default:
				throw new IllegalArgumentException(String.format("Unsupported genMode specified: 0x%X", genMode));
		}
	}

}