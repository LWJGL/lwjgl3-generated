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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/transform_feedback3.txt">ARB_transform_feedback3</a> extension.
 * 
 * <p>This extension further extends the transform feedback capabilities provided by the <a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a>,
 * <a href="http://www.opengl.org/registry/specs/NV/transform_feedback.txt">NV_transform_feedback</a>, and <a href="http://www.opengl.org/registry/specs/NV/transform_feedback2.txt">NV_transform_feedback2</a> extensions. Those extensions provided a new transform
 * feedback mode, where selected vertex attributes can be recorded to a buffer object for each primitive processed by the GL.</p>
 * 
 * <p>This extension provides increased flexibility in how vertex attributes can be written to buffer objects. Previous extensions allowed applications to
 * record a set of attributes interleaved into a single buffer object (interleaved mode) or to record into multiple objects, but with only a single
 * attribute per buffer (separate mode). This extension extends interleaved mode to write into multiple buffers, with multiple attributes per buffer. This
 * capability is supported for all three styles of transform feedback:</p>
 * 
 * <ul>
 * <li>"EXT"-style GLSL transform feedback (<a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a>), where a list of varyings is provided prior to linking a
 * program object and is used whenever that program object is used.</li>
 * <li>"NV"-style GLSL transform feedback (<a href="http://www.opengl.org/registry/specs/NV/transform_feedback2.txt">NV_transform_feedback2</a>), where "locations" of active varyings are queried after linking
 * and are then passed to a function that sets the active transform feedback varyings for the program object. Unlike the "EXT"-style mode, the set of
 * varyings to capture can be changed without relinking.</li>
 * <li>Transform feedback for fixed-function or assembly vertex/geometry shaders (<a href="http://www.opengl.org/registry/specs/NV/transform_feedback2.txt">NV_transform_feedback2</a>), where applications
 * specify a set of canonical attribute enums/numbers to capture.</li>
 * </ul>
 * 
 * <p>Additionally, this extension adds new support for multiple separate vertex streams. New geometry shader functionality provided by the
 * {@link ARBGPUShader5 ARB_gpu_shader5} and <a href="http://www.opengl.org/registry/specs/NV/gpu_program5.txt">NV_gpu_program5</a> extensions allows geometry shaders to direct each vertex arbitrarily at a specified
 * vertex stream. For example, a geometry program might write each "regular" vertex it emits to one vertex stream while writing some per-primitive data it
 * computes to a second vertex stream. This extension allows applications to choose a vertex stream for each buffer object it writes to, and allows the
 * vertices written to each vertex stream to be recorded in separate buffer objects. Only one stream may be selected for rasterization, and in the initial
 * implementation, the geometry shader output topology must be {@link GL11#GL_POINTS POINTS} if multiple streams are used. When geometry shaders are not used, or when an old
 * geometry shader not writing multiple streams is used, all vertices produced by the GL are directed at the stream numbered zero. The set of transform
 * feedback-related query targets is extended to accommodate multiple vertex streams, so it is possible to count the number of processed and recorded
 * primitives for each stream separately.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} or <a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a> or <a href="http://www.opengl.org/registry/specs/NV/transform_feedback.txt">NV_transform_feedback</a>. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBTransformFeedback3 {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70,
		GL_MAX_VERTEX_STREAMS             = 0x8E71;

	protected ARBTransformFeedback3() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glDrawTransformFeedbackStream, caps.glBeginQueryIndexed, caps.glEndQueryIndexed, caps.glGetQueryIndexediv
		);
	}

	// --- [ glDrawTransformFeedbackStream ] ---

	/**
	 * Renders primitives using a count derived from a specifed stream of a transform feedback object.
	 *
	 * @param mode   what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 * @param id     the name of a transform feedback object from which to retrieve a primitive count
	 * @param stream the index of the transform feedback stream from which to retrieve a primitive count
	 */
	public static void glDrawTransformFeedbackStream(int mode, int id, int stream) {
		long __functionAddress = GL.getCapabilities().glDrawTransformFeedbackStream;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mode, id, stream);
	}

	// --- [ glBeginQueryIndexed ] ---

	/**
	 * Begins a query object on an indexed target
	 *
	 * @param target the target type of query object established between {@code glBeginQueryIndexed} and the subsequent {@link #glEndQueryIndexed EndQueryIndexed}. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param index  the index of the query target upon which to begin the query
	 * @param id     the name of a query object
	 */
	public static void glBeginQueryIndexed(int target, int index, int id) {
		long __functionAddress = GL.getCapabilities().glBeginQueryIndexed;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index, id);
	}

	// --- [ glEndQueryIndexed ] ---

	/**
	 * Ends a query object on an indexed target
	 *
	 * @param target the target type of query object to be concluded. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param index  the index of the query target upon which to end the query
	 */
	public static void glEndQueryIndexed(int target, int index) {
		long __functionAddress = GL.getCapabilities().glEndQueryIndexed;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index);
	}

	// --- [ glGetQueryIndexediv ] ---

	/**
	 * Returns parameters of an indexed query object target.
	 *
	 * @param target a query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param index  the index of the query object target
	 * @param pname  the symbolic name of a query object target parameter
	 * @param params the requested data
	 */
	public static void nglGetQueryIndexediv(int target, int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetQueryIndexediv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, pname, params);
	}

	/**
	 * Returns parameters of an indexed query object target.
	 *
	 * @param target a query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param index  the index of the query object target
	 * @param pname  the symbolic name of a query object target parameter
	 * @param params the requested data
	 */
	public static void glGetQueryIndexediv(int target, int index, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryIndexediv(target, index, pname, memAddress(params));
	}

	/**
	 * Returns parameters of an indexed query object target.
	 *
	 * @param target a query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param index  the index of the query object target
	 * @param pname  the symbolic name of a query object target parameter
	 */
	public static int glGetQueryIndexedi(int target, int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryIndexediv(target, index, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetQueryIndexediv GetQueryIndexediv} */
	public static void glGetQueryIndexediv(int target, int index, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetQueryIndexediv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, index, pname, params);
	}

}