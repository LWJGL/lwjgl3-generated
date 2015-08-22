/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
public final class EXTTransformFeedback {

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

	/** Function address. */
	@JavadocExclude
	public final long
		BindBufferRangeEXT,
		BindBufferOffsetEXT,
		BindBufferBaseEXT,
		BeginTransformFeedbackEXT,
		EndTransformFeedbackEXT,
		TransformFeedbackVaryingsEXT,
		GetTransformFeedbackVaryingEXT,
		GetIntegerIndexedvEXT,
		GetBooleanIndexedvEXT;

	@JavadocExclude
	public EXTTransformFeedback(FunctionProvider provider) {
		BindBufferRangeEXT = provider.getFunctionAddress("glBindBufferRangeEXT");
		BindBufferOffsetEXT = provider.getFunctionAddress("glBindBufferOffsetEXT");
		BindBufferBaseEXT = provider.getFunctionAddress("glBindBufferBaseEXT");
		BeginTransformFeedbackEXT = provider.getFunctionAddress("glBeginTransformFeedbackEXT");
		EndTransformFeedbackEXT = provider.getFunctionAddress("glEndTransformFeedbackEXT");
		TransformFeedbackVaryingsEXT = provider.getFunctionAddress("glTransformFeedbackVaryingsEXT");
		GetTransformFeedbackVaryingEXT = provider.getFunctionAddress("glGetTransformFeedbackVaryingEXT");
		GetIntegerIndexedvEXT = provider.getFunctionAddress("glGetIntegerIndexedvEXT");
		GetBooleanIndexedvEXT = provider.getFunctionAddress("glGetBooleanIndexedvEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTTransformFeedback} instance for the current context. */
	public static EXTTransformFeedback getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTTransformFeedback);
	}

	static EXTTransformFeedback create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_transform_feedback") ) return null;

		EXTTransformFeedback funcs = new EXTTransformFeedback(provider);

		boolean supported = checkFunctions(
			funcs.BindBufferRangeEXT, funcs.BindBufferOffsetEXT, funcs.BindBufferBaseEXT, funcs.BeginTransformFeedbackEXT, funcs.EndTransformFeedbackEXT, 
			funcs.TransformFeedbackVaryingsEXT, funcs.GetTransformFeedbackVaryingEXT, funcs.GetIntegerIndexedvEXT, funcs.GetBooleanIndexedvEXT
		);

