/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/occlusion_query2.txt">ARB_occlusion_query2</a> extension.
 * 
 * <p>This extension trivially adds a boolean occlusion query to {@link ARBOcclusionQuery ARB_occlusion_query}.</p>
 * 
 * <p>While the counter-based occlusion query provided by ARB_occlusion_query is flexible, there is still value to a simple boolean, which is often sufficient
 * for applications.</p>
 * 
 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public final class ARBOcclusionQuery2 {

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;

	private ARBOcclusionQuery2() {}

}