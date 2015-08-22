/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/compiled_vertex_array.txt">EXT_compiled_vertex_array</a> extension.
 * 
 * <p>This extension defines an interface which allows static vertex array data to be cached or pre-compiled for more efficient rendering. This is useful for
 * implementations which can cache the transformed results of array data for reuse by several DrawArrays, ArrayElement, or DrawElements commands. It is
 * also useful for implementations which can transfer array data to fast memory for more efficient processing.</p>
 * 
 * <p>For example, rendering an M by N mesh of quadrilaterals can be accomplished by setting up vertex arrays containing all of the vertexes in the mesh and
 * issuing M DrawElements commands each of which operate on 2 * N vertexes. Each DrawElements command after the first will share N vertexes with the
 * preceding DrawElements command. If the vertex array data is locked while the DrawElements commands are executed, then OpenGL may be able to transform
 * each of these shared vertexes just once.</p>
 */
public final class EXTCompiledVertexArray {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 0x81A8,
		GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 0x81A9;

	/** Function address. */
	@JavadocExclude
	public final long
		LockArraysEXT,
		UnlockArraysEXT;

	@JavadocExclude
	public EXTCompiledVertexArray(FunctionProvider provider) {
		LockArraysEXT = provider.getFunctionAddress("glLockArraysEXT");
		UnlockArraysEXT = provider.getFunctionAddress("glUnlockArraysEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTCompiledVertexArray} instance for the current context. */
	public static EXTCompiledVertexArray getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTCompiledVertexArray);
	}

	static EXTCompiledVertexArray create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_compiled_vertex_array") ) return null;

		EXTCompiledVertexArray funcs = new EXTCompiledVertexArray(provider);

		boolean supported = checkFunctions(
			funcs.LockArraysEXT, funcs.UnlockArraysEXT
		);

		return GL.checkExtension("GL_EXT_compiled_vertex_array", funcs, supported);
	}

	// --- [ glLockArraysEXT ] ---

	public static void glLockArraysEXT(int first, int count) {
		long __functionAddress = getInstance().LockArraysEXT;
		callIIV(__functionAddress, first, count);
	}

	// --- [ glUnlockArraysEXT ] ---

	public static void glUnlockArraysEXT() {
		long __functionAddress = getInstance().UnlockArraysEXT;
		callV(__functionAddress);
	}

}