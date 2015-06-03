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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/sample_locations.txt">NV_sample_locations</a> extension.
 * 
 * <p>This extension allows an application to modify the locations of samples within a pixel used in multisample rasterization. Additionally, it allows
 * applications to specify different sample locations for each pixel in a group of adjacent pixels, which may increase antialiasing quality (particularly
 * if a custom resolve shader is used that takes advantage of these different locations).</p>
 * 
 * <p>It is common for implementations to optimize the storage of depth values by storing values that can be used to reconstruct depth at each sample
 * location, rather than storing separate depth values for each sample. For example, the depth values from a single triangle can be represented using
 * plane equations. When the depth value for a sample is needed, it is automatically evaluated at the sample location. Modifying the sample locations
 * causes the reconstruction to no longer evaluate the same depth values as when the samples were originally generated. This extension provides a command
 * to "resolve" and store per-sample depth values using the currently programmed sample locations, which allows the application to manage this issue
 * if/when necessary.</p>
 * 
 * <p>The programmable sample locations are used during rasterization and for evaluation of depth functions during normal geometric rendering. The
 * programmable locations are associated with a framebuffer object rather than an individual depth buffer, so if the depth buffer is used as a texture the
 * texture sampling may be done at the standard sample locations. Additionally, commands that do not render geometric primitives (e.g. ReadPixels,
 * BlitFramebuffer, CopyTexSubImage2D, etc.) may use the standard sample locations to resolve depth functions rather than the programmable locations. If a
 * single depth buffer is used at different times with different sample locations, the depth functions may be interpreted using the current sample
 * locations.</p>
 */
public final class NVSampleLocations {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV           = 0x933D,
		GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV        = 0x933E,
		GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV       = 0x933F,
		GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV = 0x9340;

	/** Accepted by the {@code pname} parameter of GetMultisamplefv. */
	public static final int
		GL_SAMPLE_LOCATION_NV              = 0x8E50,
		GL_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9341;

	/** Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv. */
	public static final int
		GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV = 0x9342,
		GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV    = 0x9343;

	/** Function address. */
	@JavadocExclude
	public final long
		FramebufferSampleLocationsfvNV,
		NamedFramebufferSampleLocationsfvNV,
		ResolveDepthValuesNV;

	@JavadocExclude
	public NVSampleLocations(FunctionProvider provider) {
		FramebufferSampleLocationsfvNV = provider.getFunctionAddress("glFramebufferSampleLocationsfvNV");
		NamedFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glNamedFramebufferSampleLocationsfvNV");
		ResolveDepthValuesNV = provider.getFunctionAddress("glResolveDepthValuesNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVSampleLocations} instance for the current context. */
	public static NVSampleLocations getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVSampleLocations);
	}

	static NVSampleLocations create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_sample_locations") ) return null;

		NVSampleLocations funcs = new NVSampleLocations(provider);

		boolean supported = checkFunctions(
			funcs.FramebufferSampleLocationsfvNV, funcs.NamedFramebufferSampleLocationsfvNV, funcs.ResolveDepthValuesNV
		);

		return GL.checkExtension("GL_NV_sample_locations", funcs, supported);
	}

	// --- [ glFramebufferSampleLocationsfvNV ] ---

	/** JNI method for {@link #glFramebufferSampleLocationsfvNV FramebufferSampleLocationsfvNV} */
	@JavadocExclude
	public static native void nglFramebufferSampleLocationsfvNV(int target, int start, int count, long v, long __functionAddress);

	/** Unsafe version of {@link #glFramebufferSampleLocationsfvNV FramebufferSampleLocationsfvNV} */
	@JavadocExclude
	public static void nglFramebufferSampleLocationsfvNV(int target, int start, int count, long v) {
		long __functionAddress = getInstance().FramebufferSampleLocationsfvNV;
		nglFramebufferSampleLocationsfvNV(target, start, count, v, __functionAddress);
	}

	/**
	 * Updates the programmable sample locations
	 *
	 * @param target the framebuffer whose programmable sample locations are modified
	 * @param start  the index of the first sample location to modify
	 * @param count  the number of sample locations to modify
	 * @param v      a pair of floating point values in the range [0,1] for each sample location
	 */
	public static void glFramebufferSampleLocationsfvNV(int target, int start, int count, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (count << 1) << 2);
		nglFramebufferSampleLocationsfvNV(target, start, count, memAddress(v));
	}

	/** Alternative version of: {@link #glFramebufferSampleLocationsfvNV FramebufferSampleLocationsfvNV} */
	public static void glFramebufferSampleLocationsfvNV(int target, int start, FloatBuffer v) {
		nglFramebufferSampleLocationsfvNV(target, start, v.remaining() >> 1, memAddress(v));
	}

	// --- [ glNamedFramebufferSampleLocationsfvNV ] ---

	/** JNI method for {@link #glNamedFramebufferSampleLocationsfvNV NamedFramebufferSampleLocationsfvNV} */
	@JavadocExclude
	public static native void nglNamedFramebufferSampleLocationsfvNV(int framebuffer, int start, int count, long v, long __functionAddress);

	/** Unsafe version of {@link #glNamedFramebufferSampleLocationsfvNV NamedFramebufferSampleLocationsfvNV} */
	@JavadocExclude
	public static void nglNamedFramebufferSampleLocationsfvNV(int framebuffer, int start, int count, long v) {
		long __functionAddress = getInstance().NamedFramebufferSampleLocationsfvNV;
		nglNamedFramebufferSampleLocationsfvNV(framebuffer, start, count, v, __functionAddress);
	}

	/**
	 * Updates the programmable sample locations
	 *
	 * @param framebuffer the framebuffer whose programmable sample locations are modified
	 * @param start       the index of the first sample location to modify
	 * @param count       the number of sample locations to modify
	 * @param v           a pair of floating point values in the range [0,1] for each sample location
	 */
	public static void glNamedFramebufferSampleLocationsfvNV(int framebuffer, int start, int count, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, (count << 1) << 2);
		nglNamedFramebufferSampleLocationsfvNV(framebuffer, start, count, memAddress(v));
	}

	/** Alternative version of: {@link #glNamedFramebufferSampleLocationsfvNV NamedFramebufferSampleLocationsfvNV} */
	public static void glNamedFramebufferSampleLocationsfvNV(int framebuffer, int start, FloatBuffer v) {
		nglNamedFramebufferSampleLocationsfvNV(framebuffer, start, v.remaining() >> 1, memAddress(v));
	}

	// --- [ glResolveDepthValuesNV ] ---

	/** JNI method for {@link #glResolveDepthValuesNV ResolveDepthValuesNV} */
	@JavadocExclude
	public static native void nglResolveDepthValuesNV(long __functionAddress);

	/**
	 * Evaluates depth values for all samples in the current depth buffer (subject to the pixel ownership and scissor tests) and stores each value in the
	 * depth buffer. This can be used to ensure that later accesses will use depth values consistent with the sample locations used when the samples were
	 * generated. If the current framebuffer has no depth buffer, ResolveDepthValuesNV will have no effect.
	 */
	public static void glResolveDepthValuesNV() {
		long __functionAddress = getInstance().ResolveDepthValuesNV;
		nglResolveDepthValuesNV(__functionAddress);
	}

}