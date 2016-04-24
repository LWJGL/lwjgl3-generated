/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class WGLNVVertexArrayRange {

	protected WGLNVVertexArrayRange() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(WGLCapabilities caps) {
		return checkFunctions(
			caps.wglAllocateMemoryNV, caps.wglFreeMemoryNV
		);
	}

	// --- [ wglAllocateMemoryNV ] ---

	public static long nwglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
		long __functionAddress = GL.getCapabilitiesWGL().wglAllocateMemoryNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress, size, readfreq, writefreq, priority);
	}

	public static ByteBuffer wglAllocateMemoryNV(int size, float readfreq, float writefreq, float priority) {
		long __result = nwglAllocateMemoryNV(size, readfreq, writefreq, priority);
		return memByteBuffer(__result, size);
	}

	// --- [ wglFreeMemoryNV ] ---

	public static void nwglFreeMemoryNV(long pointer) {
		long __functionAddress = GL.getCapabilitiesWGL().wglFreeMemoryNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pointer);
	}

	public static void wglFreeMemoryNV(ByteBuffer pointer) {
		nwglFreeMemoryNV(memAddress(pointer));
	}

}