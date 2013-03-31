/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import java.util.Set;

/** Defines the capabilities of an OpenGL context. */
public final class ContextCapabilities {

	final GL11.Functions                   __GL11;
	final GL12.Functions                   __GL12;
	final GL13.Functions                   __GL13;
	final GL14.Functions                   __GL14;
	final GL15.Functions                   __GL15;
	final GL20.Functions                   __GL20;
	final GL21.Functions                   __GL21;
	final GL30.Functions                   __GL30;
	final GL31.Functions                   __GL31;
	final GL32.Functions                   __GL32;
	final GL33.Functions                   __GL33;
	final GL40.Functions                   __GL40;
	final GL41.Functions                   __GL41;
	final GL42.Functions                   __GL42;
	final GL43.Functions                   __GL43;
	final AMDDebugOutput.Functions         __AMDDebugOutput;
	final ARBCopyBuffer.Functions          __ARBCopyBuffer;
	final ARBImaging.Functions             __ARBImaging;
	final WGLAMDGpuAssociation.Functions   __WGLAMDGpuAssociation;
	final WGLARBBufferRegion.Functions     __WGLARBBufferRegion;
	final WGLARBCreateContext.Functions    __WGLARBCreateContext;
	final WGLARBExtensionsString.Functions __WGLARBExtensionsString;
	final WGLARBMakeCurrentRead.Functions  __WGLARBMakeCurrentRead;
	final WGLARBPbuffer.Functions          __WGLARBPbuffer;
	final WGLARBPixelFormat.Functions      __WGLARBPixelFormat;
	final WGLEXTExtensionsString.Functions __WGLEXTExtensionsString;
	final WGLEXTSwapControl.Functions      __WGLEXTSwapControl;
	final WGLNVDXInterop.Functions         __WGLNVDXInterop;
	final WGLNVCopyImage.Functions         __WGLNVCopyImage;
	final WGLNVGpuAffinity.Functions       __WGLNVGpuAffinity;

	/** Indicates whether an OpenGL functionality is available or not. */
	public final boolean
		OpenGL11,
		OpenGL12,
		OpenGL13,
		OpenGL14,
		OpenGL15,
		OpenGL20,
		OpenGL21,
		OpenGL30,
		OpenGL31,
		OpenGL32,
		OpenGL33,
		OpenGL40,
		OpenGL41,
		OpenGL42,
		OpenGL43,
		GL_AMD_debug_output,
		GL_ARB_copy_buffer,
		GL_ARB_imaging,
		WGL_AMD_gpu_association,
		WGL_ARB_buffer_region,
		WGL_ARB_create_context,
		WGL_ARB_create_context_profile,
		WGL_ARB_create_context_robustness,
		WGL_ARB_extensions_string,
		WGL_ARB_framebuffer_sRGB,
		WGL_ARB_make_current_read,
		WGL_ARB_multisample,
		WGL_ARB_pbuffer,
		WGL_ARB_pixel_format,
		WGL_ARB_pixel_format_float,
		WGL_ARB_robustness_application_isolation,
		WGL_ARB_robustness_share_group_isolation,
		WGL_EXT_create_context_es_profile,
		WGL_EXT_extensions_string,
		WGL_EXT_framebuffer_sRGB,
		WGL_EXT_pixel_format_packed_float,
		WGL_EXT_swap_control,
		WGL_EXT_swap_control_tear,
		WGL_NV_DX_interop,
		WGL_NV_DX_interop2,
		WGL_NV_copy_image,
		WGL_NV_gpu_affinity;

