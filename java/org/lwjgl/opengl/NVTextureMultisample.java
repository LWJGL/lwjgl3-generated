/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/texture_multisample.txt">NV_texture_multisample</a> extension.
 * 
 * <p>This specification extends <a href="http://www.opengl.org/registry/specs/NV/gpu_program4.txt">NV_gpu_program4</a> to support per-sample fetching from multisample textures described in
 * {@link ARBTextureMultisample ARB_texture_multisample}.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}, {@link ARBTextureMultisample ARB_texture_multisample}.</p>
 */
public class NVTextureMultisample {

	/** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_COVERAGE_SAMPLES_NV = 0x9045,
		GL_TEXTURE_COLOR_SAMPLES_NV    = 0x9046;

	static { GL.initialize(); }

	protected NVTextureMultisample() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glTexImage2DMultisampleCoverageNV, caps.glTexImage3DMultisampleCoverageNV, caps.glTextureImage2DMultisampleNV, 
			caps.glTextureImage3DMultisampleNV, caps.glTextureImage2DMultisampleCoverageNV, caps.glTextureImage3DMultisampleCoverageNV
		);
	}

	// --- [ glTexImage2DMultisampleCoverageNV ] ---

	public static native void nglTexImage2DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations);

	public static void glTexImage2DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		nglTexImage2DMultisampleCoverageNV(target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
	}

	// --- [ glTexImage3DMultisampleCoverageNV ] ---

	public static native void nglTexImage3DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations);

	public static void glTexImage3DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		nglTexImage3DMultisampleCoverageNV(target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
	}

	// --- [ glTextureImage2DMultisampleNV ] ---

	public static native void nglTextureImage2DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations);

	public static void glTextureImage2DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		nglTextureImage2DMultisampleNV(texture, target, samples, internalFormat, width, height, fixedSampleLocations);
	}

	// --- [ glTextureImage3DMultisampleNV ] ---

	public static native void nglTextureImage3DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations);

	public static void glTextureImage3DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		nglTextureImage3DMultisampleNV(texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations);
	}

	// --- [ glTextureImage2DMultisampleCoverageNV ] ---

	public static native void nglTextureImage2DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations);

	public static void glTextureImage2DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		nglTextureImage2DMultisampleCoverageNV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
	}

	// --- [ glTextureImage3DMultisampleCoverageNV ] ---

	public static native void nglTextureImage3DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations);

	public static void glTextureImage3DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		nglTextureImage3DMultisampleCoverageNV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
	}

}