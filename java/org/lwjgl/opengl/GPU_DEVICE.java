/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.windows.*;

/**
 * Receives information about the display device specified by the {@code deviceIndex} parameter of the {@link WGLNVGPUAffinity#wglEnumGpuDevicesNV} function.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct GPU_DEVICE {
    DWORD cb;
    CHAR[32] DeviceName;
    CHAR[128] DeviceString;
    DWORD Flags;
    {@link RECT RECT} rcVirtualScreen;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>cb</td><td>the size of the {@code GPU_DEVICE} structure. Before calling {@link WGLNVGPUAffinity#wglEnumGpuDevicesNV}, set {@code cb} to the size, in bytes, of
 * {@code GPU_DEVICE}.</td></tr>
 * <tr><td>DeviceName</td><td>a string identifying the display device name. This will be the same string as stored in the {@code DeviceName} field of the {@code DISPLAY_DEVICE}
 * structure, which is filled in by {@code EnumDisplayDevices}.</td></tr>
 * <tr><td>DeviceString</td><td>a string describing the GPU for this display device. It is the same string as stored in the {@code DeviceString} field in the {@code DISPLAY_DEVICE}
 * structure that is filled in by {@code EnumDisplayDevices} when it describes a display adapter (and not a monitor).</td></tr>
 * <tr><td>Flags</td><td>indicates the state of the display device</td></tr>
 * <tr><td>rcVirtualScreen</td><td>specifies the display device rectangle, in virtual screen coordinates. The value of {@code rcVirtualScreen} is undefined if the device is not part of
 * the desktop, i.e. {@code DISPLAY_DEVICE_ATTACHED_TO_DESKTOP} is not set in the {@code Flags} field.</td></tr>
 * </table>
 */
public class GPU_DEVICE extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		CB,
		DEVICENAME,
		DEVICESTRING,
		FLAGS,
		RCVIRTUALSCREEN;

	static {
		Layout layout = __struct(
			__member(4),
			__array(1, 32),
			__array(1, 128),
			__member(4),
			__member(RECT.SIZEOF, RECT.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		CB = layout.offsetof(0);
		DEVICENAME = layout.offsetof(1);
		DEVICESTRING = layout.offsetof(2);
		FLAGS = layout.offsetof(3);
		RCVIRTUALSCREEN = layout.offsetof(4);
	}

	GPU_DEVICE(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link GPU_DEVICE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GPU_DEVICE(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code cb} field. */
	public int cb() { return ncb(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code DeviceName} field. */
	public ByteBuffer DeviceName() { return nDeviceName(address()); }
	/** Decodes the null-terminated string stored in the {@code DeviceName} field. */
	public String DeviceNameString() { return nDeviceNameString(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code DeviceString} field. */
	public ByteBuffer DeviceString() { return nDeviceString(address()); }
	/** Decodes the null-terminated string stored in the {@code DeviceString} field. */
	public String DeviceStringString() { return nDeviceStringString(address()); }
	/** Returns the value of the {@code Flags} field. */
	public int Flags() { return nFlags(address()); }
	/** Returns a {@link RECT} view of the {@code rcVirtualScreen} field. */
	public RECT rcVirtualScreen() { return nrcVirtualScreen(address()); }

	// -----------------------------------

	/** Returns a new {@link GPU_DEVICE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static GPU_DEVICE malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GPU_DEVICE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static GPU_DEVICE calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GPU_DEVICE} instance allocated with {@link BufferUtils}. */
	public static GPU_DEVICE create() {
		return new GPU_DEVICE(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link GPU_DEVICE} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static GPU_DEVICE create(long address) {
		return address == NULL ? null : new GPU_DEVICE(address, null);
	}

	/**
	 * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link GPU_DEVICE.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #cb}. */
	public static int ncb(long struct) { return memGetInt(struct + GPU_DEVICE.CB); }
	/** Unsafe version of {@link #DeviceName}. */
	public static ByteBuffer nDeviceName(long struct) { return memByteBuffer(struct + GPU_DEVICE.DEVICENAME, 32); }
	/** Unsafe version of {@link #DeviceNameString}. */
	public static String nDeviceNameString(long struct) { return memDecodeASCII(struct + GPU_DEVICE.DEVICENAME); }
	/** Unsafe version of {@link #DeviceString}. */
	public static ByteBuffer nDeviceString(long struct) { return memByteBuffer(struct + GPU_DEVICE.DEVICESTRING, 128); }
	/** Unsafe version of {@link #DeviceStringString}. */
	public static String nDeviceStringString(long struct) { return memDecodeASCII(struct + GPU_DEVICE.DEVICESTRING); }
	/** Unsafe version of {@link #Flags}. */
	public static int nFlags(long struct) { return memGetInt(struct + GPU_DEVICE.FLAGS); }
	/** Unsafe version of {@link #rcVirtualScreen}. */
	public static RECT nrcVirtualScreen(long struct) { return RECT.create(struct + GPU_DEVICE.RCVIRTUALSCREEN); }

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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected GPU_DEVICE newInstance(long address) {
			return new GPU_DEVICE(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code cb} field. */
		public int cb() { return GPU_DEVICE.ncb(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code DeviceName} field. */
		public ByteBuffer DeviceName() { return GPU_DEVICE.nDeviceName(address()); }
		/** Decodes the null-terminated string stored in the {@code DeviceName} field. */
		public String DeviceNameString() { return GPU_DEVICE.nDeviceNameString(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code DeviceString} field. */
		public ByteBuffer DeviceString() { return GPU_DEVICE.nDeviceString(address()); }
		/** Decodes the null-terminated string stored in the {@code DeviceString} field. */
		public String DeviceStringString() { return GPU_DEVICE.nDeviceStringString(address()); }
		/** Returns the value of the {@code Flags} field. */
		public int Flags() { return GPU_DEVICE.nFlags(address()); }
		/** Returns a {@link RECT} view of the {@code rcVirtualScreen} field. */
		public RECT rcVirtualScreen() { return GPU_DEVICE.nrcVirtualScreen(address()); }

	}

}