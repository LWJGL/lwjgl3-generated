/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/wgl_gpu_association.txt">WGL_AMD_gpu_association</a> extension.
 * 
 * <p>There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
 * that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
 * applications were never written with these sorts of optimizations in mind.</p>
 * 
 * <p>This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
 * functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string} and <a href="http://www.opengl.org/registry/specs/EXT/framebuffer_object.txt">EXT_framebuffer_object</a>.</p>
 */
public class WGLAMDGPUAssociation {

	/** Accepted by the {@code property} parameter of {@link #wglGetGPUInfoAMD GetGPUInfoAMD}. */
	public static final int
		WGL_GPU_VENDOR_AMD                = 0x1F00,
		WGL_GPU_RENDERER_STRING_AMD       = 0x1F01,
		WGL_GPU_OPENGL_VERSION_STRING_AMD = 0x1F02,
		WGL_GPU_FASTEST_TARGET_GPUS_AMD   = 0x21A2,
		WGL_GPU_RAM_AMD                   = 0x21A3,
		WGL_GPU_CLOCK_AMD                 = 0x21A4,
		WGL_GPU_NUM_PIPES_AMD             = 0x21A5,
		WGL_GPU_NUM_SIMD_AMD              = 0x21A6,
		WGL_GPU_NUM_RB_AMD                = 0x21A7,
		WGL_GPU_NUM_SPI_AMD               = 0x21A8;

	/** Function address. */
	public final long
		GetGPUIDsAMD,
		GetGPUInfoAMD,
		GetContextGPUIDAMD,
		CreateAssociatedContextAMD,
		CreateAssociatedContextAttribsAMD,
		DeleteAssociatedContextAMD,
		MakeAssociatedContextCurrentAMD,
		GetCurrentAssociatedContextAMD,
		BlitContextFramebufferAMD;

	protected WGLAMDGPUAssociation() {
		throw new UnsupportedOperationException();
	}

