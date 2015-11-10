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
 * Describes a layer of Quad type, which is a single quad in world or viewer space. It is used for both {@link OVR#ovrLayerType_Quad}. This type of layer
 * represents a single object placed in the world and not a stereo view of the world itself.
 * 
 * <p>A typical use of {@link OVR#ovrLayerType_Quad} is to draw a television screen in a room that for some reason is more convenient to draw as a layer than
 * as part of the main view in layer 0. For example, it could implement a 3D popup GUI that is drawn at a higher resolution than layer 0 to improve
 * fidelity of the GUI.</p>
 * 
 * <p>Quad layers are visible from both sides; they are not back-face culled.</p>
 */
public class OVRLayerQuad extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT,
		QUADPOSECENTER,
		QUADSIZE;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		HEADER = offsets.get(0);
		COLORTEXTURE = offsets.get(1);
		VIEWPORT = offsets.get(2);
		QUADPOSECENTER = offsets.get(3);
		QUADSIZE = offsets.get(4);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRLayerQuad(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRLayerQuad} instance at the specified memory address. */
	public OVRLayerQuad(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRLayerQuad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerQuad(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRLayerHeader getHeader() { return ngetHeader(address()); }
	public int getHeaderType() { return ngetHeaderType(address()); }
	public int getHeaderFlags() { return ngetHeaderFlags(address()); }
	public OVRSwapTextureSet getColorTexture() { return ngetColorTextureStruct(address()); }
	public OVRRecti getViewport() { return ngetViewport(address()); }
	public OVRVector2i getViewportPos() { return ngetViewportPos(address()); }
	public int getViewportPosX() { return ngetViewportPosX(address()); }
	public int getViewportPosY() { return ngetViewportPosY(address()); }
	public OVRSizei getViewportSize() { return ngetViewportSize(address()); }
	public int getViewportSizeW() { return ngetViewportSizeW(address()); }
	public int getViewportSizeH() { return ngetViewportSizeH(address()); }
	public OVRPosef getQuadPoseCenter() { return ngetQuadPoseCenter(address()); }
	public OVRQuatf getQuadPoseCenterOrientation() { return ngetQuadPoseCenterOrientation(address()); }
	public float getQuadPoseCenterOrientationX() { return ngetQuadPoseCenterOrientationX(address()); }
	public float getQuadPoseCenterOrientationY() { return ngetQuadPoseCenterOrientationY(address()); }
	public float getQuadPoseCenterOrientationZ() { return ngetQuadPoseCenterOrientationZ(address()); }
	public float getQuadPoseCenterOrientationW() { return ngetQuadPoseCenterOrientationW(address()); }
	public OVRVector3f getQuadPoseCenterPosition() { return ngetQuadPoseCenterPosition(address()); }
	public float getQuadPoseCenterPositionX() { return ngetQuadPoseCenterPositionX(address()); }
	public float getQuadPoseCenterPositionY() { return ngetQuadPoseCenterPositionY(address()); }
	public float getQuadPoseCenterPositionZ() { return ngetQuadPoseCenterPositionZ(address()); }
	public OVRVector2f getQuadSize() { return ngetQuadSize(address()); }
	public float getQuadSizeX() { return ngetQuadSizeX(address()); }
	public float getQuadSizeY() { return ngetQuadSizeY(address()); }

	public OVRLayerQuad setHeader(OVRLayerHeader Header) { nsetHeader(address(), Header); return this; }
	public OVRLayerQuad setHeaderType(int Type) { nsetHeaderType(address(), Type); return this; }
	public OVRLayerQuad setHeaderFlags(int Flags) { nsetHeaderFlags(address(), Flags); return this; }
	public OVRLayerQuad setColorTexture(OVRSwapTextureSet ColorTexture) { nsetColorTexture(address(), ColorTexture); return this; }
	public OVRLayerQuad setViewport(OVRRecti Viewport) { nsetViewport(address(), Viewport); return this; }
	public OVRLayerQuad setViewportPos(OVRVector2i Pos) { nsetViewportPos(address(), Pos); return this; }
	public OVRLayerQuad setViewportPosX(int x) { nsetViewportPosX(address(), x); return this; }
	public OVRLayerQuad setViewportPosY(int y) { nsetViewportPosY(address(), y); return this; }
	public OVRLayerQuad setViewportSize(OVRSizei Size) { nsetViewportSize(address(), Size); return this; }
	public OVRLayerQuad setViewportSizeW(int w) { nsetViewportSizeW(address(), w); return this; }
	public OVRLayerQuad setViewportSizeH(int h) { nsetViewportSizeH(address(), h); return this; }
	public OVRLayerQuad setQuadPoseCenter(OVRPosef QuadPoseCenter) { nsetQuadPoseCenter(address(), QuadPoseCenter); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientation(OVRQuatf Orientation) { nsetQuadPoseCenterOrientation(address(), Orientation); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientationX(float x) { nsetQuadPoseCenterOrientationX(address(), x); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientationY(float y) { nsetQuadPoseCenterOrientationY(address(), y); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientationZ(float z) { nsetQuadPoseCenterOrientationZ(address(), z); return this; }
	public OVRLayerQuad setQuadPoseCenterOrientationW(float w) { nsetQuadPoseCenterOrientationW(address(), w); return this; }
	public OVRLayerQuad setQuadPoseCenterPosition(OVRVector3f Position) { nsetQuadPoseCenterPosition(address(), Position); return this; }
	public OVRLayerQuad setQuadPoseCenterPositionX(float x) { nsetQuadPoseCenterPositionX(address(), x); return this; }
	public OVRLayerQuad setQuadPoseCenterPositionY(float y) { nsetQuadPoseCenterPositionY(address(), y); return this; }
	public OVRLayerQuad setQuadPoseCenterPositionZ(float z) { nsetQuadPoseCenterPositionZ(address(), z); return this; }
	public OVRLayerQuad setQuadSize(OVRVector2f QuadSize) { nsetQuadSize(address(), QuadSize); return this; }
	public OVRLayerQuad setQuadSizeX(float x) { nsetQuadSizeX(address(), x); return this; }
	public OVRLayerQuad setQuadSizeY(float y) { nsetQuadSizeY(address(), y); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerQuad set(
		OVRLayerHeader Header,
		OVRSwapTextureSet ColorTexture,
		OVRRecti Viewport,
		OVRPosef QuadPoseCenter,
		OVRVector2f QuadSize
	) {
		setHeader(Header);
		setColorTexture(ColorTexture);
		setViewport(Viewport);
		setQuadPoseCenter(QuadPoseCenter);
		setQuadSize(QuadSize);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRLayerQuad nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRLayerQuad set(OVRLayerQuad src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRLayerQuad set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerQuad} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerQuad malloc() {
		return new OVRLayerQuad(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerQuad} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerQuad calloc() {
		return new OVRLayerQuad(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerQuad} instance allocated with {@link BufferUtils}. */
	public static OVRLayerQuad create() {
		return new OVRLayerQuad(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerQuad.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRLayerQuad.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static OVRLayerHeader ngetHeader(long struct) { return OVRLayerHeader.malloc().nset(struct + HEADER); }
	/** Returns a copy of the {@code Header} {@link OVRLayerHeader} struct. */
	public static OVRLayerHeader getHeader(ByteBuffer struct) { return ngetHeader(memAddress(struct)); }
	public static int ngetHeaderType(long struct) { return memGetInt(struct + HEADER + OVRLayerHeader.TYPE); }
	public static int getHeaderType(ByteBuffer struct) { return ngetHeaderType(memAddress(struct)); }
	public static int ngetHeaderFlags(long struct) { return memGetInt(struct + HEADER + OVRLayerHeader.FLAGS); }
	public static int getHeaderFlags(ByteBuffer struct) { return ngetHeaderFlags(memAddress(struct)); }
	public static long ngetColorTexture(long struct) { return memGetAddress(struct + COLORTEXTURE); }
	public static OVRSwapTextureSet ngetColorTextureStruct(long struct) { return new OVRSwapTextureSet(ngetColorTexture(struct)); }
	public static OVRSwapTextureSet getColorTexture(ByteBuffer struct) { return ngetColorTextureStruct(memAddress(struct)); }
	public static OVRRecti ngetViewport(long struct) { return OVRRecti.malloc().nset(struct + VIEWPORT); }
	/** Returns a copy of the {@code Viewport} {@link OVRRecti} struct. */
	public static OVRRecti getViewport(ByteBuffer struct) { return ngetViewport(memAddress(struct)); }
	public static OVRVector2i ngetViewportPos(long struct) { return OVRVector2i.malloc().nset(struct + VIEWPORT + OVRRecti.POS); }
	/** Returns a copy of the {@code Pos} {@link OVRVector2i} struct. */
	public static OVRVector2i getViewportPos(ByteBuffer struct) { return ngetViewportPos(memAddress(struct)); }
	public static int ngetViewportPosX(long struct) { return memGetInt(struct + VIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int getViewportPosX(ByteBuffer struct) { return ngetViewportPosX(memAddress(struct)); }
	public static int ngetViewportPosY(long struct) { return memGetInt(struct + VIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static int getViewportPosY(ByteBuffer struct) { return ngetViewportPosY(memAddress(struct)); }
	public static OVRSizei ngetViewportSize(long struct) { return OVRSizei.malloc().nset(struct + VIEWPORT + OVRRecti.SIZE); }
	/** Returns a copy of the {@code Size} {@link OVRSizei} struct. */
	public static OVRSizei getViewportSize(ByteBuffer struct) { return ngetViewportSize(memAddress(struct)); }
	public static int ngetViewportSizeW(long struct) { return memGetInt(struct + VIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int getViewportSizeW(ByteBuffer struct) { return ngetViewportSizeW(memAddress(struct)); }
	public static int ngetViewportSizeH(long struct) { return memGetInt(struct + VIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static int getViewportSizeH(ByteBuffer struct) { return ngetViewportSizeH(memAddress(struct)); }
	public static OVRPosef ngetQuadPoseCenter(long struct) { return OVRPosef.malloc().nset(struct + QUADPOSECENTER); }
	/** Returns a copy of the {@code QuadPoseCenter} {@link OVRPosef} struct. */
	public static OVRPosef getQuadPoseCenter(ByteBuffer struct) { return ngetQuadPoseCenter(memAddress(struct)); }
	public static OVRQuatf ngetQuadPoseCenterOrientation(long struct) { return OVRQuatf.malloc().nset(struct + QUADPOSECENTER + OVRPosef.ORIENTATION); }
	/** Returns a copy of the {@code Orientation} {@link OVRQuatf} struct. */
	public static OVRQuatf getQuadPoseCenterOrientation(ByteBuffer struct) { return ngetQuadPoseCenterOrientation(memAddress(struct)); }
	public static float ngetQuadPoseCenterOrientationX(long struct) { return memGetFloat(struct + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.X); }
	public static float getQuadPoseCenterOrientationX(ByteBuffer struct) { return ngetQuadPoseCenterOrientationX(memAddress(struct)); }
	public static float ngetQuadPoseCenterOrientationY(long struct) { return memGetFloat(struct + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Y); }
	public static float getQuadPoseCenterOrientationY(ByteBuffer struct) { return ngetQuadPoseCenterOrientationY(memAddress(struct)); }
	public static float ngetQuadPoseCenterOrientationZ(long struct) { return memGetFloat(struct + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Z); }
	public static float getQuadPoseCenterOrientationZ(ByteBuffer struct) { return ngetQuadPoseCenterOrientationZ(memAddress(struct)); }
	public static float ngetQuadPoseCenterOrientationW(long struct) { return memGetFloat(struct + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.W); }
	public static float getQuadPoseCenterOrientationW(ByteBuffer struct) { return ngetQuadPoseCenterOrientationW(memAddress(struct)); }
	public static OVRVector3f ngetQuadPoseCenterPosition(long struct) { return OVRVector3f.malloc().nset(struct + QUADPOSECENTER + OVRPosef.POSITION); }
	/** Returns a copy of the {@code Position} {@link OVRVector3f} struct. */
	public static OVRVector3f getQuadPoseCenterPosition(ByteBuffer struct) { return ngetQuadPoseCenterPosition(memAddress(struct)); }
	public static float ngetQuadPoseCenterPositionX(long struct) { return memGetFloat(struct + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.X); }
	public static float getQuadPoseCenterPositionX(ByteBuffer struct) { return ngetQuadPoseCenterPositionX(memAddress(struct)); }
	public static float ngetQuadPoseCenterPositionY(long struct) { return memGetFloat(struct + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Y); }
	public static float getQuadPoseCenterPositionY(ByteBuffer struct) { return ngetQuadPoseCenterPositionY(memAddress(struct)); }
	public static float ngetQuadPoseCenterPositionZ(long struct) { return memGetFloat(struct + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Z); }
	public static float getQuadPoseCenterPositionZ(ByteBuffer struct) { return ngetQuadPoseCenterPositionZ(memAddress(struct)); }
	public static OVRVector2f ngetQuadSize(long struct) { return OVRVector2f.malloc().nset(struct + QUADSIZE); }
	/** Returns a copy of the {@code QuadSize} {@link OVRVector2f} struct. */
	public static OVRVector2f getQuadSize(ByteBuffer struct) { return ngetQuadSize(memAddress(struct)); }
	public static float ngetQuadSizeX(long struct) { return memGetFloat(struct + QUADSIZE + OVRVector2f.X); }
	public static float getQuadSizeX(ByteBuffer struct) { return ngetQuadSizeX(memAddress(struct)); }
	public static float ngetQuadSizeY(long struct) { return memGetFloat(struct + QUADSIZE + OVRVector2f.Y); }
	public static float getQuadSizeY(ByteBuffer struct) { return ngetQuadSizeY(memAddress(struct)); }

	public static void nsetHeader(long struct, OVRLayerHeader Header) { memCopy(Header.address(), struct + HEADER, OVRLayerHeader.SIZEOF); }
	/** Copies the specified {@link OVRLayerHeader} struct to the nested {@code Header} struct. */
	public static void setHeader(ByteBuffer struct, OVRLayerHeader Header) { nsetHeader(memAddress(struct), Header); }
	public static void nsetHeaderType(long struct, int Type) { memPutInt(struct + HEADER + OVRLayerHeader.TYPE, Type); }
	public static void setHeaderType(ByteBuffer struct, int Type) { nsetHeaderType(memAddress(struct), Type); }
	public static void nsetHeaderFlags(long struct, int Flags) { memPutInt(struct + HEADER + OVRLayerHeader.FLAGS, Flags); }
	public static void setHeaderFlags(ByteBuffer struct, int Flags) { nsetHeaderFlags(memAddress(struct), Flags); }
	public static void nsetColorTexture(long struct, long ColorTexture) { memPutAddress(struct + COLORTEXTURE, ColorTexture); }
	public static void nsetColorTexture(long struct, OVRSwapTextureSet ColorTexture) { nsetColorTexture(struct, ColorTexture.address()); }
	public static void setColorTexture(ByteBuffer struct, OVRSwapTextureSet ColorTexture) { nsetColorTexture(memAddress(struct), ColorTexture); }
	public static void nsetViewport(long struct, OVRRecti Viewport) { memCopy(Viewport.address(), struct + VIEWPORT, OVRRecti.SIZEOF); }
	/** Copies the specified {@link OVRRecti} struct to the nested {@code Viewport} struct. */
	public static void setViewport(ByteBuffer struct, OVRRecti Viewport) { nsetViewport(memAddress(struct), Viewport); }
	public static void nsetViewportPos(long struct, OVRVector2i Pos) { memCopy(Pos.address(), struct + VIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	/** Copies the specified {@link OVRVector2i} struct to the nested {@code Pos} struct. */
	public static void setViewportPos(ByteBuffer struct, OVRVector2i Pos) { nsetViewportPos(memAddress(struct), Pos); }
	public static void nsetViewportPosX(long struct, int x) { memPutInt(struct + VIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void setViewportPosX(ByteBuffer struct, int x) { nsetViewportPosX(memAddress(struct), x); }
	public static void nsetViewportPosY(long struct, int y) { memPutInt(struct + VIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void setViewportPosY(ByteBuffer struct, int y) { nsetViewportPosY(memAddress(struct), y); }
	public static void nsetViewportSize(long struct, OVRSizei Size) { memCopy(Size.address(), struct + VIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	/** Copies the specified {@link OVRSizei} struct to the nested {@code Size} struct. */
	public static void setViewportSize(ByteBuffer struct, OVRSizei Size) { nsetViewportSize(memAddress(struct), Size); }
	public static void nsetViewportSizeW(long struct, int w) { memPutInt(struct + VIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void setViewportSizeW(ByteBuffer struct, int w) { nsetViewportSizeW(memAddress(struct), w); }
	public static void nsetViewportSizeH(long struct, int h) { memPutInt(struct + VIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void setViewportSizeH(ByteBuffer struct, int h) { nsetViewportSizeH(memAddress(struct), h); }
	public static void nsetQuadPoseCenter(long struct, OVRPosef QuadPoseCenter) { memCopy(QuadPoseCenter.address(), struct + QUADPOSECENTER, OVRPosef.SIZEOF); }
	/** Copies the specified {@link OVRPosef} struct to the nested {@code QuadPoseCenter} struct. */
	public static void setQuadPoseCenter(ByteBuffer struct, OVRPosef QuadPoseCenter) { nsetQuadPoseCenter(memAddress(struct), QuadPoseCenter); }
	public static void nsetQuadPoseCenterOrientation(long struct, OVRQuatf Orientation) { memCopy(Orientation.address(), struct + QUADPOSECENTER + OVRPosef.ORIENTATION, OVRQuatf.SIZEOF); }
	/** Copies the specified {@link OVRQuatf} struct to the nested {@code Orientation} struct. */
	public static void setQuadPoseCenterOrientation(ByteBuffer struct, OVRQuatf Orientation) { nsetQuadPoseCenterOrientation(memAddress(struct), Orientation); }
	public static void nsetQuadPoseCenterOrientationX(long struct, float x) { memPutFloat(struct + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.X, x); }
	public static void setQuadPoseCenterOrientationX(ByteBuffer struct, float x) { nsetQuadPoseCenterOrientationX(memAddress(struct), x); }
	public static void nsetQuadPoseCenterOrientationY(long struct, float y) { memPutFloat(struct + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Y, y); }
	public static void setQuadPoseCenterOrientationY(ByteBuffer struct, float y) { nsetQuadPoseCenterOrientationY(memAddress(struct), y); }
	public static void nsetQuadPoseCenterOrientationZ(long struct, float z) { memPutFloat(struct + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.Z, z); }
	public static void setQuadPoseCenterOrientationZ(ByteBuffer struct, float z) { nsetQuadPoseCenterOrientationZ(memAddress(struct), z); }
	public static void nsetQuadPoseCenterOrientationW(long struct, float w) { memPutFloat(struct + QUADPOSECENTER + OVRPosef.ORIENTATION + OVRQuatf.W, w); }
	public static void setQuadPoseCenterOrientationW(ByteBuffer struct, float w) { nsetQuadPoseCenterOrientationW(memAddress(struct), w); }
	public static void nsetQuadPoseCenterPosition(long struct, OVRVector3f Position) { memCopy(Position.address(), struct + QUADPOSECENTER + OVRPosef.POSITION, OVRVector3f.SIZEOF); }
	/** Copies the specified {@link OVRVector3f} struct to the nested {@code Position} struct. */
	public static void setQuadPoseCenterPosition(ByteBuffer struct, OVRVector3f Position) { nsetQuadPoseCenterPosition(memAddress(struct), Position); }
	public static void nsetQuadPoseCenterPositionX(long struct, float x) { memPutFloat(struct + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.X, x); }
	public static void setQuadPoseCenterPositionX(ByteBuffer struct, float x) { nsetQuadPoseCenterPositionX(memAddress(struct), x); }
	public static void nsetQuadPoseCenterPositionY(long struct, float y) { memPutFloat(struct + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Y, y); }
	public static void setQuadPoseCenterPositionY(ByteBuffer struct, float y) { nsetQuadPoseCenterPositionY(memAddress(struct), y); }
	public static void nsetQuadPoseCenterPositionZ(long struct, float z) { memPutFloat(struct + QUADPOSECENTER + OVRPosef.POSITION + OVRVector3f.Z, z); }
	public static void setQuadPoseCenterPositionZ(ByteBuffer struct, float z) { nsetQuadPoseCenterPositionZ(memAddress(struct), z); }
	public static void nsetQuadSize(long struct, OVRVector2f QuadSize) { memCopy(QuadSize.address(), struct + QUADSIZE, OVRVector2f.SIZEOF); }
	/** Copies the specified {@link OVRVector2f} struct to the nested {@code QuadSize} struct. */
	public static void setQuadSize(ByteBuffer struct, OVRVector2f QuadSize) { nsetQuadSize(memAddress(struct), QuadSize); }
	public static void nsetQuadSizeX(long struct, float x) { memPutFloat(struct + QUADSIZE + OVRVector2f.X, x); }
	public static void setQuadSizeX(ByteBuffer struct, float x) { nsetQuadSizeX(memAddress(struct), x); }
	public static void nsetQuadSizeY(long struct, float y) { memPutFloat(struct + QUADSIZE + OVRVector2f.Y, y); }
	public static void setQuadSizeY(ByteBuffer struct, float y) { nsetQuadSizeY(memAddress(struct), y); }

	// -----------------------------------

	/** An array of {@link OVRLayerQuad} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerQuad, Buffer> {

		/**
		 * Creates a new {@link OVRLayerQuad.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerQuad#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerQuad newInstance(long address) {
			return new OVRLayerQuad(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public OVRLayerHeader getHeader() { return ngetHeader(address()); }
		public int getHeaderType() { return ngetHeaderType(address()); }
		public int getHeaderFlags() { return ngetHeaderFlags(address()); }
		public OVRSwapTextureSet getColorTexture() { return ngetColorTextureStruct(address()); }
		public OVRRecti getViewport() { return ngetViewport(address()); }
		public OVRVector2i getViewportPos() { return ngetViewportPos(address()); }
		public int getViewportPosX() { return ngetViewportPosX(address()); }
		public int getViewportPosY() { return ngetViewportPosY(address()); }
		public OVRSizei getViewportSize() { return ngetViewportSize(address()); }
		public int getViewportSizeW() { return ngetViewportSizeW(address()); }
		public int getViewportSizeH() { return ngetViewportSizeH(address()); }
		public OVRPosef getQuadPoseCenter() { return ngetQuadPoseCenter(address()); }
		public OVRQuatf getQuadPoseCenterOrientation() { return ngetQuadPoseCenterOrientation(address()); }
		public float getQuadPoseCenterOrientationX() { return ngetQuadPoseCenterOrientationX(address()); }
		public float getQuadPoseCenterOrientationY() { return ngetQuadPoseCenterOrientationY(address()); }
		public float getQuadPoseCenterOrientationZ() { return ngetQuadPoseCenterOrientationZ(address()); }
		public float getQuadPoseCenterOrientationW() { return ngetQuadPoseCenterOrientationW(address()); }
		public OVRVector3f getQuadPoseCenterPosition() { return ngetQuadPoseCenterPosition(address()); }
		public float getQuadPoseCenterPositionX() { return ngetQuadPoseCenterPositionX(address()); }
		public float getQuadPoseCenterPositionY() { return ngetQuadPoseCenterPositionY(address()); }
		public float getQuadPoseCenterPositionZ() { return ngetQuadPoseCenterPositionZ(address()); }
		public OVRVector2f getQuadSize() { return ngetQuadSize(address()); }
		public float getQuadSizeX() { return ngetQuadSizeX(address()); }
		public float getQuadSizeY() { return ngetQuadSizeY(address()); }

		public OVRLayerQuad.Buffer setHeader(OVRLayerHeader Header) { nsetHeader(address(), Header); return this; }
		public OVRLayerQuad.Buffer setHeaderType(int Type) { nsetHeaderType(address(), Type); return this; }
		public OVRLayerQuad.Buffer setHeaderFlags(int Flags) { nsetHeaderFlags(address(), Flags); return this; }
		public OVRLayerQuad.Buffer setColorTexture(OVRSwapTextureSet ColorTexture) { nsetColorTexture(address(), ColorTexture); return this; }
		public OVRLayerQuad.Buffer setViewport(OVRRecti Viewport) { nsetViewport(address(), Viewport); return this; }
		public OVRLayerQuad.Buffer setViewportPos(OVRVector2i Pos) { nsetViewportPos(address(), Pos); return this; }
		public OVRLayerQuad.Buffer setViewportPosX(int x) { nsetViewportPosX(address(), x); return this; }
		public OVRLayerQuad.Buffer setViewportPosY(int y) { nsetViewportPosY(address(), y); return this; }
		public OVRLayerQuad.Buffer setViewportSize(OVRSizei Size) { nsetViewportSize(address(), Size); return this; }
		public OVRLayerQuad.Buffer setViewportSizeW(int w) { nsetViewportSizeW(address(), w); return this; }
		public OVRLayerQuad.Buffer setViewportSizeH(int h) { nsetViewportSizeH(address(), h); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenter(OVRPosef QuadPoseCenter) { nsetQuadPoseCenter(address(), QuadPoseCenter); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterOrientation(OVRQuatf Orientation) { nsetQuadPoseCenterOrientation(address(), Orientation); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterOrientationX(float x) { nsetQuadPoseCenterOrientationX(address(), x); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterOrientationY(float y) { nsetQuadPoseCenterOrientationY(address(), y); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterOrientationZ(float z) { nsetQuadPoseCenterOrientationZ(address(), z); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterOrientationW(float w) { nsetQuadPoseCenterOrientationW(address(), w); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterPosition(OVRVector3f Position) { nsetQuadPoseCenterPosition(address(), Position); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterPositionX(float x) { nsetQuadPoseCenterPositionX(address(), x); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterPositionY(float y) { nsetQuadPoseCenterPositionY(address(), y); return this; }
		public OVRLayerQuad.Buffer setQuadPoseCenterPositionZ(float z) { nsetQuadPoseCenterPositionZ(address(), z); return this; }
		public OVRLayerQuad.Buffer setQuadSize(OVRVector2f QuadSize) { nsetQuadSize(address(), QuadSize); return this; }
		public OVRLayerQuad.Buffer setQuadSizeX(float x) { nsetQuadSizeX(address(), x); return this; }
		public OVRLayerQuad.Buffer setQuadSizeY(float y) { nsetQuadSizeY(address(), y); return this; }

	}

}