/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core OpenGL 1.4 functionality.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/SGIS/generate_mipmap.txt">SGIS_generate_mipmap</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/NV/blend_square.txt">NV_blend_square</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/depth_texture.txt">ARB_depth_texture</a> and <a href="http://www.opengl.org/registry/specs/ARB/shadow.txt">ARB_shadow</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/fog_coord.txt">EXT_fog_coord</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/multi_draw_arrays.txt">EXT_multi_draw_arrays</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/point_parameters.txt">ARB_point_parameters</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/secondary_color.txt">EXT_secondary_color</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/blend_func_separate.txt">EXT_blend_func_separate</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/stencil_wrap.txt">EXT_stencil_wrap</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_env_crossbar.txt">ARB_texture_env_crossbar</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/EXT/texture_lod_bias.txt">EXT_texture_lod_bias</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_mirrored_repeat.txt">ARB_texture_mirrored_repeat</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/window_pos.txt">ARB_window_pos</a></li>
 * </ul>
 */
public class GL14 {

	/** Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv. */
	public static final int GL_GENERATE_MIPMAP = 0x8191;

	/** Accepted by the {@code target} parameter of Hint, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;

	/** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc. */
	public static final int
		GL_CONSTANT_COLOR           = 0x8001,
		GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
		GL_CONSTANT_ALPHA           = 0x8003,
		GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

	/** Accepted by the {@code mode} parameter of BlendEquation. */
	public static final int
		GL_FUNC_ADD = 0x8006,
		GL_MIN      = 0x8007,
		GL_MAX      = 0x8008;

	/** Accepted by the {@code mode} parameter of BlendEquation. */
	public static final int
		GL_FUNC_SUBTRACT         = 0x800A,
		GL_FUNC_REVERSE_SUBTRACT = 0x800B;

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D. */
	public static final int
		GL_DEPTH_COMPONENT16 = 0x81A5,
		GL_DEPTH_COMPONENT24 = 0x81A6,
		GL_DEPTH_COMPONENT32 = 0x81A7;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
	public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;

	/** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
	public static final int GL_DEPTH_TEXTURE_MODE = 0x884B;

	/** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
	public static final int
		GL_TEXTURE_COMPARE_MODE = 0x884C,
		GL_TEXTURE_COMPARE_FUNC = 0x884D;

	/**
	 * Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
	 * TEXTURE_COMPARE_MODE.
	 */
	public static final int GL_COMPARE_R_TO_TEXTURE = 0x884E;

	/** Accepted by the {@code pname} parameter of Fogi and Fogf. */
	public static final int GL_FOG_COORDINATE_SOURCE = 0x8450;

	/** Accepted by the {@code param} parameter of Fogi and Fogf. */
	public static final int
		GL_FOG_COORDINATE = 0x8451,
		GL_FRAGMENT_DEPTH = 0x8452;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CURRENT_FOG_COORDINATE      = 0x8453,
		GL_FOG_COORDINATE_ARRAY_TYPE   = 0x8454,
		GL_FOG_COORDINATE_ARRAY_STRIDE = 0x8455;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 0x8456;

	/** Accepted by the {@code array} parameter of EnableClientState and DisableClientState. */
	public static final int GL_FOG_COORDINATE_ARRAY = 0x8457;

	/** Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get. */
	public static final int
		GL_POINT_SIZE_MIN             = 0x8126,
		GL_POINT_SIZE_MAX             = 0x8127,
		GL_POINT_FADE_THRESHOLD_SIZE  = 0x8128,
		GL_POINT_DISTANCE_ATTENUATION = 0x8129;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_COLOR_SUM = 0x8458;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CURRENT_SECONDARY_COLOR      = 0x8459,
		GL_SECONDARY_COLOR_ARRAY_SIZE   = 0x845A,
		GL_SECONDARY_COLOR_ARRAY_TYPE   = 0x845B,
		GL_SECONDARY_COLOR_ARRAY_STRIDE = 0x845C;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 0x845D;

