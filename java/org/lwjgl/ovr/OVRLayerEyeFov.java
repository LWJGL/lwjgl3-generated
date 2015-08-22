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
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		COLORTEXTURE = offsets.get(1);
		VIEWPORT = offsets.get(2);
		FOV = offsets.get(3);
		RENDERPOSE = offsets.get(4);

		memFree(offsets);
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

	public OVRLayerEyeFov setHeader(ByteBuffer Header) { HeaderSet(struct, Header); return this; }
	public OVRLayerEyeFov setHeaderType(int Type) { HeaderType(struct, Type); return this; }
	public OVRLayerEyeFov setHeaderFlags(int Flags) { HeaderFlags(struct, Flags); return this; }
	public OVRLayerEyeFov setColorTexture(PointerBuffer ColorTexture) { ColorTextureSet(struct, ColorTexture); return this; }
	public OVRLayerEyeFov setColorTexture(ByteBuffer ColorTexture, int index) { ColorTextureSet(struct, ColorTexture, index); return this; }
	public OVRLayerEyeFov setViewport(ByteBuffer Viewport) { ViewportSet(struct, Viewport); return this; }
	public OVRLayerEyeFov setViewport(ByteBuffer Viewport, int index) { ViewportSet(struct, Viewport, index); return this; }
	public OVRLayerEyeFov setFov(ByteBuffer Fov) { FovSet(struct, Fov); return this; }
	public OVRLayerEyeFov setFov(ByteBuffer Fov, int index) { FovSet(struct, Fov, index); return this; }
	public OVRLayerEyeFov setRenderPose(ByteBuffer RenderPose) { RenderPoseSet(struct, RenderPose); return this; }
	public OVRLayerEyeFov setRenderPose(ByteBuffer RenderPose, int index) { RenderPoseSet(struct, RenderPose, index); return this; }

	public void getHeader(ByteBuffer Header) { HeaderGet(struct, Header); }
	public int getHeaderType() { return HeaderType(struct); }
	public int getHeaderFlags() { return HeaderFlags(struct); }
	public void getColorTexture(PointerBuffer ColorTexture) { ColorTextureGet(struct, ColorTexture); }
	public long getColorTexture(int index) { return ColorTextureGet(struct, index); }
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
		PointerBuffer ColorTexture,
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
	public static void ColorTextureSet(ByteBuffer ovrlayereyefov, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ColorTexture), memAddress(ovrlayereyefov) + COLORTEXTURE, ColorTexture.remaining() * POINTER_SIZE);
	}
	public static void ColorTextureSet(ByteBuffer ovrlayereyefov, ByteBuffer ColorTexture, int index) {
		PointerBuffer.put(ovrlayereyefov, COLORTEXTURE + index * POINTER_SIZE, memAddress(ColorTexture));
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
	public static void ColorTextureGet(ByteBuffer ovrlayereyefov, PointerBuffer ColorTexture) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(ColorTexture, 2);
		memCopy(memAddress(ovrlayereyefov) + COLORTEXTURE, memAddress(ColorTexture), ColorTexture.remaining() * POINTER_SIZE);
	}
	public static long ColorTextureGet(ByteBuffer ovrlayereyefov, int index) {
		return PointerBuffer.get(ovrlayereyefov, COLORTEXTURE + index * POINTER_SIZE);
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