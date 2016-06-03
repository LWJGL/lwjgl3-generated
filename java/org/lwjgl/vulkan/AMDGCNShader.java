/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for the {@code SPV_AMD_gcn_shader} SPIR-V extension in Vulkan.
 * 
 * <p>This extension is written to provide the functionality of the {@code GL_AMD_gcn_shader}, OpenGL Shading Language Specification extension, for SPIR-V.</p>
 * 
 * <p>This extension exposes miscellaneous features of the AMD "Graphics Core Next" shader architecture. This includes cube map query functions and a
 * functionality to query the elapsed shader core time.</p>
 * 
 * <p>This extension adds the following extended instructions:</p>
 * 
 * <h3>CubeFaceCoordAMD</h3>
 * 
 * <p>The function {@code CubeFaceCoordAMD} returns a two-component floating point vector that represents the 2D texture coordinates that would be used for accessing
 * the selected cube map face for the given cube map texture coordinates given as parameter P.</p>
 * 
 * <p>The operand {@code P} must be a pointer to a 3-component 32-bit floating-point vector.</p>
 * 
 * <p>This instruction is only valid in Fragment, Geometry, GLCompute, TessellationControl, TessellationEvaluation and Vertex execution models.</p>
 * 
 * <h3>CubeFaceIndexAMD</h3>
 * 
 * <p>The function {@code CubeFaceIndexAMD} returns a single floating point value that represents the index of the cube map face that would be accessed by
 * texture lookup functions for the cube map texture coordinates given as parameter. The returned value correspond to cube map faces as follows:</p>
 * 
 * <ul>
 * <li>0.0 for the cube map face facing the positive X direction</li>
 * <li>1.0 for the cube map face facing the negative X direction</li>
 * <li>2.0 for the cube map face facing the positive Y direction</li>
 * <li>3.0 for the cube map face facing the negative Y direction</li>
 * <li>4.0 for the cube map face facing the positive Z direction</li>
 * <li>5.0 for the cube map face facing the negative Z direction</li>
 * </ul>
 * 
 * <p>The operand {@code P} must be a 3-component 32-bit floating-point vector.</p>
 * 
 * <p>This instruction is only valid in Fragment, Geometry, GLCompute, TessellationControl, TessellationEvaluation and Vertex execution models.</p>
 * 
 * <h3>TimeAMD</h3>
 * 
 * <p>The {@code TimeAMD} function returns a 64-bit value representing the current execution clock as seen by the shader processor. Time monotonically
 * increments as the processor executes instructions. The returned time will wrap after it exceeds the maximum value representable in 64 bits. The units
 * of time are not defined and need not be constant. Time is not dynamically uniform. That is, shader invocations executing as part of a single draw or
 * dispatch will not necessarily see the same value of time. Time is also not guaranteed to be consistent across shader stages. For example, there is no
 * requirement that time sampled inside a fragment shader invocation will be greater than the time sampled in the vertex that lead to its execution.</p>
 * 
 * <p>This instruction is only valid in Fragment, Geometry, GLCompute, TessellationControl, TessellationEvaluation and Vertex execution models.</p>
 * 
 * <p>Use of this instruction requires declaration of the {@code Int64} capability.</p>
 */
public final class AMDGCNShader {

	/** The extension specification version. */
	public static final int VK_AMD_GCN_SHADER_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_AMD_GCN_SHADER_EXTENSION_NAME = "VK_AMD_gcn_shader";

	private AMDGCNShader() {}

}