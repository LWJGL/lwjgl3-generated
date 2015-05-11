/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/fill_rectangle.txt">NV_fill_rectangle</a> extension.
 * 
 * <p>This extension adds a new PolygonMode setting where a triangle is
 * rasterized by computing and filling its axis-aligned screen-space bounding
 * box, disregarding the actual triangle edges. This can be useful for
 * drawing a rectangle without being split into two triangles with an
 * internal edge.  It is also useful to minimize the number of primitives
 * that need to be drawn, particularly for a user-interface.</p>
 */
public final class NVFillRectangle {

	/** Accepted by the {@code mode} parameter of PolygonMode. */
	public static final int GL_FILL_RECTANGLE_NV = 0x933C;

	private NVFillRectangle() {}

}