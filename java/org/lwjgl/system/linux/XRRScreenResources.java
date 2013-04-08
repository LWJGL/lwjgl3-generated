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

/** Xrandr screen resources struct. */
public final class XRRScreenResources {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TIMESTAMP,
		CONFIGTIMESTAMP,
		NCRTC,
		CRTCS,
		NOUTPUT,
		OUTPUTS,
		NMODE,
		MODES,
			MODES_ID,
			MODES_WIDTH,
			MODES_HEIGHT,
			MODES_DOTCLOCK,
			MODES_HSYNCSTART,
			MODES_HSYNCEND,
			MODES_HTOTAL,
			MODES_HSKEW,
			MODES_VSYNCSTART,
			MODES_VSYNCEND,
			MODES_VTOTAL,
			MODES_NAME,
			MODES_NAMELENGTH,
			MODES_MODEFLAGS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(8);

		SIZEOF = offsets(memAddress(offsets));

		TIMESTAMP = offsets.get(0);
		CONFIGTIMESTAMP = offsets.get(1);
		NCRTC = offsets.get(2);
		CRTCS = offsets.get(3);
		NOUTPUT = offsets.get(4);
		OUTPUTS = offsets.get(5);
		NMODE = offsets.get(6);
		MODES = offsets.get(7);
			MODES_ID = MODES + XRRModeInfo.ID;
			MODES_WIDTH = MODES + XRRModeInfo.WIDTH;
			MODES_HEIGHT = MODES + XRRModeInfo.HEIGHT;
			MODES_DOTCLOCK = MODES + XRRModeInfo.DOTCLOCK;
			MODES_HSYNCSTART = MODES + XRRModeInfo.HSYNCSTART;
			MODES_HSYNCEND = MODES + XRRModeInfo.HSYNCEND;
			MODES_HTOTAL = MODES + XRRModeInfo.HTOTAL;
			MODES_HSKEW = MODES + XRRModeInfo.HSKEW;
			MODES_VSYNCSTART = MODES + XRRModeInfo.VSYNCSTART;
			MODES_VSYNCEND = MODES + XRRModeInfo.VSYNCEND;
			MODES_VTOTAL = MODES + XRRModeInfo.VTOTAL;
			MODES_NAME = MODES + XRRModeInfo.NAME;
			MODES_NAMELENGTH = MODES + XRRModeInfo.NAMELENGTH;
			MODES_MODEFLAGS = MODES + XRRModeInfo.MODEFLAGS;
	}

	private XRRScreenResources() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long timestamp,
		long configTimestamp,
		int ncrtc,
		long crtcs,
		int noutput,
		long outputs,
		int nmode,
		long modes_id,
		int modes_width,
		int modes_height,
		long modes_dotClock,
		int modes_hSyncStart,
		int modes_hSyncEnd,
		int modes_hTotal,
		int modes_hSkew,
		int modes_vSyncStart,
		int modes_vSyncEnd,
		int modes_vTotal,
		long modes_name,
		int modes_nameLength,
		long modes_modeFlags
	) {
		ByteBuffer xrrscreenresources = malloc();

		timestampSet(xrrscreenresources, timestamp);
		configTimestampSet(xrrscreenresources, configTimestamp);
		ncrtcSet(xrrscreenresources, ncrtc);
		crtcsSet(xrrscreenresources, crtcs);
		noutputSet(xrrscreenresources, noutput);
		outputsSet(xrrscreenresources, outputs);
		nmodeSet(xrrscreenresources, nmode);
		modesIdSet(xrrscreenresources, modes_id);
		modesWidthSet(xrrscreenresources, modes_width);
		modesHeightSet(xrrscreenresources, modes_height);
		modesDotClockSet(xrrscreenresources, modes_dotClock);
		modesHSyncStartSet(xrrscreenresources, modes_hSyncStart);
		modesHSyncEndSet(xrrscreenresources, modes_hSyncEnd);
		modesHTotalSet(xrrscreenresources, modes_hTotal);
		modesHSkewSet(xrrscreenresources, modes_hSkew);
		modesVSyncStartSet(xrrscreenresources, modes_vSyncStart);
		modesVSyncEndSet(xrrscreenresources, modes_vSyncEnd);
		modesVTotalSet(xrrscreenresources, modes_vTotal);
		modesNameSet(xrrscreenresources, modes_name);
		modesNameLengthSet(xrrscreenresources, modes_nameLength);
		modesModeFlagsSet(xrrscreenresources, modes_modeFlags);

		return xrrscreenresources;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		long timestamp,
		long configTimestamp,
		int ncrtc,
		ByteBuffer crtcs,
		int noutput,
		ByteBuffer outputs,
		int nmode,
		long modes_id,
		int modes_width,
		int modes_height,
		long modes_dotClock,
		int modes_hSyncStart,
		int modes_hSyncEnd,
		int modes_hTotal,
		int modes_hSkew,
		int modes_vSyncStart,
		int modes_vSyncEnd,
		int modes_vTotal,
		ByteBuffer modes_name,
		int modes_nameLength,
		long modes_modeFlags
	) {
		ByteBuffer xrrscreenresources = malloc();

		timestampSet(xrrscreenresources, timestamp);
		configTimestampSet(xrrscreenresources, configTimestamp);
		ncrtcSet(xrrscreenresources, ncrtc);
		crtcsSet(xrrscreenresources, crtcs);
		noutputSet(xrrscreenresources, noutput);
		outputsSet(xrrscreenresources, outputs);
		nmodeSet(xrrscreenresources, nmode);
		modesIdSet(xrrscreenresources, modes_id);
		modesWidthSet(xrrscreenresources, modes_width);
		modesHeightSet(xrrscreenresources, modes_height);
		modesDotClockSet(xrrscreenresources, modes_dotClock);
		modesHSyncStartSet(xrrscreenresources, modes_hSyncStart);
		modesHSyncEndSet(xrrscreenresources, modes_hSyncEnd);
		modesHTotalSet(xrrscreenresources, modes_hTotal);
		modesHSkewSet(xrrscreenresources, modes_hSkew);
		modesVSyncStartSet(xrrscreenresources, modes_vSyncStart);
		modesVSyncEndSet(xrrscreenresources, modes_vSyncEnd);
		modesVTotalSet(xrrscreenresources, modes_vTotal);
		modesNameSet(xrrscreenresources, modes_name);
		modesNameLengthSet(xrrscreenresources, modes_nameLength);
		modesModeFlagsSet(xrrscreenresources, modes_modeFlags);

		return xrrscreenresources;
	}

	public static void timestampSet(ByteBuffer xrrscreenresources, long timestamp) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + TIMESTAMP, timestamp); }
	public static void configTimestampSet(ByteBuffer xrrscreenresources, long configTimestamp) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + CONFIGTIMESTAMP, configTimestamp); }
	public static void ncrtcSet(ByteBuffer xrrscreenresources, int ncrtc) { xrrscreenresources.putInt(xrrscreenresources.position() + NCRTC, ncrtc); }
	public static void crtcsSet(ByteBuffer xrrscreenresources, long crtcs) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + CRTCS, crtcs); }
	public static void crtcsSet(ByteBuffer xrrscreenresources, ByteBuffer crtcs) { crtcsSet(xrrscreenresources, memAddress(crtcs)); }
	public static void noutputSet(ByteBuffer xrrscreenresources, int noutput) { xrrscreenresources.putInt(xrrscreenresources.position() + NOUTPUT, noutput); }
	public static void outputsSet(ByteBuffer xrrscreenresources, long outputs) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + OUTPUTS, outputs); }
	public static void outputsSet(ByteBuffer xrrscreenresources, ByteBuffer outputs) { outputsSet(xrrscreenresources, memAddress(outputs)); }
	public static void nmodeSet(ByteBuffer xrrscreenresources, int nmode) { xrrscreenresources.putInt(xrrscreenresources.position() + NMODE, nmode); }
	public static void modesIdSet(ByteBuffer xrrscreenresources, long id) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + MODES_ID, id); }
	public static void modesWidthSet(ByteBuffer xrrscreenresources, int width) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_WIDTH, width); }
	public static void modesHeightSet(ByteBuffer xrrscreenresources, int height) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_HEIGHT, height); }
	public static void modesDotClockSet(ByteBuffer xrrscreenresources, long dotClock) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + MODES_DOTCLOCK, dotClock); }
	public static void modesHSyncStartSet(ByteBuffer xrrscreenresources, int hSyncStart) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_HSYNCSTART, hSyncStart); }
	public static void modesHSyncEndSet(ByteBuffer xrrscreenresources, int hSyncEnd) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_HSYNCEND, hSyncEnd); }
	public static void modesHTotalSet(ByteBuffer xrrscreenresources, int hTotal) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_HTOTAL, hTotal); }
	public static void modesHSkewSet(ByteBuffer xrrscreenresources, int hSkew) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_HSKEW, hSkew); }
	public static void modesVSyncStartSet(ByteBuffer xrrscreenresources, int vSyncStart) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_VSYNCSTART, vSyncStart); }
	public static void modesVSyncEndSet(ByteBuffer xrrscreenresources, int vSyncEnd) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_VSYNCEND, vSyncEnd); }
	public static void modesVTotalSet(ByteBuffer xrrscreenresources, int vTotal) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_VTOTAL, vTotal); }
	public static void modesNameSet(ByteBuffer xrrscreenresources, long name) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + MODES_NAME, name); }
	public static void modesNameSet(ByteBuffer xrrscreenresources, ByteBuffer name) { modesNameSet(xrrscreenresources, memAddress(name)); }
	public static void modesNameLengthSet(ByteBuffer xrrscreenresources, int nameLength) { xrrscreenresources.putInt(xrrscreenresources.position() + MODES_NAMELENGTH, nameLength); }
	public static void modesModeFlagsSet(ByteBuffer xrrscreenresources, long modeFlags) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + MODES_MODEFLAGS, modeFlags); }

	public static long timestampGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + TIMESTAMP); }
	public static long configTimestampGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + CONFIGTIMESTAMP); }
	public static int ncrtcGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NCRTC); }
	public static long crtcsGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + CRTCS); }
	public static ByteBuffer crtcsGet(ByteBuffer xrrscreenresources, int size) { long address = crtcsGet(xrrscreenresources); return address == 0 ? null : memByteBuffer(address, size); }
	public static int noutputGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NOUTPUT); }
	public static long outputsGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + OUTPUTS); }
	public static ByteBuffer outputsGet(ByteBuffer xrrscreenresources, int size) { long address = outputsGet(xrrscreenresources); return address == 0 ? null : memByteBuffer(address, size); }
	public static int nmodeGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NMODE); }
	public static long modesIdGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + MODES_ID); }
	public static int modesWidthGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_WIDTH); }
	public static int modesHeightGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_HEIGHT); }
	public static long modesDotClockGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + MODES_DOTCLOCK); }
	public static int modesHSyncStartGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_HSYNCSTART); }
	public static int modesHSyncEndGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_HSYNCEND); }
	public static int modesHTotalGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_HTOTAL); }
	public static int modesHSkewGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_HSKEW); }
	public static int modesVSyncStartGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_VSYNCSTART); }
	public static int modesVSyncEndGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_VSYNCEND); }
	public static int modesVTotalGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_VTOTAL); }
	public static long modesNameGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + MODES_NAME); }
	public static ByteBuffer modesNameGet(ByteBuffer xrrscreenresources, int size) { long address = modesNameGet(xrrscreenresources); return address == 0 ? null : memByteBuffer(address, size); }
	public static int modesNameLengthGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + MODES_NAMELENGTH); }
	public static long modesModeFlagsGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + MODES_MODEFLAGS); }

}