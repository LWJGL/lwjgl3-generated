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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/framebuffer_object.txt">EXT_framebuffer_object</a> extension.
 * 
 * <p>This extension defines a simple interface for drawing to rendering destinations other than the buffers provided to the GL by the window-system.</p>
 * 
 * <p>In this extension, these newly defined rendering destinations are known collectively as "framebuffer-attachable images". This extension provides a
 * mechanism for attaching framebuffer-attachable images to the GL framebuffer as one of the standard GL logical buffers: color, depth, and stencil.
 * (Attaching a framebuffer-attachable image to the accum logical buffer is left for a future extension to define). When a framebuffer-attachable image is
 * attached to the framebuffer, it is used as the source and destination of fragment operations.</p>
 * 
 * <p>By allowing the use of a framebuffer-attachable image as a rendering destination, this extension enables a form of "offscreen" rendering. Furthermore,
 * "render to texture" is supported by allowing the images of a texture to be used as framebuffer-attachable images. A particular image of a texture object
 * is selected for use as a framebuffer-attachable image by specifying the mipmap level, cube map face (for a cube map texture), and z-offset (for a 3D
 * texture) that identifies the image. The "render to texture" semantics of this extension are similar to performing traditional rendering to the
 * framebuffer, followed immediately by a call to CopyTexSubImage. However, by using this extension instead, an application can achieve the same effect,
 * but with the advantage that the GL can usually eliminate the data copy that would have been incurred by calling CopyTexSubImage.</p>
 * 
 * <p>This extension also defines a new GL object type, called a "renderbuffer", which encapsulates a single 2D pixel image. The image of renderbuffer can be
 * used as a framebuffer-attachable image for generalized offscreen rendering and it also provides a means to support rendering to GL logical buffer types
 * which have no corresponding texture format (stencil, accum, etc). A renderbuffer is similar to a texture in that both renderbuffers and textures can be
 * independently allocated and shared among multiple contexts. The framework defined by this extension is general enough that support for attaching images
 * from GL objects other than textures and renderbuffers could be added by layered extensions.</p>
 * 
 * <p>To facilitate efficient switching between collections of framebuffer-attachable images, this extension introduces another new GL object, called a
 * framebuffer object. A framebuffer object contains the state that defines the traditional GL framebuffer, including its set of images. Prior to this
 * extension, it was the window-system which defined and managed this collection of images, traditionally by grouping them into a "drawable". The
 * window-system API's would also provide a function (i.e., wglMakeCurrent, glXMakeCurrent, aglSetDrawable, etc.) to bind a drawable with a GL context (as
 * is done in the WGL_ARB_pbuffer extension). In this extension however, this functionality is subsumed by the GL and the GL provides the function
 * BindFramebufferEXT to bind a framebuffer object to the current context. Later, the context can bind back to the window-system-provided framebuffer in
 * order to display rendered content.</p>
 * 
 * <p>Previous extensions that enabled rendering to a texture have been much more complicated. One example is the combination of ARB_pbuffer and
 * ARB_render_texture, both of which are window-system extensions. This combination requires calling MakeCurrent, an operation that may be expensive, to
 * switch between the window and the pbuffer drawables. An application must create one pbuffer per renderable texture in order to portably use
 * ARB_render_texture. An application must maintain at least one GL context per texture format, because each context can only operate on a single
 * pixelformat or FBConfig. All of these characteristics make ARB_render_texture both inefficient and cumbersome to use.</p>
 * 
 * <p>EXT_framebuffer_object, on the other hand, is both simpler to use and more efficient than ARB_render_texture. The EXT_framebuffer_object API is
 * contained wholly within the GL API and has no (non-portable) window-system components. Under EXT_framebuffer_object, it is not necessary to create a
 * second GL context when rendering to a texture image whose format differs from that of the window. Finally, unlike the pbuffers of ARB_render_texture, a
 * single framebuffer object can facilitate rendering to an unlimited number of texture objects.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public final class EXTFramebufferObject {

	/**
	 * Accepted by the {@code target} parameter of BindFramebufferEXT, CheckFramebufferStatusEXT, FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT,
	 * and GetFramebufferAttachmentParameterivEXT.
	 */
	public static final int GL_FRAMEBUFFER_EXT = 0x8D40;

	/**
	 * Accepted by the {@code target} parameter of BindRenderbufferEXT, RenderbufferStorageEXT, and GetRenderbufferParameterivEXT, and returned by
	 * GetFramebufferAttachmentParameterivEXT.
	 */
	public static final int GL_RENDERBUFFER_EXT = 0x8D41;

	/** Accepted by the {@code internalformat} parameter of RenderbufferStorageEXT. */
	public static final int
		GL_STENCIL_INDEX1_EXT  = 0x8D46,
		GL_STENCIL_INDEX4_EXT  = 0x8D47,
		GL_STENCIL_INDEX8_EXT  = 0x8D48,
		GL_STENCIL_INDEX16_EXT = 0x8D49;

	/** Accepted by the {@code pname} parameter of GetRenderbufferParameterivEXT. */
	public static final int
		GL_RENDERBUFFER_WIDTH_EXT           = 0x8D42,
		GL_RENDERBUFFER_HEIGHT_EXT          = 0x8D43,
		GL_RENDERBUFFER_INTERNAL_FORMAT_EXT = 0x8D44,
		GL_RENDERBUFFER_RED_SIZE_EXT        = 0x8D50,
		GL_RENDERBUFFER_GREEN_SIZE_EXT      = 0x8D51,
		GL_RENDERBUFFER_BLUE_SIZE_EXT       = 0x8D52,
		GL_RENDERBUFFER_ALPHA_SIZE_EXT      = 0x8D53,
		GL_RENDERBUFFER_DEPTH_SIZE_EXT      = 0x8D54,
		GL_RENDERBUFFER_STENCIL_SIZE_EXT    = 0x8D55;

	/** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameterivEXT. */
	public static final int
		GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT           = 0x8CD0,
		GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT           = 0x8CD1,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT         = 0x8CD2,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT = 0x8CD3,
		GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT    = 0x8CD4;

	/** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT, and GetFramebufferAttachmentParameterivEXT. */
	public static final int
		GL_COLOR_ATTACHMENT0_EXT  = 0x8CE0,
		GL_COLOR_ATTACHMENT1_EXT  = 0x8CE1,
		GL_COLOR_ATTACHMENT2_EXT  = 0x8CE2,
		GL_COLOR_ATTACHMENT3_EXT  = 0x8CE3,
		GL_COLOR_ATTACHMENT4_EXT  = 0x8CE4,
		GL_COLOR_ATTACHMENT5_EXT  = 0x8CE5,
		GL_COLOR_ATTACHMENT6_EXT  = 0x8CE6,
		GL_COLOR_ATTACHMENT7_EXT  = 0x8CE7,
		GL_COLOR_ATTACHMENT8_EXT  = 0x8CE8,
		GL_COLOR_ATTACHMENT9_EXT  = 0x8CE9,
		GL_COLOR_ATTACHMENT10_EXT = 0x8CEA,
		GL_COLOR_ATTACHMENT11_EXT = 0x8CEB,
		GL_COLOR_ATTACHMENT12_EXT = 0x8CEC,
		GL_COLOR_ATTACHMENT13_EXT = 0x8CED,
		GL_COLOR_ATTACHMENT14_EXT = 0x8CEE,
		GL_COLOR_ATTACHMENT15_EXT = 0x8CEF,
		GL_DEPTH_ATTACHMENT_EXT   = 0x8D00,
		GL_STENCIL_ATTACHMENT_EXT = 0x8D20;

	/** Returned by CheckFramebufferStatusEXT(). */
	public static final int
		GL_FRAMEBUFFER_COMPLETE_EXT                      = 0x8CD5,
		GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT         = 0x8CD6,
		GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT = 0x8CD7,
		GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT         = 0x8CD9,
		GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT            = 0x8CDA,
		GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT        = 0x8CDB,
		GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT        = 0x8CDC,
		GL_FRAMEBUFFER_UNSUPPORTED_EXT                   = 0x8CDD;

	/** Accepted by GetIntegerv(). */
	public static final int
		GL_FRAMEBUFFER_BINDING_EXT   = 0x8CA6,
		GL_RENDERBUFFER_BINDING_EXT  = 0x8CA7,
		GL_MAX_COLOR_ATTACHMENTS_EXT = 0x8CDF,
		GL_MAX_RENDERBUFFER_SIZE_EXT = 0x84E8;

	/** Returned by GetError(). */
	public static final int GL_INVALID_FRAMEBUFFER_OPERATION_EXT = 0x506;

	/** Function address. */
	@JavadocExclude
	public final long
		IsRenderbufferEXT,
		BindRenderbufferEXT,
		DeleteRenderbuffersEXT,
		GenRenderbuffersEXT,
		RenderbufferStorageEXT,
		GetRenderbufferParameterivEXT,
		IsFramebufferEXT,
		BindFramebufferEXT,
		DeleteFramebuffersEXT,
		GenFramebuffersEXT,
		CheckFramebufferStatusEXT,
		FramebufferTexture1DEXT,
		FramebufferTexture2DEXT,
		FramebufferTexture3DEXT,
		FramebufferRenderbufferEXT,
		GetFramebufferAttachmentParameterivEXT,
		GenerateMipmapEXT;

	@JavadocExclude
	public EXTFramebufferObject(FunctionProvider provider) {
		IsRenderbufferEXT = provider.getFunctionAddress("glIsRenderbufferEXT");
		BindRenderbufferEXT = provider.getFunctionAddress("glBindRenderbufferEXT");
		DeleteRenderbuffersEXT = provider.getFunctionAddress("glDeleteRenderbuffersEXT");
		GenRenderbuffersEXT = provider.getFunctionAddress("glGenRenderbuffersEXT");
		RenderbufferStorageEXT = provider.getFunctionAddress("glRenderbufferStorageEXT");
		GetRenderbufferParameterivEXT = provider.getFunctionAddress("glGetRenderbufferParameterivEXT");
		IsFramebufferEXT = provider.getFunctionAddress("glIsFramebufferEXT");
		BindFramebufferEXT = provider.getFunctionAddress("glBindFramebufferEXT");
		DeleteFramebuffersEXT = provider.getFunctionAddress("glDeleteFramebuffersEXT");
		GenFramebuffersEXT = provider.getFunctionAddress("glGenFramebuffersEXT");
		CheckFramebufferStatusEXT = provider.getFunctionAddress("glCheckFramebufferStatusEXT");
		FramebufferTexture1DEXT = provider.getFunctionAddress("glFramebufferTexture1DEXT");
		FramebufferTexture2DEXT = provider.getFunctionAddress("glFramebufferTexture2DEXT");
		FramebufferTexture3DEXT = provider.getFunctionAddress("glFramebufferTexture3DEXT");
		FramebufferRenderbufferEXT = provider.getFunctionAddress("glFramebufferRenderbufferEXT");
		GetFramebufferAttachmentParameterivEXT = provider.getFunctionAddress("glGetFramebufferAttachmentParameterivEXT");
		GenerateMipmapEXT = provider.getFunctionAddress("glGenerateMipmapEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTFramebufferObject} instance for the current context. */
	public static EXTFramebufferObject getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTFramebufferObject);
	}

	static EXTFramebufferObject create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_framebuffer_object") ) return null;

		EXTFramebufferObject funcs = new EXTFramebufferObject(provider);

		boolean supported = checkFunctions(
			funcs.IsRenderbufferEXT, funcs.BindRenderbufferEXT, funcs.DeleteRenderbuffersEXT, funcs.GenRenderbuffersEXT, funcs.RenderbufferStorageEXT, 
			funcs.GetRenderbufferParameterivEXT, funcs.IsFramebufferEXT, funcs.BindFramebufferEXT, funcs.DeleteFramebuffersEXT, funcs.GenFramebuffersEXT, 
			funcs.CheckFramebufferStatusEXT, funcs.FramebufferTexture1DEXT, funcs.FramebufferTexture2DEXT, funcs.FramebufferTexture3DEXT, 
			funcs.FramebufferRenderbufferEXT, funcs.GetFramebufferAttachmentParameterivEXT, funcs.GenerateMipmapEXT
		);

		return GL.checkExtension("GL_EXT_framebuffer_object", funcs, supported);
	}

	// --- [ glIsRenderbufferEXT ] ---

	public static boolean glIsRenderbufferEXT(int renderbuffer) {
		long __functionAddress = getInstance().IsRenderbufferEXT;
		return callIZ(__functionAddress, renderbuffer);
	}

	// --- [ glBindRenderbufferEXT ] ---

	public static void glBindRenderbufferEXT(int target, int renderbuffer) {
		long __functionAddress = getInstance().BindRenderbufferEXT;
		callIIV(__functionAddress, target, renderbuffer);
	}

	// --- [ glDeleteRenderbuffersEXT ] ---

	/** Unsafe version of {@link #glDeleteRenderbuffersEXT DeleteRenderbuffersEXT} */
	@JavadocExclude
	public static void nglDeleteRenderbuffersEXT(int n, long renderbuffers) {
		long __functionAddress = getInstance().DeleteRenderbuffersEXT;
		callIPV(__functionAddress, n, renderbuffers);
	}

	public static void glDeleteRenderbuffersEXT(int n, ByteBuffer renderbuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(renderbuffers, n << 2);
		nglDeleteRenderbuffersEXT(n, memAddress(renderbuffers));
	}

	/** Alternative version of: {@link #glDeleteRenderbuffersEXT DeleteRenderbuffersEXT} */
	public static void glDeleteRenderbuffersEXT(IntBuffer renderbuffers) {
		nglDeleteRenderbuffersEXT(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	/** Single value version of: {@link #glDeleteRenderbuffersEXT DeleteRenderbuffersEXT} */
	public static void glDeleteRenderbuffersEXT(int renderbuffer) {
		APIBuffer __buffer = apiBuffer();
		int renderbuffers = __buffer.intParam(renderbuffer);
		nglDeleteRenderbuffersEXT(1, __buffer.address(renderbuffers));
	}

	// --- [ glGenRenderbuffersEXT ] ---

	/** Unsafe version of {@link #glGenRenderbuffersEXT GenRenderbuffersEXT} */
	@JavadocExclude
	public static void nglGenRenderbuffersEXT(int n, long renderbuffers) {
		long __functionAddress = getInstance().GenRenderbuffersEXT;
		callIPV(__functionAddress, n, renderbuffers);
	}

	public static void glGenRenderbuffersEXT(int n, ByteBuffer renderbuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(renderbuffers, n << 2);
		nglGenRenderbuffersEXT(n, memAddress(renderbuffers));
	}

	/** Alternative version of: {@link #glGenRenderbuffersEXT GenRenderbuffersEXT} */
	public static void glGenRenderbuffersEXT(IntBuffer renderbuffers) {
		nglGenRenderbuffersEXT(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	/** Single return value version of: {@link #glGenRenderbuffersEXT GenRenderbuffersEXT} */
	public static int glGenRenderbuffersEXT() {
		APIBuffer __buffer = apiBuffer();
		int renderbuffers = __buffer.intParam();
		nglGenRenderbuffersEXT(1, __buffer.address(renderbuffers));
		return __buffer.intValue(renderbuffers);
	}

	// --- [ glRenderbufferStorageEXT ] ---

	public static void glRenderbufferStorageEXT(int target, int internalformat, int width, int height) {
		long __functionAddress = getInstance().RenderbufferStorageEXT;
		callIIIIV(__functionAddress, target, internalformat, width, height);
	}

	// --- [ glGetRenderbufferParameterivEXT ] ---

	/** Unsafe version of {@link #glGetRenderbufferParameterivEXT GetRenderbufferParameterivEXT} */
	@JavadocExclude
	public static void nglGetRenderbufferParameterivEXT(int target, int pname, long params) {
		long __functionAddress = getInstance().GetRenderbufferParameterivEXT;
		callIIPV(__functionAddress, target, pname, params);
	}

	public static void glGetRenderbufferParameterivEXT(int target, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetRenderbufferParameterivEXT(target, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetRenderbufferParameterivEXT GetRenderbufferParameterivEXT} */
	public static void glGetRenderbufferParameterivEXT(int target, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetRenderbufferParameterivEXT(target, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetRenderbufferParameterivEXT GetRenderbufferParameterivEXT} */
	public static int glGetRenderbufferParameteriEXT(int target, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetRenderbufferParameterivEXT(target, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glIsFramebufferEXT ] ---

	public static boolean glIsFramebufferEXT(int framebuffer) {
		long __functionAddress = getInstance().IsFramebufferEXT;
		return callIZ(__functionAddress, framebuffer);
	}

	// --- [ glBindFramebufferEXT ] ---

	public static void glBindFramebufferEXT(int target, int framebuffer) {
		long __functionAddress = getInstance().BindFramebufferEXT;
		callIIV(__functionAddress, target, framebuffer);
	}

	// --- [ glDeleteFramebuffersEXT ] ---

	/** Unsafe version of {@link #glDeleteFramebuffersEXT DeleteFramebuffersEXT} */
	@JavadocExclude
	public static void nglDeleteFramebuffersEXT(int n, long framebuffers) {
		long __functionAddress = getInstance().DeleteFramebuffersEXT;
		callIPV(__functionAddress, n, framebuffers);
	}

	public static void glDeleteFramebuffersEXT(int n, ByteBuffer framebuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(framebuffers, n << 2);
		nglDeleteFramebuffersEXT(n, memAddress(framebuffers));
	}

	/** Alternative version of: {@link #glDeleteFramebuffersEXT DeleteFramebuffersEXT} */
	public static void glDeleteFramebuffersEXT(IntBuffer framebuffers) {
		nglDeleteFramebuffersEXT(framebuffers.remaining(), memAddress(framebuffers));
	}

	/** Single value version of: {@link #glDeleteFramebuffersEXT DeleteFramebuffersEXT} */
	public static void glDeleteFramebuffersEXT(int framebuffer) {
		APIBuffer __buffer = apiBuffer();
		int framebuffers = __buffer.intParam(framebuffer);
		nglDeleteFramebuffersEXT(1, __buffer.address(framebuffers));
	}

	// --- [ glGenFramebuffersEXT ] ---

	/** Unsafe version of {@link #glGenFramebuffersEXT GenFramebuffersEXT} */
	@JavadocExclude
	public static void nglGenFramebuffersEXT(int n, long framebuffers) {
		long __functionAddress = getInstance().GenFramebuffersEXT;
		callIPV(__functionAddress, n, framebuffers);
	}

	public static void glGenFramebuffersEXT(int n, ByteBuffer framebuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(framebuffers, n << 2);
		nglGenFramebuffersEXT(n, memAddress(framebuffers));
	}

	/** Alternative version of: {@link #glGenFramebuffersEXT GenFramebuffersEXT} */
	public static void glGenFramebuffersEXT(IntBuffer framebuffers) {
		nglGenFramebuffersEXT(framebuffers.remaining(), memAddress(framebuffers));
	}

	/** Single return value version of: {@link #glGenFramebuffersEXT GenFramebuffersEXT} */
	public static int glGenFramebuffersEXT() {
		APIBuffer __buffer = apiBuffer();
		int framebuffers = __buffer.intParam();
		nglGenFramebuffersEXT(1, __buffer.address(framebuffers));
		return __buffer.intValue(framebuffers);
	}

	// --- [ glCheckFramebufferStatusEXT ] ---

	public static int glCheckFramebufferStatusEXT(int target) {
		long __functionAddress = getInstance().CheckFramebufferStatusEXT;
		return callII(__functionAddress, target);
	}

	// --- [ glFramebufferTexture1DEXT ] ---

	public static void glFramebufferTexture1DEXT(int target, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().FramebufferTexture1DEXT;
		callIIIIIV(__functionAddress, target, attachment, textarget, texture, level);
	}

	// --- [ glFramebufferTexture2DEXT ] ---

	public static void glFramebufferTexture2DEXT(int target, int attachment, int textarget, int texture, int level) {
		long __functionAddress = getInstance().FramebufferTexture2DEXT;
		callIIIIIV(__functionAddress, target, attachment, textarget, texture, level);
	}

	// --- [ glFramebufferTexture3DEXT ] ---

	public static void glFramebufferTexture3DEXT(int target, int attachment, int textarget, int texture, int level, int zoffset) {
		long __functionAddress = getInstance().FramebufferTexture3DEXT;
		callIIIIIIV(__functionAddress, target, attachment, textarget, texture, level, zoffset);
	}

	// --- [ glFramebufferRenderbufferEXT ] ---

	public static void glFramebufferRenderbufferEXT(int target, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = getInstance().FramebufferRenderbufferEXT;
		callIIIIV(__functionAddress, target, attachment, renderbuffertarget, renderbuffer);
	}

	// --- [ glGetFramebufferAttachmentParameterivEXT ] ---

	/** Unsafe version of {@link #glGetFramebufferAttachmentParameterivEXT GetFramebufferAttachmentParameterivEXT} */
	@JavadocExclude
	public static void nglGetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, long params) {
		long __functionAddress = getInstance().GetFramebufferAttachmentParameterivEXT;
		callIIIPV(__functionAddress, target, attachment, pname, params);
	}

	public static void glGetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFramebufferAttachmentParameterivEXT(target, attachment, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFramebufferAttachmentParameterivEXT GetFramebufferAttachmentParameterivEXT} */
	public static void glGetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFramebufferAttachmentParameterivEXT(target, attachment, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFramebufferAttachmentParameterivEXT GetFramebufferAttachmentParameterivEXT} */
	public static int glGetFramebufferAttachmentParameteriEXT(int target, int attachment, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetFramebufferAttachmentParameterivEXT(target, attachment, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGenerateMipmapEXT ] ---

	public static void glGenerateMipmapEXT(int target) {
		long __functionAddress = getInstance().GenerateMipmapEXT;
		callIV(__functionAddress, target);
	}

}