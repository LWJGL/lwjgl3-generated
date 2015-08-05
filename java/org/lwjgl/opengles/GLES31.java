/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** The core OpenGL ES 3.1 functionality. */
public final class GLES31 {

	/**  */
	public static final int
		GL_COMPUTE_SHADER                             = 0x91B9,
		GL_MAX_COMPUTE_UNIFORM_BLOCKS                 = 0x91BB,
		GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS            = 0x91BC,
		GL_MAX_COMPUTE_IMAGE_UNIFORMS                 = 0x91BD,
		GL_MAX_COMPUTE_SHARED_MEMORY_SIZE             = 0x8262,
		GL_MAX_COMPUTE_UNIFORM_COMPONENTS             = 0x8263,
		GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS         = 0x8264,
		GL_MAX_COMPUTE_ATOMIC_COUNTERS                = 0x8265,
		GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS    = 0x8266,
		GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS         = 0x90EB,
		GL_MAX_COMPUTE_WORK_GROUP_COUNT               = 0x91BE,
		GL_MAX_COMPUTE_WORK_GROUP_SIZE                = 0x91BF,
		GL_COMPUTE_WORK_GROUP_SIZE                    = 0x8267,
		GL_DISPATCH_INDIRECT_BUFFER                   = 0x90EE,
		GL_DISPATCH_INDIRECT_BUFFER_BINDING           = 0x90EF,
		GL_COMPUTE_SHADER_BIT                         = 0x20,
		GL_DRAW_INDIRECT_BUFFER                       = 0x8F3F,
		GL_DRAW_INDIRECT_BUFFER_BINDING               = 0x8F43,
		GL_MAX_UNIFORM_LOCATIONS                      = 0x826E,
		GL_FRAMEBUFFER_DEFAULT_WIDTH                  = 0x9310,
		GL_FRAMEBUFFER_DEFAULT_HEIGHT                 = 0x9311,
		GL_FRAMEBUFFER_DEFAULT_SAMPLES                = 0x9313,
		GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314,
		GL_MAX_FRAMEBUFFER_WIDTH                      = 0x9315,
		GL_MAX_FRAMEBUFFER_HEIGHT                     = 0x9316,
		GL_MAX_FRAMEBUFFER_SAMPLES                    = 0x9318,
		GL_UNIFORM                                    = 0x92E1,
		GL_UNIFORM_BLOCK                              = 0x92E2,
		GL_PROGRAM_INPUT                              = 0x92E3,
		GL_PROGRAM_OUTPUT                             = 0x92E4,
		GL_BUFFER_VARIABLE                            = 0x92E5,
		GL_SHADER_STORAGE_BLOCK                       = 0x92E6,
		GL_ATOMIC_COUNTER_BUFFER                      = 0x92C0,
		GL_TRANSFORM_FEEDBACK_VARYING                 = 0x92F4,
		GL_ACTIVE_RESOURCES                           = 0x92F5,
		GL_MAX_NAME_LENGTH                            = 0x92F6,
		GL_MAX_NUM_ACTIVE_VARIABLES                   = 0x92F7,
		GL_NAME_LENGTH                                = 0x92F9,
		GL_TYPE                                       = 0x92FA,
		GL_ARRAY_SIZE                                 = 0x92FB,
		GL_OFFSET                                     = 0x92FC,
		GL_BLOCK_INDEX                                = 0x92FD,
		GL_ARRAY_STRIDE                               = 0x92FE,
		GL_MATRIX_STRIDE                              = 0x92FF,
		GL_IS_ROW_MAJOR                               = 0x9300,
		GL_ATOMIC_COUNTER_BUFFER_INDEX                = 0x9301,
		GL_BUFFER_BINDING                             = 0x9302,
		GL_BUFFER_DATA_SIZE                           = 0x9303,
		GL_NUM_ACTIVE_VARIABLES                       = 0x9304,
		GL_ACTIVE_VARIABLES                           = 0x9305,
		GL_REFERENCED_BY_VERTEX_SHADER                = 0x9306,
		GL_REFERENCED_BY_FRAGMENT_SHADER              = 0x930A,
		GL_REFERENCED_BY_COMPUTE_SHADER               = 0x930B,
		GL_TOP_LEVEL_ARRAY_SIZE                       = 0x930C,
		GL_TOP_LEVEL_ARRAY_STRIDE                     = 0x930D,
		GL_LOCATION                                   = 0x930E,
		GL_VERTEX_SHADER_BIT                          = 0x1,
		GL_FRAGMENT_SHADER_BIT                        = 0x2,
		GL_ALL_SHADER_BITS                            = 0xFFFFFFFF,
		GL_PROGRAM_SEPARABLE                          = 0x8258,
		GL_ACTIVE_PROGRAM                             = 0x8259,
		GL_PROGRAM_PIPELINE_BINDING                   = 0x825A,
		GL_ATOMIC_COUNTER_BUFFER_BINDING              = 0x92C1,
		GL_ATOMIC_COUNTER_BUFFER_START                = 0x92C2,
		GL_ATOMIC_COUNTER_BUFFER_SIZE                 = 0x92C3,
		GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS          = 0x92CC,
		GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS        = 0x92D0,
		GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS        = 0x92D1,
		GL_MAX_VERTEX_ATOMIC_COUNTERS                 = 0x92D2,
		GL_MAX_FRAGMENT_ATOMIC_COUNTERS               = 0x92D6,
		GL_MAX_COMBINED_ATOMIC_COUNTERS               = 0x92D7,
		GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE             = 0x92D8,
		GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS         = 0x92DC,
		GL_ACTIVE_ATOMIC_COUNTER_BUFFERS              = 0x92D9,
		GL_UNSIGNED_INT_ATOMIC_COUNTER                = 0x92DB,
		GL_MAX_IMAGE_UNITS                            = 0x8F38,
		GL_MAX_VERTEX_IMAGE_UNIFORMS                  = 0x90CA,
		GL_MAX_FRAGMENT_IMAGE_UNIFORMS                = 0x90CE,
		GL_MAX_COMBINED_IMAGE_UNIFORMS                = 0x90CF,
		GL_IMAGE_BINDING_NAME                         = 0x8F3A,
		GL_IMAGE_BINDING_LEVEL                        = 0x8F3B,
		GL_IMAGE_BINDING_LAYERED                      = 0x8F3C,
		GL_IMAGE_BINDING_LAYER                        = 0x8F3D,
		GL_IMAGE_BINDING_ACCESS                       = 0x8F3E,
		GL_IMAGE_BINDING_FORMAT                       = 0x906E,
		GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT            = 0x1,
		GL_ELEMENT_ARRAY_BARRIER_BIT                  = 0x2,
		GL_UNIFORM_BARRIER_BIT                        = 0x4,
		GL_TEXTURE_FETCH_BARRIER_BIT                  = 0x8,
		GL_SHADER_IMAGE_ACCESS_BARRIER_BIT            = 0x20,
		GL_COMMAND_BARRIER_BIT                        = 0x40,
		GL_PIXEL_BUFFER_BARRIER_BIT                   = 0x80,
		GL_TEXTURE_UPDATE_BARRIER_BIT                 = 0x100,
		GL_BUFFER_UPDATE_BARRIER_BIT                  = 0x200,
		GL_FRAMEBUFFER_BARRIER_BIT                    = 0x400,
		GL_TRANSFORM_FEEDBACK_BARRIER_BIT             = 0x800,
		GL_ATOMIC_COUNTER_BARRIER_BIT                 = 0x1000,
		GL_ALL_BARRIER_BITS                           = 0xFFFFFFFF,
		GL_IMAGE_2D                                   = 0x904D,
		GL_IMAGE_3D                                   = 0x904E,
		GL_IMAGE_CUBE                                 = 0x9050,
		GL_IMAGE_2D_ARRAY                             = 0x9053,
		GL_INT_IMAGE_2D                               = 0x9058,
		GL_INT_IMAGE_3D                               = 0x9059,
		GL_INT_IMAGE_CUBE                             = 0x905B,
		GL_INT_IMAGE_2D_ARRAY                         = 0x905E,
		GL_UNSIGNED_INT_IMAGE_2D                      = 0x9063,
		GL_UNSIGNED_INT_IMAGE_3D                      = 0x9064,
		GL_UNSIGNED_INT_IMAGE_CUBE                    = 0x9066,
		GL_UNSIGNED_INT_IMAGE_2D_ARRAY                = 0x9069,
		GL_IMAGE_FORMAT_COMPATIBILITY_TYPE            = 0x90C7,
		GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE         = 0x90C8,
		GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS        = 0x90C9,
		GL_READ_ONLY                                  = 0x88B8,
		GL_WRITE_ONLY                                 = 0x88B9,
		GL_READ_WRITE                                 = 0x88BA,
		GL_SHADER_STORAGE_BUFFER                      = 0x90D2,
		GL_SHADER_STORAGE_BUFFER_BINDING              = 0x90D3,
		GL_SHADER_STORAGE_BUFFER_START                = 0x90D4,
		GL_SHADER_STORAGE_BUFFER_SIZE                 = 0x90D5,
		GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS           = 0x90D6,
		GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS         = 0x90DA,
		GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS          = 0x90DB,
		GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS         = 0x90DC,
		GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS         = 0x90DD,
		GL_MAX_SHADER_STORAGE_BLOCK_SIZE              = 0x90DE,
		GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT     = 0x90DF,
		GL_SHADER_STORAGE_BARRIER_BIT                 = 0x2000,
		GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES       = 0x8F39,
		GL_DEPTH_STENCIL_TEXTURE_MODE                 = 0x90EA,
		GL_STENCIL_INDEX                              = 0x1901,
		GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET          = 0x8E5E,
		GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET          = 0x8E5F,
		GL_SAMPLE_POSITION                            = 0x8E50,
		GL_SAMPLE_MASK                                = 0x8E51,
		GL_SAMPLE_MASK_VALUE                          = 0x8E52,
		GL_TEXTURE_2D_MULTISAMPLE                     = 0x9100,
		GL_MAX_SAMPLE_MASK_WORDS                      = 0x8E59,
		GL_MAX_COLOR_TEXTURE_SAMPLES                  = 0x910E,
		GL_MAX_DEPTH_TEXTURE_SAMPLES                  = 0x910F,
		GL_MAX_INTEGER_SAMPLES                        = 0x9110,
		GL_TEXTURE_BINDING_2D_MULTISAMPLE             = 0x9104,
		GL_TEXTURE_SAMPLES                            = 0x9106,
		GL_TEXTURE_FIXED_SAMPLE_LOCATIONS             = 0x9107,
		GL_TEXTURE_WIDTH                              = 0x1000,
		GL_TEXTURE_HEIGHT                             = 0x1001,
		GL_TEXTURE_DEPTH                              = 0x8071,
		GL_TEXTURE_INTERNAL_FORMAT                    = 0x1003,
		GL_TEXTURE_RED_SIZE                           = 0x805C,
		GL_TEXTURE_GREEN_SIZE                         = 0x805D,
		GL_TEXTURE_BLUE_SIZE                          = 0x805E,
		GL_TEXTURE_ALPHA_SIZE                         = 0x805F,
		GL_TEXTURE_DEPTH_SIZE                         = 0x884A,
		GL_TEXTURE_STENCIL_SIZE                       = 0x88F1,
		GL_TEXTURE_SHARED_SIZE                        = 0x8C3F,
		GL_TEXTURE_RED_TYPE                           = 0x8C10,
		GL_TEXTURE_GREEN_TYPE                         = 0x8C11,
		GL_TEXTURE_BLUE_TYPE                          = 0x8C12,
		GL_TEXTURE_ALPHA_TYPE                         = 0x8C13,
		GL_TEXTURE_DEPTH_TYPE                         = 0x8C16,
		GL_TEXTURE_COMPRESSED                         = 0x86A1,
		GL_SAMPLER_2D_MULTISAMPLE                     = 0x9108,
		GL_INT_SAMPLER_2D_MULTISAMPLE                 = 0x9109,
		GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE        = 0x910A,
		GL_VERTEX_ATTRIB_BINDING                      = 0x82D4,
		GL_VERTEX_ATTRIB_RELATIVE_OFFSET              = 0x82D5,
		GL_VERTEX_BINDING_DIVISOR                     = 0x82D6,
		GL_VERTEX_BINDING_OFFSET                      = 0x82D7,
		GL_VERTEX_BINDING_STRIDE                      = 0x82D8,
		GL_VERTEX_BINDING_BUFFER                      = 0x8F4F,
		GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET          = 0x82D9,
		GL_MAX_VERTEX_ATTRIB_BINDINGS                 = 0x82DA,
		GL_MAX_VERTEX_ATTRIB_STRIDE                   = 0x82E5;

