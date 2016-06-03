/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of an EGLDisplay or the EGL client library. */
public class EGLCapabilities {

	public final long
		eglBindAPI,
		eglBindTexImage,
		eglChooseConfig,
		eglClientWaitSync,
		eglClientWaitSyncKHR,
		eglClientWaitSyncNV,
		eglCopyBuffers,
		eglCreateContext,
		eglCreateDRMImageMESA,
		eglCreateFenceSyncNV,
		eglCreateImage,
		eglCreateImageKHR,
		eglCreatePbufferFromClientBuffer,
		eglCreatePbufferSurface,
		eglCreatePixmapSurface,
		eglCreatePixmapSurfaceHI,
		eglCreatePlatformPixmapSurface,
		eglCreatePlatformPixmapSurfaceEXT,
		eglCreatePlatformWindowSurface,
		eglCreatePlatformWindowSurfaceEXT,
		eglCreateStreamFromFileDescriptorKHR,
		eglCreateStreamKHR,
		eglCreateStreamProducerSurfaceKHR,
		eglCreateStreamSyncNV,
		eglCreateSync,
		eglCreateSync64KHR,
		eglCreateSyncKHR,
		eglCreateWindowSurface,
		eglDebugMessageControlKHR,
		eglDestroyContext,
		eglDestroyImage,
		eglDestroyImageKHR,
		eglDestroyStreamKHR,
		eglDestroySurface,
		eglDestroySync,
		eglDestroySyncKHR,
		eglDestroySyncNV,
		eglDupNativeFenceFDANDROID,
		eglExportDMABUFImageMESA,
		eglExportDMABUFImageQueryMESA,
		eglExportDRMImageMESA,
		eglFenceNV,
		eglGetConfigAttrib,
		eglGetConfigs,
		eglGetCurrentContext,
		eglGetCurrentDisplay,
		eglGetCurrentSurface,
		eglGetDisplay,
		eglGetError,
		eglGetOutputLayersEXT,
		eglGetOutputPortsEXT,
		eglGetPlatformDisplay,
		eglGetPlatformDisplayEXT,
		eglGetProcAddress,
		eglGetStreamFileDescriptorKHR,
		eglGetSyncAttrib,
		eglGetSyncAttribKHR,
		eglGetSyncAttribNV,
		eglGetSystemTimeFrequencyNV,
		eglGetSystemTimeNV,
		eglInitialize,
		eglLabelObjectKHR,
		eglLockSurfaceKHR,
		eglMakeCurrent,
		eglOutputLayerAttribEXT,
		eglOutputPortAttribEXT,
		eglPostSubBufferNV,
		eglQueryAPI,
		eglQueryContext,
		eglQueryDebugKHR,
		eglQueryDeviceAttribEXT,
		eglQueryDeviceStringEXT,
		eglQueryDevicesEXT,
		eglQueryDisplayAttribEXT,
		eglQueryDisplayAttribNV,
		eglQueryNativeDisplayNV,
		eglQueryNativePixmapNV,
		eglQueryNativeWindowNV,
		eglQueryOutputLayerAttribEXT,
		eglQueryOutputLayerStringEXT,
		eglQueryOutputPortAttribEXT,
		eglQueryOutputPortStringEXT,
		eglQueryStreamKHR,
		eglQueryStreamMetadataNV,
		eglQueryStreamTimeKHR,
		eglQueryStreamu64KHR,
		eglQueryString,
		eglQuerySurface,
		eglQuerySurface64KHR,
		eglQuerySurfacePointerANGLE,
		eglReleaseTexImage,
		eglReleaseThread,
		eglSetBlobCacheFuncsANDROID,
		eglSetDamageRegionKHR,
		eglSetStreamMetadataNV,
		eglSignalSyncKHR,
		eglSignalSyncNV,
		eglStreamAttribKHR,
		eglStreamConsumerAcquireKHR,
		eglStreamConsumerGLTextureExternalAttribsNV,
		eglStreamConsumerGLTextureExternalKHR,
		eglStreamConsumerOutputEXT,
		eglStreamConsumerReleaseKHR,
		eglSurfaceAttrib,
		eglSwapBuffers,
		eglSwapBuffersRegion2NOK,
		eglSwapBuffersWithDamageEXT,
		eglSwapBuffersWithDamageKHR,
		eglSwapInterval,
		eglTerminate,
		eglUnlockSurfaceKHR,
		eglWaitClient,
		eglWaitGL,
		eglWaitNative,
		eglWaitSync,
		eglWaitSyncKHR;

	/** When true, {@link EGL10} is supported. */
	public final boolean EGL10;
	/** When true, {@link EGL11} is supported. */
	public final boolean EGL11;
	/** When true, {@link EGL12} is supported. */
	public final boolean EGL12;
	/** When true, {@link EGL13} is supported. */
	public final boolean EGL13;
	/** When true, {@link EGL14} is supported. */
	public final boolean EGL14;
	/** When true, {@link EGL15} is supported. */
	public final boolean EGL15;
	/** When true, {@link ANDROIDBlobCache} is supported. */
	public final boolean EGL_ANDROID_blob_cache;
	/** When true, {@link ANDROIDFramebufferTarget} is supported. */
	public final boolean EGL_ANDROID_framebuffer_target;
	/** When true, {@link ANDROIDImageNativeBuffer} is supported. */
	public final boolean EGL_ANDROID_image_native_buffer;
	/** When true, {@link ANDROIDNativeFenceSync} is supported. */
	public final boolean EGL_ANDROID_native_fence_sync;
	/** When true, {@link ANDROIDRecordable} is supported. */
	public final boolean EGL_ANDROID_recordable;
	/** When true, {@link ANGLED3DShareHandleClientBuffer} is supported. */
	public final boolean EGL_ANGLE_d3d_share_handle_client_buffer;
	/** When true, {@link ANGLEDeviceD3D} is supported. */
	public final boolean EGL_ANGLE_device_d3d;
	/** When true, {@link ANGLEQuerySurfacePointer} is supported. */
	public final boolean EGL_ANGLE_query_surface_pointer;
	/** When true, {@link ANGLESurfaceD3DTexture2DShareHandle} is supported. */
	public final boolean EGL_ANGLE_surface_d3d_texture_2d_share_handle;
	/** When true, {@link ANGLEWindowFixedSize} is supported. */
	public final boolean EGL_ANGLE_window_fixed_size;
	/** When true, {@link ARMPixmapMultisampleDiscard} is supported. */
	public final boolean EGL_ARM_pixmap_multisample_discard;
	/** When true, {@link EXTBufferAge} is supported. */
	public final boolean EGL_EXT_buffer_age;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_EXT_client_extensions.txt">EXT_client_extensions</a> extension is supported.
	 * 
	 * <p>This extension introduces the concept of *extension type*, requires that each EGL extension belong to exactly one type, and defines two types: display
	 * and client. It also provides a method to query, without initializing a display, the set of supported client extensions.</p>
	 * 
	 * <p>A display extension adds functionality to an individual EGLDisplay. This type of extension has always existed but, until EGL_EXT_client_extensions,
	 * lacked an identifying name.</p>
	 * 
	 * <p>A client extension adds functionality that is independent of any display. In other words, it adds functionality to the EGL client library itself. This
	 * is a new type of extension defined by EGL_EXT_client_extensions. EGL_EXT_client_extensions is itself a client extension.</p>
	 * 
	 * <p>We suggest that each future extension clearly state its type by including the following toplevel section in its extension specification, preceding the
	 * Dependencies section. For client extensions, this suggestion is a requirement.</p>
	 * 
	 * <pre><code>        Extension Type

