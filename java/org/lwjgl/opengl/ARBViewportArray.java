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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/viewport_array.txt">ARB_viewport_array</a> extension.
 * 
 * <p>OpenGL is modeled on a pipeline of operations. The final stage in this pipeline before rasterization is the viewport transformation. This stage
 * transforms vertices from view space into window coordinates and allows the application to specify a rectangular region of screen space into which OpenGL
 * should draw primitives. Unextended OpenGL implementations provide a single viewport per context. In order to draw primitives into multiple viewports,
 * the OpenGL viewport may be changed between several draw calls. With the advent of Geometry Shaders, it has become possible for an application to amplify
 * geometry and produce multiple output primitives for each primitive input to the Geometry Shader. It is possible to direct these primitives to render
 * into a selected render target. However, all render targets share the same, global OpenGL viewport.</p>
 * 
 * <p>This extension enhances OpenGL by providing a mechanism to expose multiple viewports. Each viewport is specified as a rectangle. The destination
 * viewport may be selected per-primitive by the geometry shader. This allows the Geometry Shader to produce different versions of primitives destined for
 * separate viewport rectangles on the same surface. Additionally, when combined with multiple framebuffer attachments, it allows a different viewport
 * rectangle to be selected for each. This extension also exposes a separate scissor rectangle for each viewport. Finally, the viewport bounds are now
 * floating point quantities allowing fractional pixel offsets to be applied during the viewport transform.</p>
 * 
 * <p>Requires {@link GL32 OpenGL 3.2} or <a href="http://www.opengl.org/registry/specs/EXT/geometry_shader4.txt">EXT_geometry_shader4</a> or {@link ARBGeometryShader4 ARB_geometry_shader4}. Promoted to core in {@link GL41 OpenGL 4.1}.</p>
 */
public final class ARBViewportArray {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v. */
	public static final int
		GL_MAX_VIEWPORTS                   = 0x825B,
		GL_VIEWPORT_SUBPIXEL_BITS          = 0x825C,
		GL_VIEWPORT_BOUNDS_RANGE           = 0x825D,
		GL_LAYER_PROVOKING_VERTEX          = 0x825E,
		GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;

	/** Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX or VIEWPORT_INDEX_PROVOKING_VERTEX. */
	public static final int GL_UNDEFINED_VERTEX = 0x8260;

	/** Function address. */
	@JavadocExclude
	public final long
		ViewportArrayv,
		ViewportIndexedf,
		ViewportIndexedfv,
		ScissorArrayv,
		ScissorIndexed,
		ScissorIndexedv,
		DepthRangeArrayv,
		DepthRangeIndexed,
		GetFloati_v,
		GetDoublei_v;

