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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/texture_multisample.txt">NV_texture_multisample</a> extension.
 * 
 * <p>This specification extends <a href="http://www.opengl.org/registry/specs/NV/gpu_program4.txt">NV_gpu_program4</a> to support per-sample fetching from multisample textures described in
 * {@link ARBTextureMultisample ARB_texture_multisample}.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}, {@link ARBTextureMultisample ARB_texture_multisample}.</p>
 */
public final class NVTextureMultisample {

	/** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_COVERAGE_SAMPLES_NV = 0x9045,
		GL_TEXTURE_COLOR_SAMPLES_NV    = 0x9046;

	/** Function address. */
	@JavadocExclude
	public final long
		TexImage2DMultisampleCoverageNV,
		TexImage3DMultisampleCoverageNV,
		TextureImage2DMultisampleNV,
		TextureImage3DMultisampleNV,
		TextureImage2DMultisampleCoverageNV,
		TextureImage3DMultisampleCoverageNV;

	@JavadocExclude
	public NVTextureMultisample(FunctionProvider provider) {
		TexImage2DMultisampleCoverageNV = provider.getFunctionAddress("glTexImage2DMultisampleCoverageNV");
		TexImage3DMultisampleCoverageNV = provider.getFunctionAddress("glTexImage3DMultisampleCoverageNV");
		TextureImage2DMultisampleNV = provider.getFunctionAddress("glTextureImage2DMultisampleNV");
		TextureImage3DMultisampleNV = provider.getFunctionAddress("glTextureImage3DMultisampleNV");
		TextureImage2DMultisampleCoverageNV = provider.getFunctionAddress("glTextureImage2DMultisampleCoverageNV");
		TextureImage3DMultisampleCoverageNV = provider.getFunctionAddress("glTextureImage3DMultisampleCoverageNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVTextureMultisample} instance for the current context. */
	public static NVTextureMultisample getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVTextureMultisample);
	}

	static NVTextureMultisample create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_texture_multisample") ) return null;

		NVTextureMultisample funcs = new NVTextureMultisample(provider);

		boolean supported = checkFunctions(
			funcs.TexImage2DMultisampleCoverageNV, funcs.TexImage3DMultisampleCoverageNV, funcs.TextureImage2DMultisampleNV, funcs.TextureImage3DMultisampleNV, 
			funcs.TextureImage2DMultisampleCoverageNV, funcs.TextureImage3DMultisampleCoverageNV
		);

		return GL.checkExtension("GL_NV_texture_multisample", funcs, supported);
	}

	// --- [ glTexImage2DMultisampleCoverageNV ] ---

	public static void glTexImage2DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TexImage2DMultisampleCoverageNV;
		callIIIIIIZV(__functionAddress, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
	}

	// --- [ glTexImage3DMultisampleCoverageNV ] ---

	public static void glTexImage3DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TexImage3DMultisampleCoverageNV;
		callIIIIIIIZV(__functionAddress, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
	}

	// --- [ glTextureImage2DMultisampleNV ] ---

	public static void glTextureImage2DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TextureImage2DMultisampleNV;
		callIIIIIIZV(__functionAddress, texture, target, samples, internalFormat, width, height, fixedSampleLocations);
	}

	// --- [ glTextureImage3DMultisampleNV ] ---

	public static void glTextureImage3DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TextureImage3DMultisampleNV;
		callIIIIIIIZV(__functionAddress, texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations);
	}

	// --- [ glTextureImage2DMultisampleCoverageNV ] ---

	public static void glTextureImage2DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TextureImage2DMultisampleCoverageNV;
		callIIIIIIIZV(__functionAddress, texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
	}

	// --- [ glTextureImage3DMultisampleCoverageNV ] ---

	public static void glTextureImage3DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TextureImage3DMultisampleCoverageNV;
		callIIIIIIIIZV(__functionAddress, texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
	}

}