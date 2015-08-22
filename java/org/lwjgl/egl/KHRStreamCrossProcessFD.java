/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_stream_cross_process_fd.txt">KHR_stream_cross_process_fd</a> extension.
 * 
 * <p>This extension allows an EGLStreamKHR object handle to be duplicated into another process so that the EGLStream producer can be in one process while
 * the EGLStream consumer can be in another process.</p>
 * 
 * <p>Duplicating the EGLStreamKHR object handle into another process is peformed in 3 steps
 * <ol>
 * <li>Get a file descriptor associated with the EGLStream.</li>
 * <li>Duplicate the file descriptor into another process.</li>
 * <li>Create an EGLStreamKHR from the duplicated file descriptor in the other process.</li>
 * </ol>
 * The file descriptor is obtained by calling eglGetStreamFileDescriptorKHR().</p>
 * 
 * <p>Duplicating the file descriptor into another process is outside the scope of this extension. See issue \#1 for an example of how to do this on a Linux
 * system.</p>
 * 
 * <p>The EGLStreamKHR object handle is created in the second process by passing the file descriptor to the eglCreateStreamFromFileDescriptorKHR() function.
 * This must be done while the EGLStream is in the EGL_STREAM_STATE_CREATED_KHR state.</p>
 * 
 * <p>Once the EGLStreamKHR object handle is created in the second process, it refers to the same EGLStream as the EGLStreamKHR object handle in the original
 * process. A consumer can be associated with the EGLStream from either process. A producer can be associated with the EGLStream from either process.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1} and {@link KHRStream KHR_stream}.</p>
 */
public final class KHRStreamCrossProcessFD {

	/**  */
	public static final int EGL_NO_FILE_DESCRIPTOR_KHR = -1;

	/** Function address. */
	@JavadocExclude
	public final long
		GetStreamFileDescriptorKHR,
		CreateStreamFromFileDescriptorKHR;

	@JavadocExclude
	public KHRStreamCrossProcessFD(FunctionProvider provider) {
		GetStreamFileDescriptorKHR = provider.getFunctionAddress("eglGetStreamFileDescriptorKHR");
		CreateStreamFromFileDescriptorKHR = provider.getFunctionAddress("eglCreateStreamFromFileDescriptorKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRStreamCrossProcessFD} instance. */
	public static KHRStreamCrossProcessFD getInstance() {
		return checkFunctionality(EGL.getCapabilities().__KHRStreamCrossProcessFD);
	}

	// --- [ eglGetStreamFileDescriptorKHR ] ---

	public static int eglGetStreamFileDescriptorKHR(long dpy, long stream) {
		long __functionAddress = getInstance().GetStreamFileDescriptorKHR;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPI(__functionAddress, dpy, stream);
	}

	// --- [ eglCreateStreamFromFileDescriptorKHR ] ---

	public static long eglCreateStreamFromFileDescriptorKHR(long dpy, int file_descriptor) {
		long __functionAddress = getInstance().CreateStreamFromFileDescriptorKHR;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return callPIP(__functionAddress, dpy, file_descriptor);
	}

}