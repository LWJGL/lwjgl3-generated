/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/light_max_exponent.txt">NV_light_max_exponent</a> extension.
 * 
 * <p>Default OpenGL does not permit a shininess or spot exponent over 128.0.  This extension permits implementations to support and advertise a maximum
 * shininess and spot exponent beyond 128.0.</p>
 */
public final class NVLightMaxExponent {

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev */
	public static final int
		GL_MAX_SHININESS_NV     = 0x8504,
		GL_MAX_SPOT_EXPONENT_NV = 0x8505;

	private NVLightMaxExponent() {}

}