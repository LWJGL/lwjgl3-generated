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
public final class GPU_DEVICE extends Struct {

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

	public GPU_DEVICE setCb(int cb) { nsetCb(address(), cb); return this; }
	public GPU_DEVICE setDeviceName(ByteBuffer DeviceName) { nsetDeviceName(address(), DeviceName); return this; }
	public GPU_DEVICE setDeviceName(CharSequence DeviceName) { nsetDeviceName(address(), DeviceName); return this; }
	public GPU_DEVICE setDeviceString(ByteBuffer DeviceString) { nsetDeviceString(address(), DeviceString); return this; }
	public GPU_DEVICE setDeviceString(CharSequence DeviceString) { nsetDeviceString(address(), DeviceString); return this; }
	public GPU_DEVICE setFlags(int Flags) { nsetFlags(address(), Flags); return this; }
	public GPU_DEVICE setVirtualScreen(RECT virtualScreen) { nsetVirtualScreen(address(), virtualScreen); return this; }
	public GPU_DEVICE setVirtualScreenLeft(int left) { nsetVirtualScreenLeft(address(), left); return this; }
	public GPU_DEVICE setVirtualScreenTop(int top) { nsetVirtualScreenTop(address(), top); return this; }
	public GPU_DEVICE setVirtualScreenRight(int right) { nsetVirtualScreenRight(address(), right); return this; }
	public GPU_DEVICE setVirtualScreenBottom(int bottom) { nsetVirtualScreenBottom(address(), bottom); return this; }

	/** Initializes this struct with the specified values. */
	public GPU_DEVICE set(
		int cb,
		ByteBuffer DeviceName,
		ByteBuffer DeviceString,
		int Flags,
		RECT virtualScreen
	) {
		setCb(cb);
		setDeviceName(DeviceName);
		setDeviceString(DeviceString);
		setFlags(Flags);
		setVirtualScreen(virtualScreen);

		return this;
	}

	/** Initializes this struct with the specified values. */
	public GPU_DEVICE set(
		int cb,
		CharSequence DeviceName,
		CharSequence DeviceString,
		int Flags,
		RECT virtualScreen
	) {
		setCb(cb);
		setDeviceName(DeviceName);
		setDeviceString(DeviceString);
		setFlags(Flags);
		setVirtualScreen(virtualScreen);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public GPU_DEVICE nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public GPU_DEVICE set(GPU_DEVICE src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public GPU_DEVICE set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

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

	public static void nsetCb(long struct, int cb) { memPutInt(struct + CB, cb); }
	public static void setCb(ByteBuffer struct, int cb) { nsetCb(memAddress(struct), cb); }
	public static void nsetDeviceName(long struct, ByteBuffer DeviceName) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(DeviceName);
			checkBufferGT(DeviceName, 32 * 2);
		}
		memCopy(memAddress(DeviceName), struct + DEVICENAME, DeviceName.remaining());
	}
	public static void setDeviceName(ByteBuffer struct, ByteBuffer DeviceName) { nsetDeviceName(memAddress(struct), DeviceName); }
	public static void nsetDeviceName(long struct, CharSequence DeviceName) { memEncodeUTF16(DeviceName, true, memByteBuffer(struct + DEVICENAME, 32)); }
	public static void setDeviceName(ByteBuffer struct, CharSequence DeviceName) { memEncodeUTF16(DeviceName, true, struct, DEVICENAME); }
	public static void nsetDeviceString(long struct, ByteBuffer DeviceString) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(DeviceString);
			checkBufferGT(DeviceString, 128 * 2);
		}
		memCopy(memAddress(DeviceString), struct + DEVICESTRING, DeviceString.remaining());
	}
	public static void setDeviceString(ByteBuffer struct, ByteBuffer DeviceString) { nsetDeviceString(memAddress(struct), DeviceString); }
	public static void nsetDeviceString(long struct, CharSequence DeviceString) { memEncodeUTF16(DeviceString, true, memByteBuffer(struct + DEVICESTRING, 128)); }
	public static void setDeviceString(ByteBuffer struct, CharSequence DeviceString) { memEncodeUTF16(DeviceString, true, struct, DEVICESTRING); }
	public static void nsetFlags(long struct, int Flags) { memPutInt(struct + FLAGS, Flags); }
	public static void setFlags(ByteBuffer struct, int Flags) { nsetFlags(memAddress(struct), Flags); }
	public static void nsetVirtualScreen(long struct, RECT virtualScreen) { memCopy(virtualScreen.address(), struct + VIRTUALSCREEN, RECT.SIZEOF); }
	/** Copies the specified {@link RECT} struct to the nested {@code virtualScreen} struct. */
	public static void setVirtualScreen(ByteBuffer struct, RECT virtualScreen) { nsetVirtualScreen(memAddress(struct), virtualScreen); }
	public static void nsetVirtualScreenLeft(long struct, int left) { memPutInt(struct + VIRTUALSCREEN + RECT.LEFT, left); }
	public static void setVirtualScreenLeft(ByteBuffer struct, int left) { nsetVirtualScreenLeft(memAddress(struct), left); }
	public static void nsetVirtualScreenTop(long struct, int top) { memPutInt(struct + VIRTUALSCREEN + RECT.TOP, top); }
	public static void setVirtualScreenTop(ByteBuffer struct, int top) { nsetVirtualScreenTop(memAddress(struct), top); }
	public static void nsetVirtualScreenRight(long struct, int right) { memPutInt(struct + VIRTUALSCREEN + RECT.RIGHT, right); }
	public static void setVirtualScreenRight(ByteBuffer struct, int right) { nsetVirtualScreenRight(memAddress(struct), right); }
	public static void nsetVirtualScreenBottom(long struct, int bottom) { memPutInt(struct + VIRTUALSCREEN + RECT.BOTTOM, bottom); }
	public static void setVirtualScreenBottom(ByteBuffer struct, int bottom) { nsetVirtualScreenBottom(memAddress(struct), bottom); }

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

	}

}