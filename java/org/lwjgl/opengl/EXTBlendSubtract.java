/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/blend_subtract.txt">EXT_blend_subtract</a> extension.
 * 
 * <p>Two additional blending equations are specified using the interface defined by <a href="http://www.opengl.org/registry/specs/EXT/blend_minmax.link.txt">EXT_blend_minmax.link</a>. These equations are similar to the default
 * blending equation, but produce the difference of its left and right hand sides, rather than the sum.  Image differences are useful in many image
 * processing applications.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public final class EXTBlendSubtract {

	/** Accepted by the {@code mode} parameter of BlendEquationEXT. */
	public static final int
		GL_FUNC_SUBTRACT_EXT         = 0x800A,
		GL_FUNC_REVERSE_SUBTRACT_EXT = 0x800B;

	private EXTBlendSubtract() {}

}