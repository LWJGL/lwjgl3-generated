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

public final class WGLNVVertexArrayRange {

	/** Function address. */
	@JavadocExclude
	public final long
		AllocateMemoryNV,
		FreeMemoryNV;

	@JavadocExclude
	public WGLNVVertexArrayRange(FunctionProvider provider) {
		AllocateMemoryNV = provider.getFunctionAddress("wglAllocateMemoryNV");
		FreeMemoryNV = provider.getFunctionAddress("wglFreeMemoryNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLNVVertexArrayRange} instance for the current context. */
	public static WGLNVVertexArrayRange getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLNVVertexArrayRange);
	}

	static WGLNVVertexArrayRange create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_NV_vertex_array_range") ) return null;

		WGLNVVertexArrayRange funcs = new WGLNVVertexArrayRange(provider);

		boolean supported = checkFunctions(
			funcs.AllocateMemoryNV, funcs.FreeMemoryNV
		);

		return GL.checkExtension("WGL_NV_vertex_array_range", funcs, supported);
	}

	// --- [ wglAllocateMemoryNV ] ---

	/** Unsafe version of {@link #wglAllocateMemoryNV AllocateMemoryNV} */
	@JavadocExclude
	public static long nwglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
		long __functionAddress = getInstance().AllocateMemoryNV;
		return callIFFFP(__functionAddress, size, readfreq, writefreq, priority);
	}

	public static ByteBuffer wglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
		long __result = nwglAllocateMemoryNV(size, readfreq, writefreq, priority);
		return memByteBuffer(__result, size);
	}

	// --- [ wglFreeMemoryNV ] ---

	/** Unsafe version of {@link #wglFreeMemoryNV FreeMemoryNV} */
	@JavadocExclude
	public static void nwglFreeMemoryNV(long pointer) {
		long __functionAddress = getInstance().FreeMemoryNV;
		callPV(__functionAddress, pointer);
	}

	public static void wglFreeMemoryNV(ByteBuffer pointer) {
		nwglFreeMemoryNV(memAddress(pointer));
	}

}