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

/** Contains OpenGL-specific texture information. */
public final class OVRGLTexture extends Struct {

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

	private static native int offsets(long buffer);

	OVRGLTexture(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRGLTexture} instance at the specified memory address. */
	public OVRGLTexture(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRGLTexture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRGLTexture(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRTexture getTexture() { return ngetTexture(address()); }
	public OVRTextureHeader getTextureHeader() { return ngetTextureHeader(address()); }
	public int getTextureHeaderAPI() { return ngetTextureHeaderAPI(address()); }
	public OVRSizei getTextureHeaderTextureSize() { return ngetTextureHeaderTextureSize(address()); }
	public int getTextureHeaderTextureSizeW() { return ngetTextureHeaderTextureSizeW(address()); }
	public int getTextureHeaderTextureSizeH() { return ngetTextureHeaderTextureSizeH(address()); }
	public void getTexturePlatformData(ByteBuffer PlatformData) { ngetTexturePlatformData(address(), PlatformData); }
	public OVRGLTextureData getOGL() { return ngetOGL(address()); }
	public OVRTextureHeader getOGLHeader() { return ngetOGLHeader(address()); }
	public int getOGLHeaderAPI() { return ngetOGLHeaderAPI(address()); }
	public OVRSizei getOGLHeaderTextureSize() { return ngetOGLHeaderTextureSize(address()); }
	public int getOGLHeaderTextureSizeW() { return ngetOGLHeaderTextureSizeW(address()); }
	public int getOGLHeaderTextureSizeH() { return ngetOGLHeaderTextureSizeH(address()); }
	public int getOGLTexId() { return ngetOGLTexId(address()); }

	public OVRGLTexture setTexture(OVRTexture Texture) { nsetTexture(address(), Texture); return this; }
	public OVRGLTexture setTextureHeader(OVRTextureHeader Header) { nsetTextureHeader(address(), Header); return this; }
	public OVRGLTexture setTextureHeaderAPI(int API) { nsetTextureHeaderAPI(address(), API); return this; }
	public OVRGLTexture setTextureHeaderTextureSize(OVRSizei TextureSize) { nsetTextureHeaderTextureSize(address(), TextureSize); return this; }
	public OVRGLTexture setTextureHeaderTextureSizeW(int w) { nsetTextureHeaderTextureSizeW(address(), w); return this; }
	public OVRGLTexture setTextureHeaderTextureSizeH(int h) { nsetTextureHeaderTextureSizeH(address(), h); return this; }
	public OVRGLTexture setTexturePlatformData(ByteBuffer PlatformData) { nsetTexturePlatformData(address(), PlatformData); return this; }
	public OVRGLTexture setTexturePlatformData(int index, long PlatformData) { nsetTexturePlatformData(address(), index, PlatformData); return this; }
	public OVRGLTexture setOGL(OVRGLTextureData ogl) { nsetOGL(address(), ogl); return this; }
	public OVRGLTexture setOGLHeader(OVRTextureHeader Header) { nsetOGLHeader(address(), Header); return this; }
	public OVRGLTexture setOGLHeaderAPI(int API) { nsetOGLHeaderAPI(address(), API); return this; }
	public OVRGLTexture setOGLHeaderTextureSize(OVRSizei TextureSize) { nsetOGLHeaderTextureSize(address(), TextureSize); return this; }
	public OVRGLTexture setOGLHeaderTextureSizeW(int w) { nsetOGLHeaderTextureSizeW(address(), w); return this; }
	public OVRGLTexture setOGLHeaderTextureSizeH(int h) { nsetOGLHeaderTextureSizeH(address(), h); return this; }
	public OVRGLTexture setOGLTexId(int TexId) { nsetOGLTexId(address(), TexId); return this; }

	/** Initializes this struct with the specified values. */
	public OVRGLTexture set(
		OVRTexture Texture,
		OVRGLTextureData OGL
	) {
		setTexture(Texture);
		setOGL(OGL);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRGLTexture nset(long struct) {
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
	public OVRGLTexture set(OVRGLTexture src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRGLTexture set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRGLTexture malloc() {
		return new OVRGLTexture(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRGLTexture calloc() {
		return new OVRGLTexture(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRGLTexture} instance allocated with {@link BufferUtils}. */
	public static OVRGLTexture create() {
		return new OVRGLTexture(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRGLTexture.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static OVRTexture ngetTexture(long struct) { return OVRTexture.malloc().nset(struct + TEXTURE); }
	/** Returns a copy of the {@code Texture} {@link OVRTexture} struct. */
	public static OVRTexture getTexture(ByteBuffer struct) { return ngetTexture(memAddress(struct)); }
	public static OVRTextureHeader ngetTextureHeader(long struct) { return OVRTextureHeader.malloc().nset(struct + TEXTURE + OVRTexture.HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRTextureHeader} struct. */
	public static OVRTextureHeader getTextureHeader(ByteBuffer struct) { return ngetTextureHeader(memAddress(struct)); }
	public static int ngetTextureHeaderAPI(long struct) { return memGetInt(struct + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.API); }
	public static int getTextureHeaderAPI(ByteBuffer struct) { return ngetTextureHeaderAPI(memAddress(struct)); }
	public static OVRSizei ngetTextureHeaderTextureSize(long struct) { return OVRSizei.malloc().nset(struct + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE); }
	/** Returns a copy of the {@code TextureSize} {@link OVRSizei} struct. */
	public static OVRSizei getTextureHeaderTextureSize(ByteBuffer struct) { return ngetTextureHeaderTextureSize(memAddress(struct)); }
	public static int ngetTextureHeaderTextureSizeW(long struct) { return memGetInt(struct + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int getTextureHeaderTextureSizeW(ByteBuffer struct) { return ngetTextureHeaderTextureSizeW(memAddress(struct)); }
	public static int ngetTextureHeaderTextureSizeH(long struct) { return memGetInt(struct + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static int getTextureHeaderTextureSizeH(ByteBuffer struct) { return ngetTextureHeaderTextureSizeH(memAddress(struct)); }
	public static void ngetTexturePlatformData(long struct, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(PlatformData, 8 * 8);
		memCopy(struct + TEXTURE + OVRTexture.PLATFORMDATA, memAddress(PlatformData), PlatformData.remaining());
	}
	public static void getTexturePlatformData(ByteBuffer struct, ByteBuffer PlatformData) { ngetTexturePlatformData(memAddress(struct), PlatformData); }
	public static long ngetTexturePlatformData(long struct, int index) { return memGetAddress(struct + TEXTURE + OVRTexture.PLATFORMDATA + index * 8); }
	public static long getTexturePlatformData(ByteBuffer struct, int index) { return ngetTexturePlatformData(memAddress(struct), index); }
	public static OVRGLTextureData ngetOGL(long struct) { return OVRGLTextureData.malloc().nset(struct + OGL); }
	/** Returns a copy of the {@code ogl} {@link OVRGLTextureData} struct. */
	public static OVRGLTextureData getOGL(ByteBuffer struct) { return ngetOGL(memAddress(struct)); }
	public static OVRTextureHeader ngetOGLHeader(long struct) { return OVRTextureHeader.malloc().nset(struct + OGL + OVRGLTextureData.HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRTextureHeader} struct. */
	public static OVRTextureHeader getOGLHeader(ByteBuffer struct) { return ngetOGLHeader(memAddress(struct)); }
	public static int ngetOGLHeaderAPI(long struct) { return memGetInt(struct + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.API); }
	public static int getOGLHeaderAPI(ByteBuffer struct) { return ngetOGLHeaderAPI(memAddress(struct)); }
	public static OVRSizei ngetOGLHeaderTextureSize(long struct) { return OVRSizei.malloc().nset(struct + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE); }
	/** Returns a copy of the {@code TextureSize} {@link OVRSizei} struct. */
	public static OVRSizei getOGLHeaderTextureSize(ByteBuffer struct) { return ngetOGLHeaderTextureSize(memAddress(struct)); }
	public static int ngetOGLHeaderTextureSizeW(long struct) { return memGetInt(struct + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W); }
	public static int getOGLHeaderTextureSizeW(ByteBuffer struct) { return ngetOGLHeaderTextureSizeW(memAddress(struct)); }
	public static int ngetOGLHeaderTextureSizeH(long struct) { return memGetInt(struct + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H); }
	public static int getOGLHeaderTextureSizeH(ByteBuffer struct) { return ngetOGLHeaderTextureSizeH(memAddress(struct)); }
	public static int ngetOGLTexId(long struct) { return memGetInt(struct + OGL + OVRGLTextureData.TEXID); }
	public static int getOGLTexId(ByteBuffer struct) { return ngetOGLTexId(memAddress(struct)); }

	public static void nsetTexture(long struct, OVRTexture Texture) { memCopy(Texture.address(), struct + TEXTURE, OVRTexture.SIZEOF); }
	/** Copies the specified {@link OVRTexture} struct to the nested {@code Texture} struct. */
	public static void setTexture(ByteBuffer struct, OVRTexture Texture) { nsetTexture(memAddress(struct), Texture); }
	public static void nsetTextureHeader(long struct, OVRTextureHeader Header) { memCopy(Header.address(), struct + TEXTURE + OVRTexture.HEADER, OVRTextureHeader.SIZEOF); }
	/** Copies the specified {@link OVRTextureHeader} struct to the nested {@code Header} struct. */
	public static void setTextureHeader(ByteBuffer struct, OVRTextureHeader Header) { nsetTextureHeader(memAddress(struct), Header); }
	public static void nsetTextureHeaderAPI(long struct, int API) { memPutInt(struct + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.API, API); }
	public static void setTextureHeaderAPI(ByteBuffer struct, int API) { nsetTextureHeaderAPI(memAddress(struct), API); }
	public static void nsetTextureHeaderTextureSize(long struct, OVRSizei TextureSize) { memCopy(TextureSize.address(), struct + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }
	/** Copies the specified {@link OVRSizei} struct to the nested {@code TextureSize} struct. */
	public static void setTextureHeaderTextureSize(ByteBuffer struct, OVRSizei TextureSize) { nsetTextureHeaderTextureSize(memAddress(struct), TextureSize); }
	public static void nsetTextureHeaderTextureSizeW(long struct, int w) { memPutInt(struct + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W, w); }
	public static void setTextureHeaderTextureSizeW(ByteBuffer struct, int w) { nsetTextureHeaderTextureSizeW(memAddress(struct), w); }
	public static void nsetTextureHeaderTextureSizeH(long struct, int h) { memPutInt(struct + TEXTURE + OVRTexture.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H, h); }
	public static void setTextureHeaderTextureSizeH(ByteBuffer struct, int h) { nsetTextureHeaderTextureSizeH(memAddress(struct), h); }
	public static void nsetTexturePlatformData(long struct, ByteBuffer PlatformData) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(PlatformData, 8 * POINTER_SIZE);
		}
		memCopy(memAddress(PlatformData), struct + TEXTURE + OVRTexture.PLATFORMDATA, PlatformData.remaining());
	}
	public static void setTexturePlatformData(ByteBuffer struct, ByteBuffer PlatformData) { nsetTexturePlatformData(memAddress(struct), PlatformData); }
	public static void nsetTexturePlatformData(long struct, int index, long PlatformData) { memPutAddress(struct + TEXTURE + OVRTexture.PLATFORMDATA + index * POINTER_SIZE, PlatformData); }
	public static void setTexturePlatformData(ByteBuffer struct, int index, long PlatformData) { nsetTexturePlatformData(memAddress(struct), index, PlatformData); }
	public static void nsetOGL(long struct, OVRGLTextureData ogl) { memCopy(ogl.address(), struct + OGL, OVRGLTextureData.SIZEOF); }
	/** Copies the specified {@link OVRGLTextureData} struct to the nested {@code ogl} struct. */
	public static void setOGL(ByteBuffer struct, OVRGLTextureData ogl) { nsetOGL(memAddress(struct), ogl); }
	public static void nsetOGLHeader(long struct, OVRTextureHeader Header) { memCopy(Header.address(), struct + OGL + OVRGLTextureData.HEADER, OVRTextureHeader.SIZEOF); }
	/** Copies the specified {@link OVRTextureHeader} struct to the nested {@code Header} struct. */
	public static void setOGLHeader(ByteBuffer struct, OVRTextureHeader Header) { nsetOGLHeader(memAddress(struct), Header); }
	public static void nsetOGLHeaderAPI(long struct, int API) { memPutInt(struct + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.API, API); }
	public static void setOGLHeaderAPI(ByteBuffer struct, int API) { nsetOGLHeaderAPI(memAddress(struct), API); }
	public static void nsetOGLHeaderTextureSize(long struct, OVRSizei TextureSize) { memCopy(TextureSize.address(), struct + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE, OVRSizei.SIZEOF); }
	/** Copies the specified {@link OVRSizei} struct to the nested {@code TextureSize} struct. */
	public static void setOGLHeaderTextureSize(ByteBuffer struct, OVRSizei TextureSize) { nsetOGLHeaderTextureSize(memAddress(struct), TextureSize); }
	public static void nsetOGLHeaderTextureSizeW(long struct, int w) { memPutInt(struct + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.W, w); }
	public static void setOGLHeaderTextureSizeW(ByteBuffer struct, int w) { nsetOGLHeaderTextureSizeW(memAddress(struct), w); }
	public static void nsetOGLHeaderTextureSizeH(long struct, int h) { memPutInt(struct + OGL + OVRGLTextureData.HEADER + OVRTextureHeader.TEXTURESIZE + OVRSizei.H, h); }
	public static void setOGLHeaderTextureSizeH(ByteBuffer struct, int h) { nsetOGLHeaderTextureSizeH(memAddress(struct), h); }
	public static void nsetOGLTexId(long struct, int TexId) { memPutInt(struct + OGL + OVRGLTextureData.TEXID, TexId); }
	public static void setOGLTexId(ByteBuffer struct, int TexId) { nsetOGLTexId(memAddress(struct), TexId); }

	// -----------------------------------

	/** An array of {@link OVRGLTexture} structs. */
	public static final class Buffer extends StructBuffer<OVRGLTexture, Buffer> {

		/**
		 * Creates a new {@link OVRGLTexture.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRGLTexture#SIZEOF}, and its mark will be undefined.
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
		protected OVRGLTexture newInstance(long address) {
			return new OVRGLTexture(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}