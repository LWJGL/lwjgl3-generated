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

/** Parameters for {@link OVR#ovr_Initialize}. */
public final class OVRInitParams implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		REQUESTEDMINORVERSION,
		LOGCALLBACK,
		USERDATA,
		CONNECTIONTIMEOUTMS;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		FLAGS = offsets.get(0);
		REQUESTEDMINORVERSION = offsets.get(1);
		LOGCALLBACK = offsets.get(2);
		USERDATA = offsets.get(3);
		CONNECTIONTIMEOUTMS = offsets.get(4);

		memFree(offsets);
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

	public OVRInitParams setFlags(int Flags) { Flags(struct, Flags); return this; }
	public OVRInitParams setRequestedMinorVersion(int RequestedMinorVersion) { RequestedMinorVersion(struct, RequestedMinorVersion); return this; }
	public OVRInitParams setLogCallback(long LogCallback) { LogCallback(struct, LogCallback); return this; }
	public OVRInitParams setUserData(long UserData) { UserData(struct, UserData); return this; }
	public OVRInitParams setConnectionTimeoutMS(int ConnectionTimeoutMS) { ConnectionTimeoutMS(struct, ConnectionTimeoutMS); return this; }

	public int getFlags() { return Flags(struct); }
	public int getRequestedMinorVersion() { return RequestedMinorVersion(struct); }
	public long getLogCallback() { return LogCallback(struct); }
	public long getUserData() { return UserData(struct); }
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
		long UserData,
		int ConnectionTimeoutMS
	) {
		ByteBuffer ovrinitparams = malloc();

		Flags(ovrinitparams, Flags);
		RequestedMinorVersion(ovrinitparams, RequestedMinorVersion);
		LogCallback(ovrinitparams, LogCallback);
		UserData(ovrinitparams, UserData);
		ConnectionTimeoutMS(ovrinitparams, ConnectionTimeoutMS);

		return ovrinitparams;
	}

	public static void Flags(ByteBuffer ovrinitparams, int Flags) { ovrinitparams.putInt(ovrinitparams.position() + FLAGS, Flags); }
	public static void RequestedMinorVersion(ByteBuffer ovrinitparams, int RequestedMinorVersion) { ovrinitparams.putInt(ovrinitparams.position() + REQUESTEDMINORVERSION, RequestedMinorVersion); }
	public static void LogCallback(ByteBuffer ovrinitparams, long LogCallback) { PointerBuffer.put(ovrinitparams, ovrinitparams.position() + LOGCALLBACK, LogCallback); }
	public static void UserData(ByteBuffer ovrinitparams, long UserData) { PointerBuffer.put(ovrinitparams, ovrinitparams.position() + USERDATA, UserData); }
	public static void ConnectionTimeoutMS(ByteBuffer ovrinitparams, int ConnectionTimeoutMS) { ovrinitparams.putInt(ovrinitparams.position() + CONNECTIONTIMEOUTMS, ConnectionTimeoutMS); }

	public static int Flags(ByteBuffer ovrinitparams) { return ovrinitparams.getInt(ovrinitparams.position() + FLAGS); }
	public static int RequestedMinorVersion(ByteBuffer ovrinitparams) { return ovrinitparams.getInt(ovrinitparams.position() + REQUESTEDMINORVERSION); }
	public static long LogCallback(ByteBuffer ovrinitparams) { return PointerBuffer.get(ovrinitparams, ovrinitparams.position() + LOGCALLBACK); }
	public static long UserData(ByteBuffer ovrinitparams) { return PointerBuffer.get(ovrinitparams, ovrinitparams.position() + USERDATA); }
	public static int ConnectionTimeoutMS(ByteBuffer ovrinitparams) { return ovrinitparams.getInt(ovrinitparams.position() + CONNECTIONTIMEOUTMS); }

}