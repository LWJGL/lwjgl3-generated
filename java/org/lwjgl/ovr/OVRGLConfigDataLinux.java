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

/** Used to configure slave GL rendering (i.e. for devices created externally) on Linux. */
public final class OVRGLConfigDataLinux implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		DISP;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		DISP = offsets.get(1);
	}

	private final ByteBuffer struct;

	public OVRGLConfigDataLinux() {
		this(malloc());
	}

	public OVRGLConfigDataLinux(ByteBuffer struct) {
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

	public void setHeader(ByteBuffer Header) { HeaderSet(struct, Header); }
	public void setHeaderAPI(int API) { HeaderAPI(struct, API); }
	public void setHeaderBackBufferSize(ByteBuffer BackBufferSize) { HeaderBackBufferSizeSet(struct, BackBufferSize); }
	public void setHeaderBackBufferSizeW(int w) { HeaderBackBufferSizeW(struct, w); }
	public void setHeaderBackBufferSizeH(int h) { HeaderBackBufferSizeH(struct, h); }
	public void setHeaderMultisample(int Multisample) { HeaderMultisample(struct, Multisample); }
	public void setDisp(long Disp) { Disp(struct, Disp); }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderAPI() { return HeaderAPI(struct); }
	public void getHeaderBackBufferSize(ByteBuffer BackBufferSize) { HeaderBackBufferSizeGet(struct, BackBufferSize); }
	public int getHeaderBackBufferSizeW() { return HeaderBackBufferSizeW(struct); }
	public int getHeaderBackBufferSizeH() { return HeaderBackBufferSizeH(struct); }
	public int getHeaderMultisample() { return HeaderMultisample(struct); }
	public long getDisp() { return Disp(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Header,
		long Disp
	) {
		ByteBuffer ovrglconfigdata = malloc();

		HeaderSet(ovrglconfigdata, Header);
		Disp(ovrglconfigdata, Disp);

		return ovrglconfigdata;
	}

	public static void HeaderSet(ByteBuffer ovrglconfigdata, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrglconfigdata) + HEADER, OVRRenderAPIConfigHeader.SIZEOF); }
	public static void HeaderAPI(ByteBuffer ovrglconfigdata, int API) { ovrglconfigdata.putInt(ovrglconfigdata.position() + HEADER + OVRRenderAPIConfigHeader.API, API); }
	public static void HeaderBackBufferSizeSet(ByteBuffer ovrglconfigdata, ByteBuffer BackBufferSize) { if ( BackBufferSize != null ) memCopy(memAddress(BackBufferSize), memAddress(ovrglconfigdata) + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE, OVRSizei.SIZEOF); }
	public static void HeaderBackBufferSizeW(ByteBuffer ovrglconfigdata, int w) { ovrglconfigdata.putInt(ovrglconfigdata.position() + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.W, w); }
	public static void HeaderBackBufferSizeH(ByteBuffer ovrglconfigdata, int h) { ovrglconfigdata.putInt(ovrglconfigdata.position() + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.H, h); }
	public static void HeaderMultisample(ByteBuffer ovrglconfigdata, int Multisample) { ovrglconfigdata.putInt(ovrglconfigdata.position() + HEADER + OVRRenderAPIConfigHeader.MULTISAMPLE, Multisample); }
	public static void Disp(ByteBuffer ovrglconfigdata, long Disp) { PointerBuffer.put(ovrglconfigdata, ovrglconfigdata.position() + DISP, Disp); }

	public static void HeaderGet(ByteBuffer ovrglconfigdata, ByteBuffer Header) { checkBuffer(Header, OVRRenderAPIConfigHeader.SIZEOF); memCopy(memAddress(ovrglconfigdata) + HEADER, memAddress(Header), OVRRenderAPIConfigHeader.SIZEOF); }
	public static int HeaderAPI(ByteBuffer ovrglconfigdata) { return ovrglconfigdata.getInt(ovrglconfigdata.position() + HEADER + OVRRenderAPIConfigHeader.API); }
	public static void HeaderBackBufferSizeGet(ByteBuffer ovrglconfigdata, ByteBuffer BackBufferSize) { checkBuffer(BackBufferSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrglconfigdata) + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE, memAddress(BackBufferSize), OVRSizei.SIZEOF); }
	public static int HeaderBackBufferSizeW(ByteBuffer ovrglconfigdata) { return ovrglconfigdata.getInt(ovrglconfigdata.position() + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.W); }
	public static int HeaderBackBufferSizeH(ByteBuffer ovrglconfigdata) { return ovrglconfigdata.getInt(ovrglconfigdata.position() + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.H); }
	public static int HeaderMultisample(ByteBuffer ovrglconfigdata) { return ovrglconfigdata.getInt(ovrglconfigdata.position() + HEADER + OVRRenderAPIConfigHeader.MULTISAMPLE); }
	public static long Disp(ByteBuffer ovrglconfigdata) { return PointerBuffer.get(ovrglconfigdata, ovrglconfigdata.position() + DISP); }

}