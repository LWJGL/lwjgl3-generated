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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/APPLE/APPLE_framebuffer_multisample.txt">APPLE_framebuffer_multisample</a> extension.
 * 
 * <p>This extension extends the framebuffer object framework to enable multisample rendering.</p>
 * 
 * <p>The new operation RenderbufferStorageMultisampleAPPLE() allocates storage for a renderbuffer object that can be used as a multisample buffer. A
 * multisample render buffer image differs from a single-sample render buffer image in that a multisample image has a number of SAMPLES that is greater
 * than zero. No method is provided for creating multisample texture images.</p>
 * 
 * <p>All of the framebuffer-attachable images attached to a framebuffer object must have the same number of SAMPLES or else the framebuffer object is not
 * "framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
 * SAMPLE_BUFFERS is one.</p>
 * 
 * <p>The resolve operation is affected by calling ResolveMultisampleFramebufferAPPLE where the source is a multisample application-created framebuffer
 * object and the destination is a single-sample framebuffer object. Separate read and draw framebuffer object binding points are established to
 * facilitate the resolve.</p>
 * 
 * <p>Scissoring may be used in conjunction with ResolveMultisampleFramebufferAPPLE to resolve only a portion of the framebuffer.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class APPLEFramebufferMultisample {

	/** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
	public static final int GL_RENDERBUFFER_SAMPLES_APPLE = 0x8CAB;

	/** Returned by CheckFramebufferStatus. */
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE = 0x8D56;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int GL_MAX_SAMPLES_APPLE = 0x8D57;

	/**
	 * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture2D, FramebufferRenderbuffer, and
	 * GetFramebufferAttachmentParameteriv.
	 */
	public static final int
		GL_READ_FRAMEBUFFER_APPLE = 0x8CA8,
		GL_DRAW_FRAMEBUFFER_APPLE = 0x8CA9;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int
		GL_DRAW_FRAMEBUFFER_BINDING_APPLE = 0x8CA6,
		GL_READ_FRAMEBUFFER_BINDING_APPLE = 0x8CAA;

	/** Function address. */
	@JavadocExclude
	public final long
		RenderbufferStorageMultisampleAPPLE,
		ResolveMultisampleFramebufferAPPLE;

	@JavadocExclude
	public APPLEFramebufferMultisample(FunctionProvider provider) {
		RenderbufferStorageMultisampleAPPLE = provider.getFunctionAddress("glRenderbufferStorageMultisampleAPPLE");
		ResolveMultisampleFramebufferAPPLE = provider.getFunctionAddress("glResolveMultisampleFramebufferAPPLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link APPLEFramebufferMultisample} instance for the current context. */
	public static APPLEFramebufferMultisample getInstance() {
		return checkFunctionality(GLES.getCapabilities().__APPLEFramebufferMultisample);
	}

	static APPLEFramebufferMultisample create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_APPLE_framebuffer_multisample") ) return null;

		APPLEFramebufferMultisample funcs = new APPLEFramebufferMultisample(provider);
		boolean supported = checkFunctions(
			funcs.RenderbufferStorageMultisampleAPPLE, funcs.ResolveMultisampleFramebufferAPPLE
		);

		return GLES.checkExtension("GL_APPLE_framebuffer_multisample", funcs, supported);
	}

	// --- [ glRenderbufferStorageMultisampleAPPLE ] ---

	public static void glRenderbufferStorageMultisampleAPPLE(int target, int samples, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorageMultisampleAPPLE;
		callIIIIIV(__functionAddress, target, samples, internalformat, width, height);
	}

	// --- [ glResolveMultisampleFramebufferAPPLE ] ---

	public static void glResolveMultisampleFramebufferAPPLE() {
		long __functionAddress = getInstance().ResolveMultisampleFramebufferAPPLE;
		callV(__functionAddress);
	}

}