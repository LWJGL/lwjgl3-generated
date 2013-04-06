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
public final class JOYCAPS {

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

	private JOYCAPS() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int mid,
		int pid,
		long pname,
		int pnameBytes,
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
		long regKey,
		int regKeyBytes,
		long OEMVxD,
		int OEMVxDBytes
	) {
		ByteBuffer joycaps = malloc();

		midSet(joycaps, mid);
		pidSet(joycaps, pid);
		pnameSet(joycaps, pname, pnameBytes);
		xminSet(joycaps, xmin);
		xmaxSet(joycaps, xmax);
		yminSet(joycaps, ymin);
		ymaxSet(joycaps, ymax);
		zminSet(joycaps, zmin);
		zmaxSet(joycaps, zmax);
		numButtonsSet(joycaps, numButtons);
		periodMinSet(joycaps, periodMin);
		periodMaxSet(joycaps, periodMax);
		rminSet(joycaps, rmin);
		rmaxSet(joycaps, rmax);
		uminSet(joycaps, umin);
		umaxSet(joycaps, umax);
		vminSet(joycaps, vmin);
		vmaxSet(joycaps, vmax);
		capsSet(joycaps, caps);
		maxAxesSet(joycaps, maxAxes);
		numAxesSet(joycaps, numAxes);
		maxButtonsSet(joycaps, maxButtons);
		regKeySet(joycaps, regKey, regKeyBytes);
		OEMVxDSet(joycaps, OEMVxD, OEMVxDBytes);

		return joycaps;
	}

	/** Alternative virtual constructor. */
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

		midSet(joycaps, mid);
		pidSet(joycaps, pid);
		pnameSet(joycaps, pname);
		xminSet(joycaps, xmin);
		xmaxSet(joycaps, xmax);
		yminSet(joycaps, ymin);
		ymaxSet(joycaps, ymax);
		zminSet(joycaps, zmin);
		zmaxSet(joycaps, zmax);
		numButtonsSet(joycaps, numButtons);
		periodMinSet(joycaps, periodMin);
		periodMaxSet(joycaps, periodMax);
		rminSet(joycaps, rmin);
		rmaxSet(joycaps, rmax);
		uminSet(joycaps, umin);
		umaxSet(joycaps, umax);
		vminSet(joycaps, vmin);
		vmaxSet(joycaps, vmax);
		capsSet(joycaps, caps);
		maxAxesSet(joycaps, maxAxes);
		numAxesSet(joycaps, numAxes);
		maxButtonsSet(joycaps, maxButtons);
		regKeySet(joycaps, regKey);
		OEMVxDSet(joycaps, OEMVxD);

		return joycaps;
	}

	/** Alternative virtual constructor. */
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

		midSet(joycaps, mid);
		pidSet(joycaps, pid);
		pnameSet(joycaps, pname);
		xminSet(joycaps, xmin);
		xmaxSet(joycaps, xmax);
		yminSet(joycaps, ymin);
		ymaxSet(joycaps, ymax);
		zminSet(joycaps, zmin);
		zmaxSet(joycaps, zmax);
		numButtonsSet(joycaps, numButtons);
		periodMinSet(joycaps, periodMin);
		periodMaxSet(joycaps, periodMax);
		rminSet(joycaps, rmin);
		rmaxSet(joycaps, rmax);
		uminSet(joycaps, umin);
		umaxSet(joycaps, umax);
		vminSet(joycaps, vmin);
		vmaxSet(joycaps, vmax);
		capsSet(joycaps, caps);
		maxAxesSet(joycaps, maxAxes);
		numAxesSet(joycaps, numAxes);
		maxButtonsSet(joycaps, maxButtons);
		regKeySet(joycaps, regKey);
		OEMVxDSet(joycaps, OEMVxD);

		return joycaps;
	}

	public static void midSet(ByteBuffer joycaps, int mid) { joycaps.putShort(joycaps.position() + MID, (short)mid); }
	public static void pidSet(ByteBuffer joycaps, int pid) { joycaps.putShort(joycaps.position() + PID, (short)pid); }
	public static void pnameSet(ByteBuffer joycaps, long pname, int bytes) { memCopy(pname, memAddress(joycaps) + PNAME, bytes); }
	public static void pnameSet(ByteBuffer joycaps, ByteBuffer pname) {
		checkNT2(pname);
		checkBufferGT(pname, 32 * 2);
		pnameSet(joycaps, memAddress(pname), pname.remaining());
	}
	public static void pnameSet(ByteBuffer joycaps, CharSequence pname) { ByteBuffer buffer = memEncodeUTF16(pname, true); pnameSet(joycaps, memAddress(buffer), buffer.capacity()); }
	public static void xminSet(ByteBuffer joycaps, int xmin) { joycaps.putInt(joycaps.position() + XMIN, xmin); }
	public static void xmaxSet(ByteBuffer joycaps, int xmax) { joycaps.putInt(joycaps.position() + XMAX, xmax); }
	public static void yminSet(ByteBuffer joycaps, int ymin) { joycaps.putInt(joycaps.position() + YMIN, ymin); }
	public static void ymaxSet(ByteBuffer joycaps, int ymax) { joycaps.putInt(joycaps.position() + YMAX, ymax); }
	public static void zminSet(ByteBuffer joycaps, int zmin) { joycaps.putInt(joycaps.position() + ZMIN, zmin); }
	public static void zmaxSet(ByteBuffer joycaps, int zmax) { joycaps.putInt(joycaps.position() + ZMAX, zmax); }
	public static void numButtonsSet(ByteBuffer joycaps, int numButtons) { joycaps.putInt(joycaps.position() + NUMBUTTONS, numButtons); }
	public static void periodMinSet(ByteBuffer joycaps, int periodMin) { joycaps.putInt(joycaps.position() + PERIODMIN, periodMin); }
	public static void periodMaxSet(ByteBuffer joycaps, int periodMax) { joycaps.putInt(joycaps.position() + PERIODMAX, periodMax); }
	public static void rminSet(ByteBuffer joycaps, int rmin) { joycaps.putInt(joycaps.position() + RMIN, rmin); }
	public static void rmaxSet(ByteBuffer joycaps, int rmax) { joycaps.putInt(joycaps.position() + RMAX, rmax); }
	public static void uminSet(ByteBuffer joycaps, int umin) { joycaps.putInt(joycaps.position() + UMIN, umin); }
	public static void umaxSet(ByteBuffer joycaps, int umax) { joycaps.putInt(joycaps.position() + UMAX, umax); }
	public static void vminSet(ByteBuffer joycaps, int vmin) { joycaps.putInt(joycaps.position() + VMIN, vmin); }
	public static void vmaxSet(ByteBuffer joycaps, int vmax) { joycaps.putInt(joycaps.position() + VMAX, vmax); }
	public static void capsSet(ByteBuffer joycaps, int caps) { joycaps.putInt(joycaps.position() + CAPS, caps); }
	public static void maxAxesSet(ByteBuffer joycaps, int maxAxes) { joycaps.putInt(joycaps.position() + MAXAXES, maxAxes); }
	public static void numAxesSet(ByteBuffer joycaps, int numAxes) { joycaps.putInt(joycaps.position() + NUMAXES, numAxes); }
	public static void maxButtonsSet(ByteBuffer joycaps, int maxButtons) { joycaps.putInt(joycaps.position() + MAXBUTTONS, maxButtons); }
	public static void regKeySet(ByteBuffer joycaps, long regKey, int bytes) { memCopy(regKey, memAddress(joycaps) + REGKEY, bytes); }
	public static void regKeySet(ByteBuffer joycaps, ByteBuffer regKey) {
		checkNT2(regKey);
		checkBufferGT(regKey, 32 * 2);
		regKeySet(joycaps, memAddress(regKey), regKey.remaining());
	}
	public static void regKeySet(ByteBuffer joycaps, CharSequence regKey) { ByteBuffer buffer = memEncodeUTF16(regKey, true); regKeySet(joycaps, memAddress(buffer), buffer.capacity()); }
	public static void OEMVxDSet(ByteBuffer joycaps, long OEMVxD, int bytes) { memCopy(OEMVxD, memAddress(joycaps) + OEMVXD, bytes); }
	public static void OEMVxDSet(ByteBuffer joycaps, ByteBuffer OEMVxD) {
		checkNT2(OEMVxD);
		checkBufferGT(OEMVxD, 260 * 2);
		OEMVxDSet(joycaps, memAddress(OEMVxD), OEMVxD.remaining());
	}
	public static void OEMVxDSet(ByteBuffer joycaps, CharSequence OEMVxD) { ByteBuffer buffer = memEncodeUTF16(OEMVxD, true); OEMVxDSet(joycaps, memAddress(buffer), buffer.capacity()); }

	public static int midGet(ByteBuffer joycaps) { return joycaps.getShort(joycaps.position() + MID); }
	public static int pidGet(ByteBuffer joycaps) { return joycaps.getShort(joycaps.position() + PID); }
	public static void pnameGet(ByteBuffer joycaps, long pname, int bytes) {
		memCopy(memAddress(joycaps) + PNAME, pname, bytes);
	}
	public static void pnameGetb(ByteBuffer joycaps, ByteBuffer pname) {
		checkBufferGT(pname, 32 * 2);
		pnameGet(joycaps, memAddress(pname), pname.remaining());
	}
	public static String pnameGets(ByteBuffer joycaps) { return memDecodeUTF16(joycaps, memStrLen2(joycaps, PNAME), PNAME); }
	public static String pnameGets(ByteBuffer joycaps, int size) { return memDecodeUTF16(joycaps, size, PNAME); }
	public static int xminGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + XMIN); }
	public static int xmaxGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + XMAX); }
	public static int yminGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + YMIN); }
	public static int ymaxGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + YMAX); }
	public static int zminGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + ZMIN); }
	public static int zmaxGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + ZMAX); }
	public static int numButtonsGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + NUMBUTTONS); }
	public static int periodMinGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + PERIODMIN); }
	public static int periodMaxGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + PERIODMAX); }
	public static int rminGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + RMIN); }
	public static int rmaxGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + RMAX); }
	public static int uminGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + UMIN); }
	public static int umaxGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + UMAX); }
	public static int vminGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + VMIN); }
	public static int vmaxGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + VMAX); }
	public static int capsGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + CAPS); }
	public static int maxAxesGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + MAXAXES); }
	public static int numAxesGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + NUMAXES); }
	public static int maxButtonsGet(ByteBuffer joycaps) { return joycaps.getInt(joycaps.position() + MAXBUTTONS); }
	public static void regKeyGet(ByteBuffer joycaps, long regKey, int bytes) {
		memCopy(memAddress(joycaps) + REGKEY, regKey, bytes);
	}
	public static void regKeyGetb(ByteBuffer joycaps, ByteBuffer regKey) {
		checkBufferGT(regKey, 32 * 2);
		regKeyGet(joycaps, memAddress(regKey), regKey.remaining());
	}
	public static String regKeyGets(ByteBuffer joycaps) { return memDecodeUTF16(joycaps, memStrLen2(joycaps, REGKEY), REGKEY); }
	public static String regKeyGets(ByteBuffer joycaps, int size) { return memDecodeUTF16(joycaps, size, REGKEY); }
	public static void OEMVxDGet(ByteBuffer joycaps, long OEMVxD, int bytes) {
		memCopy(memAddress(joycaps) + OEMVXD, OEMVxD, bytes);
	}
	public static void OEMVxDGetb(ByteBuffer joycaps, ByteBuffer OEMVxD) {
		checkBufferGT(OEMVxD, 260 * 2);
		OEMVxDGet(joycaps, memAddress(OEMVxD), OEMVxD.remaining());
	}
	public static String OEMVxDGets(ByteBuffer joycaps) { return memDecodeUTF16(joycaps, memStrLen2(joycaps, OEMVXD), OEMVXD); }
	public static String OEMVxDGets(ByteBuffer joycaps, int size) { return memDecodeUTF16(joycaps, size, OEMVXD); }

}