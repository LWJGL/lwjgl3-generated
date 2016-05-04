/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/MESA/EGL_MESA_image_dma_buf_export.txt">MESA_image_dma_buf_export</a> extension.
 * 
 * <p>This extension provides entry points for integrating EGLImage with the dma-buf infrastructure. The extension allows creating a Linux dma_buf file
 * descriptor or multiple file descriptors, in the case of multi-plane YUV image, from an EGLImage.</p>
 * 
 * <p>It is designed to provide the complementary functionality to EGL_EXT_image_dma_buf_import.</p>
 * 
 * <p>Requires {@link EGL14 EGL L.1} and {@link KHRImageBase KHR_image_base}. The EGL implementation must be running on a Linux kernel supporting the dma_buf buffer sharing
 * mechanism.</p>
 */
public class MESAImageDMABufExport {

	protected MESAImageDMABufExport() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(EGLCapabilities caps) {
		return checkFunctions(
			caps.eglExportDMABUFImageQueryMESA, caps.eglExportDMABUFImageMESA
		);
	}

	// --- [ eglExportDMABUFImageQueryMESA ] ---

	public static int neglExportDMABUFImageQueryMESA(long dpy, long image, long fourcc, long num_planes, long modifiers) {
		long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageQueryMESA;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(image);
		}
		return callPPPPPI(__functionAddress, dpy, image, fourcc, num_planes, modifiers);
	}

	public static boolean eglExportDMABUFImageQueryMESA(long dpy, long image, IntBuffer fourcc, IntBuffer num_planes, LongBuffer modifiers) {
		if ( CHECKS ) {
			if ( fourcc != null ) checkBuffer(fourcc, 1);
			if ( num_planes != null ) checkBuffer(num_planes, 1);
			if ( modifiers != null ) checkBuffer(modifiers, 1);
		}
		return neglExportDMABUFImageQueryMESA(dpy, image, memAddressSafe(fourcc), memAddressSafe(num_planes), memAddressSafe(modifiers)) != 0;
	}

	// --- [ eglExportDMABUFImageMESA ] ---

	public static int neglExportDMABUFImageMESA(long dpy, long image, long fds, long strides, long offsets) {
		long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageMESA;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(image);
		}
		return callPPPPPI(__functionAddress, dpy, image, fds, strides, offsets);
	}

	public static boolean eglExportDMABUFImageMESA(long dpy, long image, IntBuffer fds, IntBuffer strides, IntBuffer offsets) {
		if ( CHECKS ) {
			if ( fds != null ) checkBuffer(fds, 1);
			if ( strides != null ) checkBuffer(strides, 1);
			if ( offsets != null ) checkBuffer(offsets, 1);
		}
		return neglExportDMABUFImageMESA(dpy, image, memAddressSafe(fds), memAddressSafe(strides), memAddressSafe(offsets)) != 0;
	}

	/** Array version of: {@link #eglExportDMABUFImageQueryMESA ExportDMABUFImageQueryMESA} */
	public static boolean eglExportDMABUFImageQueryMESA(long dpy, long image, int[] fourcc, int[] num_planes, long[] modifiers) {
		long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageQueryMESA;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(image);
			if ( fourcc != null ) checkBuffer(fourcc, 1);
			if ( num_planes != null ) checkBuffer(num_planes, 1);
			if ( modifiers != null ) checkBuffer(modifiers, 1);
		}
		return callPPPPPI(__functionAddress, dpy, image, fourcc, num_planes, modifiers) != 0;
	}

	/** Array version of: {@link #eglExportDMABUFImageMESA ExportDMABUFImageMESA} */
	public static boolean eglExportDMABUFImageMESA(long dpy, long image, int[] fds, int[] strides, int[] offsets) {
		long __functionAddress = EGL.getCapabilities().eglExportDMABUFImageMESA;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dpy);
			checkPointer(image);
			if ( fds != null ) checkBuffer(fds, 1);
			if ( strides != null ) checkBuffer(strides, 1);
			if ( offsets != null ) checkBuffer(offsets, 1);
		}
		return callPPPPPI(__functionAddress, dpy, image, fds, strides, offsets) != 0;
	}

}