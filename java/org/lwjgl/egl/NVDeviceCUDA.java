/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_device_cuda.txt">NV_device_cuda</a> extension.
 * 
 * <p>EGL and CUDA both have the capability to drive multiple devices, such as GPUs, within a single system. To interoperate with one another, both APIs must
 * have compatible notions of such devices. This extension defines a mapping from an EGL device to a CUDA device enumerant.</p>
 * 
 * <p>Requires {@link EXTDeviceBase EXT_device_base}.</p>
 */
public final class NVDeviceCUDA {

	/**  */
	public static final int EGL_CUDA_DEVICE_NV = 0x323A;

	private NVDeviceCUDA() {}

}