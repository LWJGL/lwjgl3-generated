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

	final EGL10                       __EGL10;
	final EGL11                       __EGL11;
	final EGL12                       __EGL12;
	final EGL14                       __EGL14;
	final EGL15                       __EGL15;
	final ANDROIDBlobCache            __ANDROIDBlobCache;
	final ANDROIDNativeFenceSync      __ANDROIDNativeFenceSync;
	final ANGLEQuerySurfacePointer    __ANGLEQuerySurfacePointer;
	final EXTDeviceBase               __EXTDeviceBase;
	final EXTDeviceEnumeration        __EXTDeviceEnumeration;
	final EXTDeviceQuery              __EXTDeviceQuery;
	final EXTOutputBase               __EXTOutputBase;
	final EXTPlatformBase             __EXTPlatformBase;
	final EXTStreamConsumerEGLOutput  __EXTStreamConsumerEGLOutput;
	final EXTSwapBuffersWithDamage    __EXTSwapBuffersWithDamage;
	final HIClientpixmap              __HIClientpixmap;
	final KHRCLEvent2                 __KHRCLEvent2;
	final KHRFenceSync                __KHRFenceSync;
	final KHRImage                    __KHRImage;
	final KHRImageBase                __KHRImageBase;
	final KHRLockSurface3             __KHRLockSurface3;
	final KHRPartialUpdate            __KHRPartialUpdate;
	final KHRReusableSync             __KHRReusableSync;
	final KHRStream                   __KHRStream;
	final KHRStreamConsumerGLTexture  __KHRStreamConsumerGLTexture;
	final KHRStreamCrossProcessFD     __KHRStreamCrossProcessFD;
	final KHRStreamFIFO               __KHRStreamFIFO;
	final KHRStreamProducerEGLSurface __KHRStreamProducerEGLSurface;
	final KHRSwapBuffersWithDamage    __KHRSwapBuffersWithDamage;
	final KHRWaitSync                 __KHRWaitSync;
	final MESADRMImage                __MESADRMImage;
	final MESAImageDMABufExport       __MESAImageDMABufExport;
	final NOKSwapRegion2              __NOKSwapRegion2;
	final NVNativeQuery               __NVNativeQuery;
	final NVPostSubBuffer             __NVPostSubBuffer;
	final NVStreamSync                __NVStreamSync;
	final NVSync                      __NVSync;
	final NVSystemTime                __NVSystemTime;

	/** The EGL major version. */
	public final int majorVersion;

	/** The EGL minor version. */
	public final int minorVersion;

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
	 * Dependencies section. For client extensions, this suggestion is a requirement.
	 * <pre><code style="font-family: monospace">
	 *         Extension Type
	 * 
	 *             &lt;Either "EGL display extension" or "EGL client extension" or
	 *              a future extension type.&gt;</code></pre></p>
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

	/**
	 * Creates an EGLCapabilities instance for the EGL client.
	 *
	 * <p>The function instances created here will be reused by EGLCapabilities instances for EGLDisplays.</p>
	 *
	 * <p>Querying EGL client library extensions depends on EGL 1.5 or the {@link #EGL_EXT_client_extensions} extension. If neither is supported, all flags
	 * will be false and the version fields zero.</p>
	 *
	 * @param majorVersion the EGL client major version
	 * @param minorVersion the EGL client minor version
	 * @param ext          the available EGL client extensions
	 * @param provider     the EGL client function provider
	 */
	EGLCapabilities(int majorVersion, int minorVersion, Set<String> ext, FunctionProvider provider) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;

		__EGL10 = new org.lwjgl.egl.EGL10(provider);
		__EGL11 = new org.lwjgl.egl.EGL11(provider);
		__EGL12 = new org.lwjgl.egl.EGL12(provider);
		__EGL14 = new org.lwjgl.egl.EGL14(provider);
		__EGL15 = new org.lwjgl.egl.EGL15(provider);
		__ANDROIDBlobCache = new ANDROIDBlobCache(provider);
		__ANDROIDNativeFenceSync = new ANDROIDNativeFenceSync(provider);
		__ANGLEQuerySurfacePointer = new ANGLEQuerySurfacePointer(provider);
		__EXTDeviceBase = new EXTDeviceBase(provider);
		__EXTDeviceEnumeration = new EXTDeviceEnumeration(provider);
		__EXTDeviceQuery = new EXTDeviceQuery(provider);
		__EXTOutputBase = new EXTOutputBase(provider);
		__EXTPlatformBase = new EXTPlatformBase(provider);
		__EXTStreamConsumerEGLOutput = new EXTStreamConsumerEGLOutput(provider);
		__EXTSwapBuffersWithDamage = new EXTSwapBuffersWithDamage(provider);
		__HIClientpixmap = new HIClientpixmap(provider);
		__KHRCLEvent2 = new KHRCLEvent2(provider);
		__KHRFenceSync = new KHRFenceSync(provider);
		__KHRImage = new KHRImage(provider);
		__KHRImageBase = new KHRImageBase(provider);
		__KHRLockSurface3 = new KHRLockSurface3(provider);
		__KHRPartialUpdate = new KHRPartialUpdate(provider);
		__KHRReusableSync = new KHRReusableSync(provider);
		__KHRStream = new KHRStream(provider);
		__KHRStreamConsumerGLTexture = new KHRStreamConsumerGLTexture(provider);
		__KHRStreamCrossProcessFD = new KHRStreamCrossProcessFD(provider);
		__KHRStreamFIFO = new KHRStreamFIFO(provider);
		__KHRStreamProducerEGLSurface = new KHRStreamProducerEGLSurface(provider);
		__KHRSwapBuffersWithDamage = new KHRSwapBuffersWithDamage(provider);
		__KHRWaitSync = new KHRWaitSync(provider);
		__MESADRMImage = new MESADRMImage(provider);
		__MESAImageDMABufExport = new MESAImageDMABufExport(provider);
		__NOKSwapRegion2 = new NOKSwapRegion2(provider);
		__NVNativeQuery = new NVNativeQuery(provider);
		__NVPostSubBuffer = new NVPostSubBuffer(provider);
		__NVStreamSync = new NVStreamSync(provider);
		__NVSync = new NVSync(provider);
		__NVSystemTime = new NVSystemTime(provider);

		EGL10 = EGL.checkCapability(ext, "EGL10", __EGL10) != null;
		EGL11 = EGL.checkCapability(ext, "EGL11", __EGL11) != null;
		EGL12 = EGL.checkCapability(ext, "EGL12", __EGL12) != null;
		EGL13 = ext.contains("EGL13");
		EGL14 = EGL.checkCapability(ext, "EGL14", __EGL14) != null;
		EGL15 = EGL.checkCapability(ext, "EGL15", __EGL15) != null;
		EGL_ANDROID_blob_cache = EGL.checkCapability(ext, "EGL_ANDROID_blob_cache", __ANDROIDBlobCache) != null;
		EGL_ANDROID_framebuffer_target = ext.contains("EGL_ANDROID_framebuffer_target");
		EGL_ANDROID_image_native_buffer = ext.contains("EGL_ANDROID_image_native_buffer");
		EGL_ANDROID_native_fence_sync = EGL.checkCapability(ext, "EGL_ANDROID_native_fence_sync", __ANDROIDNativeFenceSync) != null;
		EGL_ANDROID_recordable = ext.contains("EGL_ANDROID_recordable");
		EGL_ANGLE_d3d_share_handle_client_buffer = ext.contains("EGL_ANGLE_d3d_share_handle_client_buffer");
		EGL_ANGLE_device_d3d = ext.contains("EGL_ANGLE_device_d3d");
		EGL_ANGLE_query_surface_pointer = EGL.checkCapability(ext, "EGL_ANGLE_query_surface_pointer", __ANGLEQuerySurfacePointer) != null;
		EGL_ANGLE_surface_d3d_texture_2d_share_handle = ext.contains("EGL_ANGLE_surface_d3d_texture_2d_share_handle");
		EGL_ANGLE_window_fixed_size = ext.contains("EGL_ANGLE_window_fixed_size");
		EGL_ARM_pixmap_multisample_discard = ext.contains("EGL_ARM_pixmap_multisample_discard");
		EGL_EXT_buffer_age = ext.contains("EGL_EXT_buffer_age");
		EGL_EXT_client_extensions = ext.contains("EGL_EXT_client_extensions");
		EGL_EXT_create_context_robustness = ext.contains("EGL_EXT_create_context_robustness");
		EGL_EXT_device_base = EGL.checkCapability(ext, "EGL_EXT_device_base", __EXTDeviceBase) != null;
		EGL_EXT_device_drm = ext.contains("EGL_EXT_device_drm");
		EGL_EXT_device_enumeration = EGL.checkCapability(ext, "EGL_EXT_device_enumeration", __EXTDeviceEnumeration) != null;
		EGL_EXT_device_openwf = ext.contains("EGL_EXT_device_openwf");
		EGL_EXT_device_query = EGL.checkCapability(ext, "EGL_EXT_device_query", __EXTDeviceQuery) != null;
		EGL_EXT_image_dma_buf_import = ext.contains("EGL_EXT_image_dma_buf_import");
		EGL_EXT_multiview_window = ext.contains("EGL_EXT_multiview_window");
		EGL_EXT_output_base = EGL.checkCapability(ext, "EGL_EXT_output_base", __EXTOutputBase) != null;
		EGL_EXT_output_drm = ext.contains("EGL_EXT_output_drm");
		EGL_EXT_output_openwf = ext.contains("EGL_EXT_output_openwf");
		EGL_EXT_platform_base = EGL.checkCapability(ext, "EGL_EXT_platform_base", __EXTPlatformBase) != null;
		EGL_EXT_platform_device = ext.contains("EGL_EXT_platform_device");
		EGL_EXT_platform_wayland = ext.contains("EGL_EXT_platform_wayland");
		EGL_EXT_platform_x11 = ext.contains("EGL_EXT_platform_x11");
		EGL_EXT_protected_surface = ext.contains("EGL_EXT_protected_surface");
		EGL_EXT_stream_consumer_egloutput = EGL.checkCapability(ext, "EGL_EXT_stream_consumer_egloutput", __EXTStreamConsumerEGLOutput) != null;
		EGL_EXT_swap_buffers_with_damage = EGL.checkCapability(ext, "EGL_EXT_swap_buffers_with_damage", __EXTSwapBuffersWithDamage) != null;
		EGL_EXT_yuv_surface = ext.contains("EGL_EXT_yuv_surface");
		EGL_HI_clientpixmap = EGL.checkCapability(ext, "EGL_HI_clientpixmap", __HIClientpixmap) != null;
		EGL_HI_colorformats = ext.contains("EGL_HI_colorformats");
		EGL_IMG_context_priority = ext.contains("EGL_IMG_context_priority");
		EGL_KHR_cl_event2 = EGL.checkCapability(ext, "EGL_KHR_cl_event2", __KHRCLEvent2) != null;
		EGL_KHR_client_get_all_proc_addresses = ext.contains("EGL_KHR_client_get_all_proc_addresses");
		EGL_KHR_config_attribs = ext.contains("EGL_KHR_config_attribs");
		EGL_KHR_create_context = ext.contains("EGL_KHR_create_context");
		EGL_KHR_create_context_no_error = ext.contains("EGL_KHR_create_context_no_error");
		EGL_KHR_fence_sync = EGL.checkCapability(ext, "EGL_KHR_fence_sync", __KHRFenceSync) != null;
		EGL_KHR_get_all_proc_addresses = ext.contains("EGL_KHR_get_all_proc_addresses");
		EGL_KHR_gl_colorspace = ext.contains("EGL_KHR_gl_colorspace");
		EGL_KHR_gl_renderbuffer_image = ext.contains("EGL_KHR_gl_renderbuffer_image");
		EGL_KHR_gl_texture_2D_image = ext.contains("EGL_KHR_gl_texture_2D_image");
		EGL_KHR_gl_texture_3D_image = ext.contains("EGL_KHR_gl_texture_3D_image");
		EGL_KHR_gl_texture_cubemap_image = ext.contains("EGL_KHR_gl_texture_cubemap_image");
		EGL_KHR_image = EGL.checkCapability(ext, "EGL_KHR_image", __KHRImage) != null;
		EGL_KHR_image_base = EGL.checkCapability(ext, "EGL_KHR_image_base", __KHRImageBase) != null;
		EGL_KHR_image_pixmap = ext.contains("EGL_KHR_image_pixmap");
		EGL_KHR_lock_surface3 = EGL.checkCapability(ext, "EGL_KHR_lock_surface3", __KHRLockSurface3) != null;
		EGL_KHR_partial_update = EGL.checkCapability(ext, "EGL_KHR_partial_update", __KHRPartialUpdate) != null;
		EGL_KHR_platform_android = ext.contains("EGL_KHR_platform_android");
		EGL_KHR_platform_gbm = ext.contains("EGL_KHR_platform_gbm");
		EGL_KHR_platform_wayland = ext.contains("EGL_KHR_platform_wayland");
		EGL_KHR_platform_x11 = ext.contains("EGL_KHR_platform_x11");
		EGL_KHR_reusable_sync = EGL.checkCapability(ext, "EGL_KHR_reusable_sync", __KHRReusableSync) != null;
		EGL_KHR_stream = EGL.checkCapability(ext, "EGL_KHR_stream", __KHRStream) != null;
		EGL_KHR_stream_consumer_gltexture = EGL.checkCapability(ext, "EGL_KHR_stream_consumer_gltexture", __KHRStreamConsumerGLTexture) != null;
		EGL_KHR_stream_cross_process_fd = EGL.checkCapability(ext, "EGL_KHR_stream_cross_process_fd", __KHRStreamCrossProcessFD) != null;
		EGL_KHR_stream_fifo = EGL.checkCapability(ext, "EGL_KHR_stream_fifo", __KHRStreamFIFO) != null;
		EGL_KHR_stream_producer_aldatalocator = ext.contains("EGL_KHR_stream_producer_aldatalocator");
		EGL_KHR_stream_producer_eglsurface = EGL.checkCapability(ext, "EGL_KHR_stream_producer_eglsurface", __KHRStreamProducerEGLSurface) != null;
		EGL_KHR_surfaceless_context = ext.contains("EGL_KHR_surfaceless_context");
		EGL_KHR_swap_buffers_with_damage = EGL.checkCapability(ext, "EGL_KHR_swap_buffers_with_damage", __KHRSwapBuffersWithDamage) != null;
		EGL_KHR_vg_parent_image = ext.contains("EGL_KHR_vg_parent_image");
		EGL_KHR_wait_sync = EGL.checkCapability(ext, "EGL_KHR_wait_sync", __KHRWaitSync) != null;
		EGL_MESA_drm_image = EGL.checkCapability(ext, "EGL_MESA_drm_image", __MESADRMImage) != null;
		EGL_MESA_image_dma_buf_export = EGL.checkCapability(ext, "EGL_MESA_image_dma_buf_export", __MESAImageDMABufExport) != null;
		EGL_MESA_platform_gbm = ext.contains("EGL_MESA_platform_gbm");
		EGL_NOK_swap_region2 = EGL.checkCapability(ext, "EGL_NOK_swap_region2", __NOKSwapRegion2) != null;
		EGL_NOK_texture_from_pixmap = ext.contains("EGL_NOK_texture_from_pixmap");
		EGL_NV_3dvision_surface = ext.contains("EGL_NV_3dvision_surface");
		EGL_NV_coverage_sample = ext.contains("EGL_NV_coverage_sample");
		EGL_NV_coverage_sample_resolve = ext.contains("EGL_NV_coverage_sample_resolve");
		EGL_NV_cuda_event = ext.contains("EGL_NV_cuda_event");
		EGL_NV_depth_nonlinear = ext.contains("EGL_NV_depth_nonlinear");
		EGL_NV_device_cuda = ext.contains("EGL_NV_device_cuda");
		EGL_NV_native_query = EGL.checkCapability(ext, "EGL_NV_native_query", __NVNativeQuery) != null;
		EGL_NV_post_convert_rounding = ext.contains("EGL_NV_post_convert_rounding");
		EGL_NV_post_sub_buffer = EGL.checkCapability(ext, "EGL_NV_post_sub_buffer", __NVPostSubBuffer) != null;
		EGL_NV_stream_sync = EGL.checkCapability(ext, "EGL_NV_stream_sync", __NVStreamSync) != null;
		EGL_NV_sync = EGL.checkCapability(ext, "EGL_NV_sync", __NVSync) != null;
		EGL_NV_system_time = EGL.checkCapability(ext, "EGL_NV_system_time", __NVSystemTime) != null;
		EGL_TIZEN_image_native_buffer = ext.contains("EGL_TIZEN_image_native_buffer");
		EGL_TIZEN_image_native_surface = ext.contains("EGL_TIZEN_image_native_surface");
	}

	/**
	 * Creates an EGLCapabilities instance for an EGLDisplay.
	 *
	 * @param majorVersion the EGL major version
	 * @param minorVersion the EGL minor version
	 * @param ext          the extensions string
	 * @param caps         an EGL client capabilities instance
	 */
	EGLCapabilities(int majorVersion, int minorVersion, Set<String> ext, EGLCapabilities caps) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;

		EGL10 = (__EGL10 = EGL.checkCapability(ext, "EGL10", caps.__EGL10)) != null;
		EGL11 = (__EGL11 = EGL.checkCapability(ext, "EGL11", caps.__EGL11)) != null;
		EGL12 = (__EGL12 = EGL.checkCapability(ext, "EGL12", caps.__EGL12)) != null;
		EGL13 = ext.contains("EGL13");
		EGL14 = (__EGL14 = EGL.checkCapability(ext, "EGL14", caps.__EGL14)) != null;
		EGL15 = (__EGL15 = EGL.checkCapability(ext, "EGL15", caps.__EGL15)) != null;
		EGL_ANDROID_blob_cache = (__ANDROIDBlobCache = EGL.checkCapability(ext, "EGL_ANDROID_blob_cache", caps.__ANDROIDBlobCache)) != null;
		EGL_ANDROID_framebuffer_target = ext.contains("EGL_ANDROID_framebuffer_target");
		EGL_ANDROID_image_native_buffer = ext.contains("EGL_ANDROID_image_native_buffer");
		EGL_ANDROID_native_fence_sync = (__ANDROIDNativeFenceSync = EGL.checkCapability(ext, "EGL_ANDROID_native_fence_sync", caps.__ANDROIDNativeFenceSync)) != null;
		EGL_ANDROID_recordable = ext.contains("EGL_ANDROID_recordable");
		EGL_ANGLE_d3d_share_handle_client_buffer = ext.contains("EGL_ANGLE_d3d_share_handle_client_buffer");
		EGL_ANGLE_device_d3d = ext.contains("EGL_ANGLE_device_d3d");
		EGL_ANGLE_query_surface_pointer = (__ANGLEQuerySurfacePointer = EGL.checkCapability(ext, "EGL_ANGLE_query_surface_pointer", caps.__ANGLEQuerySurfacePointer)) != null;
		EGL_ANGLE_surface_d3d_texture_2d_share_handle = ext.contains("EGL_ANGLE_surface_d3d_texture_2d_share_handle");
		EGL_ANGLE_window_fixed_size = ext.contains("EGL_ANGLE_window_fixed_size");
		EGL_ARM_pixmap_multisample_discard = ext.contains("EGL_ARM_pixmap_multisample_discard");
		EGL_EXT_buffer_age = ext.contains("EGL_EXT_buffer_age");
		EGL_EXT_client_extensions = ext.contains("EGL_EXT_client_extensions");
		EGL_EXT_create_context_robustness = ext.contains("EGL_EXT_create_context_robustness");
		EGL_EXT_device_base = (__EXTDeviceBase = EGL.checkCapability(ext, "EGL_EXT_device_base", caps.__EXTDeviceBase)) != null;
		EGL_EXT_device_drm = ext.contains("EGL_EXT_device_drm");
		EGL_EXT_device_enumeration = (__EXTDeviceEnumeration = EGL.checkCapability(ext, "EGL_EXT_device_enumeration", caps.__EXTDeviceEnumeration)) != null;
		EGL_EXT_device_openwf = ext.contains("EGL_EXT_device_openwf");
		EGL_EXT_device_query = (__EXTDeviceQuery = EGL.checkCapability(ext, "EGL_EXT_device_query", caps.__EXTDeviceQuery)) != null;
		EGL_EXT_image_dma_buf_import = ext.contains("EGL_EXT_image_dma_buf_import");
		EGL_EXT_multiview_window = ext.contains("EGL_EXT_multiview_window");
		EGL_EXT_output_base = (__EXTOutputBase = EGL.checkCapability(ext, "EGL_EXT_output_base", caps.__EXTOutputBase)) != null;
		EGL_EXT_output_drm = ext.contains("EGL_EXT_output_drm");
		EGL_EXT_output_openwf = ext.contains("EGL_EXT_output_openwf");
		EGL_EXT_platform_base = (__EXTPlatformBase = EGL.checkCapability(ext, "EGL_EXT_platform_base", caps.__EXTPlatformBase)) != null;
		EGL_EXT_platform_device = ext.contains("EGL_EXT_platform_device");
		EGL_EXT_platform_wayland = ext.contains("EGL_EXT_platform_wayland");
		EGL_EXT_platform_x11 = ext.contains("EGL_EXT_platform_x11");
		EGL_EXT_protected_surface = ext.contains("EGL_EXT_protected_surface");
		EGL_EXT_stream_consumer_egloutput = (__EXTStreamConsumerEGLOutput = EGL.checkCapability(ext, "EGL_EXT_stream_consumer_egloutput", caps.__EXTStreamConsumerEGLOutput)) != null;
		EGL_EXT_swap_buffers_with_damage = (__EXTSwapBuffersWithDamage = EGL.checkCapability(ext, "EGL_EXT_swap_buffers_with_damage", caps.__EXTSwapBuffersWithDamage)) != null;
		EGL_EXT_yuv_surface = ext.contains("EGL_EXT_yuv_surface");
		EGL_HI_clientpixmap = (__HIClientpixmap = EGL.checkCapability(ext, "EGL_HI_clientpixmap", caps.__HIClientpixmap)) != null;
		EGL_HI_colorformats = ext.contains("EGL_HI_colorformats");
		EGL_IMG_context_priority = ext.contains("EGL_IMG_context_priority");
		EGL_KHR_cl_event2 = (__KHRCLEvent2 = EGL.checkCapability(ext, "EGL_KHR_cl_event2", caps.__KHRCLEvent2)) != null;
		EGL_KHR_client_get_all_proc_addresses = ext.contains("EGL_KHR_client_get_all_proc_addresses");
		EGL_KHR_config_attribs = ext.contains("EGL_KHR_config_attribs");
		EGL_KHR_create_context = ext.contains("EGL_KHR_create_context");
		EGL_KHR_create_context_no_error = ext.contains("EGL_KHR_create_context_no_error");
		EGL_KHR_fence_sync = (__KHRFenceSync = EGL.checkCapability(ext, "EGL_KHR_fence_sync", caps.__KHRFenceSync)) != null;
		EGL_KHR_get_all_proc_addresses = ext.contains("EGL_KHR_get_all_proc_addresses");
		EGL_KHR_gl_colorspace = ext.contains("EGL_KHR_gl_colorspace");
		EGL_KHR_gl_renderbuffer_image = ext.contains("EGL_KHR_gl_renderbuffer_image");
		EGL_KHR_gl_texture_2D_image = ext.contains("EGL_KHR_gl_texture_2D_image");
		EGL_KHR_gl_texture_3D_image = ext.contains("EGL_KHR_gl_texture_3D_image");
		EGL_KHR_gl_texture_cubemap_image = ext.contains("EGL_KHR_gl_texture_cubemap_image");
		EGL_KHR_image = (__KHRImage = EGL.checkCapability(ext, "EGL_KHR_image", caps.__KHRImage)) != null;
		EGL_KHR_image_base = (__KHRImageBase = EGL.checkCapability(ext, "EGL_KHR_image_base", caps.__KHRImageBase)) != null;
		EGL_KHR_image_pixmap = ext.contains("EGL_KHR_image_pixmap");
		EGL_KHR_lock_surface3 = (__KHRLockSurface3 = EGL.checkCapability(ext, "EGL_KHR_lock_surface3", caps.__KHRLockSurface3)) != null;
		EGL_KHR_partial_update = (__KHRPartialUpdate = EGL.checkCapability(ext, "EGL_KHR_partial_update", caps.__KHRPartialUpdate)) != null;
		EGL_KHR_platform_android = ext.contains("EGL_KHR_platform_android");
		EGL_KHR_platform_gbm = ext.contains("EGL_KHR_platform_gbm");
		EGL_KHR_platform_wayland = ext.contains("EGL_KHR_platform_wayland");
		EGL_KHR_platform_x11 = ext.contains("EGL_KHR_platform_x11");
		EGL_KHR_reusable_sync = (__KHRReusableSync = EGL.checkCapability(ext, "EGL_KHR_reusable_sync", caps.__KHRReusableSync)) != null;
		EGL_KHR_stream = (__KHRStream = EGL.checkCapability(ext, "EGL_KHR_stream", caps.__KHRStream)) != null;
		EGL_KHR_stream_consumer_gltexture = (__KHRStreamConsumerGLTexture = EGL.checkCapability(ext, "EGL_KHR_stream_consumer_gltexture", caps.__KHRStreamConsumerGLTexture)) != null;
		EGL_KHR_stream_cross_process_fd = (__KHRStreamCrossProcessFD = EGL.checkCapability(ext, "EGL_KHR_stream_cross_process_fd", caps.__KHRStreamCrossProcessFD)) != null;
		EGL_KHR_stream_fifo = (__KHRStreamFIFO = EGL.checkCapability(ext, "EGL_KHR_stream_fifo", caps.__KHRStreamFIFO)) != null;
		EGL_KHR_stream_producer_aldatalocator = ext.contains("EGL_KHR_stream_producer_aldatalocator");
		EGL_KHR_stream_producer_eglsurface = (__KHRStreamProducerEGLSurface = EGL.checkCapability(ext, "EGL_KHR_stream_producer_eglsurface", caps.__KHRStreamProducerEGLSurface)) != null;
		EGL_KHR_surfaceless_context = ext.contains("EGL_KHR_surfaceless_context");
		EGL_KHR_swap_buffers_with_damage = (__KHRSwapBuffersWithDamage = EGL.checkCapability(ext, "EGL_KHR_swap_buffers_with_damage", caps.__KHRSwapBuffersWithDamage)) != null;
		EGL_KHR_vg_parent_image = ext.contains("EGL_KHR_vg_parent_image");
		EGL_KHR_wait_sync = (__KHRWaitSync = EGL.checkCapability(ext, "EGL_KHR_wait_sync", caps.__KHRWaitSync)) != null;
		EGL_MESA_drm_image = (__MESADRMImage = EGL.checkCapability(ext, "EGL_MESA_drm_image", caps.__MESADRMImage)) != null;
		EGL_MESA_image_dma_buf_export = (__MESAImageDMABufExport = EGL.checkCapability(ext, "EGL_MESA_image_dma_buf_export", caps.__MESAImageDMABufExport)) != null;
		EGL_MESA_platform_gbm = ext.contains("EGL_MESA_platform_gbm");
		EGL_NOK_swap_region2 = (__NOKSwapRegion2 = EGL.checkCapability(ext, "EGL_NOK_swap_region2", caps.__NOKSwapRegion2)) != null;
		EGL_NOK_texture_from_pixmap = ext.contains("EGL_NOK_texture_from_pixmap");
		EGL_NV_3dvision_surface = ext.contains("EGL_NV_3dvision_surface");
		EGL_NV_coverage_sample = ext.contains("EGL_NV_coverage_sample");
		EGL_NV_coverage_sample_resolve = ext.contains("EGL_NV_coverage_sample_resolve");
		EGL_NV_cuda_event = ext.contains("EGL_NV_cuda_event");
		EGL_NV_depth_nonlinear = ext.contains("EGL_NV_depth_nonlinear");
		EGL_NV_device_cuda = ext.contains("EGL_NV_device_cuda");
		EGL_NV_native_query = (__NVNativeQuery = EGL.checkCapability(ext, "EGL_NV_native_query", caps.__NVNativeQuery)) != null;
		EGL_NV_post_convert_rounding = ext.contains("EGL_NV_post_convert_rounding");
		EGL_NV_post_sub_buffer = (__NVPostSubBuffer = EGL.checkCapability(ext, "EGL_NV_post_sub_buffer", caps.__NVPostSubBuffer)) != null;
		EGL_NV_stream_sync = (__NVStreamSync = EGL.checkCapability(ext, "EGL_NV_stream_sync", caps.__NVStreamSync)) != null;
		EGL_NV_sync = (__NVSync = EGL.checkCapability(ext, "EGL_NV_sync", caps.__NVSync)) != null;
		EGL_NV_system_time = (__NVSystemTime = EGL.checkCapability(ext, "EGL_NV_system_time", caps.__NVSystemTime)) != null;
		EGL_TIZEN_image_native_buffer = ext.contains("EGL_TIZEN_image_native_buffer");
		EGL_TIZEN_image_native_surface = ext.contains("EGL_TIZEN_image_native_surface");
	}

}