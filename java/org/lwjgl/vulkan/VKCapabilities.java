/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import java.util.Set;

public class VKCapabilities {

	final VK10                __VK10;
	final EXTDebugReport      __EXTDebugReport;
	final KHRDisplay          __KHRDisplay;
	final KHRDisplaySwapchain __KHRDisplaySwapchain;
	final KHRSurface          __KHRSurface;
	final KHRSwapchain        __KHRSwapchain;
	final KHRWin32Surface     __KHRWin32Surface;
	final KHRXlibSurface      __KHRXlibSurface;

	/** When true, {@link VK10} is supported. */
	public final boolean Vulkan10;
	/** When true, {@link EXTDebugReport} is supported. */
	public final boolean VK_EXT_debug_report;
	/** When true, {@link KHRDisplay} is supported. */
	public final boolean VK_KHR_display;
	/** When true, {@link KHRDisplaySwapchain} is supported. */
	public final boolean VK_KHR_display_swapchain;
	/** When true, {@link KHRSurface} is supported. */
	public final boolean VK_KHR_surface;
	/** When true, {@link KHRSwapchain} is supported. */
	public final boolean VK_KHR_swapchain;
	/** When true, {@link KHRWin32Surface} is supported. */
	public final boolean VK_KHR_win32_surface;
	/** When true, {@link KHRXlibSurface} is supported. */
	public final boolean VK_KHR_xlib_surface;

	VKCapabilities(FunctionProvider provider) {
		Vulkan10 = (__VK10 = VK10.create(provider)) != null;
		VK_EXT_debug_report = (__EXTDebugReport = EXTDebugReport.create(provider)) != null;
		VK_KHR_display = (__KHRDisplay = KHRDisplay.create(provider)) != null;
		VK_KHR_display_swapchain = (__KHRDisplaySwapchain = KHRDisplaySwapchain.create(provider)) != null;
		VK_KHR_surface = (__KHRSurface = KHRSurface.create(provider)) != null;
		VK_KHR_swapchain = (__KHRSwapchain = KHRSwapchain.create(provider)) != null;
		VK_KHR_win32_surface = (__KHRWin32Surface = KHRWin32Surface.create(provider)) != null;
		VK_KHR_xlib_surface = (__KHRXlibSurface = KHRXlibSurface.create(provider)) != null;
	}
}