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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/internalformat_sample_query.txt">NV_internalformat_sample_query</a> extension.
 * 
 * <p>Some OpenGL implementations support modes of multisampling which have
 * properties which are non-obvious to applications and/or which may not be
 * standards conformant. The idea of non-conformant AA modes is not new,
 * and is exposed in both GLX and EGL with config caveats and the
 * GLX_NON_CONFORMANT_CONFIG for GLX and EGL_NON_CONFORMANT_CONFIG for EGL,
 * or by querying the EGL_CONFORMANT attribute in newer versions of EGL.</p>
 * 
 * <p>Both of these mechanisms operate on a per-config basis, which works as
 * intended for window-based configs. However, with the advent of
 * application-created FBOs, it is now possible to do all the multisample
 * operations in an application-created FBO and never use a multisample
 * window.</p>
 * 
 * <p>This extension further extends the internalformat query mechanism
 * (first introduced by ARB_internalformat_query and extended in
 * ARB_internalformat_query2) and introduces a mechanism for a
 * implementation to report properties of formats that may also be
 * dependent on the number of samples.  This includes information
 * such as whether the combination of format and samples should be
 * considered conformant. This enables an implementation to report
 * caveats which might apply to both window and FBO-based rendering
 * configurations.</p>
 * 
 * <p>Requires {@link GL42 OpenGL 4.2} or {@link ARBInternalformatQuery ARB_internalformat_query}.</p>
 */
public final class NVInternalformatSampleQuery {

	/** Accepted by the {@code pname} parameter of GetInternalformatSampleivNV */
	public static final int
		GL_MULTISAMPLES_NV        = 0x9371,
		GL_SUPERSAMPLE_SCALE_X_NV = 0x9372,
		GL_SUPERSAMPLE_SCALE_Y_NV = 0x9373,
		GL_CONFORMANT_NV          = 0x9374;

	/** Function address. */
	@JavadocExclude
	public final long GetInternalformatSampleivNV;

	@JavadocExclude
	public NVInternalformatSampleQuery(FunctionProvider provider) {
		GetInternalformatSampleivNV = provider.getFunctionAddress("glGetInternalformatSampleivNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVInternalformatSampleQuery} instance for the current context. */
	public static NVInternalformatSampleQuery getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVInternalformatSampleQuery);
	}

	static NVInternalformatSampleQuery create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_internalformat_sample_query") ) return null;

		NVInternalformatSampleQuery funcs = new NVInternalformatSampleQuery(provider);

		boolean supported = checkFunctions(
			funcs.GetInternalformatSampleivNV
		);

		return GL.checkExtension("GL_NV_internalformat_sample_query", funcs, supported);
	}

	// --- [ glGetInternalformatSampleivNV ] ---

	/** JNI method for {@link #glGetInternalformatSampleivNV GetInternalformatSampleivNV} */
	@JavadocExclude
	public static native void nglGetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetInternalformatSampleivNV GetInternalformatSampleivNV} */
	@JavadocExclude
	public static void nglGetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int bufSize, long params) {
		long __functionAddress = getInstance().GetInternalformatSampleivNV;
		nglGetInternalformatSampleivNV(target, internalformat, samples, pname, bufSize, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target         
	 * @param internalformat 
	 * @param samples        
	 * @param pname          
	 * @param bufSize        
	 * @param params         
	 */
	public static void glGetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int bufSize, ByteBuffer params) {
		nglGetInternalformatSampleivNV(target, internalformat, samples, pname, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetInternalformatSampleivNV GetInternalformatSampleivNV} */
	public static void glGetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int bufSize, IntBuffer params) {
		nglGetInternalformatSampleivNV(target, internalformat, samples, pname, bufSize, memAddress(params));
	}

}