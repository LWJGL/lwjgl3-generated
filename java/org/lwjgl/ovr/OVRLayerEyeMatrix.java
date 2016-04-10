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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a layer that specifies a monoscopic or stereoscopic view. This uses a direct 3x4 matrix to map from view space to the UV coordinates. It
 * is essentially the same thing as {@link OVRLayerEyeFov} but using a much lower level. This is mainly to provide compatibility with specific apps. Unless
 * the application really requires this flexibility, it is usually better to use {@link OVRLayerEyeFov}.
 * 
 * <p>Three options exist with respect to mono/stereo texture usage:</p>
 * 
 * <ul>
 * <li>ColorTexture[0] and ColorTexture[1] contain the left and right stereo renderings, respectively. Viewport[0] and Viewport[1] refer to
 * ColorTexture[0] and ColorTexture[1], respectively.</li>
 * <li>ColorTexture[0] contains both the left and right renderings, ColorTexture[1] is {@code NULL}, and Viewport[0] and Viewport[1] refer to sub-rects with
 * ColorTexture[0].</li>
 * <li>ColorTexture[0] contains a single monoscopic rendering, and Viewport[0] and Viewport[1] both refer to that rendering.</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Header} &ndash; {@code Header.Type} must be {@link OVR#ovrLayerType_EyeMatrix}</li>
 * <li>{@code ColorTexture} &ndash; {@code ovrTextureSwapChains} for the left and right eye respectively. The second one of which can be {@code NULL}</li>
 * <li>{@code Viewport} &ndash; specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.</li>
 * <li>{@code RenderPose} &ndash; 
 * specifies the position and orientation of each eye view, with the position specified in meters. RenderPose will typically be the value returned
 * from {@link OVRUtil#ovr_CalcEyePoses}, but can be different in special cases if a different head pose is used for rendering.</li>
 * <li>{@code Matrix} &ndash; 
 * specifies the mapping from a view-space vector to a UV coordinate on the textures given above.
 * 
 * <pre><code>P = (x,y,z,1)*Matrix
TexU  = P.x/P.z
TexV  = P.y/P.z</code></pre></li>
 * <li>{@code SensorSampleTime} &ndash; 
 * specifies the timestamp when the source {@link OVRPosef} (used in calculating RenderPose) was sampled from the SDK. Typically retrieved by calling
 * {@link OVR#ovr_GetTimeInSeconds} around the instant the application calls {@link OVR#ovr_GetTrackingState}. The main purpose for this is to accurately track
 * app tracking latency.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrLayerEyeMatrix {
    {@link OVRLayerHeader ovrLayerHeader} Header;
    ovrTextureSwapChain[2] ColorTexture;
    {@link OVRRecti ovrRecti}[2] Viewport;
    {@link OVRPosef ovrPosef}[2] RenderPose;
    {@link OVRMatrix4f ovrMatrix4f}[2] Matrix;
    double SensorSampleTime;
}</code></pre>
 */
public class OVRLayerEyeMatrix extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
			__member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF),
			__array(POINTER_SIZE, 2),
			__array(OVRRecti.SIZEOF, OVRRecti.ALIGNOF, 2),
			__array(OVRPosef.SIZEOF, OVRPosef.ALIGNOF, 2),
			__array(OVRMatrix4f.SIZEOF, OVRMatrix4f.ALIGNOF, 2),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HEADER = layout.offsetof(0);
		COLORTEXTURE = layout.offsetof(1);
		VIEWPORT = layout.offsetof(2);
		RENDERPOSE = layout.offsetof(3);
		MATRIX = layout.offsetof(4);
		SENSORSAMPLETIME = layout.offsetof(5);
	}

	OVRLayerEyeMatrix(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRLayerEyeMatrix} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerEyeMatrix(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
	public OVRLayerHeader Header() { return nHeader(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
	public PointerBuffer ColorTexture() { return nColorTexture(address()); }
	/** Returns the value at the specified index of the {@code ColorTexture} field. */
	public long ColorTexture(int index) { return nColorTexture(address(), index); }
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
	/** Sets the specified value at the specified index of the {@code ColorTexture} field. */
	public OVRLayerEyeMatrix ColorTexture(int index, long value) { nColorTexture(address(), index, value); return this; }
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

	// -----------------------------------

	/** Returns a new {@link OVRLayerEyeMatrix} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerEyeMatrix malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerEyeMatrix} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerEyeMatrix calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerEyeMatrix} instance allocated with {@link BufferUtils}. */
	public static OVRLayerEyeMatrix create() {
		return new OVRLayerEyeMatrix(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRLayerEyeMatrix} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRLayerEyeMatrix create(long address) {
		return address == NULL ? null : new OVRLayerEyeMatrix(address, null);
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRLayerEyeMatrix.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerEyeMatrix} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRLayerEyeMatrix mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRLayerEyeMatrix} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRLayerEyeMatrix callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRLayerEyeMatrix mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRLayerEyeMatrix callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerEyeMatrix.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Header}. */
	public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerEyeMatrix.HEADER); }
	/** Unsafe version of {@link #ColorTexture}. */
	public static PointerBuffer nColorTexture(long struct) {
		return memPointerBuffer(struct + OVRLayerEyeMatrix.COLORTEXTURE, 2);
	}
	/** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
	public static long nColorTexture(long struct, int index) { return memGetAddress(struct + OVRLayerEyeMatrix.COLORTEXTURE + index * 2147483647); }
	/** Unsafe version of {@link #Viewport}. */
	public static OVRRecti.Buffer nViewport(long struct) {
		return OVRRecti.create(struct + OVRLayerEyeMatrix.VIEWPORT, 2);
	}
	/** Unsafe version of {@link #Viewport(int) Viewport}. */
	public static OVRRecti nViewport(long struct, int index) {
		return OVRRecti.create(struct + OVRLayerEyeMatrix.VIEWPORT + index * OVRRecti.SIZEOF);
	}
	/** Unsafe version of {@link #RenderPose}. */
	public static OVRPosef.Buffer nRenderPose(long struct) {
		return OVRPosef.create(struct + OVRLayerEyeMatrix.RENDERPOSE, 2);
	}
	/** Unsafe version of {@link #RenderPose(int) RenderPose}. */
	public static OVRPosef nRenderPose(long struct, int index) {
		return OVRPosef.create(struct + OVRLayerEyeMatrix.RENDERPOSE + index * OVRPosef.SIZEOF);
	}
	/** Unsafe version of {@link #Matrix}. */
	public static OVRMatrix4f.Buffer nMatrix(long struct) {
		return OVRMatrix4f.create(struct + OVRLayerEyeMatrix.MATRIX, 2);
	}
	/** Unsafe version of {@link #Matrix(int) Matrix}. */
	public static OVRMatrix4f nMatrix(long struct, int index) {
		return OVRMatrix4f.create(struct + OVRLayerEyeMatrix.MATRIX + index * OVRMatrix4f.SIZEOF);
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
	/** Unsafe version of {@link #ColorTexture(int, long) ColorTexture}. */
	public static void nColorTexture(long struct, int index, long value) { memPutAddress(struct + OVRLayerEyeMatrix.COLORTEXTURE + index * POINTER_SIZE, value); }
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

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + OVRLayerEyeMatrix.COLORTEXTURE));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected OVRLayerEyeMatrix newInstance(long address) {
			return new OVRLayerEyeMatrix(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
		public OVRLayerHeader Header() { return OVRLayerEyeMatrix.nHeader(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
		public PointerBuffer ColorTexture() { return OVRLayerEyeMatrix.nColorTexture(address()); }
		/** Returns the value at the specified index of the {@code ColorTexture} field. */
		public long ColorTexture(int index) { return OVRLayerEyeMatrix.nColorTexture(address(), index); }
		/** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
		public OVRRecti.Buffer Viewport() { return OVRLayerEyeMatrix.nViewport(address()); }
		/** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
		public OVRRecti Viewport(int index) { return OVRLayerEyeMatrix.nViewport(address(), index); }
		/** Returns a {@link OVRPosef}.Buffer view of the {@code RenderPose} field. */
		public OVRPosef.Buffer RenderPose() { return OVRLayerEyeMatrix.nRenderPose(address()); }
		/** Returns a {@link OVRPosef} view of the struct at the specified index of the {@code RenderPose} field. */
		public OVRPosef RenderPose(int index) { return OVRLayerEyeMatrix.nRenderPose(address(), index); }
		/** Returns a {@link OVRMatrix4f}.Buffer view of the {@code Matrix} field. */
		public OVRMatrix4f.Buffer Matrix() { return OVRLayerEyeMatrix.nMatrix(address()); }
		/** Returns a {@link OVRMatrix4f} view of the struct at the specified index of the {@code Matrix} field. */
		public OVRMatrix4f Matrix(int index) { return OVRLayerEyeMatrix.nMatrix(address(), index); }
		/** Returns the value of the {@code SensorSampleTime} field. */
		public double SensorSampleTime() { return OVRLayerEyeMatrix.nSensorSampleTime(address()); }

		/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
		public OVRLayerEyeMatrix.Buffer Header(OVRLayerHeader value) { OVRLayerEyeMatrix.nHeader(address(), value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
		public OVRLayerEyeMatrix.Buffer ColorTexture(PointerBuffer value) { OVRLayerEyeMatrix.nColorTexture(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code ColorTexture} field. */
		public OVRLayerEyeMatrix.Buffer ColorTexture(int index, long value) { OVRLayerEyeMatrix.nColorTexture(address(), index, value); return this; }
		/** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
		public OVRLayerEyeMatrix.Buffer Viewport(OVRRecti.Buffer value) { OVRLayerEyeMatrix.nViewport(address(), value); return this; }
		/** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
		public OVRLayerEyeMatrix.Buffer Viewport(int index, OVRRecti value) { OVRLayerEyeMatrix.nViewport(address(), index, value); return this; }
		/** Copies the specified {@link OVRPosef.Buffer} to the {@code RenderPose} field. */
		public OVRLayerEyeMatrix.Buffer RenderPose(OVRPosef.Buffer value) { OVRLayerEyeMatrix.nRenderPose(address(), value); return this; }
		/** Copies the specified {@link OVRPosef} at the specified index of the {@code RenderPose} field. */
		public OVRLayerEyeMatrix.Buffer RenderPose(int index, OVRPosef value) { OVRLayerEyeMatrix.nRenderPose(address(), index, value); return this; }
		/** Copies the specified {@link OVRMatrix4f.Buffer} to the {@code Matrix} field. */
		public OVRLayerEyeMatrix.Buffer Matrix(OVRMatrix4f.Buffer value) { OVRLayerEyeMatrix.nMatrix(address(), value); return this; }
		/** Copies the specified {@link OVRMatrix4f} at the specified index of the {@code Matrix} field. */
		public OVRLayerEyeMatrix.Buffer Matrix(int index, OVRMatrix4f value) { OVRLayerEyeMatrix.nMatrix(address(), index, value); return this; }
		/** Sets the specified value to the {@code SensorSampleTime} field. */
		public OVRLayerEyeMatrix.Buffer SensorSampleTime(double value) { OVRLayerEyeMatrix.nSensorSampleTime(address(), value); return this; }

	}

}