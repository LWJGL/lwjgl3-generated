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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/vertex_array_range.txt">NV_vertex_array_range</a> extension.
 * 
 * <p>The goal of this extension is to permit extremely high vertex
 * processing rates via OpenGL vertex arrays even when the CPU lacks
 * the necessary data movement bandwidth to keep up with the rate
 * at which the vertex engine can consume vertices.</p>
 */
public class NVVertexArrayRange {

	/** Accepted by the {@code cap} parameter of EnableClientState, DisableClientState, and IsEnabled. */
	public static final int GL_VERTEX_ARRAY_RANGE_NV = 0x851D;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_VERTEX_ARRAY_RANGE_LENGTH_NV      = 0x851E,
		GL_VERTEX_ARRAY_RANGE_VALID_NV       = 0x851F,
		GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 0x8520;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 0x8521;

	/** Function address. */
	public final long
		VertexArrayRangeNV,
		FlushVertexArrayRangeNV;

	protected NVVertexArrayRange() {
		throw new UnsupportedOperationException();
	}

	public NVVertexArrayRange(FunctionProvider provider) {
		VertexArrayRangeNV = provider.getFunctionAddress("glVertexArrayRangeNV");
		FlushVertexArrayRangeNV = provider.getFunctionAddress("glFlushVertexArrayRangeNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVVertexArrayRange} instance of the current context. */
	public static NVVertexArrayRange getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link NVVertexArrayRange} instance of the specified {@link GLCapabilities}. */
	public static NVVertexArrayRange getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__NVVertexArrayRange);
	}

	static NVVertexArrayRange create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_vertex_array_range") ) return null;

		NVVertexArrayRange funcs = new NVVertexArrayRange(provider);

		boolean supported = checkFunctions(
			funcs.VertexArrayRangeNV, funcs.FlushVertexArrayRangeNV
		);

		return GL.checkExtension("GL_NV_vertex_array_range", funcs, supported);
	}

	// --- [ glVertexArrayRangeNV ] ---

	/** Unsafe version of {@link #glVertexArrayRangeNV VertexArrayRangeNV} */
	public static void nglVertexArrayRangeNV(int length, long pointer) {
		long __functionAddress = getInstance().VertexArrayRangeNV;
		callIPV(__functionAddress, length, pointer);
	}

	public static void glVertexArrayRangeNV(int length, ByteBuffer pointer) {
		nglVertexArrayRangeNV(length, memAddress(pointer));
	}

	// --- [ glFlushVertexArrayRangeNV ] ---

	public static void glFlushVertexArrayRangeNV() {
		long __functionAddress = getInstance().FlushVertexArrayRangeNV;
		callV(__functionAddress);
	}

}