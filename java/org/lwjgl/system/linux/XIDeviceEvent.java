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

/** XInput2 device event. */
public final class XIDeviceEvent {

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
		TIME,
		DEVICEID,
		SOURCEID,
		DETAIL,
		ROOT,
		EVENT,
		CHILD,
		ROOT_X,
		ROOT_Y,
		EVENT_X,
		EVENT_Y,
		FLAGS,
		BUTTONS,
		VALUATORS,
		MODS,
		GROUP;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(22);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		EXTENSION = offsets.get(4);
		EVTYPE = offsets.get(5);
		TIME = offsets.get(6);
		DEVICEID = offsets.get(7);
		SOURCEID = offsets.get(8);
		DETAIL = offsets.get(9);
		ROOT = offsets.get(10);
		EVENT = offsets.get(11);
		CHILD = offsets.get(12);
		ROOT_X = offsets.get(13);
		ROOT_Y = offsets.get(14);
		EVENT_X = offsets.get(15);
		EVENT_Y = offsets.get(16);
		FLAGS = offsets.get(17);
		BUTTONS = offsets.get(18);
		VALUATORS = offsets.get(19);
		MODS = offsets.get(20);
		GROUP = offsets.get(21);
	}

	private XIDeviceEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		int extension,
		int evtype,
		long time,
		int deviceid,
		int sourceid,
		int detail,
		long root,
		long event,
		long child,
		double root_x,
		double root_y,
		double event_x,
		double event_y,
		int flags,
		long buttons,
		long valuators,
		long mods,
		long group
	) {
		ByteBuffer xideviceevent = malloc();

		typeSet(xideviceevent, type);
		serialSet(xideviceevent, serial);
		send_eventSet(xideviceevent, send_event);
		displaySet(xideviceevent, display);
		extensionSet(xideviceevent, extension);
		evtypeSet(xideviceevent, evtype);
		timeSet(xideviceevent, time);
		deviceidSet(xideviceevent, deviceid);
		sourceidSet(xideviceevent, sourceid);
		detailSet(xideviceevent, detail);
		rootSet(xideviceevent, root);
		eventSet(xideviceevent, event);
		childSet(xideviceevent, child);
		root_xSet(xideviceevent, root_x);
		root_ySet(xideviceevent, root_y);
		event_xSet(xideviceevent, event_x);
		event_ySet(xideviceevent, event_y);
		flagsSet(xideviceevent, flags);
		buttonsSet(xideviceevent, buttons);
		valuatorsSet(xideviceevent, valuators);
		modsSet(xideviceevent, mods);
		groupSet(xideviceevent, group);

		return xideviceevent;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		int extension,
		int evtype,
		long time,
		int deviceid,
		int sourceid,
		int detail,
		long root,
		long event,
		long child,
		double root_x,
		double root_y,
		double event_x,
		double event_y,
		int flags,
		ByteBuffer buttons,
		ByteBuffer valuators,
		ByteBuffer mods,
		ByteBuffer group
	) {
		ByteBuffer xideviceevent = malloc();

		typeSet(xideviceevent, type);
		serialSet(xideviceevent, serial);
		send_eventSet(xideviceevent, send_event);
		displaySet(xideviceevent, display);
		extensionSet(xideviceevent, extension);
		evtypeSet(xideviceevent, evtype);
		timeSet(xideviceevent, time);
		deviceidSet(xideviceevent, deviceid);
		sourceidSet(xideviceevent, sourceid);
		detailSet(xideviceevent, detail);
		rootSet(xideviceevent, root);
		eventSet(xideviceevent, event);
		childSet(xideviceevent, child);
		root_xSet(xideviceevent, root_x);
		root_ySet(xideviceevent, root_y);
		event_xSet(xideviceevent, event_x);
		event_ySet(xideviceevent, event_y);
		flagsSet(xideviceevent, flags);
		buttonsSet(xideviceevent, buttons);
		valuatorsSet(xideviceevent, valuators);
		modsSet(xideviceevent, mods);
		groupSet(xideviceevent, group);

		return xideviceevent;
	}

	public static void typeSet(ByteBuffer xideviceevent, int type) { xideviceevent.putInt(xideviceevent.position() + TYPE, type); }
	public static void serialSet(ByteBuffer xideviceevent, long serial) { PointerBuffer.put(xideviceevent, xideviceevent.position() + SERIAL, serial); }
	public static void send_eventSet(ByteBuffer xideviceevent, int send_event) { xideviceevent.putInt(xideviceevent.position() + SEND_EVENT, send_event); }
	public static void displaySet(ByteBuffer xideviceevent, long display) { PointerBuffer.put(xideviceevent, xideviceevent.position() + DISPLAY, display); }
	public static void extensionSet(ByteBuffer xideviceevent, int extension) { xideviceevent.putInt(xideviceevent.position() + EXTENSION, extension); }
	public static void evtypeSet(ByteBuffer xideviceevent, int evtype) { xideviceevent.putInt(xideviceevent.position() + EVTYPE, evtype); }
	public static void timeSet(ByteBuffer xideviceevent, long time) { PointerBuffer.put(xideviceevent, xideviceevent.position() + TIME, time); }
	public static void deviceidSet(ByteBuffer xideviceevent, int deviceid) { xideviceevent.putInt(xideviceevent.position() + DEVICEID, deviceid); }
	public static void sourceidSet(ByteBuffer xideviceevent, int sourceid) { xideviceevent.putInt(xideviceevent.position() + SOURCEID, sourceid); }
	public static void detailSet(ByteBuffer xideviceevent, int detail) { xideviceevent.putInt(xideviceevent.position() + DETAIL, detail); }
	public static void rootSet(ByteBuffer xideviceevent, long root) { PointerBuffer.put(xideviceevent, xideviceevent.position() + ROOT, root); }
	public static void eventSet(ByteBuffer xideviceevent, long event) { PointerBuffer.put(xideviceevent, xideviceevent.position() + EVENT, event); }
	public static void childSet(ByteBuffer xideviceevent, long child) { PointerBuffer.put(xideviceevent, xideviceevent.position() + CHILD, child); }
	public static void root_xSet(ByteBuffer xideviceevent, double root_x) { xideviceevent.putDouble(xideviceevent.position() + ROOT_X, root_x); }
	public static void root_ySet(ByteBuffer xideviceevent, double root_y) { xideviceevent.putDouble(xideviceevent.position() + ROOT_Y, root_y); }
	public static void event_xSet(ByteBuffer xideviceevent, double event_x) { xideviceevent.putDouble(xideviceevent.position() + EVENT_X, event_x); }
	public static void event_ySet(ByteBuffer xideviceevent, double event_y) { xideviceevent.putDouble(xideviceevent.position() + EVENT_Y, event_y); }
	public static void flagsSet(ByteBuffer xideviceevent, int flags) { xideviceevent.putInt(xideviceevent.position() + FLAGS, flags); }
	public static void buttonsSet(ByteBuffer xideviceevent, long buttons) { if ( buttons != NULL ) memCopy(buttons, memAddress(xideviceevent) + BUTTONS, XIButtonState.SIZEOF); }
	public static void buttonsSet(ByteBuffer xideviceevent, ByteBuffer buttons) { buttonsSet(xideviceevent, memAddressSafe(buttons)); }
	public static void buttonsMask_lenSet(ByteBuffer xideviceevent, int mask_len) { xideviceevent.putInt(xideviceevent.position() + BUTTONS + XIButtonState.MASK_LEN, mask_len); }
	public static void buttonsMaskSet(ByteBuffer xideviceevent, long mask) { PointerBuffer.put(xideviceevent, xideviceevent.position() + BUTTONS + XIButtonState.MASK, mask); }
	public static void buttonsMaskSet(ByteBuffer xideviceevent, ByteBuffer mask) { buttonsMaskSet(xideviceevent, memAddress(mask)); }
	public static void valuatorsSet(ByteBuffer xideviceevent, long valuators) { if ( valuators != NULL ) memCopy(valuators, memAddress(xideviceevent) + VALUATORS, XIValuatorState.SIZEOF); }
	public static void valuatorsSet(ByteBuffer xideviceevent, ByteBuffer valuators) { valuatorsSet(xideviceevent, memAddressSafe(valuators)); }
	public static void valuatorsMask_lenSet(ByteBuffer xideviceevent, int mask_len) { xideviceevent.putInt(xideviceevent.position() + VALUATORS + XIValuatorState.MASK_LEN, mask_len); }
	public static void valuatorsMaskSet(ByteBuffer xideviceevent, long mask) { PointerBuffer.put(xideviceevent, xideviceevent.position() + VALUATORS + XIValuatorState.MASK, mask); }
	public static void valuatorsMaskSet(ByteBuffer xideviceevent, ByteBuffer mask) { valuatorsMaskSet(xideviceevent, memAddress(mask)); }
	public static void valuatorsValuesSet(ByteBuffer xideviceevent, long values) { PointerBuffer.put(xideviceevent, xideviceevent.position() + VALUATORS + XIValuatorState.VALUES, values); }
	public static void valuatorsValuesSet(ByteBuffer xideviceevent, ByteBuffer values) { valuatorsValuesSet(xideviceevent, memAddress(values)); }
	public static void modsSet(ByteBuffer xideviceevent, long mods) { if ( mods != NULL ) memCopy(mods, memAddress(xideviceevent) + MODS, XIModifierState.SIZEOF); }
	public static void modsSet(ByteBuffer xideviceevent, ByteBuffer mods) { modsSet(xideviceevent, memAddressSafe(mods)); }
	public static void modsBaseSet(ByteBuffer xideviceevent, int base) { xideviceevent.putInt(xideviceevent.position() + MODS + XIModifierState.BASE, base); }
	public static void modsLatchedSet(ByteBuffer xideviceevent, int latched) { xideviceevent.putInt(xideviceevent.position() + MODS + XIModifierState.LATCHED, latched); }
	public static void modsLockedSet(ByteBuffer xideviceevent, int locked) { xideviceevent.putInt(xideviceevent.position() + MODS + XIModifierState.LOCKED, locked); }
	public static void modsEffectiveSet(ByteBuffer xideviceevent, int effective) { xideviceevent.putInt(xideviceevent.position() + MODS + XIModifierState.EFFECTIVE, effective); }
	public static void groupSet(ByteBuffer xideviceevent, long group) { if ( group != NULL ) memCopy(group, memAddress(xideviceevent) + GROUP, XIModifierState.SIZEOF); }
	public static void groupSet(ByteBuffer xideviceevent, ByteBuffer group) { groupSet(xideviceevent, memAddressSafe(group)); }
	public static void groupBaseSet(ByteBuffer xideviceevent, int base) { xideviceevent.putInt(xideviceevent.position() + GROUP + XIModifierState.BASE, base); }
	public static void groupLatchedSet(ByteBuffer xideviceevent, int latched) { xideviceevent.putInt(xideviceevent.position() + GROUP + XIModifierState.LATCHED, latched); }
	public static void groupLockedSet(ByteBuffer xideviceevent, int locked) { xideviceevent.putInt(xideviceevent.position() + GROUP + XIModifierState.LOCKED, locked); }
	public static void groupEffectiveSet(ByteBuffer xideviceevent, int effective) { xideviceevent.putInt(xideviceevent.position() + GROUP + XIModifierState.EFFECTIVE, effective); }

	public static int typeGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + TYPE); }
	public static long serialGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + SERIAL); }
	public static int send_eventGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + SEND_EVENT); }
	public static long displayGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + DISPLAY); }
	public static int extensionGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + EXTENSION); }
	public static int evtypeGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + EVTYPE); }
	public static long timeGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + TIME); }
	public static int deviceidGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + DEVICEID); }
	public static int sourceidGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + SOURCEID); }
	public static int detailGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + DETAIL); }
	public static long rootGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + ROOT); }
	public static long eventGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + EVENT); }
	public static long childGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + CHILD); }
	public static double root_xGet(ByteBuffer xideviceevent) { return xideviceevent.getDouble(xideviceevent.position() + ROOT_X); }
	public static double root_yGet(ByteBuffer xideviceevent) { return xideviceevent.getDouble(xideviceevent.position() + ROOT_Y); }
	public static double event_xGet(ByteBuffer xideviceevent) { return xideviceevent.getDouble(xideviceevent.position() + EVENT_X); }
	public static double event_yGet(ByteBuffer xideviceevent) { return xideviceevent.getDouble(xideviceevent.position() + EVENT_Y); }
	public static int flagsGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + FLAGS); }
	public static void buttonsGet(ByteBuffer xideviceevent, long buttons) { memCopy(memAddress(xideviceevent) + BUTTONS, buttons, XIButtonState.SIZEOF); }
	public static void buttonsGet(ByteBuffer xideviceevent, ByteBuffer buttons) { checkBuffer(buttons, XIButtonState.SIZEOF); buttonsGet(xideviceevent, memAddress(buttons)); }
	public static int buttonsMask_lenGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + BUTTONS + XIButtonState.MASK_LEN); }
	public static long buttonsMaskGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + BUTTONS + XIButtonState.MASK); }
	public static ByteBuffer buttonsMaskGet(ByteBuffer xideviceevent, int size) { long address = buttonsMaskGet(xideviceevent); return address == 0 ? null : memByteBuffer(address, size); }
	public static void valuatorsGet(ByteBuffer xideviceevent, long valuators) { memCopy(memAddress(xideviceevent) + VALUATORS, valuators, XIValuatorState.SIZEOF); }
	public static void valuatorsGet(ByteBuffer xideviceevent, ByteBuffer valuators) { checkBuffer(valuators, XIValuatorState.SIZEOF); valuatorsGet(xideviceevent, memAddress(valuators)); }
	public static int valuatorsMask_lenGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + VALUATORS + XIValuatorState.MASK_LEN); }
	public static long valuatorsMaskGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + VALUATORS + XIValuatorState.MASK); }
	public static ByteBuffer valuatorsMaskGet(ByteBuffer xideviceevent, int size) { long address = valuatorsMaskGet(xideviceevent); return address == 0 ? null : memByteBuffer(address, size); }
	public static long valuatorsValuesGet(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + VALUATORS + XIValuatorState.VALUES); }
	public static ByteBuffer valuatorsValuesGet(ByteBuffer xideviceevent, int size) { long address = valuatorsValuesGet(xideviceevent); return address == 0 ? null : memByteBuffer(address, size); }
	public static void modsGet(ByteBuffer xideviceevent, long mods) { memCopy(memAddress(xideviceevent) + MODS, mods, XIModifierState.SIZEOF); }
	public static void modsGet(ByteBuffer xideviceevent, ByteBuffer mods) { checkBuffer(mods, XIModifierState.SIZEOF); modsGet(xideviceevent, memAddress(mods)); }
	public static int modsBaseGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + MODS + XIModifierState.BASE); }
	public static int modsLatchedGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + MODS + XIModifierState.LATCHED); }
	public static int modsLockedGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + MODS + XIModifierState.LOCKED); }
	public static int modsEffectiveGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + MODS + XIModifierState.EFFECTIVE); }
	public static void groupGet(ByteBuffer xideviceevent, long group) { memCopy(memAddress(xideviceevent) + GROUP, group, XIModifierState.SIZEOF); }
	public static void groupGet(ByteBuffer xideviceevent, ByteBuffer group) { checkBuffer(group, XIModifierState.SIZEOF); groupGet(xideviceevent, memAddress(group)); }
	public static int groupBaseGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + GROUP + XIModifierState.BASE); }
	public static int groupLatchedGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + GROUP + XIModifierState.LATCHED); }
	public static int groupLockedGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + GROUP + XIModifierState.LOCKED); }
	public static int groupEffectiveGet(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + GROUP + XIModifierState.EFFECTIVE); }

}