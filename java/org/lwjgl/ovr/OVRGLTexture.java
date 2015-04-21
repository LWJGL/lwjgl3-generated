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

/** Contains OpenGL-specific texture information. */
public final class OVRGLTexture implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TEXTURE,
		OGL;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		TEXTURE = offsets.get(0);
		OGL = offsets.get(1);
	}

	private final ByteBuffer struct;

	public OVRGLTexture() {
		this(malloc());
	}

	public OVRGLTexture(ByteBuffer struct) {
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

	public void setTexture(ByteBuffer Texture) { TextureSet(struct, Texture); }
	public void setTextureHeader(ByteBuffer Header) { TextureHeaderSet(struct, Header); }
	public void setTextureHeaderAPI(int API) { TextureHeaderAPI(struct, API); }
	public void setTextureHeaderTextureSize(ByteBuffer TextureSize) { TextureHeaderTextureSizeSet(struct, TextureSize); }
	public void setTextureHeaderTextureSizeW(int w) { TextureHeaderTextureSizeW(struct, w); }
	public void setTextureHeaderTextureSizeH(int h) { TextureHeaderTextureSizeH(struct, h); }
	public void setTextureHeaderRenderViewport(ByteBuffer RenderViewport) { TextureHeaderRenderViewportSet(struct, RenderViewport); }
	public void setTextureHeaderRenderViewportPos(ByteBuffer Pos) { TextureHeaderRenderViewportPosSet(struct, Pos); }
	public void setTextureHeaderRenderViewportPosX(int x) { TextureHeaderRenderViewportPosX(struct, x); }
	public void setTextureHeaderRenderViewportPosY(int y) { TextureHeaderRenderViewportPosY(struct, y); }
	public void setTextureHeaderRenderViewportSize(ByteBuffer Size) { TextureHeaderRenderViewportSizeSet(struct, Size); }
	public void setTextureHeaderRenderViewportSizeW(int w) { TextureHeaderRenderViewportSizeW(struct, w); }
	public void setTextureHeaderRenderViewportSizeH(int h) { TextureHeaderRenderViewportSizeH(struct, h); }
	public void setTexturePlatformData(ByteBuffer PlatformData) { TexturePlatformDataSet(struct, PlatformData); }
	public void setTexturePlatformData(int index, long PlatformData) { TexturePlatformData(struct, index, PlatformData); }
	public void setOGL(ByteBuffer ogl) { OGLSet(struct, ogl); }
	public void setOGLHeader(ByteBuffer Header) { OGLHeaderSet(struct, Header); }
	public void setOGLHeaderAPI(int API) { OGLHeaderAPI(struct, API); }
	public void setOGLHeaderTextureSize(ByteBuffer TextureSize) { OGLHeaderTextureSizeSet(struct, TextureSize); }
	public void setOGLHeaderTextureSizeW(int w) { OGLHeaderTextureSizeW(struct, w); }
	public void setOGLHeaderTextureSizeH(int h) { OGLHeaderTextureSizeH(struct, h); }
	public void setOGLHeaderRenderViewport(ByteBuffer RenderViewport) { OGLHeaderRenderViewportSet(struct, RenderViewport); }
	public void setOGLHeaderRenderViewportPos(ByteBuffer Pos) { OGLHeaderRenderViewportPosSet(struct, Pos); }
	public void setOGLHeaderRenderViewportPosX(int x) { OGLHeaderRenderViewportPosX(struct, x); }
	public void setOGLHeaderRenderViewportPosY(int y) { OGLHeaderRenderViewportPosY(struct, y); }
	public void setOGLHeaderRenderViewportSize(ByteBuffer Size) { OGLHeaderRenderViewportSizeSet(struct, Size); }
	public void setOGLHeaderRenderViewportSizeW(int w) { OGLHeaderRenderViewportSizeW(struct, w); }
	public void setOGLHeaderRenderViewportSizeH(int h) { OGLHeaderRenderViewportSizeH(struct, h); }
	public void setOGLTexId(int TexId) { OGLTexId(struct, TexId); }

	public void getTexture(ByteBuffer Texture) { TextureGet(struct, Texture); }
	public void getTextureHeader(ByteBuffer Header) { TextureHeaderGet(struct, Header); }
	public int getTextureHeaderAPI() { return TextureHeaderAPI(struct); }
	public void getTextureHeaderTextureSize(ByteBuffer TextureSize) { TextureHeaderTextureSizeGet(struct, TextureSize); }
	public int getTextureHeaderTextureSizeW() { return TextureHeaderTextureSizeW(struct); }
	public int getTextureHeaderTextureSizeH() { return TextureHeaderTextureSizeH(struct); }
	public void getTextureHeaderRenderViewport(ByteBuffer RenderViewport) { TextureHeaderRenderViewportGet(struct, RenderViewport); }
	public void getTextureHeaderRenderViewportPos(ByteBuffer Pos) { TextureHeaderRenderViewportPosGet(struct, Pos); }
	public int getTextureHeaderRenderViewportPosX() { return TextureHeaderRenderViewportPosX(struct); }
	public int getTextureHeaderRenderViewportPosY() { return TextureHeaderRenderViewportPosY(struct); }
	public void getTextureHeaderRenderViewportSize(ByteBuffer Size) { TextureHeaderRenderViewportSizeGet(struct, Size); }
	public int getTextureHeaderRenderViewportSizeW() { return TextureHeaderRenderViewportSizeW(struct); }
	public int getTextureHeaderRenderViewportSizeH() { return TextureHeaderRenderViewportSizeH(struct); }
	public void getTexturePlatformData(ByteBuffer PlatformData) { TexturePlatformDataGet(struct, PlatformData); }
	public void getOGL(ByteBuffer ogl) { OGLGet(struct, ogl); }
	public void getOGLHeader(ByteBuffer Header) { OGLHeaderGet(struct, Header); }
	public int getOGLHeaderAPI() { return OGLHeaderAPI(struct); }
	public void getOGLHeaderTextureSize(ByteBuffer TextureSize) { OGLHeaderTextureSizeGet(struct, TextureSize); }
	public int getOGLHeaderTextureSizeW() { return OGLHeaderTextureSizeW(struct); }
	public int getOGLHeaderTextureSizeH() { return OGLHeaderTextureSizeH(struct); }
	public void getOGLHeaderRenderViewport(ByteBuffer RenderViewport) { OGLHeaderRenderViewportGet(struct, RenderViewport); }
	public void getOGLHeaderRenderViewportPos(ByteBuffer Pos) { OGLHeaderRenderViewportPosGet(struct, Pos); }
	public int getOGLHeaderRenderViewportPosX() { return OGLHeaderRenderViewportPosX(struct); }
	public int getOGLHeaderRenderViewportPosY() { return OGLHeaderRenderViewportPosY(struct); }
	public void getOGLHeaderRenderViewportSize(ByteBuffer Size) { OGLHeaderRenderViewportSizeGet(struct, Size); }
	public int getOGLHeaderRenderViewportSizeW() { return OGLHeaderRenderViewportSizeW(struct); }
	public int getOGLHeaderRenderViewportSizeH() { return OGLHeaderRenderViewportSizeH(struct); }
	public int getOGLTexId() { return OGLTexId(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Texture,
		ByteBuffer OGL
	) {
		ByteBuffer ovrgltexture = malloc();

		TextureSet(ovrgltexture, Texture);
		OGLSet(ovrgltexture, OGL);

		return ovrgltexture;
	}

	public static void TextureSet(ByteBuffer ovrgltexture, ByteBuffer Texture) { if ( Texture != null ) memCopy(memAddress(Texture), memAddress(ovrgltexture) + TEXTURE, OVRTexture.SIZEOF); }
	public static void TextureHeaderSet(ByteBuffer ovrgltexture, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER, OVRTextureHeader.SIZEOF); }
	public static void TextureHeaderAPI(ByteBuffer ovrgltexture, int API) { ovrgltexture.putInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.API, API); }
	public static void TextureHeaderTextureSizeSet(ByteBuffer ovrgltexture, ByteBuffer TextureSize) { if ( TextureSize != null ) memCopy(memAddress(TextureSize), memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }
	public static void TextureHeaderTextureSizeW(ByteBuffer ovrgltexture, int w) { ovrgltexture.putInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W, w); }
	public static void TextureHeaderTextureSizeH(ByteBuffer ovrgltexture, int h) { ovrgltexture.putInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H, h); }
	public static void TextureHeaderRenderViewportSet(ByteBuffer ovrgltexture, ByteBuffer RenderViewport) { if ( RenderViewport != null ) memCopy(memAddress(RenderViewport), memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT, OVRRecti.SIZEOF); }
	public static void TextureHeaderRenderViewportPosSet(ByteBuffer ovrgltexture, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	public static void TextureHeaderRenderViewportPosX(ByteBuffer ovrgltexture, int x) { ovrgltexture.putInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void TextureHeaderRenderViewportPosY(ByteBuffer ovrgltexture, int y) { ovrgltexture.putInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void TextureHeaderRenderViewportSizeSet(ByteBuffer ovrgltexture, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	public static void TextureHeaderRenderViewportSizeW(ByteBuffer ovrgltexture, int w) { ovrgltexture.putInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void TextureHeaderRenderViewportSizeH(ByteBuffer ovrgltexture, int h) { ovrgltexture.putInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void TexturePlatformDataSet(ByteBuffer ovrgltexture, ByteBuffer PlatformData) {
		checkBufferGT(PlatformData, 8 * POINTER_SIZE);
		memCopy(memAddress(PlatformData), memAddress(ovrgltexture) + TEXTURE + OVRTexture.PLATFORMDATA, PlatformData.remaining());
	}
	public static void TexturePlatformData(ByteBuffer ovrgltexture, int index, long PlatformData) { PointerBuffer.put(ovrgltexture, TEXTURE + OVRTexture.PLATFORMDATA + index * POINTER_SIZE, PlatformData); }
	public static void OGLSet(ByteBuffer ovrgltexture, ByteBuffer ogl) { if ( ogl != null ) memCopy(memAddress(ogl), memAddress(ovrgltexture) + OGL, OVRGLTextureData.SIZEOF); }
	public static void OGLHeaderSet(ByteBuffer ovrgltexture, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER, OVRTextureHeader.SIZEOF); }
	public static void OGLHeaderAPI(ByteBuffer ovrgltexture, int API) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.API, API); }
	public static void OGLHeaderTextureSizeSet(ByteBuffer ovrgltexture, ByteBuffer TextureSize) { if ( TextureSize != null ) memCopy(memAddress(TextureSize), memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }
	public static void OGLHeaderTextureSizeW(ByteBuffer ovrgltexture, int w) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W, w); }
	public static void OGLHeaderTextureSizeH(ByteBuffer ovrgltexture, int h) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H, h); }
	public static void OGLHeaderRenderViewportSet(ByteBuffer ovrgltexture, ByteBuffer RenderViewport) { if ( RenderViewport != null ) memCopy(memAddress(RenderViewport), memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT, OVRRecti.SIZEOF); }
	public static void OGLHeaderRenderViewportPosSet(ByteBuffer ovrgltexture, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	public static void OGLHeaderRenderViewportPosX(ByteBuffer ovrgltexture, int x) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void OGLHeaderRenderViewportPosY(ByteBuffer ovrgltexture, int y) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void OGLHeaderRenderViewportSizeSet(ByteBuffer ovrgltexture, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	public static void OGLHeaderRenderViewportSizeW(ByteBuffer ovrgltexture, int w) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void OGLHeaderRenderViewportSizeH(ByteBuffer ovrgltexture, int h) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void OGLTexId(ByteBuffer ovrgltexture, int TexId) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.TEXID, TexId); }

	public static void TextureGet(ByteBuffer ovrgltexture, ByteBuffer Texture) { checkBuffer(Texture, OVRTexture.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE, memAddress(Texture), OVRTexture.SIZEOF); }
	public static void TextureHeaderGet(ByteBuffer ovrgltexture, ByteBuffer Header) { checkBuffer(Header, OVRTextureHeader.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER, memAddress(Header), OVRTextureHeader.SIZEOF); }
	public static int TextureHeaderAPI(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.API); }
	public static void TextureHeaderTextureSizeGet(ByteBuffer ovrgltexture, ByteBuffer TextureSize) { checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int TextureHeaderTextureSizeW(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int TextureHeaderTextureSizeH(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static void TextureHeaderRenderViewportGet(ByteBuffer ovrgltexture, ByteBuffer RenderViewport) { checkBuffer(RenderViewport, OVRRecti.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT, memAddress(RenderViewport), OVRRecti.SIZEOF); }
	public static void TextureHeaderRenderViewportPosGet(ByteBuffer ovrgltexture, ByteBuffer Pos) { checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int TextureHeaderRenderViewportPosX(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int TextureHeaderRenderViewportPosY(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static void TextureHeaderRenderViewportSizeGet(ByteBuffer ovrgltexture, ByteBuffer Size) { checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int TextureHeaderRenderViewportSizeW(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int TextureHeaderRenderViewportSizeH(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static void TexturePlatformDataGet(ByteBuffer ovrgltexture, ByteBuffer PlatformData) {
		checkBufferGT(PlatformData, 8 * 8);
		memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.PLATFORMDATA, memAddress(PlatformData), PlatformData.remaining());
	}
	public static long TexturePlatformData(ByteBuffer ovrgltexture, int index) {
		return ovrgltexture.getLong(TEXTURE + OVRTexture.PLATFORMDATA + index * 8);
	}
	public static void OGLGet(ByteBuffer ovrgltexture, ByteBuffer ogl) { checkBuffer(ogl, OVRGLTextureData.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL, memAddress(ogl), OVRGLTextureData.SIZEOF); }
	public static void OGLHeaderGet(ByteBuffer ovrgltexture, ByteBuffer Header) { checkBuffer(Header, OVRTextureHeader.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER, memAddress(Header), OVRTextureHeader.SIZEOF); }
	public static int OGLHeaderAPI(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.API); }
	public static void OGLHeaderTextureSizeGet(ByteBuffer ovrgltexture, ByteBuffer TextureSize) { checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int OGLHeaderTextureSizeW(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int OGLHeaderTextureSizeH(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static void OGLHeaderRenderViewportGet(ByteBuffer ovrgltexture, ByteBuffer RenderViewport) { checkBuffer(RenderViewport, OVRRecti.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT, memAddress(RenderViewport), OVRRecti.SIZEOF); }
	public static void OGLHeaderRenderViewportPosGet(ByteBuffer ovrgltexture, ByteBuffer Pos) { checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int OGLHeaderRenderViewportPosX(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int OGLHeaderRenderViewportPosY(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static void OGLHeaderRenderViewportSizeGet(ByteBuffer ovrgltexture, ByteBuffer Size) { checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int OGLHeaderRenderViewportSizeW(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int OGLHeaderRenderViewportSizeH(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static int OGLTexId(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.TEXID); }

}