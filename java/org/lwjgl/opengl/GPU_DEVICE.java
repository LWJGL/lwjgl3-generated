/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Receives information about the display device specified by the {@code deviceIndex} parameter of the {@link WGLNVGpuAffinity#wglEnumGpuDevicesNV}
 * function.
 */
public final class GPU_DEVICE {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		CB,
		DEVICENAME,
		DEVICESTRING,
		FLAGS,
		VIRTUALSCREEN,
			VIRTUALSCREEN_LEFT,
			VIRTUALSCREEN_TOP,
			VIRTUALSCREEN_RIGHT,
			VIRTUALSCREEN_BOTTOM;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		CB = offsets.get(0);
		DEVICENAME = offsets.get(1);
		DEVICESTRING = offsets.get(2);
		FLAGS = offsets.get(3);
		VIRTUALSCREEN = offsets.get(4);
			VIRTUALSCREEN_LEFT = VIRTUALSCREEN + org.lwjgl.system.windows.RECT.LEFT;
			VIRTUALSCREEN_TOP = VIRTUALSCREEN + org.lwjgl.system.windows.RECT.TOP;
			VIRTUALSCREEN_RIGHT = VIRTUALSCREEN + org.lwjgl.system.windows.RECT.RIGHT;
			VIRTUALSCREEN_BOTTOM = VIRTUALSCREEN + org.lwjgl.system.windows.RECT.BOTTOM;
	}

	private GPU_DEVICE() {}

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
		int Flags,
		int virtualScreen_left,
		int virtualScreen_top,
		int virtualScreen_right,
		int virtualScreen_bottom
	) {
		ByteBuffer gpu_device = malloc();

		cbSet(gpu_device, cb);
		DeviceNameSet(gpu_device, DeviceName, DeviceNameBytes);
		DeviceStringSet(gpu_device, DeviceString, DeviceStringBytes);
		FlagsSet(gpu_device, Flags);
		virtualScreenLeftSet(gpu_device, virtualScreen_left);
		virtualScreenTopSet(gpu_device, virtualScreen_top);
		virtualScreenRightSet(gpu_device, virtualScreen_right);
		virtualScreenBottomSet(gpu_device, virtualScreen_bottom);

		return gpu_device;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int cb,
		ByteBuffer DeviceName,
		ByteBuffer DeviceString,
		int Flags,
		int virtualScreen_left,
		int virtualScreen_top,
		int virtualScreen_right,
		int virtualScreen_bottom
	) {
		ByteBuffer gpu_device = malloc();

		cbSet(gpu_device, cb);
		DeviceNameSet(gpu_device, DeviceName);
		DeviceStringSet(gpu_device, DeviceString);
		FlagsSet(gpu_device, Flags);
		virtualScreenLeftSet(gpu_device, virtualScreen_left);
		virtualScreenTopSet(gpu_device, virtualScreen_top);
		virtualScreenRightSet(gpu_device, virtualScreen_right);
		virtualScreenBottomSet(gpu_device, virtualScreen_bottom);

		return gpu_device;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int cb,
		CharSequence DeviceName,
		CharSequence DeviceString,
		int Flags,
		int virtualScreen_left,
		int virtualScreen_top,
		int virtualScreen_right,
		int virtualScreen_bottom
	) {
		ByteBuffer gpu_device = malloc();

		cbSet(gpu_device, cb);
		DeviceNameSet(gpu_device, DeviceName);
		DeviceStringSet(gpu_device, DeviceString);
		FlagsSet(gpu_device, Flags);
		virtualScreenLeftSet(gpu_device, virtualScreen_left);
		virtualScreenTopSet(gpu_device, virtualScreen_top);
		virtualScreenRightSet(gpu_device, virtualScreen_right);
		virtualScreenBottomSet(gpu_device, virtualScreen_bottom);

		return gpu_device;
	}

	public static void cbSet(ByteBuffer gpu_device, int cb) { gpu_device.putInt(gpu_device.position() + CB, cb); }
	public static void DeviceNameSet(ByteBuffer gpu_device, long DeviceName, int bytes) { memCopy(DeviceName, memAddress(gpu_device) + DEVICENAME, bytes); }
	public static void DeviceNameSet(ByteBuffer gpu_device, ByteBuffer DeviceName) {
		checkNT2(DeviceName);
		checkBufferGT(DeviceName, 32 * 2);
		DeviceNameSet(gpu_device, memAddress(DeviceName), DeviceName.remaining());
	}
	public static void DeviceNameSet(ByteBuffer gpu_device, CharSequence DeviceName) { ByteBuffer buffer = memEncodeUTF16(DeviceName, true); DeviceNameSet(gpu_device, memAddress(buffer), buffer.capacity()); }
	public static void DeviceStringSet(ByteBuffer gpu_device, long DeviceString, int bytes) { memCopy(DeviceString, memAddress(gpu_device) + DEVICESTRING, bytes); }
	public static void DeviceStringSet(ByteBuffer gpu_device, ByteBuffer DeviceString) {
		checkNT2(DeviceString);
		checkBufferGT(DeviceString, 128 * 2);
		DeviceStringSet(gpu_device, memAddress(DeviceString), DeviceString.remaining());
	}
	public static void DeviceStringSet(ByteBuffer gpu_device, CharSequence DeviceString) { ByteBuffer buffer = memEncodeUTF16(DeviceString, true); DeviceStringSet(gpu_device, memAddress(buffer), buffer.capacity()); }
	public static void FlagsSet(ByteBuffer gpu_device, int Flags) { gpu_device.putInt(gpu_device.position() + FLAGS, Flags); }
	public static void virtualScreenLeftSet(ByteBuffer gpu_device, int left) { gpu_device.putInt(gpu_device.position() + VIRTUALSCREEN_LEFT, left); }
	public static void virtualScreenTopSet(ByteBuffer gpu_device, int top) { gpu_device.putInt(gpu_device.position() + VIRTUALSCREEN_TOP, top); }
	public static void virtualScreenRightSet(ByteBuffer gpu_device, int right) { gpu_device.putInt(gpu_device.position() + VIRTUALSCREEN_RIGHT, right); }
	public static void virtualScreenBottomSet(ByteBuffer gpu_device, int bottom) { gpu_device.putInt(gpu_device.position() + VIRTUALSCREEN_BOTTOM, bottom); }

	public static int cbGet(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + CB); }
	public static void DeviceNameGet(ByteBuffer gpu_device, long DeviceName, int bytes) {
		memCopy(memAddress(gpu_device) + DEVICENAME, DeviceName, bytes);
	}
	public static void DeviceNameGetb(ByteBuffer gpu_device, ByteBuffer DeviceName) {
		checkBufferGT(DeviceName, 32 * 2);
		DeviceNameGet(gpu_device, memAddress(DeviceName), DeviceName.remaining());
	}
	public static String DeviceNameGets(ByteBuffer gpu_device) { return memDecodeUTF16(gpu_device, memStrLen2(gpu_device, DEVICENAME), DEVICENAME); }
	public static String DeviceNameGets(ByteBuffer gpu_device, int size) { return memDecodeUTF16(gpu_device, size, DEVICENAME); }
	public static void DeviceStringGet(ByteBuffer gpu_device, long DeviceString, int bytes) {
		memCopy(memAddress(gpu_device) + DEVICESTRING, DeviceString, bytes);
	}
	public static void DeviceStringGetb(ByteBuffer gpu_device, ByteBuffer DeviceString) {
		checkBufferGT(DeviceString, 128 * 2);
		DeviceStringGet(gpu_device, memAddress(DeviceString), DeviceString.remaining());
	}
	public static String DeviceStringGets(ByteBuffer gpu_device) { return memDecodeUTF16(gpu_device, memStrLen2(gpu_device, DEVICESTRING), DEVICESTRING); }
	public static String DeviceStringGets(ByteBuffer gpu_device, int size) { return memDecodeUTF16(gpu_device, size, DEVICESTRING); }
	public static int FlagsGet(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + FLAGS); }
	public static int virtualScreenLeftGet(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + VIRTUALSCREEN_LEFT); }
	public static int virtualScreenTopGet(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + VIRTUALSCREEN_TOP); }
	public static int virtualScreenRightGet(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + VIRTUALSCREEN_RIGHT); }
	public static int virtualScreenBottomGet(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + VIRTUALSCREEN_BOTTOM); }

}