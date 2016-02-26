/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of a Vulkan {@code VkInstance} or {@code VkDevice}. */
public class VKCapabilities {

	final VK10                __VK10;
	final EXTDebugReport      __EXTDebugReport;
	final KHRDisplay          __KHRDisplay;
	final KHRDisplaySwapchain __KHRDisplaySwapchain;
	final KHRSurface          __KHRSurface;
	final KHRSwapchain        __KHRSwapchain;
	final KHRWin32Surface     __KHRWin32Surface;
	final KHRXlibSurface      __KHRXlibSurface;

	/** The Vulkan API version number. */
	public final int apiVersion;

	/** When true, {@link VK10} is supported. */
	public final boolean Vulkan10;
	/** When true, {@link EXTDebugReport} is supported. */
	public final boolean VK_EXT_debug_report;
	/** When true, {@link KHRDisplay} is supported. */
	public final boolean VK_KHR_display;
	/** When true, {@link KHRDisplaySwapchain} is supported. */
	public final boolean VK_KHR_display_swapchain;
	/**
	 * When true, the KHR_sampler_mirror_clamp_to_edge extension is supported.
	 * 
	 * <p>Extends the set of sampler address modes to include an additional mode ({@link VK10#VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE
	 * SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE}) that effectively uses a texture map twice as large as the original image in which the additional half of
	 * the new image is a mirror image of the original image.</p>
	 * 
	 * <p>This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image". This
	 * mode allows the texture to be mirrored only once in the negative s, t, and r directions.</p>
	 */
	public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
	/** When true, {@link KHRSurface} is supported. */
	public final boolean VK_KHR_surface;
	/** When true, {@link KHRSwapchain} is supported. */
	public final boolean VK_KHR_swapchain;
	/** When true, {@link KHRWin32Surface} is supported. */
	public final boolean VK_KHR_win32_surface;
	/** When true, {@link KHRXlibSurface} is supported. */
	public final boolean VK_KHR_xlib_surface;

	VKCapabilities(FunctionProvider provider) {
		this.apiVersion = 0;

		Vulkan10 = (__VK10 = VK10.create(provider)) != null;
		VK_EXT_debug_report = (__EXTDebugReport = EXTDebugReport.create(provider)) != null;
		VK_KHR_display = (__KHRDisplay = KHRDisplay.create(provider)) != null;
		VK_KHR_display_swapchain = (__KHRDisplaySwapchain = KHRDisplaySwapchain.create(provider)) != null;
		VK_KHR_sampler_mirror_clamp_to_edge = false;
		VK_KHR_surface = (__KHRSurface = KHRSurface.create(provider)) != null;
		VK_KHR_swapchain = (__KHRSwapchain = KHRSwapchain.create(provider)) != null;
		VK_KHR_win32_surface = (__KHRWin32Surface = KHRWin32Surface.create(provider)) != null;
		VK_KHR_xlib_surface = (__KHRXlibSurface = KHRXlibSurface.create(provider)) != null;
	}

	VKCapabilities(int apiVersion, Set<String> ext, FunctionProvider provider) {
		this.apiVersion = apiVersion;

		Vulkan10 = (__VK10 = VK10.create(ext, provider)) != null;
		VK_EXT_debug_report = (__EXTDebugReport = EXTDebugReport.create(ext, provider)) != null;
		VK_KHR_display = (__KHRDisplay = KHRDisplay.create(ext, provider)) != null;
		VK_KHR_display_swapchain = (__KHRDisplaySwapchain = KHRDisplaySwapchain.create(ext, provider)) != null;
		VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
		VK_KHR_surface = (__KHRSurface = KHRSurface.create(ext, provider)) != null;
		VK_KHR_swapchain = (__KHRSwapchain = KHRSwapchain.create(ext, provider)) != null;
		VK_KHR_win32_surface = (__KHRWin32Surface = KHRWin32Surface.create(ext, provider)) != null;
		VK_KHR_xlib_surface = (__KHRXlibSurface = KHRXlibSurface.create(ext, provider)) != null;
	}

}