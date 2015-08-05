/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/fill_rectangle.txt">NV_fill_rectangle</a> extension.
 * 
 * <p>This extension adds a new PolygonMode setting where a triangle is rasterized by computing and filling its axis-aligned screen-space bounding box,
 * disregarding the actual triangle edges. This can be useful for drawing a rectangle without being split into two triangles with an internal edge. It is
 * also useful to minimize the number of primitives that need to be drawn, particularly for a user-interface.</p>
 * 
 * <p>Requires {@link NVPolygonMode NV_polygon_mode}.</p>
 */
public final class NVFillRectangle {

	/**  */
	public static final int GL_FILL_RECTANGLE_NV = 0x933C;

	private NVFillRectangle() {}

}