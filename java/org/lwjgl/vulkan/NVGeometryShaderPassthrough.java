/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_NV_geometry_shader_passthrough</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>96</dd>
 * <dt><b>Status</b></dt>
 * <dd>Complete</dd>
 * <dt><b>Last Modified Data</b></dt>
 * <dd>2017-02-15</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension is written against version 1.0 of the Vulkan API.</li>
 * <li>This extension requires Vulkan 1.0.</li>
 * <li>This extension requires the <a href="https://www.khronos.org/registry/spir-v/extensions/NV/SPV_NV_geometry_shader_passthrough.html">SPV_NV_geometry_shader_passthrough</a> SPIR-V extension.</li>
 * <li>This extension requires the <a href="https://www.opengl.org/registry/specs/NV/geometry_shader_passthrough.txt">GL_NV_geometry_shader_passthrough</a> extension for GLSL source languages.</li>
 * <li>This extension requires the {@code geometryShader} feature.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Koch (dkoch 'at' nvidia.com)</li>
 * </ul></dd>
 * <dt><b>Overview</b></dt>
 * <dd>This extension adds support for the following SPIR-V extension in Vulkan:
 * 
 * <ul>
 * <li>SPV_NV_geometry_shader_passthrough</li>
 * </ul>
 * 
 * <p>Geometry shaders provide the ability for applications to process each primitive sent through the graphics pipeline using a programmable shader. However, one common use case treats them largely as a "passthrough". In this use case, the bulk of the geometry shader code simply copies inputs from each vertex of the input primitive to corresponding outputs in the vertices of the output primitive. Such shaders might also compute values for additional built-in or user-defined per-primitive attributes (e.g., {@code Layer}) to be assigned to all the vertices of the output primitive.</p>
 * 
 * <p>This extension provides access to the {@code PassthroughNV} decoration under the {@code GeometryShaderPassthroughNV} capability. Adding this to a geometry shader input variable indicates that the values of this input are copied to the corresponding vertex of the output primitive.</p>
 * 
 * <p>When using GLSL source-based shading languages, the {@code passthrough} layout qualifier from GL_NV_geometry_shader_passthrough maps to the {@code PassthroughNV} decoration. To use the {@code passthrough} layout, in GLSL the GL_NV_geometry_shader_passthrough extension must be enabled. Behaviour is described in the GL_NV_geometry_shader_passthrough extension specification.</p></dd>
 * </dl>
 * 
 * <h5>Sample Code</h5>
 * 
 * <p>Consider the following simple geometry shader in unextended GLSL:</p>
 * 
 * <pre><code>layout(triangles) in;
layout(triangle_strip) out;
layout(max_vertices=3) out;

in Inputs {
    vec2 texcoord;
    vec4 baseColor;
} v_in[];
out Outputs {
    vec2 texcoord;
    vec4 baseColor;
};

void main()
{
    int layer = compute_layer();
    for (int i = 0; i < 3; i++) {
        gl_Position = gl_in[i].gl_Position;
        texcoord = v_in[i].texcoord;
        baseColor = v_in[i].baseColor;
        gl_Layer = layer;
        EmitVertex();
    }
}</code></pre>
 * 
 * <p>In this shader, the inputs "gl_Position", "Inputs.texcoord", and "Inputs.baseColor" are simply copied from the input vertex to the corresponding output vertex. The only "interesting" work done by the geometry shader is computing and emitting a gl_Layer value for the primitive.</p>
 * 
 * <p>The following geometry shader, using this extension, is equivalent:</p>
 * 
 * <pre><code>#extension GL_NV_geometry_shader_passthrough : require

layout(triangles) in;
// No output primitive layout qualifiers required.

// Redeclare gl_PerVertex to pass through "gl_Position".
layout(passthrough) in gl_PerVertex {
    vec4 gl_Position;
} gl_in[];

// Declare "Inputs" with "passthrough" to automatically copy members.
layout(passthrough) in Inputs {
    vec2 texcoord;
    vec4 baseColor;
} v_in[];

// No output block declaration required.

void main()
{
    // The shader simply computes and writes gl_Layer.  We don't
    // loop over three vertices or call EmitVertex().
    gl_Layer = compute_layer();
}</code></pre>
 */
public final class NVGeometryShaderPassthrough {

	/** The extension specification version. */
	public static final int VK_NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME = "VK_NV_geometry_shader_passthrough";

	private NVGeometryShaderPassthrough() {}

}