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
public final class XSelectionEvent {

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

	private XSelectionEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
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

		typeSet(xselectionevent, type);
		serialSet(xselectionevent, serial);
		send_eventSet(xselectionevent, send_event);
		displaySet(xselectionevent, display);
		requestorSet(xselectionevent, requestor);
		selectionSet(xselectionevent, selection);
		targetSet(xselectionevent, target);
		propertySet(xselectionevent, property);
		timeSet(xselectionevent, time);

		return xselectionevent;
	}

	public static void typeSet(ByteBuffer xselectionevent, int type) { xselectionevent.putInt(xselectionevent.position() + TYPE, type); }
	public static void serialSet(ByteBuffer xselectionevent, long serial) { PointerBuffer.put(xselectionevent, xselectionevent.position() + SERIAL, serial); }
	public static void send_eventSet(ByteBuffer xselectionevent, int send_event) { xselectionevent.putInt(xselectionevent.position() + SEND_EVENT, send_event); }
	public static void displaySet(ByteBuffer xselectionevent, long display) { PointerBuffer.put(xselectionevent, xselectionevent.position() + DISPLAY, display); }
	public static void requestorSet(ByteBuffer xselectionevent, long requestor) { PointerBuffer.put(xselectionevent, xselectionevent.position() + REQUESTOR, requestor); }
	public static void selectionSet(ByteBuffer xselectionevent, long selection) { PointerBuffer.put(xselectionevent, xselectionevent.position() + SELECTION, selection); }
	public static void targetSet(ByteBuffer xselectionevent, long target) { PointerBuffer.put(xselectionevent, xselectionevent.position() + TARGET, target); }
	public static void propertySet(ByteBuffer xselectionevent, long property) { PointerBuffer.put(xselectionevent, xselectionevent.position() + PROPERTY, property); }
	public static void timeSet(ByteBuffer xselectionevent, long time) { PointerBuffer.put(xselectionevent, xselectionevent.position() + TIME, time); }

	public static int typeGet(ByteBuffer xselectionevent) { return xselectionevent.getInt(xselectionevent.position() + TYPE); }
	public static long serialGet(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + SERIAL); }
	public static int send_eventGet(ByteBuffer xselectionevent) { return xselectionevent.getInt(xselectionevent.position() + SEND_EVENT); }
	public static long displayGet(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + DISPLAY); }
	public static long requestorGet(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + REQUESTOR); }
	public static long selectionGet(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + SELECTION); }
	public static long targetGet(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + TARGET); }
	public static long propertyGet(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + PROPERTY); }
	public static long timeGet(ByteBuffer xselectionevent) { return PointerBuffer.get(xselectionevent, xselectionevent.position() + TIME); }

}