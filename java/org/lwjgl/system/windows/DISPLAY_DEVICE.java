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
	public void setDeviceName(ByteBuffer DeviceName) { DeviceNameSet(struct, DeviceName); }
	public void setDeviceName(CharSequence DeviceName) { DeviceName(struct, DeviceName); }
	public void setDeviceString(ByteBuffer DeviceString) { DeviceStringSet(struct, DeviceString); }
	public void setDeviceString(CharSequence DeviceString) { DeviceString(struct, DeviceString); }
	public void setStateFlags(int StateFlags) { StateFlags(struct, StateFlags); }
	public void setDeviceID(ByteBuffer DeviceID) { DeviceIDSet(struct, DeviceID); }
	public void setDeviceID(CharSequence DeviceID) { DeviceID(struct, DeviceID); }
	public void setDeviceKey(ByteBuffer DeviceKey) { DeviceKeySet(struct, DeviceKey); }
	public void setDeviceKey(CharSequence DeviceKey) { DeviceKey(struct, DeviceKey); }

	public int getCb() { return cb(struct); }
	public void getDeviceName(ByteBuffer DeviceName) { DeviceNameGet(struct, DeviceName); }
	public String getDeviceNameString() { return DeviceNameString(struct); }
	public String getDeviceNameString(int byteLen) { return DeviceNameString(struct, byteLen); }
	public void getDeviceString(ByteBuffer DeviceString) { DeviceStringGet(struct, DeviceString); }
	public String getDeviceStringString() { return DeviceStringString(struct); }
	public String getDeviceStringString(int byteLen) { return DeviceStringString(struct, byteLen); }
	public int getStateFlags() { return StateFlags(struct); }
	public void getDeviceID(ByteBuffer DeviceID) { DeviceIDGet(struct, DeviceID); }
	public String getDeviceIDString() { return DeviceIDString(struct); }
	public String getDeviceIDString(int byteLen) { return DeviceIDString(struct, byteLen); }
	public void getDeviceKey(ByteBuffer DeviceKey) { DeviceKeyGet(struct, DeviceKey); }
	public String getDeviceKeyString() { return DeviceKeyString(struct); }
	public String getDeviceKeyString(int byteLen) { return DeviceKeyString(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

	/** Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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
	public static void DeviceNameSet(ByteBuffer display_device, ByteBuffer DeviceName) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(DeviceName);
			checkBufferGT(DeviceName, 32 * 2);
		}
		memCopy(memAddress(DeviceName), memAddress(display_device) + DEVICENAME, DeviceName.remaining());
	}
	public static void DeviceName(ByteBuffer display_device, CharSequence DeviceName) { memEncodeUTF16(DeviceName, true, display_device, DEVICENAME); }
	public static void DeviceStringSet(ByteBuffer display_device, ByteBuffer DeviceString) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(DeviceString);
			checkBufferGT(DeviceString, 128 * 2);
		}
		memCopy(memAddress(DeviceString), memAddress(display_device) + DEVICESTRING, DeviceString.remaining());
	}
	public static void DeviceString(ByteBuffer display_device, CharSequence DeviceString) { memEncodeUTF16(DeviceString, true, display_device, DEVICESTRING); }
	public static void StateFlags(ByteBuffer display_device, int StateFlags) { display_device.putInt(display_device.position() + STATEFLAGS, StateFlags); }
	public static void DeviceIDSet(ByteBuffer display_device, ByteBuffer DeviceID) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(DeviceID);
			checkBufferGT(DeviceID, 128 * 2);
		}
		memCopy(memAddress(DeviceID), memAddress(display_device) + DEVICEID, DeviceID.remaining());
	}
	public static void DeviceID(ByteBuffer display_device, CharSequence DeviceID) { memEncodeUTF16(DeviceID, true, display_device, DEVICEID); }
	public static void DeviceKeySet(ByteBuffer display_device, ByteBuffer DeviceKey) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(DeviceKey);
			checkBufferGT(DeviceKey, 128 * 2);
		}
		memCopy(memAddress(DeviceKey), memAddress(display_device) + DEVICEKEY, DeviceKey.remaining());
	}
	public static void DeviceKey(ByteBuffer display_device, CharSequence DeviceKey) { memEncodeUTF16(DeviceKey, true, display_device, DEVICEKEY); }

	public static int cb(ByteBuffer display_device) { return display_device.getInt(display_device.position() + CB); }
	public static void DeviceNameGet(ByteBuffer display_device, ByteBuffer DeviceName) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DeviceName, 32 * 2);
		memCopy(memAddress(display_device) + DEVICENAME, memAddress(DeviceName), DeviceName.remaining());
	}
	public static String DeviceNameString(ByteBuffer display_device) { return memDecodeUTF16(display_device, memStrLen2(display_device, DEVICENAME), DEVICENAME); }
	public static String DeviceNameString(ByteBuffer display_device, int byteLen) { return memDecodeUTF16(display_device, byteLen, DEVICENAME); }
	public static void DeviceStringGet(ByteBuffer display_device, ByteBuffer DeviceString) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DeviceString, 128 * 2);
		memCopy(memAddress(display_device) + DEVICESTRING, memAddress(DeviceString), DeviceString.remaining());
	}
	public static String DeviceStringString(ByteBuffer display_device) { return memDecodeUTF16(display_device, memStrLen2(display_device, DEVICESTRING), DEVICESTRING); }
	public static String DeviceStringString(ByteBuffer display_device, int byteLen) { return memDecodeUTF16(display_device, byteLen, DEVICESTRING); }
	public static int StateFlags(ByteBuffer display_device) { return display_device.getInt(display_device.position() + STATEFLAGS); }
	public static void DeviceIDGet(ByteBuffer display_device, ByteBuffer DeviceID) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DeviceID, 128 * 2);
		memCopy(memAddress(display_device) + DEVICEID, memAddress(DeviceID), DeviceID.remaining());
	}
	public static String DeviceIDString(ByteBuffer display_device) { return memDecodeUTF16(display_device, memStrLen2(display_device, DEVICEID), DEVICEID); }
	public static String DeviceIDString(ByteBuffer display_device, int byteLen) { return memDecodeUTF16(display_device, byteLen, DEVICEID); }
	public static void DeviceKeyGet(ByteBuffer display_device, ByteBuffer DeviceKey) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DeviceKey, 128 * 2);
		memCopy(memAddress(display_device) + DEVICEKEY, memAddress(DeviceKey), DeviceKey.remaining());
	}
	public static String DeviceKeyString(ByteBuffer display_device) { return memDecodeUTF16(display_device, memStrLen2(display_device, DEVICEKEY), DEVICEKEY); }
	public static String DeviceKeyString(ByteBuffer display_device, int byteLen) { return memDecodeUTF16(display_device, byteLen, DEVICEKEY); }

}