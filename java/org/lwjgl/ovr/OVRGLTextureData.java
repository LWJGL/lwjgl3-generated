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

/** Used to pass GL eye texture data to ovrHmd_EndFrame. */
public final class OVRGLTextureData implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		TEXID;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		TEXID = offsets.get(1);
	}

	private final ByteBuffer struct;

	public OVRGLTextureData() {
		this(malloc());
	}

	public OVRGLTextureData(ByteBuffer struct) {
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
	public void setTexId(int TexId) { TexId(struct, TexId); }

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
	public int getTexId() { return TexId(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Header,
		int TexId
	) {
		ByteBuffer ovrgltexturedata = malloc();

		HeaderSet(ovrgltexturedata, Header);
		TexId(ovrgltexturedata, TexId);

		return ovrgltexturedata;
	}

	public static void HeaderSet(ByteBuffer ovrgltexturedata, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrgltexturedata) + HEADER, OVRTextureHeader.SIZEOF); }
	public static void HeaderAPI(ByteBuffer ovrgltexturedata, int API) { ovrgltexturedata.putInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.API, API); }
	public static void HeaderTextureSizeSet(ByteBuffer ovrgltexturedata, ByteBuffer TextureSize) { if ( TextureSize != null ) memCopy(memAddress(TextureSize), memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }
	public static void HeaderTextureSizeW(ByteBuffer ovrgltexturedata, int w) { ovrgltexturedata.putInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W, w); }
	public static void HeaderTextureSizeH(ByteBuffer ovrgltexturedata, int h) { ovrgltexturedata.putInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H, h); }
	public static void HeaderRenderViewportSet(ByteBuffer ovrgltexturedata, ByteBuffer RenderViewport) { if ( RenderViewport != null ) memCopy(memAddress(RenderViewport), memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.RENDERVIEWPORT, OVRRecti.SIZEOF); }
	public static void HeaderRenderViewportPosSet(ByteBuffer ovrgltexturedata, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	public static void HeaderRenderViewportPosX(ByteBuffer ovrgltexturedata, int x) { ovrgltexturedata.putInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void HeaderRenderViewportPosY(ByteBuffer ovrgltexturedata, int y) { ovrgltexturedata.putInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void HeaderRenderViewportSizeSet(ByteBuffer ovrgltexturedata, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	public static void HeaderRenderViewportSizeW(ByteBuffer ovrgltexturedata, int w) { ovrgltexturedata.putInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void HeaderRenderViewportSizeH(ByteBuffer ovrgltexturedata, int h) { ovrgltexturedata.putInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void TexId(ByteBuffer ovrgltexturedata, int TexId) { ovrgltexturedata.putInt(ovrgltexturedata.position() + TEXID, TexId); }

	public static void HeaderGet(ByteBuffer ovrgltexturedata, ByteBuffer Header) { checkBuffer(Header, OVRTextureHeader.SIZEOF); memCopy(memAddress(ovrgltexturedata) + HEADER, memAddress(Header), OVRTextureHeader.SIZEOF); }
	public static int HeaderAPI(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.API); }
	public static void HeaderTextureSizeGet(ByteBuffer ovrgltexturedata, ByteBuffer TextureSize) { checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int HeaderTextureSizeW(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int HeaderTextureSizeH(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static void HeaderRenderViewportGet(ByteBuffer ovrgltexturedata, ByteBuffer RenderViewport) { checkBuffer(RenderViewport, OVRRecti.SIZEOF); memCopy(memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.RENDERVIEWPORT, memAddress(RenderViewport), OVRRecti.SIZEOF); }
	public static void HeaderRenderViewportPosGet(ByteBuffer ovrgltexturedata, ByteBuffer Pos) { checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int HeaderRenderViewportPosX(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int HeaderRenderViewportPosY(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static void HeaderRenderViewportSizeGet(ByteBuffer ovrgltexturedata, ByteBuffer Size) { checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int HeaderRenderViewportSizeW(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int HeaderRenderViewportSizeH(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static int TexId(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + TEXID); }

}