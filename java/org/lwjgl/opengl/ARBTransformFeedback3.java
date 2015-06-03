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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/transform_feedback3.txt">ARB_transform_feedback3</a> extension.
 * 
 * <p>This extension further extends the transform feedback capabilities provided by the <a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a>,
 * <a href="http://www.opengl.org/registry/specs/NV/transform_feedback.txt">NV_transform_feedback</a>, and <a href="http://www.opengl.org/registry/specs/NV/transform_feedback2.txt">NV_transform_feedback2</a> extensions. Those extensions provided a new transform
 * feedback mode, where selected vertex attributes can be recorded to a buffer object for each primitive processed by the GL.</p>
 * 
 * <p>This extension provides increased flexibility in how vertex attributes can be written to buffer objects. Previous extensions allowed applications to
 * record a set of attributes interleaved into a single buffer object (interleaved mode) or to record into multiple objects, but with only a single
 * attribute per buffer (separate mode). This extension extends interleaved mode to write into multiple buffers, with multiple attributes per buffer. This
 * capability is supported for all three styles of transform feedback:
 * <ul>
 * <li>"EXT"-style GLSL transform feedback (<a href="http://www.opengl.org/registry/specs/EXT/transform_feedback.txt">EXT_transform_feedback</a>), where a list of varyings is provided prior to linking a
 * program object and is used whenever that program object is used.</li>
 * <li>"NV"-style GLSL transform feedback (<a href="http://www.opengl.org/registry/specs/NV/transform_feedback2.txt">NV_transform_feedback2</a>), where "locations" of active varyings are queried after linking
 * and are then passed to a function that sets the active transform feedback varyings for the program object. Unlike the "EXT"-style mode, the set of
 * varyings to capture can be changed without relinking.</li>
 * <li>Transform feedback for fixed-function or assembly vertex/geometry shaders (<a href="http://www.opengl.org/registry/specs/NV/transform_feedback2.txt">NV_transform_feedback2</a>), where applications
 * specify a set of canonical attribute enums/numbers to capture.</li>
 * </ul></p>
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
public final class ARBTransformFeedback3 {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70,
		GL_MAX_VERTEX_STREAMS             = 0x8E71;

	/** Function address. */
	@JavadocExclude
	public final long
		DrawTransformFeedbackStream,
		BeginQueryIndexed,
		EndQueryIndexed,
		GetQueryIndexediv;

	@JavadocExclude
	public ARBTransformFeedback3(FunctionProvider provider) {
		DrawTransformFeedbackStream = provider.getFunctionAddress("glDrawTransformFeedbackStream");
		BeginQueryIndexed = provider.getFunctionAddress("glBeginQueryIndexed");
		EndQueryIndexed = provider.getFunctionAddress("glEndQueryIndexed");
		GetQueryIndexediv = provider.getFunctionAddress("glGetQueryIndexediv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBTransformFeedback3} instance for the current context. */
	public static ARBTransformFeedback3 getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBTransformFeedback3);
	}

	static ARBTransformFeedback3 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_transform_feedback3") ) return null;

		ARBTransformFeedback3 funcs = new ARBTransformFeedback3(provider);

		boolean supported = checkFunctions(
			funcs.DrawTransformFeedbackStream, funcs.BeginQueryIndexed, funcs.EndQueryIndexed, funcs.GetQueryIndexediv
		);

		return GL.checkExtension("GL_ARB_transform_feedback3", funcs, supported);
	}

	// --- [ glDrawTransformFeedbackStream ] ---

	/**
	 * Renders primitives using a count derived from a specifed stream of a transform feedback object.
	 *
	 * @param mode   what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param id     the name of a transform feedback object from which to retrieve a primitive count
	 * @param stream the index of the transform feedback stream from which to retrieve a primitive count
	 */
	public static void glDrawTransformFeedbackStream(int mode, int id, int stream) {
		long __functionAddress = getInstance().DrawTransformFeedbackStream;
		GL40.nglDrawTransformFeedbackStream(mode, id, stream, __functionAddress);
	}

	// --- [ glBeginQueryIndexed ] ---

	/**
	 * Begins a query object on an indexed target
	 *
	 * @param target the target type of query object established between {@code glBeginQueryIndexed} and the subsequent {@link GL40#glEndQueryIndexed EndQueryIndexed}. One of:<br>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query target upon which to begin the query
	 * @param id     the name of a query object
	 */
	public static void glBeginQueryIndexed(int target, int index, int id) {
		long __functionAddress = getInstance().BeginQueryIndexed;
		GL40.nglBeginQueryIndexed(target, index, id, __functionAddress);
	}

	// --- [ glEndQueryIndexed ] ---

	/**
	 * Ends a query object on an indexed target
	 *
	 * @param target the target type of query object to be concluded. One of:<br>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query target upon which to end the query
	 */
	public static void glEndQueryIndexed(int target, int index) {
		long __functionAddress = getInstance().EndQueryIndexed;
		GL40.nglEndQueryIndexed(target, index, __functionAddress);
	}

	// --- [ glGetQueryIndexediv ] ---

	/** Unsafe version of {@link #glGetQueryIndexediv GetQueryIndexediv} */
	@JavadocExclude
	public static void nglGetQueryIndexediv(int target, int index, int pname, long params) {
		long __functionAddress = getInstance().GetQueryIndexediv;
		GL40.nglGetQueryIndexediv(target, index, pname, params, __functionAddress);
	}

	/**
	 * Returns parameters of an indexed query object target.
	 *
	 * @param target a query object target. One of:<br>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param index  the index of the query object target
	 * @param pname  the symbolic name of a query object target parameter
	 * @param params the requested data
	 */
	public static void glGetQueryIndexediv(int target, int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetQueryIndexediv(target, index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryIndexediv GetQueryIndexediv} */
	public static void glGetQueryIndexediv(int target, int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryIndexediv(target, index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryIndexediv GetQueryIndexediv} */
	public static int glGetQueryIndexedi(int target, int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetQueryIndexediv(target, index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}