	/** Function address. */
	@JavadocExclude
	public final long
		DispatchCompute,
		DispatchComputeIndirect,
		DrawArraysIndirect,
		DrawElementsIndirect,
		FramebufferParameteri,
		GetFramebufferParameteriv,
		GetProgramInterfaceiv,
		GetProgramResourceIndex,
		GetProgramResourceName,
		GetProgramResourceiv,
		GetProgramResourceLocation,
		UseProgramStages,
		ActiveShaderProgram,
		CreateShaderProgramv,
		BindProgramPipeline,
		DeleteProgramPipelines,
		GenProgramPipelines,
		IsProgramPipeline,
		GetProgramPipelineiv,
		ProgramUniform1i,
		ProgramUniform2i,
		ProgramUniform3i,
		ProgramUniform4i,
		ProgramUniform1ui,
		ProgramUniform2ui,
		ProgramUniform3ui,
		ProgramUniform4ui,
		ProgramUniform1f,
		ProgramUniform2f,
		ProgramUniform3f,
		ProgramUniform4f,
		ProgramUniform1iv,
		ProgramUniform2iv,
		ProgramUniform3iv,
		ProgramUniform4iv,
		ProgramUniform1uiv,
		ProgramUniform2uiv,
		ProgramUniform3uiv,
		ProgramUniform4uiv,
		ProgramUniform1fv,
		ProgramUniform2fv,
		ProgramUniform3fv,
		ProgramUniform4fv,
		ProgramUniformMatrix2fv,
		ProgramUniformMatrix3fv,
		ProgramUniformMatrix4fv,
		ProgramUniformMatrix2x3fv,
		ProgramUniformMatrix3x2fv,
		ProgramUniformMatrix2x4fv,
		ProgramUniformMatrix4x2fv,
		ProgramUniformMatrix3x4fv,
		ProgramUniformMatrix4x3fv,
		ValidateProgramPipeline,
		GetProgramPipelineInfoLog,
		BindImageTexture,
		GetBooleani_v,
		MemoryBarrier,
		MemoryBarrierByRegion,
		TexStorage2DMultisample,
		GetMultisamplefv,
		SampleMaski,
		GetTexLevelParameteriv,
		GetTexLevelParameterfv,
		BindVertexBuffer,
		VertexAttribFormat,
		VertexAttribIFormat,
		VertexAttribBinding,
		VertexBindingDivisor;

