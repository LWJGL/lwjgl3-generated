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

/** Contains platform-specific information about a texture. */
public final class OVRTexture implements Pointer {

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

	public OVRTexture() {
		this(malloc());
	}

	public OVRTexture(ByteBuffer struct) {
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
	public void setHeaderTextureSize(ByteBuffer TextureSize) { HeaderTextureSizeSet(struct, TextureSize); }
	public void setHeaderTextureSizeW(int w) { HeaderTextureSizeW(struct, w); }
	public void setHeaderTextureSizeH(int h) { HeaderTextureSizeH(struct, h); }
	public void setHeaderRenderViewport(ByteBuffer RenderViewport) { HeaderRenderViewportSet(struct, RenderViewport); }
	public void setHeaderRenderViewportPos(ByteBuffer Pos) { HeaderRenderViewportPosSet(struct, Pos); }
	public void setHeaderRenderViewportPosX(int x) { HeaderRenderViewportPosX(struct, x); }
	public void setHeaderRenderViewportPosY(int y) { HeaderRenderViewportPosY(struct, y); }
	public void setHeaderRenderViewportSize(ByteBuffer Size) { HeaderRenderViewportSizeSet(struct, Size); }
	public void setHeaderRenderViewportSizeW(int w) { HeaderRenderViewportSizeW(struct, w); }
	public void setHeaderRenderViewportSizeH(int h) { HeaderRenderViewportSizeH(struct, h); }
	public void setPlatformData(ByteBuffer PlatformData) { PlatformDataSet(struct, PlatformData); }
	public void setPlatformData(int index, long PlatformData) { PlatformData(struct, index, PlatformData); }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderAPI() { return HeaderAPI(struct); }
	public void getHeaderTextureSize(ByteBuffer TextureSize) { HeaderTextureSizeGet(struct, TextureSize); }
	public int getHeaderTextureSizeW() { return HeaderTextureSizeW(struct); }
	public int getHeaderTextureSizeH() { return HeaderTextureSizeH(struct); }
	public void getHeaderRenderViewport(ByteBuffer RenderViewport) { HeaderRenderViewportGet(struct, RenderViewport); }
	public void getHeaderRenderViewportPos(ByteBuffer Pos) { HeaderRenderViewportPosGet(struct, Pos); }
	public int getHeaderRenderViewportPosX() { return HeaderRenderViewportPosX(struct); }
	public int getHeaderRenderViewportPosY() { return HeaderRenderViewportPosY(struct); }
	public void getHeaderRenderViewportSize(ByteBuffer Size) { HeaderRenderViewportSizeGet(struct, Size); }
	public int getHeaderRenderViewportSizeW() { return HeaderRenderViewportSizeW(struct); }
	public int getHeaderRenderViewportSizeH() { return HeaderRenderViewportSizeH(struct); }
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
		ByteBuffer ovrtexture = malloc();

		HeaderSet(ovrtexture, Header);
		PlatformDataSet(ovrtexture, PlatformData);

		return ovrtexture;
	}

