/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
public final class EXTDrawBuffers2 {

	/** Function address. */
	@JavadocExclude
	public final long
		ColorMaskIndexedEXT,
		GetBooleanIndexedvEXT,
		GetIntegerIndexedvEXT,
		EnableIndexedEXT,
		DisableIndexedEXT,
		IsEnabledIndexedEXT;

	@JavadocExclude
	public EXTDrawBuffers2(FunctionProvider provider) {
		ColorMaskIndexedEXT = provider.getFunctionAddress("glColorMaskIndexedEXT");
		GetBooleanIndexedvEXT = provider.getFunctionAddress("glGetBooleanIndexedvEXT");
		GetIntegerIndexedvEXT = provider.getFunctionAddress("glGetIntegerIndexedvEXT");
		EnableIndexedEXT = provider.getFunctionAddress("glEnableIndexedEXT");
		DisableIndexedEXT = provider.getFunctionAddress("glDisableIndexedEXT");
		IsEnabledIndexedEXT = provider.getFunctionAddress("glIsEnabledIndexedEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDrawBuffers2} instance for the current context. */
	public static EXTDrawBuffers2 getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTDrawBuffers2);
	}

	static EXTDrawBuffers2 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_draw_buffers2") ) return null;

		EXTDrawBuffers2 funcs = new EXTDrawBuffers2(provider);

		boolean supported = checkFunctions(
			funcs.ColorMaskIndexedEXT, funcs.GetBooleanIndexedvEXT, funcs.GetIntegerIndexedvEXT, funcs.EnableIndexedEXT, funcs.DisableIndexedEXT, 
			funcs.IsEnabledIndexedEXT
		);

		return GL.checkExtension("GL_EXT_draw_buffers2", funcs, supported);
	}

	// --- [ glColorMaskIndexedEXT ] ---

	public static void glColorMaskIndexedEXT(int index, boolean r, boolean g, boolean b, boolean a) {
		long __functionAddress = getInstance().ColorMaskIndexedEXT;
		callIZZZZV(__functionAddress, index, r, g, b, a);
	}

	// --- [ glGetBooleanIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetBooleanIndexedvEXT GetBooleanIndexedvEXT} */
	@JavadocExclude
	public static void nglGetBooleanIndexedvEXT(int target, int index, long data) {
		long __functionAddress = getInstance().GetBooleanIndexedvEXT;
		callIIPV(__functionAddress, target, index, data);
	}

	public static void glGetBooleanIndexedvEXT(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetBooleanIndexedvEXT(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetBooleanIndexedvEXT GetBooleanIndexedvEXT} */
	public static boolean glGetBooleanIndexedEXT(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.booleanParam();
		nglGetBooleanIndexedvEXT(target, index, __buffer.address(data));
		return __buffer.booleanValue(data);
	}

	// --- [ glGetIntegerIndexedvEXT ] ---

	/** Unsafe version of {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	@JavadocExclude
	public static void nglGetIntegerIndexedvEXT(int target, int index, long data) {
		long __functionAddress = getInstance().GetIntegerIndexedvEXT;
		callIIPV(__functionAddress, target, index, data);
	}

	public static void glGetIntegerIndexedvEXT(int target, int index, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1 << 2);
		nglGetIntegerIndexedvEXT(target, index, memAddress(data));
	}

	/** Alternative version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	public static void glGetIntegerIndexedvEXT(int target, int index, IntBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, 1);
		nglGetIntegerIndexedvEXT(target, index, memAddress(data));
	}

	/** Single return value version of: {@link #glGetIntegerIndexedvEXT GetIntegerIndexedvEXT} */
	public static int glGetIntegerIndexedEXT(int target, int index) {
		APIBuffer __buffer = apiBuffer();
		int data = __buffer.intParam();
		nglGetIntegerIndexedvEXT(target, index, __buffer.address(data));
		return __buffer.intValue(data);
	}

	// --- [ glEnableIndexedEXT ] ---

	public static void glEnableIndexedEXT(int target, int index) {
		long __functionAddress = getInstance().EnableIndexedEXT;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glDisableIndexedEXT ] ---

	public static void glDisableIndexedEXT(int target, int index) {
		long __functionAddress = getInstance().DisableIndexedEXT;
		callIIV(__functionAddress, target, index);
	}

	// --- [ glIsEnabledIndexedEXT ] ---

	public static boolean glIsEnabledIndexedEXT(int target, int index) {
		long __functionAddress = getInstance().IsEnabledIndexedEXT;
		return callIIZ(__functionAddress, target, index);
	}

}