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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/sync.txt">ARB_sync</a> extension.
 * 
 * <p>This extension introduces the concept of "sync objects". Sync objects are a synchronization primitive - a representation of events whose completion
 * status can be tested or waited upon. One specific type of sync object, the "fence sync object", is supported in this extension, and additional types can
 * easily be added in the future.</p>
 * 
 * <p>Fence sync objects have corresponding fences, which are inserted into the OpenGL command stream at the time the sync object is created. A sync object
 * can be queried for a given condition. The only condition supported for fence sync objects is completion of the corresponding fence command. Fence
 * completion allows applications to request a partial Finish, wherein all commands prior to the fence will be forced to complete before control is
 * returned to the calling process.</p>
 * 
 * <p>These new mechanisms allow for synchronization between the host CPU and the GPU, which may be accessing the same resources (typically memory), as well
 * as between multiple GL contexts bound to multiple threads in the host CPU.</p>
 * 
 * <p>Requires {@link GL31 OpenGL 3.1}. Promoted to core in {@link GL32 OpenGL 3.2}.</p>
 */
public class ARBSync {

	/** Accepted as the {@code pname} parameter of GetInteger64v. */
	public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;

	/** Accepted as the {@code pname} parameter of GetSynciv. */
	public static final int
		GL_OBJECT_TYPE    = 0x9112,
		GL_SYNC_CONDITION = 0x9113,
		GL_SYNC_STATUS    = 0x9114,
		GL_SYNC_FLAGS     = 0x9115;

	/** Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE. */
	public static final int GL_SYNC_FENCE = 0x9116;

	/** Returned in {@code values} for GetSynciv {@code pname} SYNC_CONDITION. */
	public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;

	/** Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS. */
	public static final int
		GL_UNSIGNALED = 0x9118,
		GL_SIGNALED   = 0x9119;

	/** Accepted in the {@code flags} parameter of ClientWaitSync. */
	public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x1;

	/** Accepted in the {@code timeout} parameter of WaitSync. */
	public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFl;

	/** Returned by ClientWaitSync. */
	public static final int
		GL_ALREADY_SIGNALED    = 0x911A,
		GL_TIMEOUT_EXPIRED     = 0x911B,
		GL_CONDITION_SATISFIED = 0x911C,
		GL_WAIT_FAILED         = 0x911D;

