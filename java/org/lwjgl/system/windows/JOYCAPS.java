/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains information about the joystick capabilities. */
public final class JOYCAPS implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		MID,
		PID,
		PNAME,
		XMIN,
		XMAX,
		YMIN,
		YMAX,
		ZMIN,
		ZMAX,
		NUMBUTTONS,
		PERIODMIN,
		PERIODMAX,
		RMIN,
		RMAX,
		UMIN,
		UMAX,
		VMIN,
		VMAX,
		CAPS,
		MAXAXES,
		NUMAXES,
		MAXBUTTONS,
		REGKEY,
		OEMVXD;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(24);

		SIZEOF = offsets(memAddress(offsets));

		MID = offsets.get(0);
		PID = offsets.get(1);
		PNAME = offsets.get(2);
		XMIN = offsets.get(3);
		XMAX = offsets.get(4);
		YMIN = offsets.get(5);
		YMAX = offsets.get(6);
		ZMIN = offsets.get(7);
		ZMAX = offsets.get(8);
		NUMBUTTONS = offsets.get(9);
		PERIODMIN = offsets.get(10);
		PERIODMAX = offsets.get(11);
		RMIN = offsets.get(12);
		RMAX = offsets.get(13);
		UMIN = offsets.get(14);
		UMAX = offsets.get(15);
		VMIN = offsets.get(16);
		VMAX = offsets.get(17);
		CAPS = offsets.get(18);
		MAXAXES = offsets.get(19);
		NUMAXES = offsets.get(20);
		MAXBUTTONS = offsets.get(21);
		REGKEY = offsets.get(22);
		OEMVXD = offsets.get(23);
	}

	private final ByteBuffer struct;

	public JOYCAPS() {
		this(malloc());
	}

	public JOYCAPS(ByteBuffer struct) {
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

	public void setMid(int mid) { mid(struct, mid); }
	public void setPid(int pid) { pid(struct, pid); }
	public void setPname(ByteBuffer pname) { pnameSet(struct, pname); }
	public void setPname(CharSequence pname) { pname(struct, pname); }
	public void setXmin(int xmin) { xmin(struct, xmin); }
	public void setXmax(int xmax) { xmax(struct, xmax); }
	public void setYmin(int ymin) { ymin(struct, ymin); }
	public void setYmax(int ymax) { ymax(struct, ymax); }
	public void setZmin(int zmin) { zmin(struct, zmin); }
	public void setZmax(int zmax) { zmax(struct, zmax); }
	public void setNumButtons(int numButtons) { numButtons(struct, numButtons); }
	public void setPeriodMin(int periodMin) { periodMin(struct, periodMin); }
	public void setPeriodMax(int periodMax) { periodMax(struct, periodMax); }
	public void setRmin(int rmin) { rmin(struct, rmin); }
	public void setRmax(int rmax) { rmax(struct, rmax); }
	public void setUmin(int umin) { umin(struct, umin); }
	public void setUmax(int umax) { umax(struct, umax); }
	public void setVmin(int vmin) { vmin(struct, vmin); }
	public void setVmax(int vmax) { vmax(struct, vmax); }
	public void setCaps(int caps) { caps(struct, caps); }
	public void setMaxAxes(int maxAxes) { maxAxes(struct, maxAxes); }
	public void setNumAxes(int numAxes) { numAxes(struct, numAxes); }
	public void setMaxButtons(int maxButtons) { maxButtons(struct, maxButtons); }
	public void setRegKey(ByteBuffer regKey) { regKeySet(struct, regKey); }
	public void setRegKey(CharSequence regKey) { regKey(struct, regKey); }
	public void setOEMVxD(ByteBuffer OEMVxD) { OEMVxDSet(struct, OEMVxD); }
	public void setOEMVxD(CharSequence OEMVxD) { OEMVxD(struct, OEMVxD); }

	public int getMid() { return mid(struct); }
	public int getPid() { return pid(struct); }
	public void getPname(ByteBuffer pname) { pnameGet(struct, pname); }
	public String getPnameString() { return pnameString(struct); }
	public String getPnameString(int byteLen) { return pnameString(struct, byteLen); }
	public int getXmin() { return xmin(struct); }
	public int getXmax() { return xmax(struct); }
	public int getYmin() { return ymin(struct); }
	public int getYmax() { return ymax(struct); }
	public int getZmin() { return zmin(struct); }
	public int getZmax() { return zmax(struct); }
	public int getNumButtons() { return numButtons(struct); }
	public int getPeriodMin() { return periodMin(struct); }
	public int getPeriodMax() { return periodMax(struct); }
	public int getRmin() { return rmin(struct); }
	public int getRmax() { return rmax(struct); }
	public int getUmin() { return umin(struct); }
	public int getUmax() { return umax(struct); }
	public int getVmin() { return vmin(struct); }
	public int getVmax() { return vmax(struct); }
	public int getCaps() { return caps(struct); }
	public int getMaxAxes() { return maxAxes(struct); }
	public int getNumAxes() { return numAxes(struct); }
	public int getMaxButtons() { return maxButtons(struct); }
	public void getRegKey(ByteBuffer regKey) { regKeyGet(struct, regKey); }
	public String getRegKeyString() { return regKeyString(struct); }
	public String getRegKeyString(int byteLen) { return regKeyString(struct, byteLen); }
	public void getOEMVxD(ByteBuffer OEMVxD) { OEMVxDGet(struct, OEMVxD); }
	public String getOEMVxDString() { return OEMVxDString(struct); }
	public String getOEMVxDString(int byteLen) { return OEMVxDString(struct, byteLen); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int mid,
		int pid,
		ByteBuffer pname,
		int xmin,
		int xmax,
		int ymin,
		int ymax,
		int zmin,
		int zmax,
		int numButtons,
		int periodMin,
		int periodMax,
		int rmin,
		int rmax,
		int umin,
		int umax,
		int vmin,
		int vmax,
		int caps,
		int maxAxes,
		int numAxes,
		int maxButtons,
		ByteBuffer regKey,
		ByteBuffer OEMVxD
	) {
		ByteBuffer joycaps = malloc();

		mid(joycaps, mid);
		pid(joycaps, pid);
		pnameSet(joycaps, pname);
		xmin(joycaps, xmin);
		xmax(joycaps, xmax);
		ymin(joycaps, ymin);
		ymax(joycaps, ymax);
		zmin(joycaps, zmin);
		zmax(joycaps, zmax);
		numButtons(joycaps, numButtons);
		periodMin(joycaps, periodMin);
		periodMax(joycaps, periodMax);
		rmin(joycaps, rmin);
		rmax(joycaps, rmax);
		umin(joycaps, umin);
		umax(joycaps, umax);
		vmin(joycaps, vmin);
		vmax(joycaps, vmax);
		caps(joycaps, caps);
		maxAxes(joycaps, maxAxes);
		numAxes(joycaps, numAxes);
		maxButtons(joycaps, maxButtons);
		regKeySet(joycaps, regKey);
		OEMVxDSet(joycaps, OEMVxD);

		return joycaps;
	}

	/** Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int mid,
		int pid,
		CharSequence pname,
		int xmin,
		int xmax,
		int ymin,
		int ymax,
		int zmin,
		int zmax,
		int numButtons,
		int periodMin,
		int periodMax,
		int rmin,
		int rmax,
		int umin,
		int umax,
		int vmin,
		int vmax,
		int caps,
		int maxAxes,
		int numAxes,
		int maxButtons,
		CharSequence regKey,
		CharSequence OEMVxD
	) {
		ByteBuffer joycaps = malloc();

		mid(joycaps, mid);
		pid(joycaps, pid);
		pname(joycaps, pname);
		xmin(joycaps, xmin);
		xmax(joycaps, xmax);
		ymin(joycaps, ymin);
		ymax(joycaps, ymax);
		zmin(joycaps, zmin);
		zmax(joycaps, zmax);
		numButtons(joycaps, numButtons);
		periodMin(joycaps, periodMin);
		periodMax(joycaps, periodMax);
		rmin(joycaps, rmin);
		rmax(joycaps, rmax);
		umin(joycaps, umin);
		umax(joycaps, umax);
		vmin(joycaps, vmin);
		vmax(joycaps, vmax);
		caps(joycaps, caps);
		maxAxes(joycaps, maxAxes);
		numAxes(joycaps, numAxes);
		maxButtons(joycaps, maxButtons);
		regKey(joycaps, regKey);
		OEMVxD(joycaps, OEMVxD);

		return joycaps;
	}

	public static void mid(ByteBuffer joycaps, int mid) { joycaps.putShort(joycaps.position() + MID, (short)mid); }
	public static void pid(ByteBuffer joycaps, int pid) { joycaps.putShort(joycaps.position() + PID, (short)pid); }
	public static void pnameSet(ByteBuffer joycaps, ByteBuffer pname) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(pname);
			checkBufferGT(pname, 32 * 2);
		}
		memCopy(memAddress(pname), memAddress(joycaps) + PNAME, pname.remaining());
	}
	public static void pname(ByteBuffer joycaps, CharSequence pname) { memEncodeUTF16(pname, true, joycaps, PNAME); }
	public static void xmin(ByteBuffer joycaps, int xmin) { joycaps.putInt(joycaps.position() + XMIN, xmin); }
	public static void xmax(ByteBuffer joycaps, int xmax) { joycaps.putInt(joycaps.position() + XMAX, xmax); }
	public static void ymin(ByteBuffer joycaps, int ymin) { joycaps.putInt(joycaps.position() + YMIN, ymin); }
	public static void ymax(ByteBuffer joycaps, int ymax) { joycaps.putInt(joycaps.position() + YMAX, ymax); }
	public static void zmin(ByteBuffer joycaps, int zmin) { joycaps.putInt(joycaps.position() + ZMIN, zmin); }
	public static void zmax(ByteBuffer joycaps, int zmax) { joycaps.putInt(joycaps.position() + ZMAX, zmax); }
	public static void numButtons(ByteBuffer joycaps, int numButtons) { joycaps.putInt(joycaps.position() + NUMBUTTONS, numButtons); }
	public static void periodMin(ByteBuffer joycaps, int periodMin) { joycaps.putInt(joycaps.position() + PERIODMIN, periodMin); }
	public static void periodMax(ByteBuffer joycaps, int periodMax) { joycaps.putInt(joycaps.position() + PERIODMAX, periodMax); }
	public static void rmin(ByteBuffer joycaps, int rmin) { joycaps.putInt(joycaps.position() + RMIN, rmin); }
	public static void rmax(ByteBuffer joycaps, int rmax) { joycaps.putInt(joycaps.position() + RMAX, rmax); }
	public static void umin(ByteBuffer joycaps, int umin) { joycaps.putInt(joycaps.position() + UMIN, umin); }
	public static void umax(ByteBuffer joycaps, int umax) { joycaps.putInt(joycaps.position() + UMAX, umax); }
	public static void vmin(ByteBuffer joycaps, int vmin) { joycaps.putInt(joycaps.position() + VMIN, vmin); }
	public static void vmax(ByteBuffer joycaps, int vmax) { joycaps.putInt(joycaps.position() + VMAX, vmax); }
	public static void caps(ByteBuffer joycaps, int caps) { joycaps.putInt(joycaps.position() + CAPS, caps); }
	public static void maxAxes(ByteBuffer joycaps, int maxAxes) { joycaps.putInt(joycaps.position() + MAXAXES, maxAxes); }
	public static void numAxes(ByteBuffer joycaps, int numAxes) { joycaps.putInt(joycaps.position() + NUMAXES, numAxes); }
	public static void maxButtons(ByteBuffer joycaps, int maxButtons) { joycaps.putInt(joycaps.position() + MAXBUTTONS, maxButtons); }
	public static void regKeySet(ByteBuffer joycaps, ByteBuffer regKey) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(regKey);
			checkBufferGT(regKey, 32 * 2);
		}
		memCopy(memAddress(regKey), memAddress(joycaps) + REGKEY, regKey.remaining());
	}
	public static void regKey(ByteBuffer joycaps, CharSequence regKey) { memEncodeUTF16(regKey, true, joycaps, REGKEY); }
	public static void OEMVxDSet(ByteBuffer joycaps, ByteBuffer OEMVxD) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT2(OEMVxD);
			checkBufferGT(OEMVxD, 260 * 2);
		}
		memCopy(memAddress(OEMVxD), memAddress(joycaps) + OEMVXD, OEMVxD.remaining());
	}
	public static void OEMVxD(ByteBuffer joycaps, CharSequence OEMVxD) { memEncodeUTF16(OEMVxD, true, joycaps, OEMVXD); }

	public static int mid(ByteBuffer joycaps) { return joycaps.getShort(joycaps.position() + MID); }
	public static int pid(ByteBuffer joycaps) { return joycaps.getShort(joycaps.position() + PID); }
	public static void pnameGet(ByteBuffer joycaps, ByteBuffer pname) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(pname, 32 * 2);
		memCopy(memAddress(joycaps) + PNAME, memAddress(pname), pname.remaining());
	}
	public static String pnameString(ByteBuffer joycaps) { return memDecodeUTF16(joycaps, memStrLen2(joycaps, PNAME), PNAME); }
	public static String pnameString(ByteBuffer joycaps, int byteLen) { return memDecodeUTF16(joycaps, byteLen, PNAME); }
	public static int xmin(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + XMIN); }
	public static int xmax(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + XMAX); }
	public static int ymin(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + YMIN); }
	public static int ymax(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + YMAX); }
	public static int zmin(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + ZMIN); }
	public static int zmax(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + ZMAX); }
	public static int numButtons(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + NUMBUTTONS); }
	public static int periodMin(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + PERIODMIN); }
	public static int periodMax(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + PERIODMAX); }
	public static int rmin(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + RMIN); }
	public static int rmax(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + RMAX); }
	public static int umin(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + UMIN); }
	public static int umax(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + UMAX); }
	public static int vmin(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + VMIN); }
	public static int vmax(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + VMAX); }
	public static int caps(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + CAPS); }
	public static int maxAxes(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + MAXAXES); }
	public static int numAxes(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + NUMAXES); }
	public static int maxButtons(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + MAXBUTTONS); }
	public static void regKeyGet(ByteBuffer joycaps, ByteBuffer regKey) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(regKey, 32 * 2);
		memCopy(memAddress(joycaps) + REGKEY, memAddress(regKey), regKey.remaining());
	}
	public static String regKeyString(ByteBuffer joycaps) { return memDecodeUTF16(joycaps, memStrLen2(joycaps, REGKEY), REGKEY); }
	public static String regKeyString(ByteBuffer joycaps, int byteLen) { return memDecodeUTF16(joycaps, byteLen, REGKEY); }
	public static void OEMVxDGet(ByteBuffer joycaps, ByteBuffer OEMVxD) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(OEMVxD, 260 * 2);
		memCopy(memAddress(joycaps) + OEMVXD, memAddress(OEMVxD), OEMVxD.remaining());
	}
	public static String OEMVxDString(ByteBuffer joycaps) { return memDecodeUTF16(joycaps, memStrLen2(joycaps, OEMVXD), OEMVXD); }
	public static String OEMVxDString(ByteBuffer joycaps, int byteLen) { return memDecodeUTF16(joycaps, byteLen, OEMVXD); }

}