	@JavadocExclude
	public GLES31(FunctionProvider provider) {
		DispatchCompute = provider.getFunctionAddress("glDispatchCompute");
		DispatchComputeIndirect = provider.getFunctionAddress("glDispatchComputeIndirect");
		DrawArraysIndirect = provider.getFunctionAddress("glDrawArraysIndirect");
		DrawElementsIndirect = provider.getFunctionAddress("glDrawElementsIndirect");
		FramebufferParameteri = provider.getFunctionAddress("glFramebufferParameteri");
		GetFramebufferParameteriv = provider.getFunctionAddress("glGetFramebufferParameteriv");
		GetProgramInterfaceiv = provider.getFunctionAddress("glGetProgramInterfaceiv");
		GetProgramResourceIndex = provider.getFunctionAddress("glGetProgramResourceIndex");
		GetProgramResourceName = provider.getFunctionAddress("glGetProgramResourceName");
		GetProgramResourceiv = provider.getFunctionAddress("glGetProgramResourceiv");
		GetProgramResourceLocation = provider.getFunctionAddress("glGetProgramResourceLocation");
		UseProgramStages = provider.getFunctionAddress("glUseProgramStages");
		ActiveShaderProgram = provider.getFunctionAddress("glActiveShaderProgram");
		CreateShaderProgramv = provider.getFunctionAddress("glCreateShaderProgramv");
		BindProgramPipeline = provider.getFunctionAddress("glBindProgramPipeline");
		DeleteProgramPipelines = provider.getFunctionAddress("glDeleteProgramPipelines");
		GenProgramPipelines = provider.getFunctionAddress("glGenProgramPipelines");
		IsProgramPipeline = provider.getFunctionAddress("glIsProgramPipeline");
		GetProgramPipelineiv = provider.getFunctionAddress("glGetProgramPipelineiv");
		ProgramUniform1i = provider.getFunctionAddress("glProgramUniform1i");
		ProgramUniform2i = provider.getFunctionAddress("glProgramUniform2i");
		ProgramUniform3i = provider.getFunctionAddress("glProgramUniform3i");
		ProgramUniform4i = provider.getFunctionAddress("glProgramUniform4i");
		ProgramUniform1ui = provider.getFunctionAddress("glProgramUniform1ui");
		ProgramUniform2ui = provider.getFunctionAddress("glProgramUniform2ui");
		ProgramUniform3ui = provider.getFunctionAddress("glProgramUniform3ui");
		ProgramUniform4ui = provider.getFunctionAddress("glProgramUniform4ui");
		ProgramUniform1f = provider.getFunctionAddress("glProgramUniform1f");
		ProgramUniform2f = provider.getFunctionAddress("glProgramUniform2f");
		ProgramUniform3f = provider.getFunctionAddress("glProgramUniform3f");
		ProgramUniform4f = provider.getFunctionAddress("glProgramUniform4f");
		ProgramUniform1iv = provider.getFunctionAddress("glProgramUniform1iv");
		ProgramUniform2iv = provider.getFunctionAddress("glProgramUniform2iv");
		ProgramUniform3iv = provider.getFunctionAddress("glProgramUniform3iv");
		ProgramUniform4iv = provider.getFunctionAddress("glProgramUniform4iv");
		ProgramUniform1uiv = provider.getFunctionAddress("glProgramUniform1uiv");
		ProgramUniform2uiv = provider.getFunctionAddress("glProgramUniform2uiv");
		ProgramUniform3uiv = provider.getFunctionAddress("glProgramUniform3uiv");
		ProgramUniform4uiv = provider.getFunctionAddress("glProgramUniform4uiv");
		ProgramUniform1fv = provider.getFunctionAddress("glProgramUniform1fv");
		ProgramUniform2fv = provider.getFunctionAddress("glProgramUniform2fv");
		ProgramUniform3fv = provider.getFunctionAddress("glProgramUniform3fv");
		ProgramUniform4fv = provider.getFunctionAddress("glProgramUniform4fv");
		ProgramUniformMatrix2fv = provider.getFunctionAddress("glProgramUniformMatrix2fv");
		ProgramUniformMatrix3fv = provider.getFunctionAddress("glProgramUniformMatrix3fv");
		ProgramUniformMatrix4fv = provider.getFunctionAddress("glProgramUniformMatrix4fv");
		ProgramUniformMatrix2x3fv = provider.getFunctionAddress("glProgramUniformMatrix2x3fv");
		ProgramUniformMatrix3x2fv = provider.getFunctionAddress("glProgramUniformMatrix3x2fv");
		ProgramUniformMatrix2x4fv = provider.getFunctionAddress("glProgramUniformMatrix2x4fv");
		ProgramUniformMatrix4x2fv = provider.getFunctionAddress("glProgramUniformMatrix4x2fv");
		ProgramUniformMatrix3x4fv = provider.getFunctionAddress("glProgramUniformMatrix3x4fv");
		ProgramUniformMatrix4x3fv = provider.getFunctionAddress("glProgramUniformMatrix4x3fv");
		ValidateProgramPipeline = provider.getFunctionAddress("glValidateProgramPipeline");
		GetProgramPipelineInfoLog = provider.getFunctionAddress("glGetProgramPipelineInfoLog");
		BindImageTexture = provider.getFunctionAddress("glBindImageTexture");
		GetBooleani_v = provider.getFunctionAddress("glGetBooleani_v");
		MemoryBarrier = provider.getFunctionAddress("glMemoryBarrier");
		MemoryBarrierByRegion = provider.getFunctionAddress("glMemoryBarrierByRegion");
		TexStorage2DMultisample = provider.getFunctionAddress("glTexStorage2DMultisample");
		GetMultisamplefv = provider.getFunctionAddress("glGetMultisamplefv");
		SampleMaski = provider.getFunctionAddress("glSampleMaski");
		GetTexLevelParameteriv = provider.getFunctionAddress("glGetTexLevelParameteriv");
		GetTexLevelParameterfv = provider.getFunctionAddress("glGetTexLevelParameterfv");
		BindVertexBuffer = provider.getFunctionAddress("glBindVertexBuffer");
		VertexAttribFormat = provider.getFunctionAddress("glVertexAttribFormat");
		VertexAttribIFormat = provider.getFunctionAddress("glVertexAttribIFormat");
		VertexAttribBinding = provider.getFunctionAddress("glVertexAttribBinding");
		VertexBindingDivisor = provider.getFunctionAddress("glVertexBindingDivisor");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLES31} instance for the current context. */
	public static GLES31 getInstance() {
		return checkFunctionality(GLES.getCapabilities().__GLES31);
	}

	static GLES31 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLES31") ) return null;

