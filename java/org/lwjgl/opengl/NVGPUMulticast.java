/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/gpu_multicast.txt">NV_gpu_multicast</a> extension.
 * 
 * <p>This extension enables novel multi-GPU rendering techniques by providing application control over a group of linked GPUs with identical hardware
 * configuration.</p>
 * 
 * <p>Multi-GPU rendering techniques fall into two categories: implicit and explicit. Existing explicit approaches like {@link WGLNVGPUAffinity WGL_NV_gpu_affinity} have two
 * main drawbacks: CPU overhead and application complexity. An application must manage one context per GPU and multi-pump the API stream. Implicit
 * multi-GPU rendering techniques avoid these issues by broadcasting rendering from one context to multiple GPUs. Common implicit approaches include
 * alternate-frame rendering (AFR), split-frame rendering (SFR) and multi-GPU anti-aliasing. They each have drawbacks. AFR scales nicely but interacts
 * poorly with inter-frame dependencies. SFR can improve latency but has challenges with offscreen rendering and scaling of vertex processing. With
 * multi-GPU anti-aliasing, each GPU renders the same content with alternate sample positions and the driver blends the result to improve quality. This
 * also has issues with offscreen rendering and can conflict with other anti-aliasing techniques.</p>
 * 
 * <p>These issues with implicit multi-GPU rendering all have the same root cause: the driver lacks adequate knowledge to accelerate every application. To
 * resolve this, NV_gpu_multicast provides fine-grained, explicit application control over multiple GPUs with a single context.</p>
 * 
 * <p>Key points:</p>
 * 
 * <ul>
 * <li>One context controls multiple GPUs. Every GPU in the linked group can access every object.</li>
 * <li>Rendering is broadcast. Each draw is repeated across all GPUs in the linked group.</li>
 * <li>Each GPU gets its own instance of all framebuffers, allowing individualized output for each GPU. Input data can be customized for each GPU using
 * buffers created with the storage flag, {@link #GL_PER_GPU_STORAGE_BIT_NV PER_GPU_STORAGE_BIT_NV} and a new API, {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV}.</li>
 * <li>New interfaces provide mechanisms to transfer textures and buffers from one GPU to another.</li>
 * </ul>
 * 
 * <p>Requires {@link ARBCopyImage ARB_copy_image} and {@link EXTDirectStateAccess EXT_direct_state_access}.</p>
 */
public class NVGPUMulticast {

	/** Accepted in the {@code flags} parameter of BufferStorage and NamedBufferStorageEXT. */
	public static final int GL_PER_GPU_STORAGE_BIT_NV = 0x800;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_MULTICAST_GPUS_NV  = 0x92BA,
		GL_RENDER_GPU_MASK_NV = 0x9558;

	/**
	 * Accepted as a value for {@code pname} for the TexParameter{if}, TexParameter{if}v, TextureParameter{if}, TextureParameter{if}v, MultiTexParameter{if}EXT
	 * and MultiTexParameter{if}vEXT commands and for the {@code value} parameter of GetTexParameter{if}v, GetTextureParameter{if}vEXT and
	 * GetMultiTexParameter{if}vEXT.
	 */
	public static final int GL_PER_GPU_STORAGE_NV = 0x9548;

	/** Accepted by the {@code pname} parameter of GetMultisamplefv. */
	public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9549;

	protected NVGPUMulticast() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glRenderGpuMaskNV, caps.glMulticastBufferSubDataNV, caps.glMulticastCopyBufferSubDataNV, caps.glMulticastCopyImageSubDataNV, 
			caps.glMulticastBlitFramebufferNV, caps.glMulticastFramebufferSampleLocationsfvNV, caps.glMulticastBarrierNV, caps.glMulticastWaitSyncNV, 
			caps.glMulticastGetQueryObjectivNV, caps.glMulticastGetQueryObjectuivNV, caps.glMulticastGetQueryObjecti64vNV, 
			caps.glMulticastGetQueryObjectui64vNV
		);
	}

	// --- [ glRenderGpuMaskNV ] ---

	/**
	 * Restricts render commands to a specific set of GPUs.
	 *
	 * @param mask 
	 */
	public static void glRenderGpuMaskNV(int mask) {
		long __functionAddress = GL.getCapabilities().glRenderGpuMaskNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, mask);
	}

	// --- [ glMulticastBufferSubDataNV ] ---

	public static void nglMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, long size, long data) {
		long __functionAddress = GL.getCapabilities().glMulticastBufferSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, gpuMask, buffer, offset, size, data);
	}

	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, ByteBuffer data) {
		nglMulticastBufferSubDataNV(gpuMask, buffer, offset, data.remaining(), memAddress(data));
	}

	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, ShortBuffer data) {
		nglMulticastBufferSubDataNV(gpuMask, buffer, offset, data.remaining() << 1, memAddress(data));
	}

	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, IntBuffer data) {
		nglMulticastBufferSubDataNV(gpuMask, buffer, offset, data.remaining() << 2, memAddress(data));
	}

	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, FloatBuffer data) {
		nglMulticastBufferSubDataNV(gpuMask, buffer, offset, data.remaining() << 2, memAddress(data));
	}

	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, DoubleBuffer data) {
		nglMulticastBufferSubDataNV(gpuMask, buffer, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glMulticastCopyBufferSubDataNV ] ---

	public static void glMulticastCopyBufferSubDataNV(int readGpu, int writeGpuMask, int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
		long __functionAddress = GL.getCapabilities().glMulticastCopyBufferSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, readGpu, writeGpuMask, readBuffer, writeBuffer, readOffset, writeOffset, size);
	}

	// --- [ glMulticastCopyImageSubDataNV ] ---

	public static void glMulticastCopyImageSubDataNV(int srcGpu, int dstGpuMask, int srcName, int srcTarget, int srcLevel, int srcX, int srxY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
		long __functionAddress = GL.getCapabilities().glMulticastCopyImageSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srxY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
	}

	// --- [ glMulticastBlitFramebufferNV ] ---

	public static void glMulticastBlitFramebufferNV(int srcGpu, int dstGpu, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = GL.getCapabilities().glMulticastBlitFramebufferNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	// --- [ glMulticastFramebufferSampleLocationsfvNV ] ---

	public static void nglMulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, int count, long v) {
		long __functionAddress = GL.getCapabilities().glMulticastFramebufferSampleLocationsfvNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, gpu, framebuffer, start, count, v);
	}

	public static void glMulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, FloatBuffer v) {
		nglMulticastFramebufferSampleLocationsfvNV(gpu, framebuffer, start, v.remaining() >> 1, memAddress(v));
	}

	// --- [ glMulticastBarrierNV ] ---

	public static void glMulticastBarrierNV() {
		long __functionAddress = GL.getCapabilities().glMulticastBarrierNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glMulticastWaitSyncNV ] ---

	public static void glMulticastWaitSyncNV(int signalGpu, int waitGpuMask) {
		long __functionAddress = GL.getCapabilities().glMulticastWaitSyncNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, signalGpu, waitGpuMask);
	}

	// --- [ glMulticastGetQueryObjectivNV ] ---

	public static void nglMulticastGetQueryObjectivNV(int gpu, int id, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glMulticastGetQueryObjectivNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, gpu, id, pname, params);
	}

	public static void glMulticastGetQueryObjectivNV(int gpu, int id, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglMulticastGetQueryObjectivNV(gpu, id, pname, memAddress(params));
	}

	public static int glMulticastGetQueryObjectiNV(int gpu, int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglMulticastGetQueryObjectivNV(gpu, id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glMulticastGetQueryObjectuivNV ] ---

	public static void nglMulticastGetQueryObjectuivNV(int gpu, int id, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glMulticastGetQueryObjectuivNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, gpu, id, pname, params);
	}

	public static void glMulticastGetQueryObjectuivNV(int gpu, int id, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglMulticastGetQueryObjectuivNV(gpu, id, pname, memAddress(params));
	}

	public static int glMulticastGetQueryObjectuiNV(int gpu, int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglMulticastGetQueryObjectuivNV(gpu, id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glMulticastGetQueryObjecti64vNV ] ---

	public static void nglMulticastGetQueryObjecti64vNV(int gpu, int id, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glMulticastGetQueryObjecti64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, gpu, id, pname, params);
	}

	public static void glMulticastGetQueryObjecti64vNV(int gpu, int id, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglMulticastGetQueryObjecti64vNV(gpu, id, pname, memAddress(params));
	}

	public static long glMulticastGetQueryObjecti64NV(int gpu, int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglMulticastGetQueryObjecti64vNV(gpu, id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glMulticastGetQueryObjectui64vNV ] ---

	public static void nglMulticastGetQueryObjectui64vNV(int gpu, int id, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glMulticastGetQueryObjectui64vNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, gpu, id, pname, params);
	}

	public static void glMulticastGetQueryObjectui64vNV(int gpu, int id, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglMulticastGetQueryObjectui64vNV(gpu, id, pname, memAddress(params));
	}

	public static long glMulticastGetQueryObjectui64NV(int gpu, int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglMulticastGetQueryObjectui64vNV(gpu, id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV} */
	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, short[] data) {
		long __functionAddress = GL.getCapabilities().glMulticastBufferSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, gpuMask, buffer, offset, (long)(data.length << 1), data);
	}

	/** Array version of: {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV} */
	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, int[] data) {
		long __functionAddress = GL.getCapabilities().glMulticastBufferSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, gpuMask, buffer, offset, (long)(data.length << 2), data);
	}

	/** Array version of: {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV} */
	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, float[] data) {
		long __functionAddress = GL.getCapabilities().glMulticastBufferSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, gpuMask, buffer, offset, (long)(data.length << 2), data);
	}

	/** Array version of: {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV} */
	public static void glMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, double[] data) {
		long __functionAddress = GL.getCapabilities().glMulticastBufferSubDataNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, gpuMask, buffer, offset, (long)(data.length << 3), data);
	}

	/** Array version of: {@link #glMulticastFramebufferSampleLocationsfvNV MulticastFramebufferSampleLocationsfvNV} */
	public static void glMulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, float[] v) {
		long __functionAddress = GL.getCapabilities().glMulticastFramebufferSampleLocationsfvNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, gpu, framebuffer, start, v.length >> 1, v);
	}

	/** Array version of: {@link #glMulticastGetQueryObjectivNV MulticastGetQueryObjectivNV} */
	public static void glMulticastGetQueryObjectivNV(int gpu, int id, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glMulticastGetQueryObjectivNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, gpu, id, pname, params);
	}

	/** Array version of: {@link #glMulticastGetQueryObjectuivNV MulticastGetQueryObjectuivNV} */
	public static void glMulticastGetQueryObjectuivNV(int gpu, int id, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glMulticastGetQueryObjectuivNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, gpu, id, pname, params);
	}

	/** Array version of: {@link #glMulticastGetQueryObjecti64vNV MulticastGetQueryObjecti64vNV} */
	public static void glMulticastGetQueryObjecti64vNV(int gpu, int id, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glMulticastGetQueryObjecti64vNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, gpu, id, pname, params);
	}

	/** Array version of: {@link #glMulticastGetQueryObjectui64vNV MulticastGetQueryObjectui64vNV} */
	public static void glMulticastGetQueryObjectui64vNV(int gpu, int id, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glMulticastGetQueryObjectui64vNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, gpu, id, pname, params);
	}

}