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
 * Describes a layer which is copied to the HMD as-is. Neither distortion, time warp, nor vignetting is applied to {@code ColorTexture} before it's copied
 * to the HMD. The application can, however implement these kinds of effects itself before submitting the layer. This layer can be used for
 * application-based distortion rendering and can also be used for implementing a debug HUD that's viewed on the mirror texture.
 */
public final class OVRLayerDirect implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		COLORTEXTURE = offsets.get(1);
		VIEWPORT = offsets.get(2);
	}

	private final ByteBuffer struct;

	public OVRLayerDirect() {
		this(malloc());
	}

	public OVRLayerDirect(ByteBuffer struct) {
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

	public void setHeader(ByteBuffer Header) { HeaderSet(struct, Header); }
	public void setHeaderType(int Type) { HeaderType(struct, Type); }
	public void setHeaderFlags(int Flags) { HeaderFlags(struct, Flags); }
	public void setColorTexture(ByteBuffer ColorTexture) { ColorTextureSet(struct, ColorTexture); }
	public void setColorTexture(ByteBuffer ColorTexture, int index) { ColorTextureSet(struct, ColorTexture, index); }
	public void setViewport(ByteBuffer Viewport) { ViewportSet(struct, Viewport); }
	public void setViewport(ByteBuffer Viewport, int index) { ViewportSet(struct, Viewport, index); }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderType() { return HeaderType(struct); }
	public int getHeaderFlags() { return HeaderFlags(struct); }
	public void getColorTexture(ByteBuffer ColorTexture) { ColorTextureGet(struct, ColorTexture); }
	public void getColorTexture(ByteBuffer ColorTexture, int index) { ColorTextureGet(struct, ColorTexture, index); }
	public void getViewport(ByteBuffer Viewport) { ViewportGet(struct, Viewport); }
	public void getViewport(ByteBuffer Viewport, int index) { ViewportGet(struct, Viewport, index); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Header,
		ByteBuffer ColorTexture,
		ByteBuffer Viewport
	) {
		ByteBuffer ovrlayerdirect = malloc();

		HeaderSet(ovrlayerdirect, Header);
		ColorTextureSet(ovrlayerdirect, ColorTexture);
		ViewportSet(ovrlayerdirect, Viewport);

		return ovrlayerdirect;
	}

	public static void HeaderSet(ByteBuffer ovrlayerdirect, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayerdirect) + HEADER, OVRLayerHeader.SIZEOF); }
	public static void HeaderType(ByteBuffer ovrlayerdirect, int Type) { ovrlayerdirect.putInt(ovrlayerdirect.position() + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void HeaderFlags(ByteBuffer ovrlayerdirect, int Flags) { ovrlayerdirect.putInt(ovrlayerdirect.position() + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void ColorTextureSet(ByteBuffer ovrlayerdirect, ByteBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2 * OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayerdirect) + COLORTEXTURE, ColorTexture.remaining());
	}
	public static void ColorTextureSet(ByteBuffer ovrlayerdirect, ByteBuffer ColorTexture, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayerdirect) + COLORTEXTURE + index * OVRSwapTextureSet.SIZEOF, ColorTexture.remaining());
	}
	public static void ViewportSet(ByteBuffer ovrlayerdirect, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayerdirect) + VIEWPORT, Viewport.remaining());
	}
	public static void ViewportSet(ByteBuffer ovrlayerdirect, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayerdirect) + VIEWPORT + index * OVRRecti.SIZEOF, Viewport.remaining());
	}

	public static void HeaderGet(ByteBuffer ovrlayerdirect, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayerdirect) + HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int HeaderType(ByteBuffer ovrlayerdirect) { return ovrlayerdirect.getInt(ovrlayerdirect.position() + HEADER + OVRLayerHeader.TYPE); }
	public static int HeaderFlags(ByteBuffer ovrlayerdirect) { return ovrlayerdirect.getInt(ovrlayerdirect.position() + HEADER + OVRLayerHeader.FLAGS); }
	public static void ColorTextureGet(ByteBuffer ovrlayerdirect, ByteBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2 * OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ovrlayerdirect) + COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining());
	}
	public static void ColorTextureGet(ByteBuffer ovrlayerdirect, ByteBuffer ColorTexture, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ovrlayerdirect) + COLORTEXTURE + index * OVRSwapTextureSet.SIZEOF, memAddress(ColorTexture), ColorTexture.remaining());
	}
	public static void ViewportGet(ByteBuffer ovrlayerdirect, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayerdirect) + VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void ViewportGet(ByteBuffer ovrlayerdirect, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayerdirect) + VIEWPORT + index * OVRRecti.SIZEOF, memAddress(Viewport), Viewport.remaining());
	}

}