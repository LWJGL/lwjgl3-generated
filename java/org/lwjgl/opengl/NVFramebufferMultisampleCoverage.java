/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/framebuffer_multisample_coverage.txt">NV_framebuffer_multisample_coverage</a> extension.
 * 
 * <p>This extension extends the EXT_framebuffer_multisample specification by providing a new function, RenderBufferStorageMultisampleCoverageNV, that
 * distinguishes between color samples and coverage samples.</p>
 * 
 * <p>EXT_framebuffer_multisample introduced the function RenderbufferStorageMultisampleEXT as a method of defining the storage parameters for a multisample
 * render buffer. This function takes a <samples> parameter. Using rules provided by the specification, the <samples> parameter is resolved to an actual
 * number of samples that is supported by the underlying hardware. EXT_framebuffer_multisample does not specify whether <samples> refers to coverage
 * samples or color samples.</p>
 * 
 * <p>This extension adds the function RenderbufferStorageMultisamplCoverageNV, which takes a <coverageSamples> parameter as well as a <colorSamples>
 * parameter. These two parameters give developers more fine grained control over the quality of multisampled images.</p>
 * 
 * <p>Requires {@link EXTFramebufferObject EXT_framebuffer_object}, {@link EXTFramebufferBlit EXT_framebuffer_blit} and {@link EXTFramebufferMultisample EXT_framebuffer_multisample}.</p>
 */
public final class NVFramebufferMultisampleCoverage {

	/** Accepted by the {@code pname} parameter of GetRenderbufferParameterivEXT. */
	public static final int
		GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = 0x8CAB,
		GL_RENDERBUFFER_COLOR_SAMPLES_NV    = 0x8E10;

	/** Accepted by the {@code pname} parameter of GetIntegerv. */
	public static final int
		GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = 0x8E11,
		GL_MULTISAMPLE_COVERAGE_MODES_NV     = 0x8E12;

	/** Function address. */
	@JavadocExclude
	public final long RenderbufferStorageMultisampleCoverageNV;

	@JavadocExclude
	public NVFramebufferMultisampleCoverage(FunctionProvider provider) {
		RenderbufferStorageMultisampleCoverageNV = provider.getFunctionAddress("glRenderbufferStorageMultisampleCoverageNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVFramebufferMultisampleCoverage} instance for the current context. */
	public static NVFramebufferMultisampleCoverage getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVFramebufferMultisampleCoverage);
	}

	static NVFramebufferMultisampleCoverage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_framebuffer_multisample_coverage") ) return null;

		NVFramebufferMultisampleCoverage funcs = new NVFramebufferMultisampleCoverage(provider);

		boolean supported = checkFunctions(
			funcs.RenderbufferStorageMultisampleCoverageNV
		);

		return GL.checkExtension("GL_NV_framebuffer_multisample_coverage", funcs, supported);
	}

	// --- [ glRenderbufferStorageMultisampleCoverageNV ] ---

	public static void glRenderbufferStorageMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorageMultisampleCoverageNV;
		callIIIIIIV(__functionAddress, target, coverageSamples, colorSamples, internalformat, width, height);
	}

}