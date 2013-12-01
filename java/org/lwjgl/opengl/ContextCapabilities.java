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

	final GL11                    __GL11;
	final GL12                    __GL12;
	final GL13                    __GL13;
	final GL14                    __GL14;
	final GL15                    __GL15;
	final GL20                    __GL20;
	final GL21                    __GL21;
	final GL30                    __GL30;
	final GL31                    __GL31;
	final GL32                    __GL32;
	final GL33                    __GL33;
	final GL40                    __GL40;
	final GL41                    __GL41;
	final GL42                    __GL42;
	final GL43                    __GL43;
	final GL44                    __GL44;
	final GLX11                   __GLX11;
	final GLX12                   __GLX12;
	final GLX13                   __GLX13;
	final GLX14                   __GLX14;
	final GLXAMDGPUAssociation    __GLXAMDGPUAssociation;
	final GLXARBCreateContext     __GLXARBCreateContext;
	final GLXARBGetProcAddress    __GLXARBGetProcAddress;
	final GLXEXTImportContext     __GLXEXTImportContext;
	final GLXEXTSwapControl       __GLXEXTSwapControl;
	final GLXEXTTextureFromPixmap __GLXEXTTextureFromPixmap;
	final GLXNVCopyImage          __GLXNVCopyImage;
	final GLXSGIMakeCurrentRead   __GLXSGIMakeCurrentRead;
	final GLXSGISwapControl       __GLXSGISwapControl;
	final GLXSGIVideoSync         __GLXSGIVideoSync;
	final GLXSGIXFBConfig         __GLXSGIXFBConfig;
	final GLXSGIXPBuffer          __GLXSGIXPBuffer;
	final GLXSGIXSwapBarrier      __GLXSGIXSwapBarrier;
	final GLXSGIXSwapGroup        __GLXSGIXSwapGroup;
	final AMDDebugOutput          __AMDDebugOutput;
	final AMDOcclusionQueryEvent  __AMDOcclusionQueryEvent;
	final ARBBufferStorage        __ARBBufferStorage;
	final ARBCLEvent              __ARBCLEvent;
	final ARBClearTexture         __ARBClearTexture;
	final ARBCopyBuffer           __ARBCopyBuffer;
	final ARBDrawBuffersBlend     __ARBDrawBuffersBlend;
	final ARBImaging              __ARBImaging;
	final ARBMultiBind            __ARBMultiBind;
	final ARBSync                 __ARBSync;
	final WGLAMDGPUAssociation    __WGLAMDGPUAssociation;
	final WGLARBBufferRegion      __WGLARBBufferRegion;
	final WGLARBCreateContext     __WGLARBCreateContext;
	final WGLARBExtensionsString  __WGLARBExtensionsString;
	final WGLARBMakeCurrentRead   __WGLARBMakeCurrentRead;
	final WGLARBPbuffer           __WGLARBPbuffer;
	final WGLARBPixelFormat       __WGLARBPixelFormat;
	final WGLEXTExtensionsString  __WGLEXTExtensionsString;
	final WGLEXTSwapControl       __WGLEXTSwapControl;
	final WGLNVCopyImage          __WGLNVCopyImage;
	final WGLNVDXInterop          __WGLNVDXInterop;
	final WGLNVGPUAffinity        __WGLNVGPUAffinity;

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
		OpenGL44,
		GLX_11,
		GLX_12,
		GLX_13,
		GLX_14,
		GLX_AMD_gpu_association,
		GLX_ARB_create_context,
		GLX_ARB_create_context_profile,
		GLX_ARB_create_context_robustness,
		GLX_ARB_fbconfig_float,
		GLX_ARB_framebuffer_sRGB,
		GLX_ARB_get_proc_address,
		GLX_ARB_multisample,
		GLX_ARB_robustness_application_isolation,
		GLX_ARB_robustness_share_group_isolation,
		GLX_EXT_buffer_age,
		GLX_EXT_create_context_es_profile,
		GLX_EXT_fbconfig_packed_float,
		GLX_EXT_framebuffer_sRGB,
		GLX_EXT_import_context,
		GLX_EXT_swap_control,
		GLX_EXT_swap_control_tear,
		GLX_EXT_texture_from_pixmap,
		GLX_EXT_visual_info,
		GLX_EXT_visual_rating,
		GLX_INTEL_swap_event,
		GLX_NV_copy_image,
		GLX_SGI_make_current_read,
		GLX_SGI_swap_control,
		GLX_SGI_video_sync,
		GLX_SGIX_fbconfig,
		GLX_SGIX_pbuffer,
		GLX_SGIX_swap_barrier,
		GLX_SGIX_swap_group,
		GL_AMD_conservative_depth,
		GL_AMD_debug_output,
		GL_AMD_occlusion_query_event,
		GL_AMD_shader_stencil_export,
		GL_AMD_shader_trinary_minmax,
		GL_AMD_texture_texture4,
		GL_AMD_transform_feedback3_lines_triangles,
		GL_AMD_vertex_shader_layer,
		GL_AMD_vertex_shader_viewport_index,
		GL_ARB_arrays_of_arrays,
		GL_ARB_buffer_storage,
		GL_ARB_cl_event,
		GL_ARB_clear_texture,
		GL_ARB_compatibility,
		GL_ARB_conservative_depth,
		GL_ARB_copy_buffer,
		GL_ARB_draw_buffers_blend,
		GL_ARB_enhanced_layouts,
		GL_ARB_explicit_attrib_location,
		GL_ARB_fragment_coord_conventions,
		GL_ARB_fragment_layer_viewport,
		GL_ARB_fragment_program_shadow,
		GL_ARB_imaging,
		GL_ARB_multi_bind,
		GL_ARB_query_buffer_object,
		GL_ARB_robust_buffer_access_behavior,
		GL_ARB_robustness_isolation,
		GL_ARB_shader_bit_encoding,
		GL_ARB_shader_image_size,
		GL_ARB_shader_precision,
		GL_ARB_shader_stencil_export,
		GL_ARB_shader_texture_lod,
		GL_ARB_shading_language_420pack,
		GL_ARB_shading_language_packing,
		GL_ARB_sync,
		GL_ARB_texture_buffer_object_rgb32,
		GL_ARB_texture_env_add,
		GL_ARB_texture_env_crossbar,
		GL_ARB_texture_mirror_clamp_to_edge,
		GL_ARB_texture_non_power_of_two,
		GL_ARB_texture_query_levels,
		GL_ARB_texture_query_lod,
		GL_ATI_shader_texture_lod,
		GL_EXT_shadow_funcs,
		GL_NV_blend_square,
		GL_NV_fragment_program4,
		GL_NV_fragment_program_option,
		GL_NV_geometry_shader4,
		GL_NV_parameter_buffer_object2,
		GL_NV_shader_atomic_counters,
		GL_NV_shader_atomic_float,
		GL_NV_shader_storage_buffer_object,
		GL_NV_vertex_program1_1,
		GL_NV_vertex_program2,
		GL_NV_vertex_program4,
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
		WGL_NV_copy_image,
		WGL_NV_DX_interop,
		WGL_NV_DX_interop2,
		WGL_NV_gpu_affinity;

	ContextCapabilities(FunctionProvider provider, Set<String> ext, boolean fc) {
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
		OpenGL44 = (__GL44 = GL44.create(ext, provider)) != null;
		GLX_11 = (__GLX11 = GLX11.create(ext, provider)) != null;
		GLX_12 = (__GLX12 = GLX12.create(ext, provider)) != null;
		GLX_13 = (__GLX13 = GLX13.create(ext, provider)) != null;
		GLX_14 = (__GLX14 = GLX14.create(ext, provider)) != null;
		GLX_AMD_gpu_association = (__GLXAMDGPUAssociation = GLXAMDGPUAssociation.create(ext, provider)) != null;
		GLX_ARB_create_context = (__GLXARBCreateContext = GLXARBCreateContext.create(ext, provider)) != null;
		GLX_ARB_create_context_profile = ext.contains("GLX_ARB_create_context_profile");
		GLX_ARB_create_context_robustness = ext.contains("GLX_ARB_create_context_robustness");
		GLX_ARB_fbconfig_float = ext.contains("GLX_ARB_fbconfig_float");
		GLX_ARB_framebuffer_sRGB = ext.contains("GLX_ARB_framebuffer_sRGB");
		GLX_ARB_get_proc_address = (__GLXARBGetProcAddress = GLXARBGetProcAddress.create(ext, provider)) != null;
		GLX_ARB_multisample = ext.contains("GLX_ARB_multisample");
		GLX_ARB_robustness_application_isolation = ext.contains("GLX_ARB_robustness_application_isolation");
		GLX_ARB_robustness_share_group_isolation = ext.contains("GLX_ARB_robustness_share_group_isolation");
		GLX_EXT_buffer_age = ext.contains("GLX_EXT_buffer_age");
		GLX_EXT_create_context_es_profile = ext.contains("GLX_EXT_create_context_es_profile");
		GLX_EXT_fbconfig_packed_float = ext.contains("GLX_EXT_fbconfig_packed_float");
		GLX_EXT_framebuffer_sRGB = ext.contains("GLX_EXT_framebuffer_sRGB");
		GLX_EXT_import_context = (__GLXEXTImportContext = GLXEXTImportContext.create(ext, provider)) != null;
		GLX_EXT_swap_control = (__GLXEXTSwapControl = GLXEXTSwapControl.create(ext, provider)) != null;
		GLX_EXT_swap_control_tear = ext.contains("GLX_EXT_swap_control_tear");
		GLX_EXT_texture_from_pixmap = (__GLXEXTTextureFromPixmap = GLXEXTTextureFromPixmap.create(ext, provider)) != null;
		GLX_EXT_visual_info = ext.contains("GLX_EXT_visual_info");
		GLX_EXT_visual_rating = ext.contains("GLX_EXT_visual_rating");
		GLX_INTEL_swap_event = ext.contains("GLX_INTEL_swap_event");
		GLX_NV_copy_image = (__GLXNVCopyImage = GLXNVCopyImage.create(ext, provider)) != null;
		GLX_SGI_make_current_read = (__GLXSGIMakeCurrentRead = GLXSGIMakeCurrentRead.create(ext, provider)) != null;
		GLX_SGI_swap_control = (__GLXSGISwapControl = GLXSGISwapControl.create(ext, provider)) != null;
		GLX_SGI_video_sync = (__GLXSGIVideoSync = GLXSGIVideoSync.create(ext, provider)) != null;
		GLX_SGIX_fbconfig = (__GLXSGIXFBConfig = GLXSGIXFBConfig.create(ext, provider)) != null;
		GLX_SGIX_pbuffer = (__GLXSGIXPBuffer = GLXSGIXPBuffer.create(ext, provider)) != null;
		GLX_SGIX_swap_barrier = (__GLXSGIXSwapBarrier = GLXSGIXSwapBarrier.create(ext, provider)) != null;
		GLX_SGIX_swap_group = (__GLXSGIXSwapGroup = GLXSGIXSwapGroup.create(ext, provider)) != null;
		GL_AMD_conservative_depth = ext.contains("GL_AMD_conservative_depth");
		GL_AMD_debug_output = (__AMDDebugOutput = AMDDebugOutput.create(ext, provider)) != null;
		GL_AMD_occlusion_query_event = (__AMDOcclusionQueryEvent = AMDOcclusionQueryEvent.create(ext, provider)) != null;
		GL_AMD_shader_stencil_export = ext.contains("GL_AMD_shader_stencil_export");
		GL_AMD_shader_trinary_minmax = ext.contains("GL_AMD_shader_trinary_minmax");
		GL_AMD_texture_texture4 = ext.contains("GL_AMD_texture_texture4");
		GL_AMD_transform_feedback3_lines_triangles = ext.contains("GL_AMD_transform_feedback3_lines_triangles");
		GL_AMD_vertex_shader_layer = ext.contains("GL_AMD_vertex_shader_layer");
		GL_AMD_vertex_shader_viewport_index = ext.contains("GL_AMD_vertex_shader_viewport_index");
		GL_ARB_arrays_of_arrays = ext.contains("GL_ARB_arrays_of_arrays");
		GL_ARB_buffer_storage = (__ARBBufferStorage = ARBBufferStorage.create(ext, provider)) != null;
		GL_ARB_cl_event = (__ARBCLEvent = ARBCLEvent.create(ext, provider)) != null;
		GL_ARB_clear_texture = (__ARBClearTexture = ARBClearTexture.create(ext, provider)) != null;
		GL_ARB_compatibility = ext.contains("GL_ARB_compatibility");
		GL_ARB_conservative_depth = ext.contains("GL_ARB_conservative_depth");
		GL_ARB_copy_buffer = (__ARBCopyBuffer = ARBCopyBuffer.create(ext, provider)) != null;
		GL_ARB_draw_buffers_blend = (__ARBDrawBuffersBlend = ARBDrawBuffersBlend.create(ext, provider)) != null;
		GL_ARB_enhanced_layouts = ext.contains("GL_ARB_enhanced_layouts");
		GL_ARB_explicit_attrib_location = ext.contains("GL_ARB_explicit_attrib_location");
		GL_ARB_fragment_coord_conventions = ext.contains("GL_ARB_fragment_coord_conventions");
		GL_ARB_fragment_layer_viewport = ext.contains("GL_ARB_fragment_layer_viewport");
		GL_ARB_fragment_program_shadow = ext.contains("GL_ARB_fragment_program_shadow");
		GL_ARB_imaging = (__ARBImaging = ARBImaging.create(ext, provider, fc)) != null;
		GL_ARB_multi_bind = (__ARBMultiBind = ARBMultiBind.create(ext, provider)) != null;
		GL_ARB_query_buffer_object = ext.contains("GL_ARB_query_buffer_object");
		GL_ARB_robust_buffer_access_behavior = ext.contains("GL_ARB_robust_buffer_access_behavior");
		GL_ARB_robustness_isolation = ext.contains("GL_ARB_robustness_isolation");
		GL_ARB_shader_bit_encoding = ext.contains("GL_ARB_shader_bit_encoding");
		GL_ARB_shader_image_size = ext.contains("GL_ARB_shader_image_size");
		GL_ARB_shader_precision = ext.contains("GL_ARB_shader_precision");
		GL_ARB_shader_stencil_export = ext.contains("GL_ARB_shader_stencil_export");
		GL_ARB_shader_texture_lod = ext.contains("GL_ARB_shader_texture_lod");
		GL_ARB_shading_language_420pack = ext.contains("GL_ARB_shading_language_420pack");
		GL_ARB_shading_language_packing = ext.contains("GL_ARB_shading_language_packing");
		GL_ARB_sync = (__ARBSync = ARBSync.create(ext, provider)) != null;
		GL_ARB_texture_buffer_object_rgb32 = ext.contains("GL_ARB_texture_buffer_object_rgb32");
		GL_ARB_texture_env_add = ext.contains("GL_ARB_texture_env_add");
		GL_ARB_texture_env_crossbar = ext.contains("GL_ARB_texture_env_crossbar");
		GL_ARB_texture_mirror_clamp_to_edge = ext.contains("GL_ARB_texture_mirror_clamp_to_edge");
		GL_ARB_texture_non_power_of_two = ext.contains("GL_ARB_texture_non_power_of_two");
		GL_ARB_texture_query_levels = ext.contains("GL_ARB_texture_query_levels");
		GL_ARB_texture_query_lod = ext.contains("GL_ARB_texture_query_lod");
		GL_ATI_shader_texture_lod = ext.contains("GL_ATI_shader_texture_lod");
		GL_EXT_shadow_funcs = ext.contains("GL_EXT_shadow_funcs");
		GL_NV_blend_square = ext.contains("GL_NV_blend_square");
		GL_NV_fragment_program4 = ext.contains("GL_NV_fragment_program4");
		GL_NV_fragment_program_option = ext.contains("GL_NV_fragment_program_option");
		GL_NV_geometry_shader4 = ext.contains("GL_NV_geometry_shader4");
		GL_NV_parameter_buffer_object2 = ext.contains("GL_NV_parameter_buffer_object2");
		GL_NV_shader_atomic_counters = ext.contains("GL_NV_shader_atomic_counters");
		GL_NV_shader_atomic_float = ext.contains("GL_NV_shader_atomic_float");
		GL_NV_shader_storage_buffer_object = ext.contains("GL_NV_shader_storage_buffer_object");
		GL_NV_vertex_program1_1 = ext.contains("GL_NV_vertex_program1_1");
		GL_NV_vertex_program2 = ext.contains("GL_NV_vertex_program2");
		GL_NV_vertex_program4 = ext.contains("GL_NV_vertex_program4");
		WGL_AMD_gpu_association = (__WGLAMDGPUAssociation = WGLAMDGPUAssociation.create(ext, provider)) != null;
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
		WGL_NV_copy_image = (__WGLNVCopyImage = WGLNVCopyImage.create(ext, provider)) != null;
		WGL_NV_DX_interop = (__WGLNVDXInterop = WGLNVDXInterop.create(ext, provider)) != null;
		WGL_NV_DX_interop2 = ext.contains("WGL_NV_DX_interop2");
		WGL_NV_gpu_affinity = (__WGLNVGPUAffinity = WGLNVGPUAffinity.create(ext, provider)) != null;
	}
}