	public static void HeaderSet(ByteBuffer ovrtexture, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrtexture) + HEADER, OVRTextureHeader.SIZEOF); }
	public static void HeaderAPI(ByteBuffer ovrtexture, int API) { ovrtexture.putInt(ovrtexture.position() + HEADER + OVRTextureHeader.API, API); }
	public static void HeaderTextureSizeSet(ByteBuffer ovrtexture, ByteBuffer TextureSize) { if ( TextureSize != null ) memCopy(memAddress(TextureSize), memAddress(ovrtexture) + HEADER + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }
	public static void HeaderTextureSizeW(ByteBuffer ovrtexture, int w) { ovrtexture.putInt(ovrtexture.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W, w); }
	public static void HeaderTextureSizeH(ByteBuffer ovrtexture, int h) { ovrtexture.putInt(ovrtexture.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H, h); }
	public static void HeaderRenderViewportSet(ByteBuffer ovrtexture, ByteBuffer RenderViewport) { if ( RenderViewport != null ) memCopy(memAddress(RenderViewport), memAddress(ovrtexture) + HEADER + OVRTextureHeader.RENDERVIEWPORT, OVRRecti.SIZEOF); }
	public static void HeaderRenderViewportPosSet(ByteBuffer ovrtexture, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovrtexture) + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	public static void HeaderRenderViewportPosX(ByteBuffer ovrtexture, int x) { ovrtexture.putInt(ovrtexture.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void HeaderRenderViewportPosY(ByteBuffer ovrtexture, int y) { ovrtexture.putInt(ovrtexture.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void HeaderRenderViewportSizeSet(ByteBuffer ovrtexture, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovrtexture) + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	public static void HeaderRenderViewportSizeW(ByteBuffer ovrtexture, int w) { ovrtexture.putInt(ovrtexture.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void HeaderRenderViewportSizeH(ByteBuffer ovrtexture, int h) { ovrtexture.putInt(ovrtexture.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void PlatformDataSet(ByteBuffer ovrtexture, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(PlatformData, 8 * POINTER_SIZE);
		}
		memCopy(memAddress(PlatformData), memAddress(ovrtexture) + PLATFORMDATA, PlatformData.remaining());
	}
	public static void PlatformData(ByteBuffer ovrtexture, int index, long PlatformData) { PointerBuffer.put(ovrtexture, PLATFORMDATA + index * POINTER_SIZE, PlatformData); }

	public static void HeaderGet(ByteBuffer ovrtexture, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRTextureHeader.SIZEOF); memCopy(memAddress(ovrtexture) + HEADER, memAddress(Header), OVRTextureHeader.SIZEOF); }
	public static int HeaderAPI(ByteBuffer ovrtexture) { return ovrtexture.getInt(ovrtexture.position() + HEADER + OVRTextureHeader.API); }
	public static void HeaderTextureSizeGet(ByteBuffer ovrtexture, ByteBuffer TextureSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrtexture) + HEADER + OVRTextureHeader.TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int HeaderTextureSizeW(ByteBuffer ovrtexture) { return ovrtexture.getInt(ovrtexture.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int HeaderTextureSizeH(ByteBuffer ovrtexture) { return ovrtexture.getInt(ovrtexture.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static void HeaderRenderViewportGet(ByteBuffer ovrtexture, ByteBuffer RenderViewport) { if ( LWJGLUtil.CHECKS ) checkBuffer(RenderViewport, OVRRecti.SIZEOF); memCopy(memAddress(ovrtexture) + HEADER + OVRTextureHeader.RENDERVIEWPORT, memAddress(RenderViewport), OVRRecti.SIZEOF); }
	public static void HeaderRenderViewportPosGet(ByteBuffer ovrtexture, ByteBuffer Pos) { if ( LWJGLUtil.CHECKS ) checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrtexture) + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int HeaderRenderViewportPosX(ByteBuffer ovrtexture) { return ovrtexture.getInt(ovrtexture.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int HeaderRenderViewportPosY(ByteBuffer ovrtexture) { return ovrtexture.getInt(ovrtexture.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static void HeaderRenderViewportSizeGet(ByteBuffer ovrtexture, ByteBuffer Size) { if ( LWJGLUtil.CHECKS ) checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovrtexture) + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int HeaderRenderViewportSizeW(ByteBuffer ovrtexture) { return ovrtexture.getInt(ovrtexture.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int HeaderRenderViewportSizeH(ByteBuffer ovrtexture) { return ovrtexture.getInt(ovrtexture.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static void PlatformDataGet(ByteBuffer ovrtexture, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(PlatformData, 8 * 8);
		memCopy(memAddress(ovrtexture) + PLATFORMDATA, memAddress(PlatformData), PlatformData.remaining());
	}
	public static long PlatformData(ByteBuffer ovrtexture, int index) {
		return ovrtexture.getLong(PLATFORMDATA + index * 8);
	}

}