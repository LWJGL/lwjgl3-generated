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

/** The struct returned by {@link CL10#clGetDeviceInfo} with {@code param_name} set to {@link AMDDeviceTopology#CL_DEVICE_TOPOLOGY_AMD}. */
public final class CLDeviceTopologyAMD extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		RAW,
			RAW_TYPE,
			RAW_DATA,
		PCIE,
			PCIE_TYPE,
			PCIE_BUS,
			PCIE_DEVICE,
			PCIE_FUNCTION;

	static {
		IntBuffer offsets = memAllocInt(8);

		SIZEOF = offsets(memAddress(offsets));

		RAW = offsets.get(0);
			RAW_TYPE = offsets.get(1);
			RAW_DATA = offsets.get(2);
		PCIE = offsets.get(3);
			PCIE_TYPE = offsets.get(4);
			PCIE_BUS = offsets.get(5);
			PCIE_DEVICE = offsets.get(6);
			PCIE_FUNCTION = offsets.get(7);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	CLDeviceTopologyAMD(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link CLDeviceTopologyAMD} instance at the specified memory address. */
	public CLDeviceTopologyAMD(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link CLDeviceTopologyAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public CLDeviceTopologyAMD(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getRawType() { return ngetRawType(address()); }
	public void getRawData(ByteBuffer data) { ngetRawData(address(), data); }
	public int getPcieType() { return ngetPcieType(address()); }
	public int getPcieBus() { return ngetPcieBus(address()); }
	public int getPcieDevice() { return ngetPcieDevice(address()); }
	public int getPcieFunction() { return ngetPcieFunction(address()); }

	public CLDeviceTopologyAMD setRawType(int type) { nsetRawType(address(), type); return this; }
	public CLDeviceTopologyAMD setRawData(ByteBuffer data) { nsetRawData(address(), data); return this; }
	public CLDeviceTopologyAMD setRawData(int index, int data) { nsetRawData(address(), index, data); return this; }
	public CLDeviceTopologyAMD setPcieType(int type) { nsetPcieType(address(), type); return this; }
	public CLDeviceTopologyAMD setPcieBus(int bus) { nsetPcieBus(address(), bus); return this; }
	public CLDeviceTopologyAMD setPcieDevice(int device) { nsetPcieDevice(address(), device); return this; }
	public CLDeviceTopologyAMD setPcieFunction(int function) { nsetPcieFunction(address(), function); return this; }

	/** Initializes this struct with the specified values. */
	public CLDeviceTopologyAMD set(
		int Raw_type,
		ByteBuffer Raw_data,
		int Pcie_type,
		int Pcie_bus,
		int Pcie_device,
		int Pcie_function
	) {
		setRawType(Raw_type);
		setRawData(Raw_data);
		setPcieType(Pcie_type);
		setPcieBus(Pcie_bus);
		setPcieDevice(Pcie_device);
		setPcieFunction(Pcie_function);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public CLDeviceTopologyAMD nset(long struct) {
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
	public CLDeviceTopologyAMD set(CLDeviceTopologyAMD src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public CLDeviceTopologyAMD set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static CLDeviceTopologyAMD malloc() {
		return new CLDeviceTopologyAMD(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static CLDeviceTopologyAMD calloc() {
		return new CLDeviceTopologyAMD(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link CLDeviceTopologyAMD} instance allocated with {@link BufferUtils}. */
	public static CLDeviceTopologyAMD create() {
		return new CLDeviceTopologyAMD(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetRawType(long struct) { return memGetInt(struct + RAW_TYPE); }
	public static int getRawType(ByteBuffer struct) { return ngetRawType(memAddress(struct)); }
	public static void ngetRawData(long struct, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(data, 5 * 4);
		memCopy(struct + RAW_DATA, memAddress(data), data.remaining());
	}
	public static void getRawData(ByteBuffer struct, ByteBuffer data) { ngetRawData(memAddress(struct), data); }
	public static int ngetRawData(long struct, int index) { return memGetInt(struct + RAW_DATA + index * 4); }
	public static int getRawData(ByteBuffer struct, int index) { return ngetRawData(memAddress(struct), index); }
	public static int ngetPcieType(long struct) { return memGetInt(struct + PCIE_TYPE); }
	public static int getPcieType(ByteBuffer struct) { return ngetPcieType(memAddress(struct)); }
	public static int ngetPcieBus(long struct) { return memGetByte(struct + PCIE_BUS); }
	public static int getPcieBus(ByteBuffer struct) { return ngetPcieBus(memAddress(struct)); }
	public static int ngetPcieDevice(long struct) { return memGetByte(struct + PCIE_DEVICE); }
	public static int getPcieDevice(ByteBuffer struct) { return ngetPcieDevice(memAddress(struct)); }
	public static int ngetPcieFunction(long struct) { return memGetByte(struct + PCIE_FUNCTION); }
	public static int getPcieFunction(ByteBuffer struct) { return ngetPcieFunction(memAddress(struct)); }

	public static void nsetRawType(long struct, int type) { memPutInt(struct + RAW_TYPE, type); }
	public static void setRawType(ByteBuffer struct, int type) { nsetRawType(memAddress(struct), type); }
	public static void nsetRawData(long struct, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(data, 5 * 4);
		}
		memCopy(memAddress(data), struct + RAW_DATA, data.remaining());
	}
	public static void setRawData(ByteBuffer struct, ByteBuffer data) { nsetRawData(memAddress(struct), data); }
	public static void nsetRawData(long struct, int index, int data) { memPutInt(struct + RAW_DATA + index * 4, data); }
	public static void setRawData(ByteBuffer struct, int index, int data) { nsetRawData(memAddress(struct), index, data); }
	public static void nsetPcieType(long struct, int type) { memPutInt(struct + PCIE_TYPE, type); }
	public static void setPcieType(ByteBuffer struct, int type) { nsetPcieType(memAddress(struct), type); }
	public static void nsetPcieBus(long struct, int bus) { memPutByte(struct + PCIE_BUS, (byte)bus); }
	public static void setPcieBus(ByteBuffer struct, int bus) { nsetPcieBus(memAddress(struct), bus); }
	public static void nsetPcieDevice(long struct, int device) { memPutByte(struct + PCIE_DEVICE, (byte)device); }
	public static void setPcieDevice(ByteBuffer struct, int device) { nsetPcieDevice(memAddress(struct), device); }
	public static void nsetPcieFunction(long struct, int function) { memPutByte(struct + PCIE_FUNCTION, (byte)function); }
	public static void setPcieFunction(ByteBuffer struct, int function) { nsetPcieFunction(memAddress(struct), function); }

	// -----------------------------------

	/** An array of {@link CLDeviceTopologyAMD} structs. */
	public static final class Buffer extends StructBuffer<CLDeviceTopologyAMD, Buffer> {

		/**
		 * Creates a new {@link CLDeviceTopologyAMD.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link CLDeviceTopologyAMD#SIZEOF}, and its mark will be undefined.
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
		protected CLDeviceTopologyAMD newInstance(long address) {
			return new CLDeviceTopologyAMD(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}