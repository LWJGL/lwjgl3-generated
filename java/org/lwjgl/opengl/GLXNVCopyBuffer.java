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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/glx_copy_buffer.txt">GLX_NV_copy_buffer</a> extension.
 * 
 * <p>Extends {@link ARBCopyBuffer ARB_copy_buffer} to have GLX bindings.</p>
 */
public final class GLXNVCopyBuffer {

	/** Function address. */
	@JavadocExclude
	public final long
		CopyBufferSubDataNV,
		NamedCopyBufferSubDataNV;

	@JavadocExclude
	public GLXNVCopyBuffer(FunctionProvider provider) {
		CopyBufferSubDataNV = provider.getFunctionAddress("glXCopyBufferSubDataNV");
		NamedCopyBufferSubDataNV = provider.getFunctionAddress("glXNamedCopyBufferSubDataNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXNVCopyBuffer} instance for the current context. */
	public static GLXNVCopyBuffer getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXNVCopyBuffer);
	}

	static GLXNVCopyBuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_NV_copy_buffer") ) return null;

		GLXNVCopyBuffer funcs = new GLXNVCopyBuffer(provider);

		boolean supported = checkFunctions(
			funcs.CopyBufferSubDataNV, funcs.NamedCopyBufferSubDataNV
		);

		return GL.checkExtension("GLX_NV_copy_buffer", funcs, supported);
	}

	// --- [ glXCopyBufferSubDataNV ] ---

	/**
	 * 
	 *
	 * @param display     the connection to the X server
	 * @param readCtx     
	 * @param writeCtx    
	 * @param readTarget  
	 * @param writeTarget 
	 * @param readOffset  
	 * @param writeOffset 
	 * @param size        
	 */
	public static void glXCopyBufferSubDataNV(long display, long readCtx, long writeCtx, int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().CopyBufferSubDataNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(readCtx);
			checkPointer(writeCtx);
		}
		callPPPIIPPPV(__functionAddress, display, readCtx, writeCtx, readTarget, writeTarget, readOffset, writeOffset, size);
	}

	// --- [ glXNamedCopyBufferSubDataNV ] ---

	/**
	 * 
	 *
	 * @param display     the connection to the X server
	 * @param readCtx     
	 * @param writeCtx    
	 * @param readBuffer  
	 * @param writeBuffer 
	 * @param readOffset  
	 * @param writeOffset 
	 * @param size        
	 */
	public static void glXNamedCopyBufferSubDataNV(long display, long readCtx, long writeCtx, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().NamedCopyBufferSubDataNV;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkPointer(readCtx);
			checkPointer(writeCtx);
		}
		callPPPIIPPPV(__functionAddress, display, readCtx, writeCtx, readBuffer, writeBuffer, readOffset, writeOffset, size);
	}

}