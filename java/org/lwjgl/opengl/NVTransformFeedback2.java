/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/transform_feedback2.txt">NV_transform_feedback2</a> extension.
 * 
 * <p>The NV_transform_feedback and EXT_transform_feedback extensions allow applications to capture primitives to one or more buffer objects when transformed
 * by the GL. This extension provides a few additional capabilities to these extensions, making transform feedback mode more useful.</p>
 * 
 * <p>First, it provides transform feedback objects encapsulating transform feedback-related state, allowing applications to replace the entire transform
 * feedback configuration in a single bind call. Second, it provides the ability to pause and resume transform feedback operations. When transform
 * feedback is paused, applications may render without transform feedback or may use transform feedback with different state and a different transform
 * feedback object. When transform feedback is resumed, additional primitives are captured and appended to previously captured primitives for the object.</p>
 * 
 * <p>Additionally, this extension provides the ability to draw primitives captured in transform feedback mode without querying the captured primitive count.
 * The command DrawTransformFeedbackNV() is equivalent to {@code glDrawArrays(<mode>, 0, <count>)}, where {@code count} is the number of vertices captured
 * to buffer objects during the last transform feedback capture operation on the transform feedback object used. This draw operation only provides a
 * vertex count -- it does not automatically set up vertex array state or vertex buffer object bindings, which must be done separately by the application.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5} and {@link NVTransformFeedback NV_transform_feedback} or {@link EXTTransformFeedback EXT_transform_feedback}.</p>
 */
public class NVTransformFeedback2 {

	/** Accepted by the {@code target} parameter of BindTransformFeedbackNV. */
	public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23,
		GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24,
		GL_TRANSFORM_FEEDBACK_BINDING_NV       = 0x8E25;

	protected NVTransformFeedback2() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBindTransformFeedbackNV, caps.glDeleteTransformFeedbacksNV, caps.glGenTransformFeedbacksNV, caps.glIsTransformFeedbackNV, 
			caps.glPauseTransformFeedbackNV, caps.glResumeTransformFeedbackNV, caps.glDrawTransformFeedbackNV
		);
	}

	// --- [ glBindTransformFeedbackNV ] ---

	public static void glBindTransformFeedbackNV(int target, int id) {
		long __functionAddress = GL.getCapabilities().glBindTransformFeedbackNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, id);
	}

	// --- [ glDeleteTransformFeedbacksNV ] ---

	public static void nglDeleteTransformFeedbacksNV(int n, long ids) {
		long __functionAddress = GL.getCapabilities().glDeleteTransformFeedbacksNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	public static void glDeleteTransformFeedbacksNV(IntBuffer ids) {
		nglDeleteTransformFeedbacksNV(ids.remaining(), memAddress(ids));
	}

	public static void glDeleteTransformFeedbacksNV(int id) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.ints(id);
			nglDeleteTransformFeedbacksNV(1, memAddress(ids));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenTransformFeedbacksNV ] ---

	public static void nglGenTransformFeedbacksNV(int n, long ids) {
		long __functionAddress = GL.getCapabilities().glGenTransformFeedbacksNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	public static void glGenTransformFeedbacksNV(IntBuffer ids) {
		if ( CHECKS )
			checkBuffer(ids, 1);
		nglGenTransformFeedbacksNV(ids.remaining(), memAddress(ids));
	}

	public static int glGenTransformFeedbacksNV() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.callocInt(1);
			nglGenTransformFeedbacksNV(1, memAddress(ids));
			return ids.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsTransformFeedbackNV ] ---

	public static boolean glIsTransformFeedbackNV(int id) {
		long __functionAddress = GL.getCapabilities().glIsTransformFeedbackNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, id);
	}

	// --- [ glPauseTransformFeedbackNV ] ---

	public static void glPauseTransformFeedbackNV() {
		long __functionAddress = GL.getCapabilities().glPauseTransformFeedbackNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glResumeTransformFeedbackNV ] ---

	public static void glResumeTransformFeedbackNV() {
		long __functionAddress = GL.getCapabilities().glResumeTransformFeedbackNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glDrawTransformFeedbackNV ] ---

	public static void glDrawTransformFeedbackNV(int mode, int id) {
		long __functionAddress = GL.getCapabilities().glDrawTransformFeedbackNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode, id);
	}

	/** Array version of: {@link #glDeleteTransformFeedbacksNV DeleteTransformFeedbacksNV} */
	public static void glDeleteTransformFeedbacksNV(int[] ids) {
		long __functionAddress = GL.getCapabilities().glDeleteTransformFeedbacksNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glGenTransformFeedbacksNV GenTransformFeedbacksNV} */
	public static void glGenTransformFeedbacksNV(int[] ids) {
		long __functionAddress = GL.getCapabilities().glGenTransformFeedbacksNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(ids, 1);
		}
		callPV(__functionAddress, ids.length, ids);
	}

}