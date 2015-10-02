/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.windows.*;

/**
 * Receives information about the display device specified by the {@code deviceIndex} parameter of the {@link WGLNVGPUAffinity#wglEnumGpuDevicesNV}
 * function.
 */
public class GPU_DEVICE extends Struct {

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
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		CB = offsets.get(0);
		DEVICENAME = offsets.get(1);
		DEVICESTRING = offsets.get(2);
		FLAGS = offsets.get(3);
		VIRTUALSCREEN = offsets.get(4);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	GPU_DEVICE(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GPU_DEVICE} instance at the specified memory address. */
	public GPU_DEVICE(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GPU_DEVICE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GPU_DEVICE(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getCb() { return ngetCb(address()); }
	public void getDeviceName(ByteBuffer DeviceName) { ngetDeviceName(address(), DeviceName); }
	public String getDeviceNameString() { return ngetDeviceNameString(address()); }
	public String getDeviceNameString(int byteLen) { return ngetDeviceNameString(address(), byteLen); }
	public void getDeviceString(ByteBuffer DeviceString) { ngetDeviceString(address(), DeviceString); }
	public String getDeviceStringString() { return ngetDeviceStringString(address()); }
	public String getDeviceStringString(int byteLen) { return ngetDeviceStringString(address(), byteLen); }
	public int getFlags() { return ngetFlags(address()); }
	public RECT getVirtualScreen() { return ngetVirtualScreen(address()); }
	public int getVirtualScreenLeft() { return ngetVirtualScreenLeft(address()); }
	public int getVirtualScreenTop() { return ngetVirtualScreenTop(address()); }
	public int getVirtualScreenRight() { return ngetVirtualScreenRight(address()); }
	public int getVirtualScreenBottom() { return ngetVirtualScreenBottom(address()); }

	// -----------------------------------

	/** Returns a new {@link GPU_DEVICE} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GPU_DEVICE malloc() {
		return new GPU_DEVICE(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GPU_DEVICE} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GPU_DEVICE calloc() {
		return new GPU_DEVICE(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GPU_DEVICE} instance allocated with {@link BufferUtils}. */
	public static GPU_DEVICE create() {
		return new GPU_DEVICE(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetCb(long struct) { return memGetInt(struct + CB); }
	public static int getCb(ByteBuffer struct) { return ngetCb(memAddress(struct)); }
	public static void ngetDeviceName(long struct, ByteBuffer DeviceName) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DeviceName, 32 * 2);
		memCopy(struct + DEVICENAME, memAddress(DeviceName), DeviceName.remaining());
	}
	public static void getDeviceName(ByteBuffer struct, ByteBuffer DeviceName) { ngetDeviceName(memAddress(struct), DeviceName); }
	public static String ngetDeviceNameString(long struct) { return memDecodeUTF16(struct + DEVICENAME); }
	public static String getDeviceNameString(ByteBuffer struct) { return ngetDeviceNameString(memAddress(struct)); }
	public static String ngetDeviceNameString(long struct, int byteLen) { return memDecodeUTF16(memByteBuffer(struct + DEVICENAME, byteLen)); }
	public static String getDeviceNameString(ByteBuffer struct, int byteLen) { return ngetDeviceNameString(memAddress(struct), byteLen); }
	public static void ngetDeviceString(long struct, ByteBuffer DeviceString) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(DeviceString, 128 * 2);
		memCopy(struct + DEVICESTRING, memAddress(DeviceString), DeviceString.remaining());
	}
	public static void getDeviceString(ByteBuffer struct, ByteBuffer DeviceString) { ngetDeviceString(memAddress(struct), DeviceString); }
	public static String ngetDeviceStringString(long struct) { return memDecodeUTF16(struct + DEVICESTRING); }
	public static String getDeviceStringString(ByteBuffer struct) { return ngetDeviceStringString(memAddress(struct)); }
	public static String ngetDeviceStringString(long struct, int byteLen) { return memDecodeUTF16(memByteBuffer(struct + DEVICESTRING, byteLen)); }
	public static String getDeviceStringString(ByteBuffer struct, int byteLen) { return ngetDeviceStringString(memAddress(struct), byteLen); }
	public static int ngetFlags(long struct) { return memGetInt(struct + FLAGS); }
	public static int getFlags(ByteBuffer struct) { return ngetFlags(memAddress(struct)); }
	public static RECT ngetVirtualScreen(long struct) { return RECT.malloc().nset(struct + VIRTUALSCREEN); }
	/** Returns a copy of the {@code virtualScreen} {@link RECT} struct. */
	public static RECT getVirtualScreen(ByteBuffer struct) { return ngetVirtualScreen(memAddress(struct)); }
	public static int ngetVirtualScreenLeft(long struct) { return memGetInt(struct + VIRTUALSCREEN + RECT.LEFT); }
	public static int getVirtualScreenLeft(ByteBuffer struct) { return ngetVirtualScreenLeft(memAddress(struct)); }
	public static int ngetVirtualScreenTop(long struct) { return memGetInt(struct + VIRTUALSCREEN + RECT.TOP); }
	public static int getVirtualScreenTop(ByteBuffer struct) { return ngetVirtualScreenTop(memAddress(struct)); }
	public static int ngetVirtualScreenRight(long struct) { return memGetInt(struct + VIRTUALSCREEN + RECT.RIGHT); }
	public static int getVirtualScreenRight(ByteBuffer struct) { return ngetVirtualScreenRight(memAddress(struct)); }
	public static int ngetVirtualScreenBottom(long struct) { return memGetInt(struct + VIRTUALSCREEN + RECT.BOTTOM); }
	public static int getVirtualScreenBottom(ByteBuffer struct) { return ngetVirtualScreenBottom(memAddress(struct)); }

	// -----------------------------------

	/** An array of {@link GPU_DEVICE} structs. */
	public static final class Buffer extends StructBuffer<GPU_DEVICE, Buffer> {

		/**
		 * Creates a new {@link GPU_DEVICE.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GPU_DEVICE#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected GPU_DEVICE newInstance(long address) {
			return new GPU_DEVICE(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getCb() { return ngetCb(address()); }
		public void getDeviceName(ByteBuffer DeviceName) { ngetDeviceName(address(), DeviceName); }
		public String getDeviceNameString() { return ngetDeviceNameString(address()); }
		public String getDeviceNameString(int byteLen) { return ngetDeviceNameString(address(), byteLen); }
		public void getDeviceString(ByteBuffer DeviceString) { ngetDeviceString(address(), DeviceString); }
		public String getDeviceStringString() { return ngetDeviceStringString(address()); }
		public String getDeviceStringString(int byteLen) { return ngetDeviceStringString(address(), byteLen); }
		public int getFlags() { return ngetFlags(address()); }
		public RECT getVirtualScreen() { return ngetVirtualScreen(address()); }
		public int getVirtualScreenLeft() { return ngetVirtualScreenLeft(address()); }
		public int getVirtualScreenTop() { return ngetVirtualScreenTop(address()); }
		public int getVirtualScreenRight() { return ngetVirtualScreenRight(address()); }
		public int getVirtualScreenBottom() { return ngetVirtualScreenBottom(address()); }

	}

}