            &lt;Either "EGL display extension" or "EGL client extension" or
             a future extension type.&gt;</code></pre>
	 * 
	 * <p>By cleanly separating display extensions from client extensions, EGL_EXT_client_extensions solves a bootstrap problem for future EGL extensions that
	 * will modify display initialization. To query for such extensions without EGL_EXT_client_extensions, an EGL client would need to initialize a throw-away
	 * EGLDisplay solely to query its extension string. Initialization of the throw-away display may have undesired side-effects (discussed in the issues
	 * section below) for EGL clients that wish to use the new methods of display initialization.</p>
	 */
	public final boolean EGL_EXT_client_extensions;
	/** When true, {@link EXTCreateContextRobustness} is supported. */
	public final boolean EGL_EXT_create_context_robustness;
	/** When true, {@link EXTDeviceBase} is supported. */
	public final boolean EGL_EXT_device_base;
	/** When true, {@link EXTDeviceDRM} is supported. */
	public final boolean EGL_EXT_device_drm;
	/** When true, {@link EXTDeviceEnumeration} is supported. */
	public final boolean EGL_EXT_device_enumeration;
	/** When true, {@link EXTDeviceOpenWF} is supported. */
	public final boolean EGL_EXT_device_openwf;
	/** When true, {@link EXTDeviceQuery} is supported. */
	public final boolean EGL_EXT_device_query;
	/** When true, {@link EXTImageDMABufImport} is supported. */
	public final boolean EGL_EXT_image_dma_buf_import;
	/** When true, {@link EXTMultiviewWindow} is supported. */
	public final boolean EGL_EXT_multiview_window;
	/** When true, {@link EXTOutputBase} is supported. */
	public final boolean EGL_EXT_output_base;
	/** When true, {@link EXTOutputDRM} is supported. */
	public final boolean EGL_EXT_output_drm;
	/** When true, {@link EXTOutputOpenWF} is supported. */
	public final boolean EGL_EXT_output_openwf;
	/** When true, {@link EXTPlatformBase} is supported. */
	public final boolean EGL_EXT_platform_base;
	/** When true, {@link EXTPlatformDevice} is supported. */
	public final boolean EGL_EXT_platform_device;
	/** When true, {@link EXTPlatformWayland} is supported. */
	public final boolean EGL_EXT_platform_wayland;
	/** When true, {@link EXTPlatformX11} is supported. */
	public final boolean EGL_EXT_platform_x11;
	/** When true, {@link EXTProtectedSurface} is supported. */
	public final boolean EGL_EXT_protected_surface;
	/** When true, {@link EXTStreamConsumerEGLOutput} is supported. */
	public final boolean EGL_EXT_stream_consumer_egloutput;
	/** When true, {@link EXTSwapBuffersWithDamage} is supported. */
	public final boolean EGL_EXT_swap_buffers_with_damage;
	/** When true, {@link EXTYUVSurface} is supported. */
	public final boolean EGL_EXT_yuv_surface;
	/** When true, {@link HIClientpixmap} is supported. */
	public final boolean EGL_HI_clientpixmap;
	/** When true, {@link HIColorformats} is supported. */
	public final boolean EGL_HI_colorformats;
	/** When true, {@link IMGContextPriority} is supported. */
	public final boolean EGL_IMG_context_priority;
	/** When true, {@link IMGImagePlaneAttribs} is supported. */
	public final boolean EGL_IMG_image_plane_attribs;
	/** When true, {@link KHRCLEvent2} is supported. */
	public final boolean EGL_KHR_cl_event2;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/egl/extensions/EXT/EGL_KHR_get_all_proc_addresses.txt">KHR_client_get_all_proc_addresses</a> extension is supported.
	 * 
	 * <p>eglGetProcAddress is currently defined to not support the querying of non-extension EGL or client API functions. Non-extension functions are expected
	 * to be exposed as library symbols that can be resolved statically at link time, or dynamically at run time using OS-specific runtime linking mechanisms.</p>
	 * 
	 * <p>With the addition of OpenGL and OpenGL ES 3 support to EGL, the definition of a non-extension function becomes less clear. It is common for one OpenGL
	 * library to implement many versions of OpenGL. The suggested library name for OpenGL ES 3 is the same as that of OpenGL ES 2. If OpenGL ES 3
	 * applications linked statically to OpenGL ES 3 functions are run on a system with only OpenGL ES 2 support, they may fail to load. Similar problems
	 * would be encountered by an application linking statically to various OpenGL functions.</p>
	 * 
	 * <p>To avoid requiring applications to fall back to OS-specific dynamic linking mechanisms, this extension drops the requirement that eglGetProcAddress
	 * return only non-extension functions. If the extension string is present, applications can query all EGL and client API functions using
	 * eglGetProcAddress.</p>
	 * 
	 * <p>To allow users to query this extension before initializing a display, and to also allow vendors to ship this extension without
	 * EGL_EXT_client_extensions, two names are assigned to this extension: one a display extension and the other a client extension. Identical functionality
	 * is exposed by each name, but users query each name using different methods. Users query EGL_KHR_get_all_proc_addresses in the usual way; that is, by
	 * calling eglQueryString(dpy, EGL_EXTENSIONS) on an initialized display. To query EGL_KHR_client_get_all_proc_addresses, users must use a different
	 * method which is described below in the section concerning EGL_EXT_client_extensions.</p>
	 * 
	 * <p>Requires {@link EGL12 EGL L.1}.</p>
	 */
	public final boolean EGL_KHR_client_get_all_proc_addresses;
	/** When true, {@link KHRConfigAttribs} is supported. */
	public final boolean EGL_KHR_config_attribs;
	/** When true, {@link KHRCreateContext} is supported. */
	public final boolean EGL_KHR_create_context;
	/** When true, {@link KHRCreateContextNoError} is supported. */
	public final boolean EGL_KHR_create_context_no_error;
	/** When true, {@link KHRDebug} is supported. */
	public final boolean EGL_KHR_debug;
	/** When true, {@link KHRFenceSync} is supported. */
	public final boolean EGL_KHR_fence_sync;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_get_all_proc_addresses.txt">KHR_get_all_proc_addresses</a> extension is supported.
	 * 
	 * <p>eglGetProcAddress is currently defined to not support the querying of non-extension EGL or client API functions. Non-extension functions are expected
	 * to be exposed as library symbols that can be resolved statically at link time, or dynamically at run time using OS-specific runtime linking mechanisms.</p>
	 * 
	 * <p>With the addition of OpenGL and OpenGL ES 3 support to EGL, the definition of a non-extension function becomes less clear. It is common for one OpenGL
	 * library to implement many versions of OpenGL. The suggested library name for OpenGL ES 3 is the same as that of OpenGL ES 2. If OpenGL ES 3
	 * applications linked statically to OpenGL ES 3 functions are run on a system with only OpenGL ES 2 support, they may fail to load. Similar problems
	 * would be encountered by an application linking statically to various OpenGL functions.</p>
	 * 
	 * <p>To avoid requiring applications to fall back to OS-specific dynamic linking mechanisms, this extension drops the requirement that eglGetProcAddress
	 * return only non-extension functions. If the extension string is present, applications can query all EGL and client API functions using
	 * eglGetProcAddress.</p>
	 * 
	 * <p>To allow users to query this extension before initializing a display, and to also allow vendors to ship this extension without
	 * EGL_EXT_client_extensions, two names are assigned to this extension: one a display extension and the other a client extension. Identical functionality
	 * is exposed by each name, but users query each name using different methods. Users query EGL_KHR_get_all_proc_addresses in the usual way; that is, by
	 * calling eglQueryString(dpy, EGL_EXTENSIONS) on an initialized display. To query EGL_KHR_client_get_all_proc_addresses, users must use a different
	 * method which is described below in the section concerning EGL_EXT_client_extensions.</p>
	 * 
	 * <p>Requires {@link EGL12 EGL L.1}.</p>
	 */
	public final boolean EGL_KHR_get_all_proc_addresses;
	/** When true, {@link KHRGLColorspace} is supported. */
	public final boolean EGL_KHR_gl_colorspace;
	/** When true, {@link KHRGLRenderbufferImage} is supported. */
	public final boolean EGL_KHR_gl_renderbuffer_image;
	/** When true, {@link KHRGLTexture2DImage} is supported. */
	public final boolean EGL_KHR_gl_texture_2D_image;
	/** When true, {@link KHRGLTexture3DImage} is supported. */
	public final boolean EGL_KHR_gl_texture_3D_image;
	/** When true, {@link KHRGLTextureCubemapImage} is supported. */
	public final boolean EGL_KHR_gl_texture_cubemap_image;
	/** When true, {@link KHRImage} is supported. */
	public final boolean EGL_KHR_image;
	/** When true, {@link KHRImageBase} is supported. */
	public final boolean EGL_KHR_image_base;
	/** When true, {@link KHRImagePixmap} is supported. */
	public final boolean EGL_KHR_image_pixmap;
	/** When true, {@link KHRLockSurface3} is supported. */
	public final boolean EGL_KHR_lock_surface3;
	/** When true, {@link KHRMutableRenderBuffer} is supported. */
	public final boolean EGL_KHR_mutable_render_buffer;
	/** When true, {@link KHRPartialUpdate} is supported. */
	public final boolean EGL_KHR_partial_update;
	/** When true, {@link KHRPlatformAndroid} is supported. */
	public final boolean EGL_KHR_platform_android;
	/** When true, {@link KHRPlatformGBM} is supported. */
	public final boolean EGL_KHR_platform_gbm;
	/** When true, {@link KHRPlatformWayland} is supported. */
	public final boolean EGL_KHR_platform_wayland;
	/** When true, {@link KHRPlatformX11} is supported. */
	public final boolean EGL_KHR_platform_x11;
	/** When true, {@link KHRReusableSync} is supported. */
	public final boolean EGL_KHR_reusable_sync;
	/** When true, {@link KHRStream} is supported. */
	public final boolean EGL_KHR_stream;
	/** When true, {@link KHRStreamConsumerGLTexture} is supported. */
	public final boolean EGL_KHR_stream_consumer_gltexture;
	/** When true, {@link KHRStreamCrossProcessFD} is supported. */
	public final boolean EGL_KHR_stream_cross_process_fd;
	/** When true, {@link KHRStreamFIFO} is supported. */
	public final boolean EGL_KHR_stream_fifo;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_stream_producer_aldatalocator.txt">KHR_stream_producer_aldatalocator</a> extension is supported.
	 * 
	 * <p>This extension (in conjunction with the OpenMAX_AL_EGLStream_DataLocator extension to OpenMAX AL) allows an OpenMAX AL MediaPlayer object to be
	 * connected as the producer of an EGLStream.</p>
	 * 
	 * <p>After the EGLStream is created and connected to a consumer, the OpenMAX AL MediaPlayer object is created by calling &lt;pEngine&gt;'s
	 * CreateMediaPlayer() method. The &lt;pImageVideoSnk&gt; argument points to an XADataLocator_EGLStream containing the EGLStreamKHR handle of the stream.
	 * The CreateMediaPlayer() method creates a MediaPlayer object and connects it as the producer of the EGLStream. (Note that the pFormat member of the
	 * XADataSink structure is ignored in this case and may be {@code NULL}.)</p>
	 * 
	 * <p>Once connected the MediaPlayer inserts image frames into the EGLStream.</p>
	 * 
	 * <p>Requires {@link EGL12 EGL L.1} and {@link KHRStream KHR_stream}. Requires OpenMAX AL 1.1 and OpenMAX_AL_EGLStream_DataLocator.</p>
	 */
	public final boolean EGL_KHR_stream_producer_aldatalocator;
	/** When true, {@link KHRStreamProducerEGLSurface} is supported. */
	public final boolean EGL_KHR_stream_producer_eglsurface;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_surfaceless_context.txt">KHR_surfaceless_context</a> extension is supported.
	 * 
	 * <p>These extensions allows an application to make a context current by passing EGL_NO_SURFACE for the write and read surface in the call to
	 * eglMakeCurrent. The motivation is that applications that only want to render to client API targets (such as OpenGL framebuffer objects) should not need
	 * to create a throw-away EGL surface just to get a current context.</p>
	 * 
	 * <p>The state of an OpenGL ES context with no default framebuffer provided by EGL is the same as a context with an incomplete framebuffer object bound.</p>
	 */
	public final boolean EGL_KHR_surfaceless_context;
	/** When true, {@link KHRSwapBuffersWithDamage} is supported. */
	public final boolean EGL_KHR_swap_buffers_with_damage;
	/** When true, {@link KHRVGParentImage} is supported. */
	public final boolean EGL_KHR_vg_parent_image;
	/** When true, {@link KHRWaitSync} is supported. */
	public final boolean EGL_KHR_wait_sync;
	/** When true, {@link MESADRMImage} is supported. */
	public final boolean EGL_MESA_drm_image;
	/** When true, {@link MESAImageDMABufExport} is supported. */
	public final boolean EGL_MESA_image_dma_buf_export;
	/** When true, {@link MESAPlatformGBM} is supported. */
	public final boolean EGL_MESA_platform_gbm;
	/** When true, {@link NOKSwapRegion2} is supported. */
	public final boolean EGL_NOK_swap_region2;
	/** When true, {@link NOKTextureFromPixmap} is supported. */
	public final boolean EGL_NOK_texture_from_pixmap;
	/** When true, {@link NV3dvisionSurface} is supported. */
	public final boolean EGL_NV_3dvision_surface;
	/** When true, {@link NVCoverageSample} is supported. */
	public final boolean EGL_NV_coverage_sample;
	/** When true, {@link NVCoverageSampleResolve} is supported. */
	public final boolean EGL_NV_coverage_sample_resolve;
	/** When true, {@link NVCUDAEvent} is supported. */
	public final boolean EGL_NV_cuda_event;
	/** When true, {@link NVDepthNonlinear} is supported. */
	public final boolean EGL_NV_depth_nonlinear;
	/** When true, {@link NVDeviceCUDA} is supported. */
	public final boolean EGL_NV_device_cuda;
	/** When true, {@link NVNativeQuery} is supported. */
	public final boolean EGL_NV_native_query;
	/**
	 * When true, the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_post_convert_rounding.txt">NV_post_convert_rounding</a> extension is supported.
	 * 
	 * <p>This extension defines the conversions for posting operations when the destination's number of components or component sizes do not match the color
	 * buffer. This extension supports posting a 24 bit (888) color buffer to a 16 bit (565) destination buffer, posting a 16 bit (565) color buffer to a 24
	 * bit (888) destination buffer, and posting a component that is present in the source buffer, but not present in the destination buffer.</p>
	 */
	public final boolean EGL_NV_post_convert_rounding;
	/** When true, {@link NVPostSubBuffer} is supported. */
	public final boolean EGL_NV_post_sub_buffer;
	/** When true, {@link NVRobustnessVideoMemoryPurge} is supported. */
	public final boolean EGL_NV_robustness_video_memory_purge;
	/** When true, {@link NVStreamConsumerGLTextureYUV} is supported. */
	public final boolean EGL_NV_stream_consumer_gltexture_yuv;
	/** When true, {@link NVStreamMetadata} is supported. */
	public final boolean EGL_NV_stream_metadata;
	/** When true, {@link NVStreamSync} is supported. */
	public final boolean EGL_NV_stream_sync;
	/** When true, {@link NVSync} is supported. */
	public final boolean EGL_NV_sync;
	/** When true, {@link NVSystemTime} is supported. */
	public final boolean EGL_NV_system_time;
	/** When true, {@link TIZENImageNativeBuffer} is supported. */
	public final boolean EGL_TIZEN_image_native_buffer;
	/** When true, {@link TIZENImageNativeSurface} is supported. */
	public final boolean EGL_TIZEN_image_native_surface;

