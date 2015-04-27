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

/** Contains OpenGL-specific rendering information on Linux. */
public final class OVRGLConfigLinux implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		CONFIG,
		OGL;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		CONFIG = offsets.get(0);
		OGL = offsets.get(1);
	}

	private final ByteBuffer struct;

	public OVRGLConfigLinux() {
		this(malloc());
	}

	public OVRGLConfigLinux(ByteBuffer struct) {
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

	public void setConfig(ByteBuffer Config) { ConfigSet(struct, Config); }
	public void setConfigHeader(ByteBuffer Header) { ConfigHeaderSet(struct, Header); }
	public void setConfigHeaderAPI(int API) { ConfigHeaderAPI(struct, API); }
	public void setConfigHeaderBackBufferSize(ByteBuffer BackBufferSize) { ConfigHeaderBackBufferSizeSet(struct, BackBufferSize); }
	public void setConfigHeaderBackBufferSizeW(int w) { ConfigHeaderBackBufferSizeW(struct, w); }
	public void setConfigHeaderBackBufferSizeH(int h) { ConfigHeaderBackBufferSizeH(struct, h); }
	public void setConfigHeaderMultisample(int Multisample) { ConfigHeaderMultisample(struct, Multisample); }
	public void setConfigPlatformData(ByteBuffer PlatformData) { ConfigPlatformDataSet(struct, PlatformData); }
	public void setConfigPlatformData(int index, long PlatformData) { ConfigPlatformData(struct, index, PlatformData); }
	public void setOGL(ByteBuffer ogl) { OGLSet(struct, ogl); }
	public void setOGLHeader(ByteBuffer Header) { OGLHeaderSet(struct, Header); }
	public void setOGLHeaderAPI(int API) { OGLHeaderAPI(struct, API); }
	public void setOGLHeaderBackBufferSize(ByteBuffer BackBufferSize) { OGLHeaderBackBufferSizeSet(struct, BackBufferSize); }
	public void setOGLHeaderBackBufferSizeW(int w) { OGLHeaderBackBufferSizeW(struct, w); }
	public void setOGLHeaderBackBufferSizeH(int h) { OGLHeaderBackBufferSizeH(struct, h); }
	public void setOGLHeaderMultisample(int Multisample) { OGLHeaderMultisample(struct, Multisample); }
	public void setOGLDisp(long Disp) { OGLDisp(struct, Disp); }

	public void getConfig(ByteBuffer Config) { ConfigGet(struct, Config); }
	public void getConfigHeader(ByteBuffer Header) { ConfigHeaderGet(struct, Header); }
	public int getConfigHeaderAPI() { return ConfigHeaderAPI(struct); }
	public void getConfigHeaderBackBufferSize(ByteBuffer BackBufferSize) { ConfigHeaderBackBufferSizeGet(struct, BackBufferSize); }
	public int getConfigHeaderBackBufferSizeW() { return ConfigHeaderBackBufferSizeW(struct); }
	public int getConfigHeaderBackBufferSizeH() { return ConfigHeaderBackBufferSizeH(struct); }
	public int getConfigHeaderMultisample() { return ConfigHeaderMultisample(struct); }
	public void getConfigPlatformData(ByteBuffer PlatformData) { ConfigPlatformDataGet(struct, PlatformData); }
	public void getOGL(ByteBuffer ogl) { OGLGet(struct, ogl); }
	public void getOGLHeader(ByteBuffer Header) { OGLHeaderGet(struct, Header); }
	public int getOGLHeaderAPI() { return OGLHeaderAPI(struct); }
	public void getOGLHeaderBackBufferSize(ByteBuffer BackBufferSize) { OGLHeaderBackBufferSizeGet(struct, BackBufferSize); }
	public int getOGLHeaderBackBufferSizeW() { return OGLHeaderBackBufferSizeW(struct); }
	public int getOGLHeaderBackBufferSizeH() { return OGLHeaderBackBufferSizeH(struct); }
	public int getOGLHeaderMultisample() { return OGLHeaderMultisample(struct); }
	public long getOGLDisp() { return OGLDisp(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Config,
		ByteBuffer OGL
	) {
		ByteBuffer ovrglconfig = malloc();

		ConfigSet(ovrglconfig, Config);
		OGLSet(ovrglconfig, OGL);

		return ovrglconfig;
	}

	public static void ConfigSet(ByteBuffer ovrglconfig, ByteBuffer Config) { if ( Config != null ) memCopy(memAddress(Config), memAddress(ovrglconfig) + CONFIG, OVRRenderAPIConfig.SIZEOF); }
	public static void ConfigHeaderSet(ByteBuffer ovrglconfig, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrglconfig) + CONFIG + OVRRenderAPIConfig.HEADER, OVRRenderAPIConfigHeader.SIZEOF); }
	public static void ConfigHeaderAPI(ByteBuffer ovrglconfig, int API) { ovrglconfig.putInt(ovrglconfig.position() + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.API, API); }
	public static void ConfigHeaderBackBufferSizeSet(ByteBuffer ovrglconfig, ByteBuffer BackBufferSize) { if ( BackBufferSize != null ) memCopy(memAddress(BackBufferSize), memAddress(ovrglconfig) + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE, OVRSizei.SIZEOF); }
	public static void ConfigHeaderBackBufferSizeW(ByteBuffer ovrglconfig, int w) { ovrglconfig.putInt(ovrglconfig.position() + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.W, w); }
	public static void ConfigHeaderBackBufferSizeH(ByteBuffer ovrglconfig, int h) { ovrglconfig.putInt(ovrglconfig.position() + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.H, h); }
	public static void ConfigHeaderMultisample(ByteBuffer ovrglconfig, int Multisample) { ovrglconfig.putInt(ovrglconfig.position() + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.MULTISAMPLE, Multisample); }
	public static void ConfigPlatformDataSet(ByteBuffer ovrglconfig, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(PlatformData, 8 * POINTER_SIZE);
		}
		memCopy(memAddress(PlatformData), memAddress(ovrglconfig) + CONFIG + OVRRenderAPIConfig.PLATFORMDATA, PlatformData.remaining());
	}
	public static void ConfigPlatformData(ByteBuffer ovrglconfig, int index, long PlatformData) { PointerBuffer.put(ovrglconfig, CONFIG + OVRRenderAPIConfig.PLATFORMDATA + index * POINTER_SIZE, PlatformData); }
	public static void OGLSet(ByteBuffer ovrglconfig, ByteBuffer ogl) { if ( ogl != null ) memCopy(memAddress(ogl), memAddress(ovrglconfig) + OGL, OVRGLConfigDataLinux.SIZEOF); }
	public static void OGLHeaderSet(ByteBuffer ovrglconfig, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrglconfig) + OGL + OVRGLConfigDataLinux.HEADER, OVRRenderAPIConfigHeader.SIZEOF); }
	public static void OGLHeaderAPI(ByteBuffer ovrglconfig, int API) { ovrglconfig.putInt(ovrglconfig.position() + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.API, API); }
	public static void OGLHeaderBackBufferSizeSet(ByteBuffer ovrglconfig, ByteBuffer BackBufferSize) { if ( BackBufferSize != null ) memCopy(memAddress(BackBufferSize), memAddress(ovrglconfig) + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE, OVRSizei.SIZEOF); }
	public static void OGLHeaderBackBufferSizeW(ByteBuffer ovrglconfig, int w) { ovrglconfig.putInt(ovrglconfig.position() + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.W, w); }
	public static void OGLHeaderBackBufferSizeH(ByteBuffer ovrglconfig, int h) { ovrglconfig.putInt(ovrglconfig.position() + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.H, h); }
	public static void OGLHeaderMultisample(ByteBuffer ovrglconfig, int Multisample) { ovrglconfig.putInt(ovrglconfig.position() + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.MULTISAMPLE, Multisample); }
	public static void OGLDisp(ByteBuffer ovrglconfig, long Disp) { PointerBuffer.put(ovrglconfig, ovrglconfig.position() + OGL + OVRGLConfigDataLinux.DISP, Disp); }

	public static void ConfigGet(ByteBuffer ovrglconfig, ByteBuffer Config) { if ( LWJGLUtil.CHECKS ) checkBuffer(Config, OVRRenderAPIConfig.SIZEOF); memCopy(memAddress(ovrglconfig) + CONFIG, memAddress(Config), OVRRenderAPIConfig.SIZEOF); }
	public static void ConfigHeaderGet(ByteBuffer ovrglconfig, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRRenderAPIConfigHeader.SIZEOF); memCopy(memAddress(ovrglconfig) + CONFIG + OVRRenderAPIConfig.HEADER, memAddress(Header), OVRRenderAPIConfigHeader.SIZEOF); }
	public static int ConfigHeaderAPI(ByteBuffer ovrglconfig) { return ovrglconfig.getInt(ovrglconfig.position() + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.API); }
	public static void ConfigHeaderBackBufferSizeGet(ByteBuffer ovrglconfig, ByteBuffer BackBufferSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(BackBufferSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrglconfig) + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE, memAddress(BackBufferSize), OVRSizei.SIZEOF); }
	public static int ConfigHeaderBackBufferSizeW(ByteBuffer ovrglconfig) { return ovrglconfig.getInt(ovrglconfig.position() + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.W); }
	public static int ConfigHeaderBackBufferSizeH(ByteBuffer ovrglconfig) { return ovrglconfig.getInt(ovrglconfig.position() + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.H); }
	public static int ConfigHeaderMultisample(ByteBuffer ovrglconfig) { return ovrglconfig.getInt(ovrglconfig.position() + CONFIG + OVRRenderAPIConfig.HEADER + OVRRenderAPIConfigHeader.MULTISAMPLE); }
	public static void ConfigPlatformDataGet(ByteBuffer ovrglconfig, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(PlatformData, 8 * 8);
		memCopy(memAddress(ovrglconfig) + CONFIG + OVRRenderAPIConfig.PLATFORMDATA, memAddress(PlatformData), PlatformData.remaining());
	}
	public static long ConfigPlatformData(ByteBuffer ovrglconfig, int index) {
		return ovrglconfig.getLong(CONFIG + OVRRenderAPIConfig.PLATFORMDATA + index * 8);
	}
	public static void OGLGet(ByteBuffer ovrglconfig, ByteBuffer ogl) { if ( LWJGLUtil.CHECKS ) checkBuffer(ogl, OVRGLConfigDataLinux.SIZEOF); memCopy(memAddress(ovrglconfig) + OGL, memAddress(ogl), OVRGLConfigDataLinux.SIZEOF); }
	public static void OGLHeaderGet(ByteBuffer ovrglconfig, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRRenderAPIConfigHeader.SIZEOF); memCopy(memAddress(ovrglconfig) + OGL + OVRGLConfigDataLinux.HEADER, memAddress(Header), OVRRenderAPIConfigHeader.SIZEOF); }
	public static int OGLHeaderAPI(ByteBuffer ovrglconfig) { return ovrglconfig.getInt(ovrglconfig.position() + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.API); }
	public static void OGLHeaderBackBufferSizeGet(ByteBuffer ovrglconfig, ByteBuffer BackBufferSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(BackBufferSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrglconfig) + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE, memAddress(BackBufferSize), OVRSizei.SIZEOF); }
	public static int OGLHeaderBackBufferSizeW(ByteBuffer ovrglconfig) { return ovrglconfig.getInt(ovrglconfig.position() + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.W); }
	public static int OGLHeaderBackBufferSizeH(ByteBuffer ovrglconfig) { return ovrglconfig.getInt(ovrglconfig.position() + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.BACKBUFFERSIZE + OVRSizei.H); }
	public static int OGLHeaderMultisample(ByteBuffer ovrglconfig) { return ovrglconfig.getInt(ovrglconfig.position() + OGL + OVRGLConfigDataLinux.HEADER + OVRRenderAPIConfigHeader.MULTISAMPLE); }
	public static long OGLDisp(ByteBuffer ovrglconfig) { return PointerBuffer.get(ovrglconfig, ovrglconfig.position() + OGL + OVRGLConfigDataLinux.DISP); }

}