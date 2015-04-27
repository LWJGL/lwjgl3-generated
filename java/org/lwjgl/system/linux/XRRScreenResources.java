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
public final class XRRScreenResources implements Pointer {

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

	private final ByteBuffer struct;

	public XRRScreenResources() {
		this(malloc());
	}

	public XRRScreenResources(ByteBuffer struct) {
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

	public void setTimestamp(long timestamp) { timestamp(struct, timestamp); }
	public void setConfigTimestamp(long configTimestamp) { configTimestamp(struct, configTimestamp); }
	public void setNcrtc(int ncrtc) { ncrtc(struct, ncrtc); }
	public void setCrtcs(long crtcs) { crtcs(struct, crtcs); }
	public void setCrtcs(ByteBuffer crtcs) { crtcs(struct, crtcs); }
	public void setNoutput(int noutput) { noutput(struct, noutput); }
	public void setOutputs(long outputs) { outputs(struct, outputs); }
	public void setOutputs(ByteBuffer outputs) { outputs(struct, outputs); }
	public void setNmode(int nmode) { nmode(struct, nmode); }
	public void setModes(long modes) { modes(struct, modes); }
	public void setModes(ByteBuffer modes) { modes(struct, modes); }

	public long getTimestamp() { return timestamp(struct); }
	public long getConfigTimestamp() { return configTimestamp(struct); }
	public int getNcrtc() { return ncrtc(struct); }
	public long getCrtcs() { return crtcs(struct); }
	public ByteBuffer getCrtcs(int byteLen) { return crtcs(struct, byteLen); }
	public int getNoutput() { return noutput(struct); }
	public long getOutputs() { return outputs(struct); }
	public ByteBuffer getOutputs(int byteLen) { return outputs(struct, byteLen); }
	public int getNmode() { return nmode(struct); }
	public long getModes() { return modes(struct); }
	public ByteBuffer getModesBuffer() { return modesBuffer(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		timestamp(xrrscreenresources, timestamp);
		configTimestamp(xrrscreenresources, configTimestamp);
		ncrtc(xrrscreenresources, ncrtc);
		crtcs(xrrscreenresources, crtcs);
		noutput(xrrscreenresources, noutput);
		outputs(xrrscreenresources, outputs);
		nmode(xrrscreenresources, nmode);
		modes(xrrscreenresources, modes);

		return xrrscreenresources;
	}

	public static void timestamp(ByteBuffer xrrscreenresources, long timestamp) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + TIMESTAMP, timestamp); }
	public static void configTimestamp(ByteBuffer xrrscreenresources, long configTimestamp) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + CONFIGTIMESTAMP, configTimestamp); }
	public static void ncrtc(ByteBuffer xrrscreenresources, int ncrtc) { xrrscreenresources.putInt(xrrscreenresources.position() + NCRTC, ncrtc); }
	public static void crtcs(ByteBuffer xrrscreenresources, long crtcs) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + CRTCS, crtcs); }
	public static void crtcs(ByteBuffer xrrscreenresources, ByteBuffer crtcs) { crtcs(xrrscreenresources, memAddressSafe(crtcs)); }
	public static void noutput(ByteBuffer xrrscreenresources, int noutput) { xrrscreenresources.putInt(xrrscreenresources.position() + NOUTPUT, noutput); }
	public static void outputs(ByteBuffer xrrscreenresources, long outputs) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + OUTPUTS, outputs); }
	public static void outputs(ByteBuffer xrrscreenresources, ByteBuffer outputs) { outputs(xrrscreenresources, memAddressSafe(outputs)); }
	public static void nmode(ByteBuffer xrrscreenresources, int nmode) { xrrscreenresources.putInt(xrrscreenresources.position() + NMODE, nmode); }
	public static void modes(ByteBuffer xrrscreenresources, long modes) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + MODES, modes); }
	public static void modes(ByteBuffer xrrscreenresources, ByteBuffer modes) { modes(xrrscreenresources, memAddressSafe(modes)); }

	public static long timestamp(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + TIMESTAMP); }
	public static long configTimestamp(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + CONFIGTIMESTAMP); }
	public static int ncrtc(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NCRTC); }
	public static long crtcs(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + CRTCS); }
	public static ByteBuffer crtcs(ByteBuffer xrrscreenresources, int byteLen) { return memByteBuffer(crtcs(xrrscreenresources), byteLen); }
	public static int noutput(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NOUTPUT); }
	public static long outputs(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + OUTPUTS); }
	public static ByteBuffer outputs(ByteBuffer xrrscreenresources, int byteLen) { return memByteBuffer(outputs(xrrscreenresources), byteLen); }
	public static int nmode(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NMODE); }
	public static long modes(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + MODES); }
	public static ByteBuffer modesBuffer(ByteBuffer xrrscreenresources) { return memByteBuffer(modes(xrrscreenresources), XRRModeInfo.SIZEOF); }

}