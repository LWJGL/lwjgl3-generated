/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * When the {@code VK_AMD_shader_explicit_vertex_parameter} device extension is enabled  the application <b>can</b> pass a SPIR-V module to
 * {@link VK10#vkCreateShaderModule CreateShaderModule} that uses the {@code SPV_AMD_shader_explicit_vertex_parameter} SPIR-V extension.
 * 
 * <p>When the {@code VK_AMD_shader_explicit_vertex_parameter} device extension is enabled the {@code CustomInterpAMD} interpolation decoration <b>can</b> also be
 * used with fragment shader inputs which indicate that the decorated inputs <b>can</b> only be accessed by the extended instruction
 * {@code InterpolateAtVertexAMD} and allows accessing the value of the inputs for individual vertices of the primitive.</p>
 * 
 * <p>When the {@code VK_AMD_shader_explicit_vertex_parameter} device extension is enabled inputs <b>can</b> be also decorated with the {@code CustomInterpAMD}
 * interpolation decoration, including fragment shader inputs that are signed or unsigned integers, integer vectors, or any double-precision
 * floating-point type. Inputs decorated with {@code CustomInterpAMD} <b>can</b> only be accessed by the extended instruction {@code InterpolateAtVertexAMD} and
 * allows accessing the value of the input for individual vertices of the primitive.</p>
 * 
 * <p>The {@code BaryCoordNoPerspAMD} decoration <b>can</b> be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair of the
 * barycentric coordinates corresponding to the fragment evaluated using linear interpolation at the pixel's center. The K coordinate of the barycentric
 * coordinates <b>can</b> be derived given the identity I + J + K = 1.0.</p>
 * 
 * <p>The {@code BaryCoordNoPerspCentroidAMD} decoration <b>can</b> be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair
 * of the barycentric coordinates corresponding to the fragment evaluated using linear interpolation at the centroid. The K coordinate of the barycentric
 * coordinates <b>can</b> be derived given the identity I + J + K = 1.0.</p>
 * 
 * <p>The {@code BaryCoordNoPerspCentroidAMD} decoration <b>can</b> be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair
 * of the barycentric coordinates corresponding to the fragment evaluated using linear interpolation at each covered sample. The K coordinate of the
 * barycentric coordinates <b>can</b> be derived given the identity I + J + K = 1.0.</p>
 * 
 * <p>The {@code BaryCoordPullModelAMD} decoration <b>can</b> be used to decorate a fragment shader input variable. This variable will contain (1/W, 1/I, 1/J)
 * evaluated at the pixel center and <b>can</b> be used to calculate gradients and then interpolate I, J, and W at any desired sample location.</p>
 * 
 * <p>The {@code BaryCoordSmoothAMD} decoration <b>can</b> be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair of the
 * barycentric coordinates corresponding to the fragment evaluated using perspective interpolation at the pixel's center. The K coordinate of the
 * barycentric coordinates <b>can</b> be derived given the identity I + J + K = 1.0.</p>
 * 
 * <p>The {@code BaryCoordSmoothCentroidAMD} decoration <b>can</b> be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair
 * of the barycentric coordinates corresponding to the fragment evaluated using perspective interpolation at the centroid. The K coordinate of the
 * barycentric coordinates can: be derived given the identity I + J + K = 1.0.</p>
 * 
 * <p>The {@code BaryCoordSmoothCentroidAMD} decoration <b>can</b> be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair
 * of the barycentric coordinates corresponding to the fragment evaluated using perspective interpolation at each covered sample. The K coordinate of the
 * barycentric coordinates can: be derived given the identity I + J + K = 1.0.</p>
 */
public final class AMDShaderExplicitVertexParameter {

	/** The extension specification version. */
	public static final int VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME = "VK_AMD_shader_explicit_vertex_parameter";

	private AMDShaderExplicitVertexParameter() {}

}