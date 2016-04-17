/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGI/make_current_read.txt">GLX_SGI_make_current_read</a> extension.
 * 
 * <p>The association of the current context with a drawable is extended to allow separate write and read drawables.  This paves the way for allowing
 * preprocessing of image data in an "off screen" window which is then read into the visible window for final display.  Similarly it sets the frame-work
 * for direct transfer of video to the GL, by treating the video as a special kind of read drawable (a.k.a, readable).</p>
 */
public class GLXSGIMakeCurrentRead {

	protected GLXSGIMakeCurrentRead() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXMakeCurrentReadSGI, caps.glXGetCurrentReadDrawableSGI
		);
	}

	// --- [ glXMakeCurrentReadSGI ] ---

	/**
	 * Associates two {@code GLXDrawables} with the current rendering context.
	 *
	 * @param display the connection to the X server
	 * @param draw    the draw drawable
	 * @param read    the read drawable
	 * @param ctx     the current context
	 */
	public static int glXMakeCurrentReadSGI(long display, long draw, long read, long ctx) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXMakeCurrentReadSGI;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return callPPPPI(__functionAddress, display, draw, read, ctx);
	}

	// --- [ glXGetCurrentReadDrawableSGI ] ---

	/** Returns the name of the {@code GLXDrawable} currently being used as a pixel query source. */
	public static long glXGetCurrentReadDrawableSGI() {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentReadDrawableSGI;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress);
	}

}