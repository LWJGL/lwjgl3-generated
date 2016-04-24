/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/fence.txt">NV_fence</a> extension.
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
public class NVFence {

	/** Accepted by the {@code condition} parameter of SetFenceNV. */
	public static final int GL_ALL_COMPLETED_NV = 0x84F2;

	/** Accepted by the {@code pname} parameter of GetFenceivNV. */
	public static final int
		GL_FENCE_STATUS_NV    = 0x84F3,
		GL_FENCE_CONDITION_NV = 0x84F4;

	protected NVFence() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glDeleteFencesNV, caps.glGenFencesNV, caps.glIsFenceNV, caps.glTestFenceNV, caps.glGetFenceivNV, caps.glFinishFenceNV, caps.glSetFenceNV
		);
	}

	// --- [ glDeleteFencesNV ] ---

	public static void nglDeleteFencesNV(int n, long fences) {
		long __functionAddress = GLES.getCapabilities().glDeleteFencesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, fences);
	}

	public static void glDeleteFencesNV(IntBuffer fences) {
		nglDeleteFencesNV(fences.remaining(), memAddress(fences));
	}

	public static void glDeleteFencesNV(int fence) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer fences = stack.ints(fence);
			nglDeleteFencesNV(1, memAddress(fences));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenFencesNV ] ---

	public static void nglGenFencesNV(int n, long fences) {
		long __functionAddress = GLES.getCapabilities().glGenFencesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, fences);
	}

	public static void glGenFencesNV(IntBuffer fences) {
		nglGenFencesNV(fences.remaining(), memAddress(fences));
	}

	public static int glGenFencesNV() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer fences = stack.callocInt(1);
			nglGenFencesNV(1, memAddress(fences));
			return fences.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsFenceNV ] ---

	public static boolean glIsFenceNV(int fence) {
		long __functionAddress = GLES.getCapabilities().glIsFenceNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, fence);
	}

	// --- [ glTestFenceNV ] ---

	public static boolean glTestFenceNV(int fence) {
		long __functionAddress = GLES.getCapabilities().glTestFenceNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, fence);
	}

	// --- [ glGetFenceivNV ] ---

	public static void nglGetFenceivNV(int fence, int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetFenceivNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, fence, pname, params);
	}

	public static void glGetFenceivNV(int fence, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetFenceivNV(fence, pname, memAddress(params));
	}

	public static int glGetFenceiNV(int fence, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetFenceivNV(fence, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glFinishFenceNV ] ---

	public static void glFinishFenceNV(int fence) {
		long __functionAddress = GLES.getCapabilities().glFinishFenceNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, fence);
	}

	// --- [ glSetFenceNV ] ---

	public static void glSetFenceNV(int fence, int condition) {
		long __functionAddress = GLES.getCapabilities().glSetFenceNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, fence, condition);
	}

	/** Array version of: {@link #glDeleteFencesNV DeleteFencesNV} */
	public static void glDeleteFencesNV(int[] fences) {
		long __functionAddress = GLES.getCapabilities().glDeleteFencesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, fences.length, fences);
	}

	/** Array version of: {@link #glGenFencesNV GenFencesNV} */
	public static void glGenFencesNV(int[] fences) {
		long __functionAddress = GLES.getCapabilities().glGenFencesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, fences.length, fences);
	}

	/** Array version of: {@link #glGetFenceivNV GetFenceivNV} */
	public static void glGetFenceivNV(int fence, int pname, int[] params) {
		long __functionAddress = GLES.getCapabilities().glGetFenceivNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, fence, pname, params);
	}

}