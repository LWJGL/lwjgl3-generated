/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_copy_buffer.txt">NV_copy_buffer</a> extension.
 * 
 * <p>This extension provides a mechanism to do an accelerated copy from one buffer object to another. This may be useful to load buffer objects in a
 * "loading thread" while minimizing cost and synchronization effort in the "rendering thread."</p>
 */
public final class NVCopyBuffer {

	/**
	 * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBufferOES, UnmapBufferOES, GetBufferPointervOES, GetBufferParameteriv and
	 * CopyBufferSubDataNV.
	 */
	public static final int
		GL_COPY_READ_BUFFER_NV  = 0x8F36,
		GL_COPY_WRITE_BUFFER_NV = 0x8F37;

	/** Function address. */
	@JavadocExclude
	public final long CopyBufferSubDataNV;

	@JavadocExclude
	public NVCopyBuffer(FunctionProvider provider) {
		CopyBufferSubDataNV = provider.getFunctionAddress("glCopyBufferSubDataNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVCopyBuffer} instance for the current context. */
	public static NVCopyBuffer getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVCopyBuffer);
	}

	static NVCopyBuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_copy_buffer") ) return null;

		NVCopyBuffer funcs = new NVCopyBuffer(provider);
		boolean supported = checkFunctions(
			funcs.CopyBufferSubDataNV
		);

		return GLES.checkExtension("GL_NV_copy_buffer", funcs, supported);
	}

	// --- [ glCopyBufferSubDataNV ] ---

	public static void glCopyBufferSubDataNV(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().CopyBufferSubDataNV;
		callIIPPPV(__functionAddress, readTarget, writeTarget, readOffset, writeOffset, size);
	}

}