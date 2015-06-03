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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/framebuffer_no_attachments.txt">ARB_framebuffer_no_attachments</a> extension.
 * 
 * <p>Framebuffer objects as introduced by {@link ARBFramebufferObject ARB_framebuffer_object} and OpenGL 3.0 provide a generalized mechanism for rendering to off-screen surfaces.
 * Each framebuffer object may have depth, stencil and zero or more color attachments that can be written to by the GL. The size of the framebuffer (width,
 * height, layer count, sample count) is derived from the attachments of that framebuffer. In unextended OpenGL 4.2, it is not legal to render into a
 * framebuffer object that has no attachments. Such a framebuffer would be considered incomplete with the {@link GL30#GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT}
 * status.</p>
 * 
 * <p>With OpenGL 4.2 and {@link ARBShaderImageLoadStore ARB_shader_image_load_store}, fragment shaders are capable of doing random access writes to buffer and texture memory via
 * image loads, stores, and atomics. This ability enables algorithms using the conventional rasterizer to generate a collection of fragments, where each
 * fragment shader invocation will write its outputs to buffer or texture memory using image stores or atomics. Such algorithms may have no need to write
 * color or depth values to a conventional framebuffer. However, a framebuffer with no attachments will be considered incomplete and no rasterization or
 * fragment shader exectuion will occur. To avoid such errors, an application may be required to create an otherwise unnecessary "dummy" texture and attach
 * it to the framebuffer (possibly with color writes masked off). If the algorithm requires the rasterizer to operate over a large number of pixels, this
 * dummy texture will needlessly consume a significant amount of memory.</p>
 * 
 * <p>This extension enables the algorithms described above to work even with a framebuffer with no attachments. Applications can specify default width,
 * height, layer count, and sample count parameters for a framebuffer object. When a framebuffer with no attachments is bound, it will be considered
 * complete as long as the application has specified non-zero default width and height parameters. For the purposes of rasterization, the framebuffer will
 * be considered to have a width, height, layer count, and sample count derived from its default parameters. Framebuffers with one or more attachments are
 * not affected by these default parameters; the size of the framebuffer will still be derived from the sizes of the attachments in that case.</p>
 * 
 * <p>Additionally, this extension provides queryable implementation-dependent maximums for framebuffer width, height, layer count, and sample count, which
 * may differ from similar limits on textures and renderbuffers. These maximums will be used to error-check the default framebuffer parameters and also
 * permit implementations to expose the ability to rasterize to an attachment-less framebuffer larger than the maximum supported texture size.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} or {@link ARBFramebufferObject ARB_framebuffer_object}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBFramebufferNoAttachments {

	/**
	 * Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv, NamedFramebufferParameteriEXT, and
	 * GetNamedFramebufferParameterivEXT.
	 */
	public static final int
		GL_FRAMEBUFFER_DEFAULT_WIDTH                  = 0x9310,
		GL_FRAMEBUFFER_DEFAULT_HEIGHT                 = 0x9311,
		GL_FRAMEBUFFER_DEFAULT_LAYERS                 = 0x9312,
		GL_FRAMEBUFFER_DEFAULT_SAMPLES                = 0x9313,
		GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_FRAMEBUFFER_WIDTH   = 0x9315,
		GL_MAX_FRAMEBUFFER_HEIGHT  = 0x9316,
		GL_MAX_FRAMEBUFFER_LAYERS  = 0x9317,
		GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;

	/** Function address. */
	@JavadocExclude
	public final long
		FramebufferParameteri,
		GetFramebufferParameteriv,
		NamedFramebufferParameteriEXT,
		GetNamedFramebufferParameterivEXT;

	@JavadocExclude
	public ARBFramebufferNoAttachments(FunctionProvider provider) {
		FramebufferParameteri = provider.getFunctionAddress("glFramebufferParameteri");
		GetFramebufferParameteriv = provider.getFunctionAddress("glGetFramebufferParameteriv");
		NamedFramebufferParameteriEXT = provider.getFunctionAddress("glNamedFramebufferParameteriEXT");
		GetNamedFramebufferParameterivEXT = provider.getFunctionAddress("glGetNamedFramebufferParameterivEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBFramebufferNoAttachments} instance for the current context. */
	public static ARBFramebufferNoAttachments getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBFramebufferNoAttachments);
	}

	static ARBFramebufferNoAttachments create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_framebuffer_no_attachments") ) return null;

		ARBFramebufferNoAttachments funcs = new ARBFramebufferNoAttachments(provider);

		boolean supported = checkFunctions(
			funcs.FramebufferParameteri, funcs.GetFramebufferParameteriv, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.NamedFramebufferParameteriEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.GetNamedFramebufferParameterivEXT : -1L
		);

		return GL.checkExtension("GL_ARB_framebuffer_no_attachments", funcs, supported);
	}

	// --- [ glFramebufferParameteri ] ---

	/**
	 * Sets a named parameter of a framebuffer.
	 *
	 * @param target target of the operation. One of:<br>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}
	 * @param pname  a token indicating the parameter to be modified. One of:<br>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param param  the new value for the parameter named {@code pname}
	 */
	public static void glFramebufferParameteri(int target, int pname, int param) {
		long __functionAddress = getInstance().FramebufferParameteri;
		GL43.nglFramebufferParameteri(target, pname, param, __functionAddress);
	}

	// --- [ glGetFramebufferParameteriv ] ---

	/** Unsafe version of {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	@JavadocExclude
	public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
		long __functionAddress = getInstance().GetFramebufferParameteriv;
		GL43.nglGetFramebufferParameteriv(target, pname, params, __functionAddress);
	}

	/**
	 * Retrieves a named parameter from a framebuffer.
	 *
	 * @param target target of the operation. One of:<br>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}, {@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}
	 * @param pname  a token indicating the parameter to be retrieved. One of:<br>{@link #GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link #GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link #GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link #GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link #GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param params a variable to receive the value of the parameter named {@code pname}
	 */
	public static void glGetFramebufferParameteriv(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	public static void glGetFramebufferParameteriv(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFramebufferParameteriv(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv} */
	public static int glGetFramebufferParameteri(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetFramebufferParameteriv(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glNamedFramebufferParameteriEXT ] ---

	/** JNI method for {@link #glNamedFramebufferParameteriEXT NamedFramebufferParameteriEXT} */
	@JavadocExclude
	public static native void nglNamedFramebufferParameteriEXT(int framebuffer, int pname, int param, long __functionAddress);

	/**
	 * DSA version of {@link #glFramebufferParameteri FramebufferParameteri}.
	 *
	 * @param framebuffer the framebuffer object
	 * @param pname       a token indicating the parameter to be modified. One of:<br>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param param       the new value for the parameter named {@code pname}
	 */
	public static void glNamedFramebufferParameteriEXT(int framebuffer, int pname, int param) {
		long __functionAddress = getInstance().NamedFramebufferParameteriEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedFramebufferParameteriEXT(framebuffer, pname, param, __functionAddress);
	}

	// --- [ glGetNamedFramebufferParameterivEXT ] ---

	/** JNI method for {@link #glGetNamedFramebufferParameterivEXT GetNamedFramebufferParameterivEXT} */
	@JavadocExclude
	public static native void nglGetNamedFramebufferParameterivEXT(int framebuffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedFramebufferParameterivEXT GetNamedFramebufferParameterivEXT} */
	@JavadocExclude
	public static void nglGetNamedFramebufferParameterivEXT(int framebuffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedFramebufferParameterivEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGetNamedFramebufferParameterivEXT(framebuffer, pname, params, __functionAddress);
	}

	/**
	 * DSA version of {@link #glGetFramebufferParameteriv GetFramebufferParameteriv}.
	 *
	 * @param framebuffer the framebuffer object
	 * @param pname       a token indicating the parameter to be retrieved. One of:<br>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param params      a variable to receive the value of the parameter named {@code pname}
	 */
	public static void glGetNamedFramebufferParameterivEXT(int framebuffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedFramebufferParameterivEXT(framebuffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedFramebufferParameterivEXT GetNamedFramebufferParameterivEXT} */
	public static void glGetNamedFramebufferParameterivEXT(int framebuffer, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedFramebufferParameterivEXT(framebuffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedFramebufferParameterivEXT GetNamedFramebufferParameterivEXT} */
	public static int glGetNamedFramebufferParameteriEXT(int framebuffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedFramebufferParameterivEXT(framebuffer, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}