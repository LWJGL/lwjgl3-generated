/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Used in {@link AMDBusAddressableMemory#clEnqueueMakeBuffersResidentAMD}. */
public class CLBusAddressAMD extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SURFACE_BUS_ADDRESS,
		MARKER_BUS_ADDRESS;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		SURFACE_BUS_ADDRESS = offsets.get(0);
		MARKER_BUS_ADDRESS = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	CLBusAddressAMD(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link CLBusAddressAMD} instance at the specified memory address. */
	public CLBusAddressAMD(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link CLBusAddressAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLBusAddressAMD(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public long getSurfaceBusAddress() { return ngetSurfaceBusAddress(address()); }
	public long getMarkerBusAddress() { return ngetMarkerBusAddress(address()); }

	public CLBusAddressAMD setSurfaceBusAddress(long surface_bus_address) { nsetSurfaceBusAddress(address(), surface_bus_address); return this; }
	public CLBusAddressAMD setMarkerBusAddress(long marker_bus_address) { nsetMarkerBusAddress(address(), marker_bus_address); return this; }

	/** Initializes this struct with the specified values. */
	public CLBusAddressAMD set(
		long surface_bus_address,
		long marker_bus_address
	) {
		setSurfaceBusAddress(surface_bus_address);
		setMarkerBusAddress(marker_bus_address);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public CLBusAddressAMD nset(long struct) {
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
	public CLBusAddressAMD set(CLBusAddressAMD src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public CLBusAddressAMD set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link CLBusAddressAMD} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLBusAddressAMD malloc() {
		return new CLBusAddressAMD(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLBusAddressAMD} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLBusAddressAMD calloc() {
		return new CLBusAddressAMD(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLBusAddressAMD} instance allocated with {@link BufferUtils}. */
	public static CLBusAddressAMD create() {
		return new CLBusAddressAMD(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link CLBusAddressAMD.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static long ngetSurfaceBusAddress(long struct) { return memGetLong(struct + SURFACE_BUS_ADDRESS); }
	public static long getSurfaceBusAddress(ByteBuffer struct) { return ngetSurfaceBusAddress(memAddress(struct)); }
	public static long ngetMarkerBusAddress(long struct) { return memGetLong(struct + MARKER_BUS_ADDRESS); }
	public static long getMarkerBusAddress(ByteBuffer struct) { return ngetMarkerBusAddress(memAddress(struct)); }

	public static void nsetSurfaceBusAddress(long struct, long surface_bus_address) { memPutLong(struct + SURFACE_BUS_ADDRESS, surface_bus_address); }
	public static void setSurfaceBusAddress(ByteBuffer struct, long surface_bus_address) { nsetSurfaceBusAddress(memAddress(struct), surface_bus_address); }
	public static void nsetMarkerBusAddress(long struct, long marker_bus_address) { memPutLong(struct + MARKER_BUS_ADDRESS, marker_bus_address); }
	public static void setMarkerBusAddress(ByteBuffer struct, long marker_bus_address) { nsetMarkerBusAddress(memAddress(struct), marker_bus_address); }

	// -----------------------------------

	/** An array of {@link CLBusAddressAMD} structs. */
	public static final class Buffer extends StructBuffer<CLBusAddressAMD, Buffer> {

		/**
		 * Creates a new {@link CLBusAddressAMD.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLBusAddressAMD#SIZEOF}, and its mark will be undefined.
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
		protected CLBusAddressAMD newInstance(long address) {
			return new CLBusAddressAMD(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public long getSurfaceBusAddress() { return ngetSurfaceBusAddress(address()); }
		public long getMarkerBusAddress() { return ngetMarkerBusAddress(address()); }

		public CLBusAddressAMD.Buffer setSurfaceBusAddress(long surface_bus_address) { nsetSurfaceBusAddress(address(), surface_bus_address); return this; }
		public CLBusAddressAMD.Buffer setMarkerBusAddress(long marker_bus_address) { nsetMarkerBusAddress(address(), marker_bus_address); return this; }

	}

}