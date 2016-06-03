/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;

/** Defines the GLX capabilities of a connection. */
public final class GLXCapabilities {

	public final long
		glXBindSwapBarrierNV,
		glXBindSwapBarrierSGIX,
		glXBindTexImageEXT,
		glXBlitContextFramebufferAMD,
		glXChooseFBConfig,
		glXChooseFBConfigSGIX,
		glXCopyBufferSubDataNV,
		glXCopyImageSubDataNV,
		glXCreateAssociatedContextAMD,
		glXCreateAssociatedContextAttribsAMD,
		glXCreateContextAttribsARB,
		glXCreateContextWithConfigSGIX,
		glXCreateGLXPbufferSGIX,
		glXCreateGLXPixmapWithConfigSGIX,
		glXCreateNewContext,
		glXCreatePbuffer,
		glXCreatePixmap,
		glXCreateWindow,
		glXDelayBeforeSwapNV,
		glXDeleteAssociatedContextAMD,
		glXDestroyGLXPbufferSGIX,
		glXDestroyPbuffer,
		glXDestroyPixmap,
		glXFreeContextEXT,
		glXGetClientString,
		glXGetContextGPUIDAMD,
		glXGetContextIDEXT,
		glXGetCurrentAssociatedContextAMD,
		glXGetCurrentDisplay,
		glXGetCurrentDisplayEXT,
		glXGetCurrentReadDrawable,
		glXGetCurrentReadDrawableSGI,
		glXGetFBConfigAttrib,
		glXGetFBConfigAttribSGIX,
		glXGetFBConfigFromVisualSGIX,
		glXGetFBConfigs,
		glXGetGPUIDsAMD,
		glXGetGPUInfoAMD,
		glXGetProcAddress,
		glXGetProcAddressARB,
		glXGetSelectedEvent,
		glXGetSelectedEventSGIX,
		glXGetVideoSyncSGI,
		glXGetVisualFromFBConfig,
		glXGetVisualFromFBConfigSGIX,
		glXImportContextEXT,
		glXJoinSwapGroupNV,
		glXJoinSwapGroupSGIX,
		glXMakeAssociatedContextCurrentAMD,
		glXMakeContextCurrent,
		glXMakeCurrentReadSGI,
		glXNamedCopyBufferSubDataNV,
		glXQueryContext,
		glXQueryContextInfoEXT,
		glXQueryDrawable,
		glXQueryExtensionsString,
		glXQueryFrameCountNV,
		glXQueryGLXPbufferSGIX,
		glXQueryMaxSwapBarriersSGIX,
		glXQueryMaxSwapGroupsNV,
		glXQueryServerString,
		glXQuerySwapGroupNV,
		glXReleaseTexImageEXT,
		glXResetFrameCountNV,
		glXSelectEvent,
		glXSelectEventSGIX,
		glXSwapIntervalEXT,
		glXSwapIntervalSGI,
		glXWaitVideoSyncSGI;

