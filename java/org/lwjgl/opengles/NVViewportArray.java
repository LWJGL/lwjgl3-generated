/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
 * <p>Requires {@link GLES31 GLES E.S} and {@link EXTGeometryShader EXT_geometry_shader}.</p>
 */
public final class NVViewportArray {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v. */
	public static final int
		GL_MAX_VIEWPORTS_NV                   = 0x825B,
		GL_VIEWPORT_SUBPIXEL_BITS_NV          = 0x825C,
		GL_VIEWPORT_BOUNDS_RANGE_NV           = 0x825D,
		GL_VIEWPORT_INDEX_PROVOKING_VERTEX_NV = 0x825F;

	/** Function address. */
	@JavadocExclude
	public final long
		ViewportArrayvNV,
		ViewportIndexedfNV,
		ViewportIndexedfvNV,
		ScissorArrayvNV,
		ScissorIndexedNV,
		ScissorIndexedvNV,
		DepthRangeArrayfvNV,
		DepthRangeIndexedfNV,
		GetFloati_vNV,
		EnableiNV,
		DisableiNV,
		IsEnablediNV;

	@JavadocExclude
	public NVViewportArray(FunctionProvider provider) {
		ViewportArrayvNV = provider.getFunctionAddress("glViewportArrayvNV");
		ViewportIndexedfNV = provider.getFunctionAddress("glViewportIndexedfNV");
		ViewportIndexedfvNV = provider.getFunctionAddress("glViewportIndexedfvNV");
		ScissorArrayvNV = provider.getFunctionAddress("glScissorArrayvNV");
		ScissorIndexedNV = provider.getFunctionAddress("glScissorIndexedNV");
		ScissorIndexedvNV = provider.getFunctionAddress("glScissorIndexedvNV");
		DepthRangeArrayfvNV = provider.getFunctionAddress("glDepthRangeArrayfvNV");
		DepthRangeIndexedfNV = provider.getFunctionAddress("glDepthRangeIndexedfNV");
		GetFloati_vNV = provider.getFunctionAddress("glGetFloati_vNV");
		EnableiNV = provider.getFunctionAddress("glEnableiNV");
		DisableiNV = provider.getFunctionAddress("glDisableiNV");
		IsEnablediNV = provider.getFunctionAddress("glIsEnablediNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVViewportArray} instance for the current context. */
	public static NVViewportArray getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVViewportArray);
	}

	static NVViewportArray create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_viewport_array") ) return null;

		NVViewportArray funcs = new NVViewportArray(provider);
		boolean supported = checkFunctions(
			funcs.ViewportArrayvNV, funcs.ViewportIndexedfNV, funcs.ViewportIndexedfvNV, funcs.ScissorArrayvNV, funcs.ScissorIndexedNV, funcs.ScissorIndexedvNV, 
			funcs.DepthRangeArrayfvNV, funcs.DepthRangeIndexedfNV, funcs.GetFloati_vNV, funcs.EnableiNV, funcs.DisableiNV, funcs.IsEnablediNV
		);

