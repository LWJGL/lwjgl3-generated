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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/occlusion_query_event.txt">AMD_occlusion_query_event</a> extension.
 * 
 * <p>This extension introduces the concept of occlusion query events and changes the concept of an occlusion query from counting passed fragments to counting
 * fragments that generate any of a user-selectable set of events. Provided events include passing the depth test, and passing or failing the stencil test.
 * For a given occlusion query object, counting of these events may be enabled or disabled, allowing any combination to be counted.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}.</p>
 */
public final class AMDOcclusionQueryEvent {

	/**
	 * Accepted by the {@code pname} argument to {@link #glQueryObjectParameteruiAMD QueryObjectParameteruiAMD}, {@link GL15#glGetQueryObjectiv GetQueryObjectiv}, {@link GL15#glGetQueryObjectuiv GetQueryObjectuiv},
	 * {@link GL33#glGetQueryObjecti64v GetQueryObjecti64v}, and {@link GL33#glGetQueryObjectui64v GetQueryObjectui64v}.
	 */
	public static final int GL_OCCLUSION_QUERY_EVENT_MASK_AMD = 0x874F;

	/** Accepted by the {@code param} argument to {@link #glQueryObjectParameteruiAMD QueryObjectParameteruiAMD}. */
	public static final int
		GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD        = 0x1,
		GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD        = 0x2,
		GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD      = 0x4,
		GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD = 0x8,
		GL_QUERY_ALL_EVENT_BITS_AMD              = 0xFFFFFFFF;

	/** Function address. */
	@JavadocExclude
	public final long QueryObjectParameteruiAMD;

	@JavadocExclude
	public AMDOcclusionQueryEvent(FunctionProvider provider) {
		QueryObjectParameteruiAMD = provider.getFunctionAddress("glQueryObjectParameteruiAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDOcclusionQueryEvent} instance for the current context. */
	public static AMDOcclusionQueryEvent getInstance() {
		return checkFunctionality(GL.getCapabilities().__AMDOcclusionQueryEvent);
	}

	static AMDOcclusionQueryEvent create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_occlusion_query_event") ) return null;

		AMDOcclusionQueryEvent funcs = new AMDOcclusionQueryEvent(provider);

		boolean supported = checkFunctions(
			funcs.QueryObjectParameteruiAMD
		);

		return GL.checkExtension("GL_AMD_occlusion_query_event", funcs, supported);
	}

	// --- [ glQueryObjectParameteruiAMD ] ---

	/** JNI method for {@link #glQueryObjectParameteruiAMD QueryObjectParameteruiAMD} */
	@JavadocExclude
	public static native void nglQueryObjectParameteruiAMD(int target, int id, int pname, int param, long __functionAddress);

	/**
	 * Changes the value of a query object parameter.
	 *
	 * @param target a valid query target. One of:<br>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param id     a value returned from a previous call to {@link GL15#glGenQueries GenQueries}
	 * @param pname  the parameter to modify. Must be:<br>{@link #GL_OCCLUSION_QUERY_EVENT_MASK_AMD OCCLUSION_QUERY_EVENT_MASK_AMD}
	 * @param param  the new value. One of:<br>{@link #GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD QUERY_DEPTH_PASS_EVENT_BIT_AMD}, {@link #GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD QUERY_DEPTH_FAIL_EVENT_BIT_AMD}, {@link #GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD QUERY_STENCIL_FAIL_EVENT_BIT_AMD}, {@link #GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD}, {@link #GL_QUERY_ALL_EVENT_BITS_AMD QUERY_ALL_EVENT_BITS_AMD}
	 */
	public static void glQueryObjectParameteruiAMD(int target, int id, int pname, int param) {
		long __functionAddress = getInstance().QueryObjectParameteruiAMD;
		nglQueryObjectParameteruiAMD(target, id, pname, param, __functionAddress);
	}

}