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
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		TEXTURE = offsets.get(0);
		OGL = offsets.get(1);

		memFree(offsets);
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

	public OVRGLTexture setTexture(ByteBuffer Texture) { TextureSet(struct, Texture); return this; }
	public OVRGLTexture setTextureHeader(ByteBuffer Header) { TextureHeaderSet(struct, Header); return this; }
	public OVRGLTexture setTextureHeaderAPI(int API) { TextureHeaderAPI(struct, API); return this; }
	public OVRGLTexture setTextureHeaderTextureSize(ByteBuffer TextureSize) { TextureHeaderTextureSizeSet(struct, TextureSize); return this; }
	public OVRGLTexture setTextureHeaderTextureSizeW(int w) { TextureHeaderTextureSizeW(struct, w); return this; }
	public OVRGLTexture setTextureHeaderTextureSizeH(int h) { TextureHeaderTextureSizeH(struct, h); return this; }
	public OVRGLTexture setTexturePlatformData(ByteBuffer PlatformData) { TexturePlatformDataSet(struct, PlatformData); return this; }
	public OVRGLTexture setTexturePlatformData(int index, long PlatformData) { TexturePlatformData(struct, index, PlatformData); return this; }
	public OVRGLTexture setOGL(ByteBuffer ogl) { OGLSet(struct, ogl); return this; }
	public OVRGLTexture setOGLHeader(ByteBuffer Header) { OGLHeaderSet(struct, Header); return this; }
	public OVRGLTexture setOGLHeaderAPI(int API) { OGLHeaderAPI(struct, API); return this; }
	public OVRGLTexture setOGLHeaderTextureSize(ByteBuffer TextureSize) { OGLHeaderTextureSizeSet(struct, TextureSize); return this; }
	public OVRGLTexture setOGLHeaderTextureSizeW(int w) { OGLHeaderTextureSizeW(struct, w); return this; }
	public OVRGLTexture setOGLHeaderTextureSizeH(int h) { OGLHeaderTextureSizeH(struct, h); return this; }
	public OVRGLTexture setOGLTexId(int TexId) { OGLTexId(struct, TexId); return this; }

	public void getTexture(ByteBuffer Texture) { TextureGet(struct, Texture); }
	public void getTextureHeader(ByteBuffer Header) { TextureHeaderGet(struct, Header); }
	public int getTextureHeaderAPI() { return TextureHeaderAPI(struct); }
	public void getTextureHeaderTextureSize(ByteBuffer TextureSize) { TextureHeaderTextureSizeGet(struct, TextureSize); }
	public int getTextureHeaderTextureSizeW() { return TextureHeaderTextureSizeW(struct); }
	public int getTextureHeaderTextureSizeH() { return TextureHeaderTextureSizeH(struct); }
	public void getTexturePlatformData(ByteBuffer PlatformData) { TexturePlatformDataGet(struct, PlatformData); }
	public void getOGL(ByteBuffer ogl) { OGLGet(struct, ogl); }
	public void getOGLHeader(ByteBuffer Header) { OGLHeaderGet(struct, Header); }
	public int getOGLHeaderAPI() { return OGLHeaderAPI(struct); }
	public void getOGLHeaderTextureSize(ByteBuffer TextureSize) { OGLHeaderTextureSizeGet(struct, TextureSize); }
	public int getOGLHeaderTextureSizeW() { return OGLHeaderTextureSizeW(struct); }
	public int getOGLHeaderTextureSizeH() { return OGLHeaderTextureSizeH(struct); }
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
	public static void TexturePlatformDataSet(ByteBuffer ovrgltexture, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(PlatformData, 8 * POINTER_SIZE);
		}
		memCopy(memAddress(PlatformData), memAddress(ovrgltexture) + TEXTURE + OVRTexture.PLATFORMDATA, PlatformData.remaining());
	}
	public static void TexturePlatformData(ByteBuffer ovrgltexture, int index, long PlatformData) { PointerBuffer.put(ovrgltexture, TEXTURE + OVRTexture.PLATFORMDATA + index * POINTER_SIZE, PlatformData); }
	public static void OGLSet(ByteBuffer ovrgltexture, ByteBuffer ogl) { if ( ogl != null ) memCopy(memAddress(ogl), memAddress(ovrgltexture) + OGL, OVRGLTextureData.SIZEOF); }
	public static void OGLHeaderSet(ByteBuffer ovrgltexture, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER, OVRTextureHeader.SIZEOF); }
	public static void OGLHeaderAPI(ByteBuffer ovrgltexture, int API) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.API, API); }
	public static void OGLHeaderTextureSizeSet(ByteBuffer ovrgltexture, ByteBuffer TextureSize) { if ( TextureSize != null ) memCopy(memAddress(TextureSize), memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }
	public static void OGLHeaderTextureSizeW(ByteBuffer ovrgltexture, int w) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W, w); }
	public static void OGLHeaderTextureSizeH(ByteBuffer ovrgltexture, int h) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H, h); }
	public static void OGLTexId(ByteBuffer ovrgltexture, int TexId) { ovrgltexture.putInt(ovrgltexture.position() + OGL + OVRGLTextureData.TEXID, TexId); }

	public static void TextureGet(ByteBuffer ovrgltexture, ByteBuffer Texture) { if ( LWJGLUtil.CHECKS ) checkBuffer(Texture, OVRTexture.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE, memAddress(Texture), OVRTexture.SIZEOF); }
	public static void TextureHeaderGet(ByteBuffer ovrgltexture, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRTextureHeader.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER, memAddress(Header), OVRTextureHeader.SIZEOF); }
	public static int TextureHeaderAPI(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.API); }
	public static void TextureHeaderTextureSizeGet(ByteBuffer ovrgltexture, ByteBuffer TextureSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int TextureHeaderTextureSizeW(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int TextureHeaderTextureSizeH(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static void TexturePlatformDataGet(ByteBuffer ovrgltexture, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(PlatformData, 8 * 8);
		memCopy(memAddress(ovrgltexture) + TEXTURE + OVRTexture.PLATFORMDATA, memAddress(PlatformData), PlatformData.remaining());
	}
	public static long TexturePlatformData(ByteBuffer ovrgltexture, int index) {
		return ovrgltexture.getLong(TEXTURE + OVRTexture.PLATFORMDATA + index * 8);
	}
	public static void OGLGet(ByteBuffer ovrgltexture, ByteBuffer ogl) { if ( LWJGLUtil.CHECKS ) checkBuffer(ogl, OVRGLTextureData.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL, memAddress(ogl), OVRGLTextureData.SIZEOF); }
	public static void OGLHeaderGet(ByteBuffer ovrgltexture, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRTextureHeader.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER, memAddress(Header), OVRTextureHeader.SIZEOF); }
	public static int OGLHeaderAPI(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.API); }
	public static void OGLHeaderTextureSizeGet(ByteBuffer ovrgltexture, ByteBuffer TextureSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexture) + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int OGLHeaderTextureSizeW(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int OGLHeaderTextureSizeH(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static int OGLTexId(ByteBuffer ovrgltexture) { return ovrgltexture.getInt(ovrgltexture.position() + OGL + OVRGLTextureData.TEXID); }

}