		return GLES.checkExtension("GL_NV_viewport_array", funcs, supported);
	}

	// --- [ glViewportArrayvNV ] ---

	/** Unsafe version of {@link #glViewportArrayvNV ViewportArrayvNV} */
	@JavadocExclude
	public static void nglViewportArrayvNV(int first, int count, long v) {
		long __functionAddress = getInstance().ViewportArrayvNV;
		callIIPV(__functionAddress, first, count, v);
	}

	public static void glViewportArrayvNV(int first, int count, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (count << 2) << 2);
		nglViewportArrayvNV(first, count, memAddress(v));
	}

	/** Alternative version of: {@link #glViewportArrayvNV ViewportArrayvNV} */
	public static void glViewportArrayvNV(int first, FloatBuffer v) {
		nglViewportArrayvNV(first, v.remaining() >> 2, memAddress(v));
	}

	// --- [ glViewportIndexedfNV ] ---

	public static void glViewportIndexedfNV(int index, float x, float y, float w, float h) {
		long __functionAddress = getInstance().ViewportIndexedfNV;
		callIFFFFV(__functionAddress, index, x, y, w, h);
	}

	// --- [ glViewportIndexedfvNV ] ---

	/** Unsafe version of {@link #glViewportIndexedfvNV ViewportIndexedfvNV} */
	@JavadocExclude
	public static void nglViewportIndexedfvNV(int index, long v) {
		long __functionAddress = getInstance().ViewportIndexedfvNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glViewportIndexedfvNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglViewportIndexedfvNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glViewportIndexedfvNV ViewportIndexedfvNV} */
	public static void glViewportIndexedfvNV(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglViewportIndexedfvNV(index, memAddress(v));
	}

	// --- [ glScissorArrayvNV ] ---

	/** Unsafe version of {@link #glScissorArrayvNV ScissorArrayvNV} */
	@JavadocExclude
	public static void nglScissorArrayvNV(int first, int count, long v) {
		long __functionAddress = getInstance().ScissorArrayvNV;
		callIIPV(__functionAddress, first, count, v);
	}

	public static void glScissorArrayvNV(int first, int count, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (count << 2) << 2);
		nglScissorArrayvNV(first, count, memAddress(v));
	}

	/** Alternative version of: {@link #glScissorArrayvNV ScissorArrayvNV} */
	public static void glScissorArrayvNV(int first, IntBuffer v) {
		nglScissorArrayvNV(first, v.remaining() >> 2, memAddress(v));
	}

	// --- [ glScissorIndexedNV ] ---

	public static void glScissorIndexedNV(int index, int left, int bottom, int width, int height) {
		long __functionAddress = getInstance().ScissorIndexedNV;
		callIIIIIV(__functionAddress, index, left, bottom, width, height);
	}

	// --- [ glScissorIndexedvNV ] ---

	/** Unsafe version of {@link #glScissorIndexedvNV ScissorIndexedvNV} */
	@JavadocExclude
	public static void nglScissorIndexedvNV(int index, long v) {
		long __functionAddress = getInstance().ScissorIndexedvNV;
		callIPV(__functionAddress, index, v);
	}

	public static void glScissorIndexedvNV(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglScissorIndexedvNV(index, memAddress(v));
	}

	/** Alternative version of: {@link #glScissorIndexedvNV ScissorIndexedvNV} */
	public static void glScissorIndexedvNV(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglScissorIndexedvNV(index, memAddress(v));
	}

	// --- [ glDepthRangeArrayfvNV ] ---

	/** Unsafe version of {@link #glDepthRangeArrayfvNV DepthRangeArrayfvNV} */
	@JavadocExclude
	public static void nglDepthRangeArrayfvNV(int first, int count, long v) {
		long __functionAddress = getInstance().DepthRangeArrayfvNV;
		callIIPV(__functionAddress, first, count, v);
	}

	public static void glDepthRangeArrayfvNV(int first, int count, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (count << 1) << 2);
		nglDepthRangeArrayfvNV(first, count, memAddress(v));
	}

	/** Alternative version of: {@link #glDepthRangeArrayfvNV DepthRangeArrayfvNV} */
	public static void glDepthRangeArrayfvNV(int first, FloatBuffer v) {
		nglDepthRangeArrayfvNV(first, v.remaining() >> 1, memAddress(v));
	}

	// --- [ glDepthRangeIndexedfNV ] ---

	public static void glDepthRangeIndexedfNV(int index, float n, float f) {
		long __functionAddress = getInstance().DepthRangeIndexedfNV;
		callIFFV(__functionAddress, index, n, f);
	}

	// --- [ glGetFloati_vNV ] ---

	/** Unsafe version of {@link #glGetFloati_vNV GetFloati_vNV} */
	@JavadocExclude
	public static void nglGetFloati_vNV(int target, int index, long data) {
		long __functionAddress = getInstance().GetFloati_vNV;
		callIIPV(__functionAddress, target, index, data);
	}

	public static void glGetFloati_vNV(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetFloati_vNV(target, index, memAddress(data));
	}

	/** Alternative version of: {@link #glGetFloati_vNV GetFloati_vNV} */
	public static void glGetFloati_vNV(int target, int index, FloatBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetFloati_vNV(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetFloati_vNV GetFloati_vNV} */
	public static float glGetFloatiNV(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.floatParam();
		nglGetFloati_vNV(target, index, __buffer.address(data));
		return __buffer.floatValue(data);
	}

	// --- [ glEnableiNV ] ---

	public static void glEnableiNV(int target, int index) {
		long __functionAddress = getInstance().EnableiNV;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glDisableiNV ] ---

	public static void glDisableiNV(int target, int index) {
		long __functionAddress = getInstance().DisableiNV;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glIsEnablediNV ] ---

	public static boolean glIsEnablediNV(int target, int index) {
		long __functionAddress = getInstance().IsEnablediNV;
		return callIIZ(__functionAddress, target, index);
	}

}