/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_viewport_array.txt">OES_viewport_array</a> extension.
 * 
 * <p>OpenGL ES is modeled on a pipeline of operations. The final stage in this pipeline before rasterization is the viewport transformation. This stage
 * transforms vertices from view space into window coordinates and allows the application to specify a rectangular region of screen space into which
 * OpenGL ES should draw primitives. Unextended OpenGL ES implementations provide a single viewport per context. In order to draw primitives into multiple
 * viewports, the OpenGL ES viewport may be changed between several draw calls. With the advent of Geometry Shaders, it has become possible for an
 * application to amplify geometry and produce multiple output primitives for each primitive input to the Geometry Shader. It is possible to direct these
 * primitives to render into a selected render target. However, all render targets share the same, global OpenGL ES viewport.</p>
 * 
 * <p>This extension enhances OpenGL ES by providing a mechanism to expose multiple viewports. Each viewport is specified as a rectangle. The destination
 * viewport may be selected per-primitive by the geometry shader. This allows the Geometry Shader to produce different versions of primitives destined for
 * separate viewport rectangles on the same surface. Additionally, when combined with multiple framebuffer attachments, it allows a different viewport
 * rectangle to be selected for each. This extension also exposes a separate scissor rectangle for each viewport. Finally, the viewport bounds are now
 * floating point quantities allowing fractional pixel offsets to be applied during the viewport transform.</p>
 * 
 * <p>Requires {@link GLES32 GLES32}, {@link EXTGeometryShader EXT_geometry_shader} or {@link OESGeometryShader OES_geometry_shader}.</p>
 */
public class OESViewportArray {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v. */
	public static final int
		GL_MAX_VIEWPORTS_OES                   = 0x825B,
		GL_VIEWPORT_SUBPIXEL_BITS_OES          = 0x825C,
		GL_VIEWPORT_BOUNDS_RANGE_OES           = 0x825D,
		GL_VIEWPORT_INDEX_PROVOKING_VERTEX_OES = 0x825F;

	protected OESViewportArray() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glViewportArrayvOES, caps.glViewportIndexedfOES, caps.glViewportIndexedfvOES, caps.glScissorArrayvOES, caps.glScissorIndexedOES, 
			caps.glScissorIndexedvOES, caps.glDepthRangeArrayfvOES, caps.glDepthRangeIndexedfOES, caps.glGetFloati_vOES
		);
	}

	// --- [ glViewportArrayvOES ] ---

	public static void nglViewportArrayvOES(int first, int count, long v) {
		long __functionAddress = GLES.getCapabilities().glViewportArrayvOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, first, count, v);
	}

	public static void glViewportArrayvOES(int first, FloatBuffer v) {
		nglViewportArrayvOES(first, v.remaining() >> 2, memAddress(v));
	}

	// --- [ glViewportIndexedfOES ] ---

	public static void glViewportIndexedfOES(int index, float x, float y, float w, float h) {
		long __functionAddress = GLES.getCapabilities().glViewportIndexedfOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, w, h);
	}

	// --- [ glViewportIndexedfvOES ] ---

	public static void nglViewportIndexedfvOES(int index, long v) {
		long __functionAddress = GLES.getCapabilities().glViewportIndexedfvOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	public static void glViewportIndexedfvOES(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglViewportIndexedfvOES(index, memAddress(v));
	}

	// --- [ glScissorArrayvOES ] ---

	public static void nglScissorArrayvOES(int first, int count, long v) {
		long __functionAddress = GLES.getCapabilities().glScissorArrayvOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, first, count, v);
	}

	public static void glScissorArrayvOES(int first, IntBuffer v) {
		nglScissorArrayvOES(first, v.remaining() >> 2, memAddress(v));
	}

	// --- [ glScissorIndexedOES ] ---

	public static void glScissorIndexedOES(int index, int left, int bottom, int width, int height) {
		long __functionAddress = GLES.getCapabilities().glScissorIndexedOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, left, bottom, width, height);
	}

	// --- [ glScissorIndexedvOES ] ---

	public static void nglScissorIndexedvOES(int index, long v) {
		long __functionAddress = GLES.getCapabilities().glScissorIndexedvOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	public static void glScissorIndexedvOES(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglScissorIndexedvOES(index, memAddress(v));
	}

	// --- [ glDepthRangeArrayfvOES ] ---

	public static void nglDepthRangeArrayfvOES(int first, int count, long v) {
		long __functionAddress = GLES.getCapabilities().glDepthRangeArrayfvOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, first, count, v);
	}

	public static void glDepthRangeArrayfvOES(int first, FloatBuffer v) {
		nglDepthRangeArrayfvOES(first, v.remaining() >> 1, memAddress(v));
	}

	// --- [ glDepthRangeIndexedfOES ] ---

	public static void glDepthRangeIndexedfOES(int index, float n, float f) {
		long __functionAddress = GLES.getCapabilities().glDepthRangeIndexedfOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, n, f);
	}

	// --- [ glGetFloati_vOES ] ---

	public static void nglGetFloati_vOES(int target, int index, long data) {
		long __functionAddress = GLES.getCapabilities().glGetFloati_vOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, data);
	}

	public static void glGetFloati_vOES(int target, int index, FloatBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetFloati_vOES(target, index, memAddress(data));
	}

	public static float glGetFloatiOES(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer data = stack.callocFloat(1);
			nglGetFloati_vOES(target, index, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glEnableiOES ] ---

	public static void glEnableiOES(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glEnableiOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glDisableiOES ] ---

	public static void glDisableiOES(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glDisableiOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glIsEnablediOES ] ---

	public static boolean glIsEnablediOES(int target, int index) {
		long __functionAddress = GLES.getCapabilities().glIsEnablediOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, target, index);
	}

	/** Array version of: {@link #glViewportArrayvOES ViewportArrayvOES} */
	public static void glViewportArrayvOES(int first, float[] v) {
		long __functionAddress = GLES.getCapabilities().glViewportArrayvOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, first, v.length >> 2, v);
	}

	/** Array version of: {@link #glViewportIndexedfvOES ViewportIndexedfvOES} */
	public static void glViewportIndexedfvOES(int index, float[] v) {
		long __functionAddress = GLES.getCapabilities().glViewportIndexedfvOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glScissorArrayvOES ScissorArrayvOES} */
	public static void glScissorArrayvOES(int first, int[] v) {
		long __functionAddress = GLES.getCapabilities().glScissorArrayvOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, first, v.length >> 2, v);
	}

	/** Array version of: {@link #glScissorIndexedvOES ScissorIndexedvOES} */
	public static void glScissorIndexedvOES(int index, int[] v) {
		long __functionAddress = GLES.getCapabilities().glScissorIndexedvOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glDepthRangeArrayfvOES DepthRangeArrayfvOES} */
	public static void glDepthRangeArrayfvOES(int first, float[] v) {
		long __functionAddress = GLES.getCapabilities().glDepthRangeArrayfvOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, first, v.length >> 1, v);
	}

	/** Array version of: {@link #glGetFloati_vOES GetFloati_vOES} */
	public static void glGetFloati_vOES(int target, int index, float[] data) {
		long __functionAddress = GLES.getCapabilities().glGetFloati_vOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

}