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

/**
 * Bus address information used in {@link AMDBusAddressableMemory#clEnqueueMakeBuffersResidentAMD}.
 * 
 * <h3>cl_bus_address_amd members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>surfbusaddress</td><td class="nw">cl_long</td><td>contains the page aligned physical starting address of the backing store preallocated by the application on a remote device</td></tr>
 * <tr><td>signalbusaddress</td><td class="nw">cl_long</td><td>contains the page aligned physical starting address of preallocated signaling surface</td></tr>
 * </table>
 */
public class CLBusAddressAMD extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		SURFBUSADDRESS,
		SIGNALBUSADDRESS;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		SURFBUSADDRESS = layout.offsetof(0);
		SIGNALBUSADDRESS = layout.offsetof(1);
	}

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

	/** Returns the value of the {@code surfbusaddress} field. */
	public long surfbusaddress() { return nsurfbusaddress(address()); }
	/** Returns the value of the {@code signalbusaddress} field. */
	public long signalbusaddress() { return nsignalbusaddress(address()); }

	/** Sets the specified value to the {@code surfbusaddress} field. */
	public CLBusAddressAMD surfbusaddress(long value) { nsurfbusaddress(address(), value); return this; }
	/** Sets the specified value to the {@code signalbusaddress} field. */
	public CLBusAddressAMD signalbusaddress(long value) { nsignalbusaddress(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public CLBusAddressAMD set(
		long surfbusaddress,
		long signalbusaddress
	) {
		surfbusaddress(surfbusaddress);
		signalbusaddress(signalbusaddress);

		return this;
	}

	/** Unsafe version of {@link #set(CLBusAddressAMD) set}. */
	public CLBusAddressAMD nset(long struct) {
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
	public CLBusAddressAMD set(CLBusAddressAMD src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(CLBusAddressAMD) set}. */
	public CLBusAddressAMD set(ByteBuffer struct) {
		if ( CHECKS )
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

	/** Unsafe version of {@link #surfbusaddress}. */
	public static long nsurfbusaddress(long struct) { return memGetLong(struct + CLBusAddressAMD.SURFBUSADDRESS); }
	/** Unsafe version of {@link #signalbusaddress}. */
	public static long nsignalbusaddress(long struct) { return memGetLong(struct + CLBusAddressAMD.SIGNALBUSADDRESS); }

	/** Unsafe version of {@link #surfbusaddress(long) surfbusaddress}. */
	public static void nsurfbusaddress(long struct, long value) { memPutLong(struct + CLBusAddressAMD.SURFBUSADDRESS, value); }
	/** Unsafe version of {@link #signalbusaddress(long) signalbusaddress}. */
	public static void nsignalbusaddress(long struct, long value) { memPutLong(struct + CLBusAddressAMD.SIGNALBUSADDRESS, value); }

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

		/** Returns the value of the {@code surfbusaddress} field. */
		public long surfbusaddress() { return nsurfbusaddress(address()); }
		/** Returns the value of the {@code signalbusaddress} field. */
		public long signalbusaddress() { return nsignalbusaddress(address()); }

		/** Sets the specified value to the {@code surfbusaddress} field. */
		public CLBusAddressAMD.Buffer surfbusaddress(long value) { nsurfbusaddress(address(), value); return this; }
		/** Sets the specified value to the {@code signalbusaddress} field. */
		public CLBusAddressAMD.Buffer signalbusaddress(long value) { nsignalbusaddress(address(), value); return this; }

	}

}