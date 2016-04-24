/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_copy_buffer.txt">NV_copy_buffer</a> extension.
 * 
 * <p>This extension provides a mechanism to do an accelerated copy from one buffer object to another. This may be useful to load buffer objects in a
 * "loading thread" while minimizing cost and synchronization effort in the "rendering thread."</p>
 */
public class NVCopyBuffer {

	/**
	 * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBufferOES, UnmapBufferOES, GetBufferPointervOES, GetBufferParameteriv and
	 * CopyBufferSubDataNV.
	 */
	public static final int
		GL_COPY_READ_BUFFER_NV  = 0x8F36,
		GL_COPY_WRITE_BUFFER_NV = 0x8F37;

	protected NVCopyBuffer() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glCopyBufferSubDataNV
		);
	}

	// --- [ glCopyBufferSubDataNV ] ---

	public static void glCopyBufferSubDataNV(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
		long __functionAddress = GLES.getCapabilities().glCopyBufferSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, readTarget, writeTarget, readOffset, writeOffset, size);
	}

}