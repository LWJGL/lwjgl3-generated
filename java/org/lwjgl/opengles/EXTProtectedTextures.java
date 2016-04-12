/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_protected_textures.txt">EXT_protected_textures</a> extension.
 * 
 * <p>This extension requires another extension like {@code EGL_EXT_protected_content} to have created a protected context. A protected context enables the
 * driver to put the GPU into a protected mode where it is able to operate on protected surfaces.</p>
 * 
 * <p>This extension enables allocating standard GL textures as protected surfaces. Previously these textures would have had to have been created as special
 * EGL surfaces. This allows use-cases such as depth, stencil, or mipmapped textures to be supported as destinations for rendering within a protected
 * context.</p>
 * 
 * <p>An explanation of undefined behavior in this extension: Several places in this extension mention undefined behavior can result, which can include
 * program termination. The reason for this is because one way to handle protected content is by using a protected virtual to physical memory translation
 * layer. With this sort of solution a system may generate read or write faults when a non-protected context tries to access the buffer. Depending on the
 * system these faults might be ignored or they might cause process termination. This undefined behavior should not include actually allowing copying any
 * protected content to a non-protected surface.</p>
 * 
 * <p>This extension does not guarantee that the implementation abides by a system's digital rights management requirements. It must be verified beyond the
 * existence of this extension that the implementation of this extension is trustworthy according to the requirements of a content protection system.</p>
 */
public final class EXTProtectedTextures {

	/** Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS. */
	public static final int GL_CONTEXT_FLAG_PROTECTED_CONTENT_BIT_EXT = 0x10;

	/**
	 * Accepted as a value for {@code pname} for the TexParameter{if} and TexParameter{if}v commands and for the {@code value} parameter of
	 * GetTexParameter{if}v.
	 */
	public static final int GL_TEXTURE_PROTECTED_EXT = 0x8BFA;

	private EXTProtectedTextures() {}

}