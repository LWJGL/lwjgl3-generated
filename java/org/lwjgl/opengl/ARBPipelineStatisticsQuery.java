/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/pipeline_statistics_query.txt">ARB_pipeline_statistics_query</a> extension.
 * <p/>
 * This extension introduces new query types that allow applications to get statistics information about different parts of the pipeline:
 * <ul>
 * <li>Number of vertices and primitives issued to the GL.</li>
 * <li>Number of times a vertex shader, tessellation evaluation shader, geometry shader, fragment shader, and compute shader was invoked.</li>
 * <li>Number of patches processed by the tessellation control shader stage.</li>
 * <li>Number of primitives emitted by a geometry shader.</li>
 * <li>Number of primitives that entered the primitive clipping stage.</li>
 * <li>Number of primitives that are output by the primitive clipping stage.</li>
 * </ul>
 * Requires {@link GL30 OpenGL 3.0}.
 */
public final class ARBPipelineStatisticsQuery {

	/**
	 * Accepted by the {@code target} parameter of {@link GL15#glBeginQuery BeginQuery}, {@link GL15#glEndQuery EndQuery}, {@link GL15#glGetQueryi GetQueryi},
	 * {@link GL40#glBeginQueryIndexed BeginQueryIndexed}, {@link GL40#glEndQueryIndexed EndQueryIndexed} and {@link GL40#glGetQueryIndexedi GetQueryIndexedi}.
	 */
	public static final int
		GL_VERTICES_SUBMITTED_ARB                 = 0x82EE,
		GL_PRIMITIVES_SUBMITTED_ARB               = 0x82EF,
		GL_VERTEX_SHADER_INVOCATIONS_ARB          = 0x82F0,
		GL_TESS_CONTROL_SHADER_PATCHES_ARB        = 0x82F1,
		GL_TESS_EVALUATION_SHADER_INVOCATIONS_ARB = 0x82F2,
		GL_GEOMETRY_SHADER_INVOCATIONS            = 0x887F,
		GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED_ARB = 0x82F3,
		GL_FRAGMENT_SHADER_INVOCATIONS_ARB        = 0x82F4,
		GL_COMPUTE_SHADER_INVOCATIONS_ARB         = 0x82F5,
		GL_CLIPPING_INPUT_PRIMITIVES_ARB          = 0x82F6,
		GL_CLIPPING_OUTPUT_PRIMITIVES_ARB         = 0x82F7;

	private ARBPipelineStatisticsQuery() {}

}