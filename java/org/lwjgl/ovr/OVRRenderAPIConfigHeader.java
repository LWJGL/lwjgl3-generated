/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Platform-independent part of rendering API-configuration data. It is a part of ovrRenderAPIConfig, passed to ovrHmd_Configure. */
public final class OVRRenderAPIConfigHeader implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		API,
		BACKBUFFERSIZE,
		MULTISAMPLE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		API = offsets.get(0);
		BACKBUFFERSIZE = offsets.get(1);
		MULTISAMPLE = offsets.get(2);
	}

	private final ByteBuffer struct;

	public OVRRenderAPIConfigHeader() {
		this(malloc());
	}

	public OVRRenderAPIConfigHeader(ByteBuffer struct) {
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

	public void setAPI(int api) { API(struct, api); }
	public void setBackBufferSize(ByteBuffer BackBufferSize) { BackBufferSizeSet(struct, BackBufferSize); }
	public void setBackBufferSizeW(int w) { BackBufferSizeW(struct, w); }
	public void setBackBufferSizeH(int h) { BackBufferSizeH(struct, h); }
	public void setMultisample(int Multisample) { Multisample(struct, Multisample); }

	public int getAPI() { return API(struct); }
	public void getBackBufferSize(ByteBuffer BackBufferSize) { BackBufferSizeGet(struct, BackBufferSize); }
	public int getBackBufferSizeW() { return BackBufferSizeW(struct); }
	public int getBackBufferSizeH() { return BackBufferSizeH(struct); }
	public int getMultisample() { return Multisample(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int API,
		ByteBuffer BackBufferSize,
		int Multisample
	) {
		ByteBuffer ovrrenderapiconfigheader = malloc();

		API(ovrrenderapiconfigheader, API);
		BackBufferSizeSet(ovrrenderapiconfigheader, BackBufferSize);
		Multisample(ovrrenderapiconfigheader, Multisample);

		return ovrrenderapiconfigheader;
	}

	public static void API(ByteBuffer ovrrenderapiconfigheader, int api) { ovrrenderapiconfigheader.putInt(ovrrenderapiconfigheader.position() + API, api); }
	public static void BackBufferSizeSet(ByteBuffer ovrrenderapiconfigheader, ByteBuffer BackBufferSize) { if ( BackBufferSize != null ) memCopy(memAddress(BackBufferSize), memAddress(ovrrenderapiconfigheader) + BACKBUFFERSIZE, OVRSizei.SIZEOF); }
	public static void BackBufferSizeW(ByteBuffer ovrrenderapiconfigheader, int w) { ovrrenderapiconfigheader.putInt(ovrrenderapiconfigheader.position() + BACKBUFFERSIZE + OVRSizei.W, w); }
	public static void BackBufferSizeH(ByteBuffer ovrrenderapiconfigheader, int h) { ovrrenderapiconfigheader.putInt(ovrrenderapiconfigheader.position() + BACKBUFFERSIZE + OVRSizei.H, h); }
	public static void Multisample(ByteBuffer ovrrenderapiconfigheader, int Multisample) { ovrrenderapiconfigheader.putInt(ovrrenderapiconfigheader.position() + MULTISAMPLE, Multisample); }

	public static int API(ByteBuffer ovrrenderapiconfigheader) { return ovrrenderapiconfigheader.getInt(ovrrenderapiconfigheader.position() + API); }
	public static void BackBufferSizeGet(ByteBuffer ovrrenderapiconfigheader, ByteBuffer BackBufferSize) { checkBuffer(BackBufferSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrrenderapiconfigheader) + BACKBUFFERSIZE, memAddress(BackBufferSize), OVRSizei.SIZEOF); }
	public static int BackBufferSizeW(ByteBuffer ovrrenderapiconfigheader) { return ovrrenderapiconfigheader.getInt(ovrrenderapiconfigheader.position() + BACKBUFFERSIZE + OVRSizei.W); }
	public static int BackBufferSizeH(ByteBuffer ovrrenderapiconfigheader) { return ovrrenderapiconfigheader.getInt(ovrrenderapiconfigheader.position() + BACKBUFFERSIZE + OVRSizei.H); }
	public static int Multisample(ByteBuffer ovrrenderapiconfigheader) { return ovrrenderapiconfigheader.getInt(ovrrenderapiconfigheader.position() + MULTISAMPLE); }

}