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
 * Describes a layer that specifies a monoscopic or stereoscopic view. This is the kind of layer that's typically used as layer 0 to
 * {@link OVR#ovrHmd_SubmitFrame}, as it is the kind of layer used to render a 3D stereoscopic view.
 */
public final class OVRLayerEyeFov implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT,
		FOV,
		RENDERPOSE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(5);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		COLORTEXTURE = offsets.get(1);
		VIEWPORT = offsets.get(2);
		FOV = offsets.get(3);
		RENDERPOSE = offsets.get(4);
	}

	private final ByteBuffer struct;

	public OVRLayerEyeFov() {
		this(malloc());
	}

	public OVRLayerEyeFov(ByteBuffer struct) {
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
	public void setFov(ByteBuffer Fov) { FovSet(struct, Fov); }
	public void setFov(ByteBuffer Fov, int index) { FovSet(struct, Fov, index); }
	public void setRenderPose(ByteBuffer RenderPose) { RenderPoseSet(struct, RenderPose); }
	public void setRenderPose(ByteBuffer RenderPose, int index) { RenderPoseSet(struct, RenderPose, index); }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderType() { return HeaderType(struct); }
	public int getHeaderFlags() { return HeaderFlags(struct); }
	public void getColorTexture(ByteBuffer ColorTexture) { ColorTextureGet(struct, ColorTexture); }
	public void getColorTexture(ByteBuffer ColorTexture, int index) { ColorTextureGet(struct, ColorTexture, index); }
	public void getViewport(ByteBuffer Viewport) { ViewportGet(struct, Viewport); }
	public void getViewport(ByteBuffer Viewport, int index) { ViewportGet(struct, Viewport, index); }
	public void getFov(ByteBuffer Fov) { FovGet(struct, Fov); }
	public void getFov(ByteBuffer Fov, int index) { FovGet(struct, Fov, index); }
	public void getRenderPose(ByteBuffer RenderPose) { RenderPoseGet(struct, RenderPose); }
	public void getRenderPose(ByteBuffer RenderPose, int index) { RenderPoseGet(struct, RenderPose, index); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer Header,
		ByteBuffer ColorTexture,
		ByteBuffer Viewport,
		ByteBuffer Fov,
		ByteBuffer RenderPose
	) {
		ByteBuffer ovrlayereyefov = malloc();

		HeaderSet(ovrlayereyefov, Header);
		ColorTextureSet(ovrlayereyefov, ColorTexture);
		ViewportSet(ovrlayereyefov, Viewport);
		FovSet(ovrlayereyefov, Fov);
		RenderPoseSet(ovrlayereyefov, RenderPose);

		return ovrlayereyefov;
	}

	public static void HeaderSet(ByteBuffer ovrlayereyefov, ByteBuffer Header) { if ( Header != null ) memCopy(memAddress(Header), memAddress(ovrlayereyefov) + HEADER, OVRLayerHeader.SIZEOF); }
	public static void HeaderType(ByteBuffer ovrlayereyefov, int Type) { ovrlayereyefov.putInt(ovrlayereyefov.position() + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void HeaderFlags(ByteBuffer ovrlayereyefov, int Flags) { ovrlayereyefov.putInt(ovrlayereyefov.position() + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void ColorTextureSet(ByteBuffer ovrlayereyefov, ByteBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2 * OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayereyefov) + COLORTEXTURE, ColorTexture.remaining());
	}
	public static void ColorTextureSet(ByteBuffer ovrlayereyefov, ByteBuffer ColorTexture, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayereyefov) + COLORTEXTURE + index * OVRSwapTextureSet.SIZEOF, ColorTexture.remaining());
	}
	public static void ViewportSet(ByteBuffer ovrlayereyefov, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayereyefov) + VIEWPORT, Viewport.remaining());
	}
	public static void ViewportSet(ByteBuffer ovrlayereyefov, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(Viewport), memAddress(ovrlayereyefov) + VIEWPORT + index * OVRRecti.SIZEOF, Viewport.remaining());
	}
	public static void FovSet(ByteBuffer ovrlayereyefov, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), memAddress(ovrlayereyefov) + FOV, Fov.remaining());
	}
	public static void FovSet(ByteBuffer ovrlayereyefov, ByteBuffer Fov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, OVRFovPort.SIZEOF);
		memCopy(memAddress(Fov), memAddress(ovrlayereyefov) + FOV + index * OVRFovPort.SIZEOF, Fov.remaining());
	}
	public static void RenderPoseSet(ByteBuffer ovrlayereyefov, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), memAddress(ovrlayereyefov) + RENDERPOSE, RenderPose.remaining());
	}
	public static void RenderPoseSet(ByteBuffer ovrlayereyefov, ByteBuffer RenderPose, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, OVRPosef.SIZEOF);
		memCopy(memAddress(RenderPose), memAddress(ovrlayereyefov) + RENDERPOSE + index * OVRPosef.SIZEOF, RenderPose.remaining());
	}

	public static void HeaderGet(ByteBuffer ovrlayereyefov, ByteBuffer Header) { if ( LWJGLUtil.CHECKS ) checkBuffer(Header, OVRLayerHeader.SIZEOF); memCopy(memAddress(ovrlayereyefov) + HEADER, memAddress(Header), OVRLayerHeader.SIZEOF); }
	public static int HeaderType(ByteBuffer ovrlayereyefov) { return ovrlayereyefov.getInt(ovrlayereyefov.position() + HEADER + OVRLayerHeader.TYPE); }
	public static int HeaderFlags(ByteBuffer ovrlayereyefov) { return ovrlayereyefov.getInt(ovrlayereyefov.position() + HEADER + OVRLayerHeader.FLAGS); }
	public static void ColorTextureGet(ByteBuffer ovrlayereyefov, ByteBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2 * OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ovrlayereyefov) + COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining());
	}
	public static void ColorTextureGet(ByteBuffer ovrlayereyefov, ByteBuffer ColorTexture, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, OVRSwapTextureSet.SIZEOF);
		memCopy(memAddress(ovrlayereyefov) + COLORTEXTURE + index * OVRSwapTextureSet.SIZEOF, memAddress(ColorTexture), ColorTexture.remaining());
	}
	public static void ViewportGet(ByteBuffer ovrlayereyefov, ByteBuffer Viewport) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, 2 * OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayereyefov) + VIEWPORT, memAddress(Viewport), Viewport.remaining());
	}
	public static void ViewportGet(ByteBuffer ovrlayereyefov, ByteBuffer Viewport, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Viewport, OVRRecti.SIZEOF);
		memCopy(memAddress(ovrlayereyefov) + VIEWPORT + index * OVRRecti.SIZEOF, memAddress(Viewport), Viewport.remaining());
	}
	public static void FovGet(ByteBuffer ovrlayereyefov, ByteBuffer Fov) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, 2 * OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrlayereyefov) + FOV, memAddress(Fov), Fov.remaining());
	}
	public static void FovGet(ByteBuffer ovrlayereyefov, ByteBuffer Fov, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Fov, OVRFovPort.SIZEOF);
		memCopy(memAddress(ovrlayereyefov) + FOV + index * OVRFovPort.SIZEOF, memAddress(Fov), Fov.remaining());
	}
	public static void RenderPoseGet(ByteBuffer ovrlayereyefov, ByteBuffer RenderPose) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, 2 * OVRPosef.SIZEOF);
		memCopy(memAddress(ovrlayereyefov) + RENDERPOSE, memAddress(RenderPose), RenderPose.remaining());
	}
	public static void RenderPoseGet(ByteBuffer ovrlayereyefov, ByteBuffer RenderPose, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(RenderPose, OVRPosef.SIZEOF);
		memCopy(memAddress(ovrlayereyefov) + RENDERPOSE + index * OVRPosef.SIZEOF, memAddress(RenderPose), RenderPose.remaining());
	}

}