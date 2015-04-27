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
public final class XIDeviceEvent implements Pointer {

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

	private final ByteBuffer struct;

	public XIDeviceEvent() {
		this(malloc());
	}

	public XIDeviceEvent(ByteBuffer struct) {
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
	public void setTime(long time) { time(struct, time); }
	public void setDeviceid(int deviceid) { deviceid(struct, deviceid); }
	public void setSourceid(int sourceid) { sourceid(struct, sourceid); }
	public void setDetail(int detail) { detail(struct, detail); }
	public void setRoot(long root) { root(struct, root); }
	public void setEvent(long event) { event(struct, event); }
	public void setChild(long child) { child(struct, child); }
	public void setRootX(double root_x) { root_x(struct, root_x); }
	public void setRootY(double root_y) { root_y(struct, root_y); }
	public void setEventX(double event_x) { event_x(struct, event_x); }
	public void setEventY(double event_y) { event_y(struct, event_y); }
	public void setFlags(int flags) { flags(struct, flags); }
	public void setButtons(ByteBuffer buttons) { buttonsSet(struct, buttons); }
	public void setButtonsMaskLen(int mask_len) { buttonsMask_len(struct, mask_len); }
	public void setButtonsMask(long mask) { buttonsMask(struct, mask); }
	public void setButtonsMask(ByteBuffer mask) { buttonsMask(struct, mask); }
	public void setValuators(ByteBuffer valuators) { valuatorsSet(struct, valuators); }
	public void setValuatorsMaskLen(int mask_len) { valuatorsMask_len(struct, mask_len); }
	public void setValuatorsMask(long mask) { valuatorsMask(struct, mask); }
	public void setValuatorsMask(ByteBuffer mask) { valuatorsMask(struct, mask); }
	public void setValuatorsValues(long values) { valuatorsValues(struct, values); }
	public void setValuatorsValues(ByteBuffer values) { valuatorsValues(struct, values); }
	public void setMods(ByteBuffer mods) { modsSet(struct, mods); }
	public void setModsBase(int base) { modsBase(struct, base); }
	public void setModsLatched(int latched) { modsLatched(struct, latched); }
	public void setModsLocked(int locked) { modsLocked(struct, locked); }
	public void setModsEffective(int effective) { modsEffective(struct, effective); }
	public void setGroup(ByteBuffer group) { groupSet(struct, group); }
	public void setGroupBase(int base) { groupBase(struct, base); }
	public void setGroupLatched(int latched) { groupLatched(struct, latched); }
	public void setGroupLocked(int locked) { groupLocked(struct, locked); }
	public void setGroupEffective(int effective) { groupEffective(struct, effective); }

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public int getExtension() { return extension(struct); }
	public int getEvtype() { return evtype(struct); }
	public long getTime() { return time(struct); }
	public int getDeviceid() { return deviceid(struct); }
	public int getSourceid() { return sourceid(struct); }
	public int getDetail() { return detail(struct); }
	public long getRoot() { return root(struct); }
	public long getEvent() { return event(struct); }
	public long getChild() { return child(struct); }
	public double getRootX() { return root_x(struct); }
	public double getRootY() { return root_y(struct); }
	public double getEventX() { return event_x(struct); }
	public double getEventY() { return event_y(struct); }
	public int getFlags() { return flags(struct); }
	public void getButtons(ByteBuffer buttons) { buttonsGet(struct, buttons); }
	public int getButtonsMaskLen() { return buttonsMask_len(struct); }
	public long getButtonsMask() { return buttonsMask(struct); }
	public ByteBuffer getButtonsMask(int byteLen) { return buttonsMask(struct, byteLen); }
	public void getValuators(ByteBuffer valuators) { valuatorsGet(struct, valuators); }
	public int getValuatorsMaskLen() { return valuatorsMask_len(struct); }
	public long getValuatorsMask() { return valuatorsMask(struct); }
	public ByteBuffer getValuatorsMask(int byteLen) { return valuatorsMask(struct, byteLen); }
	public long getValuatorsValues() { return valuatorsValues(struct); }
	public ByteBuffer getValuatorsValues(int byteLen) { return valuatorsValues(struct, byteLen); }
	public void getMods(ByteBuffer mods) { modsGet(struct, mods); }
	public int getModsBase() { return modsBase(struct); }
	public int getModsLatched() { return modsLatched(struct); }
	public int getModsLocked() { return modsLocked(struct); }
	public int getModsEffective() { return modsEffective(struct); }
	public void getGroup(ByteBuffer group) { groupGet(struct, group); }
	public int getGroupBase() { return groupBase(struct); }
	public int getGroupLatched() { return groupLatched(struct); }
	public int getGroupLocked() { return groupLocked(struct); }
	public int getGroupEffective() { return groupEffective(struct); }

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

		type(xideviceevent, type);
		serial(xideviceevent, serial);
		send_event(xideviceevent, send_event);
		display(xideviceevent, display);
		extension(xideviceevent, extension);
		evtype(xideviceevent, evtype);
		time(xideviceevent, time);
		deviceid(xideviceevent, deviceid);
		sourceid(xideviceevent, sourceid);
		detail(xideviceevent, detail);
		root(xideviceevent, root);
		event(xideviceevent, event);
		child(xideviceevent, child);
		root_x(xideviceevent, root_x);
		root_y(xideviceevent, root_y);
		event_x(xideviceevent, event_x);
		event_y(xideviceevent, event_y);
		flags(xideviceevent, flags);
		buttonsSet(xideviceevent, buttons);
		valuatorsSet(xideviceevent, valuators);
		modsSet(xideviceevent, mods);
		groupSet(xideviceevent, group);

		return xideviceevent;
	}

