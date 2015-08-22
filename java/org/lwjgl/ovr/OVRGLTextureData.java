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

/** OpenGL texture data. */
public final class OVRGLTextureData implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		TEXID;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		TEXID = offsets.get(1);

		memFree(offsets);
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

	public OVRGLTextureData setHeader(ByteBuffer Header) { HeaderSet(struct, Header); return this; }
	public OVRGLTextureData setHeaderAPI(int API) { HeaderAPI(struct, API); return this; }
	public OVRGLTextureData setHeaderTextureSize(ByteBuffer TextureSize) { HeaderTextureSizeSet(struct, TextureSize); return this; }
	public OVRGLTextureData setHeaderTextureSizeW(int w) { HeaderTextureSizeW(struct, w); return this; }
	public OVRGLTextureData setHeaderTextureSizeH(int h) { HeaderTextureSizeH(struct, h); return this; }
	public OVRGLTextureData setTexId(int TexId) { TexId(struct, TexId); return this; }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderAPI() { return HeaderAPI(struct); }
	public void getHeaderTextureSize(ByteBuffer TextureSize) { HeaderTextureSizeGet(struct, TextureSize); }
	public int getHeaderTextureSizeW() { return HeaderTextureSizeW(struct); }
	public int getHeaderTextureSizeH() { return HeaderTextureSizeH(struct); }
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
	public static void TexId(ByteBuffer ovrgltexturedata, int TexId) { ovrgltexturedata.putInt(ovrgltexturedata.position() + TEXID, TexId); }

	public static void HeaderGet(ByteBuffer ovrgltexturedata, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRTextureHeader.SIZEOF); memCopy(memAddress(ovrgltexturedata) + HEADER, memAddress(Header), OVRTextureHeader.SIZEOF); }
	public static int HeaderAPI(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.API); }
	public static void HeaderTextureSizeGet(ByteBuffer ovrgltexturedata, ByteBuffer TextureSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrgltexturedata) + HEADER + OVRTextureHeader.TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int HeaderTextureSizeW(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int HeaderTextureSizeH(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static int TexId(ByteBuffer ovrgltexturedata) { return ovrgltexturedata.getInt(ovrgltexturedata.position() + TEXID); }

}