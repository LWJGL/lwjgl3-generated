/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/MESA/EGL_MESA_drm_image.txt">MESA_drm_image</a> extension.
 * 
 * <p>This extension provides entry points for integrating EGLImage with the Linux DRM mode setting and memory management drivers. The extension lets
 * applications create EGLImages without a client API resource and lets the application get the DRM buffer handles.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1} and {@link KHRImageBase KHR_image_base}.</p>
 */
public final class MESADRMImage {

	/**  */
	public static final int
		EGL_DRM_BUFFER_FORMAT_MESA        = 0x31D0,
		EGL_DRM_BUFFER_USE_MESA           = 0x31D1,
		EGL_DRM_BUFFER_FORMAT_ARGB32_MESA = 0x31D2,
		EGL_DRM_BUFFER_MESA               = 0x31D3,
		EGL_DRM_BUFFER_STRIDE_MESA        = 0x31D4,
		EGL_DRM_BUFFER_USE_SCANOUT_MESA   = 0x1,
		EGL_DRM_BUFFER_USE_SHARE_MESA     = 0x2;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateDRMImageMESA,
		ExportDRMImageMESA;

	@JavadocExclude
	public MESADRMImage(FunctionProvider provider) {
		CreateDRMImageMESA = provider.getFunctionAddress("eglCreateDRMImageMESA");
		ExportDRMImageMESA = provider.getFunctionAddress("eglExportDRMImageMESA");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link MESADRMImage} instance. */
	public static MESADRMImage getInstance() {
		return checkFunctionality(EGL.getCapabilities().__MESADRMImage);
	}

	// --- [ eglCreateDRMImageMESA ] ---

	/** Unsafe version of {@link #eglCreateDRMImageMESA CreateDRMImageMESA} */
	@JavadocExclude
	public static long neglCreateDRMImageMESA(long dpy, long attrib_list) {
		long __functionAddress = getInstance().CreateDRMImageMESA;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dpy);
		return callPPP(__functionAddress, dpy, attrib_list);
	}

	public static long eglCreateDRMImageMESA(long dpy, ByteBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT4(attrib_list, EGL10.EGL_NONE);
		return neglCreateDRMImageMESA(dpy, memAddressSafe(attrib_list));
	}

	/** Alternative version of: {@link #eglCreateDRMImageMESA CreateDRMImageMESA} */
	public static long eglCreateDRMImageMESA(long dpy, IntBuffer attrib_list) {
		if ( LWJGLUtil.CHECKS )
			if ( attrib_list != null ) checkNT(attrib_list, EGL10.EGL_NONE);
		return neglCreateDRMImageMESA(dpy, memAddressSafe(attrib_list));
	}

	// --- [ eglExportDRMImageMESA ] ---

	/** Unsafe version of {@link #eglExportDRMImageMESA ExportDRMImageMESA} */
	@JavadocExclude
	public static boolean neglExportDRMImageMESA(long dpy, long image, long name, long handle, long stride) {
		long __functionAddress = getInstance().ExportDRMImageMESA;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(dpy);
			checkPointer(image);
		}
		return callPPPPPZ(__functionAddress, dpy, image, name, handle, stride);
	}

	public static boolean eglExportDRMImageMESA(long dpy, long image, ByteBuffer name, ByteBuffer handle, ByteBuffer stride) {
		if ( LWJGLUtil.CHECKS ) {
			if ( name != null ) checkBuffer(name, 1 << 2);
			if ( handle != null ) checkBuffer(handle, 1 << 2);
			if ( stride != null ) checkBuffer(stride, 1 << 2);
		}
		return neglExportDRMImageMESA(dpy, image, memAddressSafe(name), memAddressSafe(handle), memAddressSafe(stride));
	}

	/** Alternative version of: {@link #eglExportDRMImageMESA ExportDRMImageMESA} */
	public static boolean eglExportDRMImageMESA(long dpy, long image, IntBuffer name, IntBuffer handle, IntBuffer stride) {
		if ( LWJGLUtil.CHECKS ) {
			if ( name != null ) checkBuffer(name, 1);
			if ( handle != null ) checkBuffer(handle, 1);
			if ( stride != null ) checkBuffer(stride, 1);
		}
		return neglExportDRMImageMESA(dpy, image, memAddressSafe(name), memAddressSafe(handle), memAddressSafe(stride));
	}

}