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
		ByteBuffer struct = malloc();

		cbSet(struct, cb);
		DeviceNameSet(struct, DeviceName, DeviceNameBytes);
		DeviceStringSet(struct, DeviceString, DeviceStringBytes);
		FlagsSet(struct, Flags);
		virtualScreenLeftSet(struct, virtualScreen_left);
		virtualScreenTopSet(struct, virtualScreen_top);
		virtualScreenRightSet(struct, virtualScreen_right);
		virtualScreenBottomSet(struct, virtualScreen_bottom);

		return struct;
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
		ByteBuffer struct = malloc();

		cbSet(struct, cb);
		DeviceNameSet(struct, DeviceName);
		DeviceStringSet(struct, DeviceString);
		FlagsSet(struct, Flags);
		virtualScreenLeftSet(struct, virtualScreen_left);
		virtualScreenTopSet(struct, virtualScreen_top);
		virtualScreenRightSet(struct, virtualScreen_right);
		virtualScreenBottomSet(struct, virtualScreen_bottom);

		return struct;
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
		ByteBuffer struct = malloc();

		cbSet(struct, cb);
		DeviceNameSet(struct, DeviceName);
		DeviceStringSet(struct, DeviceString);
		FlagsSet(struct, Flags);
		virtualScreenLeftSet(struct, virtualScreen_left);
		virtualScreenTopSet(struct, virtualScreen_top);
		virtualScreenRightSet(struct, virtualScreen_right);
		virtualScreenBottomSet(struct, virtualScreen_bottom);

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
	public static void FlagsSet(ByteBuffer struct, int Flags) { struct.putInt(struct.position() + FLAGS, Flags); }
	public static void virtualScreenLeftSet(ByteBuffer struct, int left) { struct.putInt(struct.position() + VIRTUALSCREEN_LEFT, left); }
	public static void virtualScreenTopSet(ByteBuffer struct, int top) { struct.putInt(struct.position() + VIRTUALSCREEN_TOP, top); }
	public static void virtualScreenRightSet(ByteBuffer struct, int right) { struct.putInt(struct.position() + VIRTUALSCREEN_RIGHT, right); }
	public static void virtualScreenBottomSet(ByteBuffer struct, int bottom) { struct.putInt(struct.position() + VIRTUALSCREEN_BOTTOM, bottom); }

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
	public static int FlagsGet(ByteBuffer struct) { return struct.getInt(struct.position() + FLAGS); }
	public static int virtualScreenLeftGet(ByteBuffer struct) { return struct.getInt(struct.position() + VIRTUALSCREEN_LEFT); }
	public static int virtualScreenTopGet(ByteBuffer struct) { return struct.getInt(struct.position() + VIRTUALSCREEN_TOP); }
	public static int virtualScreenRightGet(ByteBuffer struct) { return struct.getInt(struct.position() + VIRTUALSCREEN_RIGHT); }
	public static int virtualScreenBottomGet(ByteBuffer struct) { return struct.getInt(struct.position() + VIRTUALSCREEN_BOTTOM); }

}