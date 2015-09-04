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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_blend_func_extended.txt">EXT_blend_func_extended</a> extension.
 * 
 * <p>This extension provides an ES version of the ARB_blend_func_extended functionality.</p>
 * 
 * <p>Traditional OpenGL includes fixed-function blending that combines source colors with the existing content of a render buffer in a variety of ways. A
 * number of extensions have enhanced this functionality by adding further sources of blending weights and methods to combine them. However, the inputs to
 * the fixed-function blending units are constrained to a source color (as output from fragment shading), destination color (as the current content of the
 * frame buffer) or constants that may be used in their place.</p>
 * 
 * <p>This extension adds new blending functions whereby a fragment shader may output two colors, one of which is treated as the source color, and the other
 * used as a blending factor for either source or destination colors. Furthermore, this extension increases orthogonality by allowing the
 * SRC_ALPHA_SATURATE function to be used as the destination weight.</p>
 * 
 * <p>Because of the limitations of the OpenGL ES 2.0 shading language, new built-in variables (gl_SecondaryFragColorEXT, gl_SecondaryFragDataEXT) are added
 * to the ES 1.00 shading language rather than introduce more complex features for user-defined fragment outputs. Because such built-in variable are
 * deprecated in ES 3.0, these variables are NOT available in the OpenGL ES 3.xx shading language verisons.</p>
 */
public final class EXTBlendFuncExtended {

	/**
	 * Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunciEXT, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
	 * {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparateiEXT.
	 */
	public static final int
		GL_SRC1_COLOR_EXT           = 0x88F9,
		GL_SRC1_ALPHA_EXT           = 0x8589,
		GL_ONE_MINUS_SRC1_COLOR_EXT = 0x88FA,
		GL_ONE_MINUS_SRC1_ALPHA_EXT = 0x88FB,
		GL_SRC_ALPHA_SATURATE_EXT   = 0x308;

	/** Accepted in the {@code props} array of GetProgramResourceiv. */
	public static final int GL_LOCATION_INDEX_EXT = 0x930F;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT = 0x88FC;

	/** Function address. */
	@JavadocExclude
	public final long
		BindFragDataLocationIndexedEXT,
		GetFragDataIndexEXT,
		BindFragDataLocationEXT,
		GetProgramResourceLocationIndexEXT;

	@JavadocExclude
	public EXTBlendFuncExtended(FunctionProvider provider) {
		BindFragDataLocationIndexedEXT = provider.getFunctionAddress("glBindFragDataLocationIndexedEXT");
		GetFragDataIndexEXT = provider.getFunctionAddress("glGetFragDataIndexEXT");
		BindFragDataLocationEXT = provider.getFunctionAddress("glBindFragDataLocationEXT");
		GetProgramResourceLocationIndexEXT = provider.getFunctionAddress("glGetProgramResourceLocationIndexEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTBlendFuncExtended} instance for the current context. */
	public static EXTBlendFuncExtended getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTBlendFuncExtended);
	}

	static EXTBlendFuncExtended create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_blend_func_extended") ) return null;

		EXTBlendFuncExtended funcs = new EXTBlendFuncExtended(provider);
		boolean supported = checkFunctions(
			funcs.BindFragDataLocationIndexedEXT, funcs.GetFragDataIndexEXT, funcs.BindFragDataLocationEXT, funcs.GetProgramResourceLocationIndexEXT
		);

		return GLES.checkExtension("GL_EXT_blend_func_extended", funcs, supported);
	}

	// --- [ glBindFragDataLocationIndexedEXT ] ---

	/** Unsafe version of {@link #glBindFragDataLocationIndexedEXT BindFragDataLocationIndexedEXT} */
	@JavadocExclude
	public static void nglBindFragDataLocationIndexedEXT(int program, int colorNumber, int index, long name) {
		long __functionAddress = getInstance().BindFragDataLocationIndexedEXT;
		callIIIPV(__functionAddress, program, colorNumber, index, name);
	}

	public static void glBindFragDataLocationIndexedEXT(int program, int colorNumber, int index, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		nglBindFragDataLocationIndexedEXT(program, colorNumber, index, memAddress(name));
	}

	/** CharSequence version of: {@link #glBindFragDataLocationIndexedEXT BindFragDataLocationIndexedEXT} */
	public static void glBindFragDataLocationIndexedEXT(int program, int colorNumber, int index, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		nglBindFragDataLocationIndexedEXT(program, colorNumber, index, __buffer.address(nameEncoded));
	}

	// --- [ glGetFragDataIndexEXT ] ---

	/** Unsafe version of {@link #glGetFragDataIndexEXT GetFragDataIndexEXT} */
	@JavadocExclude
	public static int nglGetFragDataIndexEXT(int program, long name) {
		long __functionAddress = getInstance().GetFragDataIndexEXT;
		return callIPI(__functionAddress, program, name);
	}

	public static int glGetFragDataIndexEXT(int program, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetFragDataIndexEXT(program, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetFragDataIndexEXT GetFragDataIndexEXT} */
	public static int glGetFragDataIndexEXT(int program, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetFragDataIndexEXT(program, __buffer.address(nameEncoded));
	}

	// --- [ glBindFragDataLocationEXT ] ---

	/** Unsafe version of {@link #glBindFragDataLocationEXT BindFragDataLocationEXT} */
	@JavadocExclude
	public static void nglBindFragDataLocationEXT(int program, int colorNumber, long name) {
		long __functionAddress = getInstance().BindFragDataLocationEXT;
		callIIPV(__functionAddress, program, colorNumber, name);
	}

	public static void glBindFragDataLocationEXT(int program, int colorNumber, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		nglBindFragDataLocationEXT(program, colorNumber, memAddress(name));
	}

	/** CharSequence version of: {@link #glBindFragDataLocationEXT BindFragDataLocationEXT} */
	public static void glBindFragDataLocationEXT(int program, int colorNumber, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		nglBindFragDataLocationEXT(program, colorNumber, __buffer.address(nameEncoded));
	}

	// --- [ glGetProgramResourceLocationIndexEXT ] ---

	/** Unsafe version of {@link #glGetProgramResourceLocationIndexEXT GetProgramResourceLocationIndexEXT} */
	@JavadocExclude
	public static int nglGetProgramResourceLocationIndexEXT(int program, int programInterface, long name) {
		long __functionAddress = getInstance().GetProgramResourceLocationIndexEXT;
		return callIIPI(__functionAddress, program, programInterface, name);
	}

	public static int glGetProgramResourceLocationIndexEXT(int program, int programInterface, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetProgramResourceLocationIndexEXT(program, programInterface, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetProgramResourceLocationIndexEXT GetProgramResourceLocationIndexEXT} */
	public static int glGetProgramResourceLocationIndexEXT(int program, int programInterface, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetProgramResourceLocationIndexEXT(program, programInterface, __buffer.address(nameEncoded));
	}

}