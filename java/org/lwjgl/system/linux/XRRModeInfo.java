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
public final class XRRModeInfo implements Pointer {

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

	private final ByteBuffer struct;

	public XRRModeInfo() {
		this(malloc());
	}

	public XRRModeInfo(ByteBuffer struct) {
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

	public void setId(long id) { id(struct, id); }
	public void setWidth(int width) { width(struct, width); }
	public void setHeight(int height) { height(struct, height); }
	public void setDotClock(long dotClock) { dotClock(struct, dotClock); }
	public void setHSyncStart(int hSyncStart) { hSyncStart(struct, hSyncStart); }
	public void setHSyncEnd(int hSyncEnd) { hSyncEnd(struct, hSyncEnd); }
	public void setHTotal(int hTotal) { hTotal(struct, hTotal); }
	public void setHSkew(int hSkew) { hSkew(struct, hSkew); }
	public void setVSyncStart(int vSyncStart) { vSyncStart(struct, vSyncStart); }
	public void setVSyncEnd(int vSyncEnd) { vSyncEnd(struct, vSyncEnd); }
	public void setVTotal(int vTotal) { vTotal(struct, vTotal); }
	public void setName(long name) { name(struct, name); }
	public void setName(ByteBuffer name) { name(struct, name); }
	public void setNameLength(int nameLength) { nameLength(struct, nameLength); }
	public void setModeFlags(long modeFlags) { modeFlags(struct, modeFlags); }

	public long getId() { return id(struct); }
	public int getWidth() { return width(struct); }
	public int getHeight() { return height(struct); }
	public long getDotClock() { return dotClock(struct); }
	public int getHSyncStart() { return hSyncStart(struct); }
	public int getHSyncEnd() { return hSyncEnd(struct); }
	public int getHTotal() { return hTotal(struct); }
	public int getHSkew() { return hSkew(struct); }
	public int getVSyncStart() { return vSyncStart(struct); }
	public int getVSyncEnd() { return vSyncEnd(struct); }
	public int getVTotal() { return vTotal(struct); }
	public long getName() { return name(struct); }
	public ByteBuffer getName(int byteLen) { return name(struct, byteLen); }
	public int getNameLength() { return nameLength(struct); }
	public long getModeFlags() { return modeFlags(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		id(xrrmodeinfo, id);
		width(xrrmodeinfo, width);
		height(xrrmodeinfo, height);
		dotClock(xrrmodeinfo, dotClock);
		hSyncStart(xrrmodeinfo, hSyncStart);
		hSyncEnd(xrrmodeinfo, hSyncEnd);
		hTotal(xrrmodeinfo, hTotal);
		hSkew(xrrmodeinfo, hSkew);
		vSyncStart(xrrmodeinfo, vSyncStart);
		vSyncEnd(xrrmodeinfo, vSyncEnd);
		vTotal(xrrmodeinfo, vTotal);
		name(xrrmodeinfo, name);
		nameLength(xrrmodeinfo, nameLength);
		modeFlags(xrrmodeinfo, modeFlags);

		return xrrmodeinfo;
	}

	public static void id(ByteBuffer xrrmodeinfo, long id) { PointerBuffer.put(xrrmodeinfo, xrrmodeinfo.position() + ID, id); }
	public static void width(ByteBuffer xrrmodeinfo, int width) { xrrmodeinfo.putInt(xrrmodeinfo.position() + WIDTH, width); }
	public static void height(ByteBuffer xrrmodeinfo, int height) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HEIGHT, height); }
	public static void dotClock(ByteBuffer xrrmodeinfo, long dotClock) { PointerBuffer.put(xrrmodeinfo, xrrmodeinfo.position() + DOTCLOCK, dotClock); }
	public static void hSyncStart(ByteBuffer xrrmodeinfo, int hSyncStart) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HSYNCSTART, hSyncStart); }
	public static void hSyncEnd(ByteBuffer xrrmodeinfo, int hSyncEnd) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HSYNCEND, hSyncEnd); }
	public static void hTotal(ByteBuffer xrrmodeinfo, int hTotal) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HTOTAL, hTotal); }
	public static void hSkew(ByteBuffer xrrmodeinfo, int hSkew) { xrrmodeinfo.putInt(xrrmodeinfo.position() + HSKEW, hSkew); }
	public static void vSyncStart(ByteBuffer xrrmodeinfo, int vSyncStart) { xrrmodeinfo.putInt(xrrmodeinfo.position() + VSYNCSTART, vSyncStart); }
	public static void vSyncEnd(ByteBuffer xrrmodeinfo, int vSyncEnd) { xrrmodeinfo.putInt(xrrmodeinfo.position() + VSYNCEND, vSyncEnd); }
	public static void vTotal(ByteBuffer xrrmodeinfo, int vTotal) { xrrmodeinfo.putInt(xrrmodeinfo.position() + VTOTAL, vTotal); }
	public static void name(ByteBuffer xrrmodeinfo, long name) { PointerBuffer.put(xrrmodeinfo, xrrmodeinfo.position() + NAME, name); }
	public static void name(ByteBuffer xrrmodeinfo, ByteBuffer name) { name(xrrmodeinfo, memAddressSafe(name)); }
	public static void nameLength(ByteBuffer xrrmodeinfo, int nameLength) { xrrmodeinfo.putInt(xrrmodeinfo.position() + NAMELENGTH, nameLength); }
	public static void modeFlags(ByteBuffer xrrmodeinfo, long modeFlags) { PointerBuffer.put(xrrmodeinfo, xrrmodeinfo.position() + MODEFLAGS, modeFlags); }

	public static long id(ByteBuffer xrrmodeinfo) { return PointerBuffer.get(xrrmodeinfo, xrrmodeinfo.position() + ID); }
	public static int width(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + WIDTH); }
	public static int height(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HEIGHT); }
	public static long dotClock(ByteBuffer xrrmodeinfo) { return PointerBuffer.get(xrrmodeinfo, xrrmodeinfo.position() + DOTCLOCK); }
	public static int hSyncStart(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HSYNCSTART); }
	public static int hSyncEnd(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HSYNCEND); }
	public static int hTotal(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HTOTAL); }
	public static int hSkew(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + HSKEW); }
	public static int vSyncStart(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + VSYNCSTART); }
	public static int vSyncEnd(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + VSYNCEND); }
	public static int vTotal(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + VTOTAL); }
	public static long name(ByteBuffer xrrmodeinfo) { return PointerBuffer.get(xrrmodeinfo, xrrmodeinfo.position() + NAME); }
	public static ByteBuffer name(ByteBuffer xrrmodeinfo, int byteLen) { return memByteBuffer(name(xrrmodeinfo), byteLen); }
	public static int nameLength(ByteBuffer xrrmodeinfo) { return xrrmodeinfo.getInt(xrrmodeinfo.position() + NAMELENGTH); }
	public static long modeFlags(ByteBuffer xrrmodeinfo) { return PointerBuffer.get(xrrmodeinfo, xrrmodeinfo.position() + MODEFLAGS); }

}