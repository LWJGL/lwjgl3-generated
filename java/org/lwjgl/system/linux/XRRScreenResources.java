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
		MODES;

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
		long modes
	) {
		ByteBuffer xrrscreenresources = malloc();

		timestampSet(xrrscreenresources, timestamp);
		configTimestampSet(xrrscreenresources, configTimestamp);
		ncrtcSet(xrrscreenresources, ncrtc);
		crtcsSet(xrrscreenresources, crtcs);
		noutputSet(xrrscreenresources, noutput);
		outputsSet(xrrscreenresources, outputs);
		nmodeSet(xrrscreenresources, nmode);
		modesSet(xrrscreenresources, modes);

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
		ByteBuffer modes
	) {
		ByteBuffer xrrscreenresources = malloc();

		timestampSet(xrrscreenresources, timestamp);
		configTimestampSet(xrrscreenresources, configTimestamp);
		ncrtcSet(xrrscreenresources, ncrtc);
		crtcsSet(xrrscreenresources, crtcs);
		noutputSet(xrrscreenresources, noutput);
		outputsSet(xrrscreenresources, outputs);
		nmodeSet(xrrscreenresources, nmode);
		modesSet(xrrscreenresources, modes);

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
	public static void modesSet(ByteBuffer xrrscreenresources, long modes) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + MODES, modes); }
	public static void modesSet(ByteBuffer xrrscreenresources, ByteBuffer modes) { modesSet(xrrscreenresources, memAddress(modes)); }

	public static long timestampGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + TIMESTAMP); }
	public static long configTimestampGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + CONFIGTIMESTAMP); }
	public static int ncrtcGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NCRTC); }
	public static long crtcsGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + CRTCS); }
	public static ByteBuffer crtcsGet(ByteBuffer xrrscreenresources, int size) { long address = crtcsGet(xrrscreenresources); return address == 0 ? null : memByteBuffer(address, size); }
	public static int noutputGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NOUTPUT); }
	public static long outputsGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + OUTPUTS); }
	public static ByteBuffer outputsGet(ByteBuffer xrrscreenresources, int size) { long address = outputsGet(xrrscreenresources); return address == 0 ? null : memByteBuffer(address, size); }
	public static int nmodeGet(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NMODE); }
	public static long modesGet(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + MODES); }
	public static ByteBuffer modesGetb(ByteBuffer xrrscreenresources) { return memByteBuffer(modesGet(xrrscreenresources), XRRModeInfo.SIZEOF); }

}