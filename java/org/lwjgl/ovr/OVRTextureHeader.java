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

/** API-independent part of a texture descriptor. */
public final class OVRTextureHeader implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		API,
		TEXTURESIZE;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		API = offsets.get(0);
		TEXTURESIZE = offsets.get(1);

		memFree(offsets);
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

	public OVRTextureHeader setAPI(int api) { API(struct, api); return this; }
	public OVRTextureHeader setTextureSize(ByteBuffer TextureSize) { TextureSizeSet(struct, TextureSize); return this; }
	public OVRTextureHeader setTextureSizeW(int w) { TextureSizeW(struct, w); return this; }
	public OVRTextureHeader setTextureSizeH(int h) { TextureSizeH(struct, h); return this; }

	public int getAPI() { return API(struct); }
	public void getTextureSize(ByteBuffer TextureSize) { TextureSizeGet(struct, TextureSize); }
	public int getTextureSizeW() { return TextureSizeW(struct); }
	public int getTextureSizeH() { return TextureSizeH(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int API,
		ByteBuffer TextureSize
	) {
		ByteBuffer ovrtextureheader = malloc();

		API(ovrtextureheader, API);
		TextureSizeSet(ovrtextureheader, TextureSize);

		return ovrtextureheader;
	}

	public static void API(ByteBuffer ovrtextureheader, int api) { ovrtextureheader.putInt(ovrtextureheader.position() + API, api); }
	public static void TextureSizeSet(ByteBuffer ovrtextureheader, ByteBuffer TextureSize) { if ( TextureSize != null ) memCopy(memAddress(TextureSize), memAddress(ovrtextureheader) + TEXTURESIZE, OVRSizei.SIZEOF); }
	public static void TextureSizeW(ByteBuffer ovrtextureheader, int w) { ovrtextureheader.putInt(ovrtextureheader.position() + TEXTURESIZE + OVRSizei.W, w); }
	public static void TextureSizeH(ByteBuffer ovrtextureheader, int h) { ovrtextureheader.putInt(ovrtextureheader.position() + TEXTURESIZE + OVRSizei.H, h); }

	public static int API(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + API); }
	public static void TextureSizeGet(ByteBuffer ovrtextureheader, ByteBuffer TextureSize) { if ( LWJGLUtil.CHECKS ) checkBuffer(TextureSize, OVRSizei.SIZEOF); memCopy(memAddress(ovrtextureheader) + TEXTURESIZE, memAddress(TextureSize), OVRSizei.SIZEOF); }
	public static int TextureSizeW(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + TEXTURESIZE + OVRSizei.W); }
	public static int TextureSizeH(ByteBuffer ovrtextureheader) { return ovrtextureheader.getInt(ovrtextureheader.position() + TEXTURESIZE + OVRSizei.H); }

}