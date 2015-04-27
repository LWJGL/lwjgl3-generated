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

/**
 * Platform-independent part of the eye texture descriptor. It is a part of ovrTexture, passed to ovrHmd_EndFrame. If RenderViewport is all zeros then the
 * full texture will be used.
 */
public final class OVRTextureHeader implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		API,
		TEXTURESIZE,
		RENDERVIEWPORT;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		API = offsets.get(0);
		TEXTURESIZE = offsets.get(1);
		RENDERVIEWPORT = offsets.get(2);
	}

	private final ByteBuffer struct;

	public OVRTextureHeader() {
		this(malloc());
	}

	public OVRTextureHeader(ByteBuffer struct) {
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
	public void setTextureSize(ByteBuffer TextureSize) { TextureSizeSet(struct, TextureSize); }
	public void setTextureSizeW(int w) { TextureSizeW(struct, w); }
	public void setTextureSizeH(int h) { TextureSizeH(struct, h); }
	public void setRenderViewport(ByteBuffer RenderViewport) { RenderViewportSet(struct, RenderViewport); }
	public void setRenderViewportPos(ByteBuffer Pos) { RenderViewportPosSet(struct, Pos); }
	public void setRenderViewportPosX(int x) { RenderViewportPosX(struct, x); }
	public void setRenderViewportPosY(int y) { RenderViewportPosY(struct, y); }
	public void setRenderViewportSize(ByteBuffer Size) { RenderViewportSizeSet(struct, Size); }
	public void setRenderViewportSizeW(int w) { RenderViewportSizeW(struct, w); }
	public void setRenderViewportSizeH(int h) { RenderViewportSizeH(struct, h); }

	public int getAPI() { return API(struct); }
	public void getTextureSize(ByteBuffer TextureSize) { TextureSizeGet(struct, TextureSize); }
	public int getTextureSizeW() { return TextureSizeW(struct); }
	public int getTextureSizeH() { return TextureSizeH(struct); }
	public void getRenderViewport(ByteBuffer RenderViewport) { RenderViewportGet(struct, RenderViewport); }
	public void getRenderViewportPos(ByteBuffer Pos) { RenderViewportPosGet(struct, Pos); }
	public int getRenderViewportPosX() { return RenderViewportPosX(struct); }
	public int getRenderViewportPosY() { return RenderViewportPosY(struct); }
	public void getRenderViewportSize(ByteBuffer Size) { RenderViewportSizeGet(struct, Size); }
	public int getRenderViewportSizeW() { return RenderViewportSizeW(struct); }
	public int getRenderViewportSizeH() { return RenderViewportSizeH(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int API,
		ByteBuffer TextureSize,
		ByteBuffer RenderViewport
	) {
		ByteBuffer ovrtextureheader = malloc();

		API(ovrtextureheader, API);
		TextureSizeSet(ovrtextureheader, TextureSize);
		RenderViewportSet(ovrtextureheader, RenderViewport);

		return ovrtextureheader;
	}

	public static void API(ByteBuffer ovrtextureheader, int api) { ovrtextureheader.putInt(ovrtextureheader.position() + API, api); }
	public static void TextureSizeSet(ByteBuffer ovrtextureheader, ByteBuffer TextureSize) { if ( TextureSize != null ) memCopy(memAddress(TextureSize), memAddress(ovrtextureheader) + TEXTURESIZE, OVRSizei.SIZEOF); }
	public static void TextureSizeW(ByteBuffer ovrtextureheader, int w) { ovrtextureheader.putInt(ovrtextureheader.position() + TEXTURESIZE + OVRSizei.W, w); }
	public static void TextureSizeH(ByteBuffer ovrtextureheader, int h) { ovrtextureheader.putInt(ovrtextureheader.position() + TEXTURESIZE + OVRSizei.H, h); }
	public static void RenderViewportSet(ByteBuffer ovrtextureheader, ByteBuffer RenderViewport) { if ( RenderViewport != null ) memCopy(memAddress(RenderViewport), memAddress(ovrtextureheader) + RENDERVIEWPORT, OVRRecti.SIZEOF); }
	public static void RenderViewportPosSet(ByteBuffer ovrtextureheader, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovrtextureheader) + RENDERVIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	public static void RenderViewportPosX(ByteBuffer ovrtextureheader, int x) { ovrtextureheader.putInt(ovrtextureheader.position() + RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void RenderViewportPosY(ByteBuffer ovrtextureheader, int y) { ovrtextureheader.putInt(ovrtextureheader.position() + RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void RenderViewportSizeSet(ByteBuffer ovrtextureheader, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovrtextureheader) + RENDERVIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	public static void RenderViewportSizeW(ByteBuffer ovrtextureheader, int w) { ovrtextureheader.putInt(ovrtextureheader.position() + RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void RenderViewportSizeH(ByteBuffer ovrtextureheader, int h) { ovrtextureheader.putInt(ovrtextureheader.position() + RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }

	public static int API(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + API); }
	public static void TextureSizeGet(ByteBuffer ovrtextureheader, ByteBuffer TextureSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrtextureheader) + TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int TextureSizeW(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + TEXTURESIZE + OVRSizei.W); }
	public static int TextureSizeH(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + TEXTURESIZE + OVRSizei.H); }
	public static void RenderViewportGet(ByteBuffer ovrtextureheader, ByteBuffer RenderViewport) { if ( LWJGLUtil.CHECKS ) checkBuffer(RenderViewport, OVRRecti.SIZEOF); memCopy(memAddress(ovrtextureheader) + RENDERVIEWPORT, memAddress(RenderViewport), OVRRecti.SIZEOF); }
	public static void RenderViewportPosGet(ByteBuffer ovrtextureheader, ByteBuffer Pos) { if ( LWJGLUtil.CHECKS ) checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovrtextureheader) + RENDERVIEWPORT + OVRRecti.POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int RenderViewportPosX(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int RenderViewportPosY(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + RENDERVIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static void RenderViewportSizeGet(ByteBuffer ovrtextureheader, ByteBuffer Size) { if ( LWJGLUtil.CHECKS ) checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovrtextureheader) + RENDERVIEWPORT + OVRRecti.SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int RenderViewportSizeW(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int RenderViewportSizeH(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + RENDERVIEWPORT + OVRRecti.SIZE + OVRSizei.H); }

}