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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
 * The command DrawTransformFeedbackNV() is equivalent to glDrawArrays(<mode>, 0, <count>), where <count> is the number of vertices captured to buffer
 * objects during the last transform feedback capture operation on the transform feedback object used. This draw operation only provides a vertex count --
 * it does not automatically set up vertex array state or vertex buffer object bindings, which must be done separately by the application.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5} and {@link NVTransformFeedback NV_transform_feedback} or {@link EXTTransformFeedback EXT_transform_feedback}.</p>
 */
public final class NVTransformFeedback2 {

	/** Accepted by the {@code target} parameter of BindTransformFeedbackNV. */
	public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23,
		GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24,
		GL_TRANSFORM_FEEDBACK_BINDING_NV       = 0x8E25;

	/** Function address. */
	@JavadocExclude
	public final long
		BindTransformFeedbackNV,
		DeleteTransformFeedbacksNV,
		GenTransformFeedbacksNV,
		IsTransformFeedbackNV,
		PauseTransformFeedbackNV,
		ResumeTransformFeedbackNV,
		DrawTransformFeedbackNV;

	@JavadocExclude
	public NVTransformFeedback2(FunctionProvider provider) {
		BindTransformFeedbackNV = provider.getFunctionAddress("glBindTransformFeedbackNV");
		DeleteTransformFeedbacksNV = provider.getFunctionAddress("glDeleteTransformFeedbacksNV");
		GenTransformFeedbacksNV = provider.getFunctionAddress("glGenTransformFeedbacksNV");
		IsTransformFeedbackNV = provider.getFunctionAddress("glIsTransformFeedbackNV");
		PauseTransformFeedbackNV = provider.getFunctionAddress("glPauseTransformFeedbackNV");
		ResumeTransformFeedbackNV = provider.getFunctionAddress("glResumeTransformFeedbackNV");
		DrawTransformFeedbackNV = provider.getFunctionAddress("glDrawTransformFeedbackNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVTransformFeedback2} instance for the current context. */
	public static NVTransformFeedback2 getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVTransformFeedback2);
	}

	static NVTransformFeedback2 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_transform_feedback2") ) return null;

		NVTransformFeedback2 funcs = new NVTransformFeedback2(provider);

		boolean supported = checkFunctions(
			funcs.BindTransformFeedbackNV, funcs.DeleteTransformFeedbacksNV, funcs.GenTransformFeedbacksNV, funcs.IsTransformFeedbackNV, 
			funcs.PauseTransformFeedbackNV, funcs.ResumeTransformFeedbackNV, funcs.DrawTransformFeedbackNV
		);

		return GL.checkExtension("GL_NV_transform_feedback2", funcs, supported);
	}

	// --- [ glBindTransformFeedbackNV ] ---

	public static void glBindTransformFeedbackNV(int target, int id) {
		long __functionAddress = getInstance().BindTransformFeedbackNV;
		callIIV(__functionAddress, target, id);
	}

	// --- [ glDeleteTransformFeedbacksNV ] ---

	/** Unsafe version of {@link #glDeleteTransformFeedbacksNV DeleteTransformFeedbacksNV} */
	@JavadocExclude
	public static void nglDeleteTransformFeedbacksNV(int n, long ids) {
		long __functionAddress = getInstance().DeleteTransformFeedbacksNV;
		callIPV(__functionAddress, n, ids);
	}

	public static void glDeleteTransformFeedbacksNV(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglDeleteTransformFeedbacksNV(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glDeleteTransformFeedbacksNV DeleteTransformFeedbacksNV} */
	public static void glDeleteTransformFeedbacksNV(IntBuffer ids) {
		nglDeleteTransformFeedbacksNV(ids.remaining(), memAddress(ids));
	}

	/** Single value version of: {@link #glDeleteTransformFeedbacksNV DeleteTransformFeedbacksNV} */
	public static void glDeleteTransformFeedbacksNV(int id) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDeleteTransformFeedbacksNV(1, __buffer.address(ids));
	}

	// --- [ glGenTransformFeedbacksNV ] ---

	/** Unsafe version of {@link #glGenTransformFeedbacksNV GenTransformFeedbacksNV} */
	@JavadocExclude
	public static void nglGenTransformFeedbacksNV(int n, long ids) {
		long __functionAddress = getInstance().GenTransformFeedbacksNV;
		callIPV(__functionAddress, n, ids);
	}

	public static void glGenTransformFeedbacksNV(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(ids, n << 2);
			checkBuffer(ids, 1 << 2);
		}
		nglGenTransformFeedbacksNV(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glGenTransformFeedbacksNV GenTransformFeedbacksNV} */
	public static void glGenTransformFeedbacksNV(IntBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, 1);
		nglGenTransformFeedbacksNV(ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glGenTransformFeedbacksNV GenTransformFeedbacksNV} */
	public static int glGenTransformFeedbacksNV() {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglGenTransformFeedbacksNV(1, __buffer.address(ids));
		return __buffer.intValue(ids);
	}

	// --- [ glIsTransformFeedbackNV ] ---

	public static boolean glIsTransformFeedbackNV(int id) {
		long __functionAddress = getInstance().IsTransformFeedbackNV;
		return callIZ(__functionAddress, id);
	}

	// --- [ glPauseTransformFeedbackNV ] ---

	public static void glPauseTransformFeedbackNV() {
		long __functionAddress = getInstance().PauseTransformFeedbackNV;
		callV(__functionAddress);
	}

	// --- [ glResumeTransformFeedbackNV ] ---

	public static void glResumeTransformFeedbackNV() {
		long __functionAddress = getInstance().ResumeTransformFeedbackNV;
		callV(__functionAddress);
	}

	// --- [ glDrawTransformFeedbackNV ] ---

	public static void glDrawTransformFeedbackNV(int mode, int id) {
		long __functionAddress = getInstance().DrawTransformFeedbackNV;
		callIIV(__functionAddress, mode, id);
	}

}