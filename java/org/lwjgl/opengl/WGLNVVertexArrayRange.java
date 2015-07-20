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

	/** JNI method for {@link #wglAllocateMemoryNV AllocateMemoryNV} */
	@JavadocExclude
	public static native long nwglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority, long __functionAddress);

	/** Unsafe version of {@link #wglAllocateMemoryNV AllocateMemoryNV} */
	@JavadocExclude
	public static long nwglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
		long __functionAddress = getInstance().AllocateMemoryNV;
		return nwglAllocateMemoryNV(size, readfreq, writefreq, priority, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param size      
	 * @param readfreq  
	 * @param writefreq 
	 * @param priority  
	 */
	public static ByteBuffer wglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
		long __result = nwglAllocateMemoryNV(size, readfreq, writefreq, priority);
		return memByteBuffer(__result, (int)size);
	}

	// --- [ wglFreeMemoryNV ] ---

	/** JNI method for {@link #wglFreeMemoryNV FreeMemoryNV} */
	@JavadocExclude
	public static native void nwglFreeMemoryNV(long pointer, long __functionAddress);

	/** Unsafe version of {@link #wglFreeMemoryNV FreeMemoryNV} */
	@JavadocExclude
	public static void nwglFreeMemoryNV(long pointer) {
		long __functionAddress = getInstance().FreeMemoryNV;
		nwglFreeMemoryNV(pointer, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param pointer 
	 */
	public static void wglFreeMemoryNV(ByteBuffer pointer) {
		nwglFreeMemoryNV(memAddress(pointer));
	}

}