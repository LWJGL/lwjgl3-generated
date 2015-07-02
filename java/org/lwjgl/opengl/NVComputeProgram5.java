/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/compute_program5.txt">NV_compute_program5</a> extension.
 * 
 * <p>This extension builds on the ARB_compute_shader extension to provide new assembly compute program capability for OpenGL.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0}, <a href="http://www.opengl.org/registry/specs/NV/gpu_program4.txt">NV_gpu_program4</a>, <a href="http://www.opengl.org/registry/specs/NV/gpu_program5.txt">NV_gpu_program5</a>, {@link ARBComputeShader ARB_compute_shader}.</p>
 */
public final class NVComputeProgram5 {

	/**
	 * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, by the {@code pname} parameter of GetBooleanv,
	 * GetIntegerv, GetFloatv, and GetDoublev, and by the {@code target} parameter of ProgramStringARB, BindProgramARB,
	 * ProgramEnvParameter4[df][v]ARB, ProgramLocalParameter4[df][v]ARB, GetProgramEnvParameter[df]vARB, GetProgramLocalParameter[df]vARB,
	 * GetProgramivARB and GetProgramStringARB.
	 */
	public static final int GL_COMPUTE_PROGRAM_NV = 0x90FB;

	/**
	 * Accepted by the {@code target} parameter of ProgramBufferParametersfvNV, ProgramBufferParametersIivNV, and ProgramBufferParametersIuivNV,
	 * BindBufferRangeNV, BindBufferOffsetNV, BindBufferBaseNV, and BindBuffer and the {@code value} parameter of GetIntegerIndexedvEXT.
	 */
	public static final int GL_COMPUTE_PROGRAM_PARAMETER_BUFFER_NV = 0x90FC;

	private NVComputeProgram5() {}

}