/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/OES/OES_EGL_image_external.txt">OES_EGL_image_external</a> extension.
 * 
 * <p>This extension provides a mechanism for creating EGLImage texture targets from EGLImages. This extension defines a new texture target,
 * TEXTURE_EXTERNAL_OES. This texture target can only be specified using an EGLImage. There is no support for most of the functions that manipulate other
 * texture targets (e.g. you cannot use gl*Tex*Image*() functions with TEXTURE_EXTERNAL_OES). Also, TEXTURE_EXTERNAL_OES targets never have more than a
 * single LOD level. Because of these restrictions, it is possible to bind EGLImages which have internal formats not otherwise supported by OpenGL ES. For
 * example some implementations may allow EGLImages with planar or interleaved YUV data to be GLES texture target siblings. It is up to the implementation
 * exactly what formats are accepted.</p>
 */
public final class OESEGLImageExternal {

	/** Accepted as a target in the {@code target} parameter of BindTexture and EGLImageTargetTexture2DOES. */
	public static final int GL_TEXTURE_EXTERNAL_OES = 0x8D65;

	/** Returned in the {@code type} parameter of GetActiveUniform. */
	public static final int GL_SAMPLER_EXTERNAL_OES = 0x8D66;

	/** Accepted as the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetFixedv. */
	public static final int GL_TEXTURE_BINDING_EXTERNAL_OES = 0x8D67;

	/** Accepted as {@code value} in GetTexParameter*() queries. */
	public static final int GL_REQUIRED_TEXTURE_IMAGE_UNITS_OES = 0x8D68;

	private OESEGLImageExternal() {}

}