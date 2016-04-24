/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/draw_buffers_blend.txt">ARB_draw_buffers_blend</a> extension.
 * 
 * <p>This extension builds upon the {@link ARBDrawBuffers ARB_draw_buffers} and <a href="http://www.opengl.org/registry/specs/EXT/draw_buffers2.txt">EXT_draw_buffers2</a> extensions. In ARB_draw_buffers (part of OpenGL
 * 2.0), separate values could be written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending
 * and to set color write masks independently per color output.</p>
 * 
 * <p>This extension provides the ability to set individual blend equations and blend functions for each color output.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and <a href="http://www.opengl.org/registry/specs/EXT/draw_buffers2.txt">EXT_draw_buffers2</a>. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBDrawBuffersBlend {

	protected ARBDrawBuffersBlend() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBlendEquationiARB, caps.glBlendEquationSeparateiARB, caps.glBlendFunciARB, caps.glBlendFuncSeparateiARB
		);
	}

	// --- [ glBlendEquationiARB ] ---

	/**
	 * Provides a way to enable blending and set color write masks independently per color output.
	 * 
	 * <p>This call modifies the blend equations associated with an individual draw buffer.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if the {@code buf} parameter is outside the range [0, {@link GL20#GL_MAX_DRAW_BUFFERS MAX_DRAW_BUFFERS} &ndash; 1].</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if {@code mode} is not one of {@link GL14#GL_FUNC_ADD FUNC_ADD}, {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT},
	 * {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MAX MAX}, or {@link GL14#GL_MIN MIN}.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this method is executed between the execution of {@link GL11#glBegin Begin} and the corresponding execution
	 * of {@link GL11#glEnd End}.</p>
	 *
	 * @param buf  an integer that indicates the {@link GL11#GL_DRAW_BUFFER DRAW_BUFFER} to modify.
	 * @param mode determines both the RGB and alpha blend equations. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
	 */
	public static void glBlendEquationiARB(int buf, int mode) {
		long __functionAddress = GL.getCapabilities().glBlendEquationiARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, mode);
	}

	// --- [ glBlendEquationSeparateiARB ] ---

	/**
	 * Provides a way to enable blending and set color write masks independently per color output.
	 * 
	 * <p>This call modifies the blend equations associated with an individual draw buffer.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if the {@code buf} parameter is outside the range [0, {@link GL20#GL_MAX_DRAW_BUFFERS MAX_DRAW_BUFFERS} &ndash; 1].</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if either {@code modeRGB} or {@code modeAlpha} are not one of {@link GL14#GL_FUNC_ADD FUNC_ADD},
	 * {@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link GL14#GL_MAX MAX}, or {@link GL14#GL_MIN MIN}.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this method is executed between the execution of {@link GL11#glBegin Begin} and the corresponding execution
	 * of {@link GL11#glEnd End}.</p>
	 *
	 * @param buf       an integer that indicates the {@link GL11#GL_DRAW_BUFFER DRAW_BUFFER} to modify.
	 * @param modeRGB   the RGB blend equation. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
	 * @param modeAlpha the alpha blend equation. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
	 */
	public static void glBlendEquationSeparateiARB(int buf, int modeRGB, int modeAlpha) {
		long __functionAddress = GL.getCapabilities().glBlendEquationSeparateiARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, modeRGB, modeAlpha);
	}

	// --- [ glBlendFunciARB ] ---

	/**
	 * Provides a way to enable blending and set color write masks independently per color output.
	 * 
	 * <p>This call modifies the blend functions associated with an individual draw buffer.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if the {@code buf} parameter is outside the range [0, {@link GL20#GL_MAX_DRAW_BUFFERS MAX_DRAW_BUFFERS} &ndash; 1].</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if either {@code src}, or {@code dst} is not an accepted value.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this method is executed between the execution of {@link GL11#glBegin Begin} and the corresponding execution
	 * of {@link GL11#glEnd End}.</p>
	 *
	 * @param buf an integer that indicates the {@link GL11#GL_DRAW_BUFFER DRAW_BUFFER} to modify.
	 * @param src determines both RGB and alpha source functions
	 * @param dst determines both RGB and alpha destination functions
	 */
	public static void glBlendFunciARB(int buf, int src, int dst) {
		long __functionAddress = GL.getCapabilities().glBlendFunciARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, src, dst);
	}

	// --- [ glBlendFuncSeparateiARB ] ---

	/**
	 * Provides a way to enable blending and set color write masks independently per color output.
	 * 
	 * <p>This call modifies the blend functions associated with an individual draw buffer.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if the {@code buf} parameter is outside the range [0, {@link GL20#GL_MAX_DRAW_BUFFERS MAX_DRAW_BUFFERS} &ndash; 1].</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_ENUM INVALID_ENUM} is generated if either {@code srcRGB}, {@code dstRGB}, {@code srcAlpha}, or {@code dstAlpha} is not an accepted value.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if this method is executed between the execution of {@link GL11#glBegin Begin} and the corresponding execution
	 * of {@link GL11#glEnd End}.</p>
	 *
	 * @param buf      an integer that indicates the {@link GL11#GL_DRAW_BUFFER DRAW_BUFFER} to modify.
	 * @param srcRGB   the source RGB blend function
	 * @param dstRGB   the destination RGB blend function
	 * @param srcAlpha the source alpha blend function
	 * @param dstAlpha the destination alpha blend function
	 */
	public static void glBlendFuncSeparateiARB(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		long __functionAddress = GL.getCapabilities().glBlendFuncSeparateiARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
	}

}