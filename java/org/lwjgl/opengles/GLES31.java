/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core OpenGL ES 3.1 functionality. */
public class GLES31 {

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

	protected GLES31() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glDispatchCompute, caps.glDispatchComputeIndirect, caps.glDrawArraysIndirect, caps.glDrawElementsIndirect, caps.glFramebufferParameteri, 
			caps.glGetFramebufferParameteriv, caps.glGetProgramInterfaceiv, caps.glGetProgramResourceIndex, caps.glGetProgramResourceName, 
			caps.glGetProgramResourceiv, caps.glGetProgramResourceLocation, caps.glUseProgramStages, caps.glActiveShaderProgram, caps.glCreateShaderProgramv, 
			caps.glBindProgramPipeline, caps.glDeleteProgramPipelines, caps.glGenProgramPipelines, caps.glIsProgramPipeline, caps.glGetProgramPipelineiv, 
			caps.glProgramUniform1i, caps.glProgramUniform2i, caps.glProgramUniform3i, caps.glProgramUniform4i, caps.glProgramUniform1ui, 
			caps.glProgramUniform2ui, caps.glProgramUniform3ui, caps.glProgramUniform4ui, caps.glProgramUniform1f, caps.glProgramUniform2f, 
			caps.glProgramUniform3f, caps.glProgramUniform4f, caps.glProgramUniform1iv, caps.glProgramUniform2iv, caps.glProgramUniform3iv, 
			caps.glProgramUniform4iv, caps.glProgramUniform1uiv, caps.glProgramUniform2uiv, caps.glProgramUniform3uiv, caps.glProgramUniform4uiv, 
			caps.glProgramUniform1fv, caps.glProgramUniform2fv, caps.glProgramUniform3fv, caps.glProgramUniform4fv, caps.glProgramUniformMatrix2fv, 
			caps.glProgramUniformMatrix3fv, caps.glProgramUniformMatrix4fv, caps.glProgramUniformMatrix2x3fv, caps.glProgramUniformMatrix3x2fv, 
			caps.glProgramUniformMatrix2x4fv, caps.glProgramUniformMatrix4x2fv, caps.glProgramUniformMatrix3x4fv, caps.glProgramUniformMatrix4x3fv, 
			caps.glValidateProgramPipeline, caps.glGetProgramPipelineInfoLog, caps.glBindImageTexture, caps.glGetBooleani_v, caps.glMemoryBarrier, 
			caps.glMemoryBarrierByRegion, caps.glTexStorage2DMultisample, caps.glGetMultisamplefv, caps.glSampleMaski, caps.glGetTexLevelParameteriv, 
			caps.glGetTexLevelParameterfv, caps.glBindVertexBuffer, caps.glVertexAttribFormat, caps.glVertexAttribIFormat, caps.glVertexAttribBinding, 
			caps.glVertexBindingDivisor
		);
	}

	// --- [ glDispatchCompute ] ---

	public static void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
		long __functionAddress = GLES.getCapabilities().glDispatchCompute;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, num_groups_x, num_groups_y, num_groups_z);
	}

	// --- [ glDispatchComputeIndirect ] ---

	public static void glDispatchComputeIndirect(long indirect) {
		long __functionAddress = GLES.getCapabilities().glDispatchComputeIndirect;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, indirect);
	}

	// --- [ glDrawArraysIndirect ] ---

	public static void nglDrawArraysIndirect(int mode, long indirect) {
		long __functionAddress = GLES.getCapabilities().glDrawArraysIndirect;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, indirect);
	}

	public static void glDrawArraysIndirect(int mode, ByteBuffer indirect) {
		if ( CHECKS ) {
			checkBuffer(indirect, 4 * 4);
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawArraysIndirect(mode, memAddress(indirect));
	}

	public static void glDrawArraysIndirect(int mode, long indirect) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglDrawArraysIndirect(mode, indirect);
	}

	/** IntBuffer version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
	public static void glDrawArraysIndirect(int mode, IntBuffer indirect) {
		if ( CHECKS ) {
			checkBuffer(indirect, (4 * 4) >> 2);
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawArraysIndirect(mode, memAddress(indirect));
	}

	// --- [ glDrawElementsIndirect ] ---

	public static void nglDrawElementsIndirect(int mode, int type, long indirect) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsIndirect;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, mode, type, indirect);
	}

	public static void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
		if ( CHECKS ) {
			checkBuffer(indirect, 5 * 4);
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawElementsIndirect(mode, type, memAddress(indirect));
	}

	public static void glDrawElementsIndirect(int mode, int type, long indirect) {
		if ( CHECKS )
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, true);
		nglDrawElementsIndirect(mode, type, indirect);
	}

	/** IntBuffer version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
	public static void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
		if ( CHECKS ) {
			checkBuffer(indirect, (5 * 4) >> 2);
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		nglDrawElementsIndirect(mode, type, memAddress(indirect));
	}

	// --- [ glFramebufferParameteri ] ---

	public static void glFramebufferParameteri(int target, int pname, int param) {
		long __functionAddress = GLES.getCapabilities().glFramebufferParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, pname, param);
	}

	// --- [ glGetFramebufferParameteriv ] ---

	public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetFramebufferParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	public static void glGetFramebufferParameteriv(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	public static int glGetFramebufferParameteri(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetFramebufferParameteriv(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramInterfaceiv ] ---

	public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramInterfaceiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, programInterface, pname, params);
	}

	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
	}

	public static int glGetProgramInterfacei(int program, int programInterface, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramResourceIndex ] ---

	public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
		long __functionAddress = GLES.getCapabilities().glGetProgramResourceIndex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, programInterface, name);
	}

	public static int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
	}

	public static int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetProgramResourceIndex(program, programInterface, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramResourceName ] ---

	public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
		long __functionAddress = GLES.getCapabilities().glGetProgramResourceName;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, programInterface, index, bufSize, length, name);
	}

	public static void glGetProgramResourceName(int program, int programInterface, int index, IntBuffer length, ByteBuffer name) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceName(program, programInterface, index, name.remaining(), memAddressSafe(length), memAddress(name));
	}

	public static String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetProgramResourceName(program, programInterface, index, bufSize, memAddress(length), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetProgramResourceName(int program, int programInterface, int index) {
		int bufSize = glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetProgramResourceName(program, programInterface, index, bufSize, memAddress(length), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramResourceiv ] ---

	public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramResourceiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, program, programInterface, index, propCount, props, bufSize, length, params);
	}

	public static void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
	}

	// --- [ glGetProgramResourceLocation ] ---

	public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
		long __functionAddress = GLES.getCapabilities().glGetProgramResourceLocation;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, programInterface, name);
	}

	public static int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocation(program, programInterface, memAddress(name));
	}

	public static int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetProgramResourceLocation(program, programInterface, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUseProgramStages ] ---

	public static void glUseProgramStages(int pipeline, int stages, int program) {
		long __functionAddress = GLES.getCapabilities().glUseProgramStages;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pipeline, stages, program);
	}

	// --- [ glActiveShaderProgram ] ---

	public static void glActiveShaderProgram(int pipeline, int program) {
		long __functionAddress = GLES.getCapabilities().glActiveShaderProgram;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pipeline, program);
	}

	// --- [ glCreateShaderProgramv ] ---

	public static int nglCreateShaderProgramv(int type, int count, long strings) {
		long __functionAddress = GLES.getCapabilities().glCreateShaderProgramv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, type, count, strings);
	}

	public static int glCreateShaderProgramv(int type, PointerBuffer strings) {
		return nglCreateShaderProgramv(type, strings.remaining(), memAddress(strings));
	}

	public static int glCreateShaderProgramv(int type, CharSequence... strings) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, strings);
			int __result = nglCreateShaderProgramv(type, strings.length, stringsAddress);
			org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
			return __result;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static int glCreateShaderProgramv(int type, CharSequence string) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, string);
			int __result = nglCreateShaderProgramv(type, 1, stringsAddress);
			org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
			return __result;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glBindProgramPipeline ] ---

	public static void glBindProgramPipeline(int pipeline) {
		long __functionAddress = GLES.getCapabilities().glBindProgramPipeline;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pipeline);
	}

	// --- [ glDeleteProgramPipelines ] ---

	public static void nglDeleteProgramPipelines(int n, long pipelines) {
		long __functionAddress = GLES.getCapabilities().glDeleteProgramPipelines;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, pipelines);
	}

	public static void glDeleteProgramPipelines(IntBuffer pipelines) {
		nglDeleteProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	public static void glDeleteProgramPipelines(int pipeline) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer pipelines = stack.ints(pipeline);
			nglDeleteProgramPipelines(1, memAddress(pipelines));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenProgramPipelines ] ---

	public static void nglGenProgramPipelines(int n, long pipelines) {
		long __functionAddress = GLES.getCapabilities().glGenProgramPipelines;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, pipelines);
	}

	public static void glGenProgramPipelines(IntBuffer pipelines) {
		nglGenProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	public static int glGenProgramPipelines() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer pipelines = stack.callocInt(1);
			nglGenProgramPipelines(1, memAddress(pipelines));
			return pipelines.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsProgramPipeline ] ---

	public static boolean glIsProgramPipeline(int pipeline) {
		long __functionAddress = GLES.getCapabilities().glIsProgramPipeline;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, pipeline);
	}

	// --- [ glGetProgramPipelineiv ] ---

	public static void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramPipelineiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pipeline, pname, params);
	}

	public static void glGetProgramPipelineiv(int pipeline, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
	}

	public static int glGetProgramPipelinei(int pipeline, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glProgramUniform1i ] ---

	public static void glProgramUniform1i(int program, int location, int v0) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform2i ] ---

	public static void glProgramUniform2i(int program, int location, int v0, int v1) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform3i ] ---

	public static void glProgramUniform3i(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform4i ] ---

	public static void glProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4i;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform1ui ] ---

	public static void glProgramUniform1ui(int program, int location, int v0) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform2ui ] ---

	public static void glProgramUniform2ui(int program, int location, int v0, int v1) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform3ui ] ---

	public static void glProgramUniform3ui(int program, int location, int v0, int v1, int v2) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform4ui ] ---

	public static void glProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform1f ] ---

	public static void glProgramUniform1f(int program, int location, float v0) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1f;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0);
	}

	// --- [ glProgramUniform2f ] ---

	public static void glProgramUniform2f(int program, int location, float v0, float v1) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2f;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1);
	}

	// --- [ glProgramUniform3f ] ---

	public static void glProgramUniform3f(int program, int location, float v0, float v1, float v2) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3f;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1, v2);
	}

	// --- [ glProgramUniform4f ] ---

	public static void glProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4f;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, v0, v1, v2, v3);
	}

	// --- [ glProgramUniform1iv ] ---

	public static void nglProgramUniform1iv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1iv(int program, int location, IntBuffer value) {
		nglProgramUniform1iv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2iv ] ---

	public static void nglProgramUniform2iv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2iv(int program, int location, IntBuffer value) {
		nglProgramUniform2iv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3iv ] ---

	public static void nglProgramUniform3iv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3iv(int program, int location, IntBuffer value) {
		nglProgramUniform3iv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4iv ] ---

	public static void nglProgramUniform4iv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4iv(int program, int location, IntBuffer value) {
		nglProgramUniform4iv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1uiv ] ---

	public static void nglProgramUniform1uiv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1uiv(int program, int location, IntBuffer value) {
		nglProgramUniform1uiv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2uiv ] ---

	public static void nglProgramUniform2uiv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2uiv(int program, int location, IntBuffer value) {
		nglProgramUniform2uiv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3uiv ] ---

	public static void nglProgramUniform3uiv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3uiv(int program, int location, IntBuffer value) {
		nglProgramUniform3uiv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4uiv ] ---

	public static void nglProgramUniform4uiv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4uiv(int program, int location, IntBuffer value) {
		nglProgramUniform4uiv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniform1fv ] ---

	public static void nglProgramUniform1fv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform1fv(int program, int location, FloatBuffer value) {
		nglProgramUniform1fv(program, location, value.remaining(), memAddress(value));
	}

	// --- [ glProgramUniform2fv ] ---

	public static void nglProgramUniform2fv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform2fv(int program, int location, FloatBuffer value) {
		nglProgramUniform2fv(program, location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glProgramUniform3fv ] ---

	public static void nglProgramUniform3fv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform3fv(int program, int location, FloatBuffer value) {
		nglProgramUniform3fv(program, location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glProgramUniform4fv ] ---

	public static void nglProgramUniform4fv(int program, int location, int count, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, value);
	}

	public static void glProgramUniform4fv(int program, int location, FloatBuffer value) {
		nglProgramUniform4fv(program, location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2fv ] ---

	public static void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3fv ] ---

	public static void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3fv(program, location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4fv ] ---

	public static void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x3fv ] ---

	public static void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix2x3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x2fv ] ---

	public static void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix3x2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix2x4fv ] ---

	public static void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix2x4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x2fv ] ---

	public static void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix4x2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix3x4fv ] ---

	public static void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix3x4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glProgramUniformMatrix4x3fv ] ---

	public static void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix4x3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, transpose, value);
	}

	public static void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, FloatBuffer value) {
		nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, memAddress(value));
	}

	// --- [ glValidateProgramPipeline ] ---

	public static void glValidateProgramPipeline(int pipeline) {
		long __functionAddress = GLES.getCapabilities().glValidateProgramPipeline;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, pipeline);
	}

	// --- [ glGetProgramPipelineInfoLog ] ---

	public static void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
		long __functionAddress = GLES.getCapabilities().glGetProgramPipelineInfoLog;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, pipeline, bufSize, length, infoLog);
	}

	public static void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	public static String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetProgramPipelineInfoLog(int pipeline) {
		int bufSize = glGetProgramPipelinei(pipeline, GLES20.GL_INFO_LOG_LENGTH);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		ByteBuffer infoLog = memAlloc(bufSize);
		try {
			IntBuffer length = stack.ints(0);
			nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddress(length), memAddress(infoLog));
			return memUTF8(infoLog, length.get(0));
		} finally {
			memFree(infoLog);
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glBindImageTexture ] ---

	public static void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
		long __functionAddress = GLES.getCapabilities().glBindImageTexture;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, unit, texture, level, layered, layer, access, format);
	}

	// --- [ glGetBooleani_v ] ---

	public static void nglGetBooleani_v(int target, int index, long data) {
		long __functionAddress = GLES.getCapabilities().glGetBooleani_v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, data);
	}

	public static void glGetBooleani_v(int target, int index, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetBooleani_v(target, index, memAddress(data));
	}

	public static byte glGetBooleani(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer data = stack.calloc(1);
			nglGetBooleani_v(target, index, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glMemoryBarrier ] ---

	public static void glMemoryBarrier(int barriers) {
		long __functionAddress = GLES.getCapabilities().glMemoryBarrier;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, barriers);
	}

	// --- [ glMemoryBarrierByRegion ] ---

	public static void glMemoryBarrierByRegion(int barriers) {
		long __functionAddress = GLES.getCapabilities().glMemoryBarrierByRegion;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, barriers);
	}

	// --- [ glTexStorage2DMultisample ] ---

	public static void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		long __functionAddress = GLES.getCapabilities().glTexStorage2DMultisample;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, samples, internalformat, width, height, fixedsamplelocations);
	}

	// --- [ glGetMultisamplefv ] ---

	public static void nglGetMultisamplefv(int pname, int index, long val) {
		long __functionAddress = GLES.getCapabilities().glGetMultisamplefv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, index, val);
	}

	public static void glGetMultisamplefv(int pname, int index, FloatBuffer val) {
		if ( CHECKS )
			checkBuffer(val, 1);
		nglGetMultisamplefv(pname, index, memAddress(val));
	}

	public static float glGetMultisamplef(int pname, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer val = stack.callocFloat(1);
			nglGetMultisamplefv(pname, index, memAddress(val));
			return val.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glSampleMaski ] ---

	public static void glSampleMaski(int maskNumber, int mask) {
		long __functionAddress = GLES.getCapabilities().glSampleMaski;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, maskNumber, mask);
	}

	// --- [ glGetTexLevelParameteriv ] ---

	public static void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetTexLevelParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, pname, params);
	}

	public static void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
	}

	public static int glGetTexLevelParameteri(int target, int level, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTexLevelParameterfv ] ---

	public static void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetTexLevelParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, pname, params);
	}

	public static void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
	}

	public static float glGetTexLevelParameterf(int target, int level, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glBindVertexBuffer ] ---

	public static void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
		long __functionAddress = GLES.getCapabilities().glBindVertexBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, bindingindex, buffer, offset, stride);
	}

	// --- [ glVertexAttribFormat ] ---

	public static void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribFormat;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, attribindex, size, type, normalized, relativeoffset);
	}

	// --- [ glVertexAttribIFormat ] ---

	public static void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribIFormat;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexAttribBinding ] ---

	public static void glVertexAttribBinding(int attribindex, int bindingindex) {
		long __functionAddress = GLES.getCapabilities().glVertexAttribBinding;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, attribindex, bindingindex);
	}

	// --- [ glVertexBindingDivisor ] ---

	public static void glVertexBindingDivisor(int bindingindex, int divisor) {
		long __functionAddress = GLES.getCapabilities().glVertexBindingDivisor;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, bindingindex, divisor);
	}

	/** int[] version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
	public static void glDrawArraysIndirect(int mode, int[] indirect) {
		long __functionAddress = GLES.getCapabilities().glDrawArraysIndirect;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indirect, 4 * 4);
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, mode, indirect);
	}

	/** int[] version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
	public static void glDrawElementsIndirect(int mode, int type, int[] indirect) {
		long __functionAddress = GLES.getCapabilities().glDrawElementsIndirect;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indirect, 5 * 4);
			GLESChecks.ensureBufferObject(GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, mode, type, indirect);
	}

	/** Array version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	public static void glGetFramebufferParameteriv(int target, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetFramebufferParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
	public static void glGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramInterfaceiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, programInterface, pname, params);
	}

	/** Array version of: {@link #glGetProgramResourceName GetProgramResourceName} */
	public static void glGetProgramResourceName(int program, int programInterface, int index, int[] length, ByteBuffer name) {
		long __functionAddress = GLES.getCapabilities().glGetProgramResourceName;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, program, programInterface, index, name.remaining(), length, memAddress(name));
	}

	/** Array version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
	public static void glGetProgramResourceiv(int program, int programInterface, int index, int[] props, int[] length, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramResourceiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPPV(__functionAddress, program, programInterface, index, props.length, props, params.length, length, params);
	}

	/** Array version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
	public static void glDeleteProgramPipelines(int[] pipelines) {
		long __functionAddress = GLES.getCapabilities().glDeleteProgramPipelines;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pipelines.length, pipelines);
	}

	/** Array version of: {@link #glGenProgramPipelines GenProgramPipelines} */
	public static void glGenProgramPipelines(int[] pipelines) {
		long __functionAddress = GLES.getCapabilities().glGenProgramPipelines;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pipelines.length, pipelines);
	}

	/** Array version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
	public static void glGetProgramPipelineiv(int pipeline, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetProgramPipelineiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, pipeline, pname, params);
	}

	/** Array version of: {@link #glProgramUniform1iv ProgramUniform1iv} */
	public static void glProgramUniform1iv(int program, int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2iv ProgramUniform2iv} */
	public static void glProgramUniform2iv(int program, int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3iv ProgramUniform3iv} */
	public static void glProgramUniform3iv(int program, int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4iv ProgramUniform4iv} */
	public static void glProgramUniform4iv(int program, int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform1uiv ProgramUniform1uiv} */
	public static void glProgramUniform1uiv(int program, int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2uiv ProgramUniform2uiv} */
	public static void glProgramUniform2uiv(int program, int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3uiv ProgramUniform3uiv} */
	public static void glProgramUniform3uiv(int program, int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4uiv ProgramUniform4uiv} */
	public static void glProgramUniform4uiv(int program, int location, int[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniform1fv ProgramUniform1fv} */
	public static void glProgramUniform1fv(int program, int location, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform1fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length, value);
	}

	/** Array version of: {@link #glProgramUniform2fv ProgramUniform2fv} */
	public static void glProgramUniform2fv(int program, int location, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glProgramUniform3fv ProgramUniform3fv} */
	public static void glProgramUniform3fv(int program, int location, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 3, value);
	}

	/** Array version of: {@link #glProgramUniform4fv ProgramUniform4fv} */
	public static void glProgramUniform4fv(int program, int location, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniform4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv} */
	public static void glProgramUniformMatrix2fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 2, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv} */
	public static void glProgramUniformMatrix3fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 9, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv} */
	public static void glProgramUniformMatrix4fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 4, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv} */
	public static void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix2x3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv} */
	public static void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix3x2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 6, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv} */
	public static void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix2x4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv} */
	public static void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix4x2fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv} */
	public static void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix3x4fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv} */
	public static void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, float[] value) {
		long __functionAddress = GLES.getCapabilities().glProgramUniformMatrix4x3fv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, value.length / 12, transpose, value);
	}

	/** Array version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
	public static void glGetProgramPipelineInfoLog(int pipeline, int[] length, ByteBuffer infoLog) {
		long __functionAddress = GLES.getCapabilities().glGetProgramPipelineInfoLog;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, pipeline, infoLog.remaining(), length, memAddress(infoLog));
	}

	/** Array version of: {@link #glGetMultisamplefv GetMultisamplefv} */
	public static void glGetMultisamplefv(int pname, int index, float[] val) {
		long __functionAddress = GLES.getCapabilities().glGetMultisamplefv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(val, 1);
		}
		callPV(__functionAddress, pname, index, val);
	}

	/** Array version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
	public static void glGetTexLevelParameteriv(int target, int level, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetTexLevelParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, level, pname, params);
	}

	/** Array version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
	public static void glGetTexLevelParameterfv(int target, int level, int pname, float[] params) {
		long __functionAddress = GLES.getCapabilities().glGetTexLevelParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, level, pname, params);
	}

}