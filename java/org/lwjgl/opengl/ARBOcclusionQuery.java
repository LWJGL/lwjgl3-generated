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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/occlusion_query.txt">ARB_occlusion_query</a> extension.
 * 
 * <p>This extension defines a mechanism whereby an application can query the number of pixels (or, more precisely, samples) drawn by a primitive or group of
 * primitives.</p>
 * 
 * <p>The primary purpose of such a query (hereafter referred to as an "occlusion query") is to determine the visibility of an object. Typically, the
 * application will render the major occluders in the scene, then perform an occlusion query for the bounding box of each detail object in the scene. Only
 * if said bounding box is visible, i.e., if at least one sample is drawn, should the corresponding object be drawn.</p>
 * 
 * <p>The earlier <a href="http://www.opengl.org/registry/specs/HP/occlusion_test.txt">HP_occlusion_test</a> extension defined a similar mechanism, but it had two major shortcomings.</p>
 * 
 * <ul>
 * <li>It returned the result as a simple {@link GL11#GL_TRUE TRUE}/{@link GL11#GL_FALSE FALSE} result, when in fact it is often useful to know exactly how many samples were drawn.</li>
 * <li>It provided only a simple "stop-and-wait" model for using multiple queries. The application begins an occlusion test and ends it; then, at some
 * later point, it asks for the result, at which point the driver must stop and wait until the result from the previous test is back before the
 * application can even begin the next one. This is a very simple model, but its performance is mediocre when an application wishes to perform many
 * queries, and it eliminates most of the opportunities for parallelism between the CPU and GPU.</li>
 * </ul>
 * 
 * <p>This extension solves both of those problems. It returns as its result the number of samples that pass the depth and stencil tests, and it encapsulates
 * occlusion queries in "query objects" that allow applications to issue many queries before asking for the result of any one. As a result, they can
 * overlap the time it takes for the occlusion query results to be returned with other, more useful work, such as rendering other parts of the scene or
 * performing other computations on the CPU.</p>
 * 
 * <p>There are many situations where a pixel/sample count, rather than a boolean result, is useful.</p>
 * 
 * <ul>
 * <li>Objects that are visible but cover only a very small number of pixels can be skipped at a minimal reduction of image quality.</li>
 * <li>Knowing exactly how many pixels an object might cover may help the application decide which level-of-detail model should be used. If only a few
 * pixels are visible, a low-detail model may be acceptable.</li>
 * <li>"Depth peeling" techniques, such as order-independent transparency, need to know when to stop rendering more layers; it is difficult to determine a
 * priori how many layers are needed. A boolean result allows applications to stop when more layers will not affect the image at all, but this will
 * likely result in unacceptable performance. Instead, it makes more sense to stop rendering when the number of pixels in each layer falls below a
 * given threshold.</li>
 * <li>Occlusion queries can replace glReadPixels of the depth buffer to determine whether (for example) a light source is visible for the purposes of a
 * lens flare effect or a halo to simulate glare. Pixel counts allow you to compute the percentage of the light source that is visible, and the
 * brightness of these effects can be modulated accordingly.</li>
 * </ul>
 * 
 * <p>Promoted to core in {@link GL15 OpenGL 1.5}.</p>
 */
public class ARBOcclusionQuery {

	/** Accepted by the {@code target} parameter of BeginQueryARB, EndQueryARB, and GetQueryivARB. */
	public static final int GL_SAMPLES_PASSED_ARB = 0x8914;

	/** Accepted by the {@code pname} parameter of GetQueryivARB. */
	public static final int
		GL_QUERY_COUNTER_BITS_ARB = 0x8864,
		GL_CURRENT_QUERY_ARB      = 0x8865;

	/** Accepted by the {@code pname} parameter of GetQueryObjectivARB and GetQueryObjectuivARB. */
	public static final int
		GL_QUERY_RESULT_ARB           = 0x8866,
		GL_QUERY_RESULT_AVAILABLE_ARB = 0x8867;

	protected ARBOcclusionQuery() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGenQueriesARB, caps.glDeleteQueriesARB, caps.glIsQueryARB, caps.glBeginQueryARB, caps.glEndQueryARB, caps.glGetQueryivARB, 
			caps.glGetQueryObjectivARB, caps.glGetQueryObjectuivARB
		);
	}

	// --- [ glGenQueriesARB ] ---

	/**
	 * Generates query object names.
	 *
	 * @param n   the number of query object names to be generated
	 * @param ids a buffer in which the generated query object names are stored
	 */
	public static void nglGenQueriesARB(int n, long ids) {
		long __functionAddress = GL.getCapabilities().glGenQueriesARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	/**
	 * Generates query object names.
	 *
	 * @param ids a buffer in which the generated query object names are stored
	 */
	public static void glGenQueriesARB(IntBuffer ids) {
		nglGenQueriesARB(ids.remaining(), memAddress(ids));
	}

	/** Generates query object names. */
	public static int glGenQueriesARB() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.callocInt(1);
			nglGenQueriesARB(1, memAddress(ids));
			return ids.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteQueriesARB ] ---

	/**
	 * Deletes named query objects.
	 *
	 * @param n   the number of query objects to be deleted
	 * @param ids an array of query objects to be deleted
	 */
	public static void nglDeleteQueriesARB(int n, long ids) {
		long __functionAddress = GL.getCapabilities().glDeleteQueriesARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	/**
	 * Deletes named query objects.
	 *
	 * @param ids an array of query objects to be deleted
	 */
	public static void glDeleteQueriesARB(IntBuffer ids) {
		nglDeleteQueriesARB(ids.remaining(), memAddress(ids));
	}

	/** Deletes named query objects. */
	public static void glDeleteQueriesARB(int id) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.ints(id);
			nglDeleteQueriesARB(1, memAddress(ids));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsQueryARB ] ---

	/**
	 * Determine if a name corresponds to a query object.
	 *
	 * @param id a value that may be the name of a query object
	 */
	public static boolean glIsQueryARB(int id) {
		long __functionAddress = GL.getCapabilities().glIsQueryARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, id);
	}

	// --- [ glBeginQueryARB ] ---

	/**
	 * Creates a query object and makes it active.
	 *
	 * @param target the target type of query object established. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param id     the name of a query object
	 */
	public static void glBeginQueryARB(int target, int id) {
		long __functionAddress = GL.getCapabilities().glBeginQueryARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, id);
	}

	// --- [ glEndQueryARB ] ---

	/**
	 * Marks the end of the sequence of commands to be tracked for the active query specified by {@code target}.
	 *
	 * @param target the query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 */
	public static void glEndQueryARB(int target) {
		long __functionAddress = GL.getCapabilities().glEndQueryARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target);
	}

	// --- [ glGetQueryivARB ] ---

	/**
	 * Returns parameters of a query object target.
	 *
	 * @param target the query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param pname  the symbolic name of a query object target parameter. One of:<br><table><tr><td>{@link #GL_QUERY_COUNTER_BITS_ARB QUERY_COUNTER_BITS_ARB}</td><td>{@link #GL_CURRENT_QUERY_ARB CURRENT_QUERY_ARB}</td></tr></table>
	 * @param params the requested data
	 */
	public static void nglGetQueryivARB(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetQueryivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Returns parameters of a query object target.
	 *
	 * @param target the query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param pname  the symbolic name of a query object target parameter. One of:<br><table><tr><td>{@link #GL_QUERY_COUNTER_BITS_ARB QUERY_COUNTER_BITS_ARB}</td><td>{@link #GL_CURRENT_QUERY_ARB CURRENT_QUERY_ARB}</td></tr></table>
	 * @param params the requested data
	 */
	public static void glGetQueryivARB(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryivARB(target, pname, memAddress(params));
	}

	/**
	 * Returns parameters of a query object target.
	 *
	 * @param target the query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param pname  the symbolic name of a query object target parameter. One of:<br><table><tr><td>{@link #GL_QUERY_COUNTER_BITS_ARB QUERY_COUNTER_BITS_ARB}</td><td>{@link #GL_CURRENT_QUERY_ARB CURRENT_QUERY_ARB}</td></tr></table>
	 */
	public static int glGetQueryiARB(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryivARB(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetQueryObjectivARB ] ---

	/**
	 * Returns the integer value of a query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT_ARB QUERY_RESULT_ARB}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE_ARB QUERY_RESULT_AVAILABLE_ARB}</td></tr></table>
	 * @param params the requested data
	 */
	public static void nglGetQueryObjectivARB(int id, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetQueryObjectivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	/**
	 * Returns the integer value of a query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT_ARB QUERY_RESULT_ARB}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE_ARB QUERY_RESULT_AVAILABLE_ARB}</td></tr></table>
	 * @param params the requested data
	 */
	public static void glGetQueryObjectivARB(int id, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectivARB(id, pname, memAddress(params));
	}

	/**
	 * Returns the integer value of a query object parameter.
	 *
	 * @param id    the name of a query object
	 * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT_ARB QUERY_RESULT_ARB}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE_ARB QUERY_RESULT_AVAILABLE_ARB}</td></tr></table>
	 */
	public static int glGetQueryObjectiARB(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryObjectivARB(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetQueryObjectuivARB ] ---

	/**
	 * Unsigned version of {@link #glGetQueryObjectivARB GetQueryObjectivARB}.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT_ARB QUERY_RESULT_ARB}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE_ARB QUERY_RESULT_AVAILABLE_ARB}</td></tr></table>
	 * @param params the requested data
	 */
	public static void nglGetQueryObjectuivARB(int id, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetQueryObjectuivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	/**
	 * Unsigned version of {@link #glGetQueryObjectivARB GetQueryObjectivARB}.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT_ARB QUERY_RESULT_ARB}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE_ARB QUERY_RESULT_AVAILABLE_ARB}</td></tr></table>
	 * @param params the requested data
	 */
	public static void glGetQueryObjectuivARB(int id, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectuivARB(id, pname, memAddress(params));
	}

	/**
	 * Unsigned version of {@link #glGetQueryObjectivARB GetQueryObjectivARB}.
	 *
	 * @param id    the name of a query object
	 * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link #GL_QUERY_RESULT_ARB QUERY_RESULT_ARB}</td><td>{@link #GL_QUERY_RESULT_AVAILABLE_ARB QUERY_RESULT_AVAILABLE_ARB}</td></tr></table>
	 */
	public static int glGetQueryObjectuiARB(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetQueryObjectuivARB(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGenQueriesARB GenQueriesARB} */
	public static void glGenQueriesARB(int[] ids) {
		long __functionAddress = GL.getCapabilities().glGenQueriesARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glDeleteQueriesARB DeleteQueriesARB} */
	public static void glDeleteQueriesARB(int[] ids) {
		long __functionAddress = GL.getCapabilities().glDeleteQueriesARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glGetQueryivARB GetQueryivARB} */
	public static void glGetQueryivARB(int target, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetQueryivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
	}

	/** Array version of: {@link #glGetQueryObjectivARB GetQueryObjectivARB} */
	public static void glGetQueryObjectivARB(int id, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetQueryObjectivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

	/** Array version of: {@link #glGetQueryObjectuivARB GetQueryObjectuivARB} */
	public static void glGetQueryObjectuivARB(int id, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetQueryObjectuivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

}