/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows GLSL shaders written to the {@code GL_KHR_vulkan_glsl} extension specification to be used instead of SPIR-V. The implementation
 * will automatically detect which the shader is SPIR-V or GLSL and compile it appropriatly.
 * 
 * <h3>Passing in GLSL code example</h3>
 * 
 * <pre><code>char const vss[] =
    "#version 450 core\n"
    "layout(location = 0) in vec2 aVertex;\n"
    "layout(location = 1) in vec4 aColor;\n"
    "out vec4 vColor;\n"
    "void main()\n"
    "{\n"
    "   vColor = aColor;\n"
    "   gl_Position = vec4(aVertex, 0, 1);\n"
    "}\n"
;
VkShaderModuleCreateInfo vertexShaderInfo = { VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO };
vertexShaderInfo.codeSize = sizeof vss;
vertexShaderInfo.pCode = vss;
VkShaderModule vertexShader;
vkCreateShaderModule(device, &vertexShaderInfo, 0, &vertexShader);</code></pre>
 */
public final class NVGLSLShader {

	/** The extension specification version. */
	public static final int VK_NV_GLSL_SHADER_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_NV_GLSL_SHADER_EXTENSION_NAME = "VK_NV_glsl_shader";

	/** VkResult */
	public static final int VK_ERROR_INVALID_SHADER_NV = -1000012000;

	private NVGLSLShader() {}

}