		return GL.checkExtension("GL_EXT_transform_feedback", funcs, supported);
	}

	// --- [ glBindBufferRangeEXT ] ---

	public static void glBindBufferRangeEXT(int target, int index, int buffer, long offset, long size) {
		long __functionAddress = getInstance().BindBufferRangeEXT;
		callIIIPPV(__functionAddress, target, index, buffer, offset, size);
	}

	// --- [ glBindBufferOffsetEXT ] ---

	public static void glBindBufferOffsetEXT(int target, int index, int buffer, long offset) {
		long __functionAddress = getInstance().BindBufferOffsetEXT;
		callIIIPV(__functionAddress, target, index, buffer, offset);
	}

	// --- [ glBindBufferBaseEXT ] ---

	public static void glBindBufferBaseEXT(int target, int index, int buffer) {
		long __functionAddress = getInstance().BindBufferBaseEXT;
		callIIIV(__functionAddress, target, index, buffer);
	}

	// --- [ glBeginTransformFeedbackEXT ] ---

	public static void glBeginTransformFeedbackEXT(int primitiveMode) {
		long __functionAddress = getInstance().BeginTransformFeedbackEXT;
		callIV(__functionAddress, primitiveMode);
	}

	// --- [ glEndTransformFeedbackEXT ] ---

	public static void glEndTransformFeedbackEXT() {
		long __functionAddress = getInstance().EndTransformFeedbackEXT;
		callV(__functionAddress);
	}

	// --- [ glTransformFeedbackVaryingsEXT ] ---

	/** Unsafe version of {@link #glTransformFeedbackVaryingsEXT TransformFeedbackVaryingsEXT} */
	@JavadocExclude
	public static void nglTransformFeedbackVaryingsEXT(int program, int count, long varyings, int bufferMode) {
		long __functionAddress = getInstance().TransformFeedbackVaryingsEXT;
		callIIPIV(__functionAddress, program, count, varyings, bufferMode);
	}

	public static void glTransformFeedbackVaryingsEXT(int program, int count, ByteBuffer varyings, int bufferMode) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(varyings, count << POINTER_SHIFT);
		nglTransformFeedbackVaryingsEXT(program, count, memAddress(varyings), bufferMode);
	}

	/** Alternative version of: {@link #glTransformFeedbackVaryingsEXT TransformFeedbackVaryingsEXT} */
	public static void glTransformFeedbackVaryingsEXT(int program, PointerBuffer varyings, int bufferMode) {
		nglTransformFeedbackVaryingsEXT(program, varyings.remaining(), memAddress(varyings), bufferMode);
	}

	/** Array version of: {@link #glTransformFeedbackVaryingsEXT TransformFeedbackVaryingsEXT} */
	public static void glTransformFeedbackVaryingsEXT(int program, CharSequence[] varyings, int bufferMode) {
		APIBuffer __buffer = apiBuffer();
		int varyingsAddress = __buffer.pointerArrayParam(APIBuffer.stringArrayASCII(true, varyings));
		try {
			nglTransformFeedbackVaryingsEXT(program, varyings.length, __buffer.address(varyingsAddress), bufferMode);
		} finally {
			__buffer.pointerArrayFree(varyingsAddress, varyings.length);
		}
	}

	/** Single varying version of: {@link #glTransformFeedbackVaryingsEXT TransformFeedbackVaryingsEXT} */
	public static void glTransformFeedbackVaryingsEXT(int program, CharSequence varying, int bufferMode) {
		APIBuffer __buffer = apiBuffer();
		int varyingsAddress = __buffer.pointerArrayParam(APIBuffer.stringArrayASCII(true, varying));
		try {
			nglTransformFeedbackVaryingsEXT(program, 1, __buffer.address(varyingsAddress), bufferMode);
		} finally {
			__buffer.pointerArrayFree(varyingsAddress, 1);
		}
	}

	// --- [ glGetTransformFeedbackVaryingEXT ] ---

	/** Unsafe version of {@link #glGetTransformFeedbackVaryingEXT GetTransformFeedbackVaryingEXT} */
	@JavadocExclude
	public static void nglGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetTransformFeedbackVaryingEXT;
		callIIIPPPPV(__functionAddress, program, index, bufSize, length, size, type, name);
	}

	public static void glGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetTransformFeedbackVaryingEXT(program, index, bufSize, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** Alternative version of: {@link #glGetTransformFeedbackVaryingEXT GetTransformFeedbackVaryingEXT} */
	public static void glGetTransformFeedbackVaryingEXT(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetTransformFeedbackVaryingEXT(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** String return version of: {@link #glGetTransformFeedbackVaryingEXT GetTransformFeedbackVaryingEXT} */
	public static String glGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetTransformFeedbackVaryingEXT(program, index, bufSize, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetTransformFeedbackVaryingEXT GetTransformFeedbackVaryingEXT} */
	public static String glGetTransformFeedbackVaryingEXT(int program, int index, IntBuffer size, IntBuffer type) {
		int bufSize = GL.getCapabilities().OpenGL20
			? GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT)
			: ARBShaderObjects.glGetObjectParameteriARB(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT);
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(bufSize);
		nglGetTransformFeedbackVaryingEXT(program, index, bufSize, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	// --- [ glGetIntegerIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	@JavadocExclude
	public static void nglGetIntegerIndexedvEXT(int param, int index, long values) {
		long __functionAddress = getInstance().GetIntegerIndexedvEXT;
		callIIPV(__functionAddress, param, index, values);
	}

	public static void glGetIntegerIndexedvEXT(int param, int index, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1 << 2);
		nglGetIntegerIndexedvEXT(param, index, memAddress(values));
	}

	/** Alternative version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	public static void glGetIntegerIndexedvEXT(int param, int index, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nglGetIntegerIndexedvEXT(param, index, memAddress(values));
	}

	/** Single return value version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	public static int glGetIntegerIndexedEXT(int param, int index) {
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetIntegerIndexedvEXT(param, index, __buffer.address(values));
		return __buffer.intValue(values);
	}

	// --- [ glGetBooleanIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetBooleanIndexedvEXT GetBooleanIndexedvEXT} */
	@JavadocExclude
	public static void nglGetBooleanIndexedvEXT(int param, int index, long values) {
		long __functionAddress = getInstance().GetBooleanIndexedvEXT;
		callIIPV(__functionAddress, param, index, values);
	}

	public static void glGetBooleanIndexedvEXT(int param, int index, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, 1);
		nglGetBooleanIndexedvEXT(param, index, memAddress(values));
	}

	/** Single return value version of: {@link #glGetBooleanIndexedvEXT GetBooleanIndexedvEXT} */
	public static boolean glGetBooleanIndexedEXT(int param, int index) {
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.booleanParam();
		nglGetBooleanIndexedvEXT(param, index, __buffer.address(values));
		return __buffer.booleanValue(values);
	}

}