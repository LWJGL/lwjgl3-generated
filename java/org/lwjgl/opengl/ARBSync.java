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
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/sync.txt">ARB_sync</a> extension. */
public final class ARBSync {

	/** Accepted as the {@code pname} parameter of GetInteger64v. */
	public static final int
		GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;

	/** Accepted as the {@code pname} parameter of GetSynciv. */
	public static final int
		GL_OBJECT_TYPE    = 0x9112,
		GL_SYNC_CONDITION = 0x9113,
		GL_SYNC_STATUS    = 0x9114,
		GL_SYNC_FLAGS     = 0x9115;

	/** Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE. */
	public static final int
		GL_SYNC_FENCE = 0x9116;

	/** Returned in {@code values} for GetSynciv {@code pname} SYNC_CONDITION. */
	public static final int
		GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;

	/** Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS. */
	public static final int
		GL_UNSIGNALED = 0x9118,
		GL_SIGNALED   = 0x9119;

	/** Accepted in the {@code flags} parameter of ClientWaitSync. */
	public static final int
		GL_SYNC_FLUSH_COMMANDS_BIT = 0x1;

	/** Accepted in the {@code timeout} parameter of WaitSync. */
	public static final long
		GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFl;

	/** Returned by ClientWaitSync. */
	public static final int
		GL_ALREADY_SIGNALED    = 0x911A,
		GL_TIMEOUT_EXPIRED     = 0x911B,
		GL_CONDITION_SATISFIED = 0x911C,
		GL_WAIT_FAILED         = 0x911D;

	/** Function address. */
	@JavadocExclude
	public final long
		glFenceSync,
		glIsSync,
		glDeleteSync,
		glClientWaitSync,
		glWaitSync,
		glGetInteger64v,
		glGetSynciv;

	@JavadocExclude
	public ARBSync(FunctionProvider provider) {
		glFenceSync = provider.getFunctionAddress("glFenceSync");
		glIsSync = provider.getFunctionAddress("glIsSync");
		glDeleteSync = provider.getFunctionAddress("glDeleteSync");
		glClientWaitSync = provider.getFunctionAddress("glClientWaitSync");
		glWaitSync = provider.getFunctionAddress("glWaitSync");
		glGetInteger64v = provider.getFunctionAddress("glGetInteger64v");
		glGetSynciv = provider.getFunctionAddress("glGetSynciv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBSync} instance for the current context. */
	public static ARBSync getInstance() {
		return GL.getCapabilities().__ARBSync;
	}

	static ARBSync create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_sync") ) return null;

		ARBSync funcs = new ARBSync(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glFenceSync) &&
			GL.isFunctionSupported(funcs.glIsSync) &&
			GL.isFunctionSupported(funcs.glDeleteSync) &&
			GL.isFunctionSupported(funcs.glClientWaitSync) &&
			GL.isFunctionSupported(funcs.glWaitSync) &&
			GL.isFunctionSupported(funcs.glGetInteger64v) &&
			GL.isFunctionSupported(funcs.glGetSynciv);

		return GL.checkExtension("GL_ARB_sync", funcs, supported);
	}

	// --- [ glFenceSync ] ---

	/**
	 * Creates a new sync object and inserts it into the GL command stream.
	 *
	 * @param condition the condition that must be met to set the sync object's state to signaled. Must be:<p/>{@link #GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE}
	 * @param flags     a bitwise combination of flags controlling the behavior of the sync object. No flags are presently defined for this operation and {@code flags} must
	 *                  be zero.
	 */
	public static long glFenceSync(int condition, int flags) {
		long __functionAddress = getInstance().glFenceSync;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return GL32.nglFenceSync(condition, flags, __functionAddress);
	}

	// --- [ glIsSync ] ---

	/**
	 * Determines if a name corresponds to a sync object.
	 *
	 * @param sync a value that may be the name of a sync object
	 */
	public static boolean glIsSync(long sync) {
		long __functionAddress = getInstance().glIsSync;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return GL32.nglIsSync(sync, __functionAddress);
	}

	// --- [ glDeleteSync ] ---

	/**
	 * Deletes a sync object.
	 *
	 * @param sync the sync object to be deleted
	 */
	public static void glDeleteSync(long sync) {
		long __functionAddress = getInstance().glDeleteSync;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		GL32.nglDeleteSync(sync, __functionAddress);
	}

	// --- [ glClientWaitSync ] ---

	/**
	 * Causes the client to block and wait for a sync object to become signaled. If {@code sync} is signaled when {@code glClientWaitSync} is called,
	 * {@code glClientWaitSync} returns immediately, otherwise it will block and wait for up to timeout nanoseconds for {@code sync} to become signaled.
	 * <p/>
	 * The return value is one of four status values:
	 * <ul>
	 * <li>{@link #GL_ALREADY_SIGNALED ALREADY_SIGNALED} indicates that sync was signaled at the time that glClientWaitSync was called.</li>
	 * <li>{@link #GL_TIMEOUT_EXPIRED TIMEOUT_EXPIRED} indicates that at least timeout nanoseconds passed and sync did not become signaled.</li>
	 * <li>{@link #GL_CONDITION_SATISFIED CONDITION_SATISFIED} indicates that sync was signaled before the timeout expired.</li>
	 * <li>{@link #GL_WAIT_FAILED WAIT_FAILED} indicates that an error occurred. Additionally, an OpenGL error will be generated.</li>
	 * </ul>
	 *
	 * @param sync    the sync object whose status to wait on
	 * @param flags   a bitfield controlling the command flushing behavior. Must be:<p/>0, {@link #GL_SYNC_FLUSH_COMMANDS_BIT SYNC_FLUSH_COMMANDS_BIT}
	 * @param timeout the timeout, specified in nanoseconds, for which the implementation should wait for {@code sync} to become signaled
	 */
	public static int glClientWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = getInstance().glClientWaitSync;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return GL32.nglClientWaitSync(sync, flags, timeout, __functionAddress);
	}

