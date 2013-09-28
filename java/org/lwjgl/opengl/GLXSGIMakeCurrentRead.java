/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/SGI/make_current_read.txt">GLX_SGI_make_current_read</a> extension.
 * <p/>
 * The association of the current context with a drawable is extended to allow separate write and read drawables.  This paves the way for allowing
 * preprocessing of image data in an "off screen" window which is then read into the visible window for final display.  Similarly it sets the frame-work
 * for direct transfer of video to the GL, by treating the video as a special kind of read drawable (a.k.a, readable).
 */
public final class GLXSGIMakeCurrentRead {

	private GLXSGIMakeCurrentRead() {}

	// --- [ glXMakeCurrentReadSGI ] ---

	/** JNI method for {@link #glXMakeCurrentReadSGI glXMakeCurrentReadSGI} */
	public static native int nglXMakeCurrentReadSGI(long display, long draw, long read, long ctx, long __functionAddress);

	/**
	 * Associates two {@code GLXDrawables} with the current rendering context.
	 *
	 * @param display the connection to the X server
	 * @param draw    the draw drawable
	 * @param read    the read drawable
	 * @param ctx     the current context
	 */
	public static int glXMakeCurrentReadSGI(long display, long draw, long read, long ctx) {
		long __functionAddress = getInstance().glXMakeCurrentReadSGI;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return nglXMakeCurrentReadSGI(display, draw, read, ctx, __functionAddress);
	}

	// --- [ glXGetCurrentReadDrawableSGI ] ---

	/** JNI method for {@link #glXGetCurrentReadDrawableSGI glXGetCurrentReadDrawableSGI} */
	public static native long nglXGetCurrentReadDrawableSGI(long __functionAddress);

	/** Returns the name of the {@code GLXDrawable} currently being used as a pixel query source. */
	public static long glXGetCurrentReadDrawableSGI() {
		long __functionAddress = getInstance().glXGetCurrentReadDrawableSGI;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglXGetCurrentReadDrawableSGI(__functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXSGIMakeCurrentRead;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGI_make_current_read") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXMakeCurrentReadSGI) &&
			GL.isFunctionSupported(funcs.glXGetCurrentReadDrawableSGI);

		return GL.checkExtension("GLX_SGI_make_current_read", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXSGIMakeCurrentRead}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long
			glXMakeCurrentReadSGI,
			glXGetCurrentReadDrawableSGI;

		public Functions(FunctionProvider provider) {
			glXMakeCurrentReadSGI = provider.getFunctionAddress("glXMakeCurrentReadSGI");
			glXGetCurrentReadDrawableSGI = provider.getFunctionAddress("glXGetCurrentReadDrawableSGI");
		}

	}

}