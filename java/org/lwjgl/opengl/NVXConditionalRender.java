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
public final class NVXConditionalRender {

	/** Function address. */
	@JavadocExclude
	public final long
		BeginConditionalRenderNVX,
		EndConditionalRenderNVX;

	@JavadocExclude
	public NVXConditionalRender(FunctionProvider provider) {
		BeginConditionalRenderNVX = provider.getFunctionAddress("glBeginConditionalRenderNVX");
		EndConditionalRenderNVX = provider.getFunctionAddress("glEndConditionalRenderNVX");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVXConditionalRender} instance for the current context. */
	public static NVXConditionalRender getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVXConditionalRender);
	}

	static NVXConditionalRender create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NVX_conditional_render") ) return null;

		NVXConditionalRender funcs = new NVXConditionalRender(provider);

		boolean supported = checkFunctions(
			funcs.BeginConditionalRenderNVX, funcs.EndConditionalRenderNVX
		);

		return GL.checkExtension("GL_NVX_conditional_render", funcs, supported);
	}

	// --- [ glBeginConditionalRenderNVX ] ---

	/** JNI method for {@link #glBeginConditionalRenderNVX BeginConditionalRenderNVX} */
	@JavadocExclude
	public static native void nglBeginConditionalRenderNVX(int id, long __functionAddress);

	/**
	 * 
	 *
	 * @param id 
	 */
	public static void glBeginConditionalRenderNVX(int id) {
		long __functionAddress = getInstance().BeginConditionalRenderNVX;
		nglBeginConditionalRenderNVX(id, __functionAddress);
	}

	// --- [ glEndConditionalRenderNVX ] ---

	/** JNI method for {@link #glEndConditionalRenderNVX EndConditionalRenderNVX} */
	@JavadocExclude
	public static native void nglEndConditionalRenderNVX(long __functionAddress);

	/**  */
	public static void glEndConditionalRenderNVX() {
		long __functionAddress = getInstance().EndConditionalRenderNVX;
		nglEndConditionalRenderNVX(__functionAddress);
	}

}