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
 * Specifies the description of a single sensor.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code FrustumHFovInRadians} &ndash; sensor frustum horizontal field-of-view (if present).</li>
 * <li>{@code FrustumVFovInRadians} &ndash; sensor frustum vertical field-of-view (if present).</li>
 * <li>{@code FrustumNearZInMeters} &ndash; sensor frustum near Z (if present).</li>
 * <li>{@code FrustumFarZInMeters} &ndash; sensor frustum far Z (if present).</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrTrackerDesc {
    float FrustumHFovInRadians;
    float FrustumVFovInRadians;
    float FrustumNearZInMeters;
    float FrustumFarZInMeters;
}</code></pre>
 */
public class OVRTrackerDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FRUSTUMHFOVINRADIANS,
		FRUSTUMVFOVINRADIANS,
		FRUSTUMNEARZINMETERS,
		FRUSTUMFARZINMETERS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FRUSTUMHFOVINRADIANS = layout.offsetof(0);
		FRUSTUMVFOVINRADIANS = layout.offsetof(1);
		FRUSTUMNEARZINMETERS = layout.offsetof(2);
		FRUSTUMFARZINMETERS = layout.offsetof(3);
	}

	OVRTrackerDesc(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRTrackerDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTrackerDesc(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code FrustumHFovInRadians} field. */
	public float FrustumHFovInRadians() { return nFrustumHFovInRadians(address()); }
	/** Returns the value of the {@code FrustumVFovInRadians} field. */
	public float FrustumVFovInRadians() { return nFrustumVFovInRadians(address()); }
	/** Returns the value of the {@code FrustumNearZInMeters} field. */
	public float FrustumNearZInMeters() { return nFrustumNearZInMeters(address()); }
	/** Returns the value of the {@code FrustumFarZInMeters} field. */
	public float FrustumFarZInMeters() { return nFrustumFarZInMeters(address()); }

	/** Sets the specified value to the {@code FrustumHFovInRadians} field. */
	public OVRTrackerDesc FrustumHFovInRadians(float value) { nFrustumHFovInRadians(address(), value); return this; }
	/** Sets the specified value to the {@code FrustumVFovInRadians} field. */
	public OVRTrackerDesc FrustumVFovInRadians(float value) { nFrustumVFovInRadians(address(), value); return this; }
	/** Sets the specified value to the {@code FrustumNearZInMeters} field. */
	public OVRTrackerDesc FrustumNearZInMeters(float value) { nFrustumNearZInMeters(address(), value); return this; }
	/** Sets the specified value to the {@code FrustumFarZInMeters} field. */
	public OVRTrackerDesc FrustumFarZInMeters(float value) { nFrustumFarZInMeters(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTrackerDesc set(
		float FrustumHFovInRadians,
		float FrustumVFovInRadians,
		float FrustumNearZInMeters,
		float FrustumFarZInMeters
	) {
		FrustumHFovInRadians(FrustumHFovInRadians);
		FrustumVFovInRadians(FrustumVFovInRadians);
		FrustumNearZInMeters(FrustumNearZInMeters);
		FrustumFarZInMeters(FrustumFarZInMeters);

		return this;
	}

	/** Unsafe version of {@link #set(OVRTrackerDesc) set}. */
	public OVRTrackerDesc nset(long struct) {
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
	public OVRTrackerDesc set(OVRTrackerDesc src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRTrackerDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRTrackerDesc malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTrackerDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRTrackerDesc calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTrackerDesc} instance allocated with {@link BufferUtils}. */
	public static OVRTrackerDesc create() {
		return new OVRTrackerDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRTrackerDesc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRTrackerDesc create(long address) {
		return address == NULL ? null : new OVRTrackerDesc(address, null);
	}

	/**
	 * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRTrackerDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRTrackerDesc} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRTrackerDesc mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRTrackerDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRTrackerDesc callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRTrackerDesc} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRTrackerDesc mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackerDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRTrackerDesc callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #FrustumHFovInRadians}. */
	public static float nFrustumHFovInRadians(long struct) { return memGetFloat(struct + OVRTrackerDesc.FRUSTUMHFOVINRADIANS); }
	/** Unsafe version of {@link #FrustumVFovInRadians}. */
	public static float nFrustumVFovInRadians(long struct) { return memGetFloat(struct + OVRTrackerDesc.FRUSTUMVFOVINRADIANS); }
	/** Unsafe version of {@link #FrustumNearZInMeters}. */
	public static float nFrustumNearZInMeters(long struct) { return memGetFloat(struct + OVRTrackerDesc.FRUSTUMNEARZINMETERS); }
	/** Unsafe version of {@link #FrustumFarZInMeters}. */
	public static float nFrustumFarZInMeters(long struct) { return memGetFloat(struct + OVRTrackerDesc.FRUSTUMFARZINMETERS); }

	/** Unsafe version of {@link #FrustumHFovInRadians(float) FrustumHFovInRadians}. */
	public static void nFrustumHFovInRadians(long struct, float value) { memPutFloat(struct + OVRTrackerDesc.FRUSTUMHFOVINRADIANS, value); }
	/** Unsafe version of {@link #FrustumVFovInRadians(float) FrustumVFovInRadians}. */
	public static void nFrustumVFovInRadians(long struct, float value) { memPutFloat(struct + OVRTrackerDesc.FRUSTUMVFOVINRADIANS, value); }
	/** Unsafe version of {@link #FrustumNearZInMeters(float) FrustumNearZInMeters}. */
	public static void nFrustumNearZInMeters(long struct, float value) { memPutFloat(struct + OVRTrackerDesc.FRUSTUMNEARZINMETERS, value); }
	/** Unsafe version of {@link #FrustumFarZInMeters(float) FrustumFarZInMeters}. */
	public static void nFrustumFarZInMeters(long struct, float value) { memPutFloat(struct + OVRTrackerDesc.FRUSTUMFARZINMETERS, value); }

	// -----------------------------------

	/** An array of {@link OVRTrackerDesc} structs. */
	public static final class Buffer extends StructBuffer<OVRTrackerDesc, Buffer> {

		/**
		 * Creates a new {@link OVRTrackerDesc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTrackerDesc#SIZEOF}, and its mark will be undefined.
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
		protected OVRTrackerDesc newInstance(long address) {
			return new OVRTrackerDesc(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code FrustumHFovInRadians} field. */
		public float FrustumHFovInRadians() { return OVRTrackerDesc.nFrustumHFovInRadians(address()); }
		/** Returns the value of the {@code FrustumVFovInRadians} field. */
		public float FrustumVFovInRadians() { return OVRTrackerDesc.nFrustumVFovInRadians(address()); }
		/** Returns the value of the {@code FrustumNearZInMeters} field. */
		public float FrustumNearZInMeters() { return OVRTrackerDesc.nFrustumNearZInMeters(address()); }
		/** Returns the value of the {@code FrustumFarZInMeters} field. */
		public float FrustumFarZInMeters() { return OVRTrackerDesc.nFrustumFarZInMeters(address()); }

		/** Sets the specified value to the {@code FrustumHFovInRadians} field. */
		public OVRTrackerDesc.Buffer FrustumHFovInRadians(float value) { OVRTrackerDesc.nFrustumHFovInRadians(address(), value); return this; }
		/** Sets the specified value to the {@code FrustumVFovInRadians} field. */
		public OVRTrackerDesc.Buffer FrustumVFovInRadians(float value) { OVRTrackerDesc.nFrustumVFovInRadians(address(), value); return this; }
		/** Sets the specified value to the {@code FrustumNearZInMeters} field. */
		public OVRTrackerDesc.Buffer FrustumNearZInMeters(float value) { OVRTrackerDesc.nFrustumNearZInMeters(address(), value); return this; }
		/** Sets the specified value to the {@code FrustumFarZInMeters} field. */
		public OVRTrackerDesc.Buffer FrustumFarZInMeters(float value) { OVRTrackerDesc.nFrustumFarZInMeters(address(), value); return this; }

	}

}