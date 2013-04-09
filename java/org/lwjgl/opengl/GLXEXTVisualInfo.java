/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/visual_rating.txt">GLX_EXT_visual_info</a> extension.
 * <p/>
 * This extension allows servers to identify a particular GLX visual as undesirable. A new visual attribute is introduced, providing a way for servers to
 * specify caveats (e.g., slow) for a visual. The attribute  may be queried using {@link glXGetConfig}, and can therefore be used by  application-specific visual
 * selection routines. The new attribute is also used by {@link glXChooseVisual} to discriminate against visuals with caveats.
 * <p/>
 * This extension allows servers to export visuals with improved features or image quality, but lower performance or greater system burden, without having
 * to have these visuals selected preferentially.  It is intended to insure that most applications get the "right" visual, not that all applications do.
 */
public final class GLXEXTVisualInfo {

	/** Accepted by the {@code attrib} parameter of {@link GLX#glXGetConfig}, and by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual}: */
	public static final int
		GLX_X_VISUAL_TYPE_EXT           = 0x22,
		GLX_TRANSPARENT_TYPE_EXT        = 0x23,
		GLX_TRANSPARENT_INDEX_VALUE_EXT = 0x24,
		GLX_TRANSPARENT_RED_VALUE_EXT   = 0x25,
		GLX_TRANSPARENT_GREEN_VALUE_EXT = 0x26,
		GLX_TRANSPARENT_BLUE_VALUE_EXT  = 0x27,
		GLX_TRANSPARENT_ALPHA_VALUE_EXT = 0x28;

	/**
	 * Returned by {@link GLX#glXGetConfig}, and accepted by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual} (following the
	 * {@link #GLX_X_VISUAL_TYPE_EXT} token):
	 */
	public static final int
		GLX_TRUE_COLOR_EXT   = 0x8002,
		GLX_DIRECT_COLOR_EXT = 0x8003,
		GLX_PSEUDO_COLOR_EXT = 0x8004,
		GLX_STATIC_COLOR_EXT = 0x8005,
		GLX_GRAY_SCALE_EXT   = 0x8006,
		GLX_STATIC_GRAY_EXT  = 0x8007;

	/**
	 * Returned by {@link GLX#glXGetConfig}, and accepted by the {@code attrib_list} parameter of {@link GLX#glXChooseVisual} (following the
	 * {@link #GLX_TRANSPARENT_TYPE_EXT} token):
	 */
	public static final int
		GLX_NONE_EXT              = 0x8000,
		GLX_TRANSPARENT_RGB_EXT   = 0x8008,
		GLX_TRANSPARENT_INDEX_EXT = 0x8009;

	private GLXEXTVisualInfo() {}

}