	// --- [ glWaitSync ] ---

	/**
	 * Causes the GL server to block and wait for a sync object to become signaled.
	 * <p/>
	 * {@code glWaitSync} will always wait no longer than an implementation-dependent timeout. The duration of this timeout in nanoseconds may be queried by
	 * with {@link #GL_MAX_SERVER_WAIT_TIMEOUT MAX_SERVER_WAIT_TIMEOUT}. There is currently no way to determine whether glWaitSync unblocked because the timeout expired or because the
	 * sync object being waited on was signaled.
	 * <p/>
	 * If an error occurs, {@code glWaitSync} does not cause the GL server to block.
	 *
	 * @param sync    the sync object whose status to wait on
	 * @param flags   a bitfield controlling the command flushing behavior. One of:<p/>0
	 * @param timeout the timeout that the server should wait before continuing. Must be:<p/>{@link #GL_TIMEOUT_IGNORED TIMEOUT_IGNORED}
	 */
	public static void glWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = getInstance().glWaitSync;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		GL32.nglWaitSync(sync, flags, timeout, __functionAddress);
	}

	// --- [ glGetInteger64v ] ---

	/**
	 * Returns the 64bit integer value or values of a selected parameter.
	 *
	 * @param pname  the parameter value to be returned
	 * @param params the value or values of the specified parameter
	 */
	public static void glGetInteger64(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetInteger64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL32.nglGetInteger64v(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetInteger64(int, ByteBuffer) glGetInteger64} */
	public static void glGetInteger64(int pname, LongBuffer params) {
		long __functionAddress = getInstance().glGetInteger64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL32.nglGetInteger64v(pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetInteger64(int, ByteBuffer) glGetInteger64} */
	public static long glGetInteger64(int pname) {
		long __functionAddress = getInstance().glGetInteger64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		GL32.nglGetInteger64v(pname, __buffer.address() + params, __functionAddress);
		return __buffer.longValue(params);
	}

	// --- [ glGetSynciv ] ---

	/**
	 * Queries the properties of a sync object.
	 *
	 * @param sync    the sync object whose properties to query
	 * @param pname   the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<p/>{@link #GL_OBJECT_TYPE OBJECT_TYPE}, {@link #GL_SYNC_CONDITION SYNC_CONDITION}, {@link #GL_SYNC_STATUS SYNC_STATUS}, {@link #GL_SYNC_FLAGS SYNC_FLAGS}
	 * @param bufSize the size of the buffer whose address is given in {@code values}
	 * @param length  the address of an variable to receive the number of integers placed in {@code values}
	 * @param values  the address of an array to receive the values of the queried parameter
	 */
	public static void glGetSynci(long sync, int pname, int bufSize, ByteBuffer length, ByteBuffer values) {
		long __functionAddress = getInstance().glGetSynciv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			checkBuffer(values, bufSize << 2);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		GL32.nglGetSynciv(sync, pname, bufSize, memAddressSafe(length), memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #glGetSynci(long, int, int, ByteBuffer, ByteBuffer) glGetSynci} */
	public static void glGetSync(long sync, int pname, IntBuffer length, IntBuffer values) {
		long __functionAddress = getInstance().glGetSynciv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( length != null ) checkBuffer(length, 1);
		}
		GL32.nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values), __functionAddress);
	}

	/** Single return value version of: {@link #glGetSynci(long, int, int, ByteBuffer, ByteBuffer) glGetSynci} */
	public static int glGetSynci(long sync, int pname, IntBuffer length) {
		long __functionAddress = getInstance().glGetSynciv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( length != null ) checkBuffer(length, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int values = __buffer.intParam();
		GL32.nglGetSynciv(sync, pname, 1, memAddressSafe(length), __buffer.address() + values, __functionAddress);
		return __buffer.intValue(values);
	}

}