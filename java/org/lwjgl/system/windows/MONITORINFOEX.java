/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains information about a display monitor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct MONITORINFOEX {
 *     DWORD cbSize;
 *     {@link RECT RECT} rcMonitor;
 *     {@link RECT RECT} rcWork;
 *     DWORD dwFlags;
 *     TCHAR[32] szDevice;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>cbSize</td><td>the size, in bytes, of the structure.
 * 
 * <p>Set this member to {@link #SIZEOF} before calling the {@link User32#GetMonitorInfo} function. Doing so lets the function determine the type of structure you are
 * passing to it.</td></tr>
 * <tr><td>rcMonitor</td><td>a {@link RECT} structure that specifies the display monitor rectangle, expressed in virtual-screen coordinates. Note that if the monitor is not the primary
 * display monitor, some of the rectangle's coordinates may be negative values.</td></tr>
 * <tr><td>rcWork</td><td>a {@link RECT} structure that specifies the work area rectangle of the display monitor that can be used by applications, expressed in virtual-screen
 * coordinates. Windows uses this rectangle to maximize an application on the monitor. The rest of the area in {@code rcMonitor} contains system windows
 * such as the task bar and side bars. Note that if the monitor is not the primary display monitor, some of the rectangle's coordinates may be negative
 * values.</td></tr>
 * <tr><td>dwFlags</td><td>the attributes of the display monitor. May be:<br>{@link User32#MONITORINFOF_PRIMARY}</td></tr>
 * <tr><td>szDevice</td><td>a string that specifies the device name of the monitor being used</td></tr>
 * </table></p>
 */
public class MONITORINFOEX extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		CBSIZE,
		RCMONITOR,
		RCWORK,
		DWFLAGS,
		SZDEVICE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(RECT.SIZEOF, RECT.__ALIGNMENT),
			__member(RECT.SIZEOF, RECT.__ALIGNMENT),
			__member(4),
			__array(2, 32)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		CBSIZE = layout.offsetof(0);
		RCMONITOR = layout.offsetof(1);
		RCWORK = layout.offsetof(2);
		DWFLAGS = layout.offsetof(3);
		SZDEVICE = layout.offsetof(4);
	}

	MONITORINFOEX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link MONITORINFOEX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public MONITORINFOEX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code cbSize} field. */
	public int cbSize() { return ncbSize(address()); }
	/** Returns a {@link RECT} view of the {@code rcMonitor} field. */
	public RECT rcMonitor() { return nrcMonitor(address()); }
	/** Returns a {@link RECT} view of the {@code rcWork} field. */
	public RECT rcWork() { return nrcWork(address()); }
	/** Returns the value of the {@code dwFlags} field. */
	public int dwFlags() { return ndwFlags(address()); }
	/** Returns a {@link ByteBuffer} view of the {@code szDevice} field. */
	public ByteBuffer szDevice() { return nszDevice(address()); }
	/** Decodes the null-terminated string stored in the {@code szDevice} field. */
	public String szDeviceString() { return nszDeviceString(address()); }

	// -----------------------------------

	/** Returns a new {@link MONITORINFOEX} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static MONITORINFOEX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link MONITORINFOEX} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static MONITORINFOEX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link MONITORINFOEX} instance allocated with {@link BufferUtils}. */
	public static MONITORINFOEX create() {
		return new MONITORINFOEX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link MONITORINFOEX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static MONITORINFOEX create(long address) {
		return address == NULL ? null : new MONITORINFOEX(address, null);
	}

	/**
	 * Returns a new {@link MONITORINFOEX.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MONITORINFOEX.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MONITORINFOEX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link MONITORINFOEX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #cbSize}. */
	public static int ncbSize(long struct) { return memGetInt(struct + MONITORINFOEX.CBSIZE); }
	/** Unsafe version of {@link #rcMonitor}. */
	public static RECT nrcMonitor(long struct) { return RECT.create(struct + MONITORINFOEX.RCMONITOR); }
	/** Unsafe version of {@link #rcWork}. */
	public static RECT nrcWork(long struct) { return RECT.create(struct + MONITORINFOEX.RCWORK); }
	/** Unsafe version of {@link #dwFlags}. */
	public static int ndwFlags(long struct) { return memGetInt(struct + MONITORINFOEX.DWFLAGS); }
	/** Unsafe version of {@link #szDevice}. */
	public static ByteBuffer nszDevice(long struct) { return memByteBuffer(struct + MONITORINFOEX.SZDEVICE, 64); }
	/** Unsafe version of {@link #szDeviceString}. */
	public static String nszDeviceString(long struct) { return memDecodeUTF16(struct + MONITORINFOEX.SZDEVICE); }

	// -----------------------------------

	/** An array of {@link MONITORINFOEX} structs. */
	public static final class Buffer extends StructBuffer<MONITORINFOEX, Buffer> {

		/**
		 * Creates a new {@link MONITORINFOEX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link MONITORINFOEX#SIZEOF}, and its mark will be undefined.
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
		protected MONITORINFOEX newInstance(long address) {
			return new MONITORINFOEX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code cbSize} field. */
		public int cbSize() { return MONITORINFOEX.ncbSize(address()); }
		/** Returns a {@link RECT} view of the {@code rcMonitor} field. */
		public RECT rcMonitor() { return MONITORINFOEX.nrcMonitor(address()); }
		/** Returns a {@link RECT} view of the {@code rcWork} field. */
		public RECT rcWork() { return MONITORINFOEX.nrcWork(address()); }
		/** Returns the value of the {@code dwFlags} field. */
		public int dwFlags() { return MONITORINFOEX.ndwFlags(address()); }
		/** Returns a {@link ByteBuffer} view of the {@code szDevice} field. */
		public ByteBuffer szDevice() { return MONITORINFOEX.nszDevice(address()); }
		/** Decodes the null-terminated string stored in the {@code szDevice} field. */
		public String szDeviceString() { return MONITORINFOEX.nszDeviceString(address()); }

	}

}