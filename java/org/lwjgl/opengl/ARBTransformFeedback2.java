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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/transform_feedback2.txt">ARB_transform_feedback2</a> extension.
 * 
 * <p>The <a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a> extension allows applications to capture primitives to one or more buffer objects when transformed by
 * the GL. This extension provides a few additional capabilities to these extensions, making transform feedback mode more useful.</p>
 * 
 * <p>First, it provides transform feedback objects which encapsulate transform feedback-related state, allowing applications to replace the entire transform
 * feedback configuration in a single bind call. Second, it provides the ability to pause and resume transform feedback operations. When transform feedback
 * is paused, applications may render without transform feedback or may use transform feedback with different state and a different transform feedback
 * object. When transform feedback is resumed, additional primitives are captured and appended to previously captured primitives for the object.</p>
 * 
 * <p>Additionally, this extension provides the ability to draw primitives captured in transform feedback mode without querying the captured primitive count.
 * The command {@link #glDrawTransformFeedback DrawTransformFeedback} is equivalent to <pre><code style="font-family: monospace">
 * glDrawArrays(<mode>, 0, <count>)</code></pre>, where {@code count} is the number of vertices
 * captured to buffer objects during the last transform feedback capture operation on the transform feedback object used. This draw operation only provides
 * a vertex count -- it does not automatically set up vertex array state or vertex buffer object bindings, which must be done separately by the application.</p>
 * 
 * <p>Requires {@link GL20 GL20} or {@link ARBShaderObjects ARB_shader_objects} and <a href="http://www.opengl.org/registry/specs/NV/transform_feedback.txt">NV_transform_feedback</a> or <a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a>.
 * Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public final class ARBTransformFeedback2 {

	/** Accepted by the {@code target} parameter of BindTransformFeedback. */
	public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23,
		GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24,
		GL_TRANSFORM_FEEDBACK_BINDING       = 0x8E25;

	/** Function address. */
	@JavadocExclude
	public final long
		BindTransformFeedback,
		DeleteTransformFeedbacks,
		GenTransformFeedbacks,
		IsTransformFeedback,
		PauseTransformFeedback,
		ResumeTransformFeedback,
		DrawTransformFeedback;

	@JavadocExclude
	public ARBTransformFeedback2(FunctionProvider provider) {
		BindTransformFeedback = provider.getFunctionAddress("glBindTransformFeedback");
		DeleteTransformFeedbacks = provider.getFunctionAddress("glDeleteTransformFeedbacks");
		GenTransformFeedbacks = provider.getFunctionAddress("glGenTransformFeedbacks");
		IsTransformFeedback = provider.getFunctionAddress("glIsTransformFeedback");
		PauseTransformFeedback = provider.getFunctionAddress("glPauseTransformFeedback");
		ResumeTransformFeedback = provider.getFunctionAddress("glResumeTransformFeedback");
		DrawTransformFeedback = provider.getFunctionAddress("glDrawTransformFeedback");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBTransformFeedback2} instance for the current context. */
	public static ARBTransformFeedback2 getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBTransformFeedback2);
	}

	static ARBTransformFeedback2 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_transform_feedback2") ) return null;

		ARBTransformFeedback2 funcs = new ARBTransformFeedback2(provider);

		boolean supported = checkFunctions(
			funcs.BindTransformFeedback, funcs.DeleteTransformFeedbacks, funcs.GenTransformFeedbacks, funcs.IsTransformFeedback, funcs.PauseTransformFeedback, 
			funcs.ResumeTransformFeedback, funcs.DrawTransformFeedback
		);

		return GL.checkExtension("GL_ARB_transform_feedback2", funcs, supported);
	}

	// --- [ glBindTransformFeedback ] ---

	/**
	 * Binds a transform feedback object.
	 *
	 * @param target the target to which to bind the transform feedback object {@code id}. Must be:<br>{@link #GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}
	 * @param id     the name of a transform feedback object
	 */
	public static void glBindTransformFeedback(int target, int id) {
		long __functionAddress = getInstance().BindTransformFeedback;
		GL40.nglBindTransformFeedback(target, id, __functionAddress);
	}

	// --- [ glDeleteTransformFeedbacks ] ---

	/** Unsafe version of {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	@JavadocExclude
	public static void nglDeleteTransformFeedbacks(int n, long ids) {
		long __functionAddress = getInstance().DeleteTransformFeedbacks;
		GL40.nglDeleteTransformFeedbacks(n, ids, __functionAddress);
	}

	/**
	 * Deletes transform feedback objects.
	 *
	 * @param n   the number of transform feedback objects to delete
	 * @param ids an array of names of transform feedback objects to delete
	 */
	public static void glDeleteTransformFeedbacks(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglDeleteTransformFeedbacks(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	public static void glDeleteTransformFeedbacks(IntBuffer ids) {
		nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/** Single value version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
	public static void glDeleteTransformFeedbacks(int id) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam(id);
		nglDeleteTransformFeedbacks(1, __buffer.address(ids));
	}

	// --- [ glGenTransformFeedbacks ] ---

	/** Unsafe version of {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	@JavadocExclude
	public static void nglGenTransformFeedbacks(int n, long ids) {
		long __functionAddress = getInstance().GenTransformFeedbacks;
		GL40.nglGenTransformFeedbacks(n, ids, __functionAddress);
	}

	/**
	 * Reserves transform feedback object names.
	 *
	 * @param n   the number of transform feedback object names to reserve
	 * @param ids an array of into which the reserved names will be written
	 */
	public static void glGenTransformFeedbacks(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglGenTransformFeedbacks(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	public static void glGenTransformFeedbacks(IntBuffer ids) {
		nglGenTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
	public static int glGenTransformFeedbacks() {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglGenTransformFeedbacks(1, __buffer.address(ids));
		return __buffer.intValue(ids);
	}

	// --- [ glIsTransformFeedback ] ---

	/**
	 * Determines if a name corresponds to a transform feedback object.
	 *
	 * @param id a value that may be the name of a transform feedback object
	 */
	public static boolean glIsTransformFeedback(int id) {
		long __functionAddress = getInstance().IsTransformFeedback;
		return GL40.nglIsTransformFeedback(id, __functionAddress);
	}

	// --- [ glPauseTransformFeedback ] ---

	/**
	 * Pauses transform feedback operations for the currently bound transform feedback object.
	 * 
	 * <p>When transform feedback operations are paused, transform feedback is still considered active and changing most transform feedback state related to the
	 * object results in an error. However, a new transform feedback object may be bound while transform feedback is paused. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}
	 * is generated by PauseTransformFeedback if the currently bound transform feedback is not active or is paused.</p>
	 * 
	 * <p>When transform feedback is active and not paused, all geometric primitives generated must be compatible with the value of {@code primitiveMode} passed
	 * to {@link GL30#glBeginTransformFeedback BeginTransformFeedback}. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link GL11#glBegin Begin} or any operation that implicitly calls {@link GL11#glBegin Begin}
	 * (such as {@link GL11#glDrawElements DrawElements}) if {@code mode} is not one of the allowed modes. If a geometry shader is active, its output primitive type is used instead
	 * of the {@code mode} parameter passed to {@link GL11#glBegin Begin} for the purposes of this error check. Any primitive type may be used while transform feedback is
	 * paused.</p>
	 */
	public static void glPauseTransformFeedback() {
		long __functionAddress = getInstance().PauseTransformFeedback;
		GL40.nglPauseTransformFeedback(__functionAddress);
	}

	// --- [ glResumeTransformFeedback ] ---

	/**
	 * Resumes transform feedback operations for the currently bound transform feedback object.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link #glResumeTransformFeedback ResumeTransformFeedback} if the currently bound transform feedback is not active or is not paused.</p>
	 */
	public static void glResumeTransformFeedback() {
		long __functionAddress = getInstance().ResumeTransformFeedback;
		GL40.nglResumeTransformFeedback(__functionAddress);
	}

	// --- [ glDrawTransformFeedback ] ---

	/**
	 * Render primitives using a count derived from a transform feedback object.
	 *
	 * @param mode what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param id   the name of a transform feedback object from which to retrieve a primitive count
	 */
	public static void glDrawTransformFeedback(int mode, int id) {
		long __functionAddress = getInstance().DrawTransformFeedback;
		GL40.nglDrawTransformFeedback(mode, id, __functionAddress);
	}

}