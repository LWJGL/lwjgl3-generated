/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Additional information for an {@code XGenericEvent}. */
public final class XGenericEventCookie implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		EXTENSION,
		EVTYPE,
		COOKIE,
		DATA;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(8);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		EXTENSION = offsets.get(4);
		EVTYPE = offsets.get(5);
		COOKIE = offsets.get(6);
		DATA = offsets.get(7);
	}

	private final ByteBuffer struct;

	public XGenericEventCookie() {
		this(malloc());
	}

	public XGenericEventCookie(ByteBuffer struct) {
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

	public void setType(int type) { type(struct, type); }
	public void setSerial(long serial) { serial(struct, serial); }
	public void setSendEvent(int send_event) { send_event(struct, send_event); }
	public void setDisplay(long display) { display(struct, display); }
	public void setExtension(int extension) { extension(struct, extension); }
	public void setEvtype(int evtype) { evtype(struct, evtype); }
	public void setCookie(int cookie) { cookie(struct, cookie); }
	public void setData(long data) { data(struct, data); }
	public void setData(ByteBuffer data) { data(struct, data); }

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public int getExtension() { return extension(struct); }
	public int getEvtype() { return evtype(struct); }
	public int getCookie() { return cookie(struct); }
	public long getData() { return data(struct); }
	public ByteBuffer getData(int byteLen) { return data(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		int extension,
		int evtype,
		int cookie,
		ByteBuffer data
	) {
		ByteBuffer xgenericeventcookie = malloc();

		type(xgenericeventcookie, type);
		serial(xgenericeventcookie, serial);
		send_event(xgenericeventcookie, send_event);
		display(xgenericeventcookie, display);
		extension(xgenericeventcookie, extension);
		evtype(xgenericeventcookie, evtype);
		cookie(xgenericeventcookie, cookie);
		data(xgenericeventcookie, data);

		return xgenericeventcookie;
	}

	public static void type(ByteBuffer xgenericeventcookie, int type) { xgenericeventcookie.putInt(xgenericeventcookie.position() + TYPE, type); }
	public static void serial(ByteBuffer xgenericeventcookie, long serial) { PointerBuffer.put(xgenericeventcookie, xgenericeventcookie.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xgenericeventcookie, int send_event) { xgenericeventcookie.putInt(xgenericeventcookie.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xgenericeventcookie, long display) { PointerBuffer.put(xgenericeventcookie, xgenericeventcookie.position() + DISPLAY, display); }
	public static void extension(ByteBuffer xgenericeventcookie, int extension) { xgenericeventcookie.putInt(xgenericeventcookie.position() + EXTENSION, extension); }
	public static void evtype(ByteBuffer xgenericeventcookie, int evtype) { xgenericeventcookie.putInt(xgenericeventcookie.position() + EVTYPE, evtype); }
	public static void cookie(ByteBuffer xgenericeventcookie, int cookie) { xgenericeventcookie.putInt(xgenericeventcookie.position() + COOKIE, cookie); }
	public static void data(ByteBuffer xgenericeventcookie, long data) { PointerBuffer.put(xgenericeventcookie, xgenericeventcookie.position() + DATA, data); }
	public static void data(ByteBuffer xgenericeventcookie, ByteBuffer data) { data(xgenericeventcookie, memAddressSafe(data)); }

	public static int type(ByteBuffer xgenericeventcookie) { return xgenericeventcookie.getInt(xgenericeventcookie.position() + TYPE); }
	public static long serial(ByteBuffer xgenericeventcookie) { return PointerBuffer.get(xgenericeventcookie, xgenericeventcookie.position() + SERIAL); }
	public static int send_event(ByteBuffer xgenericeventcookie) { return xgenericeventcookie.getInt(xgenericeventcookie.position() + SEND_EVENT); }
	public static long display(ByteBuffer xgenericeventcookie) { return PointerBuffer.get(xgenericeventcookie, xgenericeventcookie.position() + DISPLAY); }
	public static int extension(ByteBuffer xgenericeventcookie) { return xgenericeventcookie.getInt(xgenericeventcookie.position() + EXTENSION); }
	public static int evtype(ByteBuffer xgenericeventcookie) { return xgenericeventcookie.getInt(xgenericeventcookie.position() + EVTYPE); }
	public static int cookie(ByteBuffer xgenericeventcookie) { return xgenericeventcookie.getInt(xgenericeventcookie.position() + COOKIE); }
	public static long data(ByteBuffer xgenericeventcookie) { return PointerBuffer.get(xgenericeventcookie, xgenericeventcookie.position() + DATA); }
	public static ByteBuffer data(ByteBuffer xgenericeventcookie, int byteLen) { return memByteBuffer(data(xgenericeventcookie), byteLen); }

}