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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/ANGLE/ANGLE_framebuffer_multisample.txt">ANGLE_framebuffer_multisample</a> extension.
 * 
 * <p>This extension extends the framebuffer object framework to enable multisample rendering.</p>
 * 
 * <p>The new operation RenderbufferStorageMultisampleANGLE() allocates storage for a renderbuffer object that can be used as a multisample buffer. A
 * multisample render buffer image differs from a single-sample render buffer image in that a multisample image has a number of SAMPLES that is greater
 * than zero. No method is provided for creating multisample texture images.</p>
 * 
 * <p>All of the framebuffer-attachable images attached to a framebuffer object must have the same number of SAMPLES or else the framebuffer object is not
 * "framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
 * SAMPLE_BUFFERS is one.</p>
 * 
 * <p>The resolve operation is affected by calling BlitFramebufferANGLE (provided by the ANGLE_framebuffer_blit extension) where the source is a multisample
 * application-created framebuffer object and the destination is a single-sample framebuffer object (either application-created or window-system
 * provided).</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S} and {@link ANGLEFramebufferBlit ANGLE_framebuffer_blit}.</p>
 */
public final class ANGLEFramebufferMultisample {

	/** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
	public static final int GL_RENDERBUFFER_SAMPLES_ANGLE = 0x8CAB;

	/** Returned by CheckFramebufferStatus. */
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_ANGLE = 0x8D56;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int GL_MAX_SAMPLES_ANGLE = 0x8D57;

	/** Function address. */
	@JavadocExclude
	public final long RenderbufferStorageMultisampleANGLE;

	@JavadocExclude
	public ANGLEFramebufferMultisample(FunctionProvider provider) {
		RenderbufferStorageMultisampleANGLE = provider.getFunctionAddress("glRenderbufferStorageMultisampleANGLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ANGLEFramebufferMultisample} instance for the current context. */
	public static ANGLEFramebufferMultisample getInstance() {
		return checkFunctionality(GLES.getCapabilities().__ANGLEFramebufferMultisample);
	}

	static ANGLEFramebufferMultisample create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ANGLE_framebuffer_multisample") ) return null;

		ANGLEFramebufferMultisample funcs = new ANGLEFramebufferMultisample(provider);
		boolean supported = checkFunctions(
			funcs.RenderbufferStorageMultisampleANGLE
		);

		return GLES.checkExtension("GL_ANGLE_framebuffer_multisample", funcs, supported);
	}

	// --- [ glRenderbufferStorageMultisampleANGLE ] ---

	public static void glRenderbufferStorageMultisampleANGLE(int target, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorageMultisampleANGLE;
		callIIIIIV(__functionAddress, target, samples, internalformat, width, height);
	}

}