	/** When true, {@link GLX11} is supported. */
	public final boolean GLX11;
	/** When true, {@link GLX12} is supported. */
	public final boolean GLX12;
	/** When true, {@link GLX13} is supported. */
	public final boolean GLX13;
	/** When true, {@link GLX14} is supported. */
	public final boolean GLX14;
	/** When true, {@link GLXAMDGPUAssociation} is supported. */
	public final boolean GLX_AMD_gpu_association;
	/** When true, {@link GLXARBContextFlushControl} is supported. */
	public final boolean GLX_ARB_context_flush_control;
	/** When true, {@link GLXARBCreateContext} is supported. */
	public final boolean GLX_ARB_create_context;
	/** When true, {@link GLXARBCreateContextProfile} is supported. */
	public final boolean GLX_ARB_create_context_profile;
	/** When true, {@link GLXARBCreateContextRobustness} is supported. */
	public final boolean GLX_ARB_create_context_robustness;
	/** When true, {@link GLXARBFBConfigFloat} is supported. */
	public final boolean GLX_ARB_fbconfig_float;
	/** When true, {@link GLXARBFramebufferSRGB} is supported. */
	public final boolean GLX_ARB_framebuffer_sRGB;
	/** When true, {@link GLXARBGetProcAddress} is supported. */
	public final boolean GLX_ARB_get_proc_address;
	/** When true, {@link GLXARBMultisample} is supported. */
	public final boolean GLX_ARB_multisample;
	/** When true, {@link GLXARBRobustnessApplicationIsolation} is supported. */
	public final boolean GLX_ARB_robustness_application_isolation;
	/**
	 * When true, the <a href="http://www.opengl.org/registry/specs/ARB/glx_robustness_isolation.txt">GLX_ARB_robustness_share_group_isolation</a> extension is supported.
	 * 
	 * <p>GL_ARB_robustness and GLX_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
	 * GLX_ARB_robustness_share_group_isolation provides stronger guarantees about the possible side-effects of a graphics reset.</p>
	 * 
	 * <p>If the graphics driver advertises the GLX_ARB_robustness_share_group_isolation extension string, then the driver guarantees that if a context in a
	 * particular share group causes a graphics reset to occur:</p>
	 * 
	 * <ol>
	 * <li>No other share group within the application, nor any other application on the system, is affected by the graphics reset.</li>
	 * <li>No other share group within the application, nor any other application on the system, receives any notification that the graphics reset occurred.</li>
	 * </ol>
	 * 
	 * <p>Requires {@link GLX14 GLX 1.4} and {@link GLXARBCreateContextRobustness GLX_ARB_create_context_robustness}.</p>
	 */
	public final boolean GLX_ARB_robustness_share_group_isolation;
	/** When true, {@link GLXARBVertexBufferObject} is supported. */
	public final boolean GLX_ARB_vertex_buffer_object;
	/** When true, {@link GLXEXTBufferAge} is supported. */
	public final boolean GLX_EXT_buffer_age;
	/** When true, {@link GLXEXTCreateContextES2Profile} is supported. */
	public final boolean GLX_EXT_create_context_es2_profile;
	/** When true, {@link GLXEXTCreateContextESProfile} is supported. */
	public final boolean GLX_EXT_create_context_es_profile;
	/** When true, {@link GLXEXTFBConfigPackedFloat} is supported. */
	public final boolean GLX_EXT_fbconfig_packed_float;
	/** When true, {@link GLXEXTFramebufferSRGB} is supported. */
	public final boolean GLX_EXT_framebuffer_sRGB;
	/** When true, {@link GLXEXTImportContext} is supported. */
	public final boolean GLX_EXT_import_context;
	/** When true, {@link GLXEXTStereoTree} is supported. */
	public final boolean GLX_EXT_stereo_tree;
	/** When true, {@link GLXEXTSwapControl} is supported. */
	public final boolean GLX_EXT_swap_control;
	/** When true, {@link GLXEXTSwapControlTear} is supported. */
	public final boolean GLX_EXT_swap_control_tear;
	/** When true, {@link GLXEXTTextureFromPixmap} is supported. */
	public final boolean GLX_EXT_texture_from_pixmap;
	/** When true, {@link GLXEXTVisualInfo} is supported. */
	public final boolean GLX_EXT_visual_info;
	/** When true, {@link GLXEXTVisualRating} is supported. */
	public final boolean GLX_EXT_visual_rating;
	/** When true, {@link GLXINTELSwapEvent} is supported. */
	public final boolean GLX_INTEL_swap_event;
	/** When true, {@link GLXNVCopyBuffer} is supported. */
	public final boolean GLX_NV_copy_buffer;
	/** When true, {@link GLXNVCopyImage} is supported. */
	public final boolean GLX_NV_copy_image;
	/** When true, {@link GLXNVDelayBeforeSwap} is supported. */
	public final boolean GLX_NV_delay_before_swap;
	/** When true, {@link GLXNVFloatBuffer} is supported. */
	public final boolean GLX_NV_float_buffer;
	/** When true, {@link GLXNVMultisampleCoverage} is supported. */
	public final boolean GLX_NV_multisample_coverage;
	/** When true, {@link GLXNVRobustnessVideoMemoryPurge} is supported. */
	public final boolean GLX_NV_robustness_video_memory_purge;
	/** When true, {@link GLXNVSwapGroup} is supported. */
	public final boolean GLX_NV_swap_group;
	/** When true, {@link GLXSGIMakeCurrentRead} is supported. */
	public final boolean GLX_SGI_make_current_read;
	/** When true, {@link GLXSGISwapControl} is supported. */
	public final boolean GLX_SGI_swap_control;
	/** When true, {@link GLXSGIVideoSync} is supported. */
	public final boolean GLX_SGI_video_sync;
	/** When true, {@link GLXSGIXFBConfig} is supported. */
	public final boolean GLX_SGIX_fbconfig;
	/** When true, {@link GLXSGIXPbuffer} is supported. */
	public final boolean GLX_SGIX_pbuffer;
	/** When true, {@link GLXSGIXSwapBarrier} is supported. */
	public final boolean GLX_SGIX_swap_barrier;
	/** When true, {@link GLXSGIXSwapGroup} is supported. */
	public final boolean GLX_SGIX_swap_group;

