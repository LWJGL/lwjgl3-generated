/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>VK_NV_viewport_array2</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>97</dd>
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
 * <li>This extension requires the <a href="https://www.khronos.org/registry/spir-v/extensions/NV/SPV_NV_viewport_array2.html">SPV_NV_viewport_array2</a> SPIR-V extension.</li>
 * <li>This extension requires the <a href="https://www.opengl.org/registry/specs/NV/viewport_array2.txt">GL_NV_viewport_array2</a> extension for GLSL source languages.</li>
 * <li>This extension requires the {@code geometryShader} and {@code multiViewport} features.</li>
 * <li>This extension interacts with the {@code tessellationShader} feature.</li>
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
 * <li>SPV_NV_viewport_array2</li>
 * </ul>
 * 
 * <p>which allows a single primitive to be broadcast to multiple viewports and/or multiple layers. A new shader built-in output {@code ViewportMaskNV} is provided, which allows a single primitive to be output to multiple viewports simultaneously. Also, a new SPIR-V decoration is added to control whether the effective viewport index is added into the variable decorated with the <b>Layer</b> built-in decoration. These capabilities allow a single primitive to be output to multiple layers simultaneously.</p>
 * 
 * <p>This extension allows variables decorated with the {@code Layer} and {@code ViewportIndex} built-ins to be exported from vertex or tessellation shaders, using the {@code ShaderViewportIndexLayerNV} capability.</p>
 * 
 * <p>This extension adds a new {@code ViewportMaskNV} built-in decoration that is available for output variables in vertex, tessellation evaluation, and geometry shaders, and a new {@code ViewportRelativeNV} decoration that can be added on variables decorated with {@code Layer} when using the {@code ShaderViewportMaskNV} capability.</p>
 * 
 * <p>When using GLSL source-based shading languages, the {@code gl_ViewportMask}[] built-in output variable and {@code viewport_relative} layout qualifier from {@code GL_NV_viewport_array2} map to the {@code ViewportMaskNV} and {@code ViewportRelativeNV} decorations, respectively. Behaviour is described in the GL_NV_viewport_array2 extension specificiation.</p></dd>
 * </dl>
 */
public final class NVViewportArray2 {

	/** The extension specification version. */
	public static final int VK_NV_VIEWPORT_ARRAY2_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_NV_VIEWPORT_ARRAY2_EXTENSION_NAME = "VK_NV_viewport_array2";

	private NVViewportArray2() {}

}