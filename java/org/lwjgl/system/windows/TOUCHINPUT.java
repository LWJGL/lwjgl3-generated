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
 * Encapsulates data for touch input.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct TOUCHINPUT {
    LONG x;
    LONG y;
    HANDLE hSource;
    DWORD dwID;
    DWORD dwFlags;
    DWORD dwMask;
    DWORD dwTime;
    ULONG_PTR dwExtraInfo;
    DWORD cxContact;
    DWORD cyContact;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>x</td><td>the x-coordinate (horizontal point) of the touch input. This member is indicated in hundredths of a pixel of physical screen coordinates.</td></tr>
 * <tr><td>y</td><td>the y-coordinate (vertical point) of the touch input. This member is indicated in hundredths of a pixel of physical screen coordinates.</td></tr>
 * <tr><td>hSource</td><td>a device handle for the source input device. Each device is given a unique provider at run time by the touch input provider.</td></tr>
 * <tr><td>dwID</td><td>a touch point identifier that distinguishes a particular touch input. This value stays consistent in a touch contact sequence from the point a contact
 * comes down until it comes back up. An ID may be reused later for subsequent contacts.</td></tr>
 * <tr><td>dwFlags</td><td>a set of bit flags that specify various aspects of touch point press, release, and motion. The bits in this member can be any reasonable combination of
 * the values in the Remarks section.</td></tr>
 * <tr><td>dwMask</td><td>a set of bit flags that specify which of the optional fields in the structure contain valid values. The availability of valid information in the
 * optional fields is device-specific. Applications should use an optional field value only when the corresponding bit is set in {@code dwMask}. This
 * field may contain a combination of the {@code dwMask} flags mentioned in the Remarks section.</td></tr>
 * <tr><td>dwTime</td><td>the time stamp for the event, in milliseconds. The consuming application should note that the system performs no validation on this field; when the
 * {@link User32#TOUCHINPUTMASKF_TIMEFROMSYSTEM} flag is not set, the accuracy and sequencing of values in this field are completely dependent on the touch input
 * provider.</td></tr>
 * <tr><td>dwExtraInfo</td><td>an additional value associated with the touch event.</td></tr>
 * <tr><td>cxContact</td><td>the width of the touch contact area in hundredths of a pixel in physical screen coordinates. This value is only valid if the {@code dwMask} member has
 * the {@link User32#TOUCHINPUTMASKF_CONTACTAREA} flag set.</td></tr>
 * <tr><td>cyContact</td><td>the height of the touch contact area in hundredths of a pixel in physical screen coordinates. This value is only valid if the {@code dwMask} member has
 * the {@link User32#TOUCHINPUTMASKF_CONTACTAREA} flag set.</td></tr>
 * </table>
 */
public class TOUCHINPUT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		HSOURCE,
		DWID,
		DWFLAGS,
		DWMASK,
		DWTIME,
		DWEXTRAINFO,
		CXCONTACT,
		CYCONTACT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		HSOURCE = layout.offsetof(2);
		DWID = layout.offsetof(3);
		DWFLAGS = layout.offsetof(4);
		DWMASK = layout.offsetof(5);
		DWTIME = layout.offsetof(6);
		DWEXTRAINFO = layout.offsetof(7);
		CXCONTACT = layout.offsetof(8);
		CYCONTACT = layout.offsetof(9);
	}

	TOUCHINPUT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link TOUCHINPUT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public TOUCHINPUT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public int x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public int y() { return ny(address()); }
	/** Returns the value of the {@code hSource} field. */
	public long hSource() { return nhSource(address()); }
	/** Returns the value of the {@code dwID} field. */
	public int dwID() { return ndwID(address()); }
	/** Returns the value of the {@code dwFlags} field. */
	public int dwFlags() { return ndwFlags(address()); }
	/** Returns the value of the {@code dwMask} field. */
	public int dwMask() { return ndwMask(address()); }
	/** Returns the value of the {@code dwTime} field. */
	public int dwTime() { return ndwTime(address()); }
	/** Returns the value of the {@code dwExtraInfo} field. */
	public long dwExtraInfo() { return ndwExtraInfo(address()); }
	/** Returns the value of the {@code cxContact} field. */
	public int cxContact() { return ncxContact(address()); }
	/** Returns the value of the {@code cyContact} field. */
	public int cyContact() { return ncyContact(address()); }

	// -----------------------------------

	/** Returns a new {@link TOUCHINPUT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static TOUCHINPUT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link TOUCHINPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static TOUCHINPUT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link TOUCHINPUT} instance allocated with {@link BufferUtils}. */
	public static TOUCHINPUT create() {
		return new TOUCHINPUT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link TOUCHINPUT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static TOUCHINPUT create(long address) {
		return address == NULL ? null : new TOUCHINPUT(address, null);
	}

	/**
	 * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link TOUCHINPUT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #x}. */
	public static int nx(long struct) { return memGetInt(struct + TOUCHINPUT.X); }
	/** Unsafe version of {@link #y}. */
	public static int ny(long struct) { return memGetInt(struct + TOUCHINPUT.Y); }
	/** Unsafe version of {@link #hSource}. */
	public static long nhSource(long struct) { return memGetAddress(struct + TOUCHINPUT.HSOURCE); }
	/** Unsafe version of {@link #dwID}. */
	public static int ndwID(long struct) { return memGetInt(struct + TOUCHINPUT.DWID); }
	/** Unsafe version of {@link #dwFlags}. */
	public static int ndwFlags(long struct) { return memGetInt(struct + TOUCHINPUT.DWFLAGS); }
	/** Unsafe version of {@link #dwMask}. */
	public static int ndwMask(long struct) { return memGetInt(struct + TOUCHINPUT.DWMASK); }
	/** Unsafe version of {@link #dwTime}. */
	public static int ndwTime(long struct) { return memGetInt(struct + TOUCHINPUT.DWTIME); }
	/** Unsafe version of {@link #dwExtraInfo}. */
	public static long ndwExtraInfo(long struct) { return memGetAddress(struct + TOUCHINPUT.DWEXTRAINFO); }
	/** Unsafe version of {@link #cxContact}. */
	public static int ncxContact(long struct) { return memGetInt(struct + TOUCHINPUT.CXCONTACT); }
	/** Unsafe version of {@link #cyContact}. */
	public static int ncyContact(long struct) { return memGetInt(struct + TOUCHINPUT.CYCONTACT); }

	// -----------------------------------

	/** An array of {@link TOUCHINPUT} structs. */
	public static final class Buffer extends StructBuffer<TOUCHINPUT, Buffer> {

		/**
		 * Creates a new {@link TOUCHINPUT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link TOUCHINPUT#SIZEOF}, and its mark will be undefined.
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
		protected TOUCHINPUT newInstance(long address) {
			return new TOUCHINPUT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public int x() { return TOUCHINPUT.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public int y() { return TOUCHINPUT.ny(address()); }
		/** Returns the value of the {@code hSource} field. */
		public long hSource() { return TOUCHINPUT.nhSource(address()); }
		/** Returns the value of the {@code dwID} field. */
		public int dwID() { return TOUCHINPUT.ndwID(address()); }
		/** Returns the value of the {@code dwFlags} field. */
		public int dwFlags() { return TOUCHINPUT.ndwFlags(address()); }
		/** Returns the value of the {@code dwMask} field. */
		public int dwMask() { return TOUCHINPUT.ndwMask(address()); }
		/** Returns the value of the {@code dwTime} field. */
		public int dwTime() { return TOUCHINPUT.ndwTime(address()); }
		/** Returns the value of the {@code dwExtraInfo} field. */
		public long dwExtraInfo() { return TOUCHINPUT.ndwExtraInfo(address()); }
		/** Returns the value of the {@code cxContact} field. */
		public int cxContact() { return TOUCHINPUT.ncxContact(address()); }
		/** Returns the value of the {@code cyContact} field. */
		public int cyContact() { return TOUCHINPUT.ncyContact(address()); }

	}

}