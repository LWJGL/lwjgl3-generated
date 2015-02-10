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
public final class DISPLAY_DEVICE implements Pointer {

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

	private final ByteBuffer struct;

	public DISPLAY_DEVICE() {
		this(malloc());
	}

	public DISPLAY_DEVICE(ByteBuffer struct) {
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

	public void setCb(int cb) { cb(struct, cb); }
	public void setDeviceName(long DeviceName, int bytes) { DeviceNameSet(struct, DeviceName, bytes); }
	public void setDeviceName(ByteBuffer DeviceName) { DeviceNameSet(struct, DeviceName); }
	public void setDeviceName(CharSequence DeviceName) { DeviceName(struct, DeviceName); }
	public void setDeviceString(long DeviceString, int bytes) { DeviceStringSet(struct, DeviceString, bytes); }
	public void setDeviceString(ByteBuffer DeviceString) { DeviceStringSet(struct, DeviceString); }
	public void setDeviceString(CharSequence DeviceString) { DeviceString(struct, DeviceString); }
	public void setStateFlags(int StateFlags) { StateFlags(struct, StateFlags); }
	public void setDeviceID(long DeviceID, int bytes) { DeviceIDSet(struct, DeviceID, bytes); }
	public void setDeviceID(ByteBuffer DeviceID) { DeviceIDSet(struct, DeviceID); }
	public void setDeviceID(CharSequence DeviceID) { DeviceID(struct, DeviceID); }
	public void setDeviceKey(long DeviceKey, int bytes) { DeviceKeySet(struct, DeviceKey, bytes); }
	public void setDeviceKey(ByteBuffer DeviceKey) { DeviceKeySet(struct, DeviceKey); }
	public void setDeviceKey(CharSequence DeviceKey) { DeviceKey(struct, DeviceKey); }

	public int getCb() { return cb(struct); }
	public void getDeviceName(long DeviceName, int bytes) { DeviceNameGet(struct, DeviceName, bytes); }
	public void getDeviceName(ByteBuffer DeviceName) { DeviceNameGet(struct, DeviceName); }
	public String getDeviceNameString() { return DeviceNameString(struct); }
	public String getDeviceNameString(int size) { return DeviceNameString(struct, size); }
	public void getDeviceString(long DeviceString, int bytes) { DeviceStringGet(struct, DeviceString, bytes); }
	public void getDeviceString(ByteBuffer DeviceString) { DeviceStringGet(struct, DeviceString); }
	public String getDeviceStringString() { return DeviceStringString(struct); }
	public String getDeviceStringString(int size) { return DeviceStringString(struct, size); }
	public int getStateFlags() { return StateFlags(struct); }
	public void getDeviceID(long DeviceID, int bytes) { DeviceIDGet(struct, DeviceID, bytes); }
	public void getDeviceID(ByteBuffer DeviceID) { DeviceIDGet(struct, DeviceID); }
	public String getDeviceIDString() { return DeviceIDString(struct); }
	public String getDeviceIDString(int size) { return DeviceIDString(struct, size); }
	public void getDeviceKey(long DeviceKey, int bytes) { DeviceKeyGet(struct, DeviceKey, bytes); }
	public void getDeviceKey(ByteBuffer DeviceKey) { DeviceKeyGet(struct, DeviceKey); }
	public String getDeviceKeyString() { return DeviceKeyString(struct); }
	public String getDeviceKeyString(int size) { return DeviceKeyString(struct, size); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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
		ByteBuffer display_device = malloc();

		cb(display_device, cb);
		DeviceNameSet(display_device, DeviceName, DeviceNameBytes);
		DeviceStringSet(display_device, DeviceString, DeviceStringBytes);
		StateFlags(display_device, StateFlags);
		DeviceIDSet(display_device, DeviceID, DeviceIDBytes);
		DeviceKeySet(display_device, DeviceKey, DeviceKeyBytes);

		return display_device;
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
		ByteBuffer display_device = malloc();

		cb(display_device, cb);
		DeviceNameSet(display_device, DeviceName);
		DeviceStringSet(display_device, DeviceString);
		StateFlags(display_device, StateFlags);
		DeviceIDSet(display_device, DeviceID);
		DeviceKeySet(display_device, DeviceKey);

		return display_device;
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
		ByteBuffer display_device = malloc();

		cb(display_device, cb);
		DeviceName(display_device, DeviceName);
		DeviceString(display_device, DeviceString);
		StateFlags(display_device, StateFlags);
		DeviceID(display_device, DeviceID);
		DeviceKey(display_device, DeviceKey);

		return display_device;
	}

	public static void cb(ByteBuffer display_device, int cb) { display_device.putInt(display_device.position() + CB, cb); }
	public static void DeviceNameSet(ByteBuffer display_device, long DeviceName, int bytes) { memCopy(DeviceName, memAddress(display_device) + DEVICENAME, bytes); }
	public static void DeviceNameSet(ByteBuffer display_device, ByteBuffer DeviceName) {
		checkNT2(DeviceName);
		checkBufferGT(DeviceName, 32 * 2);
		DeviceNameSet(display_device, memAddress(DeviceName), DeviceName.remaining());
	}
	public static void DeviceName(ByteBuffer display_device, CharSequence DeviceName) { memEncodeUTF16(DeviceName, true, display_device, DEVICENAME); }
	public static void DeviceStringSet(ByteBuffer display_device, long DeviceString, int bytes) { memCopy(DeviceString, memAddress(display_device) + DEVICESTRING, bytes); }
	public static void DeviceStringSet(ByteBuffer display_device, ByteBuffer DeviceString) {
		checkNT2(DeviceString);
		checkBufferGT(DeviceString, 128 * 2);
		DeviceStringSet(display_device, memAddress(DeviceString), DeviceString.remaining());
	}
	public static void DeviceString(ByteBuffer display_device, CharSequence DeviceString) { memEncodeUTF16(DeviceString, true, display_device, DEVICESTRING); }
	public static void StateFlags(ByteBuffer display_device, int StateFlags) { display_device.putInt(display_device.position() + STATEFLAGS, StateFlags); }
	public static void DeviceIDSet(ByteBuffer display_device, long DeviceID, int bytes) { memCopy(DeviceID, memAddress(display_device) + DEVICEID, bytes); }
	public static void DeviceIDSet(ByteBuffer display_device, ByteBuffer DeviceID) {
		checkNT2(DeviceID);
		checkBufferGT(DeviceID, 128 * 2);
		DeviceIDSet(display_device, memAddress(DeviceID), DeviceID.remaining());
	}
	public static void DeviceID(ByteBuffer display_device, CharSequence DeviceID) { memEncodeUTF16(DeviceID, true, display_device, DEVICEID); }
	public static void DeviceKeySet(ByteBuffer display_device, long DeviceKey, int bytes) { memCopy(DeviceKey, memAddress(display_device) + DEVICEKEY, bytes); }
	public static void DeviceKeySet(ByteBuffer display_device, ByteBuffer DeviceKey) {
		checkNT2(DeviceKey);
		checkBufferGT(DeviceKey, 128 * 2);
		DeviceKeySet(display_device, memAddress(DeviceKey), DeviceKey.remaining());
	}
	public static void DeviceKey(ByteBuffer display_device, CharSequence DeviceKey) { memEncodeUTF16(DeviceKey, true, display_device, DEVICEKEY); }

	public static int cb(ByteBuffer display_device) { return display_device.getInt(display_device.position() + CB); }
	public static void DeviceNameGet(ByteBuffer display_device, long DeviceName, int bytes) {
		memCopy(memAddress(display_device) + DEVICENAME, DeviceName, bytes);
	}
	public static void DeviceNameGet(ByteBuffer display_device, ByteBuffer DeviceName) {
		checkBufferGT(DeviceName, 32 * 2);
		DeviceNameGet(display_device, memAddress(DeviceName), DeviceName.remaining());
	}
	public static String DeviceNameString(ByteBuffer display_device) { return memDecodeUTF16(display_device, memStrLen2(display_device, DEVICENAME), DEVICENAME); }
	public static String DeviceNameString(ByteBuffer display_device, int size) { return memDecodeUTF16(display_device, size, DEVICENAME); }
	public static void DeviceStringGet(ByteBuffer display_device, long DeviceString, int bytes) {
		memCopy(memAddress(display_device) + DEVICESTRING, DeviceString, bytes);
	}
	public static void DeviceStringGet(ByteBuffer display_device, ByteBuffer DeviceString) {
		checkBufferGT(DeviceString, 128 * 2);
		DeviceStringGet(display_device, memAddress(DeviceString), DeviceString.remaining());
	}
	public static String DeviceStringString(ByteBuffer display_device) { return memDecodeUTF16(display_device, memStrLen2(display_device, DEVICESTRING), DEVICESTRING); }
	public static String DeviceStringString(ByteBuffer display_device, int size) { return memDecodeUTF16(display_device, size, DEVICESTRING); }
	public static int StateFlags(ByteBuffer display_device) { return display_device.getInt(display_device.position() + STATEFLAGS); }
	public static void DeviceIDGet(ByteBuffer display_device, long DeviceID, int bytes) {
		memCopy(memAddress(display_device) + DEVICEID, DeviceID, bytes);
	}
	public static void DeviceIDGet(ByteBuffer display_device, ByteBuffer DeviceID) {
		checkBufferGT(DeviceID, 128 * 2);
		DeviceIDGet(display_device, memAddress(DeviceID), DeviceID.remaining());
	}
	public static String DeviceIDString(ByteBuffer display_device) { return memDecodeUTF16(display_device, memStrLen2(display_device, DEVICEID), DEVICEID); }
	public static String DeviceIDString(ByteBuffer display_device, int size) { return memDecodeUTF16(display_device, size, DEVICEID); }
	public static void DeviceKeyGet(ByteBuffer display_device, long DeviceKey, int bytes) {
		memCopy(memAddress(display_device) + DEVICEKEY, DeviceKey, bytes);
	}
	public static void DeviceKeyGet(ByteBuffer display_device, ByteBuffer DeviceKey) {
		checkBufferGT(DeviceKey, 128 * 2);
		DeviceKeyGet(display_device, memAddress(DeviceKey), DeviceKey.remaining());
	}
	public static String DeviceKeyString(ByteBuffer display_device) { return memDecodeUTF16(display_device, memStrLen2(display_device, DEVICEKEY), DEVICEKEY); }
	public static String DeviceKeyString(ByteBuffer display_device, int size) { return memDecodeUTF16(display_device, size, DEVICEKEY); }

}