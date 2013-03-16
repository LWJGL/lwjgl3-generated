/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/wgl_swap_control_tear.txt">WGL_EXT_swap_control_tear</a> extension.
 * <p/>
 * This extension extends the existing {@link WGLEXTSwapControl} extension by allowing a negative {@code interval} parameter to
 * {@link WGLEXTSwapControl#wglSwapIntervalEXT}. The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
 * reduces the visual stutter on late frames and reduces the stall on subsequent frames.
 */
public final class WGLEXTSwapControlTear {

	private WGLEXTSwapControlTear() {}

}