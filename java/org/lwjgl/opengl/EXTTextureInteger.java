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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/texture_integer.txt">EXT_texture_integer</a> extension.
 * 
 * <p>Fixed-point textures in unextended OpenGL have integer components, but those values are taken to represent floating-point values in the range [0,1].
 * These integer components are considered "normalized" integers. When such a texture is accessed by a shader or by fixed-function fragment processing,
 * floating-point values are returned.</p>
 * 
 * <p>This extension provides a set of new "unnormalized" integer texture formats. Formats with both signed and unsigned integers are provided. In these
 * formats, the components are treated as true integers. When such textures are accessed by a shader, actual integer values are returned.</p>
 * 
 * <p>Pixel operations that read from or write to a texture or color buffer with unnormalized integer components follow a path similar to that used for color
 * index pixel operations, except that more than one component may be provided at once. Integer values flow through the pixel processing pipe, and no pixel
 * transfer operations are performed. Integer format enumerants used for such operations indicate unnormalized integer data.</p>
 * 
 * <p>Textures or render buffers with unnormalized integer formats may also be attached to framebuffer objects to receive fragment color values written by a
 * fragment shader. Per-fragment operations that require floating-point color components, including multisample alpha operations, alpha test, blending, and
 * dithering, have no effect when the corresponding colors are written to an integer color buffer. The <a href="http://www.opengl.org/registry/specs/NV/gpu_program4.txt">NV_gpu_program4</a> and
 * <a href="http://www.opengl.org/registry/specs/EXT/gpu_shader4.txt">EXT_gpu_shader4</a> extensions add the capability to fragment programs and fragment shaders to write signed and unsigned integer
 * output values.</p>
 * 
 * <p>This extension does not enforce type consistency for texture accesses or between fragment shaders and the corresponding framebuffer attachments. The
 * results of a texture lookup from an integer texture are undefined:
 * <ul>
 * <li>for fixed-function fragment processing, or</li>
 * <li>for shader texture accesses expecting floating-point return values.</li>
 * </ul>
 * The color components used for per-fragment operations and written into a color buffer are undefined:
 * <ul>
 * <li>for fixed-function fragment processing with an integer color buffer,</li>
 * <li>for fragment shaders that write floating-point color components to an integer color buffer, or</li>
 * <li>for fragment shaders that write integer color components to a color buffer with floating point or normalized integer components.</li>
 * </ul>
 * Requires {@link GL20 OpenGL 2.0} and <a href="http://www.opengl.org/registry/specs/NV/gpu_program4.txt">NV_gpu_program4</a> or <a href="http://www.opengl.org/registry/specs/EXT/gpu_shader4.txt">EXT_gpu_shader4</a>. Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public final class EXTTextureInteger {

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_RGBA_INTEGER_MODE_EXT = 0x8D9E;

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
	public static final int
		GL_RGBA32UI_EXT            = 0x8D70,
		GL_RGB32UI_EXT             = 0x8D71,
		GL_ALPHA32UI_EXT           = 0x8D72,
		GL_INTENSITY32UI_EXT       = 0x8D73,
		GL_LUMINANCE32UI_EXT       = 0x8D74,
		GL_LUMINANCE_ALPHA32UI_EXT = 0x8D75,
		GL_RGBA16UI_EXT            = 0x8D76,
		GL_RGB16UI_EXT             = 0x8D77,
		GL_ALPHA16UI_EXT           = 0x8D78,
		GL_INTENSITY16UI_EXT       = 0x8D79,
		GL_LUMINANCE16UI_EXT       = 0x8D7A,
		GL_LUMINANCE_ALPHA16UI_EXT = 0x8D7B,
		GL_RGBA8UI_EXT             = 0x8D7C,
		GL_RGB8UI_EXT              = 0x8D7D,
		GL_ALPHA8UI_EXT            = 0x8D7E,
		GL_INTENSITY8UI_EXT        = 0x8D7F,
		GL_LUMINANCE8UI_EXT        = 0x8D80,
		GL_LUMINANCE_ALPHA8UI_EXT  = 0x8D81,
		GL_RGBA32I_EXT             = 0x8D82,
		GL_RGB32I_EXT              = 0x8D83,
		GL_ALPHA32I_EXT            = 0x8D84,
		GL_INTENSITY32I_EXT        = 0x8D85,
		GL_LUMINANCE32I_EXT        = 0x8D86,
		GL_LUMINANCE_ALPHA32I_EXT  = 0x8D87,
		GL_RGBA16I_EXT             = 0x8D88,
		GL_RGB16I_EXT              = 0x8D89,
		GL_ALPHA16I_EXT            = 0x8D8A,
		GL_INTENSITY16I_EXT        = 0x8D8B,
		GL_LUMINANCE16I_EXT        = 0x8D8C,
		GL_LUMINANCE_ALPHA16I_EXT  = 0x8D8D,
		GL_RGBA8I_EXT              = 0x8D8E,
		GL_RGB8I_EXT               = 0x8D8F,
		GL_ALPHA8I_EXT             = 0x8D90,
		GL_INTENSITY8I_EXT         = 0x8D91,
		GL_LUMINANCE8I_EXT         = 0x8D92,
		GL_LUMINANCE_ALPHA8I_EXT   = 0x8D93;

	/** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels. */
	public static final int
		GL_RED_INTEGER_EXT             = 0x8D94,
		GL_GREEN_INTEGER_EXT           = 0x8D95,
		GL_BLUE_INTEGER_EXT            = 0x8D96,
		GL_ALPHA_INTEGER_EXT           = 0x8D97,
		GL_RGB_INTEGER_EXT             = 0x8D98,
		GL_RGBA_INTEGER_EXT            = 0x8D99,
		GL_BGR_INTEGER_EXT             = 0x8D9A,
		GL_BGRA_INTEGER_EXT            = 0x8D9B,
		GL_LUMINANCE_INTEGER_EXT       = 0x8D9C,
		GL_LUMINANCE_ALPHA_INTEGER_EXT = 0x8D9D;

	/** Function address. */
	@JavadocExclude
	public final long
		ClearColorIiEXT,
		ClearColorIuiEXT,
		TexParameterIivEXT,
		TexParameterIuivEXT,
		GetTexParameterIivEXT,
		GetTexParameterIuivEXT;

	@JavadocExclude
	public EXTTextureInteger(FunctionProvider provider) {
		ClearColorIiEXT = provider.getFunctionAddress("glClearColorIiEXT");
		ClearColorIuiEXT = provider.getFunctionAddress("glClearColorIuiEXT");
		TexParameterIivEXT = provider.getFunctionAddress("glTexParameterIivEXT");
		TexParameterIuivEXT = provider.getFunctionAddress("glTexParameterIuivEXT");
		GetTexParameterIivEXT = provider.getFunctionAddress("glGetTexParameterIivEXT");
		GetTexParameterIuivEXT = provider.getFunctionAddress("glGetTexParameterIuivEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTTextureInteger} instance for the current context. */
	public static EXTTextureInteger getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTTextureInteger);
	}

	static EXTTextureInteger create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_texture_integer") ) return null;

		EXTTextureInteger funcs = new EXTTextureInteger(provider);

		boolean supported = checkFunctions(
			funcs.ClearColorIiEXT, funcs.ClearColorIuiEXT, funcs.TexParameterIivEXT, funcs.TexParameterIuivEXT, funcs.GetTexParameterIivEXT, 
			funcs.GetTexParameterIuivEXT
		);

		return GL.checkExtension("GL_EXT_texture_integer", funcs, supported);
	}

	// --- [ glClearColorIiEXT ] ---

	/** JNI method for {@link #glClearColorIiEXT ClearColorIiEXT} */
	@JavadocExclude
	public static native void nglClearColorIiEXT(int r, int g, int b, int a, long __functionAddress);

	/**
	 * 
	 *
	 * @param r 
	 * @param g 
	 * @param b 
	 * @param a 
	 */
	public static void glClearColorIiEXT(int r, int g, int b, int a) {
		long __functionAddress = getInstance().ClearColorIiEXT;
		nglClearColorIiEXT(r, g, b, a, __functionAddress);
	}

	// --- [ glClearColorIuiEXT ] ---

	/** JNI method for {@link #glClearColorIuiEXT ClearColorIuiEXT} */
	@JavadocExclude
	public static native void nglClearColorIuiEXT(int r, int g, int b, int a, long __functionAddress);

	/**
	 * 
	 *
	 * @param r 
	 * @param g 
	 * @param b 
	 * @param a 
	 */
	public static void glClearColorIuiEXT(int r, int g, int b, int a) {
		long __functionAddress = getInstance().ClearColorIuiEXT;
		nglClearColorIuiEXT(r, g, b, a, __functionAddress);
	}

	// --- [ glTexParameterIivEXT ] ---

	/** JNI method for {@link #glTexParameterIivEXT TexParameterIivEXT} */
	@JavadocExclude
	public static native void nglTexParameterIivEXT(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexParameterIivEXT TexParameterIivEXT} */
	@JavadocExclude
	public static void nglTexParameterIivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterIivEXT;
		nglTexParameterIivEXT(target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param pname  
	 * @param params 
	 */
	public static void glTexParameterIivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTexParameterIivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterIivEXT TexParameterIivEXT} */
	public static void glTexParameterIivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTexParameterIivEXT(target, pname, memAddress(params));
	}

	/** Single value version of: {@link #glTexParameterIivEXT TexParameterIivEXT} */
	public static void glTexParameterIiEXT(int target, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglTexParameterIivEXT(target, pname, __buffer.address(params));
	}

	// --- [ glTexParameterIuivEXT ] ---

	/** JNI method for {@link #glTexParameterIuivEXT TexParameterIuivEXT} */
	@JavadocExclude
	public static native void nglTexParameterIuivEXT(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTexParameterIuivEXT TexParameterIuivEXT} */
	@JavadocExclude
	public static void nglTexParameterIuivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().TexParameterIuivEXT;
		nglTexParameterIuivEXT(target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param pname  
	 * @param params 
	 */
	public static void glTexParameterIuivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTexParameterIuivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTexParameterIuivEXT TexParameterIuivEXT} */
	public static void glTexParameterIuivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTexParameterIuivEXT(target, pname, memAddress(params));
	}

	/** Single value version of: {@link #glTexParameterIuivEXT TexParameterIuivEXT} */
	public static void glTexParameterIuiEXT(int target, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglTexParameterIuivEXT(target, pname, __buffer.address(params));
	}

	// --- [ glGetTexParameterIivEXT ] ---

	/** JNI method for {@link #glGetTexParameterIivEXT GetTexParameterIivEXT} */
	@JavadocExclude
	public static native void nglGetTexParameterIivEXT(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTexParameterIivEXT GetTexParameterIivEXT} */
	@JavadocExclude
	public static void nglGetTexParameterIivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterIivEXT;
		nglGetTexParameterIivEXT(target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param pname  
	 * @param params 
	 */
	public static void glGetTexParameterIivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterIivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterIivEXT GetTexParameterIivEXT} */
	public static void glGetTexParameterIivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIivEXT(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterIivEXT GetTexParameterIivEXT} */
	public static int glGetTexParameterIiEXT(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIivEXT(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTexParameterIuivEXT ] ---

	/** JNI method for {@link #glGetTexParameterIuivEXT GetTexParameterIuivEXT} */
	@JavadocExclude
	public static native void nglGetTexParameterIuivEXT(int target, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTexParameterIuivEXT GetTexParameterIuivEXT} */
	@JavadocExclude
	public static void nglGetTexParameterIuivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().GetTexParameterIuivEXT;
		nglGetTexParameterIuivEXT(target, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target 
	 * @param pname  
	 * @param params 
	 */
	public static void glGetTexParameterIuivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTexParameterIuivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTexParameterIuivEXT GetTexParameterIuivEXT} */
	public static void glGetTexParameterIuivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTexParameterIuivEXT(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTexParameterIuivEXT GetTexParameterIuivEXT} */
	public static int glGetTexParameterIuiEXT(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTexParameterIuivEXT(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}