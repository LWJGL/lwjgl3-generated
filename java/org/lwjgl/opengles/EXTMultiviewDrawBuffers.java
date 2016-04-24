/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_multiview_draw_buffers.txt">EXT_multiview_draw_buffers</a> extension.
 * 
 * <p>This extension allows selecting among draw buffers as the rendering target. This may be among multiple primary buffers pertaining to platform-specific
 * stereoscopic or multiview displays or among offscreen framebuffer object color attachments.</p>
 * 
 * <p>To remove any artificial limitations imposed on the number of possible buffers, draw buffers are identified not as individual enums, but as pairs of
 * values consisting of an enum representing buffer locations such as COLOR_ATTACHMENT_EXT or MULTIVIEW_EXT, and an integer representing an identifying
 * index of buffers of this location. These (location, index) pairs are used to specify draw buffer targets using a new DrawBuffersIndexedEXT call.</p>
 * 
 * <p>Rendering to buffers of location MULTIVIEW_EXT associated with the context allows rendering to multiview buffers created by EGL using
 * EGL_EXT_multiview_window for stereoscopic displays.</p>
 * 
 * <p>Rendering to COLOR_ATTACHMENT_EXT buffers allows implementations to increase the number of potential color attachments indefinitely to renderbuffers
 * and textures.</p>
 * 
 * <p>This extension allows the traditional quad buffer stereoscopic rendering method that has proven effective by indicating a left or right draw buffer and
 * rendering to each accordingly, but is also dynamic enough to handle an arbitrary number of color buffer targets all using the same shader. This grants
 * the user maximum flexibility as well as a familiar interface.</p>
 */
public class EXTMultiviewDrawBuffers {

	/** Accepted by the {@code location} parameter of DrawBuffersIndexedEXT. */
	public static final int
		GL_COLOR_ATTACHMENT_EXT = 0x90F0,
		GL_MULTIVIEW_EXT        = 0x90F1;

	/** Accepted by the {@code target} parameter of GetIntegeri_EXT. */
	public static final int
		GL_DRAW_BUFFER_EXT = 0xC01,
		GL_READ_BUFFER_EXT = 0xC02;

	/** Accepted by the {@code target} parameter of GetInteger. */
	public static final int GL_MAX_MULTIVIEW_BUFFERS_EXT = 0x90F2;

	protected EXTMultiviewDrawBuffers() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glReadBufferIndexedEXT, caps.glDrawBuffersIndexedEXT, caps.glGetIntegeri_vEXT
		);
	}

	// --- [ glReadBufferIndexedEXT ] ---

	public static void glReadBufferIndexedEXT(int src, int index) {
		long __functionAddress = GLES.getCapabilities().glReadBufferIndexedEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, src, index);
	}

	// --- [ glDrawBuffersIndexedEXT ] ---

	public static void nglDrawBuffersIndexedEXT(int n, long location, long indices) {
		long __functionAddress = GLES.getCapabilities().glDrawBuffersIndexedEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, n, location, indices);
	}

	public static void glDrawBuffersIndexedEXT(IntBuffer location, IntBuffer indices) {
		if ( CHECKS )
			checkBuffer(indices, location.remaining());
		nglDrawBuffersIndexedEXT(location.remaining(), memAddress(location), memAddress(indices));
	}

	// --- [ glGetIntegeri_vEXT ] ---

	public static void nglGetIntegeri_vEXT(int target, int index, long data) {
		long __functionAddress = GLES.getCapabilities().glGetIntegeri_vEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, data);
	}

	public static void glGetIntegeri_vEXT(int target, int index, IntBuffer data) {
		if ( CHECKS )
			checkBuffer(data, 1);
		nglGetIntegeri_vEXT(target, index, memAddress(data));
	}

	public static int glGetIntegeriEXT(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetIntegeri_vEXT(target, index, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glDrawBuffersIndexedEXT DrawBuffersIndexedEXT} */
	public static void glDrawBuffersIndexedEXT(int[] location, int[] indices) {
		long __functionAddress = GLES.getCapabilities().glDrawBuffersIndexedEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, location.length);
		}
		callPPV(__functionAddress, location.length, location, indices);
	}

	/** Array version of: {@link #glGetIntegeri_vEXT GetIntegeri_vEXT} */
	public static void glGetIntegeri_vEXT(int target, int index, int[] data) {
		long __functionAddress = GLES.getCapabilities().glGetIntegeri_vEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

}