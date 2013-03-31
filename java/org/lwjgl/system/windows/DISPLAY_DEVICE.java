/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Receives information about the display device specified by the devNum parameter of the {@link WinUser#EnumDisplayDevices} function. */
public final class DISPLAY_DEVICE {


	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		CB,
		DEVICENAME,
		DEVICESTRING,
		STATEFLAGS,
		DEVICEID,
		DEVICEKEY;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		CB = offsets.get(0);
		DEVICENAME = offsets.get(1);
		DEVICESTRING = offsets.get(2);
		STATEFLAGS = offsets.get(3);
		DEVICEID = offsets.get(4);
		DEVICEKEY = offsets.get(5);
	}

	private DISPLAY_DEVICE() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int cb,
		long DeviceName,
		int DeviceNameBytes,
		long DeviceString,
		int DeviceStringBytes,
		int StateFlags,
		long DeviceID,
		int DeviceIDBytes,
		long DeviceKey,
		int DeviceKeyBytes
	) {
		ByteBuffer struct = malloc();

		cbSet(struct, cb);
		DeviceNameSet(struct, DeviceName, DeviceNameBytes);
		DeviceStringSet(struct, DeviceString, DeviceStringBytes);
		StateFlagsSet(struct, StateFlags);
		DeviceIDSet(struct, DeviceID, DeviceIDBytes);
		DeviceKeySet(struct, DeviceKey, DeviceKeyBytes);

		return struct;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int cb,
		ByteBuffer DeviceName,
		ByteBuffer DeviceString,
		int StateFlags,
		ByteBuffer DeviceID,
		ByteBuffer DeviceKey
	) {
		ByteBuffer struct = malloc();

		cbSet(struct, cb);
		DeviceNameSet(struct, DeviceName);
		DeviceStringSet(struct, DeviceString);
		StateFlagsSet(struct, StateFlags);
		DeviceIDSet(struct, DeviceID);
		DeviceKeySet(struct, DeviceKey);

		return struct;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int cb,
		CharSequence DeviceName,
		CharSequence DeviceString,
		int StateFlags,
		CharSequence DeviceID,
		CharSequence DeviceKey
	) {
		ByteBuffer struct = malloc();

		cbSet(struct, cb);
		DeviceNameSet(struct, DeviceName);
		DeviceStringSet(struct, DeviceString);
		StateFlagsSet(struct, StateFlags);
		DeviceIDSet(struct, DeviceID);
		DeviceKeySet(struct, DeviceKey);

		return struct;
	}

	public static void cbSet(ByteBuffer struct, int cb) { struct.putInt(struct.position() + CB, cb); }
	public static void DeviceNameSet(ByteBuffer struct, long DeviceName, int bytes) { memCopy(DeviceName, memAddress(struct) + DEVICENAME, bytes); }
	public static void DeviceNameSet(ByteBuffer struct, ByteBuffer DeviceName) {
		checkNT2(DeviceName);
		checkBufferGT(DeviceName, 32 * 2);
		DeviceNameSet(struct, memAddress(DeviceName), DeviceName.remaining());
	}
	public static void DeviceNameSet(ByteBuffer struct, CharSequence DeviceName) { ByteBuffer buffer = memEncodeUTF16(DeviceName, true); DeviceNameSet(struct, memAddress(buffer), buffer.capacity()); }
	public static void DeviceStringSet(ByteBuffer struct, long DeviceString, int bytes) { memCopy(DeviceString, memAddress(struct) + DEVICESTRING, bytes); }
	public static void DeviceStringSet(ByteBuffer struct, ByteBuffer DeviceString) {
		checkNT2(DeviceString);
		checkBufferGT(DeviceString, 128 * 2);
		DeviceStringSet(struct, memAddress(DeviceString), DeviceString.remaining());
	}
	public static void DeviceStringSet(ByteBuffer struct, CharSequence DeviceString) { ByteBuffer buffer = memEncodeUTF16(DeviceString, true); DeviceStringSet(struct, memAddress(buffer), buffer.capacity()); }
	public static void StateFlagsSet(ByteBuffer struct, int StateFlags) { struct.putInt(struct.position() + STATEFLAGS, StateFlags); }
	public static void DeviceIDSet(ByteBuffer struct, long DeviceID, int bytes) { memCopy(DeviceID, memAddress(struct) + DEVICEID, bytes); }
	public static void DeviceIDSet(ByteBuffer struct, ByteBuffer DeviceID) {
		checkNT2(DeviceID);
		checkBufferGT(DeviceID, 128 * 2);
		DeviceIDSet(struct, memAddress(DeviceID), DeviceID.remaining());
	}
	public static void DeviceIDSet(ByteBuffer struct, CharSequence DeviceID) { ByteBuffer buffer = memEncodeUTF16(DeviceID, true); DeviceIDSet(struct, memAddress(buffer), buffer.capacity()); }
	public static void DeviceKeySet(ByteBuffer struct, long DeviceKey, int bytes) { memCopy(DeviceKey, memAddress(struct) + DEVICEKEY, bytes); }
	public static void DeviceKeySet(ByteBuffer struct, ByteBuffer DeviceKey) {
		checkNT2(DeviceKey);
		checkBufferGT(DeviceKey, 128 * 2);
		DeviceKeySet(struct, memAddress(DeviceKey), DeviceKey.remaining());
	}
	public static void DeviceKeySet(ByteBuffer struct, CharSequence DeviceKey) { ByteBuffer buffer = memEncodeUTF16(DeviceKey, true); DeviceKeySet(struct, memAddress(buffer), buffer.capacity()); }

	public static int cbGet(ByteBuffer struct) { return struct.getInt(struct.position() + CB); }
	public static void DeviceNameGet(ByteBuffer struct, long DeviceName, int bytes) {
		memCopy(memAddress(struct) + DEVICENAME, DeviceName, bytes);
	}
	public static void DeviceNameGetb(ByteBuffer struct, ByteBuffer DeviceName) {
		checkBufferGT(DeviceName, 32 * 2);
		DeviceNameGet(struct, memAddress(DeviceName), DeviceName.remaining());
	}
	public static String DeviceNameGets(ByteBuffer struct) { return memDecodeUTF16(memByteBufferNT2(memAddress(struct) + DEVICENAME)); }
	public static String DeviceNameGets(ByteBuffer struct, int size) { return memDecodeUTF16(memByteBuffer(memAddress(struct) + DEVICENAME, size)); }
	public static void DeviceStringGet(ByteBuffer struct, long DeviceString, int bytes) {
		memCopy(memAddress(struct) + DEVICESTRING, DeviceString, bytes);
	}
	public static void DeviceStringGetb(ByteBuffer struct, ByteBuffer DeviceString) {
		checkBufferGT(DeviceString, 128 * 2);
		DeviceStringGet(struct, memAddress(DeviceString), DeviceString.remaining());
	}
	public static String DeviceStringGets(ByteBuffer struct) { return memDecodeUTF16(memByteBufferNT2(memAddress(struct) + DEVICESTRING)); }
	public static String DeviceStringGets(ByteBuffer struct, int size) { return memDecodeUTF16(memByteBuffer(memAddress(struct) + DEVICESTRING, size)); }
	public static int StateFlagsGet(ByteBuffer struct) { return struct.getInt(struct.position() + STATEFLAGS); }
	public static void DeviceIDGet(ByteBuffer struct, long DeviceID, int bytes) {
		memCopy(memAddress(struct) + DEVICEID, DeviceID, bytes);
	}
	public static void DeviceIDGetb(ByteBuffer struct, ByteBuffer DeviceID) {
		checkBufferGT(DeviceID, 128 * 2);
		DeviceIDGet(struct, memAddress(DeviceID), DeviceID.remaining());
	}
	public static String DeviceIDGets(ByteBuffer struct) { return memDecodeUTF16(memByteBufferNT2(memAddress(struct) + DEVICEID)); }
	public static String DeviceIDGets(ByteBuffer struct, int size) { return memDecodeUTF16(memByteBuffer(memAddress(struct) + DEVICEID, size)); }
	public static void DeviceKeyGet(ByteBuffer struct, long DeviceKey, int bytes) {
		memCopy(memAddress(struct) + DEVICEKEY, DeviceKey, bytes);
	}
	public static void DeviceKeyGetb(ByteBuffer struct, ByteBuffer DeviceKey) {
		checkBufferGT(DeviceKey, 128 * 2);
		DeviceKeyGet(struct, memAddress(DeviceKey), DeviceKey.remaining());
	}
	public static String DeviceKeyGets(ByteBuffer struct) { return memDecodeUTF16(memByteBufferNT2(memAddress(struct) + DEVICEKEY)); }
	public static String DeviceKeyGets(ByteBuffer struct, int size) { return memDecodeUTF16(memByteBuffer(memAddress(struct) + DEVICEKEY, size)); }

}