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

/** SelectionRequest event structure. */
public final class XSelectionRequestEvent implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		OWNER,
		REQUESTOR,
		SELECTION,
		TARGET,
		PROPERTY,
		TIME;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(10);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		OWNER = offsets.get(4);
		REQUESTOR = offsets.get(5);
		SELECTION = offsets.get(6);
		TARGET = offsets.get(7);
		PROPERTY = offsets.get(8);
		TIME = offsets.get(9);
	}

	private final ByteBuffer struct;

	public XSelectionRequestEvent() {
		this(malloc());
	}

	public XSelectionRequestEvent(ByteBuffer struct) {
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
	public void setOwner(long owner) { owner(struct, owner); }
	public void setRequestor(long requestor) { requestor(struct, requestor); }
	public void setSelection(long selection) { selection(struct, selection); }
	public void setTarget(long target) { target(struct, target); }
	public void setProperty(long property) { property(struct, property); }
	public void setTime(long time) { time(struct, time); }

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public long getOwner() { return owner(struct); }
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
		long owner,
		long requestor,
		long selection,
		long target,
		long property,
		long time
	) {
		ByteBuffer xselectionrequestevent = malloc();

		type(xselectionrequestevent, type);
		serial(xselectionrequestevent, serial);
		send_event(xselectionrequestevent, send_event);
		display(xselectionrequestevent, display);
		owner(xselectionrequestevent, owner);
		requestor(xselectionrequestevent, requestor);
		selection(xselectionrequestevent, selection);
		target(xselectionrequestevent, target);
		property(xselectionrequestevent, property);
		time(xselectionrequestevent, time);

		return xselectionrequestevent;
	}

	public static void type(ByteBuffer xselectionrequestevent, int type) { xselectionrequestevent.putInt(xselectionrequestevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xselectionrequestevent, long serial) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xselectionrequestevent, int send_event) { xselectionrequestevent.putInt(xselectionrequestevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xselectionrequestevent, long display) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + DISPLAY, display); }
	public static void owner(ByteBuffer xselectionrequestevent, long owner) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + OWNER, owner); }
	public static void requestor(ByteBuffer xselectionrequestevent, long requestor) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + REQUESTOR, requestor); }
	public static void selection(ByteBuffer xselectionrequestevent, long selection) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + SELECTION, selection); }
	public static void target(ByteBuffer xselectionrequestevent, long target) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + TARGET, target); }
	public static void property(ByteBuffer xselectionrequestevent, long property) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + PROPERTY, property); }
	public static void time(ByteBuffer xselectionrequestevent, long time) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + TIME, time); }

	public static int type(ByteBuffer xselectionrequestevent) { return xselectionrequestevent.getInt(xselectionrequestevent.position() + TYPE); }
	public static long serial(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xselectionrequestevent) { return xselectionrequestevent.getInt(xselectionrequestevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + DISPLAY); }
	public static long owner(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + OWNER); }
	public static long requestor(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + REQUESTOR); }
	public static long selection(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + SELECTION); }
	public static long target(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + TARGET); }
	public static long property(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + PROPERTY); }
	public static long time(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + TIME); }

}