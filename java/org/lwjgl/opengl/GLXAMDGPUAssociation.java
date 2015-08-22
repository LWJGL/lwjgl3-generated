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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/glx_gpu_association.txt">GLX_AMD_gpu_association</a> extension.
 * 
 * <p>There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
 * that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
 * applications were never written with these sorts of optimizations in mind.</p>
 * 
 * <p>This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
 * functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}, {@link GLX13 GLX 1.3}, <a href="http://www.opengl.org/registry/specs/EXT/framebuffer_object.txt">EXT_framebuffer_object</a> and {@link GLXARBGetProcAddress GLX_ARB_get_proc_address}.</p>
 */
public final class GLXAMDGPUAssociation {

	/** Accepted by the {@code property} parameter of {@link #glXGetGPUInfoAMD GetGPUInfoAMD}. */
	public static final int
		GLX_GPU_VENDOR_AMD                = 0x1F00,
		GLX_GPU_RENDERER_STRING_AMD       = 0x1F01,
		GLX_GPU_OPENGL_VERSION_STRING_AMD = 0x1F02,
		GLX_GPU_FASTEST_TARGET_GPUS_AMD   = 0x21A2,
		GLX_GPU_RAM_AMD                   = 0x21A3,
		GLX_GPU_CLOCK_AMD                 = 0x21A4,
		GLX_GPU_NUM_PIPES_AMD             = 0x21A5,
		GLX_GPU_NUM_SIMD_AMD              = 0x21A6,
		GLX_GPU_NUM_RB_AMD                = 0x21A7,
		GLX_GPU_NUM_SPI_AMD               = 0x21A8;

	/** Function address. */
	@JavadocExclude
	public final long
		BlitContextFramebufferAMD,
		CreateAssociatedContextAMD,
		CreateAssociatedContextAttribsAMD,
		DeleteAssociatedContextAMD,
		GetContextGPUIDAMD,
		GetCurrentAssociatedContextAMD,
		GetGPUIDsAMD,
		GetGPUInfoAMD,
		MakeAssociatedContextCurrentAMD;

