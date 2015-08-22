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
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_stream_consumer_egloutput.txt">EXT_stream_consumer_egloutput</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>This extension describes how to bind EGLOutputLayerEXTs as stream consumers to send rendering directly to a display device without an intervening
 * window system.</p>
 * 
 * <p>Requires {@link KHRStream KHR_stream} and {@link EXTOutputBase EXT_output_base}.</p>
 */
public final class EXTStreamConsumerEGLOutput {

	/** Function address. */
	@JavadocExclude
	public final long StreamConsumerOutputEXT;

	@JavadocExclude
	public EXTStreamConsumerEGLOutput(FunctionProvider provider) {
		StreamConsumerOutputEXT = provider.getFunctionAddress("eglStreamConsumerOutputEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTStreamConsumerEGLOutput} instance. */
	public static EXTStreamConsumerEGLOutput getInstance() {
		return checkFunctionality(EGL.getCapabilities().__EXTStreamConsumerEGLOutput);
	}

	// --- [ eglStreamConsumerOutputEXT ] ---

	public static boolean eglStreamConsumerOutputEXT(long dpy, long stream, long layer) {
		long __functionAddress = getInstance().StreamConsumerOutputEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
			checkPointer(layer);
		}
		return callPPPZ(__functionAddress, dpy, stream, layer);
	}

}