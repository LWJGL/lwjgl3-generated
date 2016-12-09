/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_clear_texture.txt">EXT_clear_texture</a> extension.
 * 
 * <p>Texture objects are fundamental to the operation of OpenGL. They are used as a source for texture sampling and destination for rendering as well as
 * being accessed in shaders for image load/store operations It is also possible to invalidate the contents of a texture. It is currently only possible to
 * set texture image data to known values by uploading some or all of a image array from application memory or by attaching it to a framebuffer object and
 * using the {@code Clear} or {@code ClearBuffer} commands.</p>
 * 
 * <p>Both uploading initial texture data and clearing by attaching to a framebuffer have potential disadvantages when one simply wants to initialize texture
 * data to a known value. Uploading initial data requires the application to allocate a (potentially large) chunk of memory and transferring that to the
 * GL. This can be a costly operation both in terms of memory bandwidth and power usage. Alternatively, attaching a texture level to a framebuffer to
 * clear it may not be possible if the texture format isn't supported for rendering, or even if it is, attaching the image to a framebuffer object may
 * cause the texture to be allocated in certain types of memory, which it may otherwise not need to be placed in.</p>
 * 
 * <p>This extension solves these problems by providing a mechanism whereby the contents of a texture image array can be set to known values by using the
 * {@link #glClearTexImageEXT ClearTexImageEXT} or {@link #glClearTexSubImageEXT ClearTexSubImageEXT} commands. These commands can also be useful for initializing an image that will be used for atomic shader
 * operations.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1}.</p>
 */
public class EXTClearTexture {

	static { GLES.initialize(); }

	protected EXTClearTexture() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glClearTexImageEXT, caps.glClearTexSubImageEXT
		);
	}

	// --- [ glClearTexImageEXT ] ---

	public static native void nglClearTexImageEXT(int texture, int level, int format, int type, long data);

	public static void glClearTexImageEXT(int texture, int level, int format, int type, ByteBuffer data) {
		nglClearTexImageEXT(texture, level, format, type, memAddressSafe(data));
	}

	public static void glClearTexImageEXT(int texture, int level, int format, int type, ShortBuffer data) {
		nglClearTexImageEXT(texture, level, format, type, memAddressSafe(data));
	}

	public static void glClearTexImageEXT(int texture, int level, int format, int type, IntBuffer data) {
		nglClearTexImageEXT(texture, level, format, type, memAddressSafe(data));
	}

	public static void glClearTexImageEXT(int texture, int level, int format, int type, FloatBuffer data) {
		nglClearTexImageEXT(texture, level, format, type, memAddressSafe(data));
	}

	// --- [ glClearTexSubImageEXT ] ---

	public static native void nglClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data);

	public static void glClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer data) {
		nglClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	public static void glClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer data) {
		nglClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	public static void glClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer data) {
		nglClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	public static void glClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer data) {
		nglClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
	}

	/** Array version of: {@link #glClearTexImageEXT ClearTexImageEXT} */
	public static void glClearTexImageEXT(int texture, int level, int format, int type, short[] data) {
		long __functionAddress = GLES.getICD().glClearTexImageEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, texture, level, format, type, data);
	}

	/** Array version of: {@link #glClearTexImageEXT ClearTexImageEXT} */
	public static void glClearTexImageEXT(int texture, int level, int format, int type, int[] data) {
		long __functionAddress = GLES.getICD().glClearTexImageEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, texture, level, format, type, data);
	}

	/** Array version of: {@link #glClearTexImageEXT ClearTexImageEXT} */
	public static void glClearTexImageEXT(int texture, int level, int format, int type, float[] data) {
		long __functionAddress = GLES.getICD().glClearTexImageEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, texture, level, format, type, data);
	}

	/** Array version of: {@link #glClearTexSubImageEXT ClearTexSubImageEXT} */
	public static void glClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] data) {
		long __functionAddress = GLES.getICD().glClearTexSubImageEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
	}

	/** Array version of: {@link #glClearTexSubImageEXT ClearTexSubImageEXT} */
	public static void glClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] data) {
		long __functionAddress = GLES.getICD().glClearTexSubImageEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
	}

	/** Array version of: {@link #glClearTexSubImageEXT ClearTexSubImageEXT} */
	public static void glClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] data) {
		long __functionAddress = GLES.getICD().glClearTexSubImageEXT;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
	}

}