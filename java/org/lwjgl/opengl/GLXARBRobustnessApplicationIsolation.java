/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/glx_robustness_isolation.txt">GLX_ARB_robustness_application_isolation</a> extension.
 * 
 * <p>GL_ARB_robustness and GLX_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
 * GLX_ARB_robustness_application_isolation and GLX_ARB_robustness_share_group_isolation provide stronger guarantees about the possible side-effects of a
 * graphics reset.</p>
 * 
 * <p>Requires {@link GLX14 GLX 1.4} and {@link GLXARBCreateContextRobustness GLX_ARB_create_context_robustness}.</p>
 */
public final class GLXARBRobustnessApplicationIsolation {

	/**
	 * Accepted as a bit in the attribute value for {@link GLXARBCreateContext#GLX_CONTEXT_FLAGS_ARB CONTEXT_FLAGS_ARB} in the {@code attrib_list} argument to
	 * {@link GLXARBCreateContext#glXCreateContextAttribsARB CreateContextAttribsARB}.
	 */
	public static final int GLX_CONTEXT_RESET_ISOLATION_BIT_ARB = 0x8;

	private GLXARBRobustnessApplicationIsolation() {}

}