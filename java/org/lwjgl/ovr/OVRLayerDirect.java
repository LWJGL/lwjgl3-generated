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
 * Describes a layer which is copied to the HMD as-is. Neither distortion, time warp, nor vignetting is applied to {@code ColorTexture} before it's copied
 * to the HMD. The application can, however implement these kinds of effects itself before submitting the layer. This layer can be used for
 * application-based distortion rendering and can also be used for implementing a debug HUD that's viewed on the mirror texture.
 */
public class OVRLayerDirect extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		COLORTEXTURE = offsets.get(1);
		VIEWPORT = offsets.get(2);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRLayerDirect(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRLayerDirect} instance at the specified memory address. */
	public OVRLayerDirect(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRLayerDirect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerDirect(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRLayerHeader getHeader() { return ngetHeader(address()); }
	public int getHeaderType() { return ngetHeaderType(address()); }
	public int getHeaderFlags() { return ngetHeaderFlags(address()); }
	public void getColorTexture(PointerBuffer ColorTexture) { ngetColorTexture(address(), ColorTexture); }
	public OVRSwapTextureSet getColorTexture(int index) { return ngetColorTexture(address(), index); }
	public void getViewport(ByteBuffer Viewport) { ngetViewport(address(), Viewport); }
	public OVRRecti getViewport(int index) { return ngetViewport(address(), index); }

	public OVRLayerDirect setHeader(OVRLayerHeader Header) { nsetHeader(address(), Header); return this; }
	public OVRLayerDirect setHeaderType(int Type) { nsetHeaderType(address(), Type); return this; }
	public OVRLayerDirect setHeaderFlags(int Flags) { nsetHeaderFlags(address(), Flags); return this; }
	public OVRLayerDirect setColorTexture(PointerBuffer ColorTexture) { nsetColorTexture(address(), ColorTexture); return this; }
	public OVRLayerDirect setColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetColorTexture(address(), index, ColorTexture); return this; }
	public OVRLayerDirect setViewport(ByteBuffer Viewport) { nsetViewport(address(), Viewport); return this; }
	public OVRLayerDirect setViewport(int index, OVRRecti Viewport) { nsetViewport(address(), index, Viewport); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerDirect set(
		OVRLayerHeader Header,
		PointerBuffer ColorTexture,
		ByteBuffer Viewport
	) {
		setHeader(Header);
		setColorTexture(ColorTexture);
		setViewport(Viewport);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRLayerDirect nset(long struct) {
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
	public OVRLayerDirect set(OVRLayerDirect src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRLayerDirect set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerDirect} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerDirect malloc() {
		return new OVRLayerDirect(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerDirect} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerDirect calloc() {
		return new OVRLayerDirect(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerDirect} instance allocated with {@link BufferUtils}. */
	public static OVRLayerDirect create() {
		return new OVRLayerDirect(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static OVRLayerHeader ngetHeader(long struct) { return OVRLayerHeader.malloc().nset(struct + HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRLayerHeader} struct. */
	public static OVRLayerHeader getHeader(ByteBuffer struct) { return ngetHeader(memAddress(struct)); }
	public static int ngetHeaderType(long struct) { return memGetInt(struct + HEADER + OVRLayerHeader.TYPE); }
	public static int getHeaderType(ByteBuffer struct) { return ngetHeaderType(memAddress(struct)); }
	public static int ngetHeaderFlags(long struct) { return memGetInt(struct + HEADER + OVRLayerHeader.FLAGS); }
	public static int getHeaderFlags(ByteBuffer struct) { return ngetHeaderFlags(memAddress(struct)); }
	public static void ngetColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(struct + COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void getColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { ngetColorTexture(memAddress(struct), ColorTexture); }
	public static OVRSwapTextureSet ngetColorTexture(long struct, int index) {
		return new OVRSwapTextureSet(struct + COLORTEXTURE + index * POINTER_SIZE);
	}
	public static OVRSwapTextureSet getColorTexture(ByteBuffer struct, int index) { return ngetColorTexture(memAddress(struct), index); }
	public static void ngetViewport(long struct, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(struct + VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void getViewport(ByteBuffer struct, ByteBuffer Viewport) { ngetViewport(memAddress(struct), Viewport); }
	public static OVRRecti ngetViewport(long struct, int index) {
		return OVRRecti.malloc().nset(struct + VIEWPORT + index * OVRRecti.SIZEOF);
	}
	public static OVRRecti getViewport(ByteBuffer struct, int index) { return ngetViewport(memAddress(struct), index); }

	public static void nsetHeader(long struct, OVRLayerHeader Header) { memCopy(Header.address(), struct + HEADER, OVRLayerHeader.SIZEOF); }
	/** Copies the specified {@link OVRLayerHeader} struct to the nested {@code Header} struct. */
	public static void setHeader(ByteBuffer struct, OVRLayerHeader Header) { nsetHeader(memAddress(struct), Header); }
	public static void nsetHeaderType(long struct, int Type) { memPutInt(struct + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void setHeaderType(ByteBuffer struct, int Type) { nsetHeaderType(memAddress(struct), Type); }
	public static void nsetHeaderFlags(long struct, int Flags) { memPutInt(struct + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void setHeaderFlags(ByteBuffer struct, int Flags) { nsetHeaderFlags(memAddress(struct), Flags); }
	public static void nsetColorTexture(long struct, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), struct + COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void setColorTexture(ByteBuffer struct, PointerBuffer ColorTexture) { nsetColorTexture(memAddress(struct), ColorTexture); }
	public static void nsetColorTexture(long struct, int index, OVRSwapTextureSet ColorTexture) {
		memPutAddress(struct + COLORTEXTURE + index * POINTER_SIZE, ColorTexture.address());
	}
	public static void setColorTexture(ByteBuffer struct, int index, OVRSwapTextureSet ColorTexture) { nsetColorTexture(memAddress(struct), index, ColorTexture); }
	public static void nsetViewport(long struct, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), struct + VIEWPORT, Viewport.remaining());
	}
	public static void setViewport(ByteBuffer struct, ByteBuffer Viewport) { nsetViewport(memAddress(struct), Viewport); }
	public static void nsetViewport(long struct, int index, OVRRecti Viewport) {
		memCopy(Viewport.address(), struct + VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF);
	}
	public static void setViewport(ByteBuffer struct, int index, OVRRecti Viewport) { nsetViewport(memAddress(struct), index, Viewport); }

	// -----------------------------------

	/** An array of {@link OVRLayerDirect} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerDirect, Buffer> {

		/**
		 * Creates a new {@link OVRLayerDirect.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerDirect#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerDirect newInstance(long address) {
			return new OVRLayerDirect(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public OVRLayerHeader getHeader() { return ngetHeader(address()); }
		public int getHeaderType() { return ngetHeaderType(address()); }
		public int getHeaderFlags() { return ngetHeaderFlags(address()); }
		public void getColorTexture(PointerBuffer ColorTexture) { ngetColorTexture(address(), ColorTexture); }
		public OVRSwapTextureSet getColorTexture(int index) { return ngetColorTexture(address(), index); }
		public void getViewport(ByteBuffer Viewport) { ngetViewport(address(), Viewport); }
		public OVRRecti getViewport(int index) { return ngetViewport(address(), index); }

		public OVRLayerDirect.Buffer setHeader(OVRLayerHeader Header) { nsetHeader(address(), Header); return this; }
		public OVRLayerDirect.Buffer setHeaderType(int Type) { nsetHeaderType(address(), Type); return this; }
		public OVRLayerDirect.Buffer setHeaderFlags(int Flags) { nsetHeaderFlags(address(), Flags); return this; }
		public OVRLayerDirect.Buffer setColorTexture(PointerBuffer ColorTexture) { nsetColorTexture(address(), ColorTexture); return this; }
		public OVRLayerDirect.Buffer setColorTexture(int index, OVRSwapTextureSet ColorTexture) { nsetColorTexture(address(), index, ColorTexture); return this; }
		public OVRLayerDirect.Buffer setViewport(ByteBuffer Viewport) { nsetViewport(address(), Viewport); return this; }
		public OVRLayerDirect.Buffer setViewport(int index, OVRRecti Viewport) { nsetViewport(address(), index, Viewport); return this; }

	}

}