	EGLCapabilities(FunctionProvider provider, Set<String> ext) {
		this(ext,
			provider.getFunctionAddress("eglBindAPI"),
			provider.getFunctionAddress("eglBindTexImage"),
			provider.getFunctionAddress("eglChooseConfig"),
			provider.getFunctionAddress("eglClientWaitSync"),
			provider.getFunctionAddress("eglClientWaitSyncKHR"),
			provider.getFunctionAddress("eglClientWaitSyncNV"),
			provider.getFunctionAddress("eglCopyBuffers"),
			provider.getFunctionAddress("eglCreateContext"),
			provider.getFunctionAddress("eglCreateDRMImageMESA"),
			provider.getFunctionAddress("eglCreateFenceSyncNV"),
			provider.getFunctionAddress("eglCreateImage"),
			provider.getFunctionAddress("eglCreateImageKHR"),
			provider.getFunctionAddress("eglCreatePbufferFromClientBuffer"),
			provider.getFunctionAddress("eglCreatePbufferSurface"),
			provider.getFunctionAddress("eglCreatePixmapSurface"),
			provider.getFunctionAddress("eglCreatePixmapSurfaceHI"),
			provider.getFunctionAddress("eglCreatePlatformPixmapSurface"),
			provider.getFunctionAddress("eglCreatePlatformPixmapSurfaceEXT"),
			provider.getFunctionAddress("eglCreatePlatformWindowSurface"),
			provider.getFunctionAddress("eglCreatePlatformWindowSurfaceEXT"),
			provider.getFunctionAddress("eglCreateStreamFromFileDescriptorKHR"),
			provider.getFunctionAddress("eglCreateStreamKHR"),
			provider.getFunctionAddress("eglCreateStreamProducerSurfaceKHR"),
			provider.getFunctionAddress("eglCreateStreamSyncNV"),
			provider.getFunctionAddress("eglCreateSync"),
			provider.getFunctionAddress("eglCreateSync64KHR"),
			provider.getFunctionAddress("eglCreateSyncKHR"),
			provider.getFunctionAddress("eglCreateWindowSurface"),
			provider.getFunctionAddress("eglDebugMessageControlKHR"),
			provider.getFunctionAddress("eglDestroyContext"),
			provider.getFunctionAddress("eglDestroyImage"),
			provider.getFunctionAddress("eglDestroyImageKHR"),
			provider.getFunctionAddress("eglDestroyStreamKHR"),
			provider.getFunctionAddress("eglDestroySurface"),
			provider.getFunctionAddress("eglDestroySync"),
			provider.getFunctionAddress("eglDestroySyncKHR"),
			provider.getFunctionAddress("eglDestroySyncNV"),
			provider.getFunctionAddress("eglDupNativeFenceFDANDROID"),
			provider.getFunctionAddress("eglExportDMABUFImageMESA"),
			provider.getFunctionAddress("eglExportDMABUFImageQueryMESA"),
			provider.getFunctionAddress("eglExportDRMImageMESA"),
			provider.getFunctionAddress("eglFenceNV"),
			provider.getFunctionAddress("eglGetConfigAttrib"),
			provider.getFunctionAddress("eglGetConfigs"),
			provider.getFunctionAddress("eglGetCurrentContext"),
			provider.getFunctionAddress("eglGetCurrentDisplay"),
			provider.getFunctionAddress("eglGetCurrentSurface"),
			provider.getFunctionAddress("eglGetDisplay"),
			provider.getFunctionAddress("eglGetError"),
			provider.getFunctionAddress("eglGetOutputLayersEXT"),
			provider.getFunctionAddress("eglGetOutputPortsEXT"),
			provider.getFunctionAddress("eglGetPlatformDisplay"),
			provider.getFunctionAddress("eglGetPlatformDisplayEXT"),
			provider.getFunctionAddress("eglGetProcAddress"),
			provider.getFunctionAddress("eglGetStreamFileDescriptorKHR"),
			provider.getFunctionAddress("eglGetSyncAttrib"),
			provider.getFunctionAddress("eglGetSyncAttribKHR"),
			provider.getFunctionAddress("eglGetSyncAttribNV"),
			provider.getFunctionAddress("eglGetSystemTimeFrequencyNV"),
			provider.getFunctionAddress("eglGetSystemTimeNV"),
			provider.getFunctionAddress("eglInitialize"),
			provider.getFunctionAddress("eglLabelObjectKHR"),
			provider.getFunctionAddress("eglLockSurfaceKHR"),
			provider.getFunctionAddress("eglMakeCurrent"),
			provider.getFunctionAddress("eglOutputLayerAttribEXT"),
			provider.getFunctionAddress("eglOutputPortAttribEXT"),
			provider.getFunctionAddress("eglPostSubBufferNV"),
			provider.getFunctionAddress("eglQueryAPI"),
			provider.getFunctionAddress("eglQueryContext"),
			provider.getFunctionAddress("eglQueryDebugKHR"),
			provider.getFunctionAddress("eglQueryDeviceAttribEXT"),
			provider.getFunctionAddress("eglQueryDeviceStringEXT"),
			provider.getFunctionAddress("eglQueryDevicesEXT"),
			provider.getFunctionAddress("eglQueryDisplayAttribEXT"),
			provider.getFunctionAddress("eglQueryDisplayAttribNV"),
			provider.getFunctionAddress("eglQueryNativeDisplayNV"),
			provider.getFunctionAddress("eglQueryNativePixmapNV"),
			provider.getFunctionAddress("eglQueryNativeWindowNV"),
			provider.getFunctionAddress("eglQueryOutputLayerAttribEXT"),
			provider.getFunctionAddress("eglQueryOutputLayerStringEXT"),
			provider.getFunctionAddress("eglQueryOutputPortAttribEXT"),
			provider.getFunctionAddress("eglQueryOutputPortStringEXT"),
			provider.getFunctionAddress("eglQueryStreamKHR"),
			provider.getFunctionAddress("eglQueryStreamMetadataNV"),
			provider.getFunctionAddress("eglQueryStreamTimeKHR"),
			provider.getFunctionAddress("eglQueryStreamu64KHR"),
			provider.getFunctionAddress("eglQueryString"),
			provider.getFunctionAddress("eglQuerySurface"),
			provider.getFunctionAddress("eglQuerySurface64KHR"),
			provider.getFunctionAddress("eglQuerySurfacePointerANGLE"),
			provider.getFunctionAddress("eglReleaseTexImage"),
			provider.getFunctionAddress("eglReleaseThread"),
			provider.getFunctionAddress("eglSetBlobCacheFuncsANDROID"),
			provider.getFunctionAddress("eglSetDamageRegionKHR"),
			provider.getFunctionAddress("eglSetStreamMetadataNV"),
			provider.getFunctionAddress("eglSignalSyncKHR"),
			provider.getFunctionAddress("eglSignalSyncNV"),
			provider.getFunctionAddress("eglStreamAttribKHR"),
			provider.getFunctionAddress("eglStreamConsumerAcquireKHR"),
			provider.getFunctionAddress("eglStreamConsumerGLTextureExternalAttribsNV"),
			provider.getFunctionAddress("eglStreamConsumerGLTextureExternalKHR"),
			provider.getFunctionAddress("eglStreamConsumerOutputEXT"),
			provider.getFunctionAddress("eglStreamConsumerReleaseKHR"),
			provider.getFunctionAddress("eglSurfaceAttrib"),
			provider.getFunctionAddress("eglSwapBuffers"),
			provider.getFunctionAddress("eglSwapBuffersRegion2NOK"),
			provider.getFunctionAddress("eglSwapBuffersWithDamageEXT"),
			provider.getFunctionAddress("eglSwapBuffersWithDamageKHR"),
			provider.getFunctionAddress("eglSwapInterval"),
			provider.getFunctionAddress("eglTerminate"),
			provider.getFunctionAddress("eglUnlockSurfaceKHR"),
			provider.getFunctionAddress("eglWaitClient"),
			provider.getFunctionAddress("eglWaitGL"),
			provider.getFunctionAddress("eglWaitNative"),
			provider.getFunctionAddress("eglWaitSync"),
			provider.getFunctionAddress("eglWaitSyncKHR")
		);
	}

