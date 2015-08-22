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
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/fence.txt">NV_fence</a> extension.
 * 
 * <p>The goal of this extension is provide a finer granularity of synchronizing GL command completion than offered by standard OpenGL, which offers only two
 * mechanisms for synchronization: Flush and Finish. Since Flush merely assures the user that the commands complete in a finite (though undetermined)
 * amount of time, it is, thus, of only modest utility. Finish, on the other hand, stalls CPU execution until all pending GL commands have completed. This
 * extension offers a middle ground - the ability to "finish" a subset of the command stream, and the ability to determine whether a given command has
 * completed or not.</p>
 * 
 * <p>This extension introduces the concept of a "fence" to the OpenGL command stream. Once the fence is inserted into the command stream, it can be queried
 * for a given condition - typically, its completion. Moreover, the application may also request a partial Finish -- that is, all commands prior to the
 * fence will be forced to complete until control is returned to the calling process. These new mechanisms allow for synchronization between the host CPU
 * and the GPU, which may be accessing the same resources (typically memory).</p>
 * 
 * <p>This extension is useful in conjunction with NV_vertex_array_range to determine when vertex information has been pulled from the vertex array range.
 * Once a fence has been tested TRUE or finished, all vertex indices issued before the fence must have been pulled. This ensures that the vertex data
 * memory corresponding to the issued vertex indices can be safely modified (assuming no other outstanding vertex indices are issued subsequent to the
 * fence).</p>
 */
public final class NVFence {

	/** Accepted by the {@code condition} parameter of SetFenceNV. */
	public static final int GL_ALL_COMPLETED_NV = 0x84F2;

	/** Accepted by the {@code pname} parameter of GetFenceivNV. */
	public static final int
		GL_FENCE_STATUS_NV    = 0x84F3,
		GL_FENCE_CONDITION_NV = 0x84F4;

	/** Function address. */
	@JavadocExclude
	public final long
		DeleteFencesNV,
		GenFencesNV,
		IsFenceNV,
		TestFenceNV,
		GetFenceivNV,
		FinishFenceNV,
		SetFenceNV;

	@JavadocExclude
	public NVFence(FunctionProvider provider) {
		DeleteFencesNV = provider.getFunctionAddress("glDeleteFencesNV");
		GenFencesNV = provider.getFunctionAddress("glGenFencesNV");
		IsFenceNV = provider.getFunctionAddress("glIsFenceNV");
		TestFenceNV = provider.getFunctionAddress("glTestFenceNV");
		GetFenceivNV = provider.getFunctionAddress("glGetFenceivNV");
		FinishFenceNV = provider.getFunctionAddress("glFinishFenceNV");
		SetFenceNV = provider.getFunctionAddress("glSetFenceNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVFence} instance for the current context. */
	public static NVFence getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVFence);
	}

	static NVFence create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_fence") ) return null;

		NVFence funcs = new NVFence(provider);

		boolean supported = checkFunctions(
			funcs.DeleteFencesNV, funcs.GenFencesNV, funcs.IsFenceNV, funcs.TestFenceNV, funcs.GetFenceivNV, funcs.FinishFenceNV, funcs.SetFenceNV
		);

		return GL.checkExtension("GL_NV_fence", funcs, supported);
	}

	// --- [ glDeleteFencesNV ] ---

	/** Unsafe version of {@link #glDeleteFencesNV DeleteFencesNV} */
	@JavadocExclude
	public static void nglDeleteFencesNV(int n, long fences) {
		long __functionAddress = getInstance().DeleteFencesNV;
		callIPV(__functionAddress, n, fences);
	}

	public static void glDeleteFencesNV(int n, ByteBuffer fences) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(fences, n << 2);
		nglDeleteFencesNV(n, memAddress(fences));
	}

	/** Alternative version of: {@link #glDeleteFencesNV DeleteFencesNV} */
	public static void glDeleteFencesNV(IntBuffer fences) {
		nglDeleteFencesNV(fences.remaining(), memAddress(fences));
	}

	/** Single value version of: {@link #glDeleteFencesNV DeleteFencesNV} */
	public static void glDeleteFencesNV(int fence) {
		APIBuffer __buffer = apiBuffer();
		int fences = __buffer.intParam(fence);
		nglDeleteFencesNV(1, __buffer.address(fences));
	}

	// --- [ glGenFencesNV ] ---

	/** Unsafe version of {@link #glGenFencesNV GenFencesNV} */
	@JavadocExclude
	public static void nglGenFencesNV(int n, long fences) {
		long __functionAddress = getInstance().GenFencesNV;
		callIPV(__functionAddress, n, fences);
	}

	public static void glGenFencesNV(int n, ByteBuffer fences) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(fences, n << 2);
		nglGenFencesNV(n, memAddress(fences));
	}

	/** Alternative version of: {@link #glGenFencesNV GenFencesNV} */
	public static void glGenFencesNV(IntBuffer fences) {
		nglGenFencesNV(fences.remaining(), memAddress(fences));
	}

	/** Single return value version of: {@link #glGenFencesNV GenFencesNV} */
	public static int glGenFencesNV() {
		APIBuffer __buffer = apiBuffer();
		int fences = __buffer.intParam();
		nglGenFencesNV(1, __buffer.address(fences));
		return __buffer.intValue(fences);
	}

	// --- [ glIsFenceNV ] ---

	public static boolean glIsFenceNV(int fence) {
		long __functionAddress = getInstance().IsFenceNV;
		return callIZ(__functionAddress, fence);
	}

	// --- [ glTestFenceNV ] ---

	public static boolean glTestFenceNV(int fence) {
		long __functionAddress = getInstance().TestFenceNV;
		return callIZ(__functionAddress, fence);
	}

	// --- [ glGetFenceivNV ] ---

	/** Unsafe version of {@link #glGetFenceivNV GetFenceivNV} */
	@JavadocExclude
	public static void nglGetFenceivNV(int fence, int pname, long params) {
		long __functionAddress = getInstance().GetFenceivNV;
		callIIPV(__functionAddress, fence, pname, params);
	}

	public static void glGetFenceivNV(int fence, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetFenceivNV(fence, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetFenceivNV GetFenceivNV} */
	public static void glGetFenceivNV(int fence, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetFenceivNV(fence, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetFenceivNV GetFenceivNV} */
	public static int glGetFenceiNV(int fence, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetFenceivNV(fence, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glFinishFenceNV ] ---

	public static void glFinishFenceNV(int fence) {
		long __functionAddress = getInstance().FinishFenceNV;
		callIV(__functionAddress, fence);
	}

	// --- [ glSetFenceNV ] ---

	public static void glSetFenceNV(int fence, int condition) {
		long __functionAddress = getInstance().SetFenceNV;
		callIIV(__functionAddress, fence, condition);
	}

}