	@JavadocExclude
	public GLXAMDGPUAssociation(FunctionProvider provider) {
		BlitContextFramebufferAMD = provider.getFunctionAddress("glXBlitContextFramebufferAMD");
		CreateAssociatedContextAMD = provider.getFunctionAddress("glXCreateAssociatedContextAMD");
		CreateAssociatedContextAttribsAMD = provider.getFunctionAddress("glXCreateAssociatedContextAttribsAMD");
		DeleteAssociatedContextAMD = provider.getFunctionAddress("glXDeleteAssociatedContextAMD");
		GetContextGPUIDAMD = provider.getFunctionAddress("glXGetContextGPUIDAMD");
		GetCurrentAssociatedContextAMD = provider.getFunctionAddress("glXGetCurrentAssociatedContextAMD");
		GetGPUIDsAMD = provider.getFunctionAddress("glXGetGPUIDsAMD");
		GetGPUInfoAMD = provider.getFunctionAddress("glXGetGPUInfoAMD");
		MakeAssociatedContextCurrentAMD = provider.getFunctionAddress("glXMakeAssociatedContextCurrentAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXAMDGPUAssociation} instance for the current context. */
	public static GLXAMDGPUAssociation getInstance() {
		return checkFunctionality(GL.getCapabilities().__GLXAMDGPUAssociation);
	}

	static GLXAMDGPUAssociation create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_AMD_gpu_association") ) return null;

		GLXAMDGPUAssociation funcs = new GLXAMDGPUAssociation(provider);

		boolean supported = checkFunctions(
			funcs.BlitContextFramebufferAMD, funcs.CreateAssociatedContextAMD, funcs.CreateAssociatedContextAttribsAMD, funcs.DeleteAssociatedContextAMD, 
			funcs.GetContextGPUIDAMD, funcs.GetCurrentAssociatedContextAMD, funcs.GetGPUIDsAMD, funcs.GetGPUInfoAMD, funcs.MakeAssociatedContextCurrentAMD
		);

		return GL.checkExtension("GLX_AMD_gpu_association", funcs, supported);
	}

	// --- [ glXBlitContextFramebufferAMD ] ---

	public static void glXBlitContextFramebufferAMD(long dstCtx, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().BlitContextFramebufferAMD;
		if ( LWJGLUtil.CHECKS )
			checkPointer(dstCtx);
		callPIIIIIIIIIIV(__functionAddress, dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	// --- [ glXCreateAssociatedContextAMD ] ---

	/**
	 * Creates an associated context.
	 *
	 * @param id         
	 * @param share_list 
	 */
	public static long glXCreateAssociatedContextAMD(int id, long share_list) {
		long __functionAddress = getInstance().CreateAssociatedContextAMD;
		if ( LWJGLUtil.CHECKS )
			checkPointer(share_list);
		return callIPP(__functionAddress, id, share_list);
	}

	// --- [ glXCreateAssociatedContextAttribsAMD ] ---

	/** Unsafe version of {@link #glXCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
	@JavadocExclude
	public static long nglXCreateAssociatedContextAttribsAMD(int id, long share_context, long attribList) {
		long __functionAddress = getInstance().CreateAssociatedContextAttribsAMD;
		if ( LWJGLUtil.CHECKS )
			checkPointer(share_context);
		return callIPPP(__functionAddress, id, share_context, attribList);
	}

	/**
	 * Creates an associated context and requests a specific GL version.
	 *
	 * @param id            
	 * @param share_context 
	 * @param attribList    
	 */
	public static long glXCreateAssociatedContextAttribsAMD(int id, long share_context, ByteBuffer attribList) {
		return nglXCreateAssociatedContextAttribsAMD(id, share_context, memAddress(attribList));
	}

	/** Alternative version of: {@link #glXCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
	public static long glXCreateAssociatedContextAttribsAMD(int id, long share_context, IntBuffer attribList) {
		return nglXCreateAssociatedContextAttribsAMD(id, share_context, memAddress(attribList));
	}

	// --- [ glXDeleteAssociatedContextAMD ] ---

	/**
	 * Deletes an associated context.
	 *
	 * @param ctx the GLXContext
	 */
	public static int glXDeleteAssociatedContextAMD(long ctx) {
		long __functionAddress = getInstance().DeleteAssociatedContextAMD;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

	// --- [ glXGetContextGPUIDAMD ] ---

	/**
	 * Determines which GPU a context is attached to.
	 *
	 * @param ctx the GLXContext
	 */
	public static int glXGetContextGPUIDAMD(long ctx) {
		long __functionAddress = getInstance().GetContextGPUIDAMD;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

	// --- [ glXGetCurrentAssociatedContextAMD ] ---

	/** Queries the crrent associated context. */
	public static long glXGetCurrentAssociatedContextAMD() {
		long __functionAddress = getInstance().GetCurrentAssociatedContextAMD;
		return callP(__functionAddress);
	}

	// --- [ glXGetGPUIDsAMD ] ---

	/**
	 * Queries the IDs for available GPUs.
	 *
	 * @param maxCount 
	 * @param ids      
	 */
	public static int glXGetGPUIDsAMD(int maxCount, int ids) {
		long __functionAddress = getInstance().GetGPUIDsAMD;
		return callIII(__functionAddress, maxCount, ids);
	}

	// --- [ glXGetGPUInfoAMD ] ---

	/** Unsafe version of {@link #glXGetGPUInfoAMD GetGPUInfoAMD} */
	@JavadocExclude
	public static int nglXGetGPUInfoAMD(int id, int property, int dataType, int size, long data) {
		long __functionAddress = getInstance().GetGPUInfoAMD;
		return callIIIIPI(__functionAddress, id, property, dataType, size, data);
	}

	/**
	 * Queries GPU properties.
	 *
	 * @param id       
	 * @param property one of:<br>{@link #GLX_GPU_VENDOR_AMD GPU_VENDOR_AMD}, {@link #GLX_GPU_RENDERER_STRING_AMD GPU_RENDERER_STRING_AMD}, {@link #GLX_GPU_OPENGL_VERSION_STRING_AMD GPU_OPENGL_VERSION_STRING_AMD}, {@link #GLX_GPU_FASTEST_TARGET_GPUS_AMD GPU_FASTEST_TARGET_GPUS_AMD}, {@link #GLX_GPU_RAM_AMD GPU_RAM_AMD}, {@link #GLX_GPU_CLOCK_AMD GPU_CLOCK_AMD}, {@link #GLX_GPU_NUM_PIPES_AMD GPU_NUM_PIPES_AMD}, {@link #GLX_GPU_NUM_SIMD_AMD GPU_NUM_SIMD_AMD}, {@link #GLX_GPU_NUM_RB_AMD GPU_NUM_RB_AMD}, {@link #GLX_GPU_NUM_SPI_AMD GPU_NUM_SPI_AMD}
	 * @param dataType 
	 * @param size     
	 * @param data     
	 */
	public static int glXGetGPUInfoAMD(int id, int property, int dataType, int size, ByteBuffer data) {
		return nglXGetGPUInfoAMD(id, property, dataType, size, memAddress(data));
	}

	// --- [ glXMakeAssociatedContextCurrentAMD ] ---

	/**
	 * Makes an associated context current in the current thread.
	 *
	 * @param ctx the GLXContext
	 */
	public static int glXMakeAssociatedContextCurrentAMD(long ctx) {
		long __functionAddress = getInstance().MakeAssociatedContextCurrentAMD;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

}