	GLXCapabilities(FunctionProvider provider, Set<String> ext) {
		glXBindSwapBarrierNV = provider.getFunctionAddress("glXBindSwapBarrierNV");
		glXBindSwapBarrierSGIX = provider.getFunctionAddress("glXBindSwapBarrierSGIX");
		glXBindTexImageEXT = provider.getFunctionAddress("glXBindTexImageEXT");
		glXBlitContextFramebufferAMD = provider.getFunctionAddress("glXBlitContextFramebufferAMD");
		glXChooseFBConfig = provider.getFunctionAddress("glXChooseFBConfig");
		glXChooseFBConfigSGIX = provider.getFunctionAddress("glXChooseFBConfigSGIX");
		glXCopyBufferSubDataNV = provider.getFunctionAddress("glXCopyBufferSubDataNV");
		glXCopyImageSubDataNV = provider.getFunctionAddress("glXCopyImageSubDataNV");
		glXCreateAssociatedContextAMD = provider.getFunctionAddress("glXCreateAssociatedContextAMD");
		glXCreateAssociatedContextAttribsAMD = provider.getFunctionAddress("glXCreateAssociatedContextAttribsAMD");
		glXCreateContextAttribsARB = provider.getFunctionAddress("glXCreateContextAttribsARB");
		glXCreateContextWithConfigSGIX = provider.getFunctionAddress("glXCreateContextWithConfigSGIX");
		glXCreateGLXPbufferSGIX = provider.getFunctionAddress("glXCreateGLXPbufferSGIX");
		glXCreateGLXPixmapWithConfigSGIX = provider.getFunctionAddress("glXCreateGLXPixmapWithConfigSGIX");
		glXCreateNewContext = provider.getFunctionAddress("glXCreateNewContext");
		glXCreatePbuffer = provider.getFunctionAddress("glXCreatePbuffer");
		glXCreatePixmap = provider.getFunctionAddress("glXCreatePixmap");
		glXCreateWindow = provider.getFunctionAddress("glXCreateWindow");
		glXDelayBeforeSwapNV = provider.getFunctionAddress("glXDelayBeforeSwapNV");
		glXDeleteAssociatedContextAMD = provider.getFunctionAddress("glXDeleteAssociatedContextAMD");
		glXDestroyGLXPbufferSGIX = provider.getFunctionAddress("glXDestroyGLXPbufferSGIX");
		glXDestroyPbuffer = provider.getFunctionAddress("glXDestroyPbuffer");
		glXDestroyPixmap = provider.getFunctionAddress("glXDestroyPixmap");
		glXFreeContextEXT = provider.getFunctionAddress("glXFreeContextEXT");
		glXGetClientString = provider.getFunctionAddress("glXGetClientString");
		glXGetContextGPUIDAMD = provider.getFunctionAddress("glXGetContextGPUIDAMD");
		glXGetContextIDEXT = provider.getFunctionAddress("glXGetContextIDEXT");
		glXGetCurrentAssociatedContextAMD = provider.getFunctionAddress("glXGetCurrentAssociatedContextAMD");
		glXGetCurrentDisplay = provider.getFunctionAddress("glXGetCurrentDisplay");
		glXGetCurrentDisplayEXT = provider.getFunctionAddress("glXGetCurrentDisplayEXT");
		glXGetCurrentReadDrawable = provider.getFunctionAddress("glXGetCurrentReadDrawable");
		glXGetCurrentReadDrawableSGI = provider.getFunctionAddress("glXGetCurrentReadDrawableSGI");
		glXGetFBConfigAttrib = provider.getFunctionAddress("glXGetFBConfigAttrib");
		glXGetFBConfigAttribSGIX = provider.getFunctionAddress("glXGetFBConfigAttribSGIX");
		glXGetFBConfigFromVisualSGIX = provider.getFunctionAddress("glXGetFBConfigFromVisualSGIX");
		glXGetFBConfigs = provider.getFunctionAddress("glXGetFBConfigs");
		glXGetGPUIDsAMD = provider.getFunctionAddress("glXGetGPUIDsAMD");
		glXGetGPUInfoAMD = provider.getFunctionAddress("glXGetGPUInfoAMD");
		glXGetProcAddress = provider.getFunctionAddress("glXGetProcAddress");
		glXGetProcAddressARB = provider.getFunctionAddress("glXGetProcAddressARB");
		glXGetSelectedEvent = provider.getFunctionAddress("glXGetSelectedEvent");
		glXGetSelectedEventSGIX = provider.getFunctionAddress("glXGetSelectedEventSGIX");
		glXGetVideoSyncSGI = provider.getFunctionAddress("glXGetVideoSyncSGI");
		glXGetVisualFromFBConfig = provider.getFunctionAddress("glXGetVisualFromFBConfig");
		glXGetVisualFromFBConfigSGIX = provider.getFunctionAddress("glXGetVisualFromFBConfigSGIX");
		glXImportContextEXT = provider.getFunctionAddress("glXImportContextEXT");
		glXJoinSwapGroupNV = provider.getFunctionAddress("glXJoinSwapGroupNV");
		glXJoinSwapGroupSGIX = provider.getFunctionAddress("glXJoinSwapGroupSGIX");
		glXMakeAssociatedContextCurrentAMD = provider.getFunctionAddress("glXMakeAssociatedContextCurrentAMD");
		glXMakeContextCurrent = provider.getFunctionAddress("glXMakeContextCurrent");
		glXMakeCurrentReadSGI = provider.getFunctionAddress("glXMakeCurrentReadSGI");
		glXNamedCopyBufferSubDataNV = provider.getFunctionAddress("glXNamedCopyBufferSubDataNV");
		glXQueryContext = provider.getFunctionAddress("glXQueryContext");
		glXQueryContextInfoEXT = provider.getFunctionAddress("glXQueryContextInfoEXT");
		glXQueryDrawable = provider.getFunctionAddress("glXQueryDrawable");
		glXQueryExtensionsString = provider.getFunctionAddress("glXQueryExtensionsString");
		glXQueryFrameCountNV = provider.getFunctionAddress("glXQueryFrameCountNV");
		glXQueryGLXPbufferSGIX = provider.getFunctionAddress("glXQueryGLXPbufferSGIX");
		glXQueryMaxSwapBarriersSGIX = provider.getFunctionAddress("glXQueryMaxSwapBarriersSGIX");
		glXQueryMaxSwapGroupsNV = provider.getFunctionAddress("glXQueryMaxSwapGroupsNV");
		glXQueryServerString = provider.getFunctionAddress("glXQueryServerString");
		glXQuerySwapGroupNV = provider.getFunctionAddress("glXQuerySwapGroupNV");
		glXReleaseTexImageEXT = provider.getFunctionAddress("glXReleaseTexImageEXT");
		glXResetFrameCountNV = provider.getFunctionAddress("glXResetFrameCountNV");
		glXSelectEvent = provider.getFunctionAddress("glXSelectEvent");
		glXSelectEventSGIX = provider.getFunctionAddress("glXSelectEventSGIX");
		glXSwapIntervalEXT = provider.getFunctionAddress("glXSwapIntervalEXT");
		glXSwapIntervalSGI = provider.getFunctionAddress("glXSwapIntervalSGI");
		glXWaitVideoSyncSGI = provider.getFunctionAddress("glXWaitVideoSyncSGI");

		GLX11 = ext.contains("GLX11") && checkExtension("GLX11", org.lwjgl.opengl.GLX11.isAvailable(this));
		GLX12 = ext.contains("GLX12") && checkExtension("GLX12", org.lwjgl.opengl.GLX12.isAvailable(this));
		GLX13 = ext.contains("GLX13") && checkExtension("GLX13", org.lwjgl.opengl.GLX13.isAvailable(this));
		GLX14 = ext.contains("GLX14") && checkExtension("GLX14", org.lwjgl.opengl.GLX14.isAvailable(this));
		GLX_AMD_gpu_association = ext.contains("GLX_AMD_gpu_association") && checkExtension("GLX_AMD_gpu_association", GLXAMDGPUAssociation.isAvailable(this));
		GLX_ARB_context_flush_control = ext.contains("GLX_ARB_context_flush_control");
		GLX_ARB_create_context = ext.contains("GLX_ARB_create_context") && checkExtension("GLX_ARB_create_context", GLXARBCreateContext.isAvailable(this));
		GLX_ARB_create_context_profile = ext.contains("GLX_ARB_create_context_profile");
		GLX_ARB_create_context_robustness = ext.contains("GLX_ARB_create_context_robustness");
		GLX_ARB_fbconfig_float = ext.contains("GLX_ARB_fbconfig_float");
		GLX_ARB_framebuffer_sRGB = ext.contains("GLX_ARB_framebuffer_sRGB");
		GLX_ARB_get_proc_address = ext.contains("GLX_ARB_get_proc_address") && checkExtension("GLX_ARB_get_proc_address", GLXARBGetProcAddress.isAvailable(this));
		GLX_ARB_multisample = ext.contains("GLX_ARB_multisample");
		GLX_ARB_robustness_application_isolation = ext.contains("GLX_ARB_robustness_application_isolation");
		GLX_ARB_robustness_share_group_isolation = ext.contains("GLX_ARB_robustness_share_group_isolation");
		GLX_ARB_vertex_buffer_object = ext.contains("GLX_ARB_vertex_buffer_object");
		GLX_EXT_buffer_age = ext.contains("GLX_EXT_buffer_age");
		GLX_EXT_create_context_es2_profile = ext.contains("GLX_EXT_create_context_es2_profile");
		GLX_EXT_create_context_es_profile = ext.contains("GLX_EXT_create_context_es_profile");
		GLX_EXT_fbconfig_packed_float = ext.contains("GLX_EXT_fbconfig_packed_float");
		GLX_EXT_framebuffer_sRGB = ext.contains("GLX_EXT_framebuffer_sRGB");
		GLX_EXT_import_context = ext.contains("GLX_EXT_import_context") && checkExtension("GLX_EXT_import_context", GLXEXTImportContext.isAvailable(this));
		GLX_EXT_stereo_tree = ext.contains("GLX_EXT_stereo_tree");
		GLX_EXT_swap_control = ext.contains("GLX_EXT_swap_control") && checkExtension("GLX_EXT_swap_control", GLXEXTSwapControl.isAvailable(this));
		GLX_EXT_swap_control_tear = ext.contains("GLX_EXT_swap_control_tear");
		GLX_EXT_texture_from_pixmap = ext.contains("GLX_EXT_texture_from_pixmap") && checkExtension("GLX_EXT_texture_from_pixmap", GLXEXTTextureFromPixmap.isAvailable(this));
		GLX_EXT_visual_info = ext.contains("GLX_EXT_visual_info");
		GLX_EXT_visual_rating = ext.contains("GLX_EXT_visual_rating");
		GLX_INTEL_swap_event = ext.contains("GLX_INTEL_swap_event");
		GLX_NV_copy_buffer = ext.contains("GLX_NV_copy_buffer") && checkExtension("GLX_NV_copy_buffer", GLXNVCopyBuffer.isAvailable(this));
		GLX_NV_copy_image = ext.contains("GLX_NV_copy_image") && checkExtension("GLX_NV_copy_image", GLXNVCopyImage.isAvailable(this));
		GLX_NV_delay_before_swap = ext.contains("GLX_NV_delay_before_swap") && checkExtension("GLX_NV_delay_before_swap", GLXNVDelayBeforeSwap.isAvailable(this));
		GLX_NV_float_buffer = ext.contains("GLX_NV_float_buffer");
		GLX_NV_multisample_coverage = ext.contains("GLX_NV_multisample_coverage");
		GLX_NV_robustness_video_memory_purge = ext.contains("GLX_NV_robustness_video_memory_purge");
		GLX_NV_swap_group = ext.contains("GLX_NV_swap_group") && checkExtension("GLX_NV_swap_group", GLXNVSwapGroup.isAvailable(this));
		GLX_SGI_make_current_read = ext.contains("GLX_SGI_make_current_read") && checkExtension("GLX_SGI_make_current_read", GLXSGIMakeCurrentRead.isAvailable(this));
		GLX_SGI_swap_control = ext.contains("GLX_SGI_swap_control") && checkExtension("GLX_SGI_swap_control", GLXSGISwapControl.isAvailable(this));
		GLX_SGI_video_sync = ext.contains("GLX_SGI_video_sync") && checkExtension("GLX_SGI_video_sync", GLXSGIVideoSync.isAvailable(this));
		GLX_SGIX_fbconfig = ext.contains("GLX_SGIX_fbconfig") && checkExtension("GLX_SGIX_fbconfig", GLXSGIXFBConfig.isAvailable(this));
		GLX_SGIX_pbuffer = ext.contains("GLX_SGIX_pbuffer") && checkExtension("GLX_SGIX_pbuffer", GLXSGIXPbuffer.isAvailable(this));
		GLX_SGIX_swap_barrier = ext.contains("GLX_SGIX_swap_barrier") && checkExtension("GLX_SGIX_swap_barrier", GLXSGIXSwapBarrier.isAvailable(this));
		GLX_SGIX_swap_group = ext.contains("GLX_SGIX_swap_group") && checkExtension("GLX_SGIX_swap_group", GLXSGIXSwapGroup.isAvailable(this));
	}

	private static boolean checkExtension(String extension, boolean supported) {
		if ( supported )
			return true;

		apiLog("[GLX] " + extension + " was reported as available but an entry point is missing.");
		return false;
	}

}