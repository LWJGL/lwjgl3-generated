/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_texture_sRGB_R8.txt">EXT_texture_sRGB_R8</a> extension.
 * 
 * <p>This extension introduces SR8_EXT as an acceptable internal format. This allows efficient sRGB sampling for source images stored as a separate texture
 * per channel.</p>
 * 
 * <p>Requires {@link GLES30 GLES E.S}.</p>
 */
public final class EXTTextureSRGBR8 {

	/** Accepted by the {@code internalformat} parameters of TexImage2D, TexImage3D, TexStorage2D and TexStorage3D. */
	public static final int GL_SR8_EXT = 0x8FBD;

	private EXTTextureSRGBR8() {}

}