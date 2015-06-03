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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/provoking_vertex.txt">ARB_provoking_vertex</a> extension.
 * 
 * <p>This extension provides an alternative provoking vertex convention for rendering lines, triangles, and (optionally depending on the implementation)
 * quads.</p>
 * 
 * <p>The provoking vertex of a primitive is the vertex that determines the constant primary and secondary colors when flat shading is enabled.</p>
 * 
 * <p>In OpenGL, the provoking vertex for triangle, quad, line, and (trivially) point primitives is the last vertex used to assemble the primitive. The
 * polygon primitive is an exception in OpenGL where the first vertex of a polygon primitive determines the color of the polygon, even if actually broken
 * into triangles and/or quads.</p>
 * 
 * <p>Alternatively the provoking vertex could be the first vertex of the primitive. Other APIs with flat-shading functionality such as Reality Lab and
 * Direct3D have adopted the "first vertex of the primitive" convention to determine the provoking vertex. However, these APIs lack quads so do not have a
 * defined provoking vertex convention for quads.</p>
 * 
 * <p>The motivation for this extension is to allow applications developed for APIs with a "first vertex of the primitive" provoking vertex to be easily
 * converted to OpenGL.</p>
 * 
 * <p>Promoted to core in {@link GL32 OpenGL 3.2}.</p>
 */
public final class ARBProvokingVertex {

	/** Accepted by the {@code mode} parameter of ProvokingVertex. */
	public static final int
		GL_FIRST_VERTEX_CONVENTION = 0x8E4D,
		GL_LAST_VERTEX_CONVENTION  = 0x8E4E;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_PROVOKING_VERTEX                         = 0x8E4F,
		GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;

	/** Function address. */
	@JavadocExclude
	public final long ProvokingVertex;

	@JavadocExclude
	public ARBProvokingVertex(FunctionProvider provider) {
		ProvokingVertex = provider.getFunctionAddress("glProvokingVertex");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBProvokingVertex} instance for the current context. */
	public static ARBProvokingVertex getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBProvokingVertex);
	}

	static ARBProvokingVertex create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_provoking_vertex") ) return null;

		ARBProvokingVertex funcs = new ARBProvokingVertex(provider);

		boolean supported = checkFunctions(
			funcs.ProvokingVertex
		);

		return GL.checkExtension("GL_ARB_provoking_vertex", funcs, supported);
	}

	// --- [ glProvokingVertex ] ---

	/**
	 * Specifies the vertex to be used as the source of data for flat shaded varyings.
	 *
	 * @param mode the provoking vertex mode. One of:<br>{@link #GL_FIRST_VERTEX_CONVENTION FIRST_VERTEX_CONVENTION}, {@link #GL_LAST_VERTEX_CONVENTION LAST_VERTEX_CONVENTION}
	 */
	public static void glProvokingVertex(int mode) {
		long __functionAddress = getInstance().ProvokingVertex;
		GL32.nglProvokingVertex(mode, __functionAddress);
	}

}