	public WGLAMDGPUAssociation(FunctionProvider provider) {
		GetGPUIDsAMD = provider.getFunctionAddress("wglGetGPUIDsAMD");
		GetGPUInfoAMD = provider.getFunctionAddress("wglGetGPUInfoAMD");
		GetContextGPUIDAMD = provider.getFunctionAddress("wglGetContextGPUIDAMD");
		CreateAssociatedContextAMD = provider.getFunctionAddress("wglCreateAssociatedContextAMD");
		CreateAssociatedContextAttribsAMD = provider.getFunctionAddress("wglCreateAssociatedContextAttribsAMD");
		DeleteAssociatedContextAMD = provider.getFunctionAddress("wglDeleteAssociatedContextAMD");
		MakeAssociatedContextCurrentAMD = provider.getFunctionAddress("wglMakeAssociatedContextCurrentAMD");
		GetCurrentAssociatedContextAMD = provider.getFunctionAddress("wglGetCurrentAssociatedContextAMD");
		BlitContextFramebufferAMD = provider.getFunctionAddress("wglBlitContextFramebufferAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link WGLAMDGPUAssociation} instance of the current context. */
	public static WGLAMDGPUAssociation getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link WGLAMDGPUAssociation} instance of the specified {@link GLCapabilities}. */
	public static WGLAMDGPUAssociation getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__WGLAMDGPUAssociation);
	}

	static WGLAMDGPUAssociation create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_AMD_gpu_association") ) return null;

		WGLAMDGPUAssociation funcs = new WGLAMDGPUAssociation(provider);

		boolean supported = checkFunctions(
			funcs.GetGPUIDsAMD, funcs.GetGPUInfoAMD, funcs.GetContextGPUIDAMD, funcs.CreateAssociatedContextAMD, funcs.CreateAssociatedContextAttribsAMD, 
			funcs.DeleteAssociatedContextAMD, funcs.MakeAssociatedContextCurrentAMD, funcs.GetCurrentAssociatedContextAMD, 
			ext.contains("GL_EXT_framebuffer_blit") ? funcs.BlitContextFramebufferAMD : -1L
		);

		return GL.checkExtension("WGL_AMD_gpu_association", funcs, supported);
	}

	// --- [ wglGetGPUIDsAMD ] ---

	/** Unsafe version of {@link #wglGetGPUIDsAMD GetGPUIDsAMD} */
	public static int nwglGetGPUIDsAMD(int maxCount, long ids) {
		long __functionAddress = getInstance().GetGPUIDsAMD;
		return callIPI(__functionAddress, maxCount, ids);
	}

	/**
	 * Returns the IDs for available GPUs.
	 * 
	 * <p>If the function succeeds, the return value is the number of total GPUs available. The value 0 is returned if no GPUs are available or if the call has
	 * failed. The ID 0 is reserved and will not be retuned as a valid GPU ID. If the array {@code ids} is NULL, the function will only return the total number
	 * of GPUs. {@code ids} will be tightly packed with no 0 values between valid ids.</p>
	 *
	 * @param maxCount the max number of IDs that can be returned
	 * @param ids      the array of returned IDs
	 */
	public static int wglGetGPUIDsAMD(int maxCount, ByteBuffer ids) {
		if ( CHECKS )
			if ( ids != null ) checkBuffer(ids, maxCount << 2);
		return nwglGetGPUIDsAMD(maxCount, memAddressSafe(ids));
	}

	/** Alternative version of: {@link #wglGetGPUIDsAMD GetGPUIDsAMD} */
	public static int wglGetGPUIDsAMD(IntBuffer ids) {
		return nwglGetGPUIDsAMD(ids == null ? 0 : ids.remaining(), memAddressSafe(ids));
	}

	// --- [ wglGetGPUInfoAMD ] ---

	/** Unsafe version of {@link #wglGetGPUInfoAMD GetGPUInfoAMD} */
	public static int nwglGetGPUInfoAMD(int id, int property, int dataType, int size, long data) {
		long __functionAddress = getInstance().GetGPUInfoAMD;
		return callIIIIPI(__functionAddress, id, property, dataType, size, data);
	}

	/**
	 * Each GPU in a system may have different properties, performance characteristics and different supported OpenGL versions. Use this function to determine
	 * which GPU is best suited for a specific task.
	 * 
	 * <p>For a string, {@code size} will be the number of characters allocated and will include NULL termination. For arrays of type GL_UNSIGNED_INT, GL_INT, and
	 * GL_FLOAT {@code size} will be the array depth. If the function succeeds, the number of values written will be returned. If the number of values written
	 * is equal to {@code size}, the query should be repeated with a larger {@code data} buffer. Strings should be queried using the GL_UNSIGNED_BYTE type,
	 * are UTF-8 encoded and will be NULL terminated. If the function fails, -1 will be returned.</p>
	 *
	 * @param id       a GPU id obtained from calling {@link #wglGetGPUIDsAMD GetGPUIDsAMD}
	 * @param property the information being queried. One of:<br>{@link #WGL_GPU_VENDOR_AMD GPU_VENDOR_AMD}, {@link #WGL_GPU_RENDERER_STRING_AMD GPU_RENDERER_STRING_AMD}, {@link #WGL_GPU_OPENGL_VERSION_STRING_AMD GPU_OPENGL_VERSION_STRING_AMD}, {@link #WGL_GPU_FASTEST_TARGET_GPUS_AMD GPU_FASTEST_TARGET_GPUS_AMD}, {@link #WGL_GPU_RAM_AMD GPU_RAM_AMD}, {@link #WGL_GPU_CLOCK_AMD GPU_CLOCK_AMD}, {@link #WGL_GPU_NUM_PIPES_AMD GPU_NUM_PIPES_AMD}, {@link #WGL_GPU_NUM_SIMD_AMD GPU_NUM_SIMD_AMD}, {@link #WGL_GPU_NUM_RB_AMD GPU_NUM_RB_AMD}, {@link #WGL_GPU_NUM_SPI_AMD GPU_NUM_SPI_AMD}
	 * @param dataType the data type to be returned. One of:<br>{@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL11#GL_FLOAT}, {@link GL11#GL_UNSIGNED_BYTE}
	 * @param size     the size of the {@code data} buffer
	 * @param data     the buffer which will be filled with the requested information
	 */
	public static int wglGetGPUInfoAMD(int id, int property, int dataType, int size, ByteBuffer data) {
		if ( CHECKS )
			checkBuffer(data, size << GLChecks.typeToByteShift(dataType));
		return nwglGetGPUInfoAMD(id, property, dataType, size, memAddress(data));
	}

	/** Alternative version of: {@link #wglGetGPUInfoAMD GetGPUInfoAMD} */
	public static int wglGetGPUInfoAMD(int id, int property, int dataType, ByteBuffer data) {
		return nwglGetGPUInfoAMD(id, property, dataType, data.remaining() >> GLChecks.typeToByteShift(dataType), memAddress(data));
	}

	/** IntBuffer version of: {@link #wglGetGPUInfoAMD GetGPUInfoAMD} */
	public static int wglGetGPUInfoAMD(int id, int property, int dataType, IntBuffer data) {
		return nwglGetGPUInfoAMD(id, property, dataType, data.remaining(), memAddress(data));
	}

	/** FloatBuffer version of: {@link #wglGetGPUInfoAMD GetGPUInfoAMD} */
	public static int wglGetGPUInfoAMD(int id, int property, int dataType, FloatBuffer data) {
		return nwglGetGPUInfoAMD(id, property, dataType, data.remaining(), memAddress(data));
	}

	// --- [ wglGetContextGPUIDAMD ] ---

	/**
	 * Determine which GPU a context is attached to.
	 * 
	 * <p>Unassociated contexts are created by calling {@link WGL#wglCreateContext CreateContext}. Although these contexts are unassociated, their use will still be tied to a single
	 * GPU in most cases. For this reason it is advantageous to be able to query the GPU an existing unassociated context resides on. If multiple GPUs are
	 * available, it would be undesirable to use one for rendering to visible surfaces and then chose the same one for off-screen rendering.</p>
	 *
	 * @param hglrc the context for which the GPU id will be returned
	 */
	public static int wglGetContextGPUIDAMD(long hglrc) {
		long __functionAddress = getInstance().GetContextGPUIDAMD;
		if ( CHECKS )
			checkPointer(hglrc);
		return callPI(__functionAddress, hglrc);
	}

	// --- [ wglCreateAssociatedContextAMD ] ---

	/**
	 * Creates an associated context. Upon successful creation, no pixel format is tied to an associated context.
	 *
	 * @param id a valid GPU id
	 */
	public static long wglCreateAssociatedContextAMD(int id) {
		long __functionAddress = getInstance().CreateAssociatedContextAMD;
		return callIP(__functionAddress, id);
	}

	// --- [ wglCreateAssociatedContextAttribsAMD ] ---

	/** Unsafe version of {@link #wglCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
	public static long nwglCreateAssociatedContextAttribsAMD(int id, long shareContext, long attribList) {
		long __functionAddress = getInstance().CreateAssociatedContextAttribsAMD;
		return callIPPP(__functionAddress, id, shareContext, attribList);
	}

	/**
	 * Create an associated context with a specific GL version.
	 * 
	 * <p>All capabilities and limitations of {@link WGLARBCreateContext#wglCreateContextAttribsARB CreateContextAttribsARB} apply to {@code CreateAssociatedContextAttribsAMD}.</p>
	 *
	 * @param id           a valid GPU id
	 * @param shareContext must either be NULL or that of an associated context created with the same GPU ID as {@code id}
	 * @param attribList   a 0-terminated list of attributes for the context
	 */
	public static long wglCreateAssociatedContextAttribsAMD(int id, long shareContext, ByteBuffer attribList) {
		if ( CHECKS )
			if ( attribList != null ) checkNT4(attribList);
		return nwglCreateAssociatedContextAttribsAMD(id, shareContext, memAddressSafe(attribList));
	}

	/** Alternative version of: {@link #wglCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
	public static long wglCreateAssociatedContextAttribsAMD(int id, long shareContext, IntBuffer attribList) {
		if ( CHECKS )
			if ( attribList != null ) checkNT(attribList);
		return nwglCreateAssociatedContextAttribsAMD(id, shareContext, memAddressSafe(attribList));
	}

	// --- [ wglDeleteAssociatedContextAMD ] ---

	/**
	 * Deletes an associated context. An associated context cannot be deleted by calling {@link WGL#wglDeleteContext DeleteContext}.
	 *
	 * @param hglrc a valid associated context created by calling {@link #wglCreateAssociatedContextAMD CreateAssociatedContextAMD}
	 */
	public static int wglDeleteAssociatedContextAMD(long hglrc) {
		long __functionAddress = getInstance().DeleteAssociatedContextAMD;
		if ( CHECKS )
			checkPointer(hglrc);
		return callPI(__functionAddress, hglrc);
	}

	// --- [ wglMakeAssociatedContextCurrentAMD ] ---

	/**
	 * Makes an associated context current in the current thread.
	 *
	 * @param hglrc a context handle created by calling {@link #wglCreateAssociatedContextAMD CreateAssociatedContextAMD}
	 */
	public static int wglMakeAssociatedContextCurrentAMD(long hglrc) {
		long __functionAddress = getInstance().MakeAssociatedContextCurrentAMD;
		if ( CHECKS )
			checkPointer(hglrc);
		return callPI(__functionAddress, hglrc);
	}

	// --- [ wglGetCurrentAssociatedContextAMD ] ---

	/** Returns the current associated context in the current thread. */
	public static long wglGetCurrentAssociatedContextAMD() {
		long __functionAddress = getInstance().GetCurrentAssociatedContextAMD;
		return callP(__functionAddress);
	}

	// --- [ wglBlitContextFramebufferAMD ] ---

	/**
	 * Blits data from one context to another. This facilitates high performance data communication between multiple contexts.
	 *
	 * @param dstCtx the context handle for the write context
	 * @param srcX0  the source x<sub>0</sub> coordinate
	 * @param srcY0  the source Y<sub>0</sub> coordinate
	 * @param srcX1  the source X<sub>1</sub> coordinate
	 * @param srcY1  the source Y<sub>1</sub> coordinate
	 * @param dstX0  the destination X<sub>0</sub> coordinate
	 * @param dstY0  the destination Y<sub>0</sub> coordinate
	 * @param dstX1  the destination X<sub>1</sub> coordinate
	 * @param dstY1  the destination Y<sub>1</sub> coordinate
	 * @param mask   the bitwise OR of a number of values indicating which buffers are to be copied. One or more of:<br>{@link GL11#GL_COLOR_BUFFER_BIT}, {@link GL11#GL_DEPTH_BUFFER_BIT}, {@link GL11#GL_STENCIL_BUFFER_BIT}
	 * @param filter the interpolation method to apply if the image is stretched. One of:<br>{@link GL11#GL_LINEAR}, {@link GL11#GL_NEAREST}
	 */
	public static void wglBlitContextFramebufferAMD(long dstCtx, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().BlitContextFramebufferAMD;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dstCtx);
		}
		callPIIIIIIIIIIV(__functionAddress, dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

}