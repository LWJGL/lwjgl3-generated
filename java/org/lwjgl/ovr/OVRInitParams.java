/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A complete descriptor of the HMD. */
public final class OVRInitParams implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		REQUESTEDMINORVERSION,
		LOGCALLBACK,
		CONNECTIONTIMEOUTMS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		FLAGS = offsets.get(0);
		REQUESTEDMINORVERSION = offsets.get(1);
		LOGCALLBACK = offsets.get(2);
		CONNECTIONTIMEOUTMS = offsets.get(3);
	}

	private final ByteBuffer struct;

	public OVRInitParams() {
		this(malloc());
	}

	public OVRInitParams(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setFlags(int Flags) { Flags(struct, Flags); }
	public void setRequestedMinorVersion(int RequestedMinorVersion) { RequestedMinorVersion(struct, RequestedMinorVersion); }
	public void setLogCallback(long LogCallback) { LogCallback(struct, LogCallback); }
	public void setConnectionTimeoutMS(int ConnectionTimeoutMS) { ConnectionTimeoutMS(struct, ConnectionTimeoutMS); }

	public int getFlags() { return Flags(struct); }
	public int getRequestedMinorVersion() { return RequestedMinorVersion(struct); }
	public long getLogCallback() { return LogCallback(struct); }
	public int getConnectionTimeoutMS() { return ConnectionTimeoutMS(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int Flags,
		int RequestedMinorVersion,
		long LogCallback,
		int ConnectionTimeoutMS
	) {
		ByteBuffer ovrinitparams = malloc();

		Flags(ovrinitparams, Flags);
		RequestedMinorVersion(ovrinitparams, RequestedMinorVersion);
		LogCallback(ovrinitparams, LogCallback);
		ConnectionTimeoutMS(ovrinitparams, ConnectionTimeoutMS);

		return ovrinitparams;
	}

	public static void Flags(ByteBuffer ovrinitparams, int Flags) { ovrinitparams.putInt(ovrinitparams.position() + FLAGS, Flags); }
	public static void RequestedMinorVersion(ByteBuffer ovrinitparams, int RequestedMinorVersion) { ovrinitparams.putInt(ovrinitparams.position() + REQUESTEDMINORVERSION, RequestedMinorVersion); }
	public static void LogCallback(ByteBuffer ovrinitparams, long LogCallback) { PointerBuffer.put(ovrinitparams, ovrinitparams.position() + LOGCALLBACK, LogCallback); }
	public static void ConnectionTimeoutMS(ByteBuffer ovrinitparams, int ConnectionTimeoutMS) { ovrinitparams.putInt(ovrinitparams.position() + CONNECTIONTIMEOUTMS, ConnectionTimeoutMS); }

	public static int Flags(ByteBuffer ovrinitparams) { return ovrinitparams.getInt(ovrinitparams.position() + FLAGS); }
	public static int RequestedMinorVersion(ByteBuffer ovrinitparams) { return ovrinitparams.getInt(ovrinitparams.position() + REQUESTEDMINORVERSION); }
	public static long LogCallback(ByteBuffer ovrinitparams) { return PointerBuffer.get(ovrinitparams, ovrinitparams.position() + LOGCALLBACK); }
	public static int ConnectionTimeoutMS(ByteBuffer ovrinitparams) { return ovrinitparams.getInt(ovrinitparams.position() + CONNECTIONTIMEOUTMS); }

}