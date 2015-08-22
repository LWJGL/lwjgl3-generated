/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_debug_label.txt">EXT_debug_label</a> extension.
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
public final class EXTDebugLabel {

	/** Accepted by the {@code type} parameter of LabelObjectEXT and GetObjectLabelEXT. */
	public static final int
		GL_BUFFER_OBJECT_EXT           = 0x9151,
		GL_SHADER_OBJECT_EXT           = 0x8B48,
		GL_PROGRAM_OBJECT_EXT          = 0x8B40,
		GL_VERTEX_ARRAY_OBJECT_EXT     = 0x9154,
		GL_QUERY_OBJECT_EXT            = 0x9153,
		GL_PROGRAM_PIPELINE_OBJECT_EXT = 0x8A4F;

	/** Function address. */
	@JavadocExclude
	public final long
		LabelObjectEXT,
		GetObjectLabelEXT;

	@JavadocExclude
	public EXTDebugLabel(FunctionProvider provider) {
		LabelObjectEXT = provider.getFunctionAddress("glLabelObjectEXT");
		GetObjectLabelEXT = provider.getFunctionAddress("glGetObjectLabelEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDebugLabel} instance for the current context. */
	public static EXTDebugLabel getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTDebugLabel);
	}

	static EXTDebugLabel create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_debug_label") ) return null;

		EXTDebugLabel funcs = new EXTDebugLabel(provider);
		boolean supported = checkFunctions(
			funcs.LabelObjectEXT, funcs.GetObjectLabelEXT
		);

		return GLES.checkExtension("GL_EXT_debug_label", funcs, supported);
	}

	// --- [ glLabelObjectEXT ] ---

	/** Unsafe version of {@link #glLabelObjectEXT LabelObjectEXT} */
	@JavadocExclude
	public static void nglLabelObjectEXT(int type, int object, int length, long label) {
		long __functionAddress = getInstance().LabelObjectEXT;
		callIIIPV(__functionAddress, type, object, length, label);
	}

	public static void glLabelObjectEXT(int type, int object, int length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(label, length);
		nglLabelObjectEXT(type, object, length, memAddress(label));
	}

	/** Alternative version of: {@link #glLabelObjectEXT LabelObjectEXT} */
	public static void glLabelObjectEXT(int type, int object, ByteBuffer label) {
		nglLabelObjectEXT(type, object, label.remaining(), memAddress(label));
	}

	/** CharSequence version of: {@link #glLabelObjectEXT LabelObjectEXT} */
	public static void glLabelObjectEXT(int type, int object, CharSequence label) {
		APIBuffer __buffer = apiBuffer();
		int labelEncoded = __buffer.stringParamUTF8(label, false);
		int labelEncodedLen = __buffer.getOffset() - labelEncoded;
		nglLabelObjectEXT(type, object, labelEncodedLen, __buffer.address(labelEncoded));
	}

	// --- [ glGetObjectLabelEXT ] ---

	/** Unsafe version of {@link #glGetObjectLabelEXT GetObjectLabelEXT} */
	@JavadocExclude
	public static void nglGetObjectLabelEXT(int type, int object, int bufSize, long length, long label) {
		long __functionAddress = getInstance().GetObjectLabelEXT;
		callIIIPPV(__functionAddress, type, object, bufSize, length, label);
	}

	public static void glGetObjectLabelEXT(int type, int object, int bufSize, ByteBuffer length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(label, bufSize);
			checkBuffer(length, 1 << 2);
		}
		nglGetObjectLabelEXT(type, object, bufSize, memAddress(length), memAddress(label));
	}

	/** Alternative version of: {@link #glGetObjectLabelEXT GetObjectLabelEXT} */
	public static void glGetObjectLabelEXT(int type, int object, IntBuffer length, ByteBuffer label) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(length, 1);
		nglGetObjectLabelEXT(type, object, label.remaining(), memAddress(length), memAddress(label));
	}

	/** String return version of: {@link #glGetObjectLabelEXT GetObjectLabelEXT} */
	public static String glGetObjectLabelEXT(int type, int object, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int label = __buffer.bufferParam(bufSize);
		nglGetObjectLabelEXT(type, object, bufSize, __buffer.address(length), __buffer.address(label));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), label);
	}

}