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
 * Describes a set of textures that act as a rendered flip chain.
 * 
 * <p>An ovrSwapTextureSet per layer is passed to {@link OVR#ovrHmd_SubmitFrame} via one of the ovrLayer types. The {@code TextureCount} refers to the flip chain
 * count and not an eye count. See the layer structs and functions for information about how to use ovrSwapTextureSet.</p>
 * 
 * <p>ovrSwapTextureSets must be created by either the ovrHmd_CreateSwapTextureSetD3D11 or {@link OVRGL#ovrHmd_CreateSwapTextureSetGL} factory function, and must
 * be destroyed by {@link OVR#ovrHmd_DestroySwapTextureSet}.</p>
 */
public final class OVRSwapTextureSet implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TEXTURES,
		TEXTURECOUNT,
		CURRENTINDEX;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		TEXTURES = offsets.get(0);
		TEXTURECOUNT = offsets.get(1);
		CURRENTINDEX = offsets.get(2);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRSwapTextureSet() {
		this(malloc());
	}

	public OVRSwapTextureSet(ByteBuffer struct) {
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

	public OVRSwapTextureSet setTextures(long Textures) { Textures(struct, Textures); return this; }
	public OVRSwapTextureSet setTextures(ByteBuffer Textures) { Textures(struct, Textures); return this; }
	public OVRSwapTextureSet setTextureCount(int TextureCount) { TextureCount(struct, TextureCount); return this; }
	public OVRSwapTextureSet setCurrentIndex(int CurrentIndex) { CurrentIndex(struct, CurrentIndex); return this; }

	public long getTextures() { return Textures(struct); }
	public ByteBuffer getTexturesBuffer() { return TexturesBuffer(struct); }
	public int getTextureCount() { return TextureCount(struct); }
	public int getCurrentIndex() { return CurrentIndex(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Textures,
		int TextureCount,
		int CurrentIndex
	) {
		ByteBuffer ovrswaptextureset = malloc();

		Textures(ovrswaptextureset, Textures);
		TextureCount(ovrswaptextureset, TextureCount);
		CurrentIndex(ovrswaptextureset, CurrentIndex);

		return ovrswaptextureset;
	}

	public static void Textures(ByteBuffer ovrswaptextureset, long Textures) { PointerBuffer.put(ovrswaptextureset, ovrswaptextureset.position() + TEXTURES, Textures); }
	public static void Textures(ByteBuffer ovrswaptextureset, ByteBuffer Textures) { Textures(ovrswaptextureset, memAddressSafe(Textures)); }
	public static void TextureCount(ByteBuffer ovrswaptextureset, int TextureCount) { ovrswaptextureset.putInt(ovrswaptextureset.position() + TEXTURECOUNT, TextureCount); }
	public static void CurrentIndex(ByteBuffer ovrswaptextureset, int CurrentIndex) { ovrswaptextureset.putInt(ovrswaptextureset.position() + CURRENTINDEX, CurrentIndex); }

	public static long Textures(ByteBuffer ovrswaptextureset) { return PointerBuffer.get(ovrswaptextureset, ovrswaptextureset.position() + TEXTURES); }
	public static ByteBuffer TexturesBuffer(ByteBuffer ovrswaptextureset) { return memByteBuffer(Textures(ovrswaptextureset), OVRTexture.SIZEOF); }
	public static int TextureCount(ByteBuffer ovrswaptextureset) { return ovrswaptextureset.getInt(ovrswaptextureset.position() + TEXTURECOUNT); }
	public static int CurrentIndex(ByteBuffer ovrswaptextureset) { return ovrswaptextureset.getInt(ovrswaptextureset.position() + CURRENTINDEX); }

}