/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/debug_label.txt">EXT_debug_label</a> extension.
 * 
 * <p>This extension defines a mechanism for OpenGL and OpenGL ES applications to label their objects (textures, buffers, shaders, etc.) with a descriptive
 * string.</p>
 * 
 * <p>When profiling or debugging such an application within a debugger or profiler it is difficult to identify resources from their object names. Even when
 * the resource itself is viewed it can be problematic to differentiate between similar resources. Attaching a label to an object helps obviate this
 * difficulty.</p>
 * 
 * <p>The intended purpose of this is purely to improve the user experience within OpenGL and OpenGL ES development tools.</p>
 */
public class EXTDebugLabel {

	/** Accepted by the {@code type} parameter of LabelObjectEXT and GetObjectLabelEXT. */
	public static final int
		GL_BUFFER_OBJECT_EXT           = 0x9151,
		GL_SHADER_OBJECT_EXT           = 0x8B48,
		GL_PROGRAM_OBJECT_EXT          = 0x8B40,
		GL_VERTEX_ARRAY_OBJECT_EXT     = 0x9154,
		GL_QUERY_OBJECT_EXT            = 0x9153,
		GL_PROGRAM_PIPELINE_OBJECT_EXT = 0x8A4F;

	protected EXTDebugLabel() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glLabelObjectEXT, caps.glGetObjectLabelEXT
		);
	}

	// --- [ glLabelObjectEXT ] ---

	public static void nglLabelObjectEXT(int type, int object, int length, long label) {
		long __functionAddress = GL.getCapabilities().glLabelObjectEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, object, length, label);
	}

	public static void glLabelObjectEXT(int type, int object, ByteBuffer label) {
		nglLabelObjectEXT(type, object, label.remaining(), memAddress(label));
	}

	public static void glLabelObjectEXT(int type, int object, CharSequence label) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer labelEncoded = stack.UTF8(label, false);
			int labelEncodedLen = labelEncoded.capacity();
			nglLabelObjectEXT(type, object, labelEncodedLen, memAddress(labelEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetObjectLabelEXT ] ---

	public static void nglGetObjectLabelEXT(int type, int object, int bufSize, long length, long label) {
		long __functionAddress = GL.getCapabilities().glGetObjectLabelEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, type, object, bufSize, length, label);
	}

	public static void glGetObjectLabelEXT(int type, int object, IntBuffer length, ByteBuffer label) {
		if ( CHECKS )
			checkBuffer(length, 1);
		nglGetObjectLabelEXT(type, object, label.remaining(), memAddress(length), memAddress(label));
	}

	public static String glGetObjectLabelEXT(int type, int object, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer label = stack.malloc(bufSize);
			nglGetObjectLabelEXT(type, object, bufSize, memAddress(length), memAddress(label));
			return memUTF8(label, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetObjectLabelEXT GetObjectLabelEXT} */
	public static void glGetObjectLabelEXT(int type, int object, int[] length, ByteBuffer label) {
		long __functionAddress = GL.getCapabilities().glGetObjectLabelEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(length, 1);
		}
		callPPV(__functionAddress, type, object, label.remaining(), length, memAddress(label));
	}

}