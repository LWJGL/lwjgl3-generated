/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Receives information about the display device specified by the {@code iDevNum} parameter of the {@link User32#EnumDisplayDevices} function.
 * 
 * <p>The four string members are set based on the parameters passed to {@code EnumDisplayDevices}. If the {@code lpDevice} param is {@code NULL}, then
 * {@code DISPLAY_DEVICE} is filled in with information about the display adapter(s). If it is a valid device name, then it is filled in with information
 * about the monitor(s) for that device.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct DISPLAY_DEVICE {
 *     DWORD cb;
 *     TCHAR[32] DeviceName;
 *     TCHAR[128] DeviceString;
 *     DWORD StateFlags;
 *     TCHAR[128] DeviceID;
 *     TCHAR[128] DeviceKey;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>cb</td><td>size, in bytes, of the {@code DISPLAY_DEVICE} structure. This must be initialized prior to calling {@link User32#EnumDisplayDevices}.</td></tr>
 * <tr><td>DeviceName</td><td>an array of characters identifying the device name. This is either the adapter device or the monitor device.</td></tr>
 * <tr><td>DeviceString</td><td>an array of characters containing the device context string. This is either a description of the display adapter or of the display monitor.</td></tr>
 * <tr><td>StateFlags</td><td>device state flags</td></tr>
 * <tr><td>DeviceID</td><td>not used</td></tr>
 * <tr><td>DeviceKey</td><td>reserved</td></tr>
 * </table>
 */
public class DISPLAY_DEVICE extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		CB,
		DEVICENAME,
		DEVICESTRING,
		STATEFLAGS,
		DEVICEID,
		DEVICEKEY;

	static {
		Layout layout = __struct(
			__member(4),
			__array(2, 32),
			__array(2, 128),
			__member(4),
			__array(2, 128),
			__array(2, 128)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		CB = layout.offsetof(0);
		DEVICENAME = layout.offsetof(1);
		DEVICESTRING = layout.offsetof(2);
		STATEFLAGS = layout.offsetof(3);
		DEVICEID = layout.offsetof(4);
		DEVICEKEY = layout.offsetof(5);
	}

	DISPLAY_DEVICE(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link DISPLAY_DEVICE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public DISPLAY_DEVICE(ByteBuffer container) {
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
	/** Returns the value of the {@code StateFlags} field. */
	public int StateFlags() { return nStateFlags(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code DeviceID} field. */
	public ByteBuffer DeviceID() { return nDeviceID(address()); }
	/** Decodes the null-terminated string stored in the {@code DeviceID} field. */
	public String DeviceIDString() { return nDeviceIDString(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code DeviceKey} field. */
	public ByteBuffer DeviceKey() { return nDeviceKey(address()); }
	/** Decodes the null-terminated string stored in the {@code DeviceKey} field. */
	public String DeviceKeyString() { return nDeviceKeyString(address()); }

	/** Sets the specified value to the {@code cb} field. */
	public DISPLAY_DEVICE cb(int value) { ncb(address(), value); return this; }
	/** Copies the specified encoded string to the {@code DeviceName} field. */
	public DISPLAY_DEVICE DeviceName(ByteBuffer value) { nDeviceName(address(), value); return this; }
	/** Encodes the specified {@link CharSequence} to the {@code DeviceName} field. */
	public DISPLAY_DEVICE DeviceName(CharSequence value) { nDeviceName(address(), value); return this; }
	/** Copies the specified encoded string to the {@code DeviceString} field. */
	public DISPLAY_DEVICE DeviceString(ByteBuffer value) { nDeviceString(address(), value); return this; }
	/** Encodes the specified {@link CharSequence} to the {@code DeviceString} field. */
	public DISPLAY_DEVICE DeviceString(CharSequence value) { nDeviceString(address(), value); return this; }
	/** Sets the specified value to the {@code StateFlags} field. */
	public DISPLAY_DEVICE StateFlags(int value) { nStateFlags(address(), value); return this; }
	/** Copies the specified encoded string to the {@code DeviceID} field. */
	public DISPLAY_DEVICE DeviceID(ByteBuffer value) { nDeviceID(address(), value); return this; }
	/** Encodes the specified {@link CharSequence} to the {@code DeviceID} field. */
	public DISPLAY_DEVICE DeviceID(CharSequence value) { nDeviceID(address(), value); return this; }
	/** Copies the specified encoded string to the {@code DeviceKey} field. */
	public DISPLAY_DEVICE DeviceKey(ByteBuffer value) { nDeviceKey(address(), value); return this; }
	/** Encodes the specified {@link CharSequence} to the {@code DeviceKey} field. */
	public DISPLAY_DEVICE DeviceKey(CharSequence value) { nDeviceKey(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public DISPLAY_DEVICE set(
		int cb,
		ByteBuffer DeviceName,
		ByteBuffer DeviceString,
		int StateFlags,
		ByteBuffer DeviceID,
		ByteBuffer DeviceKey
	) {
		cb(cb);
		DeviceName(DeviceName);
		DeviceString(DeviceString);
		StateFlags(StateFlags);
		DeviceID(DeviceID);
		DeviceKey(DeviceKey);

		return this;
	}

	/** Initializes this struct with the specified values. */
	public DISPLAY_DEVICE set(
		int cb,
		CharSequence DeviceName,
		CharSequence DeviceString,
		int StateFlags,
		CharSequence DeviceID,
		CharSequence DeviceKey
	) {
		cb(cb);
		DeviceName(DeviceName);
		DeviceString(DeviceString);
		StateFlags(StateFlags);
		DeviceID(DeviceID);
		DeviceKey(DeviceKey);

		return this;
	}

	/** Unsafe version of {@link #set(DISPLAY_DEVICE) set}. */
	public DISPLAY_DEVICE nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public DISPLAY_DEVICE set(DISPLAY_DEVICE src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(DISPLAY_DEVICE) set}. */
	public DISPLAY_DEVICE set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link DISPLAY_DEVICE} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static DISPLAY_DEVICE malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link DISPLAY_DEVICE} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static DISPLAY_DEVICE calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link DISPLAY_DEVICE} instance allocated with {@link BufferUtils}. */
	public static DISPLAY_DEVICE create() {
		return new DISPLAY_DEVICE(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link DISPLAY_DEVICE} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static DISPLAY_DEVICE create(long address) {
		return address == NULL ? null : new DISPLAY_DEVICE(address, null);
	}

	/**
	 * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link DISPLAY_DEVICE.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #cb}. */
	public static int ncb(long struct) { return memGetInt(struct + DISPLAY_DEVICE.CB); }
	/** Unsafe version of {@link #DeviceName}. */
	public static ByteBuffer nDeviceName(long struct) { return memByteBuffer(struct + DISPLAY_DEVICE.DEVICENAME, 64); }
	/** Unsafe version of {@link #DeviceNameString}. */
	public static String nDeviceNameString(long struct) { return memDecodeUTF16(struct + DISPLAY_DEVICE.DEVICENAME); }
	/** Unsafe version of {@link #DeviceString}. */
	public static ByteBuffer nDeviceString(long struct) { return memByteBuffer(struct + DISPLAY_DEVICE.DEVICESTRING, 256); }
	/** Unsafe version of {@link #DeviceStringString}. */
	public static String nDeviceStringString(long struct) { return memDecodeUTF16(struct + DISPLAY_DEVICE.DEVICESTRING); }
	/** Unsafe version of {@link #StateFlags}. */
	public static int nStateFlags(long struct) { return memGetInt(struct + DISPLAY_DEVICE.STATEFLAGS); }
	/** Unsafe version of {@link #DeviceID}. */
	public static ByteBuffer nDeviceID(long struct) { return memByteBuffer(struct + DISPLAY_DEVICE.DEVICEID, 256); }
	/** Unsafe version of {@link #DeviceIDString}. */
	public static String nDeviceIDString(long struct) { return memDecodeUTF16(struct + DISPLAY_DEVICE.DEVICEID); }
	/** Unsafe version of {@link #DeviceKey}. */
	public static ByteBuffer nDeviceKey(long struct) { return memByteBuffer(struct + DISPLAY_DEVICE.DEVICEKEY, 256); }
	/** Unsafe version of {@link #DeviceKeyString}. */
	public static String nDeviceKeyString(long struct) { return memDecodeUTF16(struct + DISPLAY_DEVICE.DEVICEKEY); }

	/** Unsafe version of {@link #cb(int) cb}. */
	public static void ncb(long struct, int value) { memPutInt(struct + DISPLAY_DEVICE.CB, value); }
	/** Unsafe version of {@link #DeviceName(ByteBuffer) DeviceName}. */
	public static void nDeviceName(long struct, ByteBuffer value) {
		if ( CHECKS ) {
			checkNT2(value);
			checkBufferGT(value, 64);
		}
		memCopy(memAddress(value), struct + DISPLAY_DEVICE.DEVICENAME, value.remaining());
	}
	/** Unsafe version of {@link #DeviceName(CharSequence) DeviceName}. */
	public static void nDeviceName(long struct, CharSequence value) { memEncodeUTF16(value, true, memByteBuffer(struct + DISPLAY_DEVICE.DEVICENAME, 64)); }
	/** Unsafe version of {@link #DeviceString(ByteBuffer) DeviceString}. */
	public static void nDeviceString(long struct, ByteBuffer value) {
		if ( CHECKS ) {
			checkNT2(value);
			checkBufferGT(value, 256);
		}
		memCopy(memAddress(value), struct + DISPLAY_DEVICE.DEVICESTRING, value.remaining());
	}
	/** Unsafe version of {@link #DeviceString(CharSequence) DeviceString}. */
	public static void nDeviceString(long struct, CharSequence value) { memEncodeUTF16(value, true, memByteBuffer(struct + DISPLAY_DEVICE.DEVICESTRING, 256)); }
	/** Unsafe version of {@link #StateFlags(int) StateFlags}. */
	public static void nStateFlags(long struct, int value) { memPutInt(struct + DISPLAY_DEVICE.STATEFLAGS, value); }
	/** Unsafe version of {@link #DeviceID(ByteBuffer) DeviceID}. */
	public static void nDeviceID(long struct, ByteBuffer value) {
		if ( CHECKS ) {
			checkNT2(value);
			checkBufferGT(value, 256);
		}
		memCopy(memAddress(value), struct + DISPLAY_DEVICE.DEVICEID, value.remaining());
	}
	/** Unsafe version of {@link #DeviceID(CharSequence) DeviceID}. */
	public static void nDeviceID(long struct, CharSequence value) { memEncodeUTF16(value, true, memByteBuffer(struct + DISPLAY_DEVICE.DEVICEID, 256)); }
	/** Unsafe version of {@link #DeviceKey(ByteBuffer) DeviceKey}. */
	public static void nDeviceKey(long struct, ByteBuffer value) {
		if ( CHECKS ) {
			checkNT2(value);
			checkBufferGT(value, 256);
		}
		memCopy(memAddress(value), struct + DISPLAY_DEVICE.DEVICEKEY, value.remaining());
	}
	/** Unsafe version of {@link #DeviceKey(CharSequence) DeviceKey}. */
	public static void nDeviceKey(long struct, CharSequence value) { memEncodeUTF16(value, true, memByteBuffer(struct + DISPLAY_DEVICE.DEVICEKEY, 256)); }

	// -----------------------------------

	/** An array of {@link DISPLAY_DEVICE} structs. */
	public static final class Buffer extends StructBuffer<DISPLAY_DEVICE, Buffer> {

		/**
		 * Creates a new {@link DISPLAY_DEVICE.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link DISPLAY_DEVICE#SIZEOF}, and its mark will be undefined.
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
		protected DISPLAY_DEVICE newInstance(long address) {
			return new DISPLAY_DEVICE(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code cb} field. */
		public int cb() { return DISPLAY_DEVICE.ncb(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code DeviceName} field. */
		public ByteBuffer DeviceName() { return DISPLAY_DEVICE.nDeviceName(address()); }
		/** Decodes the null-terminated string stored in the {@code DeviceName} field. */
		public String DeviceNameString() { return DISPLAY_DEVICE.nDeviceNameString(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code DeviceString} field. */
		public ByteBuffer DeviceString() { return DISPLAY_DEVICE.nDeviceString(address()); }
		/** Decodes the null-terminated string stored in the {@code DeviceString} field. */
		public String DeviceStringString() { return DISPLAY_DEVICE.nDeviceStringString(address()); }
		/** Returns the value of the {@code StateFlags} field. */
		public int StateFlags() { return DISPLAY_DEVICE.nStateFlags(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code DeviceID} field. */
		public ByteBuffer DeviceID() { return DISPLAY_DEVICE.nDeviceID(address()); }
		/** Decodes the null-terminated string stored in the {@code DeviceID} field. */
		public String DeviceIDString() { return DISPLAY_DEVICE.nDeviceIDString(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code DeviceKey} field. */
		public ByteBuffer DeviceKey() { return DISPLAY_DEVICE.nDeviceKey(address()); }
		/** Decodes the null-terminated string stored in the {@code DeviceKey} field. */
		public String DeviceKeyString() { return DISPLAY_DEVICE.nDeviceKeyString(address()); }

		/** Sets the specified value to the {@code cb} field. */
		public DISPLAY_DEVICE.Buffer cb(int value) { DISPLAY_DEVICE.ncb(address(), value); return this; }
		/** Copies the specified encoded string to the {@code DeviceName} field. */
		public DISPLAY_DEVICE.Buffer DeviceName(ByteBuffer value) { DISPLAY_DEVICE.nDeviceName(address(), value); return this; }
		/** Encodes the specified {@link CharSequence} to the {@code DeviceName} field. */
		public DISPLAY_DEVICE.Buffer DeviceName(CharSequence value) { DISPLAY_DEVICE.nDeviceName(address(), value); return this; }
		/** Copies the specified encoded string to the {@code DeviceString} field. */
		public DISPLAY_DEVICE.Buffer DeviceString(ByteBuffer value) { DISPLAY_DEVICE.nDeviceString(address(), value); return this; }
		/** Encodes the specified {@link CharSequence} to the {@code DeviceString} field. */
		public DISPLAY_DEVICE.Buffer DeviceString(CharSequence value) { DISPLAY_DEVICE.nDeviceString(address(), value); return this; }
		/** Sets the specified value to the {@code StateFlags} field. */
		public DISPLAY_DEVICE.Buffer StateFlags(int value) { DISPLAY_DEVICE.nStateFlags(address(), value); return this; }
		/** Copies the specified encoded string to the {@code DeviceID} field. */
		public DISPLAY_DEVICE.Buffer DeviceID(ByteBuffer value) { DISPLAY_DEVICE.nDeviceID(address(), value); return this; }
		/** Encodes the specified {@link CharSequence} to the {@code DeviceID} field. */
		public DISPLAY_DEVICE.Buffer DeviceID(CharSequence value) { DISPLAY_DEVICE.nDeviceID(address(), value); return this; }
		/** Copies the specified encoded string to the {@code DeviceKey} field. */
		public DISPLAY_DEVICE.Buffer DeviceKey(ByteBuffer value) { DISPLAY_DEVICE.nDeviceKey(address(), value); return this; }
		/** Encodes the specified {@link CharSequence} to the {@code DeviceKey} field. */
		public DISPLAY_DEVICE.Buffer DeviceKey(CharSequence value) { DISPLAY_DEVICE.nDeviceKey(address(), value); return this; }

	}

}