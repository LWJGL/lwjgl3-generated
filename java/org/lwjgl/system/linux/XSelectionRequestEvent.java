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
public final class XSelectionRequestEvent {

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

	private XSelectionRequestEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
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

		typeSet(xselectionrequestevent, type);
		serialSet(xselectionrequestevent, serial);
		send_eventSet(xselectionrequestevent, send_event);
		displaySet(xselectionrequestevent, display);
		ownerSet(xselectionrequestevent, owner);
		requestorSet(xselectionrequestevent, requestor);
		selectionSet(xselectionrequestevent, selection);
		targetSet(xselectionrequestevent, target);
		propertySet(xselectionrequestevent, property);
		timeSet(xselectionrequestevent, time);

		return xselectionrequestevent;
	}

	public static void typeSet(ByteBuffer xselectionrequestevent, int type) { xselectionrequestevent.putInt(xselectionrequestevent.position() + TYPE, type); }
	public static void serialSet(ByteBuffer xselectionrequestevent, long serial) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + SERIAL, serial); }
	public static void send_eventSet(ByteBuffer xselectionrequestevent, int send_event) { xselectionrequestevent.putInt(xselectionrequestevent.position() + SEND_EVENT, send_event); }
	public static void displaySet(ByteBuffer xselectionrequestevent, long display) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + DISPLAY, display); }
	public static void ownerSet(ByteBuffer xselectionrequestevent, long owner) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + OWNER, owner); }
	public static void requestorSet(ByteBuffer xselectionrequestevent, long requestor) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + REQUESTOR, requestor); }
	public static void selectionSet(ByteBuffer xselectionrequestevent, long selection) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + SELECTION, selection); }
	public static void targetSet(ByteBuffer xselectionrequestevent, long target) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + TARGET, target); }
	public static void propertySet(ByteBuffer xselectionrequestevent, long property) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + PROPERTY, property); }
	public static void timeSet(ByteBuffer xselectionrequestevent, long time) { PointerBuffer.put(xselectionrequestevent, xselectionrequestevent.position() + TIME, time); }

	public static int typeGet(ByteBuffer xselectionrequestevent) { return xselectionrequestevent.getInt(xselectionrequestevent.position() + TYPE); }
	public static long serialGet(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + SERIAL); }
	public static int send_eventGet(ByteBuffer xselectionrequestevent) { return xselectionrequestevent.getInt(xselectionrequestevent.position() + SEND_EVENT); }
	public static long displayGet(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + DISPLAY); }
	public static long ownerGet(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + OWNER); }
	public static long requestorGet(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + REQUESTOR); }
	public static long selectionGet(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + SELECTION); }
	public static long targetGet(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + TARGET); }
	public static long propertyGet(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + PROPERTY); }
	public static long timeGet(ByteBuffer xselectionrequestevent) { return PointerBuffer.get(xselectionrequestevent, xselectionrequestevent.position() + TIME); }

}