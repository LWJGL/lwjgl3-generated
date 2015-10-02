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

/** OpenGL texture data. */
public class OVRGLTextureData extends Struct {

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

	private static native int offsets(long buffer);

	OVRGLTextureData(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRGLTextureData} instance at the specified memory address. */
	public OVRGLTextureData(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRGLTextureData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRGLTextureData(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRTextureHeader getHeader() { return ngetHeader(address()); }
	public int getHeaderAPI() { return ngetHeaderAPI(address()); }
	public OVRSizei getHeaderTextureSize() { return ngetHeaderTextureSize(address()); }
	public int getHeaderTextureSizeW() { return ngetHeaderTextureSizeW(address()); }
	public int getHeaderTextureSizeH() { return ngetHeaderTextureSizeH(address()); }
	public int getTexId() { return ngetTexId(address()); }

	public OVRGLTextureData setHeader(OVRTextureHeader Header) { nsetHeader(address(), Header); return this; }
	public OVRGLTextureData setHeaderAPI(int API) { nsetHeaderAPI(address(), API); return this; }
	public OVRGLTextureData setHeaderTextureSize(OVRSizei TextureSize) { nsetHeaderTextureSize(address(), TextureSize); return this; }
	public OVRGLTextureData setHeaderTextureSizeW(int w) { nsetHeaderTextureSizeW(address(), w); return this; }
	public OVRGLTextureData setHeaderTextureSizeH(int h) { nsetHeaderTextureSizeH(address(), h); return this; }
	public OVRGLTextureData setTexId(int TexId) { nsetTexId(address(), TexId); return this; }

	/** Initializes this struct with the specified values. */
	public OVRGLTextureData set(
		OVRTextureHeader Header,
		int TexId
	) {
		setHeader(Header);
		setTexId(TexId);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRGLTextureData nset(long struct) {
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
	public OVRGLTextureData set(OVRGLTextureData src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRGLTextureData set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRGLTextureData} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRGLTextureData malloc() {
		return new OVRGLTextureData(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRGLTextureData} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRGLTextureData calloc() {
		return new OVRGLTextureData(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRGLTextureData} instance allocated with {@link BufferUtils}. */
	public static OVRGLTextureData create() {
		return new OVRGLTextureData(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTextureData.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTextureData.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTextureData.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static OVRTextureHeader ngetHeader(long struct) { return OVRTextureHeader.malloc().nset(struct + HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRTextureHeader} struct. */
	public static OVRTextureHeader getHeader(ByteBuffer struct) { return ngetHeader(memAddress(struct)); }
	public static int ngetHeaderAPI(long struct) { return memGetInt(struct + HEADER + OVRTextureHeader.API); }
	public static int getHeaderAPI(ByteBuffer struct) { return ngetHeaderAPI(memAddress(struct)); }
	public static OVRSizei ngetHeaderTextureSize(long struct) { return OVRSizei.malloc().nset(struct + HEADER + OVRTextureHeader.TEXTURESIZE); }
	/** Returns a copy of the {@code TextureSize} {@link OVRSizei} struct. */
	public static OVRSizei getHeaderTextureSize(ByteBuffer struct) { return ngetHeaderTextureSize(memAddress(struct)); }
	public static int ngetHeaderTextureSizeW(long struct) { return memGetInt(struct + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int getHeaderTextureSizeW(ByteBuffer struct) { return ngetHeaderTextureSizeW(memAddress(struct)); }
	public static int ngetHeaderTextureSizeH(long struct) { return memGetInt(struct + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static int getHeaderTextureSizeH(ByteBuffer struct) { return ngetHeaderTextureSizeH(memAddress(struct)); }
	public static int ngetTexId(long struct) { return memGetInt(struct + TEXID); }
	public static int getTexId(ByteBuffer struct) { return ngetTexId(memAddress(struct)); }

	public static void nsetHeader(long struct, OVRTextureHeader Header) { memCopy(Header.address(), struct + HEADER, OVRTextureHeader.SIZEOF); }
	/** Copies the specified {@link OVRTextureHeader} struct to the nested {@code Header} struct. */
	public static void setHeader(ByteBuffer struct, OVRTextureHeader Header) { nsetHeader(memAddress(struct), Header); }
	public static void nsetHeaderAPI(long struct, int API) { memPutInt(struct + HEADER + OVRTextureHeader.API, API); }
	public static void setHeaderAPI(ByteBuffer struct, int API) { nsetHeaderAPI(memAddress(struct), API); }
	public static void nsetHeaderTextureSize(long struct, OVRSizei TextureSize) { memCopy(TextureSize.address(), struct + HEADER + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }
	/** Copies the specified {@link OVRSizei} struct to the nested {@code TextureSize} struct. */
	public static void setHeaderTextureSize(ByteBuffer struct, OVRSizei TextureSize) { nsetHeaderTextureSize(memAddress(struct), TextureSize); }
	public static void nsetHeaderTextureSizeW(long struct, int w) { memPutInt(struct + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W, w); }
	public static void setHeaderTextureSizeW(ByteBuffer struct, int w) { nsetHeaderTextureSizeW(memAddress(struct), w); }
	public static void nsetHeaderTextureSizeH(long struct, int h) { memPutInt(struct + HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H, h); }
	public static void setHeaderTextureSizeH(ByteBuffer struct, int h) { nsetHeaderTextureSizeH(memAddress(struct), h); }
	public static void nsetTexId(long struct, int TexId) { memPutInt(struct + TEXID, TexId); }
	public static void setTexId(ByteBuffer struct, int TexId) { nsetTexId(memAddress(struct), TexId); }

	// -----------------------------------

	/** An array of {@link OVRGLTextureData} structs. */
	public static final class Buffer extends StructBuffer<OVRGLTextureData, Buffer> {

		/**
		 * Creates a new {@link OVRGLTextureData.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRGLTextureData#SIZEOF}, and its mark will be undefined.
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
		protected OVRGLTextureData newInstance(long address) {
			return new OVRGLTextureData(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public OVRTextureHeader getHeader() { return ngetHeader(address()); }
		public int getHeaderAPI() { return ngetHeaderAPI(address()); }
		public OVRSizei getHeaderTextureSize() { return ngetHeaderTextureSize(address()); }
		public int getHeaderTextureSizeW() { return ngetHeaderTextureSizeW(address()); }
		public int getHeaderTextureSizeH() { return ngetHeaderTextureSizeH(address()); }
		public int getTexId() { return ngetTexId(address()); }

		public OVRGLTextureData.Buffer setHeader(OVRTextureHeader Header) { nsetHeader(address(), Header); return this; }
		public OVRGLTextureData.Buffer setHeaderAPI(int API) { nsetHeaderAPI(address(), API); return this; }
		public OVRGLTextureData.Buffer setHeaderTextureSize(OVRSizei TextureSize) { nsetHeaderTextureSize(address(), TextureSize); return this; }
		public OVRGLTextureData.Buffer setHeaderTextureSizeW(int w) { nsetHeaderTextureSizeW(address(), w); return this; }
		public OVRGLTextureData.Buffer setHeaderTextureSizeH(int h) { nsetHeaderTextureSizeH(address(), h); return this; }
		public OVRGLTextureData.Buffer setTexId(int TexId) { nsetTexId(address(), TexId); return this; }

	}

}