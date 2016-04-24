/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/glx_copy_buffer.txt">GLX_NV_copy_buffer</a> extension.
 * 
 * <p>Extends {@link ARBCopyBuffer ARB_copy_buffer} to have GLX bindings.</p>
 */
public class GLXNVCopyBuffer {

	protected GLXNVCopyBuffer() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXCopyBufferSubDataNV, caps.glXNamedCopyBufferSubDataNV
		);
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
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCopyBufferSubDataNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(readCtx);
			checkPointer(writeCtx);
		}
		callPPPPPPV(__functionAddress, display, readCtx, writeCtx, readTarget, writeTarget, readOffset, writeOffset, size);
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
		long __functionAddress = GL.getCapabilitiesGLXClient().glXNamedCopyBufferSubDataNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(readCtx);
			checkPointer(writeCtx);
		}
		callPPPPPPV(__functionAddress, display, readCtx, writeCtx, readBuffer, writeBuffer, readOffset, writeOffset, size);
	}

}