	@JavadocExclude
	public ARBViewportArray(FunctionProvider provider) {
		ViewportArrayv = provider.getFunctionAddress("glViewportArrayv");
		ViewportIndexedf = provider.getFunctionAddress("glViewportIndexedf");
		ViewportIndexedfv = provider.getFunctionAddress("glViewportIndexedfv");
		ScissorArrayv = provider.getFunctionAddress("glScissorArrayv");
		ScissorIndexed = provider.getFunctionAddress("glScissorIndexed");
		ScissorIndexedv = provider.getFunctionAddress("glScissorIndexedv");
		DepthRangeArrayv = provider.getFunctionAddress("glDepthRangeArrayv");
		DepthRangeIndexed = provider.getFunctionAddress("glDepthRangeIndexed");
		GetFloati_v = provider.getFunctionAddress("glGetFloati_v");
		GetDoublei_v = provider.getFunctionAddress("glGetDoublei_v");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBViewportArray} instance for the current context. */
	public static ARBViewportArray getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBViewportArray);
	}

	static ARBViewportArray create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_viewport_array") ) return null;

		ARBViewportArray funcs = new ARBViewportArray(provider);

		boolean supported = checkFunctions(
			funcs.ViewportArrayv, funcs.ViewportIndexedf, funcs.ViewportIndexedfv, funcs.ScissorArrayv, funcs.ScissorIndexed, funcs.ScissorIndexedv, 
			funcs.DepthRangeArrayv, funcs.DepthRangeIndexed, funcs.GetFloati_v, funcs.GetDoublei_v
		);

		return GL.checkExtension("GL_ARB_viewport_array", funcs, supported);
	}

	// --- [ glViewportArrayv ] ---

	/** Unsafe version of {@link #glViewportArrayv ViewportArrayv} */
	@JavadocExclude
	public static void nglViewportArrayv(int first, int count, long v) {
		long __functionAddress = getInstance().ViewportArrayv;
		GL41.nglViewportArrayv(first, count, v, __functionAddress);
	}

	/**
	 * Sets multiple viewports.
	 *
	 * @param first the first viewport to set
	 * @param count the number of viewports to set
	 * @param v     an array containing the viewport parameters
	 */
	public static void glViewportArrayv(int first, int count, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (count << 2) << 2);
		nglViewportArrayv(first, count, memAddress(v));
	}

	/** Alternative version of: {@link #glViewportArrayv ViewportArrayv} */
	public static void glViewportArrayv(int first, FloatBuffer v) {
		nglViewportArrayv(first, v.remaining() >> 2, memAddress(v));
	}

	// --- [ glViewportIndexedf ] ---

	/**
	 * Sets a specified viewport.
	 *
	 * @param index the viewport to set
	 * @param x     the left viewport coordinate
	 * @param y     the bottom viewport coordinate
	 * @param w     the viewport width
	 * @param h     the viewport height
	 */
	public static void glViewportIndexedf(int index, float x, float y, float w, float h) {
		long __functionAddress = getInstance().ViewportIndexedf;
		GL41.nglViewportIndexedf(index, x, y, w, h, __functionAddress);
	}

	// --- [ glViewportIndexedfv ] ---

	/** Unsafe version of {@link #glViewportIndexedfv ViewportIndexedfv} */
	@JavadocExclude
	public static void nglViewportIndexedfv(int index, long v) {
		long __functionAddress = getInstance().ViewportIndexedfv;
		GL41.nglViewportIndexedfv(index, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glViewportIndexedf ViewportIndexedf}.
	 *
	 * @param index the viewport to set
	 * @param v     the viewport parameters
	 */
	public static void glViewportIndexedfv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglViewportIndexedfv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glViewportIndexedfv ViewportIndexedfv} */
	public static void glViewportIndexedfv(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglViewportIndexedfv(index, memAddress(v));
	}

	// --- [ glScissorArrayv ] ---

	/** Unsafe version of {@link #glScissorArrayv ScissorArrayv} */
	@JavadocExclude
	public static void nglScissorArrayv(int first, int count, long v) {
		long __functionAddress = getInstance().ScissorArrayv;
		GL41.nglScissorArrayv(first, count, v, __functionAddress);
	}

	/**
	 * Defines the scissor box for multiple viewports.
	 *
	 * @param first the index of the first viewport whose scissor box to modify
	 * @param count the number of scissor boxes to modify
	 * @param v     an array containing the left, bottom, width and height of each scissor box, in that order
	 */
	public static void glScissorArrayv(int first, int count, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (count << 2) << 2);
		nglScissorArrayv(first, count, memAddress(v));
	}

	/** Alternative version of: {@link #glScissorArrayv ScissorArrayv} */
	public static void glScissorArrayv(int first, IntBuffer v) {
		nglScissorArrayv(first, v.remaining() >> 2, memAddress(v));
	}

	// --- [ glScissorIndexed ] ---

	/**
	 * Defines the scissor box for a specific viewport.
	 *
	 * @param index  the index of the viewport whose scissor box to modify
	 * @param left   the left scissor box coordinate
	 * @param bottom the bottom scissor box coordinate
	 * @param width  the scissor box width
	 * @param height the scissor box height
	 */
	public static void glScissorIndexed(int index, int left, int bottom, int width, int height) {
		long __functionAddress = getInstance().ScissorIndexed;
		GL41.nglScissorIndexed(index, left, bottom, width, height, __functionAddress);
	}

	// --- [ glScissorIndexedv ] ---

	/** Unsafe version of {@link #glScissorIndexedv ScissorIndexedv} */
	@JavadocExclude
	public static void nglScissorIndexedv(int index, long v) {
		long __functionAddress = getInstance().ScissorIndexedv;
		GL41.nglScissorIndexedv(index, v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glScissorIndexed ScissorIndexed}.
	 *
	 * @param index the index of the viewport whose scissor box to modify
	 * @param v     an array containing the left, bottom, width and height of each scissor box, in that order
	 */
	public static void glScissorIndexedv(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglScissorIndexedv(index, memAddress(v));
	}

	/** Alternative version of: {@link #glScissorIndexedv ScissorIndexedv} */
	public static void glScissorIndexedv(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglScissorIndexedv(index, memAddress(v));
	}

	// --- [ glDepthRangeArrayv ] ---

	/** Unsafe version of {@link #glDepthRangeArrayv DepthRangeArrayv} */
	@JavadocExclude
	public static void nglDepthRangeArrayv(int first, int count, long v) {
		long __functionAddress = getInstance().DepthRangeArrayv;
		GL41.nglDepthRangeArrayv(first, count, v, __functionAddress);
	}

	/**
	 * Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified set of viewports.
	 *
	 * @param first the index of the first viewport whose depth range to update
	 * @param count the number of viewports whose depth range to update
	 * @param v     n array containing the near and far values for the depth range of each modified viewport
	 */
	public static void glDepthRangeArrayv(int first, int count, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (count << 1) << 3);
		nglDepthRangeArrayv(first, count, memAddress(v));
	}

	/** Alternative version of: {@link #glDepthRangeArrayv DepthRangeArrayv} */
	public static void glDepthRangeArrayv(int first, DoubleBuffer v) {
		nglDepthRangeArrayv(first, v.remaining() >> 1, memAddress(v));
	}

	// --- [ glDepthRangeIndexed ] ---

	/**
	 * Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified viewport.
	 *
	 * @param index the index of the viewport whose depth range to update
	 * @param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.
	 * @param zFar  the mapping of the far clipping plane to window coordinates. The initial value is 1.
	 */
	public static void glDepthRangeIndexed(int index, double zNear, double zFar) {
		long __functionAddress = getInstance().DepthRangeIndexed;
		GL41.nglDepthRangeIndexed(index, zNear, zFar, __functionAddress);
	}

	// --- [ glGetFloati_v ] ---

	/** Unsafe version of {@link #glGetFloati_v GetFloati_v} */
	@JavadocExclude
	public static void nglGetFloati_v(int target, int index, long data) {
		long __functionAddress = getInstance().GetFloati_v;
		GL41.nglGetFloati_v(target, index, data, __functionAddress);
	}

	/**
	 * Queries the float value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetFloati_v(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetFloati_v(target, index, memAddress(data));
	}

	/** Alternative version of: {@link #glGetFloati_v GetFloati_v} */
	public static void glGetFloati_v(int target, int index, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetFloati_v(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetFloati_v GetFloati_v} */
	public static float glGetFloati(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetFloati_v(target, index, __buffer.address(data));
		return __buffer.floatValue(data);
	}

	// --- [ glGetDoublei_v ] ---

	/** Unsafe version of {@link #glGetDoublei_v GetDoublei_v} */
	@JavadocExclude
	public static void nglGetDoublei_v(int target, int index, long data) {
		long __functionAddress = getInstance().GetDoublei_v;
		GL41.nglGetDoublei_v(target, index, data, __functionAddress);
	}

	/**
	 * Queries the double value of an indexed state variable.
	 *
	 * @param target the indexed state to query
	 * @param index  the index of the element being queried
	 * @param data   a scalar or buffer in which to place the returned data
	 */
	public static void glGetDoublei_v(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 3);
		nglGetDoublei_v(target, index, memAddress(data));
	}

	/** Alternative version of: {@link #glGetDoublei_v GetDoublei_v} */
	public static void glGetDoublei_v(int target, int index, DoubleBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetDoublei_v(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetDoublei_v GetDoublei_v} */
	public static double glGetDoublei(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.doubleParam();
		nglGetDoublei_v(target, index, __buffer.address(data));
		return __buffer.doubleValue(data);
	}

}