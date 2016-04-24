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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/APPLE/APPLE_sync.txt">APPLE_sync</a> extension.
 * 
 * <p>This extension introduces the concept of "sync objects". Sync objects are a synchronization primitive - a representation of events whose completion
 * status can be tested or waited upon. One specific type of sync object, the "fence sync object", is supported in this extension, and additional types
 * can easily be added in the future.</p>
 * 
 * <p>Fence sync objects have corresponding fences, which are inserted into the OpenGL command stream at the time the sync object is created. A sync object
 * can be queried for a given condition. The only condition supported for fence sync objects is completion of the corresponding fence command. Fence
 * completion allows applications to request a partial Finish, wherein all commands prior to the fence will be forced to complete before control is
 * returned to the calling process.</p>
 * 
 * <p>These new mechanisms allow for synchronization between the host CPU and the GPU, which may be accessing the same resources (typically memory), as well
 * as between multiple GL contexts bound to multiple threads in the host CPU.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class APPLESync {

	/** Accepted as the {@code pname} parameter of GetInteger64vAPPLE. */
	public static final int GL_MAX_SERVER_WAIT_TIMEOUT_APPLE = 0x9111;

	/** Accepted as the {@code pname} parameter of GetSyncivAPPLE. */
	public static final int
		GL_OBJECT_TYPE_APPLE    = 0x9112,
		GL_SYNC_CONDITION_APPLE = 0x9113,
		GL_SYNC_STATUS_APPLE    = 0x9114,
		GL_SYNC_FLAGS_APPLE     = 0x9115;

	/** Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE_APPLE. */
	public static final int GL_SYNC_FENCE_APPLE = 0x9116;

	/** Returned in {@code values} for GetSyncivAPPLE {@code pname} SYNC_CONDITION_APPLE. */
	public static final int GL_SYNC_GPU_COMMANDS_COMPLETE_APPLE = 0x9117;

	/** Returned in {@code values} for GetSyncivAPPLE {@code pname} SYNC_STATUS_APPLE. */
	public static final int
		GL_UNSIGNALED_APPLE = 0x9118,
		GL_SIGNALED_APPLE   = 0x9119;

	/** Accepted in the {@code flags} parameter of ClientWaitSyncAPPLE. */
	public static final int GL_SYNC_FLUSH_COMMANDS_BIT_APPLE = 0x1;

	/** Accepted in the {@code timeout} parameter of WaitSyncAPPLE. */
	public static final long GL_TIMEOUT_IGNORED_APPLE = 0xFFFFFFFFFFFFFFFFL;

	/** Returned by ClientWaitSyncAPPLE. */
	public static final int
		GL_ALREADY_SIGNALED_APPLE    = 0x911A,
		GL_TIMEOUT_EXPIRED_APPLE     = 0x911B,
		GL_CONDITION_SATISFIED_APPLE = 0x911C,
		GL_WAIT_FAILED_APPLE         = 0x911D;

	/** Accepted by the {@code type} parameter of LabelObjectEXT and GetObjectLabelEXT. */
	public static final int GL_SYNC_OBJECT_APPLE = 0x8A53;

	protected APPLESync() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glFenceSyncAPPLE, caps.glIsSyncAPPLE, caps.glDeleteSyncAPPLE, caps.glClientWaitSyncAPPLE, caps.glWaitSyncAPPLE, caps.glGetInteger64vAPPLE, 
			caps.glGetSyncivAPPLE
		);
	}

	// --- [ glFenceSyncAPPLE ] ---

	public static long glFenceSyncAPPLE(int condition, int flags) {
		long __functionAddress = GLES.getCapabilities().glFenceSyncAPPLE;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress, condition, flags);
	}

	// --- [ glIsSyncAPPLE ] ---

	public static boolean glIsSyncAPPLE(long sync) {
		long __functionAddress = GLES.getCapabilities().glIsSyncAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPZ(__functionAddress, sync);
	}

	// --- [ glDeleteSyncAPPLE ] ---

	public static void glDeleteSyncAPPLE(long sync) {
		long __functionAddress = GLES.getCapabilities().glDeleteSyncAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPV(__functionAddress, sync);
	}

	// --- [ glClientWaitSyncAPPLE ] ---

	public static int glClientWaitSyncAPPLE(long sync, int flags, long timeout) {
		long __functionAddress = GLES.getCapabilities().glClientWaitSyncAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPJI(__functionAddress, sync, flags, timeout);
	}

	// --- [ glWaitSyncAPPLE ] ---

	public static void glWaitSyncAPPLE(long sync, int flags, long timeout) {
		long __functionAddress = GLES.getCapabilities().glWaitSyncAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPJV(__functionAddress, sync, flags, timeout);
	}

	// --- [ glGetInteger64vAPPLE ] ---

	public static void nglGetInteger64vAPPLE(int pname, long params) {
		long __functionAddress = GLES.getCapabilities().glGetInteger64vAPPLE;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, params);
	}

	public static void glGetInteger64vAPPLE(int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetInteger64vAPPLE(pname, memAddress(params));
	}

	public static long glGetInteger64APPLE(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetInteger64vAPPLE(pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSyncivAPPLE ] ---

	public static void nglGetSyncivAPPLE(long sync, int pname, int bufSize, long length, long values) {
		long __functionAddress = GLES.getCapabilities().glGetSyncivAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPPPV(__functionAddress, sync, pname, bufSize, length, values);
	}

	public static void glGetSyncivAPPLE(long sync, int pname, IntBuffer length, IntBuffer values) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetSyncivAPPLE(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
	}

	public static int glGetSynciAPPLE(long sync, int pname, IntBuffer length) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer values = stack.callocInt(1);
			nglGetSyncivAPPLE(sync, pname, 1, memAddressSafe(length), memAddress(values));
			return values.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetInteger64vAPPLE GetInteger64vAPPLE} */
	public static void glGetInteger64vAPPLE(int pname, long[] params) {
		long __functionAddress = GLES.getCapabilities().glGetInteger64vAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, pname, params);
	}

	/** Array version of: {@link #glGetSyncivAPPLE GetSyncivAPPLE} */
	public static void glGetSyncivAPPLE(long sync, int pname, int[] length, int[] values) {
		long __functionAddress = GLES.getCapabilities().glGetSyncivAPPLE;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPPV(__functionAddress, sync, pname, values.length, length, values);
	}

}