		GLES31 funcs = new GLES31(provider);
		boolean supported = checkFunctions(
			funcs.DispatchCompute, funcs.DispatchComputeIndirect, funcs.DrawArraysIndirect, funcs.DrawElementsIndirect, funcs.FramebufferParameteri, 
			funcs.GetFramebufferParameteriv, funcs.GetProgramInterfaceiv, funcs.GetProgramResourceIndex, funcs.GetProgramResourceName, 
			funcs.GetProgramResourceiv, funcs.GetProgramResourceLocation, funcs.UseProgramStages, funcs.ActiveShaderProgram, funcs.CreateShaderProgramv, 
			funcs.BindProgramPipeline, funcs.DeleteProgramPipelines, funcs.GenProgramPipelines, funcs.IsProgramPipeline, funcs.GetProgramPipelineiv, 
			funcs.ProgramUniform1i, funcs.ProgramUniform2i, funcs.ProgramUniform3i, funcs.ProgramUniform4i, funcs.ProgramUniform1ui, funcs.ProgramUniform2ui, 
			funcs.ProgramUniform3ui, funcs.ProgramUniform4ui, funcs.ProgramUniform1f, funcs.ProgramUniform2f, funcs.ProgramUniform3f, funcs.ProgramUniform4f, 
			funcs.ProgramUniform1iv, funcs.ProgramUniform2iv, funcs.ProgramUniform3iv, funcs.ProgramUniform4iv, funcs.ProgramUniform1uiv, 
			funcs.ProgramUniform2uiv, funcs.ProgramUniform3uiv, funcs.ProgramUniform4uiv, funcs.ProgramUniform1fv, funcs.ProgramUniform2fv, 
			funcs.ProgramUniform3fv, funcs.ProgramUniform4fv, funcs.ProgramUniformMatrix2fv, funcs.ProgramUniformMatrix3fv, funcs.ProgramUniformMatrix4fv, 
			funcs.ProgramUniformMatrix2x3fv, funcs.ProgramUniformMatrix3x2fv, funcs.ProgramUniformMatrix2x4fv, funcs.ProgramUniformMatrix4x2fv, 
			funcs.ProgramUniformMatrix3x4fv, funcs.ProgramUniformMatrix4x3fv, funcs.ValidateProgramPipeline, funcs.GetProgramPipelineInfoLog, 
			funcs.BindImageTexture, funcs.GetBooleani_v, funcs.MemoryBarrier, funcs.MemoryBarrierByRegion, funcs.TexStorage2DMultisample, 
			funcs.GetMultisamplefv, funcs.SampleMaski, funcs.GetTexLevelParameteriv, funcs.GetTexLevelParameterfv, funcs.BindVertexBuffer, 
			funcs.VertexAttribFormat, funcs.VertexAttribIFormat, funcs.VertexAttribBinding, funcs.VertexBindingDivisor
		);

