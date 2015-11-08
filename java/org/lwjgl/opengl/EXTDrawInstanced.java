/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/draw_instanced.txt">EXT_draw_instanced</a> extension.
 * 
 * <p>This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
 * the vertex program to compute per-instance values, typically an object's transform.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class EXTDrawInstanced {

	/** Function address. */
	@JavadocExclude
	public final long
		DrawArraysInstancedEXT,
		DrawElementsInstancedEXT;

	@JavadocExclude
	protected EXTDrawInstanced() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public EXTDrawInstanced(FunctionProvider provider) {
		DrawArraysInstancedEXT = provider.getFunctionAddress("glDrawArraysInstancedEXT");
		DrawElementsInstancedEXT = provider.getFunctionAddress("glDrawElementsInstancedEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDrawInstanced} instance of the current context. */
	public static EXTDrawInstanced getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link EXTDrawInstanced} instance of the specified {@link GLCapabilities}. */
	public static EXTDrawInstanced getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__EXTDrawInstanced);
	}

	static EXTDrawInstanced create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_draw_instanced") ) return null;

		EXTDrawInstanced funcs = new EXTDrawInstanced(provider);

		boolean supported = checkFunctions(
			funcs.DrawArraysInstancedEXT, funcs.DrawElementsInstancedEXT
		);

		return GL.checkExtension("GL_EXT_draw_instanced", funcs, supported);
	}

	// --- [ glDrawArraysInstancedEXT ] ---

	public static void glDrawArraysInstancedEXT(int mode, int start, int count, int primcount) {
		long __functionAddress = getInstance().DrawArraysInstancedEXT;
		callIIIIV(__functionAddress, mode, start, count, primcount);
	}

	// --- [ glDrawElementsInstancedEXT ] ---

	/** Unsafe version of {@link #glDrawElementsInstancedEXT DrawElementsInstancedEXT} */
	@JavadocExclude
	public static void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount) {
		long __functionAddress = getInstance().DrawElementsInstancedEXT;
		callIIIPIV(__functionAddress, mode, count, type, indices, primcount);
	}

	public static void glDrawElementsInstancedEXT(int mode, int count, int type, ByteBuffer indices, int primcount) {
		nglDrawElementsInstancedEXT(mode, count, type, memAddress(indices), primcount);
	}

}