	ContextCapabilities(Set<String> ext, boolean fc) {
		FunctionProvider provider = GL.getFunctionProvider();

		OpenGL11 = (__GL11 = GL11.create(ext, provider, fc)) != null;
		OpenGL12 = (__GL12 = GL12.create(ext, provider)) != null;
		OpenGL13 = (__GL13 = GL13.create(ext, provider, fc)) != null;
		OpenGL14 = (__GL14 = GL14.create(ext, provider, fc)) != null;
		OpenGL15 = (__GL15 = GL15.create(ext, provider)) != null;
		OpenGL20 = (__GL20 = GL20.create(ext, provider)) != null;
		OpenGL21 = (__GL21 = GL21.create(ext, provider)) != null;
		OpenGL30 = (__GL30 = GL30.create(ext, provider)) != null;
		OpenGL31 = (__GL31 = GL31.create(ext, provider)) != null;
		OpenGL32 = (__GL32 = GL32.create(ext, provider)) != null;
		OpenGL33 = (__GL33 = GL33.create(ext, provider, fc)) != null;
		OpenGL40 = (__GL40 = GL40.create(ext, provider)) != null;
		OpenGL41 = (__GL41 = GL41.create(ext, provider)) != null;
		OpenGL42 = (__GL42 = GL42.create(ext, provider)) != null;
		OpenGL43 = (__GL43 = GL43.create(ext, provider)) != null;
		GL_AMD_debug_output = (__AMDDebugOutput = AMDDebugOutput.create(ext, provider)) != null;
		GL_ARB_copy_buffer = (__ARBCopyBuffer = ARBCopyBuffer.create(ext, provider)) != null;
		GL_ARB_imaging = (__ARBImaging = ARBImaging.create(ext, provider, fc)) != null;
		WGL_AMD_gpu_association = (__WGLAMDGpuAssociation = WGLAMDGpuAssociation.create(ext, provider)) != null;
		WGL_ARB_buffer_region = (__WGLARBBufferRegion = WGLARBBufferRegion.create(ext, provider)) != null;
		WGL_ARB_create_context = (__WGLARBCreateContext = WGLARBCreateContext.create(ext, provider)) != null;
		WGL_ARB_create_context_profile = ext.contains("WGL_ARB_create_context_profile");
		WGL_ARB_create_context_robustness = ext.contains("WGL_ARB_create_context_robustness");
		WGL_ARB_extensions_string = (__WGLARBExtensionsString = WGLARBExtensionsString.create(ext, provider)) != null;
		WGL_ARB_framebuffer_sRGB = ext.contains("WGL_ARB_framebuffer_sRGB");
		WGL_ARB_make_current_read = (__WGLARBMakeCurrentRead = WGLARBMakeCurrentRead.create(ext, provider)) != null;
		WGL_ARB_multisample = ext.contains("WGL_ARB_multisample");
		WGL_ARB_pbuffer = (__WGLARBPbuffer = WGLARBPbuffer.create(ext, provider)) != null;
		WGL_ARB_pixel_format = (__WGLARBPixelFormat = WGLARBPixelFormat.create(ext, provider)) != null;
		WGL_ARB_pixel_format_float = ext.contains("WGL_ARB_pixel_format_float");
		WGL_ARB_robustness_application_isolation = ext.contains("WGL_ARB_robustness_application_isolation");
		WGL_ARB_robustness_share_group_isolation = ext.contains("WGL_ARB_robustness_share_group_isolation");
		WGL_EXT_create_context_es_profile = ext.contains("WGL_EXT_create_context_es_profile");
		WGL_EXT_extensions_string = (__WGLEXTExtensionsString = WGLEXTExtensionsString.create(ext, provider)) != null;
		WGL_EXT_framebuffer_sRGB = ext.contains("WGL_EXT_framebuffer_sRGB");
		WGL_EXT_pixel_format_packed_float = ext.contains("WGL_EXT_pixel_format_packed_float");
		WGL_EXT_swap_control = (__WGLEXTSwapControl = WGLEXTSwapControl.create(ext, provider)) != null;
		WGL_EXT_swap_control_tear = ext.contains("WGL_EXT_swap_control_tear");
		WGL_NV_DX_interop = (__WGLNVDXInterop = WGLNVDXInterop.create(ext, provider)) != null;
		WGL_NV_DX_interop2 = ext.contains("WGL_NV_DX_interop2");
		WGL_NV_copy_image = (__WGLNVCopyImage = WGLNVCopyImage.create(ext, provider)) != null;
		WGL_NV_gpu_affinity = (__WGLNVGpuAffinity = WGLNVGpuAffinity.create(ext, provider)) != null;
	}
}