	/** Accepted by the {@code array} parameter of EnableClientState and DisableClientState. */
	public static final int GL_SECONDARY_COLOR_ARRAY = 0x845E;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_BLEND_DST_RGB   = 0x80C8,
		GL_BLEND_SRC_RGB   = 0x80C9,
		GL_BLEND_DST_ALPHA = 0x80CA,
		GL_BLEND_SRC_ALPHA = 0x80CB;

	/** Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp. */
	public static final int
		GL_INCR_WRAP = 0x8507,
		GL_DECR_WRAP = 0x8508;

	/** Accepted by the {@code target} parameters of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, Texenviv, and TexEnvfv. */
	public static final int GL_TEXTURE_FILTER_CONTROL = 0x8500;

	/**
	 * When the {@code target} parameter of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, TexEnviv, and TexEnvfv is TEXTURE_FILTER_CONTROL, then the value of
	 * {@code pname} may be.
	 */
	public static final int GL_TEXTURE_LOD_BIAS = 0x8501;

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;

	/**
	 * Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
	 * when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
	 */
	public static final int GL_MIRRORED_REPEAT = 0x8370;

	protected GL14() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, boolean fc) {
		return (fc || checkFunctions(
			caps.glFogCoordf, caps.glFogCoordd, caps.glFogCoordfv, caps.glFogCoorddv, caps.glFogCoordPointer, caps.glSecondaryColor3b, caps.glSecondaryColor3s, 
			caps.glSecondaryColor3i, caps.glSecondaryColor3f, caps.glSecondaryColor3d, caps.glSecondaryColor3ub, caps.glSecondaryColor3us, 
			caps.glSecondaryColor3ui, caps.glSecondaryColor3bv, caps.glSecondaryColor3sv, caps.glSecondaryColor3iv, caps.glSecondaryColor3fv, 
			caps.glSecondaryColor3dv, caps.glSecondaryColor3ubv, caps.glSecondaryColor3usv, caps.glSecondaryColor3uiv, caps.glSecondaryColorPointer, 
			caps.glWindowPos2i, caps.glWindowPos2s, caps.glWindowPos2f, caps.glWindowPos2d, caps.glWindowPos2iv, caps.glWindowPos2sv, caps.glWindowPos2fv, 
			caps.glWindowPos2dv, caps.glWindowPos3i, caps.glWindowPos3s, caps.glWindowPos3f, caps.glWindowPos3d, caps.glWindowPos3iv, caps.glWindowPos3sv, 
			caps.glWindowPos3fv, caps.glWindowPos3dv
		)) && checkFunctions(
			caps.glBlendColor, caps.glBlendEquation, caps.glMultiDrawArrays, caps.glMultiDrawElements, caps.glPointParameterf, caps.glPointParameteri, 
			caps.glPointParameterfv, caps.glPointParameteriv, caps.glBlendFuncSeparate
		);
	}

	// --- [ glBlendColor ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendColor.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the constant color C<sub>c</sub> to be used in blending.
	 *
	 * @param red   the red color component
	 * @param green the green color component
	 * @param blue  the blue color component
	 * @param alpha the alpha color component
	 */
	public static void glBlendColor(float red, float green, float blue, float alpha) {
		long __functionAddress = GL.getCapabilities().glBlendColor;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue, alpha);
	}

	// --- [ glBlendEquation ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendEquation.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls the blend equations used for per-fragment blending.
	 *
	 * @param mode the blend equation. One of:<br><table><tr><td>{@link #GL_FUNC_ADD FUNC_ADD}</td><td>{@link #GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link #GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link #GL_MIN MIN}</td><td>{@link #GL_MAX MAX}</td></tr></table>
	 */
	public static void glBlendEquation(int mode) {
		long __functionAddress = GL.getCapabilities().glBlendEquation;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode);
	}

	// --- [ glFogCoordf ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordf.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the current fog coordinate.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void glFogCoordf(float coord) {
		long __functionAddress = GL.getCapabilities().glFogCoordf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, coord);
	}

	// --- [ glFogCoordd ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordd.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glFogCoordf FogCoordf}.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void glFogCoordd(double coord) {
		long __functionAddress = GL.getCapabilities().glFogCoordd;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, coord);
	}

	// --- [ glFogCoordfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoord.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glFogCoordf FogCoordf}.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void nglFogCoordfv(long coord) {
		long __functionAddress = GL.getCapabilities().glFogCoordfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, coord);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoord.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glFogCoordf FogCoordf}.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void glFogCoordfv(FloatBuffer coord) {
		if ( CHECKS )
			checkBuffer(coord, 1);
		nglFogCoordfv(memAddress(coord));
	}

	// --- [ glFogCoorddv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoord.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glFogCoordd FogCoordd}.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void nglFogCoorddv(long coord) {
		long __functionAddress = GL.getCapabilities().glFogCoorddv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, coord);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoord.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glFogCoordd FogCoordd}.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void glFogCoorddv(DoubleBuffer coord) {
		if ( CHECKS )
			checkBuffer(coord, 1);
		nglFogCoorddv(memAddress(coord));
	}

	// --- [ glFogCoordPointer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a fog coordinate array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the fog coordinate array data
	 */
	public static void nglFogCoordPointer(int type, int stride, long pointer) {
		long __functionAddress = GL.getCapabilities().glFogCoordPointer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a fog coordinate array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the fog coordinate array data
	 */
	public static void glFogCoordPointer(int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglFogCoordPointer(type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a fog coordinate array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the fog coordinate array data
	 */
	public static void glFogCoordPointer(int type, int stride, long pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglFogCoordPointer(type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * ShortBuffer version of: {@link #glFogCoordPointer FogCoordPointer}
	 */
	public static void glFogCoordPointer(int type, int stride, ShortBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglFogCoordPointer(type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * FloatBuffer version of: {@link #glFogCoordPointer FogCoordPointer}
	 */
	public static void glFogCoordPointer(int type, int stride, FloatBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglFogCoordPointer(type, stride, memAddress(pointer));
	}

	// --- [ glMultiDrawArrays ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple sets of primitives from array data.
	 *
	 * @param mode      the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param first     an array of starting indices in the enabled arrays
	 * @param count     an array of the number of indices to be rendered
	 * @param primcount the size of {@code first} and {@code count}
	 */
	public static void nglMultiDrawArrays(int mode, long first, long count, int primcount) {
		long __functionAddress = GL.getCapabilities().glMultiDrawArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, mode, first, count, primcount);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple sets of primitives from array data.
	 *
	 * @param mode  the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param first an array of starting indices in the enabled arrays
	 * @param count an array of the number of indices to be rendered
	 */
	public static void glMultiDrawArrays(int mode, IntBuffer first, IntBuffer count) {
		if ( CHECKS )
			checkBuffer(count, first.remaining());
		nglMultiDrawArrays(mode, memAddress(first), memAddress(count), first.remaining());
	}

	// --- [ glMultiDrawElements ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawElements.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple sets of primitives by specifying indices of array data elements.
	 * 
	 * <p><b>LWJGL note</b>: Use {@link org.lwjgl.system.MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>
	 *
	 * @param mode      the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count     an array of the elements counts
	 * @param type      the type of the values in indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices   a pointer to the location where the indices are stored
	 * @param primcount the size of the {@code count} array
	 */
	public static void nglMultiDrawElements(int mode, long count, int type, long indices, int primcount) {
		long __functionAddress = GL.getCapabilities().glMultiDrawElements;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, mode, count, type, indices, primcount);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawElements.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Renders multiple sets of primitives by specifying indices of array data elements.
	 * 
	 * <p><b>LWJGL note</b>: Use {@link org.lwjgl.system.MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>
	 *
	 * @param mode    the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param count   an array of the elements counts
	 * @param type    the type of the values in indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param indices a pointer to the location where the indices are stored
	 */
	public static void glMultiDrawElements(int mode, IntBuffer count, int type, PointerBuffer indices) {
		if ( CHECKS )
			checkBuffer(indices, count.remaining());
		nglMultiDrawElements(mode, memAddress(count), type, memAddress(indices), count.remaining());
	}

	// --- [ glPointParameterf ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointParameterf.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Sets the float value of a pointer parameter.
	 *
	 * @param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_POINT_SIZE_MIN POINT_SIZE_MIN}</td><td>{@link #GL_POINT_SIZE_MAX POINT_SIZE_MAX}</td><td>{@link #GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}</td></tr></table>
	 * @param param the parameter value
	 */
	public static void glPointParameterf(int pname, float param) {
		long __functionAddress = GL.getCapabilities().glPointParameterf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pname, param);
	}

	// --- [ glPointParameteri ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Integer version of {@link #glPointParameterf PointParameterf}.
	 *
	 * @param pname the parameter to set. One of:<br><table><tr><td>{@link #GL_POINT_SIZE_MIN POINT_SIZE_MIN}</td><td>{@link #GL_POINT_SIZE_MAX POINT_SIZE_MAX}</td><td>{@link #GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}</td></tr></table>
	 * @param param the parameter value
	 */
	public static void glPointParameteri(int pname, int param) {
		long __functionAddress = GL.getCapabilities().glPointParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pname, param);
	}

	// --- [ glPointParameterfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glPointParameterf PointParameterf}.
	 *
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_DISTANCE_ATTENUATION POINT_DISTANCE_ATTENUATION}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void nglPointParameterfv(int pname, long params) {
		long __functionAddress = GL.getCapabilities().glPointParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glPointParameterf PointParameterf}.
	 *
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_DISTANCE_ATTENUATION POINT_DISTANCE_ATTENUATION}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glPointParameterfv(int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 3);
		nglPointParameterfv(pname, memAddress(params));
	}

	// --- [ glPointParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glPointParameteri PointParameteri}.
	 *
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_DISTANCE_ATTENUATION POINT_DISTANCE_ATTENUATION}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void nglPointParameteriv(int pname, long params) {
		long __functionAddress = GL.getCapabilities().glPointParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glPointParameteri PointParameteri}.
	 *
	 * @param pname  the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_DISTANCE_ATTENUATION POINT_DISTANCE_ATTENUATION}</td></tr></table>
	 * @param params the parameter value
	 */
	public static void glPointParameteriv(int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 3);
		nglPointParameteriv(pname, memAddress(params));
	}

	// --- [ glSecondaryColor3b ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Sets the R, G, and B components of the current secondary color. The alpha component is set to 1.0.
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3b(byte red, byte green, byte blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3b;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3s ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3s(short red, short green, short blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3s;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3i ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Integer version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3i(int red, int green, int blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3f ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3f(float red, float green, float blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3f;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3d ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3d(double red, double green, double blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3d;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3ub ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3ub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3ub(byte red, byte green, byte blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3ub;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3us ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3us.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned short version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3us(short red, short green, short blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3us;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Unsigned int version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3ui(int red, int green, int blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3bv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Byte pointer version of {@link #glSecondaryColor3b SecondaryColor3b}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3bv(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3bv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3b.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Byte pointer version of {@link #glSecondaryColor3b SecondaryColor3b}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3bv(ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3bv(memAddress(v));
	}

	// --- [ glSecondaryColor3sv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3s SecondaryColor3s}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3sv(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3sv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3s SecondaryColor3s}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3sv(ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3sv(memAddress(v));
	}

	// --- [ glSecondaryColor3iv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3i SecondaryColor3i}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3iv(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3i SecondaryColor3i}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3iv(IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3iv(memAddress(v));
	}

	// --- [ glSecondaryColor3fv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3f SecondaryColor3f}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3fv(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3f SecondaryColor3f}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3fv(FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3fv(memAddress(v));
	}

	// --- [ glSecondaryColor3dv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3d SecondaryColor3d}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3dv(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3dv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3d SecondaryColor3d}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3dv(DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3dv(memAddress(v));
	}

	// --- [ glSecondaryColor3ubv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3ub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3ub SecondaryColor3ub}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3ubv(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3ubv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3ub.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3ub SecondaryColor3ub}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3ubv(ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3ubv(memAddress(v));
	}

	// --- [ glSecondaryColor3usv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3us SecondaryColor3us}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3usv(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3usv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3us SecondaryColor3us}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3usv(ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3usv(memAddress(v));
	}

	// --- [ glSecondaryColor3uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3ui SecondaryColor3ui}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3uiv(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColor3ui SecondaryColor3ui}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3uiv(IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3uiv(memAddress(v));
	}

	// --- [ glSecondaryColorPointer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a secondary color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the secondary color array data
	 */
	public static void nglSecondaryColorPointer(int size, int type, int stride, long pointer) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorPointer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a secondary color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the secondary color array data
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Specifies the location and organization of a secondary color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the secondary color array data
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, long pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglSecondaryColorPointer(size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * ShortBuffer version of: {@link #glSecondaryColorPointer SecondaryColorPointer}
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, ShortBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * IntBuffer version of: {@link #glSecondaryColorPointer SecondaryColorPointer}
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, IntBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointer(size, type, stride, memAddress(pointer));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * FloatBuffer version of: {@link #glSecondaryColorPointer SecondaryColorPointer}
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, FloatBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointer(size, type, stride, memAddress(pointer));
	}

	// --- [ glBlendFuncSeparate ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlendFuncSeparate.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies pixel arithmetic for RGB and alpha components separately.
	 *
	 * @param sfactorRGB   how the red, green, and blue blending factors are computed. The initial value is GL_ONE.
	 * @param dfactorRGB   how the red, green, and blue destination blending factors are computed. The initial value is GL_ZERO.
	 * @param sfactorAlpha how the alpha source blending factor is computed. The initial value is GL_ONE.
	 * @param dfactorAlpha how the alpha destination blending factor is computed. The initial value is GL_ZERO.
	 */
	public static void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		long __functionAddress = GL.getCapabilities().glBlendFuncSeparate;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
	}

	// --- [ glWindowPos2i ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Alternate way to set the current raster position. {@code z} is implictly set to 0.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2i(int x, int y) {
		long __functionAddress = GL.getCapabilities().glWindowPos2i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, x, y);
	}

	// --- [ glWindowPos2s ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2s(short x, short y) {
		long __functionAddress = GL.getCapabilities().glWindowPos2s;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, x, y);
	}

	// --- [ glWindowPos2f ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2f(float x, float y) {
		long __functionAddress = GL.getCapabilities().glWindowPos2f;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, x, y);
	}

	// --- [ glWindowPos2d ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2d(double x, double y) {
		long __functionAddress = GL.getCapabilities().glWindowPos2d;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, x, y);
	}

	// --- [ glWindowPos2iv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param p the position value
	 */
	public static void nglWindowPos2iv(long p) {
		long __functionAddress = GL.getCapabilities().glWindowPos2iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2iv(IntBuffer p) {
		if ( CHECKS )
			checkBuffer(p, 2);
		nglWindowPos2iv(memAddress(p));
	}

	// --- [ glWindowPos2sv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos2s WindowPos2s}.
	 *
	 * @param p the position value
	 */
	public static void nglWindowPos2sv(long p) {
		long __functionAddress = GL.getCapabilities().glWindowPos2sv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos2s WindowPos2s}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2sv(ShortBuffer p) {
		if ( CHECKS )
			checkBuffer(p, 2);
		nglWindowPos2sv(memAddress(p));
	}

	// --- [ glWindowPos2fv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos2f WindowPos2f}.
	 *
	 * @param p the position value
	 */
	public static void nglWindowPos2fv(long p) {
		long __functionAddress = GL.getCapabilities().glWindowPos2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos2f WindowPos2f}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2fv(FloatBuffer p) {
		if ( CHECKS )
			checkBuffer(p, 2);
		nglWindowPos2fv(memAddress(p));
	}

	// --- [ glWindowPos2dv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos2d WindowPos2d}.
	 *
	 * @param p the position value
	 */
	public static void nglWindowPos2dv(long p) {
		long __functionAddress = GL.getCapabilities().glWindowPos2dv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos2d WindowPos2d}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2dv(DoubleBuffer p) {
		if ( CHECKS )
			checkBuffer(p, 2);
		nglWindowPos2dv(memAddress(p));
	}

	// --- [ glWindowPos3i ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3i.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Alternate way to set the current raster position.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3i(int x, int y, int z) {
		long __functionAddress = GL.getCapabilities().glWindowPos3i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, x, y, z);
	}

	// --- [ glWindowPos3s ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3s.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Short version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3s(short x, short y, short z) {
		long __functionAddress = GL.getCapabilities().glWindowPos3s;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, x, y, z);
	}

	// --- [ glWindowPos3f ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3f.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Float version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3f(float x, float y, float z) {
		long __functionAddress = GL.getCapabilities().glWindowPos3f;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, x, y, z);
	}

	// --- [ glWindowPos3d ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3d.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Double version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3d(double x, double y, double z) {
		long __functionAddress = GL.getCapabilities().glWindowPos3d;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, x, y, z);
	}

	// --- [ glWindowPos3iv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param p the position value
	 */
	public static void nglWindowPos3iv(long p) {
		long __functionAddress = GL.getCapabilities().glWindowPos3iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3iv(IntBuffer p) {
		if ( CHECKS )
			checkBuffer(p, 3);
		nglWindowPos3iv(memAddress(p));
	}

	// --- [ glWindowPos3sv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos3s WindowPos3s}.
	 *
	 * @param p the position value
	 */
	public static void nglWindowPos3sv(long p) {
		long __functionAddress = GL.getCapabilities().glWindowPos3sv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos3s WindowPos3s}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3sv(ShortBuffer p) {
		if ( CHECKS )
			checkBuffer(p, 3);
		nglWindowPos3sv(memAddress(p));
	}

	// --- [ glWindowPos3fv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos3f WindowPos3f}.
	 *
	 * @param p the position value
	 */
	public static void nglWindowPos3fv(long p) {
		long __functionAddress = GL.getCapabilities().glWindowPos3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos3f WindowPos3f}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3fv(FloatBuffer p) {
		if ( CHECKS )
			checkBuffer(p, 3);
		nglWindowPos3fv(memAddress(p));
	}

	// --- [ glWindowPos3dv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos3d WindowPos3d}.
	 *
	 * @param p the position value
	 */
	public static void nglWindowPos3dv(long p) {
		long __functionAddress = GL.getCapabilities().glWindowPos3dv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glWindowPos3d WindowPos3d}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3dv(DoubleBuffer p) {
		if ( CHECKS )
			checkBuffer(p, 3);
		nglWindowPos3dv(memAddress(p));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoord.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glFogCoordfv FogCoordfv}
	 */
	public static void glFogCoordfv(float[] coord) {
		long __functionAddress = GL.getCapabilities().glFogCoordfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coord, 1);
		}
		callPV(__functionAddress, coord);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoord.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glFogCoorddv FogCoorddv}
	 */
	public static void glFogCoorddv(double[] coord) {
		long __functionAddress = GL.getCapabilities().glFogCoorddv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coord, 1);
		}
		callPV(__functionAddress, coord);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * short[] version of: {@link #glFogCoordPointer FogCoordPointer}
	 */
	public static void glFogCoordPointer(int type, int stride, short[] pointer) {
		long __functionAddress = GL.getCapabilities().glFogCoordPointer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glFogCoordPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * float[] version of: {@link #glFogCoordPointer FogCoordPointer}
	 */
	public static void glFogCoordPointer(int type, int stride, float[] pointer) {
		long __functionAddress = GL.getCapabilities().glFogCoordPointer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glMultiDrawArrays MultiDrawArrays}
	 */
	public static void glMultiDrawArrays(int mode, int[] first, int[] count) {
		long __functionAddress = GL.getCapabilities().glMultiDrawArrays;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, first.length);
		}
		callPPV(__functionAddress, mode, first, count, first.length);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMultiDrawElements.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glMultiDrawElements MultiDrawElements}
	 */
	public static void glMultiDrawElements(int mode, int[] count, int type, PointerBuffer indices) {
		long __functionAddress = GL.getCapabilities().glMultiDrawElements;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count.length);
		}
		callPPV(__functionAddress, mode, count, type, memAddress(indices), count.length);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glPointParameterfv PointParameterfv}
	 */
	public static void glPointParameterfv(int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glPointParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 3);
		}
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPointParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glPointParameteriv PointParameteriv}
	 */
	public static void glPointParameteriv(int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glPointParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 3);
		}
		callPV(__functionAddress, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glSecondaryColor3sv SecondaryColor3sv}
	 */
	public static void glSecondaryColor3sv(short[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3sv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glSecondaryColor3iv SecondaryColor3iv}
	 */
	public static void glSecondaryColor3iv(int[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3iv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glSecondaryColor3fv SecondaryColor3fv}
	 */
	public static void glSecondaryColor3fv(float[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3fv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glSecondaryColor3dv SecondaryColor3dv}
	 */
	public static void glSecondaryColor3dv(double[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3dv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glSecondaryColor3usv SecondaryColor3usv}
	 */
	public static void glSecondaryColor3usv(short[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3usv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColor3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glSecondaryColor3uiv SecondaryColor3uiv}
	 */
	public static void glSecondaryColor3uiv(int[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * short[] version of: {@link #glSecondaryColorPointer SecondaryColorPointer}
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, short[] pointer) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorPointer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * int[] version of: {@link #glSecondaryColorPointer SecondaryColorPointer}
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, int[] pointer) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorPointer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorPointer.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * float[] version of: {@link #glSecondaryColorPointer SecondaryColorPointer}
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, float[] pointer) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorPointer;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glWindowPos2iv WindowPos2iv}
	 */
	public static void glWindowPos2iv(int[] p) {
		long __functionAddress = GL.getCapabilities().glWindowPos2iv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2);
		}
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glWindowPos2sv WindowPos2sv}
	 */
	public static void glWindowPos2sv(short[] p) {
		long __functionAddress = GL.getCapabilities().glWindowPos2sv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2);
		}
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glWindowPos2fv WindowPos2fv}
	 */
	public static void glWindowPos2fv(float[] p) {
		long __functionAddress = GL.getCapabilities().glWindowPos2fv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2);
		}
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glWindowPos2dv WindowPos2dv}
	 */
	public static void glWindowPos2dv(double[] p) {
		long __functionAddress = GL.getCapabilities().glWindowPos2dv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2);
		}
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glWindowPos3iv WindowPos3iv}
	 */
	public static void glWindowPos3iv(int[] p) {
		long __functionAddress = GL.getCapabilities().glWindowPos3iv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3);
		}
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glWindowPos3sv WindowPos3sv}
	 */
	public static void glWindowPos3sv(short[] p) {
		long __functionAddress = GL.getCapabilities().glWindowPos3sv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3);
		}
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glWindowPos3fv WindowPos3fv}
	 */
	public static void glWindowPos3fv(float[] p) {
		long __functionAddress = GL.getCapabilities().glWindowPos3fv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3);
		}
		callPV(__functionAddress, p);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glWindowPos3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glWindowPos3dv WindowPos3dv}
	 */
	public static void glWindowPos3dv(double[] p) {
		long __functionAddress = GL.getCapabilities().glWindowPos3dv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3);
		}
		callPV(__functionAddress, p);
	}

}