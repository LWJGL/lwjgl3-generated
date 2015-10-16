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

/** API-independent part of a texture descriptor. */
public class OVRTextureHeader extends Struct {

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

	private static native int offsets(long buffer);

	OVRTextureHeader(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRTextureHeader} instance at the specified memory address. */
	public OVRTextureHeader(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRTextureHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTextureHeader(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getAPI() { return ngetAPI(address()); }
	public OVRSizei getTextureSize() { return ngetTextureSize(address()); }
	public int getTextureSizeW() { return ngetTextureSizeW(address()); }
	public int getTextureSizeH() { return ngetTextureSizeH(address()); }

	public OVRTextureHeader setAPI(int api) { nsetAPI(address(), api); return this; }
	public OVRTextureHeader setTextureSize(OVRSizei TextureSize) { nsetTextureSize(address(), TextureSize); return this; }
	public OVRTextureHeader setTextureSizeW(int w) { nsetTextureSizeW(address(), w); return this; }
	public OVRTextureHeader setTextureSizeH(int h) { nsetTextureSizeH(address(), h); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTextureHeader set(
		int API,
		OVRSizei TextureSize
	) {
		setAPI(API);
		setTextureSize(TextureSize);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRTextureHeader nset(long struct) {
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
	public OVRTextureHeader set(OVRTextureHeader src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRTextureHeader set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRTextureHeader malloc() {
		return new OVRTextureHeader(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRTextureHeader calloc() {
		return new OVRTextureHeader(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTextureHeader} instance allocated with {@link BufferUtils}. */
	public static OVRTextureHeader create() {
		return new OVRTextureHeader(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTextureHeader.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRTextureHeader.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static int ngetAPI(long struct) { return memGetInt(struct + API); }
	public static int getAPI(ByteBuffer struct) { return ngetAPI(memAddress(struct)); }
	public static OVRSizei ngetTextureSize(long struct) { return OVRSizei.malloc().nset(struct + TEXTURESIZE); }
	/** Returns a copy of the {@code TextureSize} {@link OVRSizei} struct. */
	public static OVRSizei getTextureSize(ByteBuffer struct) { return ngetTextureSize(memAddress(struct)); }
	public static int ngetTextureSizeW(long struct) { return memGetInt(struct + TEXTURESIZE + OVRSizei.W); }
	public static int getTextureSizeW(ByteBuffer struct) { return ngetTextureSizeW(memAddress(struct)); }
	public static int ngetTextureSizeH(long struct) { return memGetInt(struct + TEXTURESIZE + OVRSizei.H); }
	public static int getTextureSizeH(ByteBuffer struct) { return ngetTextureSizeH(memAddress(struct)); }

	public static void nsetAPI(long struct, int api) { memPutInt(struct + API, api); }
	public static void setAPI(ByteBuffer struct, int api) { nsetAPI(memAddress(struct), api); }
	public static void nsetTextureSize(long struct, OVRSizei TextureSize) { memCopy(TextureSize.address(), struct + TEXTURESIZE, OVRSizei.SIZEOF); }
	/** Copies the specified {@link OVRSizei} struct to the nested {@code TextureSize} struct. */
	public static void setTextureSize(ByteBuffer struct, OVRSizei TextureSize) { nsetTextureSize(memAddress(struct), TextureSize); }
	public static void nsetTextureSizeW(long struct, int w) { memPutInt(struct + TEXTURESIZE + OVRSizei.W, w); }
	public static void setTextureSizeW(ByteBuffer struct, int w) { nsetTextureSizeW(memAddress(struct), w); }
	public static void nsetTextureSizeH(long struct, int h) { memPutInt(struct + TEXTURESIZE + OVRSizei.H, h); }
	public static void setTextureSizeH(ByteBuffer struct, int h) { nsetTextureSizeH(memAddress(struct), h); }

	// -----------------------------------

	/** An array of {@link OVRTextureHeader} structs. */
	public static final class Buffer extends StructBuffer<OVRTextureHeader, Buffer> {

		/**
		 * Creates a new {@link OVRTextureHeader.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTextureHeader#SIZEOF}, and its mark will be undefined.
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
		protected OVRTextureHeader newInstance(long address) {
			return new OVRTextureHeader(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getAPI() { return ngetAPI(address()); }
		public OVRSizei getTextureSize() { return ngetTextureSize(address()); }
		public int getTextureSizeW() { return ngetTextureSizeW(address()); }
		public int getTextureSizeH() { return ngetTextureSizeH(address()); }

		public OVRTextureHeader.Buffer setAPI(int api) { nsetAPI(address(), api); return this; }
		public OVRTextureHeader.Buffer setTextureSize(OVRSizei TextureSize) { nsetTextureSize(address(), TextureSize); return this; }
		public OVRTextureHeader.Buffer setTextureSizeW(int w) { nsetTextureSizeW(address(), w); return this; }
		public OVRTextureHeader.Buffer setTextureSizeH(int h) { nsetTextureSizeH(address(), h); return this; }

	}

}