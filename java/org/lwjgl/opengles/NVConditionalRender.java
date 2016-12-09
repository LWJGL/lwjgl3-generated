/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/conditional_render.txt">NV_conditional_render</a> extension.
 * 
 * <p>This extension provides support for conditional rendering based on the results of an occlusion query. This mechanism allows an application to
 * potentially reduce the latency between the completion of an occlusion query and the rendering commands depending on its result. It additionally allows
 * the decision of whether to render to be made without application intervention.</p>
 * 
 * <p>This extension defines two new functions, BeginConditionalRenderNV and EndConditionalRenderNV, between which rendering commands may be discarded based
 * on the results of an occlusion query. If the specified occlusion query returns a non-zero value, rendering commands between these calls are executed.
 * If the occlusion query returns a value of zero, all rendering commands between the calls are discarded.</p>
 * 
 * <p>If the occlusion query results are not available when BeginConditionalRenderNV is executed, the {@code mode} parameter specifies whether the GL should
 * wait for the query to complete or should simply render the subsequent geometry unconditionally.</p>
 * 
 * <p>Additionally, the extension provides a set of "by region" modes, allowing for implementations that divide rendering work by screen regions to perform
 * the conditional query test on a region-by-region basis without checking the query results from other regions. Such a mode is useful for cases like
 * split-frame SLI, where a frame is divided between multiple GPUs, each of which has its own occlusion query hardware.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0} or {@link EXTOcclusionQueryBoolean EXT_occlusion_query_boolean}.</p>
 */
public class NVConditionalRender {

	/** Accepted by the {@code mode} parameter of BeginConditionalRenderNV. */
	public static final int
		GL_QUERY_WAIT_NV              = 0x8E13,
		GL_QUERY_NO_WAIT_NV           = 0x8E14,
		GL_QUERY_BY_REGION_WAIT_NV    = 0x8E15,
		GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;

	static { GLES.initialize(); }

	protected NVConditionalRender() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glBeginConditionalRenderNV, caps.glEndConditionalRenderNV
		);
	}

	// --- [ glBeginConditionalRenderNV ] ---

	public static native void nglBeginConditionalRenderNV(int id, int mode);

	public static void glBeginConditionalRenderNV(int id, int mode) {
		nglBeginConditionalRenderNV(id, mode);
	}

	// --- [ glEndConditionalRenderNV ] ---

	public static native void nglEndConditionalRenderNV();

	public static void glEndConditionalRenderNV() {
		nglEndConditionalRenderNV();
	}

}