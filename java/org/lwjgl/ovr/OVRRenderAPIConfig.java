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

/** Contains platform-specific information for rendering. */
public final class OVRRenderAPIConfig implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		PLATFORMDATA;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		PLATFORMDATA = offsets.get(1);
	}

	private final ByteBuffer struct;

	public OVRRenderAPIConfig() {
		this(malloc());
	}

	public OVRRenderAPIConfig(ByteBuffer struct) {
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
	public void setPlatformData(ByteBuffer PlatformData) { PlatformDataSet(struct, PlatformData); }
	public void setPlatformData(int index, long PlatformData) { PlatformData(struct, index, PlatformData); }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderAPI() { return HeaderAPI(struct); }
	public void getHeaderBackBufferSize(ByteBuffer BackBufferSize) { HeaderBackBufferSizeGet(struct, BackBufferSize); }
	public int getHeaderBackBufferSizeW() { return HeaderBackBufferSizeW(struct); }
	public int getHeaderBackBufferSizeH() { return HeaderBackBufferSizeH(struct); }
	public int getHeaderMultisample() { return HeaderMultisample(struct); }
	public void getPlatformData(ByteBuffer PlatformData) { PlatformDataGet(struct, PlatformData); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Header,
		ByteBuffer PlatformData
	) {
		ByteBuffer ovrrenderapiconfig = malloc();

		HeaderSet(ovrrenderapiconfig, Header);
		PlatformDataSet(ovrrenderapiconfig, PlatformData);

		return ovrrenderapiconfig;
	}

	public static void HeaderSet(ByteBuffer ovrrenderapiconfig, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrrenderapiconfig) + HEADER, OVRRenderAPIConfigHeader.SIZEOF); }
	public static void HeaderAPI(ByteBuffer ovrrenderapiconfig, int API) { ovrrenderapiconfig.putInt(ovrrenderapiconfig.position() + HEADER + OVRRenderAPIConfigHeader.API, API); }
	public static void HeaderBackBufferSizeSet(ByteBuffer ovrrenderapiconfig, ByteBuffer BackBufferSize) { if ( BackBufferSize != null ) memCopy(memAddress(BackBufferSize), memAddress(ovrrenderapiconfig) + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE, OVRSizei.SIZEOF); }
	public static void HeaderBackBufferSizeW(ByteBuffer ovrrenderapiconfig, int w) { ovrrenderapiconfig.putInt(ovrrenderapiconfig.position() + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.W, w); }
	public static void HeaderBackBufferSizeH(ByteBuffer ovrrenderapiconfig, int h) { ovrrenderapiconfig.putInt(ovrrenderapiconfig.position() + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.H, h); }
	public static void HeaderMultisample(ByteBuffer ovrrenderapiconfig, int Multisample) { ovrrenderapiconfig.putInt(ovrrenderapiconfig.position() + HEADER + OVRRenderAPIConfigHeader.MULTISAMPLE, Multisample); }
	public static void PlatformDataSet(ByteBuffer ovrrenderapiconfig, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(PlatformData, 8 * POINTER_SIZE);
		}
		memCopy(memAddress(PlatformData), memAddress(ovrrenderapiconfig) + PLATFORMDATA, PlatformData.remaining());
	}
	public static void PlatformData(ByteBuffer ovrrenderapiconfig, int index, long PlatformData) { PointerBuffer.put(ovrrenderapiconfig, PLATFORMDATA + index * POINTER_SIZE, PlatformData); }

	public static void HeaderGet(ByteBuffer ovrrenderapiconfig, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRRenderAPIConfigHeader.SIZEOF); memCopy(memAddress(ovrrenderapiconfig) + HEADER, memAddress(Header), OVRRenderAPIConfigHeader.SIZEOF); }
	public static int HeaderAPI(ByteBuffer ovrrenderapiconfig) { return ovrrenderapiconfig.getInt(ovrrenderapiconfig.position() + HEADER + OVRRenderAPIConfigHeader.API); }
	public static void HeaderBackBufferSizeGet(ByteBuffer ovrrenderapiconfig, ByteBuffer BackBufferSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(BackBufferSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrrenderapiconfig) + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE, memAddress(BackBufferSize), OVRSizei.SIZEOF); }
	public static int HeaderBackBufferSizeW(ByteBuffer ovrrenderapiconfig) { return ovrrenderapiconfig.getInt(ovrrenderapiconfig.position() + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.W); }
	public static int HeaderBackBufferSizeH(ByteBuffer ovrrenderapiconfig) { return ovrrenderapiconfig.getInt(ovrrenderapiconfig.position() + HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.H); }
	public static int HeaderMultisample(ByteBuffer ovrrenderapiconfig) { return ovrrenderapiconfig.getInt(ovrrenderapiconfig.position() + HEADER + OVRRenderAPIConfigHeader.MULTISAMPLE); }
	public static void PlatformDataGet(ByteBuffer ovrrenderapiconfig, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(PlatformData, 8 * 8);
		memCopy(memAddress(ovrrenderapiconfig) + PLATFORMDATA, memAddress(PlatformData), PlatformData.remaining());
	}
	public static long PlatformData(ByteBuffer ovrrenderapiconfig, int index) {
		return ovrrenderapiconfig.getLong(PLATFORMDATA + index * 8);
	}

}