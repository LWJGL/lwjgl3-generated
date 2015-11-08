/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/vertex_shader_tessellator.txt">AMD_vertex_shader_tessellator</a> extension.
 * 
 * <p>The vertex shader tessellator gives new flexibility to the shader author to shade at a tessellated vertex, rather than just at a provided vertex.</p>
 * 
 * <p>In unextended vertex shading, the built-in attributes such as gl_Vertex, gl_Normal, and gl_MultiTexcoord0, together with the user defined attributes,
 * are system provided values which are initialized prior to vertex shader invocation.</p>
 * 
 * <p>With vertex shading tessellation, additional vertex shader special values are available:
 * <pre><code style="font-family: monospace">
 *         ivec3 gl_VertexTriangleIndex; // indices of the three control
 *                                       // points for the vertex
 *         vec3 gl_BarycentricCoord;     // barycentric coordinates
 *                                       // of the vertex
 * 
 *     i o
 *       |\
 *       | \
 *       *--*
 *       |\ |\
 *       | \| \
 *       *--*--*
 *       |\ |\ |\
 *       | \| \| \
 *     j o--*--*--o k
 * 
 *     Figure 1  A Tessellated Triangle
 *     o = control point (and tessellated vertex)
 *     * = tessellated vertex
 * 
 *         ivec4 gl_VertexQuadIndex;   // indices for the four control
 *                                     // points for the vertex
 *         vec2 gl_UVCoord;            // UV coordinates of the vertex
 * 
 *     i o--*--*--o k
 *       |\ |\ |\ |
 *       | \| \| \|
 *       *--*--*--*
 *       |\ |\ |\ |
 *       | \| \| \|
 *       *--*--*--*
 *       |\ |\ |\ |
 *       | \| \| \|
 *     j o--*--*--o l
 * 
 *     Figure 2  A Tessellated Quad
 *     o = control point (and tessellated vertex)
 *     * = tessellated vertex</code></pre>
 * When this extension is enabled, conventional built-in attributes and user defined attributes are uninitialized. The shader writer is responsible for
 * explicitly fetching all other vertex data either from textures, uniform buffers, or vertex buffers.</p>
 * 
 * <p>The shader writer is further responsible for interpolating the vertex data at the given barycentric coordinates or uv coordinates of the vertex.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class AMDVertexShaderTessellator {

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_BUFFER_AMD              = 0x9001,
		GL_INT_SAMPLER_BUFFER_AMD          = 0x9002,
		GL_UNSIGNED_INT_SAMPLER_BUFFER_AMD = 0x9003;

	/** Accepted by TessellationModeAMD. */
	public static final int
		GL_DISCRETE_AMD   = 0x9006,
		GL_CONTINUOUS_AMD = 0x9007;

	/** Accepted by GetIntegerv. */
	public static final int GL_TESSELLATION_MODE_AMD = 0x9004;

	/** Accepted by GetFloatv. */
	public static final int GL_TESSELLATION_FACTOR_AMD = 0x9005;

	/** Function address. */
	@JavadocExclude
	public final long
		TessellationFactorAMD,
		TessellationModeAMD;

	@JavadocExclude
	protected AMDVertexShaderTessellator() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public AMDVertexShaderTessellator(FunctionProvider provider) {
		TessellationFactorAMD = provider.getFunctionAddress("glTessellationFactorAMD");
		TessellationModeAMD = provider.getFunctionAddress("glTessellationModeAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDVertexShaderTessellator} instance of the current context. */
	public static AMDVertexShaderTessellator getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link AMDVertexShaderTessellator} instance of the specified {@link GLCapabilities}. */
	public static AMDVertexShaderTessellator getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__AMDVertexShaderTessellator);
	}

	static AMDVertexShaderTessellator create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_vertex_shader_tessellator") ) return null;

		AMDVertexShaderTessellator funcs = new AMDVertexShaderTessellator(provider);

		boolean supported = checkFunctions(
			funcs.TessellationFactorAMD, funcs.TessellationModeAMD
		);

		return GL.checkExtension("GL_AMD_vertex_shader_tessellator", funcs, supported);
	}

	// --- [ glTessellationFactorAMD ] ---

	public static void glTessellationFactorAMD(float factor) {
		long __functionAddress = getInstance().TessellationFactorAMD;
		callFV(__functionAddress, factor);
	}

	// --- [ glTessellationModeAMD ] ---

	public static void glTessellationModeAMD(int mode) {
		long __functionAddress = getInstance().TessellationModeAMD;
		callIV(__functionAddress, mode);
	}

}