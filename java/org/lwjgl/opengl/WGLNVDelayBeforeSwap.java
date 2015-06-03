/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

import org.lwjgl.system.windows.WinBase;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/wgl_delay_before_swap.txt">WGL_NV_delay_before_swap</a> extension.
 * 
 * <p>For most interactive applications, the standard rendering loop responding to input events on a frame granularity is sufficient. Some more demanding
 * applications may want to exchange performance for the ability to sample input closer to the final frame swap and adjust rendering accordingly. This
 * extension adds functionality to allow the application to wait until a specified time before a swapbuffers command would be able to execute.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1}.</p>
 */
public final class WGLNVDelayBeforeSwap {

	/** Function address. */
	@JavadocExclude
	public final long DelayBeforeSwapNV;

	@JavadocExclude
	public WGLNVDelayBeforeSwap(FunctionProvider provider) {
		DelayBeforeSwapNV = provider.getFunctionAddress("wglDelayBeforeSwapNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLNVDelayBeforeSwap} instance for the current context. */
	public static WGLNVDelayBeforeSwap getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLNVDelayBeforeSwap);
	}

	static WGLNVDelayBeforeSwap create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_NV_delay_before_swap") ) return null;

		WGLNVDelayBeforeSwap funcs = new WGLNVDelayBeforeSwap(provider);

		boolean supported = checkFunctions(
			funcs.DelayBeforeSwapNV
		);

		return GL.checkExtension("WGL_NV_delay_before_swap", funcs, supported);
	}

	// --- [ wglDelayBeforeSwapNV ] ---

	/** JNI method for {@link #wglDelayBeforeSwapNV DelayBeforeSwapNV} */
	@JavadocExclude
	public static native int nwglDelayBeforeSwapNV(long hDC, float seconds, long __functionAddress);

	/**
	 * Blocks the CPU until {@code seconds} seconds before a synchronized swap would occur on the window associated with {@code hDC}. It also returns a boolean
	 * value equal to {@link WinBase#TRUE} when the implementation had to wait for the synchronized swap and {@link WinBase#FALSE} otherwise.
	 * 
	 * <p>The parameter {@code hDC} must be a valid device context associated with a graphic adapter. If {@code hDC} is not valid, {@link WinBase#GetLastError} will
	 * return WGL_INVALID_HDC, {@code DelayBeforeSwapNV} will return FALSE and will not wait for the swap. If {@code hDC} is not associated with a graphic
	 * adapter, {@code GetLastError} will return ERROR_DC_NOT_FOUND, {@code DelayBeforeSwapNV} will return FALSE and will not wait for the swap.</p>
	 * 
	 * <p>The parameter {@code seconds} accepts positive floating point values not larger than the length in seconds of the swap period on the associated window.
	 * When buffer swaps are synchronized, the swap period is composed of one or multiple video frame periods. A video frame period is the time required by the
	 * monitor to display a full frame of video data. A swap interval set to a value of 2 means that the color buffers will be swapped at most every other
	 * video frame. If {@code seconds} is smaller than 0, {@code GetLastError} will return ERROR_INVALID_DATA, {@code DelayBeforeSwapNV} will return FALSE and
	 * will not wait for the end of the swap period. If {@code seconds} is greater than a swap period, {@code DelayBeforeSwapNV} will return immediately
	 * without generating any error and the return value will be FALSE.</p>
	 * 
	 * <p>The application should use a {@code seconds} delay large enough to have time to complete its work before the end of the swap period. If {@code seconds}
	 * is close to 0.0, the application may miss the end of the swap period and it will have to wait an additional swap period before it can swap.</p>
	 * 
	 * <p>If {@code DelayBeforeSwapNV} detects that there is less than {@code seconds} seconds before the end of the swap period, it will return immediately and
	 * the return value will be FALSE. The implementation will not wait an additional video frame period to have an exact delay of {@code seconds} seconds.</p>
	 * 
	 * <p>If buffer swaps are unsynchronized, {@code DelayBeforeSwapNV} will return immediately and the return value will be FALSE. It could happen for multiple
	 * reasons, for example if the swap interval is equal to 0, if the window is in a mode switch or if no monitors are active.</p>
	 *
	 * @param hDC     a handle to the DC
	 * @param seconds the delay, in seconds
	 */
	public static int wglDelayBeforeSwapNV(long hDC, float seconds) {
		long __functionAddress = getInstance().DelayBeforeSwapNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hDC);
		return nwglDelayBeforeSwapNV(hDC, seconds, __functionAddress);
	}

}