	EGLCapabilities(EGLCapabilities caps, Set<String> ext) {
		this(ext,
			caps.eglBindAPI,
			caps.eglBindTexImage,
			caps.eglChooseConfig,
			caps.eglClientWaitSync,
			caps.eglClientWaitSyncKHR,
			caps.eglClientWaitSyncNV,
			caps.eglCopyBuffers,
			caps.eglCreateContext,
			caps.eglCreateDRMImageMESA,
			caps.eglCreateFenceSyncNV,
			caps.eglCreateImage,
			caps.eglCreateImageKHR,
			caps.eglCreatePbufferFromClientBuffer,
			caps.eglCreatePbufferSurface,
			caps.eglCreatePixmapSurface,
			caps.eglCreatePixmapSurfaceHI,
			caps.eglCreatePlatformPixmapSurface,
			caps.eglCreatePlatformPixmapSurfaceEXT,
			caps.eglCreatePlatformWindowSurface,
			caps.eglCreatePlatformWindowSurfaceEXT,
			caps.eglCreateStreamFromFileDescriptorKHR,
			caps.eglCreateStreamKHR,
			caps.eglCreateStreamProducerSurfaceKHR,
			caps.eglCreateStreamSyncNV,
			caps.eglCreateSync,
			caps.eglCreateSync64KHR,
			caps.eglCreateSyncKHR,
			caps.eglCreateWindowSurface,
			caps.eglDebugMessageControlKHR,
			caps.eglDestroyContext,
			caps.eglDestroyImage,
			caps.eglDestroyImageKHR,
			caps.eglDestroyStreamKHR,
			caps.eglDestroySurface,
			caps.eglDestroySync,
			caps.eglDestroySyncKHR,
			caps.eglDestroySyncNV,
			caps.eglDupNativeFenceFDANDROID,
			caps.eglExportDMABUFImageMESA,
			caps.eglExportDMABUFImageQueryMESA,
			caps.eglExportDRMImageMESA,
			caps.eglFenceNV,
			caps.eglGetConfigAttrib,
			caps.eglGetConfigs,
			caps.eglGetCurrentContext,
			caps.eglGetCurrentDisplay,
			caps.eglGetCurrentSurface,
			caps.eglGetDisplay,
			caps.eglGetError,
			caps.eglGetOutputLayersEXT,
			caps.eglGetOutputPortsEXT,
			caps.eglGetPlatformDisplay,
			caps.eglGetPlatformDisplayEXT,
			caps.eglGetProcAddress,
			caps.eglGetStreamFileDescriptorKHR,
			caps.eglGetSyncAttrib,
			caps.eglGetSyncAttribKHR,
			caps.eglGetSyncAttribNV,
			caps.eglGetSystemTimeFrequencyNV,
			caps.eglGetSystemTimeNV,
			caps.eglInitialize,
			caps.eglLabelObjectKHR,
			caps.eglLockSurfaceKHR,
			caps.eglMakeCurrent,
			caps.eglOutputLayerAttribEXT,
			caps.eglOutputPortAttribEXT,
			caps.eglPostSubBufferNV,
			caps.eglQueryAPI,
			caps.eglQueryContext,
			caps.eglQueryDebugKHR,
			caps.eglQueryDeviceAttribEXT,
			caps.eglQueryDeviceStringEXT,
			caps.eglQueryDevicesEXT,
			caps.eglQueryDisplayAttribEXT,
			caps.eglQueryDisplayAttribNV,
			caps.eglQueryNativeDisplayNV,
			caps.eglQueryNativePixmapNV,
			caps.eglQueryNativeWindowNV,
			caps.eglQueryOutputLayerAttribEXT,
			caps.eglQueryOutputLayerStringEXT,
			caps.eglQueryOutputPortAttribEXT,
			caps.eglQueryOutputPortStringEXT,
			caps.eglQueryStreamKHR,
			caps.eglQueryStreamMetadataNV,
			caps.eglQueryStreamTimeKHR,
			caps.eglQueryStreamu64KHR,
			caps.eglQueryString,
			caps.eglQuerySurface,
			caps.eglQuerySurface64KHR,
			caps.eglQuerySurfacePointerANGLE,
			caps.eglReleaseTexImage,
			caps.eglReleaseThread,
			caps.eglSetBlobCacheFuncsANDROID,
			caps.eglSetDamageRegionKHR,
			caps.eglSetStreamMetadataNV,
			caps.eglSignalSyncKHR,
			caps.eglSignalSyncNV,
			caps.eglStreamAttribKHR,
			caps.eglStreamConsumerAcquireKHR,
			caps.eglStreamConsumerGLTextureExternalAttribsNV,
			caps.eglStreamConsumerGLTextureExternalKHR,
			caps.eglStreamConsumerOutputEXT,
			caps.eglStreamConsumerReleaseKHR,
			caps.eglSurfaceAttrib,
			caps.eglSwapBuffers,
			caps.eglSwapBuffersRegion2NOK,
			caps.eglSwapBuffersWithDamageEXT,
			caps.eglSwapBuffersWithDamageKHR,
			caps.eglSwapInterval,
			caps.eglTerminate,
			caps.eglUnlockSurfaceKHR,
			caps.eglWaitClient,
			caps.eglWaitGL,
			caps.eglWaitNative,
			caps.eglWaitSync,
			caps.eglWaitSyncKHR
		);
	}

