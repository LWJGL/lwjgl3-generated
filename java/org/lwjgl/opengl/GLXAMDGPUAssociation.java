/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

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
public class GLXAMDGPUAssociation {

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

	protected GLXAMDGPUAssociation() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLXCapabilities caps) {
		return checkFunctions(
			caps.glXBlitContextFramebufferAMD, caps.glXCreateAssociatedContextAMD, caps.glXCreateAssociatedContextAttribsAMD, 
			caps.glXDeleteAssociatedContextAMD, caps.glXGetContextGPUIDAMD, caps.glXGetCurrentAssociatedContextAMD, caps.glXGetGPUIDsAMD, caps.glXGetGPUInfoAMD, 
			caps.glXMakeAssociatedContextCurrentAMD
		);
	}

	// --- [ glXBlitContextFramebufferAMD ] ---

	public static void glXBlitContextFramebufferAMD(long dstCtx, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXBlitContextFramebufferAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(dstCtx);
		}
		callPV(__functionAddress, dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	// --- [ glXCreateAssociatedContextAMD ] ---

	/**
	 * Creates an associated context.
	 *
	 * @param id         
	 * @param share_list 
	 */
	public static long glXCreateAssociatedContextAMD(int id, long share_list) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(share_list);
		}
		return callPP(__functionAddress, id, share_list);
	}

	// --- [ glXCreateAssociatedContextAttribsAMD ] ---

	/** Unsafe version of: {@link #glXCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
	public static long nglXCreateAssociatedContextAttribsAMD(int id, long share_context, long attribList) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAttribsAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(share_context);
		}
		return callPPP(__functionAddress, id, share_context, attribList);
	}

	/**
	 * Creates an associated context and requests a specific GL version.
	 *
	 * @param id            
	 * @param share_context 
	 * @param attribList    
	 */
	public static long glXCreateAssociatedContextAttribsAMD(int id, long share_context, IntBuffer attribList) {
		if ( CHECKS )
			checkNT(attribList);
		return nglXCreateAssociatedContextAttribsAMD(id, share_context, memAddress(attribList));
	}

	// --- [ glXDeleteAssociatedContextAMD ] ---

	/**
	 * Deletes an associated context.
	 *
	 * @param ctx the GLXContext
	 */
	public static boolean glXDeleteAssociatedContextAMD(long ctx) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXDeleteAssociatedContextAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(ctx);
		}
		return callPI(__functionAddress, ctx) != 0;
	}

	// --- [ glXGetContextGPUIDAMD ] ---

	/**
	 * Determines which GPU a context is attached to.
	 *
	 * @param ctx the GLXContext
	 */
	public static int glXGetContextGPUIDAMD(long ctx) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetContextGPUIDAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(ctx);
		}
		return callPI(__functionAddress, ctx);
	}

	// --- [ glXGetCurrentAssociatedContextAMD ] ---

	/** Queries the crrent associated context. */
	public static long glXGetCurrentAssociatedContextAMD() {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentAssociatedContextAMD;
		if ( CHECKS )
			check(__functionAddress);
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
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetGPUIDsAMD;
		if ( CHECKS )
			check(__functionAddress);
		return callI(__functionAddress, maxCount, ids);
	}

	// --- [ glXGetGPUInfoAMD ] ---

	/** Unsafe version of: {@link #glXGetGPUInfoAMD GetGPUInfoAMD} */
	public static int nglXGetGPUInfoAMD(int id, int property, int dataType, int size, long data) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXGetGPUInfoAMD;
		if ( CHECKS )
			check(__functionAddress);
		return callPI(__functionAddress, id, property, dataType, size, data);
	}

	/**
	 * Queries GPU properties.
	 *
	 * @param id       
	 * @param property one of:<br><table><tr><td>{@link #GLX_GPU_VENDOR_AMD GPU_VENDOR_AMD}</td><td>{@link #GLX_GPU_RENDERER_STRING_AMD GPU_RENDERER_STRING_AMD}</td><td>{@link #GLX_GPU_OPENGL_VERSION_STRING_AMD GPU_OPENGL_VERSION_STRING_AMD}</td><td>{@link #GLX_GPU_FASTEST_TARGET_GPUS_AMD GPU_FASTEST_TARGET_GPUS_AMD}</td></tr><tr><td>{@link #GLX_GPU_RAM_AMD GPU_RAM_AMD}</td><td>{@link #GLX_GPU_CLOCK_AMD GPU_CLOCK_AMD}</td><td>{@link #GLX_GPU_NUM_PIPES_AMD GPU_NUM_PIPES_AMD}</td><td>{@link #GLX_GPU_NUM_SIMD_AMD GPU_NUM_SIMD_AMD}</td></tr><tr><td>{@link #GLX_GPU_NUM_RB_AMD GPU_NUM_RB_AMD}</td><td>{@link #GLX_GPU_NUM_SPI_AMD GPU_NUM_SPI_AMD}</td></tr></table>
	 * @param dataType 
	 * @param data     
	 */
	public static int glXGetGPUInfoAMD(int id, int property, int dataType, ByteBuffer data) {
		return nglXGetGPUInfoAMD(id, property, dataType, data.remaining(), memAddress(data));
	}

	// --- [ glXMakeAssociatedContextCurrentAMD ] ---

	/**
	 * Makes an associated context current in the current thread.
	 *
	 * @param ctx the GLXContext
	 */
	public static boolean glXMakeAssociatedContextCurrentAMD(long ctx) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXMakeAssociatedContextCurrentAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(ctx);
		}
		return callPI(__functionAddress, ctx) != 0;
	}

	/** Array version of: {@link #glXCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
	public static long glXCreateAssociatedContextAttribsAMD(int id, long share_context, int[] attribList) {
		long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAttribsAMD;
		if ( CHECKS ) {
			check(__functionAddress);
			check(share_context);
			checkNT(attribList);
		}
		return callPPP(__functionAddress, id, share_context, attribList);
	}

}