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
 * Describes a layer that specifies a monoscopic or stereoscopic view. This uses a direct 3x4 matrix to map from view space to the UV coordinates. It is
 * essentially the same thing as {@link OVRLayerEyeFov} but using a much lower level. This is mainly to provide compatibility with specific apps. Unless the
 * application really requires this flexibility, it is usually better to use {@link OVRLayerEyeFov}.
 * 
 * <p>Three options exist with respect to mono/stereo texture usage:
 * <ul>
 * <li>ColorTexture[0] and ColorTexture[1] contain the left and right stereo renderings, respectively. Viewport[0] and Viewport[1] refer to
 * ColorTexture[0] and ColorTexture[1], respectively.</li>
 * <li>ColorTexture[0] contains both the left and right renderings, ColorTexture[1] is NULL, and Viewport[0] and Viewport[1] refer to sub-rects with
 * ColorTexture[0].</li>
 * <li>ColorTexture[0] contains a single monoscopic rendering, and Viewport[0] and Viewport[1] both refer to that rendering.</li>
 * </ul></p>
 * 
 * <h3>ovrLayerEyeMatrix members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Header</td><td class="nw">{@link OVRLayerHeader ovrLayerHeader}</td><td>{@code Header.Type} must be {@link OVR#ovrLayerType_EyeMatrix}</td></tr>
 * <tr><td>ColorTexture</td><td class="nw">ovrSwapTextureSet *[2]</td><td>{@code ovrSwapTextureSets} for the left and right eye respectively. The second one of which can be {@code NULL}</td></tr>
 * <tr><td>Viewport</td><td class="nw">ovrRecti[2]</td><td>specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.</td></tr>
 * <tr><td>RenderPose</td><td class="nw">ovrPosef[2]</td><td>specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned from
 * {@link OVRUtil#ovr_CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.</td></tr>
 * <tr><td>Matrix</td><td class="nw">ovrMatrix4f[2]</td><td>specifies the mapping from a view-space vector to a UV coordinate on the textures given above.
 * <pre><code style="font-family: monospace">
 * P = (x,y,z,1)*Matrix
 * TexU  = P.x/P.z
 * TexV  = P.y/P.z</code></pre></td></tr>
 * <tr><td>SensorSampleTime</td><td class="nw">double</td><td>specifies the timestamp when the source {@link OVRPosef} (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
 * {@link OVR#ovr_GetTimeInSeconds} around the instant the application calls {@link OVR#ovr_GetTrackingState}. The main purpose for this is to accurately track app
 * tracking latency.</td></tr>
 * </table>
 */
public class OVRLayerEyeMatrix extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT,
		RENDERPOSE,
		MATRIX,
		SENSORSAMPLETIME;

	static {
		Layout layout = __struct(
			__member(OVRLayerHeader.SIZEOF, OVRLayerHeader.__ALIGNMENT),
			__array(Pointer.POINTER_SIZE, 2),
			__array(OVRRecti.SIZEOF, OVRRecti.__ALIGNMENT, 2),
			__array(OVRPosef.SIZEOF, OVRPosef.__ALIGNMENT, 2),
			__array(OVRMatrix4f.SIZEOF, OVRMatrix4f.__ALIGNMENT, 2),
			__member(8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		HEADER = layout.offsetof(0);
		COLORTEXTURE = layout.offsetof(1);
		VIEWPORT = layout.offsetof(2);
		RENDERPOSE = layout.offsetof(3);
		MATRIX = layout.offsetof(4);
		SENSORSAMPLETIME = layout.offsetof(5);
	}

	OVRLayerEyeMatrix(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRLayerEyeMatrix} instance at the specified memory address. */
	public OVRLayerEyeMatrix(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRLayerEyeMatrix} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerEyeMatrix(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
	public OVRLayerHeader Header() { return nHeader(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
	public PointerBuffer ColorTexture() { return nColorTexture(address()); }
	/** Returns a {@link OVRSwapTextureSet} view of the pointer at the specified index of the {@code ColorTexture}. */
	public OVRSwapTextureSet ColorTexture(int index) { return nColorTexture(address(), index); }
	/** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
	public OVRRecti.Buffer Viewport() { return nViewport(address()); }
	/** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
	public OVRRecti Viewport(int index) { return nViewport(address(), index); }
	/** Returns a {@link OVRPosef}.Buffer view of the {@code RenderPose} field. */
	public OVRPosef.Buffer RenderPose() { return nRenderPose(address()); }
	/** Returns a {@link OVRPosef} view of the struct at the specified index of the {@code RenderPose} field. */
	public OVRPosef RenderPose(int index) { return nRenderPose(address(), index); }
	/** Returns a {@link OVRMatrix4f}.Buffer view of the {@code Matrix} field. */
	public OVRMatrix4f.Buffer Matrix() { return nMatrix(address()); }
	/** Returns a {@link OVRMatrix4f} view of the struct at the specified index of the {@code Matrix} field. */
	public OVRMatrix4f Matrix(int index) { return nMatrix(address(), index); }
	/** Returns the value of the {@code SensorSampleTime} field. */
	public double SensorSampleTime() { return nSensorSampleTime(address()); }

	/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
	public OVRLayerEyeMatrix Header(OVRLayerHeader value) { nHeader(address(), value); return this; }
	/** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
	public OVRLayerEyeMatrix ColorTexture(PointerBuffer value) { nColorTexture(address(), value); return this; }
	/** Copies the address of the specified {@link OVRSwapTextureSet} at the specified index of the {@code ColorTexture} field. */
	public OVRLayerEyeMatrix ColorTexture(int index, OVRSwapTextureSet value) { nColorTexture(address(), index, value); return this; }
	/** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
	public OVRLayerEyeMatrix Viewport(OVRRecti.Buffer value) { nViewport(address(), value); return this; }
	/** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
	public OVRLayerEyeMatrix Viewport(int index, OVRRecti value) { nViewport(address(), index, value); return this; }
	/** Copies the specified {@link OVRPosef.Buffer} to the {@code RenderPose} field. */
	public OVRLayerEyeMatrix RenderPose(OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
	/** Copies the specified {@link OVRPosef} at the specified index of the {@code RenderPose} field. */
	public OVRLayerEyeMatrix RenderPose(int index, OVRPosef value) { nRenderPose(address(), index, value); return this; }
	/** Copies the specified {@link OVRMatrix4f.Buffer} to the {@code Matrix} field. */
	public OVRLayerEyeMatrix Matrix(OVRMatrix4f.Buffer value) { nMatrix(address(), value); return this; }
	/** Copies the specified {@link OVRMatrix4f} at the specified index of the {@code Matrix} field. */
	public OVRLayerEyeMatrix Matrix(int index, OVRMatrix4f value) { nMatrix(address(), index, value); return this; }
	/** Sets the specified value to the {@code SensorSampleTime} field. */
	public OVRLayerEyeMatrix SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerEyeMatrix set(
		OVRLayerHeader Header,
		PointerBuffer ColorTexture,
		OVRRecti.Buffer Viewport,
		OVRPosef.Buffer RenderPose,
		OVRMatrix4f.Buffer Matrix,
		double SensorSampleTime
	) {
		Header(Header);
		ColorTexture(ColorTexture);
		Viewport(Viewport);
		RenderPose(RenderPose);
		Matrix(Matrix);
		SensorSampleTime(SensorSampleTime);

		return this;
	}

	/** Unsafe version of {@link #set(OVRLayerEyeMatrix) set}. */
	public OVRLayerEyeMatrix nset(long struct) {
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
	public OVRLayerEyeMatrix set(OVRLayerEyeMatrix src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRLayerEyeMatrix) set}. */
	public OVRLayerEyeMatrix set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerEyeMatrix} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerEyeMatrix malloc() {
		return new OVRLayerEyeMatrix(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerEyeMatrix} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerEyeMatrix calloc() {
		return new OVRLayerEyeMatrix(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerEyeMatrix} instance allocated with {@link BufferUtils}. */
	public static OVRLayerEyeMatrix create() {
		return new OVRLayerEyeMatrix(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRLayerEyeMatrix.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Header}. */
	public static OVRLayerHeader nHeader(long struct) { return new OVRLayerHeader(struct + OVRLayerEyeMatrix.HEADER); }
	/** Unsafe version of {@link #ColorTexture}. */
	public static PointerBuffer nColorTexture(long struct) {
		return memPointerBuffer(struct + OVRLayerEyeMatrix.COLORTEXTURE, 2);
	}
	/** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
	public static OVRSwapTextureSet nColorTexture(long struct, int index) {
		return new OVRSwapTextureSet(memGetAddress(struct + OVRLayerEyeMatrix.COLORTEXTURE + index * POINTER_SIZE));
	}
	/** Unsafe version of {@link #Viewport}. */
	public static OVRRecti.Buffer nViewport(long struct) {
		return OVRRecti.createBuffer(struct + OVRLayerEyeMatrix.VIEWPORT, 2);
	}
	/** Unsafe version of {@link #Viewport(int) Viewport}. */
	public static OVRRecti nViewport(long struct, int index) {
		return new OVRRecti(struct + OVRLayerEyeMatrix.VIEWPORT + index * OVRRecti.SIZEOF);
	}
	/** Unsafe version of {@link #RenderPose}. */
	public static OVRPosef.Buffer nRenderPose(long struct) {
		return OVRPosef.createBuffer(struct + OVRLayerEyeMatrix.RENDERPOSE, 2);
	}
	/** Unsafe version of {@link #RenderPose(int) RenderPose}. */
	public static OVRPosef nRenderPose(long struct, int index) {
		return new OVRPosef(struct + OVRLayerEyeMatrix.RENDERPOSE + index * OVRPosef.SIZEOF);
	}
	/** Unsafe version of {@link #Matrix}. */
	public static OVRMatrix4f.Buffer nMatrix(long struct) {
		return OVRMatrix4f.createBuffer(struct + OVRLayerEyeMatrix.MATRIX, 2);
	}
	/** Unsafe version of {@link #Matrix(int) Matrix}. */
	public static OVRMatrix4f nMatrix(long struct, int index) {
		return new OVRMatrix4f(struct + OVRLayerEyeMatrix.MATRIX + index * OVRMatrix4f.SIZEOF);
	}
	/** Unsafe version of {@link #SensorSampleTime}. */
	public static double nSensorSampleTime(long struct) { return memGetDouble(struct + OVRLayerEyeMatrix.SENSORSAMPLETIME); }

	/** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
	public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerEyeMatrix.HEADER, OVRLayerHeader.SIZEOF); }
	/** Unsafe version of {@link #ColorTexture(PointerBuffer) ColorTexture}. */
	public static void nColorTexture(long struct, PointerBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(memAddress(value), struct + OVRLayerEyeMatrix.COLORTEXTURE, value.remaining() * POINTER_SIZE);
	}
	/** Unsafe version of {@link #ColorTexture(int, OVRSwapTextureSet) ColorTexture}. */
	public static void nColorTexture(long struct, int index, OVRSwapTextureSet value) { memPutAddress(struct + OVRLayerEyeMatrix.COLORTEXTURE + index * POINTER_SIZE, value.address()); }
	/** Unsafe version of {@link #Viewport(OVRRecti.Buffer) Viewport}. */
	public static void nViewport(long struct, OVRRecti.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRLayerEyeMatrix.VIEWPORT, value.remaining() * OVRRecti.SIZEOF);
	}
	/** Unsafe version of {@link #Viewport(int, OVRRecti) Viewport}. */
	public static void nViewport(long struct, int index, OVRRecti value) { memCopy(value.address(), struct + OVRLayerEyeMatrix.VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF); }
	/** Unsafe version of {@link #RenderPose(OVRPosef.Buffer) RenderPose}. */
	public static void nRenderPose(long struct, OVRPosef.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRLayerEyeMatrix.RENDERPOSE, value.remaining() * OVRPosef.SIZEOF);
	}
	/** Unsafe version of {@link #RenderPose(int, OVRPosef) RenderPose}. */
	public static void nRenderPose(long struct, int index, OVRPosef value) { memCopy(value.address(), struct + OVRLayerEyeMatrix.RENDERPOSE + index * OVRPosef.SIZEOF, OVRPosef.SIZEOF); }
	/** Unsafe version of {@link #Matrix(OVRMatrix4f.Buffer) Matrix}. */
	public static void nMatrix(long struct, OVRMatrix4f.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRLayerEyeMatrix.MATRIX, value.remaining() * OVRMatrix4f.SIZEOF);
	}
	/** Unsafe version of {@link #Matrix(int, OVRMatrix4f) Matrix}. */
	public static void nMatrix(long struct, int index, OVRMatrix4f value) { memCopy(value.address(), struct + OVRLayerEyeMatrix.MATRIX + index * OVRMatrix4f.SIZEOF, OVRMatrix4f.SIZEOF); }
	/** Unsafe version of {@link #SensorSampleTime(double) SensorSampleTime}. */
	public static void nSensorSampleTime(long struct, double value) { memPutDouble(struct + OVRLayerEyeMatrix.SENSORSAMPLETIME, value); }

	// -----------------------------------

	/** An array of {@link OVRLayerEyeMatrix} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerEyeMatrix, Buffer> {

		/**
		 * Creates a new {@link OVRLayerEyeMatrix.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerEyeMatrix#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerEyeMatrix newInstance(long address) {
			return new OVRLayerEyeMatrix(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
		public OVRLayerHeader Header() { return nHeader(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
		public PointerBuffer ColorTexture() { return nColorTexture(address()); }
		/** Returns a {@link OVRSwapTextureSet} view of the pointer at the specified index of the {@code ColorTexture}. */
		public OVRSwapTextureSet ColorTexture(int index) { return nColorTexture(address(), index); }
		/** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
		public OVRRecti.Buffer Viewport() { return nViewport(address()); }
		/** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
		public OVRRecti Viewport(int index) { return nViewport(address(), index); }
		/** Returns a {@link OVRPosef}.Buffer view of the {@code RenderPose} field. */
		public OVRPosef.Buffer RenderPose() { return nRenderPose(address()); }
		/** Returns a {@link OVRPosef} view of the struct at the specified index of the {@code RenderPose} field. */
		public OVRPosef RenderPose(int index) { return nRenderPose(address(), index); }
		/** Returns a {@link OVRMatrix4f}.Buffer view of the {@code Matrix} field. */
		public OVRMatrix4f.Buffer Matrix() { return nMatrix(address()); }
		/** Returns a {@link OVRMatrix4f} view of the struct at the specified index of the {@code Matrix} field. */
		public OVRMatrix4f Matrix(int index) { return nMatrix(address(), index); }
		/** Returns the value of the {@code SensorSampleTime} field. */
		public double SensorSampleTime() { return nSensorSampleTime(address()); }

		/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
		public OVRLayerEyeMatrix.Buffer Header(OVRLayerHeader value) { nHeader(address(), value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
		public OVRLayerEyeMatrix.Buffer ColorTexture(PointerBuffer value) { nColorTexture(address(), value); return this; }
		/** Copies the address of the specified {@link OVRSwapTextureSet} at the specified index of the {@code ColorTexture} field. */
		public OVRLayerEyeMatrix.Buffer ColorTexture(int index, OVRSwapTextureSet value) { nColorTexture(address(), index, value); return this; }
		/** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
		public OVRLayerEyeMatrix.Buffer Viewport(OVRRecti.Buffer value) { nViewport(address(), value); return this; }
		/** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
		public OVRLayerEyeMatrix.Buffer Viewport(int index, OVRRecti value) { nViewport(address(), index, value); return this; }
		/** Copies the specified {@link OVRPosef.Buffer} to the {@code RenderPose} field. */
		public OVRLayerEyeMatrix.Buffer RenderPose(OVRPosef.Buffer value) { nRenderPose(address(), value); return this; }
		/** Copies the specified {@link OVRPosef} at the specified index of the {@code RenderPose} field. */
		public OVRLayerEyeMatrix.Buffer RenderPose(int index, OVRPosef value) { nRenderPose(address(), index, value); return this; }
		/** Copies the specified {@link OVRMatrix4f.Buffer} to the {@code Matrix} field. */
		public OVRLayerEyeMatrix.Buffer Matrix(OVRMatrix4f.Buffer value) { nMatrix(address(), value); return this; }
		/** Copies the specified {@link OVRMatrix4f} at the specified index of the {@code Matrix} field. */
		public OVRLayerEyeMatrix.Buffer Matrix(int index, OVRMatrix4f value) { nMatrix(address(), index, value); return this; }
		/** Sets the specified value to the {@code SensorSampleTime} field. */
		public OVRLayerEyeMatrix.Buffer SensorSampleTime(double value) { nSensorSampleTime(address(), value); return this; }

	}

}