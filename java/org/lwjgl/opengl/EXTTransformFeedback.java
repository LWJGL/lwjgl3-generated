/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a> extension.
 * 
 * <p>This extension provides a new mode to the GL, called transform feedback, which records selected vertex attributes for each primitive processed by the
 * GL. The selected attributes are written into buffer objects, and can be written with each attribute in a separate buffer object or with all attributes
 * interleaved into a single buffer object. If a geometry shader is active, the primitives recorded are those emitted by the geometry shader. Otherwise,
 * transform feedback captures primitives whose vertices are transformed by a vertex shader. In either case, the primitives captured are those generated
 * prior to clipping. Transform feedback mode captures the values of specified varying variables emitted from GLSL vertex or geometry shaders.</p>
 * 
 * <p>The vertex data recorded in transform feedback mode is stored into buffer objects as an array of vertex attributes. The regular representation and the
 * use of buffer objects allows the recorded data to be processed directly by the GL without requiring CPU intervention to copy data. In particular,
 * transform feedback data can be used for vertex arrays (via vertex buffer objects), as the source for pixel data (via pixel buffer objects), as shader
 * constant data (via the <a href="http://www.opengl.org/registry/specs/NV/parameter_buffer_object.txt">NV_parameter_buffer_object</a> or {@link EXTBindableUniform EXT_bindable_uniform} extensions), or via any other extension that
 * makes use of buffer objects.</p>
 * 
 * <p>This extension introduces new query object support to allow transform feedback mode to operate asynchronously. Query objects allow applications to
 * determine when transform feedback results are complete, as well as the number of primitives processed and written back to buffer objects while in
 * transform feedback mode. This extension also provides a new rasterizer discard enable, which allows applications to use transform feedback to capture
 * vertex attributes without rendering anything.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects}. Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class EXTTransformFeedback {

	/**
	 * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
	 * BindBufferRangeEXT, BindBufferOffsetEXT and BindBufferBaseEXT.
	 */
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x8C8E;

	/** Accepted by the {@code param} parameter of GetIntegerIndexedvEXT and GetBooleanIndexedvEXT. */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 0x8C84,
		GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT  = 0x8C85;

	/**
	 * Accepted by the {@code param} parameter of GetIntegerIndexedvEXT and GetBooleanIndexedvEXT, and by the {@code pname} parameter of GetBooleanv,
	 * GetDoublev, GetIntegerv, and GetFloatv.
	 */
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 0x8C8F;

	/** Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryingsEXT. */
	public static final int
		GL_INTERLEAVED_ATTRIBS_EXT = 0x8C8C,
		GL_SEPARATE_ATTRIBS_EXT    = 0x8C8D;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int
		GL_PRIMITIVES_GENERATED_EXT                  = 0x8C87,
		GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 0x8C88;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_RASTERIZER_DISCARD_EXT = 0x8C89;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 0x8C8A,
		GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT       = 0x8C8B,
		GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT    = 0x8C80;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_TRANSFORM_FEEDBACK_VARYINGS_EXT           = 0x8C83,
		GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT        = 0x8C7F,
		GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 0x8C76;

	protected EXTTransformFeedback() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBindBufferRangeEXT, caps.glBindBufferOffsetEXT, caps.glBindBufferBaseEXT, caps.glBeginTransformFeedbackEXT, caps.glEndTransformFeedbackEXT, 
			caps.glTransformFeedbackVaryingsEXT, caps.glGetTransformFeedbackVaryingEXT, caps.glGetIntegerIndexedvEXT, caps.glGetBooleanIndexedvEXT
		);
	}

	// --- [ glBindBufferRangeEXT ] ---

	public static void glBindBufferRangeEXT(int target, int index, int buffer, long offset, long size) {
		long __functionAddress = GL.getCapabilities().glBindBufferRangeEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, target, index, buffer, offset, size);
	}

	// --- [ glBindBufferOffsetEXT ] ---

	public static void glBindBufferOffsetEXT(int target, int index, int buffer, long offset) {
		long __functionAddress = GL.getCapabilities().glBindBufferOffsetEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, buffer, offset);
	}

	// --- [ glBindBufferBaseEXT ] ---

	public static void glBindBufferBaseEXT(int target, int index, int buffer) {
		long __functionAddress = GL.getCapabilities().glBindBufferBaseEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index, buffer);
	}

	// --- [ glBeginTransformFeedbackEXT ] ---

	public static void glBeginTransformFeedbackEXT(int primitiveMode) {
		long __functionAddress = GL.getCapabilities().glBeginTransformFeedbackEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, primitiveMode);
	}

	// --- [ glEndTransformFeedbackEXT ] ---

	public static void glEndTransformFeedbackEXT() {
		long __functionAddress = GL.getCapabilities().glEndTransformFeedbackEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glTransformFeedbackVaryingsEXT ] ---

	public static void nglTransformFeedbackVaryingsEXT(int program, int count, long varyings, int bufferMode) {
		long __functionAddress = GL.getCapabilities().glTransformFeedbackVaryingsEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, count, varyings, bufferMode);
	}

	public static void glTransformFeedbackVaryingsEXT(int program, PointerBuffer varyings, int bufferMode) {
		nglTransformFeedbackVaryingsEXT(program, varyings.remaining(), memAddress(varyings), bufferMode);
	}

	public static void glTransformFeedbackVaryingsEXT(int program, CharSequence[] varyings, int bufferMode) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varyings);
			nglTransformFeedbackVaryingsEXT(program, varyings.length, varyingsAddress, bufferMode);
			org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, varyings.length);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static void glTransformFeedbackVaryingsEXT(int program, CharSequence varying, int bufferMode) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varying);
			nglTransformFeedbackVaryingsEXT(program, 1, varyingsAddress, bufferMode);
			org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, 1);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTransformFeedbackVaryingEXT ] ---

	public static void nglGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbackVaryingEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, program, index, bufSize, length, size, type, name);
	}

	public static void glGetTransformFeedbackVaryingEXT(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetTransformFeedbackVaryingEXT(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	public static String glGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetTransformFeedbackVaryingEXT(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	public static String glGetTransformFeedbackVaryingEXT(int program, int index, IntBuffer size, IntBuffer type) {
		int bufSize = GL.getCapabilities().OpenGL20
			? GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT)
			: ARBShaderObjects.glGetObjectParameteriARB(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT);
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(bufSize);
			nglGetTransformFeedbackVaryingEXT(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetIntegerIndexedvEXT ] ---

	public static void nglGetIntegerIndexedvEXT(int param, int index, long values) {
		long __functionAddress = GL.getCapabilities().glGetIntegerIndexedvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, param, index, values);
	}

	public static void glGetIntegerIndexedvEXT(int param, int index, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nglGetIntegerIndexedvEXT(param, index, memAddress(values));
	}

	public static int glGetIntegerIndexedEXT(int param, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer values = stack.callocInt(1);
			nglGetIntegerIndexedvEXT(param, index, memAddress(values));
			return values.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetBooleanIndexedvEXT ] ---

	public static void nglGetBooleanIndexedvEXT(int param, int index, long values) {
		long __functionAddress = GL.getCapabilities().glGetBooleanIndexedvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, param, index, values);
	}

	public static void glGetBooleanIndexedvEXT(int param, int index, ByteBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nglGetBooleanIndexedvEXT(param, index, memAddress(values));
	}

	public static byte glGetBooleanIndexedEXT(int param, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer values = stack.calloc(1);
			nglGetBooleanIndexedvEXT(param, index, memAddress(values));
			return values.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetTransformFeedbackVaryingEXT GetTransformFeedbackVaryingEXT} */
	public static void glGetTransformFeedbackVaryingEXT(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbackVaryingEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		callPPPPV(__functionAddress, program, index, name.remaining(), length, size, type, memAddress(name));
	}

	/** Array version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	public static void glGetIntegerIndexedvEXT(int param, int index, int[] values) {
		long __functionAddress = GL.getCapabilities().glGetIntegerIndexedvEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		callPV(__functionAddress, param, index, values);
	}

}