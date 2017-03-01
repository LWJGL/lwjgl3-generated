/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_draw_instanced.txt">EXT_draw_instanced</a> extension.
 * 
 * <p>This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
 * the vertex program to compute per-instance values, typically an object's transform.</p>
 */
public class EXTDrawInstanced {

	static { GLES.initialize(); }

	protected EXTDrawInstanced() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glDrawArraysInstancedEXT, caps.glDrawElementsInstancedEXT
		);
	}

	// --- [ glDrawArraysInstancedEXT ] ---

	public static native void glDrawArraysInstancedEXT(int mode, int start, int count, int primcount);

	// --- [ glDrawElementsInstancedEXT ] ---

	public static native void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount);

	public static void glDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, count, type, indices, primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, int type, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, ShortBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, IntBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
	}

}