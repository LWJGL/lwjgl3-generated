/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/conditional_render.txt">NV_conditional_render</a> extension.
 * 
 * <p>This extension provides support for conditional rendering based on the results of an occlusion query. This mechanism allows an application to
 * potentially reduce the latency between the completion of an occlusion query and the rendering commands depending on its result. It additionally allows
 * the decision of whether to render to be made without application intervention.</p>
 * 
 * <p>This extension defines two new functions, {@link #glBeginConditionalRenderNV BeginConditionalRenderNV} and {@link #glEndConditionalRenderNV EndConditionalRenderNV}, between which rendering commands may be discarded
 * based on the results of an occlusion query. If the specified occlusion query returns a non-zero value, rendering commands between these calls are
 * executed. If the occlusion query returns a value of zero, all rendering commands between the calls are discarded.</p>
 * 
 * <p>If the occlusion query results are not available when {@link #glBeginConditionalRenderNV BeginConditionalRenderNV} is executed, the {@code mode} parameter specifies whether the GL
 * should wait for the query to complete or should simply render the subsequent geometry unconditionally.</p>
 * 
 * <p>Additionally, the extension provides a set of "by region" modes, allowing for implementations that divide rendering work by screen regions to perform
 * the conditional query test on a region-by-region basis without checking the query results from other regions. Such a mode is useful for cases like
 * split-frame SLI, where a frame is divided between multiple GPUs, each of which has its own occlusion query hardware.</p>
 */
public final class NVConditionalRender {

	/** Accepted by the {@code mode} parameter of BeginConditionalRenderNV. */
	public static final int
		GL_QUERY_WAIT_NV              = 0x8E13,
		GL_QUERY_NO_WAIT_NV           = 0x8E14,
		GL_QUERY_BY_REGION_WAIT_NV    = 0x8E15,
		GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;

	/** Function address. */
	@JavadocExclude
	public final long
		BeginConditionalRenderNV,
		EndConditionalRenderNV;

	@JavadocExclude
	public NVConditionalRender(FunctionProvider provider) {
		BeginConditionalRenderNV = provider.getFunctionAddress("glBeginConditionalRenderNV");
		EndConditionalRenderNV = provider.getFunctionAddress("glEndConditionalRenderNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVConditionalRender} instance for the current context. */
	public static NVConditionalRender getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVConditionalRender);
	}

	static NVConditionalRender create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_conditional_render") ) return null;

		NVConditionalRender funcs = new NVConditionalRender(provider);

		boolean supported = checkFunctions(
			funcs.BeginConditionalRenderNV, funcs.EndConditionalRenderNV
		);

		return GL.checkExtension("GL_NV_conditional_render", funcs, supported);
	}

	// --- [ glBeginConditionalRenderNV ] ---

	/** JNI method for {@link #glBeginConditionalRenderNV BeginConditionalRenderNV} */
	@JavadocExclude
	public static native void nglBeginConditionalRenderNV(int id, int mode, long __functionAddress);

	/**
	 * 
	 *
	 * @param id   
	 * @param mode 
	 */
	public static void glBeginConditionalRenderNV(int id, int mode) {
		long __functionAddress = getInstance().BeginConditionalRenderNV;
		nglBeginConditionalRenderNV(id, mode, __functionAddress);
	}

	// --- [ glEndConditionalRenderNV ] ---

	/** JNI method for {@link #glEndConditionalRenderNV EndConditionalRenderNV} */
	@JavadocExclude
	public static native void nglEndConditionalRenderNV(long __functionAddress);

	/**  */
	public static void glEndConditionalRenderNV() {
		long __functionAddress = getInstance().EndConditionalRenderNV;
		nglEndConditionalRenderNV(__functionAddress);
	}

}