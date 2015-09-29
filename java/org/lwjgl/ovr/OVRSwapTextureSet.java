/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

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
public final class OVRSwapTextureSet extends Struct {

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

	private static native int offsets(long buffer);

	OVRSwapTextureSet(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRSwapTextureSet} instance at the specified memory address. */
	public OVRSwapTextureSet(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRSwapTextureSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSwapTextureSet(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRTexture getTextures() { return ngetTexturesStruct(address()); }
	public int getTextureCount() { return ngetTextureCount(address()); }
	public int getCurrentIndex() { return ngetCurrentIndex(address()); }

	public OVRSwapTextureSet setTextures(OVRTexture Textures) { nsetTextures(address(), Textures); return this; }
	public OVRSwapTextureSet setTextureCount(int TextureCount) { nsetTextureCount(address(), TextureCount); return this; }
	public OVRSwapTextureSet setCurrentIndex(int CurrentIndex) { nsetCurrentIndex(address(), CurrentIndex); return this; }

	/** Initializes this struct with the specified values. */
	public OVRSwapTextureSet set(
		OVRTexture Textures,
		int TextureCount,
		int CurrentIndex
	) {
		setTextures(Textures);
		setTextureCount(TextureCount);
		setCurrentIndex(CurrentIndex);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRSwapTextureSet nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public OVRSwapTextureSet set(OVRSwapTextureSet src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRSwapTextureSet set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRSwapTextureSet} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRSwapTextureSet malloc() {
		return new OVRSwapTextureSet(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSwapTextureSet} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRSwapTextureSet calloc() {
		return new OVRSwapTextureSet(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSwapTextureSet} instance allocated with {@link BufferUtils}. */
	public static OVRSwapTextureSet create() {
		return new OVRSwapTextureSet(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSwapTextureSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSwapTextureSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSwapTextureSet.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetTextures(long struct) { return memGetAddress(struct + TEXTURES); }
	public static OVRTexture ngetTexturesStruct(long struct) { return new OVRTexture(ngetTextures(struct)); }
	public static OVRTexture getTextures(ByteBuffer struct) { return ngetTexturesStruct(memAddress(struct)); }
	public static int ngetTextureCount(long struct) { return memGetInt(struct + TEXTURECOUNT); }
	public static int getTextureCount(ByteBuffer struct) { return ngetTextureCount(memAddress(struct)); }
	public static int ngetCurrentIndex(long struct) { return memGetInt(struct + CURRENTINDEX); }
	public static int getCurrentIndex(ByteBuffer struct) { return ngetCurrentIndex(memAddress(struct)); }

	public static void nsetTextures(long struct, long Textures) { memPutAddress(struct + TEXTURES, Textures); }
	public static void nsetTextures(long struct, OVRTexture Textures) { nsetTextures(struct, Textures.address()); }
	public static void setTextures(ByteBuffer struct, OVRTexture Textures) { nsetTextures(memAddress(struct), Textures); }
	public static void nsetTextureCount(long struct, int TextureCount) { memPutInt(struct + TEXTURECOUNT, TextureCount); }
	public static void setTextureCount(ByteBuffer struct, int TextureCount) { nsetTextureCount(memAddress(struct), TextureCount); }
	public static void nsetCurrentIndex(long struct, int CurrentIndex) { memPutInt(struct + CURRENTINDEX, CurrentIndex); }
	public static void setCurrentIndex(ByteBuffer struct, int CurrentIndex) { nsetCurrentIndex(memAddress(struct), CurrentIndex); }

	// -----------------------------------

	/** An array of {@link OVRSwapTextureSet} structs. */
	public static final class Buffer extends StructBuffer<OVRSwapTextureSet, Buffer> {

		/**
		 * Creates a new {@link OVRSwapTextureSet.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRSwapTextureSet#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVRSwapTextureSet newInstance(long address) {
			return new OVRSwapTextureSet(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}