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

/** Xrandr mode info struct. */
public final class XRRModeInfo {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ID,
		WIDTH,
		HEIGHT,
		DOTCLOCK,
		HSYNCSTART,
		HSYNCEND,
		HTOTAL,
		HSKEW,
		VSYNCSTART,
		VSYNCEND,
		VTOTAL,
		NAME,
		NAMELENGTH,
		MODEFLAGS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(14);

		SIZEOF = offsets(memAddress(offsets));

		ID = offsets.get(0);
		WIDTH = offsets.get(1);
		HEIGHT = offsets.get(2);
		DOTCLOCK = offsets.get(3);
		HSYNCSTART = offsets.get(4);
		HSYNCEND = offsets.get(5);
		HTOTAL = offsets.get(6);
		HSKEW = offsets.get(7);
		VSYNCSTART = offsets.get(8);
		VSYNCEND = offsets.get(9);
		VTOTAL = offsets.get(10);
		NAME = offsets.get(11);
		NAMELENGTH = offsets.get(12);
		MODEFLAGS = offsets.get(13);
	}

	private XRRModeInfo() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long id,
		int width,
		int height,
		long dotClock,
		int hSyncStart,
		int hSyncEnd,
		int hTotal,
		int hSkew,
		int vSyncStart,
		int vSyncEnd,
		int vTotal,
		long name,
		int nameLength,
		long modeFlags
	) {
		ByteBuffer xrrmodeinfo = malloc();

		idSet(xrrmodeinfo, id);
		widthSet(xrrmodeinfo, width);
		heightSet(xrrmodeinfo, height);
		dotClockSet(xrrmodeinfo, dotClock);
		hSyncStartSet(xrrmodeinfo, hSyncStart);
		hSyncEndSet(xrrmodeinfo, hSyncEnd);
		hTotalSet(xrrmodeinfo, hTotal);
		hSkewSet(xrrmodeinfo, hSkew);
		vSyncStartSet(xrrmodeinfo, vSyncStart);
		vSyncEndSet(xrrmodeinfo, vSyncEnd);
		vTotalSet(xrrmodeinfo, vTotal);
		nameSet(xrrmodeinfo, name);
		nameLengthSet(xrrmodeinfo, nameLength);
		modeFlagsSet(xrrmodeinfo, modeFlags);

		return xrrmodeinfo;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		long id,
		int width,
		int height,
		long dotClock,
		int hSyncStart,
		int hSyncEnd,
		int hTotal,
		int hSkew,
		int vSyncStart,
		int vSyncEnd,
		int vTotal,
		ByteBuffer name,
		int nameLength,
		long modeFlags
	) {
		ByteBuffer xrrmodeinfo = malloc();

		idSet(xrrmodeinfo, id);
		widthSet(xrrmodeinfo, width);
		heightSet(xrrmodeinfo, height);
		dotClockSet(xrrmodeinfo, dotClock);
		hSyncStartSet(xrrmodeinfo, hSyncStart);
		hSyncEndSet(xrrmodeinfo, hSyncEnd);
		hTotalSet(xrrmodeinfo, hTotal);
		hSkewSet(xrrmodeinfo, hSkew);
		vSyncStartSet(xrrmodeinfo, vSyncStart);
		vSyncEndSet(xrrmodeinfo, vSyncEnd);
		vTotalSet(xrrmodeinfo, vTotal);
		nameSet(xrrmodeinfo, name);
		nameLengthSet(xrrmodeinfo, nameLength);
		modeFlagsSet(xrrmodeinfo, modeFlags);

		return xrrmodeinfo;
	}

	public static void idSet(ByteBuffer xrrmodeinfo, long id) { PointerBuffer.put(xrrmodeinfo, xrrmodeinfo.position() + ID, id); }
	public static void widthSet(ByteBuffer xrrmodeinfo, int width) { xrrmodeinfo.putInt(xrrmodeinfo.position() + WIDTH, width); }
	public static void heightSet(ByteBuffer xrrmodeinfo, int height) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HEIGHT, height); }
	public static void dotClockSet(ByteBuffer xrrmodeinfo, long dotClock) { PointerBuffer.put(xrrmodeinfo, xrrmodeinfo.position() + DOTCLOCK, dotClock); }
	public static void hSyncStartSet(ByteBuffer xrrmodeinfo, int hSyncStart) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HSYNCSTART, hSyncStart); }
	public static void hSyncEndSet(ByteBuffer xrrmodeinfo, int hSyncEnd) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HSYNCEND, hSyncEnd); }
	public static void hTotalSet(ByteBuffer xrrmodeinfo, int hTotal) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HTOTAL, hTotal); }
	public static void hSkewSet(ByteBuffer xrrmodeinfo, int hSkew) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HSKEW, hSkew); }
	public static void vSyncStartSet(ByteBuffer xrrmodeinfo, int vSyncStart) { xrrmodeinfo.putInt(xrrmodeinfo.position() + VSYNCSTART, vSyncStart); }
	public static void vSyncEndSet(ByteBuffer xrrmodeinfo, int vSyncEnd) { xrrmodeinfo.putInt(xrrmodeinfo.position() + VSYNCEND, vSyncEnd); }
	public static void vTotalSet(ByteBuffer xrrmodeinfo, int vTotal) { xrrmodeinfo.putInt(xrrmodeinfo.position() + VTOTAL, vTotal); }
	public static void nameSet(ByteBuffer xrrmodeinfo, long name) { PointerBuffer.put(xrrmodeinfo, xrrmodeinfo.position() + NAME, name); }
	public static void nameSet(ByteBuffer xrrmodeinfo, ByteBuffer name) { nameSet(xrrmodeinfo, memAddress(name)); }
	public static void nameLengthSet(ByteBuffer xrrmodeinfo, int nameLength) { xrrmodeinfo.putInt(xrrmodeinfo.position() + NAMELENGTH, nameLength); }
	public static void modeFlagsSet(ByteBuffer xrrmodeinfo, long modeFlags) { PointerBuffer.put(xrrmodeinfo, xrrmodeinfo.position() + MODEFLAGS, modeFlags); }

	public static long idGet(ByteBuffer xrrmodeinfo) { return PointerBuffer.get(xrrmodeinfo, xrrmodeinfo.position() + ID); }
	public static int widthGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + WIDTH); }
	public static int heightGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HEIGHT); }
	public static long dotClockGet(ByteBuffer xrrmodeinfo) { return PointerBuffer.get(xrrmodeinfo, xrrmodeinfo.position() + DOTCLOCK); }
	public static int hSyncStartGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HSYNCSTART); }
	public static int hSyncEndGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HSYNCEND); }
	public static int hTotalGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HTOTAL); }
	public static int hSkewGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HSKEW); }
	public static int vSyncStartGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + VSYNCSTART); }
	public static int vSyncEndGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + VSYNCEND); }
	public static int vTotalGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + VTOTAL); }
	public static long nameGet(ByteBuffer xrrmodeinfo) { return PointerBuffer.get(xrrmodeinfo, xrrmodeinfo.position() + NAME); }
	public static ByteBuffer nameGet(ByteBuffer xrrmodeinfo, int size) { long address = nameGet(xrrmodeinfo); return address == 0 ? null : memByteBuffer(address, size); }
	public static int nameLengthGet(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + NAMELENGTH); }
	public static long modeFlagsGet(ByteBuffer xrrmodeinfo) { return PointerBuffer.get(xrrmodeinfo, xrrmodeinfo.position() + MODEFLAGS); }

}