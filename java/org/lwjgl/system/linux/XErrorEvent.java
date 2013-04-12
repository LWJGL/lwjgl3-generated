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

/** Error event. */
public final class XErrorEvent {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		DISPLAY,
		SERIAL,
		ERROR_CODE,
		REQUEST_CODE,
		MINOR_CODE,
		RESOURCEID;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(7);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		DISPLAY = offsets.get(1);
		SERIAL = offsets.get(2);
		ERROR_CODE = offsets.get(3);
		REQUEST_CODE = offsets.get(4);
		MINOR_CODE = offsets.get(5);
		RESOURCEID = offsets.get(6);
	}

	private XErrorEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int type,
		long display,
		long serial,
		int error_code,
		int request_code,
		int minor_code,
		long resourceid
	) {
		ByteBuffer xerrorevent = malloc();

		typeSet(xerrorevent, type);
		displaySet(xerrorevent, display);
		serialSet(xerrorevent, serial);
		error_codeSet(xerrorevent, error_code);
		request_codeSet(xerrorevent, request_code);
		minor_codeSet(xerrorevent, minor_code);
		resourceidSet(xerrorevent, resourceid);

		return xerrorevent;
	}

	public static void typeSet(ByteBuffer xerrorevent, int type) { xerrorevent.putInt(xerrorevent.position() + TYPE, type); }
	public static void displaySet(ByteBuffer xerrorevent, long display) { PointerBuffer.put(xerrorevent, xerrorevent.position() + DISPLAY, display); }
	public static void serialSet(ByteBuffer xerrorevent, long serial) { PointerBuffer.put(xerrorevent, xerrorevent.position() + SERIAL, serial); }
	public static void error_codeSet(ByteBuffer xerrorevent, int error_code) { xerrorevent.put(xerrorevent.position() + ERROR_CODE, (byte)error_code); }
	public static void request_codeSet(ByteBuffer xerrorevent, int request_code) { xerrorevent.put(xerrorevent.position() + REQUEST_CODE, (byte)request_code); }
	public static void minor_codeSet(ByteBuffer xerrorevent, int minor_code) { xerrorevent.put(xerrorevent.position() + MINOR_CODE, (byte)minor_code); }
	public static void resourceidSet(ByteBuffer xerrorevent, long resourceid) { PointerBuffer.put(xerrorevent, xerrorevent.position() + RESOURCEID, resourceid); }

	public static int typeGet(ByteBuffer xerrorevent) { return xerrorevent.getInt(xerrorevent.position() + TYPE); }
	public static long displayGet(ByteBuffer xerrorevent) { return PointerBuffer.get(xerrorevent, xerrorevent.position() + DISPLAY); }
	public static long serialGet(ByteBuffer xerrorevent) { return PointerBuffer.get(xerrorevent, xerrorevent.position() + SERIAL); }
	public static int error_codeGet(ByteBuffer xerrorevent) { return xerrorevent.get(xerrorevent.position() + ERROR_CODE) & 0xFF; }
	public static int request_codeGet(ByteBuffer xerrorevent) { return xerrorevent.get(xerrorevent.position() + REQUEST_CODE) & 0xFF; }
	public static int minor_codeGet(ByteBuffer xerrorevent) { return xerrorevent.get(xerrorevent.position() + MINOR_CODE) & 0xFF; }
	public static long resourceidGet(ByteBuffer xerrorevent) { return PointerBuffer.get(xerrorevent, xerrorevent.position() + RESOURCEID); }

}