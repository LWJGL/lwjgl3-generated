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

	/** JNI method for {@link #glTexImage2DMultisampleCoverageNV TexImage2DMultisampleCoverageNV} */
	@JavadocExclude
	public static native void nglTexImage2DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations, long __functionAddress);

	/**
	 * 
	 *
	 * @param target               
	 * @param coverageSamples      
	 * @param colorSamples         
	 * @param internalFormat       
	 * @param width                
	 * @param height               
	 * @param fixedSampleLocations 
	 */
	public static void glTexImage2DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TexImage2DMultisampleCoverageNV;
		nglTexImage2DMultisampleCoverageNV(target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations, __functionAddress);
	}

	// --- [ glTexImage3DMultisampleCoverageNV ] ---

	/** JNI method for {@link #glTexImage3DMultisampleCoverageNV TexImage3DMultisampleCoverageNV} */
	@JavadocExclude
	public static native void nglTexImage3DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, long __functionAddress);

	/**
	 * 
	 *
	 * @param target               
	 * @param coverageSamples      
	 * @param colorSamples         
	 * @param internalFormat       
	 * @param width                
	 * @param height               
	 * @param depth                
	 * @param fixedSampleLocations 
	 */
	public static void glTexImage3DMultisampleCoverageNV(int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TexImage3DMultisampleCoverageNV;
		nglTexImage3DMultisampleCoverageNV(target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations, __functionAddress);
	}

	// --- [ glTextureImage2DMultisampleNV ] ---

	/** JNI method for {@link #glTextureImage2DMultisampleNV TextureImage2DMultisampleNV} */
	@JavadocExclude
	public static native void nglTextureImage2DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture              
	 * @param target               
	 * @param samples              
	 * @param internalFormat       
	 * @param width                
	 * @param height               
	 * @param fixedSampleLocations 
	 */
	public static void glTextureImage2DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TextureImage2DMultisampleNV;
		nglTextureImage2DMultisampleNV(texture, target, samples, internalFormat, width, height, fixedSampleLocations, __functionAddress);
	}

	// --- [ glTextureImage3DMultisampleNV ] ---

	/** JNI method for {@link #glTextureImage3DMultisampleNV TextureImage3DMultisampleNV} */
	@JavadocExclude
	public static native void nglTextureImage3DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture              
	 * @param target               
	 * @param samples              
	 * @param internalFormat       
	 * @param width                
	 * @param height               
	 * @param depth                
	 * @param fixedSampleLocations 
	 */
	public static void glTextureImage3DMultisampleNV(int texture, int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TextureImage3DMultisampleNV;
		nglTextureImage3DMultisampleNV(texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations, __functionAddress);
	}

	// --- [ glTextureImage2DMultisampleCoverageNV ] ---

	/** JNI method for {@link #glTextureImage2DMultisampleCoverageNV TextureImage2DMultisampleCoverageNV} */
	@JavadocExclude
	public static native void nglTextureImage2DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture              
	 * @param target               
	 * @param coverageSamples      
	 * @param colorSamples         
	 * @param internalFormat       
	 * @param width                
	 * @param height               
	 * @param fixedSampleLocations 
	 */
	public static void glTextureImage2DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TextureImage2DMultisampleCoverageNV;
		nglTextureImage2DMultisampleCoverageNV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations, __functionAddress);
	}

	// --- [ glTextureImage3DMultisampleCoverageNV ] ---

	/** JNI method for {@link #glTextureImage3DMultisampleCoverageNV TextureImage3DMultisampleCoverageNV} */
	@JavadocExclude
	public static native void nglTextureImage3DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, long __functionAddress);

	/**
	 * 
	 *
	 * @param texture              
	 * @param target               
	 * @param coverageSamples      
	 * @param colorSamples         
	 * @param internalFormat       
	 * @param width                
	 * @param height               
	 * @param depth                
	 * @param fixedSampleLocations 
	 */
	public static void glTextureImage3DMultisampleCoverageNV(int texture, int target, int coverageSamples, int colorSamples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
		long __functionAddress = getInstance().TextureImage3DMultisampleCoverageNV;
		nglTextureImage3DMultisampleCoverageNV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations, __functionAddress);
	}

}