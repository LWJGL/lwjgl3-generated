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

/** Selection event structure. */
public final class XSelectionEvent implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		REQUESTOR,
		SELECTION,
		TARGET,
		PROPERTY,
		TIME;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(9);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		REQUESTOR = offsets.get(4);
		SELECTION = offsets.get(5);
		TARGET = offsets.get(6);
		PROPERTY = offsets.get(7);
		TIME = offsets.get(8);
	}

	private final ByteBuffer struct;

	public XSelectionEvent() {
		this(malloc());
	}

	public XSelectionEvent(ByteBuffer struct) {
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
	public void setRequestor(long requestor) { requestor(struct, requestor); }
	public void setSelection(long selection) { selection(struct, selection); }
	public void setTarget(long target) { target(struct, target); }
	public void setProperty(long property) { property(struct, property); }
	public void setTime(long time) { time(struct, time); }

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public long getRequestor() { return requestor(struct); }
	public long getSelection() { return selection(struct); }
	public long getTarget() { return target(struct); }
	public long getProperty() { return property(struct); }
	public long getTime() { return time(struct); }

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
		long requestor,
		long selection,
		long target,
		long property,
		long time
	) {
		ByteBuffer xselectionevent = malloc();

		type(xselectionevent, type);
		serial(xselectionevent, serial);
		send_event(xselectionevent, send_event);
		display(xselectionevent, display);
		requestor(xselectionevent, requestor);
		selection(xselectionevent, selection);
		target(xselectionevent, target);
		property(xselectionevent, property);
		time(xselectionevent, time);

		return xselectionevent;
	}

	public static void type(ByteBuffer xselectionevent, int type) { xselectionevent.putInt(xselectionevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xselectionevent, long serial) { PointerBuffer.put(xselectionevent, xselectionevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xselectionevent, int send_event) { xselectionevent.putInt(xselectionevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xselectionevent, long display) { PointerBuffer.put(xselectionevent, xselectionevent.position() + DISPLAY, display); }
	public static void requestor(ByteBuffer xselectionevent, long requestor) { PointerBuffer.put(xselectionevent, xselectionevent.position() + REQUESTOR, requestor); }
	public static void selection(ByteBuffer xselectionevent, long selection) { PointerBuffer.put(xselectionevent, xselectionevent.position() + SELECTION, selection); }
	public static void target(ByteBuffer xselectionevent, long target) { PointerBuffer.put(xselectionevent, xselectionevent.position() + TARGET, target); }
	public static void property(ByteBuffer xselectionevent, long property) { PointerBuffer.put(xselectionevent, xselectionevent.position() + PROPERTY, property); }
	public static void time(ByteBuffer xselectionevent, long time) { PointerBuffer.put(xselectionevent, xselectionevent.position() + TIME, time); }

	public static int type(ByteBuffer xselectionevent) { return xselectionevent.getInt(xselectionevent.position() + TYPE); }
	public static long serial(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xselectionevent) { return xselectionevent.getInt(xselectionevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + DISPLAY); }
	public static long requestor(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + REQUESTOR); }
	public static long selection(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + SELECTION); }
	public static long target(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + TARGET); }
	public static long property(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + PROPERTY); }
	public static long time(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + TIME); }

}