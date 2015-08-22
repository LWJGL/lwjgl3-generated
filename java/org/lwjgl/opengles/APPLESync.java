/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class APPLESync {

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

	/** Function address. */
	@JavadocExclude
	public final long
		FenceSyncAPPLE,
		IsSyncAPPLE,
		DeleteSyncAPPLE,
		ClientWaitSyncAPPLE,
		WaitSyncAPPLE,
		GetInteger64vAPPLE,
		GetSyncivAPPLE;

	@JavadocExclude
	public APPLESync(FunctionProvider provider) {
		FenceSyncAPPLE = provider.getFunctionAddress("glFenceSyncAPPLE");
		IsSyncAPPLE = provider.getFunctionAddress("glIsSyncAPPLE");
		DeleteSyncAPPLE = provider.getFunctionAddress("glDeleteSyncAPPLE");
		ClientWaitSyncAPPLE = provider.getFunctionAddress("glClientWaitSyncAPPLE");
		WaitSyncAPPLE = provider.getFunctionAddress("glWaitSyncAPPLE");
		GetInteger64vAPPLE = provider.getFunctionAddress("glGetInteger64vAPPLE");
		GetSyncivAPPLE = provider.getFunctionAddress("glGetSyncivAPPLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link APPLESync} instance for the current context. */
	public static APPLESync getInstance() {
		return checkFunctionality(GLES.getCapabilities().__APPLESync);
	}

	static APPLESync create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_APPLE_sync") ) return null;

		APPLESync funcs = new APPLESync(provider);
		boolean supported = checkFunctions(
			funcs.FenceSyncAPPLE, funcs.IsSyncAPPLE, funcs.DeleteSyncAPPLE, funcs.ClientWaitSyncAPPLE, funcs.WaitSyncAPPLE, funcs.GetInteger64vAPPLE, 
			funcs.GetSyncivAPPLE
		);

		return GLES.checkExtension("GL_APPLE_sync", funcs, supported);
	}

	// --- [ glFenceSyncAPPLE ] ---

	public static long glFenceSyncAPPLE(int condition, int flags) {
		long __functionAddress = getInstance().FenceSyncAPPLE;
		return callIIP(__functionAddress, condition, flags);
	}

	// --- [ glIsSyncAPPLE ] ---

	public static boolean glIsSyncAPPLE(long sync) {
		long __functionAddress = getInstance().IsSyncAPPLE;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		return callPZ(__functionAddress, sync);
	}

	// --- [ glDeleteSyncAPPLE ] ---

	public static void glDeleteSyncAPPLE(long sync) {
		long __functionAddress = getInstance().DeleteSyncAPPLE;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		callPV(__functionAddress, sync);
	}

	// --- [ glClientWaitSyncAPPLE ] ---

	public static int glClientWaitSyncAPPLE(long sync, int flags, long timeout) {
		long __functionAddress = getInstance().ClientWaitSyncAPPLE;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		return callPIJI(__functionAddress, sync, flags, timeout);
	}

	// --- [ glWaitSyncAPPLE ] ---

	public static void glWaitSyncAPPLE(long sync, int flags, long timeout) {
		long __functionAddress = getInstance().WaitSyncAPPLE;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		callPIJV(__functionAddress, sync, flags, timeout);
	}

	// --- [ glGetInteger64vAPPLE ] ---

	/** Unsafe version of {@link #glGetInteger64vAPPLE GetInteger64vAPPLE} */
	@JavadocExclude
	public static void nglGetInteger64vAPPLE(int pname, long params) {
		long __functionAddress = getInstance().GetInteger64vAPPLE;
		callIPV(__functionAddress, pname, params);
	}

	public static void glGetInteger64vAPPLE(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetInteger64vAPPLE(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetInteger64vAPPLE GetInteger64vAPPLE} */
	public static void glGetInteger64vAPPLE(int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetInteger64vAPPLE(pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetInteger64vAPPLE GetInteger64vAPPLE} */
	public static long glGetInteger64APPLE(int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetInteger64vAPPLE(pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetSyncivAPPLE ] ---

	/** Unsafe version of {@link #glGetSyncivAPPLE GetSyncivAPPLE} */
	@JavadocExclude
	public static void nglGetSyncivAPPLE(long sync, int pname, int bufSize, long length, long values) {
		long __functionAddress = getInstance().GetSyncivAPPLE;
		if ( LWJGLUtil.CHECKS )
			checkPointer(sync);
		callPIIPPV(__functionAddress, sync, pname, bufSize, length, values);
	}

	public static void glGetSyncivAPPLE(long sync, int pname, int bufSize, ByteBuffer length, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(values, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetSyncivAPPLE(sync, pname, bufSize, memAddressSafe(length), memAddress(values));
	}

	/** Alternative version of: {@link #glGetSyncivAPPLE GetSyncivAPPLE} */
	public static void glGetSyncivAPPLE(long sync, int pname, IntBuffer length, IntBuffer values) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetSyncivAPPLE(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
	}

	/** Single return value version of: {@link #glGetSyncivAPPLE GetSyncivAPPLE} */
	public static int glGetSynciAPPLE(long sync, int pname, IntBuffer length) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		nglGetSyncivAPPLE(sync, pname, 1, memAddressSafe(length), __buffer.address(values));
		return __buffer.intValue(values);
	}

}