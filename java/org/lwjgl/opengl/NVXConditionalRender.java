/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NVX/conditional_render.txt">NVX_conditional_render</a> extension.
 * 
 * <p>This extension provides support for conditional rendering based on the
 * results of an occlusion query.  This mechanism allows an application to
 * potentially reduce the latency between the completion of an occlusion
 * query and the rendering commands depending on its result.  It additionally
 * allows the decision of whether to render to be made without application
 * intervention.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5} or {@link ARBOcclusionQuery ARB_occlusion_query}</p>
 */
public class NVXConditionalRender {

	protected NVXConditionalRender() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBeginConditionalRenderNVX, caps.glEndConditionalRenderNVX
		);
	}

	// --- [ glBeginConditionalRenderNVX ] ---

	public static void glBeginConditionalRenderNVX(int id) {
		long __functionAddress = GL.getCapabilities().glBeginConditionalRenderNVX;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, id);
	}

	// --- [ glEndConditionalRenderNVX ] ---

	public static void glEndConditionalRenderNVX() {
		long __functionAddress = GL.getCapabilities().glEndConditionalRenderNVX;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

}