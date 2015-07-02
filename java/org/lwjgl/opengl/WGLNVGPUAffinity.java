/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/gpu_affinity.txt">WGL_NV_gpu_affinity</a> extension.
 * 
 * <p>On systems with more than one GPU it is desirable to be able to select which GPU(s) in the system become the target for OpenGL rendering commands. This
 * extension introduces the concept of a GPU affinity mask. OpenGL rendering commands are directed to the GPU(s) specified by the affinity mask. GPU
 * affinity is immutable. Once set, it cannot be changed.</p>
 * 
 * <p>This extension also introduces the concept called affinity-DC. An affinity-DC is a device context with a GPU affinity mask embedded in it. This
 * restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the affinity mask.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string}.</p>
 */
public final class WGLNVGPUAffinity {

	/** New error code set by wglShareLists, wglMakeCurrent and {@link WGLARBMakeCurrentRead#wglMakeContextCurrentARB MakeContextCurrentARB}. */
	public static final int ERROR_INCOMPATIBLE_AFFINITY_MASKS_NV = 0x20D0;

	/** New error code set by {@link WGL#wglMakeCurrent MakeCurrent} and {@link WGLARBMakeCurrentRead#wglMakeContextCurrentARB MakeContextCurrentARB}. */
	public static final int WGL_ERROR_MISSING_AFFINITY_MASK_NV = 0x20D1;

	/** Function address. */
	@JavadocExclude
	public final long
		EnumGpusNV,
		EnumGpuDevicesNV,
		CreateAffinityDCNV,
		EnumGpusFromAffinityDCNV,
		DeleteDCNV;

	@JavadocExclude
	public WGLNVGPUAffinity(FunctionProvider provider) {
		EnumGpusNV = provider.getFunctionAddress("wglEnumGpusNV");
		EnumGpuDevicesNV = provider.getFunctionAddress("wglEnumGpuDevicesNV");
		CreateAffinityDCNV = provider.getFunctionAddress("wglCreateAffinityDCNV");
		EnumGpusFromAffinityDCNV = provider.getFunctionAddress("wglEnumGpusFromAffinityDCNV");
		DeleteDCNV = provider.getFunctionAddress("wglDeleteDCNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLNVGPUAffinity} instance for the current context. */
	public static WGLNVGPUAffinity getInstance() {
		return checkFunctionality(GL.getCapabilities().__WGLNVGPUAffinity);
	}

	static WGLNVGPUAffinity create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_NV_gpu_affinity") ) return null;

		WGLNVGPUAffinity funcs = new WGLNVGPUAffinity(provider);

		boolean supported = checkFunctions(
			funcs.EnumGpusNV, funcs.EnumGpuDevicesNV, funcs.CreateAffinityDCNV, funcs.EnumGpusFromAffinityDCNV, funcs.DeleteDCNV
		);

		return GL.checkExtension("WGL_NV_gpu_affinity", funcs, supported);
	}

	// --- [ wglEnumGpusNV ] ---

	/** JNI method for {@link #wglEnumGpusNV EnumGpusNV} */
	@JavadocExclude
	public static native int nwglEnumGpusNV(int gpuIndex, long gpu, long __functionAddress);

	/** Unsafe version of {@link #wglEnumGpusNV EnumGpusNV} */
	@JavadocExclude
	public static int nwglEnumGpusNV(int gpuIndex, long gpu) {
		long __functionAddress = getInstance().EnumGpusNV;
		return nwglEnumGpusNV(gpuIndex, gpu, __functionAddress);
	}

	/**
	 * Returns the handles for all GPUs in a system.
	 * 
	 * <p>By looping over {@code wglEnumGpusNV} and incrementing {@code gpuIndex}, starting at index 0, all GPU handles can be queried. If the function succeeds,
	 * the return value is TRUE. If the function fails, the return value is FALSE and {@code gpu} will be unmodified. The function fails if {@code gpuIndex} is
	 * greater or equal than the number of GPUs supported by the system.</p>
	 *
	 * @param gpuIndex an index value that specifies a GPU
	 * @param gpu      returns a handle for GPU number {@code gpuIndex}. The first GPU will be index 0.
	 */
	public static int wglEnumGpusNV(int gpuIndex, ByteBuffer gpu) {
		return nwglEnumGpusNV(gpuIndex, memAddress(gpu));
	}

	/** Alternative version of: {@link #wglEnumGpusNV EnumGpusNV} */
	public static int wglEnumGpusNV(int gpuIndex, PointerBuffer gpu) {
		return nwglEnumGpusNV(gpuIndex, memAddress(gpu));
	}

	// --- [ wglEnumGpuDevicesNV ] ---

	/** JNI method for {@link #wglEnumGpuDevicesNV EnumGpuDevicesNV} */
	@JavadocExclude
	public static native int nwglEnumGpuDevicesNV(long gpu, int deviceIndex, long gpuDevice, long __functionAddress);

	/** Unsafe version of {@link #wglEnumGpuDevicesNV EnumGpuDevicesNV} */
	@JavadocExclude
	public static int nwglEnumGpuDevicesNV(long gpu, int deviceIndex, long gpuDevice) {
		long __functionAddress = getInstance().EnumGpuDevicesNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(gpu);
		return nwglEnumGpuDevicesNV(gpu, deviceIndex, gpuDevice, __functionAddress);
	}

	/**
	 * Retrieve information about the display devices supported by a GPU.
	 *
	 * @param gpu         a handle to the GPU to query
	 * @param deviceIndex an index value that specifies a display device, supported by {@code gpu}, to query. The first display device will be index 0.
	 * @param gpuDevice   a {@link GPU_DEVICE} structure which will receive information about the display device at index {@code deviceIndex}.
	 */
	public static int wglEnumGpuDevicesNV(long gpu, int deviceIndex, ByteBuffer gpuDevice) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(gpuDevice, GPU_DEVICE.SIZEOF);
		return nwglEnumGpuDevicesNV(gpu, deviceIndex, memAddress(gpuDevice));
	}

