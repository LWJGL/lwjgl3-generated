/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

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

	/** Function address. */
	@JavadocExclude
	public final long
		MakeCurrentReadSGI,
		GetCurrentReadDrawableSGI;

	@JavadocExclude
	protected GLXSGIMakeCurrentRead() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public GLXSGIMakeCurrentRead(FunctionProvider provider) {
		MakeCurrentReadSGI = provider.getFunctionAddress("glXMakeCurrentReadSGI");
		GetCurrentReadDrawableSGI = provider.getFunctionAddress("glXGetCurrentReadDrawableSGI");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXSGIMakeCurrentRead} instance of the current context. */
	public static GLXSGIMakeCurrentRead getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link GLXSGIMakeCurrentRead} instance of the specified {@link GLCapabilities}. */
	public static GLXSGIMakeCurrentRead getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__GLXSGIMakeCurrentRead);
	}

	static GLXSGIMakeCurrentRead create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_SGI_make_current_read") ) return null;

		GLXSGIMakeCurrentRead funcs = new GLXSGIMakeCurrentRead(provider);

		boolean supported = checkFunctions(
			funcs.MakeCurrentReadSGI, funcs.GetCurrentReadDrawableSGI
		);

		return GL.checkExtension("GLX_SGI_make_current_read", funcs, supported);
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
		long __functionAddress = getInstance().MakeCurrentReadSGI;
		if ( CHECKS )
			checkPointer(display);
		return callPPPPI(__functionAddress, display, draw, read, ctx);
	}

	// --- [ glXGetCurrentReadDrawableSGI ] ---

	/** Returns the name of the {@code GLXDrawable} currently being used as a pixel query source. */
	public static long glXGetCurrentReadDrawableSGI() {
		long __functionAddress = getInstance().GetCurrentReadDrawableSGI;
		return callP(__functionAddress);
	}

}