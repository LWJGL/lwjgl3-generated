/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
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
public class WGLNVGPUAffinity {

	/** New error code set by wglShareLists, wglMakeCurrent and {@link WGLARBMakeCurrentRead#wglMakeContextCurrentARB MakeContextCurrentARB}. */
	public static final int ERROR_INCOMPATIBLE_AFFINITY_MASKS_NV = 0x20D0;

	/** New error code set by {@link WGL#wglMakeCurrent MakeCurrent} and {@link WGLARBMakeCurrentRead#wglMakeContextCurrentARB MakeContextCurrentARB}. */
	public static final int ERROR_MISSING_AFFINITY_MASK_NV = 0x20D1;

	protected WGLNVGPUAffinity() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(WGLCapabilities caps) {
		return checkFunctions(
			caps.wglEnumGpusNV, caps.wglEnumGpuDevicesNV, caps.wglCreateAffinityDCNV, caps.wglEnumGpusFromAffinityDCNV, caps.wglDeleteDCNV
		);
	}

	// --- [ wglEnumGpusNV ] ---

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
	public static int nwglEnumGpusNV(int gpuIndex, long gpu) {
		long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpusNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIPI(__functionAddress, gpuIndex, gpu);
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
	public static int wglEnumGpusNV(int gpuIndex, PointerBuffer gpu) {
		return nwglEnumGpusNV(gpuIndex, memAddress(gpu));
	}

	// --- [ wglEnumGpuDevicesNV ] ---

	/**
	 * Retrieve information about the display devices supported by a GPU.
	 *
	 * @param gpu         a handle to the GPU to query
	 * @param deviceIndex an index value that specifies a display device, supported by {@code gpu}, to query. The first display device will be index 0.
	 * @param gpuDevice   a {@link GPU_DEVICE} structure which will receive information about the display device at index {@code deviceIndex}.
	 */
	public static int nwglEnumGpuDevicesNV(long gpu, int deviceIndex, long gpuDevice) {
		long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpuDevicesNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(gpu);
		}
		return callPIPI(__functionAddress, gpu, deviceIndex, gpuDevice);
	}

	/**
	 * Retrieve information about the display devices supported by a GPU.
	 *
	 * @param gpu         a handle to the GPU to query
	 * @param deviceIndex an index value that specifies a display device, supported by {@code gpu}, to query. The first display device will be index 0.
	 * @param gpuDevice   a {@link GPU_DEVICE} structure which will receive information about the display device at index {@code deviceIndex}.
	 */
	public static int wglEnumGpuDevicesNV(long gpu, int deviceIndex, GPU_DEVICE gpuDevice) {
		return nwglEnumGpuDevicesNV(gpu, deviceIndex, gpuDevice.address());
	}

	// --- [ wglCreateAffinityDCNV ] ---

	/**
	 * Creates an affinity-DC. Affinity-DCs, a new type of DC, can be used to direct OpenGL commands to a specific GPU or set of GPUs. An affinity-DC is a
	 * device context with a GPU affinity mask embedded in it. This restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the
	 * affinity mask. An affinity-DC can be created directly, using the new function {@code wglCreateAffinityDCNV} and also indirectly by calling
	 * {@link WGLARBPbuffer#wglCreatePbufferARB CreatePbufferARB} followed by {@link WGLARBPbuffer#wglGetPbufferDCARB GetPbufferDCARB}.
	 * 
	 * <p>If successful, the function returns an affinity-DC handle. If it fails, {@code NULL} will be returned.</p>
	 *
	 * @param gpuList a {@code NULL}-terminated array of GPU handles to which the affinity-DC will be restricted
	 */
	public static long nwglCreateAffinityDCNV(long gpuList) {
		long __functionAddress = GL.getCapabilitiesWGL().wglCreateAffinityDCNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPP(__functionAddress, gpuList);
	}

	/**
	 * Creates an affinity-DC. Affinity-DCs, a new type of DC, can be used to direct OpenGL commands to a specific GPU or set of GPUs. An affinity-DC is a
	 * device context with a GPU affinity mask embedded in it. This restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the
	 * affinity mask. An affinity-DC can be created directly, using the new function {@code wglCreateAffinityDCNV} and also indirectly by calling
	 * {@link WGLARBPbuffer#wglCreatePbufferARB CreatePbufferARB} followed by {@link WGLARBPbuffer#wglGetPbufferDCARB GetPbufferDCARB}.
	 * 
	 * <p>If successful, the function returns an affinity-DC handle. If it fails, {@code NULL} will be returned.</p>
	 *
	 * @param gpuList a {@code NULL}-terminated array of GPU handles to which the affinity-DC will be restricted
	 */
	public static long wglCreateAffinityDCNV(PointerBuffer gpuList) {
		if ( CHECKS )
			checkNT(gpuList);
		return nwglCreateAffinityDCNV(memAddress(gpuList));
	}

	// --- [ wglEnumGpusFromAffinityDCNV ] ---

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
	public static int nwglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, long gpu) {
		long __functionAddress = GL.getCapabilitiesWGL().wglEnumGpusFromAffinityDCNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(affinityDC);
		}
		return callPIPI(__functionAddress, affinityDC, gpuIndex, gpu);
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
	public static int wglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, PointerBuffer gpu) {
		return nwglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, memAddress(gpu));
	}

	// --- [ wglDeleteDCNV ] ---

	/**
	 * Deletes an affinity-DC.
	 *
	 * @param hdc a handle of an affinity-DC to delete
	 */
	public static int wglDeleteDCNV(long hdc) {
		long __functionAddress = GL.getCapabilitiesWGL().wglDeleteDCNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
		}
		return callPI(__functionAddress, hdc);
	}

}