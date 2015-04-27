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

import org.lwjgl.system.windows.*;

/**
 * Receives information about the display device specified by the {@code deviceIndex} parameter of the {@link WGLNVGPUAffinity#wglEnumGpuDevicesNV}
 * function.
 */
public final class GPU_DEVICE implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		CB,
		DEVICENAME,
		DEVICESTRING,
		FLAGS,
		VIRTUALSCREEN;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		CB = offsets.get(0);
		DEVICENAME = offsets.get(1);
		DEVICESTRING = offsets.get(2);
		FLAGS = offsets.get(3);
		VIRTUALSCREEN = offsets.get(4);
	}

	private final ByteBuffer struct;

	public GPU_DEVICE() {
		this(malloc());
	}

	public GPU_DEVICE(ByteBuffer struct) {
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
	public void setFlags(int Flags) { Flags(struct, Flags); }
	public void setVirtualScreen(ByteBuffer virtualScreen) { virtualScreenSet(struct, virtualScreen); }
	public void setVirtualScreenLeft(int left) { virtualScreenLeft(struct, left); }
	public void setVirtualScreenTop(int top) { virtualScreenTop(struct, top); }
	public void setVirtualScreenRight(int right) { virtualScreenRight(struct, right); }
	public void setVirtualScreenBottom(int bottom) { virtualScreenBottom(struct, bottom); }

	public int getCb() { return cb(struct); }
	public void getDeviceName(ByteBuffer DeviceName) { DeviceNameGet(struct, DeviceName); }
	public String getDeviceNameString() { return DeviceNameString(struct); }
	public String getDeviceNameString(int byteLen) { return DeviceNameString(struct, byteLen); }
	public void getDeviceString(ByteBuffer DeviceString) { DeviceStringGet(struct, DeviceString); }
	public String getDeviceStringString() { return DeviceStringString(struct); }
	public String getDeviceStringString(int byteLen) { return DeviceStringString(struct, byteLen); }
	public int getFlags() { return Flags(struct); }
	public void getVirtualScreen(ByteBuffer virtualScreen) { virtualScreenGet(struct, virtualScreen); }
	public int getVirtualScreenLeft() { return virtualScreenLeft(struct); }
	public int getVirtualScreenTop() { return virtualScreenTop(struct); }
	public int getVirtualScreenRight() { return virtualScreenRight(struct); }
	public int getVirtualScreenBottom() { return virtualScreenBottom(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int cb,
		ByteBuffer DeviceName,
		ByteBuffer DeviceString,
		int Flags,
		ByteBuffer virtualScreen
	) {
		ByteBuffer gpu_device = malloc();

		cb(gpu_device, cb);
		DeviceNameSet(gpu_device, DeviceName);
		DeviceStringSet(gpu_device, DeviceString);
		Flags(gpu_device, Flags);
		virtualScreenSet(gpu_device, virtualScreen);

		return gpu_device;
	}

	/** Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int cb,
		CharSequence DeviceName,
		CharSequence DeviceString,
		int Flags,
		ByteBuffer virtualScreen
	) {
		ByteBuffer gpu_device = malloc();

		cb(gpu_device, cb);
		DeviceName(gpu_device, DeviceName);
		DeviceString(gpu_device, DeviceString);
		Flags(gpu_device, Flags);
		virtualScreenSet(gpu_device, virtualScreen);

		return gpu_device;
	}

	public static void cb(ByteBuffer gpu_device, int cb) { gpu_device.putInt(gpu_device.position() + CB, cb); }
	public static void DeviceNameSet(ByteBuffer gpu_device, ByteBuffer DeviceName) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(DeviceName);
			checkBufferGT(DeviceName, 32 * 2);
		}
		memCopy(memAddress(DeviceName), memAddress(gpu_device) + DEVICENAME, DeviceName.remaining());
	}
	public static void DeviceName(ByteBuffer gpu_device, CharSequence DeviceName) { memEncodeUTF16(DeviceName, true, gpu_device, DEVICENAME); }
	public static void DeviceStringSet(ByteBuffer gpu_device, ByteBuffer DeviceString) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(DeviceString);
			checkBufferGT(DeviceString, 128 * 2);
		}
		memCopy(memAddress(DeviceString), memAddress(gpu_device) + DEVICESTRING, DeviceString.remaining());
	}
	public static void DeviceString(ByteBuffer gpu_device, CharSequence DeviceString) { memEncodeUTF16(DeviceString, true, gpu_device, DEVICESTRING); }
	public static void Flags(ByteBuffer gpu_device, int Flags) { gpu_device.putInt(gpu_device.position() + FLAGS, Flags); }
	public static void virtualScreenSet(ByteBuffer gpu_device, ByteBuffer virtualScreen) { if ( virtualScreen != null ) memCopy(memAddress(virtualScreen), memAddress(gpu_device) + VIRTUALSCREEN, RECT.SIZEOF); }
	public static void virtualScreenLeft(ByteBuffer gpu_device, int left) { gpu_device.putInt(gpu_device.position() + VIRTUALSCREEN + RECT.LEFT, left); }
	public static void virtualScreenTop(ByteBuffer gpu_device, int top) { gpu_device.putInt(gpu_device.position() + VIRTUALSCREEN + RECT.TOP, top); }
	public static void virtualScreenRight(ByteBuffer gpu_device, int right) { gpu_device.putInt(gpu_device.position() + VIRTUALSCREEN + RECT.RIGHT, right); }
	public static void virtualScreenBottom(ByteBuffer gpu_device, int bottom) { gpu_device.putInt(gpu_device.position() + VIRTUALSCREEN + RECT.BOTTOM, bottom); }

	public static int cb(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + CB); }
	public static void DeviceNameGet(ByteBuffer gpu_device, ByteBuffer DeviceName) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DeviceName, 32 * 2);
		memCopy(memAddress(gpu_device) + DEVICENAME, memAddress(DeviceName), DeviceName.remaining());
	}
	public static String DeviceNameString(ByteBuffer gpu_device) { return memDecodeUTF16(gpu_device, memStrLen2(gpu_device, DEVICENAME), DEVICENAME); }
	public static String DeviceNameString(ByteBuffer gpu_device, int byteLen) { return memDecodeUTF16(gpu_device, byteLen, DEVICENAME); }
	public static void DeviceStringGet(ByteBuffer gpu_device, ByteBuffer DeviceString) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DeviceString, 128 * 2);
		memCopy(memAddress(gpu_device) + DEVICESTRING, memAddress(DeviceString), DeviceString.remaining());
	}
	public static String DeviceStringString(ByteBuffer gpu_device) { return memDecodeUTF16(gpu_device, memStrLen2(gpu_device, DEVICESTRING), DEVICESTRING); }
	public static String DeviceStringString(ByteBuffer gpu_device, int byteLen) { return memDecodeUTF16(gpu_device, byteLen, DEVICESTRING); }
	public static int Flags(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + FLAGS); }
	public static void virtualScreenGet(ByteBuffer gpu_device, ByteBuffer virtualScreen) { if ( LWJGLUtil.CHECKS ) checkBuffer(virtualScreen, RECT.SIZEOF); memCopy(memAddress(gpu_device) + VIRTUALSCREEN, memAddress(virtualScreen), RECT.SIZEOF); }
	public static int virtualScreenLeft(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + VIRTUALSCREEN + RECT.LEFT); }
	public static int virtualScreenTop(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + VIRTUALSCREEN + RECT.TOP); }
	public static int virtualScreenRight(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + VIRTUALSCREEN + RECT.RIGHT); }
	public static int virtualScreenBottom(ByteBuffer gpu_device) { return gpu_device.getInt(gpu_device.position() + VIRTUALSCREEN + RECT.BOTTOM); }

}