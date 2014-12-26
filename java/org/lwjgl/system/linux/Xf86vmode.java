/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;X11/extensions/xf86vmode.h&gt;. */
public final class Xf86vmode {

	static { LWJGLUtil.initialize(); }

	private Xf86vmode() {}

	// --- [ XF86VidModeQueryExtension ] ---

	/** JNI method for {@link #XF86VidModeQueryExtension} */
	@JavadocExclude
	public static native int nXF86VidModeQueryExtension(long display, long event_base, long error_base);

	/**
	 * Returns the lowest numbered error and event values assigned to the extension.
	 *
	 * @param display    the connection to the X server
	 * @param event_base the lowest numbered event value
	 * @param error_base the lowest numbered error value
	 */
	public static int XF86VidModeQueryExtension(long display, ByteBuffer event_base, ByteBuffer error_base) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(event_base, 1 << 2);
			checkBuffer(error_base, 1 << 2);
		}
		return nXF86VidModeQueryExtension(display, memAddress(event_base), memAddress(error_base));
	}

	/** Alternative version of: {@link #XF86VidModeQueryExtension} */
	public static int XF86VidModeQueryExtension(long display, IntBuffer event_base, IntBuffer error_base) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(event_base, 1);
			checkBuffer(error_base, 1);
		}
		return nXF86VidModeQueryExtension(display, memAddress(event_base), memAddress(error_base));
	}

	// --- [ XF86VidModeGetGammaRampSize ] ---

	/** JNI method for {@link #XF86VidModeGetGammaRampSize} */
	@JavadocExclude
	public static native int nXF86VidModeGetGammaRampSize(long display, int screen, long size);

	/**
	 * Returns the gamma ramp size.
	 *
	 * @param display the connection to the X server
	 * @param screen  the screen number
	 * @param size    the gamma ramp size
	 */
	public static int XF86VidModeGetGammaRampSize(long display, int screen, ByteBuffer size) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXF86VidModeGetGammaRampSize(display, screen, memAddress(size));
	}

	/** Alternative version of: {@link #XF86VidModeGetGammaRampSize} */
	public static int XF86VidModeGetGammaRampSize(long display, int screen, IntBuffer size) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXF86VidModeGetGammaRampSize(display, screen, memAddress(size));
	}

	// --- [ XF86VidModeGetGammaRamp ] ---

	/** JNI method for {@link #XF86VidModeGetGammaRamp} */
	@JavadocExclude
	public static native int nXF86VidModeGetGammaRamp(long display, int screen, int size, long red_array, long green_array, long blue_array);

	/**
	 * Returns the gamma ramp.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param size        the gamma ramp size
	 * @param red_array   the red gamma ramp
	 * @param green_array the green gamma ramp
	 * @param blue_array  the blue gamma ramp
	 */
	public static int XF86VidModeGetGammaRamp(long display, int screen, int size, ByteBuffer red_array, ByteBuffer green_array, ByteBuffer blue_array) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(red_array, size << 1);
			checkBuffer(green_array, size << 1);
			checkBuffer(blue_array, size << 1);
		}
		return nXF86VidModeGetGammaRamp(display, screen, size, memAddress(red_array), memAddress(green_array), memAddress(blue_array));
	}

	/** Alternative version of: {@link #XF86VidModeGetGammaRamp} */
	public static int XF86VidModeGetGammaRamp(long display, int screen, ShortBuffer red_array, ShortBuffer green_array, ShortBuffer blue_array) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(green_array, red_array.remaining());
			checkBuffer(blue_array, red_array.remaining());
		}
		return nXF86VidModeGetGammaRamp(display, screen, red_array.remaining(), memAddress(red_array), memAddress(green_array), memAddress(blue_array));
	}

	// --- [ XF86VidModeSetGammaRamp ] ---

	/** JNI method for {@link #XF86VidModeSetGammaRamp} */
	@JavadocExclude
	public static native int nXF86VidModeSetGammaRamp(long display, int screen, int size, long red_array, long green_array, long blue_array);

	/**
	 * Sets the gamma ramp.
	 *
	 * @param display     the connection to the X server
	 * @param screen      the screen number
	 * @param size        the gamma ramp size
	 * @param red_array   the red gamma ramp
	 * @param green_array the green gamma ramp
	 * @param blue_array  the blue gamma ramp
	 */
	public static int XF86VidModeSetGammaRamp(long display, int screen, int size, ByteBuffer red_array, ByteBuffer green_array, ByteBuffer blue_array) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(red_array, size << 1);
			checkBuffer(green_array, size << 1);
			checkBuffer(blue_array, size << 1);
		}
		return nXF86VidModeSetGammaRamp(display, screen, size, memAddress(red_array), memAddress(green_array), memAddress(blue_array));
	}

	/** Alternative version of: {@link #XF86VidModeSetGammaRamp} */
	public static int XF86VidModeSetGammaRamp(long display, int screen, ShortBuffer red_array, ShortBuffer green_array, ShortBuffer blue_array) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(green_array, red_array.remaining());
			checkBuffer(blue_array, red_array.remaining());
		}
		return nXF86VidModeSetGammaRamp(display, screen, red_array.remaining(), memAddress(red_array), memAddress(green_array), memAddress(blue_array));
	}

}