		return GLES.checkExtension("GLES31", funcs, supported);
	}

	// --- [ glDispatchCompute ] ---

	/** JNI method for {@link #glDispatchCompute DispatchCompute} */
	@JavadocExclude
	public static native void nglDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z, long __functionAddress);

	public static void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
		long __functionAddress = getInstance().DispatchCompute;
		nglDispatchCompute(num_groups_x, num_groups_y, num_groups_z, __functionAddress);
	}

	// --- [ glDispatchComputeIndirect ] ---

	/** JNI method for {@link #glDispatchComputeIndirect DispatchComputeIndirect} */
	@JavadocExclude
	public static native void nglDispatchComputeIndirect(long indirect, long __functionAddress);

	public static void glDispatchComputeIndirect(long indirect) {
		long __functionAddress = getInstance().DispatchComputeIndirect;
		nglDispatchComputeIndirect(indirect, __functionAddress);
	}

	// --- [ glDrawArraysIndirect ] ---

	/** JNI method for {@link #glDrawArraysIndirect DrawArraysIndirect} */
	@JavadocExclude
	public static native void nglDrawArraysIndirect(int mode, long indirect, long __functionAddress);

	/** Unsafe version of {@link #glDrawArraysIndirect DrawArraysIndirect} */
	@JavadocExclude
	public static void nglDrawArraysIndirect(int mode, long indirect) {
		long __functionAddress = getInstance().DrawArraysIndirect;
		nglDrawArraysIndirect(mode, indirect, __functionAddress);
	}

	public static void glDrawArraysIndirect(int mode, ByteBuffer indirect) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, 4 * 4);
		nglDrawArraysIndirect(mode, memAddress(indirect));
	}

	/** Buffer object offset version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
	public static void glDrawArraysIndirect(int mode, long indirectOffset) {
		nglDrawArraysIndirect(mode, indirectOffset);
	}

	/** IntBuffer version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
	public static void glDrawArraysIndirect(int mode, IntBuffer indirect) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, (4 * 4) >> 2);
		nglDrawArraysIndirect(mode, memAddress(indirect));
	}

	// --- [ glDrawElementsIndirect ] ---

	/** JNI method for {@link #glDrawElementsIndirect DrawElementsIndirect} */
	@JavadocExclude
	public static native void nglDrawElementsIndirect(int mode, int type, long indirect, long __functionAddress);

	/** Unsafe version of {@link #glDrawElementsIndirect DrawElementsIndirect} */
	@JavadocExclude
	public static void nglDrawElementsIndirect(int mode, int type, long indirect) {
		long __functionAddress = getInstance().DrawElementsIndirect;
		nglDrawElementsIndirect(mode, type, indirect, __functionAddress);
	}

	public static void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, 5 * 4);
		nglDrawElementsIndirect(mode, type, memAddress(indirect));
	}

	/** Buffer object offset version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
	public static void glDrawElementsIndirect(int mode, int type, long indirectOffset) {
		nglDrawElementsIndirect(mode, type, indirectOffset);
	}

	/** IntBuffer version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
	public static void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(indirect, (5 * 4) >> 2);
		nglDrawElementsIndirect(mode, type, memAddress(indirect));
	}

	// --- [ glFramebufferParameteri ] ---

	/** JNI method for {@link #glFramebufferParameteri FramebufferParameteri} */
	@JavadocExclude
	public static native void nglFramebufferParameteri(int target, int pname, int param, long __functionAddress);

	public static void glFramebufferParameteri(int target, int pname, int param) {
		long __functionAddress = getInstance().FramebufferParameteri;
		nglFramebufferParameteri(target, pname, param, __functionAddress);
	}

	// --- [ glGetFramebufferParameteriv ] ---

	/** JNI method for {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	@JavadocExclude
	public static native void nglGetFramebufferParameteriv(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	@JavadocExclude
	public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetFramebufferParameteriv;
		nglGetFramebufferParameteriv(target, pname, params, __functionAddress);
	}

	public static void glGetFramebufferParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	public static void glGetFramebufferParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	public static int glGetFramebufferParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetFramebufferParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramInterfaceiv ] ---

	/** JNI method for {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	@JavadocExclude
	public static native void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	@JavadocExclude
	public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
		long __functionAddress = getInstance().GetProgramInterfaceiv;
		nglGetProgramInterfaceiv(program, programInterface, pname, params, __functionAddress);
	}

	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	public static int glGetProgramInterfacei(int program, int programInterface, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramInterfaceiv(program, programInterface, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetProgramResourceIndex ] ---

	/** JNI method for {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	@JavadocExclude
	public static native int nglGetProgramResourceIndex(int program, int programInterface, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	@JavadocExclude
	public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceIndex;
		return nglGetProgramResourceIndex(program, programInterface, name, __functionAddress);
	}

	public static int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
	public static int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetProgramResourceIndex(program, programInterface, __buffer.address(nameEncoded));
	}

	// --- [ glGetProgramResourceName ] ---

	/** JNI method for {@link #glGetProgramResourceName GetProgramResourceName} */
	@JavadocExclude
	public static native void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceName GetProgramResourceName} */
	@JavadocExclude
	public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
		long __functionAddress = getInstance().GetProgramResourceName;
		nglGetProgramResourceName(program, programInterface, index, bufSize, length, name, __functionAddress);
	}

	public static void glGetProgramResourceName(int program, int programInterface, int index, int bufSize, ByteBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramResourceName(program, programInterface, index, bufSize, memAddressSafe(length), memAddress(name));
	}

	/** Alternative version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static void glGetProgramResourceName(int program, int programInterface, int index, IntBuffer length, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceName(program, programInterface, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	/** String return version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetProgramResourceName(program, programInterface, index, bufSize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static String glGetProgramResourceName(int program, int programInterface, int index) {
		int bufSize = glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetProgramResourceName(program, programInterface, index, bufSize, __buffer.address(length), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glGetProgramResourceiv ] ---

	/** JNI method for {@link #glGetProgramResourceiv GetProgramResourceiv} */
	@JavadocExclude
	public static native void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceiv GetProgramResourceiv} */
	@JavadocExclude
	public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
		long __functionAddress = getInstance().GetProgramResourceiv;
		nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params, __functionAddress);
	}

	public static void glGetProgramResourceiv(int program, int programInterface, int index, int propCount, ByteBuffer props, int bufSize, ByteBuffer length, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(props, propCount << 2);
			checkBuffer(params, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramResourceiv(program, programInterface, index, propCount, memAddress(props), bufSize, memAddressSafe(length), memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
	public static void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
	}

	/** Buffer return version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
	public static IntBuffer glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int params = __buffer.bufferParam(bufSize << 2);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), bufSize, __buffer.address(length), __buffer.address(params));
		return memIntBuffer(__buffer.address(params), __buffer.intValue(length));
	}

	// --- [ glGetProgramResourceLocation ] ---

	/** JNI method for {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	@JavadocExclude
	public static native int nglGetProgramResourceLocation(int program, int programInterface, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	@JavadocExclude
	public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceLocation;
		return nglGetProgramResourceLocation(program, programInterface, name, __functionAddress);
	}

	public static int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocation(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
	public static int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetProgramResourceLocation(program, programInterface, __buffer.address(nameEncoded));
	}

	// --- [ glUseProgramStages ] ---

	/** JNI method for {@link #glUseProgramStages UseProgramStages} */
	@JavadocExclude
	public static native void nglUseProgramStages(int pipeline, int stages, int program, long __functionAddress);

	public static void glUseProgramStages(int pipeline, int stages, int program) {
		long __functionAddress = getInstance().UseProgramStages;
		nglUseProgramStages(pipeline, stages, program, __functionAddress);
	}

	// --- [ glActiveShaderProgram ] ---

	/** JNI method for {@link #glActiveShaderProgram ActiveShaderProgram} */
	@JavadocExclude
	public static native void nglActiveShaderProgram(int pipeline, int program, long __functionAddress);

	public static void glActiveShaderProgram(int pipeline, int program) {
		long __functionAddress = getInstance().ActiveShaderProgram;
		nglActiveShaderProgram(pipeline, program, __functionAddress);
	}

	// --- [ glCreateShaderProgramv ] ---

	/** JNI method for {@link #glCreateShaderProgramv CreateShaderProgramv} */
	@JavadocExclude
	public static native int nglCreateShaderProgramv(int type, int count, long strings, long __functionAddress);

	/** Unsafe version of {@link #glCreateShaderProgramv CreateShaderProgramv} */
	@JavadocExclude
	public static int nglCreateShaderProgramv(int type, int count, long strings) {
		long __functionAddress = getInstance().CreateShaderProgramv;
		return nglCreateShaderProgramv(type, count, strings, __functionAddress);
	}

	public static int glCreateShaderProgramv(int type, int count, ByteBuffer strings) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(strings, count << POINTER_SHIFT);
		return nglCreateShaderProgramv(type, count, memAddress(strings));
	}

	/** Alternative version of: {@link #glCreateShaderProgramv CreateShaderProgramv} */
	public static int glCreateShaderProgramv(int type, PointerBuffer strings) {
		return nglCreateShaderProgramv(type, strings.remaining(), memAddress(strings));
	}

	/** Array version of: {@link #glCreateShaderProgramv CreateShaderProgramv} */
	public static int glCreateShaderProgramv(int type, CharSequence... strings) {
		APIBuffer __buffer = apiBuffer();
		int stringsAddress = __buffer.bufferParam(strings.length << POINTER_SHIFT);
		ByteBuffer[] stringsBuffers = new ByteBuffer[strings.length];
		for ( int i = 0; i < strings.length; i++ )
			__buffer.pointerParam(stringsAddress, i, memAddress(stringsBuffers[i] = memEncodeUTF8(strings[i], true)));
		return nglCreateShaderProgramv(type, strings.length, __buffer.address(stringsAddress));
	}

	/** Single string version of: {@link #glCreateShaderProgramv CreateShaderProgramv} */
	public static int glCreateShaderProgramv(int type, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		ByteBuffer stringBuffers = memEncodeUTF8(string, true);
		int stringsAddress = __buffer.pointerParam(memAddress(stringBuffers));
		return nglCreateShaderProgramv(type, 1, __buffer.address(stringsAddress));
	}

	// --- [ glBindProgramPipeline ] ---

	/** JNI method for {@link #glBindProgramPipeline BindProgramPipeline} */
	@JavadocExclude
	public static native void nglBindProgramPipeline(int pipeline, long __functionAddress);

	public static void glBindProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().BindProgramPipeline;
		nglBindProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glDeleteProgramPipelines ] ---

	/** JNI method for {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	@JavadocExclude
	public static native void nglDeleteProgramPipelines(int n, long pipelines, long __functionAddress);

	/** Unsafe version of {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	@JavadocExclude
	public static void nglDeleteProgramPipelines(int n, long pipelines) {
		long __functionAddress = getInstance().DeleteProgramPipelines;
		nglDeleteProgramPipelines(n, pipelines, __functionAddress);
	}

	public static void glDeleteProgramPipelines(int n, ByteBuffer pipelines) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pipelines, n << 2);
		nglDeleteProgramPipelines(n, memAddress(pipelines));
	}

	/** Alternative version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	public static void glDeleteProgramPipelines(IntBuffer pipelines) {
		nglDeleteProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/** Single value version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	public static void glDeleteProgramPipelines(int pipeline) {
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam(pipeline);
		nglDeleteProgramPipelines(1, __buffer.address(pipelines));
	}

	// --- [ glGenProgramPipelines ] ---

	/** JNI method for {@link #glGenProgramPipelines GenProgramPipelines} */
	@JavadocExclude
	public static native void nglGenProgramPipelines(int n, long pipelines, long __functionAddress);

	/** Unsafe version of {@link #glGenProgramPipelines GenProgramPipelines} */
	@JavadocExclude
	public static void nglGenProgramPipelines(int n, long pipelines) {
		long __functionAddress = getInstance().GenProgramPipelines;
		nglGenProgramPipelines(n, pipelines, __functionAddress);
	}

	public static void glGenProgramPipelines(int n, ByteBuffer pipelines) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pipelines, n << 2);
		nglGenProgramPipelines(n, memAddress(pipelines));
	}

	/** Alternative version of: {@link #glGenProgramPipelines GenProgramPipelines} */
	public static void glGenProgramPipelines(IntBuffer pipelines) {
		nglGenProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/** Single return value version of: {@link #glGenProgramPipelines GenProgramPipelines} */
	public static int glGenProgramPipelines() {
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam();
		nglGenProgramPipelines(1, __buffer.address(pipelines));
		return __buffer.intValue(pipelines);
	}

	// --- [ glIsProgramPipeline ] ---

	/** JNI method for {@link #glIsProgramPipeline IsProgramPipeline} */
	@JavadocExclude
	public static native boolean nglIsProgramPipeline(int pipeline, long __functionAddress);

	public static boolean glIsProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().IsProgramPipeline;
		return nglIsProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glGetProgramPipelineiv ] ---

	/** JNI method for {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	@JavadocExclude
	public static native void nglGetProgramPipelineiv(int pipeline, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	@JavadocExclude
	public static void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
		long __functionAddress = getInstance().GetProgramPipelineiv;
		nglGetProgramPipelineiv(pipeline, pname, params, __functionAddress);
	}

	public static void glGetProgramPipelineiv(int pipeline, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	public static void glGetProgramPipelineiv(int pipeline, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	public static int glGetProgramPipelinei(int pipeline, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetProgramPipelineiv(pipeline, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glProgramUniform1i ] ---

	/** JNI method for {@link #glProgramUniform1i ProgramUniform1i} */
	@JavadocExclude
	public static native void nglProgramUniform1i(int program, int location, int v0, long __functionAddress);

	public static void glProgramUniform1i(int program, int location, int v0) {
		long __functionAddress = getInstance().ProgramUniform1i;
		nglProgramUniform1i(program, location, v0, __functionAddress);
	}

	// --- [ glProgramUniform2i ] ---

	/** JNI method for {@link #glProgramUniform2i ProgramUniform2i} */
	@JavadocExclude
	public static native void nglProgramUniform2i(int program, int location, int v0, int v1, long __functionAddress);

	public static void glProgramUniform2i(int program, int location, int v0, int v1) {
		long __functionAddress = getInstance().ProgramUniform2i;
		nglProgramUniform2i(program, location, v0, v1, __functionAddress);
	}

	// --- [ glProgramUniform3i ] ---

	/** JNI method for {@link #glProgramUniform3i ProgramUniform3i} */
	@JavadocExclude
	public static native void nglProgramUniform3i(int program, int location, int v0, int v1, int v2, long __functionAddress);

	public static void glProgramUniform3i(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().ProgramUniform3i;
		nglProgramUniform3i(program, location, v0, v1, v2, __functionAddress);
	}

	// --- [ glProgramUniform4i ] ---

	/** JNI method for {@link #glProgramUniform4i ProgramUniform4i} */
	@JavadocExclude
	public static native void nglProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3, long __functionAddress);

	public static void glProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().ProgramUniform4i;
		nglProgramUniform4i(program, location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glProgramUniform1ui ] ---

	/** JNI method for {@link #glProgramUniform1ui ProgramUniform1ui} */
	@JavadocExclude
	public static native void nglProgramUniform1ui(int program, int location, int v0, long __functionAddress);

	public static void glProgramUniform1ui(int program, int location, int v0) {
		long __functionAddress = getInstance().ProgramUniform1ui;
		nglProgramUniform1ui(program, location, v0, __functionAddress);
	}

	// --- [ glProgramUniform2ui ] ---

	/** JNI method for {@link #glProgramUniform2ui ProgramUniform2ui} */
	@JavadocExclude
	public static native void nglProgramUniform2ui(int program, int location, int v0, int v1, long __functionAddress);

	public static void glProgramUniform2ui(int program, int location, int v0, int v1) {
		long __functionAddress = getInstance().ProgramUniform2ui;
		nglProgramUniform2ui(program, location, v0, v1, __functionAddress);
	}

	// --- [ glProgramUniform3ui ] ---

	/** JNI method for {@link #glProgramUniform3ui ProgramUniform3ui} */
	@JavadocExclude
	public static native void nglProgramUniform3ui(int program, int location, int v0, int v1, int v2, long __functionAddress);

	public static void glProgramUniform3ui(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().ProgramUniform3ui;
		nglProgramUniform3ui(program, location, v0, v1, v2, __functionAddress);
	}

	// --- [ glProgramUniform4ui ] ---

	/** JNI method for {@link #glProgramUniform4ui ProgramUniform4ui} */
	@JavadocExclude
	public static native void nglProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3, long __functionAddress);

	public static void glProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().ProgramUniform4ui;
		nglProgramUniform4ui(program, location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glProgramUniform1f ] ---

	/** JNI method for {@link #glProgramUniform1f ProgramUniform1f} */
	@JavadocExclude
	public static native void nglProgramUniform1f(int program, int location, float v0, long __functionAddress);

	public static void glProgramUniform1f(int program, int location, float v0) {
		long __functionAddress = getInstance().ProgramUniform1f;
		nglProgramUniform1f(program, location, v0, __functionAddress);
	}

	// --- [ glProgramUniform2f ] ---

	/** JNI method for {@link #glProgramUniform2f ProgramUniform2f} */
	@JavadocExclude
	public static native void nglProgramUniform2f(int program, int location, float v0, float v1, long __functionAddress);

	public static void glProgramUniform2f(int program, int location, float v0, float v1) {
		long __functionAddress = getInstance().ProgramUniform2f;
		nglProgramUniform2f(program, location, v0, v1, __functionAddress);
	}

	// --- [ glProgramUniform3f ] ---

	/** JNI method for {@link #glProgramUniform3f ProgramUniform3f} */
	@JavadocExclude
	public static native void nglProgramUniform3f(int program, int location, float v0, float v1, float v2, long __functionAddress);

	public static void glProgramUniform3f(int program, int location, float v0, float v1, float v2) {
		long __functionAddress = getInstance().ProgramUniform3f;
		nglProgramUniform3f(program, location, v0, v1, v2, __functionAddress);
	}

	// --- [ glProgramUniform4f ] ---

	/** JNI method for {@link #glProgramUniform4f ProgramUniform4f} */
	@JavadocExclude
	public static native void nglProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3, long __functionAddress);

	public static void glProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().ProgramUniform4f;
		nglProgramUniform4f(program, location, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glProgramUniform1iv ] ---

	/** JNI method for {@link #glProgramUniform1iv ProgramUniform1iv} */
	@JavadocExclude
	public static native void nglProgramUniform1iv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform1iv ProgramUniform1iv} */
	@JavadocExclude
	public static void nglProgramUniform1iv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1iv;
		nglProgramUniform1iv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform1iv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1iv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1iv ProgramUniform1iv} */
	public static void glProgramUniform1iv(int program, int location, IntBuffer value) {
		nglProgramUniform1iv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2iv ] ---

	/** JNI method for {@link #glProgramUniform2iv ProgramUniform2iv} */
	@JavadocExclude
	public static native void nglProgramUniform2iv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform2iv ProgramUniform2iv} */
	@JavadocExclude
	public static void nglProgramUniform2iv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2iv;
		nglProgramUniform2iv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform2iv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2iv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2iv ProgramUniform2iv} */
	public static void glProgramUniform2iv(int program, int location, IntBuffer value) {
		nglProgramUniform2iv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3iv ] ---

	/** JNI method for {@link #glProgramUniform3iv ProgramUniform3iv} */
	@JavadocExclude
	public static native void nglProgramUniform3iv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform3iv ProgramUniform3iv} */
	@JavadocExclude
	public static void nglProgramUniform3iv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3iv;
		nglProgramUniform3iv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform3iv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3iv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3iv ProgramUniform3iv} */
	public static void glProgramUniform3iv(int program, int location, IntBuffer value) {
		nglProgramUniform3iv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4iv ] ---

	/** JNI method for {@link #glProgramUniform4iv ProgramUniform4iv} */
	@JavadocExclude
	public static native void nglProgramUniform4iv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform4iv ProgramUniform4iv} */
	@JavadocExclude
	public static void nglProgramUniform4iv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4iv;
		nglProgramUniform4iv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform4iv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4iv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4iv ProgramUniform4iv} */
	public static void glProgramUniform4iv(int program, int location, IntBuffer value) {
		nglProgramUniform4iv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1uiv ] ---

	/** JNI method for {@link #glProgramUniform1uiv ProgramUniform1uiv} */
	@JavadocExclude
	public static native void nglProgramUniform1uiv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform1uiv ProgramUniform1uiv} */
	@JavadocExclude
	public static void nglProgramUniform1uiv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1uiv;
		nglProgramUniform1uiv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform1uiv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1uiv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1uiv ProgramUniform1uiv} */
	public static void glProgramUniform1uiv(int program, int location, IntBuffer value) {
		nglProgramUniform1uiv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2uiv ] ---

	/** JNI method for {@link #glProgramUniform2uiv ProgramUniform2uiv} */
	@JavadocExclude
	public static native void nglProgramUniform2uiv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform2uiv ProgramUniform2uiv} */
	@JavadocExclude
	public static void nglProgramUniform2uiv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2uiv;
		nglProgramUniform2uiv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform2uiv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2uiv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2uiv ProgramUniform2uiv} */
	public static void glProgramUniform2uiv(int program, int location, IntBuffer value) {
		nglProgramUniform2uiv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3uiv ] ---

	/** JNI method for {@link #glProgramUniform3uiv ProgramUniform3uiv} */
	@JavadocExclude
	public static native void nglProgramUniform3uiv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform3uiv ProgramUniform3uiv} */
	@JavadocExclude
	public static void nglProgramUniform3uiv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3uiv;
		nglProgramUniform3uiv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform3uiv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3uiv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3uiv ProgramUniform3uiv} */
	public static void glProgramUniform3uiv(int program, int location, IntBuffer value) {
		nglProgramUniform3uiv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4uiv ] ---

	/** JNI method for {@link #glProgramUniform4uiv ProgramUniform4uiv} */
	@JavadocExclude
	public static native void nglProgramUniform4uiv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform4uiv ProgramUniform4uiv} */
	@JavadocExclude
	public static void nglProgramUniform4uiv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4uiv;
		nglProgramUniform4uiv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform4uiv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4uiv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4uiv ProgramUniform4uiv} */
	public static void glProgramUniform4uiv(int program, int location, IntBuffer value) {
		nglProgramUniform4uiv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1fv ] ---

	/** JNI method for {@link #glProgramUniform1fv ProgramUniform1fv} */
	@JavadocExclude
	public static native void nglProgramUniform1fv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform1fv ProgramUniform1fv} */
	@JavadocExclude
	public static void nglProgramUniform1fv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform1fv;
		nglProgramUniform1fv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform1fv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglProgramUniform1fv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform1fv ProgramUniform1fv} */
	public static void glProgramUniform1fv(int program, int location, FloatBuffer value) {
		nglProgramUniform1fv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2fv ] ---

	/** JNI method for {@link #glProgramUniform2fv ProgramUniform2fv} */
	@JavadocExclude
	public static native void nglProgramUniform2fv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform2fv ProgramUniform2fv} */
	@JavadocExclude
	public static void nglProgramUniform2fv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform2fv;
		nglProgramUniform2fv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform2fv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglProgramUniform2fv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform2fv ProgramUniform2fv} */
	public static void glProgramUniform2fv(int program, int location, FloatBuffer value) {
		nglProgramUniform2fv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3fv ] ---

	/** JNI method for {@link #glProgramUniform3fv ProgramUniform3fv} */
	@JavadocExclude
	public static native void nglProgramUniform3fv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform3fv ProgramUniform3fv} */
	@JavadocExclude
	public static void nglProgramUniform3fv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform3fv;
		nglProgramUniform3fv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform3fv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglProgramUniform3fv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform3fv ProgramUniform3fv} */
	public static void glProgramUniform3fv(int program, int location, FloatBuffer value) {
		nglProgramUniform3fv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4fv ] ---

	/** JNI method for {@link #glProgramUniform4fv ProgramUniform4fv} */
	@JavadocExclude
	public static native void nglProgramUniform4fv(int program, int location, int count, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniform4fv ProgramUniform4fv} */
	@JavadocExclude
	public static void nglProgramUniform4fv(int program, int location, int count, long value) {
		long __functionAddress = getInstance().ProgramUniform4fv;
		nglProgramUniform4fv(program, location, count, value, __functionAddress);
	}

	public static void glProgramUniform4fv(int program, int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniform4fv(program, location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniform4fv ProgramUniform4fv} */
	public static void glProgramUniform4fv(int program, int location, FloatBuffer value) {
		nglProgramUniform4fv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2fv;
		nglProgramUniformMatrix2fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglProgramUniformMatrix2fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv} */
	public static void glProgramUniformMatrix2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3fv;
		nglProgramUniformMatrix3fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 8) << 2);
		nglProgramUniformMatrix3fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv} */
	public static void glProgramUniformMatrix3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3fv(program, location, value.remaining() / 8, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4fv;
		nglProgramUniformMatrix4fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 4) << 2);
		nglProgramUniformMatrix4fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv} */
	public static void glProgramUniformMatrix4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x3fv;
		nglProgramUniformMatrix2x3fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglProgramUniformMatrix2x3fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv} */
	public static void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x2fv;
		nglProgramUniformMatrix3x2fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 6) << 2);
		nglProgramUniformMatrix3x2fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv} */
	public static void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix2x4fv;
		nglProgramUniformMatrix2x4fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglProgramUniformMatrix2x4fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv} */
	public static void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x2fv;
		nglProgramUniformMatrix4x2fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 3) << 2);
		nglProgramUniformMatrix4x2fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv} */
	public static void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix3x4fv;
		nglProgramUniformMatrix3x4fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglProgramUniformMatrix3x4fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv} */
	public static void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3fv ] ---

	/** JNI method for {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv} */
	@JavadocExclude
	public static native void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv} */
	@JavadocExclude
	public static void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().ProgramUniformMatrix4x3fv;
		nglProgramUniformMatrix4x3fv(program, location, count, transpose, value, __functionAddress);
	}

	public static void glProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 12) << 2);
		nglProgramUniformMatrix4x3fv(program, location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv} */
	public static void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glValidateProgramPipeline ] ---

	/** JNI method for {@link #glValidateProgramPipeline ValidateProgramPipeline} */
	@JavadocExclude
	public static native void nglValidateProgramPipeline(int pipeline, long __functionAddress);

	public static void glValidateProgramPipeline(int pipeline) {
		long __functionAddress = getInstance().ValidateProgramPipeline;
		nglValidateProgramPipeline(pipeline, __functionAddress);
	}

	// --- [ glGetProgramPipelineInfoLog ] ---

	/** JNI method for {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	@JavadocExclude
	public static native void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog, long __functionAddress);

	/** Unsafe version of {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	@JavadocExclude
	public static void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
		long __functionAddress = getInstance().GetProgramPipelineInfoLog;
		nglGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog, __functionAddress);
	}

	public static void glGetProgramPipelineInfoLog(int pipeline, int bufSize, ByteBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(infoLog, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddressSafe(length), memAddress(infoLog));
	}

	/** Alternative version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	public static void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/** String return version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	public static String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramPipelineInfoLog(pipeline, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(memByteBuffer(__buffer.address(infoLog), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	public static String glGetProgramPipelineInfoLog(int pipeline) {
		int bufSize = glGetProgramPipelinei(pipeline, GLES20.GL_INFO_LOG_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(bufSize);
		nglGetProgramPipelineInfoLog(pipeline, bufSize, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(memByteBuffer(__buffer.address(infoLog), __buffer.intValue(length)));
	}

	// --- [ glBindImageTexture ] ---

	/** JNI method for {@link #glBindImageTexture BindImageTexture} */
	@JavadocExclude
	public static native void nglBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format, long __functionAddress);

	public static void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
		long __functionAddress = getInstance().BindImageTexture;
		nglBindImageTexture(unit, texture, level, layered, layer, access, format, __functionAddress);
	}

	// --- [ glGetBooleani_v ] ---

	/** JNI method for {@link #glGetBooleani_v GetBooleani_v} */
	@JavadocExclude
	public static native void nglGetBooleani_v(int target, int index, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetBooleani_v GetBooleani_v} */
	@JavadocExclude
	public static void nglGetBooleani_v(int target, int index, long data) {
		long __functionAddress = getInstance().GetBooleani_v;
		nglGetBooleani_v(target, index, data, __functionAddress);
	}

	public static void glGetBooleani_v(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetBooleani_v(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetBooleani_v GetBooleani_v} */
	public static boolean glGetBooleani(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.booleanParam();
		nglGetBooleani_v(target, index, __buffer.address(data));
		return __buffer.booleanValue(data);
	}

	// --- [ glMemoryBarrier ] ---

	/** JNI method for {@link #glMemoryBarrier MemoryBarrier} */
	@JavadocExclude
	public static native void nglMemoryBarrier(int barriers, long __functionAddress);

	public static void glMemoryBarrier(int barriers) {
		long __functionAddress = getInstance().MemoryBarrier;
		nglMemoryBarrier(barriers, __functionAddress);
	}

	// --- [ glMemoryBarrierByRegion ] ---

	/** JNI method for {@link #glMemoryBarrierByRegion MemoryBarrierByRegion} */
	@JavadocExclude
	public static native void nglMemoryBarrierByRegion(int barriers, long __functionAddress);

	public static void glMemoryBarrierByRegion(int barriers) {
		long __functionAddress = getInstance().MemoryBarrierByRegion;
		nglMemoryBarrierByRegion(barriers, __functionAddress);
	}

	// --- [ glTexStorage2DMultisample ] ---

	/** JNI method for {@link #glTexStorage2DMultisample TexStorage2DMultisample} */
	@JavadocExclude
	public static native void nglTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations, long __functionAddress);

	public static void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		long __functionAddress = getInstance().TexStorage2DMultisample;
		nglTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
	}

	// --- [ glGetMultisamplefv ] ---

	/** JNI method for {@link #glGetMultisamplefv GetMultisamplefv} */
	@JavadocExclude
	public static native void nglGetMultisamplefv(int pname, int index, long val, long __functionAddress);

	/** Unsafe version of {@link #glGetMultisamplefv GetMultisamplefv} */
	@JavadocExclude
	public static void nglGetMultisamplefv(int pname, int index, long val) {
		long __functionAddress = getInstance().GetMultisamplefv;
		nglGetMultisamplefv(pname, index, val, __functionAddress);
	}

	public static void glGetMultisamplefv(int pname, int index, ByteBuffer val) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(val, 1 << 2);
		nglGetMultisamplefv(pname, index, memAddress(val));
	}

	/** Alternative version of: {@link #glGetMultisamplefv GetMultisamplefv} */
	public static void glGetMultisamplefv(int pname, int index, FloatBuffer val) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(val, 1);
		nglGetMultisamplefv(pname, index, memAddress(val));
	}

	/** Single return value version of: {@link #glGetMultisamplefv GetMultisamplefv} */
	public static float glGetMultisamplef(int pname, int index) {
		APIBuffer __buffer = apiBuffer();
		int val = __buffer.floatParam();
		nglGetMultisamplefv(pname, index, __buffer.address(val));
		return __buffer.floatValue(val);
	}

	// --- [ glSampleMaski ] ---

	/** JNI method for {@link #glSampleMaski SampleMaski} */
	@JavadocExclude
	public static native void nglSampleMaski(int maskNumber, int mask, long __functionAddress);

	public static void glSampleMaski(int maskNumber, int mask) {
		long __functionAddress = getInstance().SampleMaski;
		nglSampleMaski(maskNumber, mask, __functionAddress);
	}

	// --- [ glGetTexLevelParameteriv ] ---

	/** JNI method for {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	@JavadocExclude
	public static native void nglGetTexLevelParameteriv(int target, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	@JavadocExclude
	public static void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTexLevelParameteriv;
		nglGetTexLevelParameteriv(target, level, pname, params, __functionAddress);
	}

	public static void glGetTexLevelParameteriv(int target, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	public static void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	public static int glGetTexLevelParameteri(int target, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexLevelParameteriv(target, level, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTexLevelParameterfv ] ---

	/** JNI method for {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	@JavadocExclude
	public static native void nglGetTexLevelParameterfv(int target, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	@JavadocExclude
	public static void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTexLevelParameterfv;
		nglGetTexLevelParameterfv(target, level, pname, params, __functionAddress);
	}

	public static void glGetTexLevelParameterfv(int target, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	public static void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	public static float glGetTexLevelParameterf(int target, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetTexLevelParameterfv(target, level, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glBindVertexBuffer ] ---

	/** JNI method for {@link #glBindVertexBuffer BindVertexBuffer} */
	@JavadocExclude
	public static native void nglBindVertexBuffer(int bindingindex, int buffer, long offset, int stride, long __functionAddress);

	public static void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
		long __functionAddress = getInstance().BindVertexBuffer;
		nglBindVertexBuffer(bindingindex, buffer, offset, stride, __functionAddress);
	}

	// --- [ glVertexAttribFormat ] ---

	/** JNI method for {@link #glVertexAttribFormat VertexAttribFormat} */
	@JavadocExclude
	public static native void nglVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset, long __functionAddress);

	public static void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribFormat;
		nglVertexAttribFormat(attribindex, size, type, normalized, relativeoffset, __functionAddress);
	}

	// --- [ glVertexAttribIFormat ] ---

	/** JNI method for {@link #glVertexAttribIFormat VertexAttribIFormat} */
	@JavadocExclude
	public static native void nglVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset, long __functionAddress);

	public static void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribIFormat;
		nglVertexAttribIFormat(attribindex, size, type, relativeoffset, __functionAddress);
	}

	// --- [ glVertexAttribBinding ] ---

	/** JNI method for {@link #glVertexAttribBinding VertexAttribBinding} */
	@JavadocExclude
	public static native void nglVertexAttribBinding(int attribindex, int bindingindex, long __functionAddress);

	public static void glVertexAttribBinding(int attribindex, int bindingindex) {
		long __functionAddress = getInstance().VertexAttribBinding;
		nglVertexAttribBinding(attribindex, bindingindex, __functionAddress);
	}

	// --- [ glVertexBindingDivisor ] ---

	/** JNI method for {@link #glVertexBindingDivisor VertexBindingDivisor} */
	@JavadocExclude
	public static native void nglVertexBindingDivisor(int bindingindex, int divisor, long __functionAddress);

	public static void glVertexBindingDivisor(int bindingindex, int divisor) {
		long __functionAddress = getInstance().VertexBindingDivisor;
		nglVertexBindingDivisor(bindingindex, divisor, __functionAddress);
	}

}