	// --- [ wglCreateAffinityDCNV ] ---

	/** JNI method for {@link #wglCreateAffinityDCNV CreateAffinityDCNV} */
	@JavadocExclude
	public static native long nwglCreateAffinityDCNV(long gpuList, long __functionAddress);

	/** Unsafe version of {@link #wglCreateAffinityDCNV CreateAffinityDCNV} */
	@JavadocExclude
	public static long nwglCreateAffinityDCNV(long gpuList) {
		long __functionAddress = getInstance().CreateAffinityDCNV;
		return nwglCreateAffinityDCNV(gpuList, __functionAddress);
	}

	/**
	 * Creates an affinity-DC. Affinity-DCs, a new type of DC, can be used to direct OpenGL commands to a specific GPU or set of GPUs. An affinity-DC is a
	 * device context with a GPU affinity mask embedded in it. This restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the
	 * affinity mask. An affinity-DC can be created directly, using the new function {@code wglCreateAffinityDCNV} and also indirectly by calling
	 * {@link WGLARBPbuffer#wglCreatePbufferARB CreatePbufferARB} followed by {@link WGLARBPbuffer#wglGetPbufferDCARB GetPbufferDCARB}.
	 * 
	 * <p>If successful, the function returns an affinity-DC handle. If it fails, NULL will be returned.</p>
	 *
	 * @param gpuList a NULL-terminated array of GPU handles to which the affinity-DC will be restricted
	 */
	public static long wglCreateAffinityDCNV(ByteBuffer gpuList) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(gpuList);
		return nwglCreateAffinityDCNV(memAddress(gpuList));
	}

	/** Alternative version of: {@link #wglCreateAffinityDCNV CreateAffinityDCNV} */
	public static long wglCreateAffinityDCNV(PointerBuffer gpuList) {
		if ( LWJGLUtil.CHECKS )
			checkNT(gpuList);
		return nwglCreateAffinityDCNV(memAddress(gpuList));
	}

	// --- [ wglEnumGpusFromAffinityDCNV ] ---

	/** JNI method for {@link #wglEnumGpusFromAffinityDCNV EnumGpusFromAffinityDCNV} */
	@JavadocExclude
	public static native int nwglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, long gpu, long __functionAddress);

	/** Unsafe version of {@link #wglEnumGpusFromAffinityDCNV EnumGpusFromAffinityDCNV} */
	@JavadocExclude
	public static int nwglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, long gpu) {
		long __functionAddress = getInstance().EnumGpusFromAffinityDCNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(affinityDC);
		return nwglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, gpu, __functionAddress);
	}

	/**
	 * Retrieves a list of GPU handles that make up the affinity-mask of an affinity-DC.
	 * 
	 * <p>By looping over {@code wglEnumGpusFromAffinityDCNV} and incrementing {@code gpuIndex}, starting at index 0, all GPU handles associated with the DC can
	 * be queried. If the function succeeds, the return value is TRUE. If the function fails, the return value is FALSE and {@code gpu} will be unmodified. The
	 * function fails if {@code gpuIndex} is greater or equal than the number of GPUs associated with {@code affinityDC}.</p>
	 *
	 * @param affinityDC a handle of the affinity-DC to query
	 * @param gpuIndex   an index value of the GPU handle in the affinity mask of {@code affinityDC} to query
	 * @param gpu        returns a handle for  GPU number {@code gpuIndex}. The first GPU will be at index 0.
	 */
	public static int wglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, ByteBuffer gpu) {
		return nwglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, memAddress(gpu));
	}

	/** Alternative version of: {@link #wglEnumGpusFromAffinityDCNV EnumGpusFromAffinityDCNV} */
	public static int wglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, PointerBuffer gpu) {
		return nwglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, memAddress(gpu));
	}

	// --- [ wglDeleteDCNV ] ---

	/** JNI method for {@link #wglDeleteDCNV DeleteDCNV} */
	@JavadocExclude
	public static native int nwglDeleteDCNV(long hdc, long __functionAddress);

	/**
	 * Deletes an affinity-DC.
	 *
	 * @param hdc a handle of an affinity-DC to delete
	 */
	public static int wglDeleteDCNV(long hdc) {
		long __functionAddress = getInstance().DeleteDCNV;
		if ( LWJGLUtil.CHECKS )
			checkPointer(hdc);
		return nwglDeleteDCNV(hdc, __functionAddress);
	}

}