	private EGLCapabilities(Set<String> ext, long... functions) {
		eglBindAPI = functions[0];
		eglBindTexImage = functions[1];
		eglChooseConfig = functions[2];
		eglClientWaitSync = functions[3];
		eglClientWaitSyncKHR = functions[4];
		eglClientWaitSyncNV = functions[5];
		eglCopyBuffers = functions[6];
		eglCreateContext = functions[7];
		eglCreateDRMImageMESA = functions[8];
		eglCreateFenceSyncNV = functions[9];
		eglCreateImage = functions[10];
		eglCreateImageKHR = functions[11];
		eglCreatePbufferFromClientBuffer = functions[12];
		eglCreatePbufferSurface = functions[13];
		eglCreatePixmapSurface = functions[14];
		eglCreatePixmapSurfaceHI = functions[15];
		eglCreatePlatformPixmapSurface = functions[16];
		eglCreatePlatformPixmapSurfaceEXT = functions[17];
		eglCreatePlatformWindowSurface = functions[18];
		eglCreatePlatformWindowSurfaceEXT = functions[19];
		eglCreateStreamFromFileDescriptorKHR = functions[20];
		eglCreateStreamKHR = functions[21];
		eglCreateStreamProducerSurfaceKHR = functions[22];
		eglCreateStreamSyncNV = functions[23];
		eglCreateSync = functions[24];
		eglCreateSync64KHR = functions[25];
		eglCreateSyncKHR = functions[26];
		eglCreateWindowSurface = functions[27];
		eglDebugMessageControlKHR = functions[28];
		eglDestroyContext = functions[29];
		eglDestroyImage = functions[30];
		eglDestroyImageKHR = functions[31];
		eglDestroyStreamKHR = functions[32];
		eglDestroySurface = functions[33];
		eglDestroySync = functions[34];
		eglDestroySyncKHR = functions[35];
		eglDestroySyncNV = functions[36];
		eglDupNativeFenceFDANDROID = functions[37];
		eglExportDMABUFImageMESA = functions[38];
		eglExportDMABUFImageQueryMESA = functions[39];
		eglExportDRMImageMESA = functions[40];
		eglFenceNV = functions[41];
		eglGetConfigAttrib = functions[42];
		eglGetConfigs = functions[43];
		eglGetCurrentContext = functions[44];
		eglGetCurrentDisplay = functions[45];
		eglGetCurrentSurface = functions[46];
		eglGetDisplay = functions[47];
		eglGetError = functions[48];
		eglGetOutputLayersEXT = functions[49];
		eglGetOutputPortsEXT = functions[50];
		eglGetPlatformDisplay = functions[51];
		eglGetPlatformDisplayEXT = functions[52];
		eglGetProcAddress = functions[53];
		eglGetStreamFileDescriptorKHR = functions[54];
		eglGetSyncAttrib = functions[55];
		eglGetSyncAttribKHR = functions[56];
		eglGetSyncAttribNV = functions[57];
		eglGetSystemTimeFrequencyNV = functions[58];
		eglGetSystemTimeNV = functions[59];
		eglInitialize = functions[60];
		eglLabelObjectKHR = functions[61];
		eglLockSurfaceKHR = functions[62];
		eglMakeCurrent = functions[63];
		eglOutputLayerAttribEXT = functions[64];
		eglOutputPortAttribEXT = functions[65];
		eglPostSubBufferNV = functions[66];
		eglQueryAPI = functions[67];
		eglQueryContext = functions[68];
		eglQueryDebugKHR = functions[69];
		eglQueryDeviceAttribEXT = functions[70];
		eglQueryDeviceStringEXT = functions[71];
		eglQueryDevicesEXT = functions[72];
		eglQueryDisplayAttribEXT = functions[73];
		eglQueryDisplayAttribNV = functions[74];
		eglQueryNativeDisplayNV = functions[75];
		eglQueryNativePixmapNV = functions[76];
		eglQueryNativeWindowNV = functions[77];
		eglQueryOutputLayerAttribEXT = functions[78];
		eglQueryOutputLayerStringEXT = functions[79];
		eglQueryOutputPortAttribEXT = functions[80];
		eglQueryOutputPortStringEXT = functions[81];
		eglQueryStreamKHR = functions[82];
		eglQueryStreamMetadataNV = functions[83];
		eglQueryStreamTimeKHR = functions[84];
		eglQueryStreamu64KHR = functions[85];
		eglQueryString = functions[86];
		eglQuerySurface = functions[87];
		eglQuerySurface64KHR = functions[88];
		eglQuerySurfacePointerANGLE = functions[89];
		eglReleaseTexImage = functions[90];
		eglReleaseThread = functions[91];
		eglSetBlobCacheFuncsANDROID = functions[92];
		eglSetDamageRegionKHR = functions[93];
		eglSetStreamMetadataNV = functions[94];
		eglSignalSyncKHR = functions[95];
		eglSignalSyncNV = functions[96];
		eglStreamAttribKHR = functions[97];
		eglStreamConsumerAcquireKHR = functions[98];
		eglStreamConsumerGLTextureExternalAttribsNV = functions[99];
		eglStreamConsumerGLTextureExternalKHR = functions[100];
		eglStreamConsumerOutputEXT = functions[101];
		eglStreamConsumerReleaseKHR = functions[102];
		eglSurfaceAttrib = functions[103];
		eglSwapBuffers = functions[104];
		eglSwapBuffersRegion2NOK = functions[105];
		eglSwapBuffersWithDamageEXT = functions[106];
		eglSwapBuffersWithDamageKHR = functions[107];
		eglSwapInterval = functions[108];
		eglTerminate = functions[109];
		eglUnlockSurfaceKHR = functions[110];
		eglWaitClient = functions[111];
		eglWaitGL = functions[112];
		eglWaitNative = functions[113];
		eglWaitSync = functions[114];
		eglWaitSyncKHR = functions[115];

		EGL10 = ext.contains("EGL10") && EGL.checkExtension("EGL10", org.lwjgl.egl.EGL10.isAvailable(this));
		EGL11 = ext.contains("EGL11") && EGL.checkExtension("EGL11", org.lwjgl.egl.EGL11.isAvailable(this));
		EGL12 = ext.contains("EGL12") && EGL.checkExtension("EGL12", org.lwjgl.egl.EGL12.isAvailable(this));
		EGL13 = ext.contains("EGL13");
		EGL14 = ext.contains("EGL14") && EGL.checkExtension("EGL14", org.lwjgl.egl.EGL14.isAvailable(this));
		EGL15 = ext.contains("EGL15") && EGL.checkExtension("EGL15", org.lwjgl.egl.EGL15.isAvailable(this));
		EGL_ANDROID_blob_cache = ext.contains("EGL_ANDROID_blob_cache") && EGL.checkExtension("EGL_ANDROID_blob_cache", ANDROIDBlobCache.isAvailable(this));
		EGL_ANDROID_framebuffer_target = ext.contains("EGL_ANDROID_framebuffer_target");
		EGL_ANDROID_image_native_buffer = ext.contains("EGL_ANDROID_image_native_buffer");
		EGL_ANDROID_native_fence_sync = ext.contains("EGL_ANDROID_native_fence_sync") && EGL.checkExtension("EGL_ANDROID_native_fence_sync", ANDROIDNativeFenceSync.isAvailable(this));
		EGL_ANDROID_recordable = ext.contains("EGL_ANDROID_recordable");
		EGL_ANGLE_d3d_share_handle_client_buffer = ext.contains("EGL_ANGLE_d3d_share_handle_client_buffer");
		EGL_ANGLE_device_d3d = ext.contains("EGL_ANGLE_device_d3d");
		EGL_ANGLE_query_surface_pointer = ext.contains("EGL_ANGLE_query_surface_pointer") && EGL.checkExtension("EGL_ANGLE_query_surface_pointer", ANGLEQuerySurfacePointer.isAvailable(this));
		EGL_ANGLE_surface_d3d_texture_2d_share_handle = ext.contains("EGL_ANGLE_surface_d3d_texture_2d_share_handle");
		EGL_ANGLE_window_fixed_size = ext.contains("EGL_ANGLE_window_fixed_size");
		EGL_ARM_pixmap_multisample_discard = ext.contains("EGL_ARM_pixmap_multisample_discard");
		EGL_EXT_buffer_age = ext.contains("EGL_EXT_buffer_age");
		EGL_EXT_client_extensions = ext.contains("EGL_EXT_client_extensions");
		EGL_EXT_create_context_robustness = ext.contains("EGL_EXT_create_context_robustness");
		EGL_EXT_device_base = ext.contains("EGL_EXT_device_base") && EGL.checkExtension("EGL_EXT_device_base", EXTDeviceBase.isAvailable(this));
		EGL_EXT_device_drm = ext.contains("EGL_EXT_device_drm");
		EGL_EXT_device_enumeration = ext.contains("EGL_EXT_device_enumeration") && EGL.checkExtension("EGL_EXT_device_enumeration", EXTDeviceEnumeration.isAvailable(this));
		EGL_EXT_device_openwf = ext.contains("EGL_EXT_device_openwf");
		EGL_EXT_device_query = ext.contains("EGL_EXT_device_query") && EGL.checkExtension("EGL_EXT_device_query", EXTDeviceQuery.isAvailable(this));
		EGL_EXT_image_dma_buf_import = ext.contains("EGL_EXT_image_dma_buf_import");
		EGL_EXT_multiview_window = ext.contains("EGL_EXT_multiview_window");
		EGL_EXT_output_base = ext.contains("EGL_EXT_output_base") && EGL.checkExtension("EGL_EXT_output_base", EXTOutputBase.isAvailable(this));
		EGL_EXT_output_drm = ext.contains("EGL_EXT_output_drm");
		EGL_EXT_output_openwf = ext.contains("EGL_EXT_output_openwf");
		EGL_EXT_platform_base = ext.contains("EGL_EXT_platform_base") && EGL.checkExtension("EGL_EXT_platform_base", EXTPlatformBase.isAvailable(this));
		EGL_EXT_platform_device = ext.contains("EGL_EXT_platform_device");
		EGL_EXT_platform_wayland = ext.contains("EGL_EXT_platform_wayland");
		EGL_EXT_platform_x11 = ext.contains("EGL_EXT_platform_x11");
		EGL_EXT_protected_surface = ext.contains("EGL_EXT_protected_surface");
		EGL_EXT_stream_consumer_egloutput = ext.contains("EGL_EXT_stream_consumer_egloutput") && EGL.checkExtension("EGL_EXT_stream_consumer_egloutput", EXTStreamConsumerEGLOutput.isAvailable(this));
		EGL_EXT_swap_buffers_with_damage = ext.contains("EGL_EXT_swap_buffers_with_damage") && EGL.checkExtension("EGL_EXT_swap_buffers_with_damage", EXTSwapBuffersWithDamage.isAvailable(this));
		EGL_EXT_yuv_surface = ext.contains("EGL_EXT_yuv_surface");
		EGL_HI_clientpixmap = ext.contains("EGL_HI_clientpixmap") && EGL.checkExtension("EGL_HI_clientpixmap", HIClientpixmap.isAvailable(this));
		EGL_HI_colorformats = ext.contains("EGL_HI_colorformats");
		EGL_IMG_context_priority = ext.contains("EGL_IMG_context_priority");
		EGL_IMG_image_plane_attribs = ext.contains("EGL_IMG_image_plane_attribs");
		EGL_KHR_cl_event2 = ext.contains("EGL_KHR_cl_event2") && EGL.checkExtension("EGL_KHR_cl_event2", KHRCLEvent2.isAvailable(this));
		EGL_KHR_client_get_all_proc_addresses = ext.contains("EGL_KHR_client_get_all_proc_addresses");
		EGL_KHR_config_attribs = ext.contains("EGL_KHR_config_attribs");
		EGL_KHR_create_context = ext.contains("EGL_KHR_create_context");
		EGL_KHR_create_context_no_error = ext.contains("EGL_KHR_create_context_no_error");
		EGL_KHR_debug = ext.contains("EGL_KHR_debug") && EGL.checkExtension("EGL_KHR_debug", KHRDebug.isAvailable(this));
		EGL_KHR_fence_sync = ext.contains("EGL_KHR_fence_sync") && EGL.checkExtension("EGL_KHR_fence_sync", KHRFenceSync.isAvailable(this));
		EGL_KHR_get_all_proc_addresses = ext.contains("EGL_KHR_get_all_proc_addresses");
		EGL_KHR_gl_colorspace = ext.contains("EGL_KHR_gl_colorspace");
		EGL_KHR_gl_renderbuffer_image = ext.contains("EGL_KHR_gl_renderbuffer_image");
		EGL_KHR_gl_texture_2D_image = ext.contains("EGL_KHR_gl_texture_2D_image");
		EGL_KHR_gl_texture_3D_image = ext.contains("EGL_KHR_gl_texture_3D_image");
		EGL_KHR_gl_texture_cubemap_image = ext.contains("EGL_KHR_gl_texture_cubemap_image");
		EGL_KHR_image = ext.contains("EGL_KHR_image") && EGL.checkExtension("EGL_KHR_image", KHRImage.isAvailable(this));
		EGL_KHR_image_base = ext.contains("EGL_KHR_image_base") && EGL.checkExtension("EGL_KHR_image_base", KHRImageBase.isAvailable(this));
		EGL_KHR_image_pixmap = ext.contains("EGL_KHR_image_pixmap");
		EGL_KHR_lock_surface3 = ext.contains("EGL_KHR_lock_surface3") && EGL.checkExtension("EGL_KHR_lock_surface3", KHRLockSurface3.isAvailable(this));
		EGL_KHR_mutable_render_buffer = ext.contains("EGL_KHR_mutable_render_buffer");
		EGL_KHR_partial_update = ext.contains("EGL_KHR_partial_update") && EGL.checkExtension("EGL_KHR_partial_update", KHRPartialUpdate.isAvailable(this));
		EGL_KHR_platform_android = ext.contains("EGL_KHR_platform_android");
		EGL_KHR_platform_gbm = ext.contains("EGL_KHR_platform_gbm");
		EGL_KHR_platform_wayland = ext.contains("EGL_KHR_platform_wayland");
		EGL_KHR_platform_x11 = ext.contains("EGL_KHR_platform_x11");
		EGL_KHR_reusable_sync = ext.contains("EGL_KHR_reusable_sync") && EGL.checkExtension("EGL_KHR_reusable_sync", KHRReusableSync.isAvailable(this));
		EGL_KHR_stream = ext.contains("EGL_KHR_stream") && EGL.checkExtension("EGL_KHR_stream", KHRStream.isAvailable(this));
		EGL_KHR_stream_consumer_gltexture = ext.contains("EGL_KHR_stream_consumer_gltexture") && EGL.checkExtension("EGL_KHR_stream_consumer_gltexture", KHRStreamConsumerGLTexture.isAvailable(this));
		EGL_KHR_stream_cross_process_fd = ext.contains("EGL_KHR_stream_cross_process_fd") && EGL.checkExtension("EGL_KHR_stream_cross_process_fd", KHRStreamCrossProcessFD.isAvailable(this));
		EGL_KHR_stream_fifo = ext.contains("EGL_KHR_stream_fifo") && EGL.checkExtension("EGL_KHR_stream_fifo", KHRStreamFIFO.isAvailable(this));
		EGL_KHR_stream_producer_aldatalocator = ext.contains("EGL_KHR_stream_producer_aldatalocator");
		EGL_KHR_stream_producer_eglsurface = ext.contains("EGL_KHR_stream_producer_eglsurface") && EGL.checkExtension("EGL_KHR_stream_producer_eglsurface", KHRStreamProducerEGLSurface.isAvailable(this));
		EGL_KHR_surfaceless_context = ext.contains("EGL_KHR_surfaceless_context");
		EGL_KHR_swap_buffers_with_damage = ext.contains("EGL_KHR_swap_buffers_with_damage") && EGL.checkExtension("EGL_KHR_swap_buffers_with_damage", KHRSwapBuffersWithDamage.isAvailable(this));
		EGL_KHR_vg_parent_image = ext.contains("EGL_KHR_vg_parent_image");
		EGL_KHR_wait_sync = ext.contains("EGL_KHR_wait_sync") && EGL.checkExtension("EGL_KHR_wait_sync", KHRWaitSync.isAvailable(this));
		EGL_MESA_drm_image = ext.contains("EGL_MESA_drm_image") && EGL.checkExtension("EGL_MESA_drm_image", MESADRMImage.isAvailable(this));
		EGL_MESA_image_dma_buf_export = ext.contains("EGL_MESA_image_dma_buf_export") && EGL.checkExtension("EGL_MESA_image_dma_buf_export", MESAImageDMABufExport.isAvailable(this));
		EGL_MESA_platform_gbm = ext.contains("EGL_MESA_platform_gbm");
		EGL_NOK_swap_region2 = ext.contains("EGL_NOK_swap_region2") && EGL.checkExtension("EGL_NOK_swap_region2", NOKSwapRegion2.isAvailable(this));
		EGL_NOK_texture_from_pixmap = ext.contains("EGL_NOK_texture_from_pixmap");
		EGL_NV_3dvision_surface = ext.contains("EGL_NV_3dvision_surface");
		EGL_NV_coverage_sample = ext.contains("EGL_NV_coverage_sample");
		EGL_NV_coverage_sample_resolve = ext.contains("EGL_NV_coverage_sample_resolve");
		EGL_NV_cuda_event = ext.contains("EGL_NV_cuda_event");
		EGL_NV_depth_nonlinear = ext.contains("EGL_NV_depth_nonlinear");
		EGL_NV_device_cuda = ext.contains("EGL_NV_device_cuda");
		EGL_NV_native_query = ext.contains("EGL_NV_native_query") && EGL.checkExtension("EGL_NV_native_query", NVNativeQuery.isAvailable(this));
		EGL_NV_post_convert_rounding = ext.contains("EGL_NV_post_convert_rounding");
		EGL_NV_post_sub_buffer = ext.contains("EGL_NV_post_sub_buffer") && EGL.checkExtension("EGL_NV_post_sub_buffer", NVPostSubBuffer.isAvailable(this));
		EGL_NV_robustness_video_memory_purge = ext.contains("EGL_NV_robustness_video_memory_purge");
		EGL_NV_stream_consumer_gltexture_yuv = ext.contains("EGL_NV_stream_consumer_gltexture_yuv") && EGL.checkExtension("EGL_NV_stream_consumer_gltexture_yuv", NVStreamConsumerGLTextureYUV.isAvailable(this));
		EGL_NV_stream_metadata = ext.contains("EGL_NV_stream_metadata") && EGL.checkExtension("EGL_NV_stream_metadata", NVStreamMetadata.isAvailable(this));
		EGL_NV_stream_sync = ext.contains("EGL_NV_stream_sync") && EGL.checkExtension("EGL_NV_stream_sync", NVStreamSync.isAvailable(this));
		EGL_NV_sync = ext.contains("EGL_NV_sync") && EGL.checkExtension("EGL_NV_sync", NVSync.isAvailable(this));
		EGL_NV_system_time = ext.contains("EGL_NV_system_time") && EGL.checkExtension("EGL_NV_system_time", NVSystemTime.isAvailable(this));
		EGL_TIZEN_image_native_buffer = ext.contains("EGL_TIZEN_image_native_buffer");
		EGL_TIZEN_image_native_surface = ext.contains("EGL_TIZEN_image_native_surface");
	}

}