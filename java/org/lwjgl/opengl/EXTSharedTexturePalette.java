/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/shared_texture_palette.txt">EXT_shared_texture_palette</a> extension.
 * 
 * <p>EXT_shared_texture_palette defines a shared texture palette which may be used in place of the texture object palettes provided by
 * <a href="http://www.opengl.org/registry/specs/EXT/paletted_texture.txt">EXT_paletted_texture</a>. This is useful for rapidly changing a palette common to many textures, rather than having to reload the
 * new palette for each texture. The extension acts as a switch, causing all lookups that would normally be done on the texture's palette to instead use
 * the shared palette.</p>
 * 
 * <p>Requires <a href="http://www.opengl.org/registry/specs/EXT/paletted_texture.txt">EXT_paletted_texture</a>.</p>
 */
public final class EXTSharedTexturePalette {

	/**
	 * Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, IsEnabled, Enable, Disable, ColorTableEXT,
	 * ColorSubTableEXT, GetColorTableEXT, GetColorTableParameterivEXT, and GetColorTableParameterfd EXT.
	 */
	public static final int GL_SHARED_TEXTURE_PALETTE_EXT = 0x81FB;

	private EXTSharedTexturePalette() {}

}