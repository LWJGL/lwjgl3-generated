/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/draw_buffers2.txt">EXT_draw_buffers2</a> extension.
 * 
 * <p>This extension builds upon the ARB_draw_buffers extension and provides separate blend enables and color write masks for each color output. In
 * ARB_draw_buffers (part of OpenGL 2.0), separate values can be written to each color buffer, but the blend enable and color write mask are global and
 * apply to all color outputs.</p>
 * 
 * <p>While this extension does provide separate blend enables, it does not provide separate blend functions or blend equations per color output.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class EXTDrawBuffers2 {

	static { GL.initialize(); }

	protected EXTDrawBuffers2() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glColorMaskIndexedEXT, caps.glGetBooleanIndexedvEXT, caps.glGetIntegerIndexedvEXT, caps.glEnableIndexedEXT, caps.glDisableIndexedEXT, 
			caps.glIsEnabledIndexedEXT
		);
	}

	// --- [ glColorMaskIndexedEXT ] ---

	public static native void nglColorMaskIndexedEXT(int index, boolean r, boolean g, boolean b, boolean a);

	public static void glColorMaskIndexedEXT(int index, boolean r, boolean g, boolean b, boolean a) {
		nglColorMaskIndexedEXT(index, r, g, b, a);
	}

	// --- [ glGetBooleanIndexedvEXT ] ---

	public static native void nglGetBooleanIndexedvEXT(int target, int index, long data);

	public static void glGetBooleanIndexedvEXT(int target, int index, ByteBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetBooleanIndexedvEXT(target, index, memAddress(data));
	}

	public static boolean glGetBooleanIndexedEXT(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer data = stack.calloc(1);
			nglGetBooleanIndexedvEXT(target, index, memAddress(data));
			return data.get(0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetIntegerIndexedvEXT ] ---

	public static native void nglGetIntegerIndexedvEXT(int target, int index, long data);

	public static void glGetIntegerIndexedvEXT(int target, int index, IntBuffer data) {
		if ( CHECKS )
			check(data, 1);
		nglGetIntegerIndexedvEXT(target, index, memAddress(data));
	}

	public static int glGetIntegerIndexedEXT(int target, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetIntegerIndexedvEXT(target, index, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glEnableIndexedEXT ] ---

	public static native void nglEnableIndexedEXT(int target, int index);

	public static void glEnableIndexedEXT(int target, int index) {
		nglEnableIndexedEXT(target, index);
	}

	// --- [ glDisableIndexedEXT ] ---

	public static native void nglDisableIndexedEXT(int target, int index);

	public static void glDisableIndexedEXT(int target, int index) {
		nglDisableIndexedEXT(target, index);
	}

	// --- [ glIsEnabledIndexedEXT ] ---

	public static native boolean nglIsEnabledIndexedEXT(int target, int index);

	public static boolean glIsEnabledIndexedEXT(int target, int index) {
		return nglIsEnabledIndexedEXT(target, index);
	}

	/** Array version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	public static void glGetIntegerIndexedvEXT(int target, int index, int[] data) {
		long __functionAddress = GL.getICD().glGetIntegerIndexedvEXT;
		if ( CHECKS ) {
			check(__functionAddress);
			check(data, 1);
		}
		callPV(__functionAddress, target, index, data);
	}

}