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
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/glx_gpu_association.txt">GLX_AMD_gpu_association</a> extension.
 * <p/>
 * There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
 * that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
 * applications were never written with these sorts of optimizations in mind.
 * <p/>
 * This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
 * functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.
 */
public final class GLXAMDGPUAssociation {

	/** Accepted by the {@code property} parameter of glXGetGPUInfo: */
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
		glXglXBlitContextFramebufferAMD,
		glXCreateAssociatedContextAMD,
		glXCreateAssociatedContextAttribsAMD,
		glXDeleteAssociatedContextAMD,
		glXGetContextGPUIDAMD,
		glXGetCurrentAssociatedContextAMD,
		glXGetGPUIDsAMD,
		glXGetGPUInfoAMD,
		glXMakeAssociatedContextCurrentAMD;

	@JavadocExclude
	public GLXAMDGPUAssociation(FunctionProvider provider) {
		glXglXBlitContextFramebufferAMD = provider.getFunctionAddress("glXglXBlitContextFramebufferAMD");
		glXCreateAssociatedContextAMD = provider.getFunctionAddress("glXCreateAssociatedContextAMD");
		glXCreateAssociatedContextAttribsAMD = provider.getFunctionAddress("glXCreateAssociatedContextAttribsAMD");
		glXDeleteAssociatedContextAMD = provider.getFunctionAddress("glXDeleteAssociatedContextAMD");
		glXGetContextGPUIDAMD = provider.getFunctionAddress("glXGetContextGPUIDAMD");
		glXGetCurrentAssociatedContextAMD = provider.getFunctionAddress("glXGetCurrentAssociatedContextAMD");
		glXGetGPUIDsAMD = provider.getFunctionAddress("glXGetGPUIDsAMD");
		glXGetGPUInfoAMD = provider.getFunctionAddress("glXGetGPUInfoAMD");
		glXMakeAssociatedContextCurrentAMD = provider.getFunctionAddress("glXMakeAssociatedContextCurrentAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GLXAMDGPUAssociation} instance for the current context. */
	public static GLXAMDGPUAssociation getInstance() {
		return GL.getCapabilities().__GLXAMDGPUAssociation;
	}

	static GLXAMDGPUAssociation create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_AMD_gpu_association") ) return null;

		GLXAMDGPUAssociation funcs = new GLXAMDGPUAssociation(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXglXBlitContextFramebufferAMD) &&
			GL.isFunctionSupported(funcs.glXCreateAssociatedContextAMD) &&
			GL.isFunctionSupported(funcs.glXCreateAssociatedContextAttribsAMD) &&
			GL.isFunctionSupported(funcs.glXDeleteAssociatedContextAMD) &&
			GL.isFunctionSupported(funcs.glXGetContextGPUIDAMD) &&
			GL.isFunctionSupported(funcs.glXGetCurrentAssociatedContextAMD) &&
			GL.isFunctionSupported(funcs.glXGetGPUIDsAMD) &&
			GL.isFunctionSupported(funcs.glXGetGPUInfoAMD) &&
			GL.isFunctionSupported(funcs.glXMakeAssociatedContextCurrentAMD);

		return GL.checkExtension("GLX_AMD_gpu_association", funcs, supported);
	}

	// --- [ glXglXBlitContextFramebufferAMD ] ---

	/** JNI method for {@link #glXglXBlitContextFramebufferAMD glXglXBlitContextFramebufferAMD} */
	@JavadocExclude
	public static native void nglXglXBlitContextFramebufferAMD(long dstCtx, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter, long __functionAddress);

	/**
	 * 
	 *
	 * @param dstCtx 
	 * @param srcX0  
	 * @param srcY0  
	 * @param srcX1  
	 * @param srcY1  
	 * @param dstX0  
	 * @param dstY0  
	 * @param dstX1  
	 * @param dstY1  
	 * @param mask   
	 * @param filter 
	 */
	public static void glXglXBlitContextFramebufferAMD(long dstCtx, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().glXglXBlitContextFramebufferAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dstCtx);
		}
		nglXglXBlitContextFramebufferAMD(dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
	}

	// --- [ glXCreateAssociatedContextAMD ] ---

	/** JNI method for {@link #glXCreateAssociatedContextAMD glXCreateAssociatedContextAMD} */
	@JavadocExclude
	public static native long nglXCreateAssociatedContextAMD(int id, long share_list, long __functionAddress);

