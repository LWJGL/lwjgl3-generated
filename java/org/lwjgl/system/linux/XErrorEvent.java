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
public final class XErrorEvent implements Pointer {

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

	private final ByteBuffer struct;

	public XErrorEvent() {
		this(malloc());
	}

	public XErrorEvent(ByteBuffer struct) {
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
	public void setDisplay(long display) { display(struct, display); }
	public void setSerial(long serial) { serial(struct, serial); }
	public void setErrorCode(int error_code) { error_code(struct, error_code); }
	public void setRequestCode(int request_code) { request_code(struct, request_code); }
	public void setMinorCode(int minor_code) { minor_code(struct, minor_code); }
	public void setResourceid(long resourceid) { resourceid(struct, resourceid); }

	public int getType() { return type(struct); }
	public long getDisplay() { return display(struct); }
	public long getSerial() { return serial(struct); }
	public int getErrorCode() { return error_code(struct); }
	public int getRequestCode() { return request_code(struct); }
	public int getMinorCode() { return minor_code(struct); }
	public long getResourceid() { return resourceid(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		type(xerrorevent, type);
		display(xerrorevent, display);
		serial(xerrorevent, serial);
		error_code(xerrorevent, error_code);
		request_code(xerrorevent, request_code);
		minor_code(xerrorevent, minor_code);
		resourceid(xerrorevent, resourceid);

		return xerrorevent;
	}

	public static void type(ByteBuffer xerrorevent, int type) { xerrorevent.putInt(xerrorevent.position() + TYPE, type); }
	public static void display(ByteBuffer xerrorevent, long display) { PointerBuffer.put(xerrorevent, xerrorevent.position() + DISPLAY, display); }
	public static void serial(ByteBuffer xerrorevent, long serial) { PointerBuffer.put(xerrorevent, xerrorevent.position() + SERIAL, serial); }
	public static void error_code(ByteBuffer xerrorevent, int error_code) { xerrorevent.put(xerrorevent.position() + ERROR_CODE, (byte)error_code); }
	public static void request_code(ByteBuffer xerrorevent, int request_code) { xerrorevent.put(xerrorevent.position() + REQUEST_CODE, (byte)request_code); }
	public static void minor_code(ByteBuffer xerrorevent, int minor_code) { xerrorevent.put(xerrorevent.position() + MINOR_CODE, (byte)minor_code); }
	public static void resourceid(ByteBuffer xerrorevent, long resourceid) { PointerBuffer.put(xerrorevent, xerrorevent.position() + RESOURCEID, resourceid); }

	public static int type(ByteBuffer xerrorevent) { return xerrorevent.getInt(xerrorevent.position() + TYPE); }
	public static long display(ByteBuffer xerrorevent) { return PointerBuffer.get(xerrorevent, xerrorevent.position() + DISPLAY); }
	public static long serial(ByteBuffer xerrorevent) { return PointerBuffer.get(xerrorevent, xerrorevent.position() + SERIAL); }
	public static int error_code(ByteBuffer xerrorevent) { return xerrorevent.get(xerrorevent.position() + ERROR_CODE) & 0xFF; }
	public static int request_code(ByteBuffer xerrorevent) { return xerrorevent.get(xerrorevent.position() + REQUEST_CODE) & 0xFF; }
	public static int minor_code(ByteBuffer xerrorevent) { return xerrorevent.get(xerrorevent.position() + MINOR_CODE) & 0xFF; }
	public static long resourceid(ByteBuffer xerrorevent) { return PointerBuffer.get(xerrorevent, xerrorevent.position() + RESOURCEID); }

}