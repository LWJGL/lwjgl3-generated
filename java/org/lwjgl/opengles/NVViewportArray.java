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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_viewport_array.txt">NV_viewport_array</a> extension.
 * 
 * <p>OpenGL ES is modeled on a pipeline of operations. The final stage in this pipeline before rasterization is the viewport transformation. This stage
 * transforms vertices from view space into window coordinates and allows the application to specify a rectangular region of screen space into which
 * OpenGL should draw primitives. Unextended OpenGL implementations provide a single viewport per context. In order to draw primitives into multiple
 * viewports, the OpenGL viewport may be changed between several draw calls. With the advent of Geometry Shaders, it has become possible for an
 * application to amplify geometry and produce multiple output primitives for each primitive input to the Geometry Shader. It is possible to direct these
 * primitives to render into a selected render target. However, all render targets share the same, global OpenGL viewport.</p>
 * 
 * <p>This extension enhances OpenGL by providing a mechanism to expose multiple viewports. Each viewport is specified as a rectangle. The destination
 * viewport may be selected per-primitive by the geometry shader. This allows the Geometry Shader to produce different versions of primitives destined for
 * separate viewport rectangles on the same surface. Additionally, when combined with multiple framebuffer attachments, it allows a different viewport
 * rectangle to be selected for each. This extension also exposes a separate scissor rectangle for each viewport. Finally, the viewport bounds are now
 * floating point quantities allowing fractional pixel offsets to be applied during the viewport transform.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1} and {@link EXTGeometryShader EXT_geometry_shader}.</p>
 */
public class NVViewportArray {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v. */
	public static final int
		GL_MAX_VIEWPORTS_NV                   = 0x825B,
		GL_VIEWPORT_SUBPIXEL_BITS_NV          = 0x825C,
		GL_VIEWPORT_BOUNDS_RANGE_NV           = 0x825D,
		GL_VIEWPORT_INDEX_PROVOKING_VERTEX_NV = 0x825F;

	static { GLES.initialize(); }

	protected NVViewportArray() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glViewportArrayvNV, caps.glViewportIndexedfNV, caps.glViewportIndexedfvNV, caps.glScissorArrayvNV, caps.glScissorIndexedNV, 
			caps.glScissorIndexedvNV, caps.glDepthRangeArrayfvNV, caps.glDepthRangeIndexedfNV, caps.glGetFloati_vNV, caps.glEnableiNV, caps.glDisableiNV, 
			caps.glIsEnablediNV
		);
	}

	// --- [ glViewportArrayvNV ] ---

	public static native void nglViewportArrayvNV(int first, int count, long v);

	public static void glViewportArrayvNV(int first, FloatBuffer v) {
		nglViewportArrayvNV(first, v.remaining() >> 2, memAddress(v));
	}

	// --- [ glViewportIndexedfNV ] ---

	public static native void nglViewportIndexedfNV(int index, float x, float y, float w, float h);

	public static void glViewportIndexedfNV(int index, float x, float y, float w, float h) {
		nglViewportIndexedfNV(index, x, y, w, h);
	}

	// --- [ glViewportIndexedfvNV ] ---

	public static native void nglViewportIndexedfvNV(int index, long v);

	public static void glViewportIndexedfvNV(int index, FloatBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglViewportIndexedfvNV(index, memAddress(v));
	}

	// --- [ glScissorArrayvNV ] ---

	public static native void nglScissorArrayvNV(int first, int count, long v);

	public static void glScissorArrayvNV(int first, IntBuffer v) {
		nglScissorArrayvNV(first, v.remaining() >> 2, memAddress(v));
	}

	// --- [ glScissorIndexedNV ] ---

	public static native void nglScissorIndexedNV(int index, int left, int bottom, int width, int height);

	public static void glScissorIndexedNV(int index, int left, int bottom, int width, int height) {
		nglScissorIndexedNV(index, left, bottom, width, height);
	}

	// --- [ glScissorIndexedvNV ] ---

	public static native void nglScissorIndexedvNV(int index, long v);

	public static void glScissorIndexedvNV(int index, IntBuffer v) {
		if ( CHECKS )
			check(v, 4);
		nglScissorIndexedvNV(index, memAddress(v));
	}

	// --- [ glDepthRangeArrayfvNV ] ---

	public static native void nglDepthRangeArrayfvNV(int first, int count, long v);

	public static void glDepthRangeArrayfvNV(int first, FloatBuffer v) {
		nglDepthRangeArrayfvNV(first, v.remaining() >> 1, memAddress(v));
	}

	// --- [ glDepthRangeIndexedfNV ] ---

	public static native void nglDepthRangeIndexedfNV(int index, float n, float f);

	public static void glDepthRangeIndexedfNV(int index, float n, float f) {
		nglDepthRangeIndexedfNV(index, n, f);
	}

	// --- [ glGetFloati_vNV ] ---

	public static native void nglGetFloati_vNV(int target, int index, long data);

	public static void glGetFloati_vNV(int target, int index, FloatBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetFloati_vNV(target, index, memAddress(data));
	}

	public static float glGetFloatiNV(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer data = stack.callocFloat(1);
			nglGetFloati_vNV(target, index, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glEnableiNV ] ---

	public static native void nglEnableiNV(int target, int index);

	public static void glEnableiNV(int target, int index) {
		nglEnableiNV(target, index);
	}

	// --- [ glDisableiNV ] ---

	public static native void nglDisableiNV(int target, int index);

	public static void glDisableiNV(int target, int index) {
		nglDisableiNV(target, index);
	}

	// --- [ glIsEnablediNV ] ---

	public static native boolean nglIsEnablediNV(int target, int index);

	public static boolean glIsEnablediNV(int target, int index) {
		return nglIsEnablediNV(target, index);
	}

	/** Array version of: {@link #glViewportArrayvNV ViewportArrayvNV} */
	public static void glViewportArrayvNV(int first, float[] v) {
		long __functionAddress = GLES.getICD().glViewportArrayvNV;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, first, v.length >> 2, v);
	}

	/** Array version of: {@link #glViewportIndexedfvNV ViewportIndexedfvNV} */
	public static void glViewportIndexedfvNV(int index, float[] v) {
		long __functionAddress = GLES.getICD().glViewportIndexedfvNV;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glScissorArrayvNV ScissorArrayvNV} */
	public static void glScissorArrayvNV(int first, int[] v) {
		long __functionAddress = GLES.getICD().glScissorArrayvNV;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, first, v.length >> 2, v);
	}

	/** Array version of: {@link #glScissorIndexedvNV ScissorIndexedvNV} */
	public static void glScissorIndexedvNV(int index, int[] v) {
		long __functionAddress = GLES.getICD().glScissorIndexedvNV;
		if ( CHECKS ) {
			check(__functionAddress);
			check(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glDepthRangeArrayfvNV DepthRangeArrayfvNV} */
	public static void glDepthRangeArrayfvNV(int first, float[] v) {
		long __functionAddress = GLES.getICD().glDepthRangeArrayfvNV;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, first, v.length >> 1, v);
	}

	/** Array version of: {@link #glGetFloati_vNV GetFloati_vNV} */
	public static void glGetFloati_vNV(int target, int index, float[] data) {
		long __functionAddress = GLES.getICD().glGetFloati_vNV;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

}