	public static void type(ByteBuffer xideviceevent, int type) { xideviceevent.putInt(xideviceevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xideviceevent, long serial) { PointerBuffer.put(xideviceevent, xideviceevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xideviceevent, int send_event) { xideviceevent.putInt(xideviceevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xideviceevent, long display) { PointerBuffer.put(xideviceevent, xideviceevent.position() + DISPLAY, display); }
	public static void extension(ByteBuffer xideviceevent, int extension) { xideviceevent.putInt(xideviceevent.position() + EXTENSION, extension); }
	public static void evtype(ByteBuffer xideviceevent, int evtype) { xideviceevent.putInt(xideviceevent.position() + EVTYPE, evtype); }
	public static void time(ByteBuffer xideviceevent, long time) { PointerBuffer.put(xideviceevent, xideviceevent.position() + TIME, time); }
	public static void deviceid(ByteBuffer xideviceevent, int deviceid) { xideviceevent.putInt(xideviceevent.position() + DEVICEID, deviceid); }
	public static void sourceid(ByteBuffer xideviceevent, int sourceid) { xideviceevent.putInt(xideviceevent.position() + SOURCEID, sourceid); }
	public static void detail(ByteBuffer xideviceevent, int detail) { xideviceevent.putInt(xideviceevent.position() + DETAIL, detail); }
	public static void root(ByteBuffer xideviceevent, long root) { PointerBuffer.put(xideviceevent, xideviceevent.position() + ROOT, root); }
	public static void event(ByteBuffer xideviceevent, long event) { PointerBuffer.put(xideviceevent, xideviceevent.position() + EVENT, event); }
	public static void child(ByteBuffer xideviceevent, long child) { PointerBuffer.put(xideviceevent, xideviceevent.position() + CHILD, child); }
	public static void root_x(ByteBuffer xideviceevent, double root_x) { xideviceevent.putDouble(xideviceevent.position() + ROOT_X, root_x); }
	public static void root_y(ByteBuffer xideviceevent, double root_y) { xideviceevent.putDouble(xideviceevent.position() + ROOT_Y, root_y); }
	public static void event_x(ByteBuffer xideviceevent, double event_x) { xideviceevent.putDouble(xideviceevent.position() + EVENT_X, event_x); }
	public static void event_y(ByteBuffer xideviceevent, double event_y) { xideviceevent.putDouble(xideviceevent.position() + EVENT_Y, event_y); }
	public static void flags(ByteBuffer xideviceevent, int flags) { xideviceevent.putInt(xideviceevent.position() + FLAGS, flags); }
	public static void buttonsSet(ByteBuffer xideviceevent, ByteBuffer buttons) { if ( buttons != null ) memCopy(memAddress(buttons), memAddress(xideviceevent) + BUTTONS, XIButtonState.SIZEOF); }
	public static void buttonsMask_len(ByteBuffer xideviceevent, int mask_len) { xideviceevent.putInt(xideviceevent.position() + BUTTONS + XIButtonState.MASK_LEN, mask_len); }
	public static void buttonsMask(ByteBuffer xideviceevent, long mask) { PointerBuffer.put(xideviceevent, xideviceevent.position() + BUTTONS + XIButtonState.MASK, mask); }
	public static void buttonsMask(ByteBuffer xideviceevent, ByteBuffer mask) { buttonsMask(xideviceevent, memAddressSafe(mask)); }
	public static void valuatorsSet(ByteBuffer xideviceevent, ByteBuffer valuators) { if ( valuators != null ) memCopy(memAddress(valuators), memAddress(xideviceevent) + VALUATORS, XIValuatorState.SIZEOF); }
	public static void valuatorsMask_len(ByteBuffer xideviceevent, int mask_len) { xideviceevent.putInt(xideviceevent.position() + VALUATORS + XIValuatorState.MASK_LEN, mask_len); }
	public static void valuatorsMask(ByteBuffer xideviceevent, long mask) { PointerBuffer.put(xideviceevent, xideviceevent.position() + VALUATORS + XIValuatorState.MASK, mask); }
	public static void valuatorsMask(ByteBuffer xideviceevent, ByteBuffer mask) { valuatorsMask(xideviceevent, memAddressSafe(mask)); }
	public static void valuatorsValues(ByteBuffer xideviceevent, long values) { PointerBuffer.put(xideviceevent, xideviceevent.position() + VALUATORS + XIValuatorState.VALUES, values); }
	public static void valuatorsValues(ByteBuffer xideviceevent, ByteBuffer values) { valuatorsValues(xideviceevent, memAddressSafe(values)); }
	public static void modsSet(ByteBuffer xideviceevent, ByteBuffer mods) { if ( mods != null ) memCopy(memAddress(mods), memAddress(xideviceevent) + MODS, XIModifierState.SIZEOF); }
	public static void modsBase(ByteBuffer xideviceevent, int base) { xideviceevent.putInt(xideviceevent.position() + MODS + XIModifierState.BASE, base); }
	public static void modsLatched(ByteBuffer xideviceevent, int latched) { xideviceevent.putInt(xideviceevent.position() + MODS + XIModifierState.LATCHED, latched); }
	public static void modsLocked(ByteBuffer xideviceevent, int locked) { xideviceevent.putInt(xideviceevent.position() + MODS + XIModifierState.LOCKED, locked); }
	public static void modsEffective(ByteBuffer xideviceevent, int effective) { xideviceevent.putInt(xideviceevent.position() + MODS + XIModifierState.EFFECTIVE, effective); }
	public static void groupSet(ByteBuffer xideviceevent, ByteBuffer group) { if ( group != null ) memCopy(memAddress(group), memAddress(xideviceevent) + GROUP, XIModifierState.SIZEOF); }
	public static void groupBase(ByteBuffer xideviceevent, int base) { xideviceevent.putInt(xideviceevent.position() + GROUP + XIModifierState.BASE, base); }
	public static void groupLatched(ByteBuffer xideviceevent, int latched) { xideviceevent.putInt(xideviceevent.position() + GROUP + XIModifierState.LATCHED, latched); }
	public static void groupLocked(ByteBuffer xideviceevent, int locked) { xideviceevent.putInt(xideviceevent.position() + GROUP + XIModifierState.LOCKED, locked); }
	public static void groupEffective(ByteBuffer xideviceevent, int effective) { xideviceevent.putInt(xideviceevent.position() + GROUP + XIModifierState.EFFECTIVE, effective); }

	public static int type(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + TYPE); }
	public static long serial(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + DISPLAY); }
	public static int extension(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + EXTENSION); }
	public static int evtype(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + EVTYPE); }
	public static long time(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + TIME); }
	public static int deviceid(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + DEVICEID); }
	public static int sourceid(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + SOURCEID); }
	public static int detail(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + DETAIL); }
	public static long root(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + ROOT); }
	public static long event(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + EVENT); }
	public static long child(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + CHILD); }
	public static double root_x(ByteBuffer xideviceevent) { return xideviceevent.getDouble(xideviceevent.position() + ROOT_X); }
	public static double root_y(ByteBuffer xideviceevent) { return xideviceevent.getDouble(xideviceevent.position() + ROOT_Y); }
	public static double event_x(ByteBuffer xideviceevent) { return xideviceevent.getDouble(xideviceevent.position() + EVENT_X); }
	public static double event_y(ByteBuffer xideviceevent) { return xideviceevent.getDouble(xideviceevent.position() + EVENT_Y); }
	public static int flags(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + FLAGS); }
	public static void buttonsGet(ByteBuffer xideviceevent, ByteBuffer buttons) { if ( LWJGLUtil.CHECKS ) checkBuffer(buttons, XIButtonState.SIZEOF); memCopy(memAddress(xideviceevent) + BUTTONS, memAddress(buttons), XIButtonState.SIZEOF); }
	public static int buttonsMask_len(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + BUTTONS + XIButtonState.MASK_LEN); }
	public static long buttonsMask(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + BUTTONS + XIButtonState.MASK); }
	public static ByteBuffer buttonsMask(ByteBuffer xideviceevent, int byteLen) { return memByteBuffer(buttonsMask(xideviceevent), byteLen); }
	public static void valuatorsGet(ByteBuffer xideviceevent, ByteBuffer valuators) { if ( LWJGLUtil.CHECKS ) checkBuffer(valuators, XIValuatorState.SIZEOF); memCopy(memAddress(xideviceevent) + VALUATORS, memAddress(valuators), XIValuatorState.SIZEOF); }
	public static int valuatorsMask_len(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + VALUATORS + XIValuatorState.MASK_LEN); }
	public static long valuatorsMask(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + VALUATORS + XIValuatorState.MASK); }
	public static ByteBuffer valuatorsMask(ByteBuffer xideviceevent, int byteLen) { return memByteBuffer(valuatorsMask(xideviceevent), byteLen); }
	public static long valuatorsValues(ByteBuffer xideviceevent) { return PointerBuffer.get(xideviceevent, xideviceevent.position() + VALUATORS + XIValuatorState.VALUES); }
	public static ByteBuffer valuatorsValues(ByteBuffer xideviceevent, int byteLen) { return memByteBuffer(valuatorsValues(xideviceevent), byteLen); }
	public static void modsGet(ByteBuffer xideviceevent, ByteBuffer mods) { if ( LWJGLUtil.CHECKS ) checkBuffer(mods, XIModifierState.SIZEOF); memCopy(memAddress(xideviceevent) + MODS, memAddress(mods), XIModifierState.SIZEOF); }
	public static int modsBase(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + MODS + XIModifierState.BASE); }
	public static int modsLatched(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + MODS + XIModifierState.LATCHED); }
	public static int modsLocked(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + MODS + XIModifierState.LOCKED); }
	public static int modsEffective(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + MODS + XIModifierState.EFFECTIVE); }
	public static void groupGet(ByteBuffer xideviceevent, ByteBuffer group) { if ( LWJGLUtil.CHECKS ) checkBuffer(group, XIModifierState.SIZEOF); memCopy(memAddress(xideviceevent) + GROUP, memAddress(group), XIModifierState.SIZEOF); }
	public static int groupBase(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + GROUP + XIModifierState.BASE); }
	public static int groupLatched(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + GROUP + XIModifierState.LATCHED); }
	public static int groupLocked(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + GROUP + XIModifierState.LOCKED); }
	public static int groupEffective(ByteBuffer xideviceevent) { return xideviceevent.getInt(xideviceevent.position() + GROUP + XIModifierState.EFFECTIVE); }

}