	/**
	 * Creates an associated context.
	 *
	 * @param id         
	 * @param share_list 
	 */
	public static long glXCreateAssociatedContextAMD(int id, long share_list) {
		long __functionAddress = getInstance().glXCreateAssociatedContextAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(share_list);
		}
		return nglXCreateAssociatedContextAMD(id, share_list, __functionAddress);
	}

	// --- [ glXCreateAssociatedContextAttribsAMD ] ---

	/** JNI method for {@link #glXCreateAssociatedContextAttribsAMD glXCreateAssociatedContextAttribsAMD} */
	@JavadocExclude
	public static native long nglXCreateAssociatedContextAttribsAMD(int id, long share_context, long attribList, long __functionAddress);

	/**
	 * Creates an associated context and requests a specific GL version.
	 *
	 * @param id            
	 * @param share_context 
	 * @param attribList    
	 */
	public static long glXCreateAssociatedContextAttribsAMD(int id, long share_context, ByteBuffer attribList) {
		long __functionAddress = getInstance().glXCreateAssociatedContextAttribsAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(share_context);
		}
		return nglXCreateAssociatedContextAttribsAMD(id, share_context, memAddress(attribList), __functionAddress);
	}

	/** Alternative version of: {@link #glXCreateAssociatedContextAttribsAMD glXCreateAssociatedContextAttribsAMD} */
	public static long glXCreateAssociatedContextAttribsAMD(int id, long share_context, IntBuffer attribList) {
		long __functionAddress = getInstance().glXCreateAssociatedContextAttribsAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(share_context);
		}
		return nglXCreateAssociatedContextAttribsAMD(id, share_context, memAddress(attribList), __functionAddress);
	}

	// --- [ glXDeleteAssociatedContextAMD ] ---

	/** JNI method for {@link #glXDeleteAssociatedContextAMD glXDeleteAssociatedContextAMD} */
	@JavadocExclude
	public static native int nglXDeleteAssociatedContextAMD(long ctx, long __functionAddress);

	/**
	 * Deletes an associated context.
	 *
	 * @param ctx the GLXContext
	 */
	public static int glXDeleteAssociatedContextAMD(long ctx) {
		long __functionAddress = getInstance().glXDeleteAssociatedContextAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(ctx);
		}
		return nglXDeleteAssociatedContextAMD(ctx, __functionAddress);
	}

	// --- [ glXGetContextGPUIDAMD ] ---

	/** JNI method for {@link #glXGetContextGPUIDAMD glXGetContextGPUIDAMD} */
	@JavadocExclude
	public static native int nglXGetContextGPUIDAMD(long ctx, long __functionAddress);

	/**
	 * Determines which GPU a context is attached to.
	 *
	 * @param ctx the GLXContext
	 */
	public static int glXGetContextGPUIDAMD(long ctx) {
		long __functionAddress = getInstance().glXGetContextGPUIDAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(ctx);
		}
		return nglXGetContextGPUIDAMD(ctx, __functionAddress);
	}

	// --- [ glXGetCurrentAssociatedContextAMD ] ---

	/** JNI method for {@link #glXGetCurrentAssociatedContextAMD glXGetCurrentAssociatedContextAMD} */
	@JavadocExclude
	public static native long nglXGetCurrentAssociatedContextAMD(long __functionAddress);

	/** Queries the crrent associated context. */
	public static long glXGetCurrentAssociatedContextAMD() {
		long __functionAddress = getInstance().glXGetCurrentAssociatedContextAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglXGetCurrentAssociatedContextAMD(__functionAddress);
	}

	// --- [ glXGetGPUIDsAMD ] ---

	/** JNI method for {@link #glXGetGPUIDsAMD glXGetGPUIDsAMD} */
	@JavadocExclude
	public static native int nglXGetGPUIDsAMD(int maxCount, int ids, long __functionAddress);

	/**
	 * Queries the IDs for available GPUs.
	 *
	 * @param maxCount 
	 * @param ids      
	 */
	public static int glXGetGPUIDsAMD(int maxCount, int ids) {
		long __functionAddress = getInstance().glXGetGPUIDsAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglXGetGPUIDsAMD(maxCount, ids, __functionAddress);
	}

	// --- [ glXGetGPUInfoAMD ] ---

	/** JNI method for {@link #glXGetGPUInfoAMD glXGetGPUInfoAMD} */
	@JavadocExclude
	public static native int nglXGetGPUInfoAMD(int id, int property, int dataType, int size, long data, long __functionAddress);

	/**
	 * Queries GPU properties.
	 *
	 * @param id       
	 * @param property 
	 * @param dataType 
	 * @param size     
	 * @param data     
	 */
	public static int glXGetGPUInfoAMD(int id, int property, int dataType, int size, ByteBuffer data) {
		long __functionAddress = getInstance().glXGetGPUInfoAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglXGetGPUInfoAMD(id, property, dataType, size, memAddress(data), __functionAddress);
	}

	// --- [ glXMakeAssociatedContextCurrentAMD ] ---

	/** JNI method for {@link #glXMakeAssociatedContextCurrentAMD glXMakeAssociatedContextCurrentAMD} */
	@JavadocExclude
	public static native int nglXMakeAssociatedContextCurrentAMD(long ctx, long __functionAddress);

	/**
	 * Makes an associated context current in the current thread.
	 *
	 * @param ctx the GLXContext
	 */
	public static int glXMakeAssociatedContextCurrentAMD(long ctx) {
		long __functionAddress = getInstance().glXMakeAssociatedContextCurrentAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(ctx);
		}
		return nglXMakeAssociatedContextCurrentAMD(ctx, __functionAddress);
	}

}