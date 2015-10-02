/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/clip_control.txt">ARB_clip_control</a> extension.
 * 
 * <p>This extension provides additional clip control modes to configure how clip space is mapped to window space.  This extension's goal is to 1) allow
 * OpenGL to effectively match Direct3D's coordinate system conventions, and 2) potentially improve the numerical precision of the Z coordinate mapping.</p>
 * 
 * <p>Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public class ARBClipControl {

	/** Accepted by the {@code origin} parameter of {@link #glClipControl ClipControl}. */
	public static final int
		GL_LOWER_LEFT = 0x8CA1,
		GL_UPPER_LEFT = 0x8CA2;

	/** Accepted by the {@code depth} parameter of {@link #glClipControl ClipControl}. */
	public static final int
		GL_NEGATIVE_ONE_TO_ONE = 0x935E,
		GL_ZERO_TO_ONE         = 0x935F;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CLIP_ORIGIN     = 0x935C,
		GL_CLIP_DEPTH_MODE = 0x935D;

	/** Function address. */
	@JavadocExclude
	public final long ClipControl;

	@JavadocExclude
	protected ARBClipControl() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public ARBClipControl(FunctionProvider provider) {
		ClipControl = provider.getFunctionAddress("glClipControl");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBClipControl} instance for the current context. */
	public static ARBClipControl getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBClipControl);
	}

	static ARBClipControl create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_clip_control") ) return null;

		ARBClipControl funcs = new ARBClipControl(provider);

		boolean supported = checkFunctions(
			funcs.ClipControl
		);

		return GL.checkExtension("GL_ARB_clip_control", funcs, supported);
	}

	// --- [ glClipControl ] ---

	/**
	 * Controls the clipping volume behavior.
	 * 
	 * <p>These parameters update the clip control origin and depth mode respectively. The initial value of the clip control origin is {@link GL20#GL_LOWER_LEFT LOWER_LEFT} and the
	 * initial value of the depth mode is {@link #GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if ClipControl is executed between the execution of {@link GL11#glBegin Begin} and the corresponding
	 * execution of {@link GL11#glEnd End}.</p>
	 *
	 * @param origin the clip origin. One of:<br>{@link GL20#GL_LOWER_LEFT LOWER_LEFT}, {@link GL20#GL_UPPER_LEFT UPPER_LEFT}
	 * @param depth  the clip depth mode. One of:<br>{@link #GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}, {@link #GL_ZERO_TO_ONE ZERO_TO_ONE}
	 */
	public static void glClipControl(int origin, int depth) {
		long __functionAddress = getInstance().ClipControl;
		callIIV(__functionAddress, origin, depth);
	}

}