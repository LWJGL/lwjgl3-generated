/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/transform_feedback_instanced.txt">ARB_transform_feedback_instanced</a> extension.
 * 
 * <p>Multiple instances of geometry may be specified to the GL by calling functions such as {@link GL31#glDrawArraysInstanced DrawArraysInstanced} and {@link GL31#glDrawElementsInstanced DrawElementsInstanced}.
 * Further, the results of a transform feedback operation may be returned to the GL by calling {@link GL40#glDrawTransformFeedback DrawTransformFeedback}, or
 * {@link GL40#glDrawTransformFeedbackStream DrawTransformFeedbackStream}. However, it is not presently possible to draw multiple instances of data transform feedback without using a query
 * and the resulting round trip from server to client.</p>
 * 
 * <p>This extension adds functionality to draw multiple instances of the result of a transform feedback operation.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} or {@link ARBTransformFeedback2 ARB_transform_feedback2}. Requires {@link GL31 OpenGL 3.1} or {@link ARBDrawInstanced ARB_draw_instanced}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public final class ARBTransformFeedbackInstanced {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawTransformFeedbackInstanced,
		DrawTransformFeedbackStreamInstanced;

	@JavadocExclude
	public ARBTransformFeedbackInstanced(FunctionProvider provider) {
		DrawTransformFeedbackInstanced = provider.getFunctionAddress("glDrawTransformFeedbackInstanced");
		DrawTransformFeedbackStreamInstanced = provider.getFunctionAddress("glDrawTransformFeedbackStreamInstanced");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBTransformFeedbackInstanced} instance for the current context. */
	public static ARBTransformFeedbackInstanced getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBTransformFeedbackInstanced);
	}

	static ARBTransformFeedbackInstanced create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_transform_feedback_instanced") ) return null;

		ARBTransformFeedbackInstanced funcs = new ARBTransformFeedbackInstanced(provider);

		boolean supported = checkFunctions(
			funcs.DrawTransformFeedbackInstanced, funcs.DrawTransformFeedbackStreamInstanced
		);

		return GL.checkExtension("GL_ARB_transform_feedback_instanced", funcs, supported);
	}

	// --- [ glDrawTransformFeedbackInstanced ] ---

	/**
	 * Renders multiple instances of primitives using a count derived from a transform feedback object.
	 *
	 * @param mode      what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param id        the name of a transform feedback object from which to retrieve a primitive count
	 * @param primcount the number of instances of the geometry to render
	 */
	public static void glDrawTransformFeedbackInstanced(int mode, int id, int primcount) {
		long __functionAddress = getInstance().DrawTransformFeedbackInstanced;
		GL42.nglDrawTransformFeedbackInstanced(mode, id, primcount, __functionAddress);
	}

	// --- [ glDrawTransformFeedbackStreamInstanced ] ---

	/**
	 * Renders multiple instances of primitives using a count derived from a specifed stream of a transform feedback object.
	 *
	 * @param mode      what kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param id        the name of a transform feedback object from which to retrieve a primitive count
	 * @param stream    the index of the transform feedback stream from which to retrieve a primitive count
	 * @param primcount the number of instances of the geometry to render
	 */
	public static void glDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount) {
		long __functionAddress = getInstance().DrawTransformFeedbackStreamInstanced;
		GL42.nglDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount, __functionAddress);
	}

}