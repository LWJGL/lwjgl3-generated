/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/bgra.txt">EXT_bgra</a> extension.
 * 
 * <p>EXT_bgra extends the list of host-memory color formats. Specifically, it provides formats which match the memory layout of Windows DIBs so that
 * applications can use the same data in both Windows API calls and OpenGL pixel API calls.</p>
 * 
 * <p>Promoted to core in {@link GL12 OpenGL 1.2}.</p>
 */
public final class EXTBGRA {

	/** Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D. */
	public static final int
		GL_BGR_EXT  = 0x80E0,
		GL_BGRA_EXT = 0x80E1;

	private EXTBGRA() {}

}