	protected ARBSync() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glFenceSync, caps.glIsSync, caps.glDeleteSync, caps.glClientWaitSync, caps.glWaitSync, caps.glGetInteger64v, caps.glGetSynciv
		);
	}

	// --- [ glFenceSync ] ---

	/**
	 * Creates a new sync object and inserts it into the GL command stream.
	 *
	 * @param condition the condition that must be met to set the sync object's state to signaled. Must be:<br><table><tr><td>{@link #GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE}</td></tr></table>
	 * @param flags     a bitwise combination of flags controlling the behavior of the sync object. No flags are presently defined for this operation and {@code flags} must
	 *                  be zero.
	 */
	public static long glFenceSync(int condition, int flags) {
		long __functionAddress = GL.getCapabilities().glFenceSync;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress, condition, flags);
	}

	// --- [ glIsSync ] ---

	/**
	 * Determines if a name corresponds to a sync object.
	 *
	 * @param sync a value that may be the name of a sync object
	 */
	public static boolean glIsSync(long sync) {
		long __functionAddress = GL.getCapabilities().glIsSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPZ(__functionAddress, sync);
	}

	// --- [ glDeleteSync ] ---

	/**
	 * Deletes a sync object.
	 *
	 * @param sync the sync object to be deleted
	 */
	public static void glDeleteSync(long sync) {
		long __functionAddress = GL.getCapabilities().glDeleteSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPV(__functionAddress, sync);
	}

	// --- [ glClientWaitSync ] ---

	/**
	 * Causes the client to block and wait for a sync object to become signaled. If {@code sync} is signaled when {@code glClientWaitSync} is called,
	 * {@code glClientWaitSync} returns immediately, otherwise it will block and wait for up to timeout nanoseconds for {@code sync} to become signaled.
	 * 
	 * <p>The return value is one of four status values:</p>
	 * 
	 * <ul>
	 * <li>{@link #GL_ALREADY_SIGNALED ALREADY_SIGNALED} indicates that sync was signaled at the time that glClientWaitSync was called.</li>
	 * <li>{@link #GL_TIMEOUT_EXPIRED TIMEOUT_EXPIRED} indicates that at least timeout nanoseconds passed and sync did not become signaled.</li>
	 * <li>{@link #GL_CONDITION_SATISFIED CONDITION_SATISFIED} indicates that sync was signaled before the timeout expired.</li>
	 * <li>{@link #GL_WAIT_FAILED WAIT_FAILED} indicates that an error occurred. Additionally, an OpenGL error will be generated.</li>
	 * </ul>
	 *
	 * @param sync    the sync object whose status to wait on
	 * @param flags   a bitfield controlling the command flushing behavior. One or more of:<br><table><tr><td>0</td><td>{@link #GL_SYNC_FLUSH_COMMANDS_BIT SYNC_FLUSH_COMMANDS_BIT}</td></tr></table>
	 * @param timeout the timeout, specified in nanoseconds, for which the implementation should wait for {@code sync} to become signaled
	 */
	public static int glClientWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = GL.getCapabilities().glClientWaitSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		return callPJI(__functionAddress, sync, flags, timeout);
	}

	// --- [ glWaitSync ] ---

	/**
	 * Causes the GL server to block and wait for a sync object to become signaled.
	 * 
	 * <p>{@code glWaitSync} will always wait no longer than an implementation-dependent timeout. The duration of this timeout in nanoseconds may be queried by
	 * with {@link #GL_MAX_SERVER_WAIT_TIMEOUT MAX_SERVER_WAIT_TIMEOUT}. There is currently no way to determine whether glWaitSync unblocked because the timeout expired or because the
	 * sync object being waited on was signaled.</p>
	 * 
	 * <p>If an error occurs, {@code glWaitSync} does not cause the GL server to block.</p>
	 *
	 * @param sync    the sync object whose status to wait on
	 * @param flags   a bitfield controlling the command flushing behavior. Must be:<br><table><tr><td>0</td></tr></table>
	 * @param timeout the timeout that the server should wait before continuing. Must be:<br><table><tr><td>{@link #GL_TIMEOUT_IGNORED TIMEOUT_IGNORED}</td></tr></table>
	 */
	public static void glWaitSync(long sync, int flags, long timeout) {
		long __functionAddress = GL.getCapabilities().glWaitSync;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPJV(__functionAddress, sync, flags, timeout);
	}

	// --- [ glGetInteger64v ] ---

	/**
	 * Returns the 64bit integer value or values of a selected parameter.
	 *
	 * @param pname  the parameter value to be returned
	 * @param params the value or values of the specified parameter
	 */
	public static void nglGetInteger64v(int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetInteger64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pname, params);
	}

	/**
	 * Returns the 64bit integer value or values of a selected parameter.
	 *
	 * @param pname  the parameter value to be returned
	 * @param params the value or values of the specified parameter
	 */
	public static void glGetInteger64v(int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetInteger64v(pname, memAddress(params));
	}

	/**
	 * Returns the 64bit integer value or values of a selected parameter.
	 *
	 * @param pname the parameter value to be returned
	 */
	public static long glGetInteger64(int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetInteger64v(pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSynciv ] ---

	/**
	 * Queries the properties of a sync object.
	 *
	 * @param sync    the sync object whose properties to query
	 * @param pname   the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<br><table><tr><td>{@link #GL_OBJECT_TYPE OBJECT_TYPE}</td><td>{@link #GL_SYNC_CONDITION SYNC_CONDITION}</td><td>{@link #GL_SYNC_STATUS SYNC_STATUS}</td><td>{@link #GL_SYNC_FLAGS SYNC_FLAGS}</td></tr></table>
	 * @param bufSize the size of the buffer whose address is given in {@code values}
	 * @param length  the address of an variable to receive the number of integers placed in {@code values}
	 * @param values  the address of an array to receive the values of the queried parameter
	 */
	public static void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
		long __functionAddress = GL.getCapabilities().glGetSynciv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
		}
		callPPPV(__functionAddress, sync, pname, bufSize, length, values);
	}

	/**
	 * Queries the properties of a sync object.
	 *
	 * @param sync   the sync object whose properties to query
	 * @param pname  the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<br><table><tr><td>{@link #GL_OBJECT_TYPE OBJECT_TYPE}</td><td>{@link #GL_SYNC_CONDITION SYNC_CONDITION}</td><td>{@link #GL_SYNC_STATUS SYNC_STATUS}</td><td>{@link #GL_SYNC_FLAGS SYNC_FLAGS}</td></tr></table>
	 * @param length the address of an variable to receive the number of integers placed in {@code values}
	 * @param values the address of an array to receive the values of the queried parameter
	 */
	public static void glGetSynciv(long sync, int pname, IntBuffer length, IntBuffer values) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
	}

	/**
	 * Queries the properties of a sync object.
	 *
	 * @param sync   the sync object whose properties to query
	 * @param pname  the parameter whose value to retrieve from the sync object specified in {@code sync}. One of:<br><table><tr><td>{@link #GL_OBJECT_TYPE OBJECT_TYPE}</td><td>{@link #GL_SYNC_CONDITION SYNC_CONDITION}</td><td>{@link #GL_SYNC_STATUS SYNC_STATUS}</td><td>{@link #GL_SYNC_FLAGS SYNC_FLAGS}</td></tr></table>
	 * @param length the address of an variable to receive the number of integers placed in {@code values}
	 */
	public static int glGetSynci(long sync, int pname, IntBuffer length) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer values = stack.callocInt(1);
			nglGetSynciv(sync, pname, 1, memAddressSafe(length), memAddress(values));
			return values.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glGetInteger64v GetInteger64v} */
	public static void glGetInteger64v(int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetInteger64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, pname, params);
	}

	/** Array version of: {@link #glGetSynciv GetSynciv} */
	public static void glGetSynciv(long sync, int pname, int[] length, int[] values) {
		long __functionAddress = GL.getCapabilities().glGetSynciv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(sync);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPPV(__functionAddress, sync, pname, values.length, length, values);
	}

}